package com.itcc.coll.mapper;

import com.itcc.coll.entity.Permission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionMapper {


    @Select("select p.id as id, p.name as name, p.url as url,p.task_id as taskid from  coll_role_permission rp " +
            "left join coll_permission p on rp.permission_id=p.id " +
            "where  rp.role_id= #{roleId} ")
    List<Permission> findPermissionListByRoleId(@Param("roleId") int roleId);

}
