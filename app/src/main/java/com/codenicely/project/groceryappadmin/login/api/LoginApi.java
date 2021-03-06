package com.codenicely.project.groceryappadmin.login.api;



import com.codenicely.project.groceryappadmin.helper.Urls;
import com.codenicely.project.groceryappadmin.login.models.data.LoginData;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * Created by aman on 15/10/16.
 */
public interface LoginApi {

    @FormUrlEncoded
    @POST(Urls.SUB_URL_ADMIN_LOGIN)
    Call<LoginData> requestLogin(@Field("mobile") String mobile,
                                 @Field("password") String password,@Field("fcm") String fcm);


}


