package com.dianrong.common.uniauth.common.interfaces.rw;

import com.dianrong.common.uniauth.common.bean.Response;
import com.dianrong.common.uniauth.common.bean.dto.PermissionDto;
import com.dianrong.common.uniauth.common.bean.request.PermissionParam;
import com.dianrong.common.uniauth.common.bean.request.PrimaryKeyParam;
import com.dianrong.common.uniauth.common.interfaces.read.IPermissionResource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

public interface IPermissionRWResource extends IPermissionResource {
    
    @POST
    @Path("addnewperm")
    //scenario: add new permission
    Response<PermissionDto> addNewPerm(PermissionParam permissionParam);
    
    @POST
    @Path("updateperm")
    //scenario: update permission
    Response<String> updatePerm(PermissionParam permissionParam);
    
    @POST
    @Path("deleteperm")
    //scenario: delete permission
    Response<String> deletePerm(PrimaryKeyParam primaryKeyParam);

}