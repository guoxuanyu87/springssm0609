package cn.com.common.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/10 18:16
 */

public class MyRealm extends AuthorizingRealm {

    //进行授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("================进行授权=============================");


        return null;
    }
//进行登录验证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("********************进行登录验证************************");


        return null;
    }
}
