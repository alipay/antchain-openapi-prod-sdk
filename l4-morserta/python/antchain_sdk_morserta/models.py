# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


class Config(TeaModel):
    """
    Model for initing client
    """
    def __init__(
        self,
        access_key_id: str = None,
        access_key_secret: str = None,
        security_token: str = None,
        protocol: str = None,
        read_timeout: int = None,
        connect_timeout: int = None,
        http_proxy: str = None,
        https_proxy: str = None,
        endpoint: str = None,
        no_proxy: str = None,
        max_idle_conns: int = None,
        user_agent: str = None,
        socks_5proxy: str = None,
        socks_5net_work: str = None,
        max_idle_time_millis: int = None,
        keep_alive_duration_millis: int = None,
        max_requests: int = None,
        max_requests_per_host: int = None,
    ):
        # accesskey id
        self.access_key_id = access_key_id
        # accesskey secret
        self.access_key_secret = access_key_secret
        # security token
        self.security_token = security_token
        # http protocol
        self.protocol = protocol
        # read timeout
        self.read_timeout = read_timeout
        # connect timeout
        self.connect_timeout = connect_timeout
        # http proxy
        self.http_proxy = http_proxy
        # https proxy
        self.https_proxy = https_proxy
        # endpoint
        self.endpoint = endpoint
        # proxy white list
        self.no_proxy = no_proxy
        # max idle conns
        self.max_idle_conns = max_idle_conns
        # user agent
        self.user_agent = user_agent
        # socks5 proxy
        self.socks_5proxy = socks_5proxy
        # socks5 network
        self.socks_5net_work = socks_5net_work
        # 长链接最大空闲时长
        self.max_idle_time_millis = max_idle_time_millis
        # 长链接最大连接时长
        self.keep_alive_duration_millis = keep_alive_duration_millis
        # 最大连接数（长链接最大总数）
        self.max_requests = max_requests
        # 每个目标主机的最大连接数（分主机域名的长链接最大总数
        self.max_requests_per_host = max_requests_per_host

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_key_id is not None:
            result['accessKeyId'] = self.access_key_id
        if self.access_key_secret is not None:
            result['accessKeySecret'] = self.access_key_secret
        if self.security_token is not None:
            result['securityToken'] = self.security_token
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.read_timeout is not None:
            result['readTimeout'] = self.read_timeout
        if self.connect_timeout is not None:
            result['connectTimeout'] = self.connect_timeout
        if self.http_proxy is not None:
            result['httpProxy'] = self.http_proxy
        if self.https_proxy is not None:
            result['httpsProxy'] = self.https_proxy
        if self.endpoint is not None:
            result['endpoint'] = self.endpoint
        if self.no_proxy is not None:
            result['noProxy'] = self.no_proxy
        if self.max_idle_conns is not None:
            result['maxIdleConns'] = self.max_idle_conns
        if self.user_agent is not None:
            result['userAgent'] = self.user_agent
        if self.socks_5proxy is not None:
            result['socks5Proxy'] = self.socks_5proxy
        if self.socks_5net_work is not None:
            result['socks5NetWork'] = self.socks_5net_work
        if self.max_idle_time_millis is not None:
            result['maxIdleTimeMillis'] = self.max_idle_time_millis
        if self.keep_alive_duration_millis is not None:
            result['keepAliveDurationMillis'] = self.keep_alive_duration_millis
        if self.max_requests is not None:
            result['maxRequests'] = self.max_requests
        if self.max_requests_per_host is not None:
            result['maxRequestsPerHost'] = self.max_requests_per_host
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('accessKeyId') is not None:
            self.access_key_id = m.get('accessKeyId')
        if m.get('accessKeySecret') is not None:
            self.access_key_secret = m.get('accessKeySecret')
        if m.get('securityToken') is not None:
            self.security_token = m.get('securityToken')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('readTimeout') is not None:
            self.read_timeout = m.get('readTimeout')
        if m.get('connectTimeout') is not None:
            self.connect_timeout = m.get('connectTimeout')
        if m.get('httpProxy') is not None:
            self.http_proxy = m.get('httpProxy')
        if m.get('httpsProxy') is not None:
            self.https_proxy = m.get('httpsProxy')
        if m.get('endpoint') is not None:
            self.endpoint = m.get('endpoint')
        if m.get('noProxy') is not None:
            self.no_proxy = m.get('noProxy')
        if m.get('maxIdleConns') is not None:
            self.max_idle_conns = m.get('maxIdleConns')
        if m.get('userAgent') is not None:
            self.user_agent = m.get('userAgent')
        if m.get('socks5Proxy') is not None:
            self.socks_5proxy = m.get('socks5Proxy')
        if m.get('socks5NetWork') is not None:
            self.socks_5net_work = m.get('socks5NetWork')
        if m.get('maxIdleTimeMillis') is not None:
            self.max_idle_time_millis = m.get('maxIdleTimeMillis')
        if m.get('keepAliveDurationMillis') is not None:
            self.keep_alive_duration_millis = m.get('keepAliveDurationMillis')
        if m.get('maxRequests') is not None:
            self.max_requests = m.get('maxRequests')
        if m.get('maxRequestsPerHost') is not None:
            self.max_requests_per_host = m.get('maxRequestsPerHost')
        return self


class UserInfo(TeaModel):
    def __init__(
        self,
        original_imei: str = None,
        md_5imei: str = None,
        original_android_id: str = None,
        md_5android_id: str = None,
        original_oaid: str = None,
        md_5oaid: str = None,
        original_idfa: str = None,
        md_5idfa: str = None,
        original_phone: str = None,
        md_5phone: str = None,
        sha_256phone: str = None,
        caid: str = None,
        caid_version: str = None,
        wechat_openid: str = None,
        wechat_unionid: str = None,
        wechat_app_id: str = None,
    ):
        # Android 设备填写，imei原值
        self.original_imei = original_imei
        # Android 设备填写，imei md5值
        self.md_5imei = md_5imei
        # Android 设备填写,android_id原值
        self.original_android_id = original_android_id
        # Android 设备填写, md5 后的 android_id 设备号
        self.md_5android_id = md_5android_id
        # Android 设备填写，oaid原值
        self.original_oaid = original_oaid
        # Android 设备填写，oaid MD5值
        self.md_5oaid = md_5oaid
        # iOS 设备填写, idfa原值
        self.original_idfa = original_idfa
        # iOS 设备填写, idfa md5值
        self.md_5idfa = md_5idfa
        # 客户电话原值
        self.original_phone = original_phone
        # md5后的电话号码
        self.md_5phone = md_5phone
        # 客户联系方式的sha256
        self.sha_256phone = sha_256phone
        # iOS 设备填写,中国广告协会互联网广告标
        self.caid = caid
        # IOS设备填写，caid版本
        self.caid_version = caid_version
        # 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 openid 保持原值
        self.wechat_openid = wechat_openid
        # 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 unionid 保持原值
        self.wechat_unionid = wechat_unionid
        # 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信分配的 APPID
        self.wechat_app_id = wechat_app_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.original_imei is not None:
            result['original_imei'] = self.original_imei
        if self.md_5imei is not None:
            result['md5_imei'] = self.md_5imei
        if self.original_android_id is not None:
            result['original_android_id'] = self.original_android_id
        if self.md_5android_id is not None:
            result['md5_android_id'] = self.md_5android_id
        if self.original_oaid is not None:
            result['original_oaid'] = self.original_oaid
        if self.md_5oaid is not None:
            result['md5_oaid'] = self.md_5oaid
        if self.original_idfa is not None:
            result['original_idfa'] = self.original_idfa
        if self.md_5idfa is not None:
            result['md5_idfa'] = self.md_5idfa
        if self.original_phone is not None:
            result['original_phone'] = self.original_phone
        if self.md_5phone is not None:
            result['md5_phone'] = self.md_5phone
        if self.sha_256phone is not None:
            result['sha256_phone'] = self.sha_256phone
        if self.caid is not None:
            result['caid'] = self.caid
        if self.caid_version is not None:
            result['caid_version'] = self.caid_version
        if self.wechat_openid is not None:
            result['wechat_openid'] = self.wechat_openid
        if self.wechat_unionid is not None:
            result['wechat_unionid'] = self.wechat_unionid
        if self.wechat_app_id is not None:
            result['wechat_app_id'] = self.wechat_app_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('original_imei') is not None:
            self.original_imei = m.get('original_imei')
        if m.get('md5_imei') is not None:
            self.md_5imei = m.get('md5_imei')
        if m.get('original_android_id') is not None:
            self.original_android_id = m.get('original_android_id')
        if m.get('md5_android_id') is not None:
            self.md_5android_id = m.get('md5_android_id')
        if m.get('original_oaid') is not None:
            self.original_oaid = m.get('original_oaid')
        if m.get('md5_oaid') is not None:
            self.md_5oaid = m.get('md5_oaid')
        if m.get('original_idfa') is not None:
            self.original_idfa = m.get('original_idfa')
        if m.get('md5_idfa') is not None:
            self.md_5idfa = m.get('md5_idfa')
        if m.get('original_phone') is not None:
            self.original_phone = m.get('original_phone')
        if m.get('md5_phone') is not None:
            self.md_5phone = m.get('md5_phone')
        if m.get('sha256_phone') is not None:
            self.sha_256phone = m.get('sha256_phone')
        if m.get('caid') is not None:
            self.caid = m.get('caid')
        if m.get('caid_version') is not None:
            self.caid_version = m.get('caid_version')
        if m.get('wechat_openid') is not None:
            self.wechat_openid = m.get('wechat_openid')
        if m.get('wechat_unionid') is not None:
            self.wechat_unionid = m.get('wechat_unionid')
        if m.get('wechat_app_id') is not None:
            self.wechat_app_id = m.get('wechat_app_id')
        return self


class FeedbackReportDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        account_id: str = None,
        level: str = None,
        feedback_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 广告主账号ID
        self.account_id = account_id
        # 报表类型级别
        self.level = level
        # 回传数据明细，类型json array
        self.feedback_data = feedback_data

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.level, 'level')
        self.validate_required(self.feedback_data, 'feedback_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.level is not None:
            result['level'] = self.level
        if self.feedback_data is not None:
            result['feedback_data'] = self.feedback_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('feedback_data') is not None:
            self.feedback_data = m.get('feedback_data')
        return self


class FeedbackReportDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ConvertAdDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        account_id: int = None,
        device_os_type: str = None,
        muid: str = None,
        click_id: str = None,
        click_time: int = None,
        impression_time: int = None,
        mobile_md_5: str = None,
        platform: str = None,
        event_code: str = None,
        event_time: int = None,
        oaid: str = None,
        oaid_md_5: str = None,
        caid: str = None,
        caid_md_5: str = None,
        android_id: str = None,
        imei: str = None,
        imei_md_5: str = None,
        idfa: str = None,
        idfa_md_5: str = None,
        first_pay_amount: str = None,
        upgrade_pay_amount: str = None,
        upgrade_renewval_amount: str = None,
        industry: str = None,
        loan_amount: str = None,
        ext: str = None,
        mobile: str = None,
        out_event_id: str = None,
        android_id_md_5: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 广告主id
        self.account_id = account_id
        # ios/android/web
        self.device_os_type = device_os_type
        # 设备ID（imei或idfa的加密值）
        self.muid = muid
        # 点击ID
        self.click_id = click_id
        # 点击时间
        self.click_time = click_time
        # 曝光时间
        self.impression_time = impression_time
        # 手机号MD5
        self.mobile_md_5 = mobile_md_5
        # 区分投放渠道来源guangdiantong/oceanengine
        self.platform = platform
        # 事件类型，枚举值如下：
        # submit-提交表单
        # pay-付费
        # renewal-续费
        # m2_renewal-m2续期
        # surrender-退保
        self.event_code = event_code
        # 转化事件时间
        self.event_time = event_time
        # 设备oaid
        self.oaid = oaid
        # oaid_md5
        self.oaid_md_5 = oaid_md_5
        # caid
        self.caid = caid
        # caid_md5
        self.caid_md_5 = caid_md_5
        # android_id
        self.android_id = android_id
        # imei
        self.imei = imei
        # imei_md5
        self.imei_md_5 = imei_md_5
        # idfa
        self.idfa = idfa
        # idfa_md5
        self.idfa_md_5 = idfa_md_5
        # 首次支付保费(蚂蚁数科定义)，用户首次支付保险的费用。单位元
        self.first_pay_amount = first_pay_amount
        # 升级支付保费(蚂蚁数科定义)，用户支付后进行保险升级的支付费用。单位元
        self.upgrade_pay_amount = upgrade_pay_amount
        # 续费保费(蚂蚁数科定义)，用户M2进行保险续费的费用。
        self.upgrade_renewval_amount = upgrade_renewval_amount
        # 行业
        self.industry = industry
        # 用户的借款金额
        self.loan_amount = loan_amount
        # 扩展json
        self.ext = ext
        # 手机号原值
        self.mobile = mobile
        # 业务事件id, 用于唯一标识当前事件，如下单事件的订单id等
        self.out_event_id = out_event_id
        # android_id md5值
        self.android_id_md_5 = android_id_md_5

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.click_id, 'click_id')
        self.validate_required(self.event_code, 'event_code')
        self.validate_required(self.event_time, 'event_time')
        self.validate_required(self.industry, 'industry')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.device_os_type is not None:
            result['device_os_type'] = self.device_os_type
        if self.muid is not None:
            result['muid'] = self.muid
        if self.click_id is not None:
            result['click_id'] = self.click_id
        if self.click_time is not None:
            result['click_time'] = self.click_time
        if self.impression_time is not None:
            result['impression_time'] = self.impression_time
        if self.mobile_md_5 is not None:
            result['mobile_md5'] = self.mobile_md_5
        if self.platform is not None:
            result['platform'] = self.platform
        if self.event_code is not None:
            result['event_code'] = self.event_code
        if self.event_time is not None:
            result['event_time'] = self.event_time
        if self.oaid is not None:
            result['oaid'] = self.oaid
        if self.oaid_md_5 is not None:
            result['oaid_md5'] = self.oaid_md_5
        if self.caid is not None:
            result['caid'] = self.caid
        if self.caid_md_5 is not None:
            result['caid_md5'] = self.caid_md_5
        if self.android_id is not None:
            result['android_id'] = self.android_id
        if self.imei is not None:
            result['imei'] = self.imei
        if self.imei_md_5 is not None:
            result['imei_md5'] = self.imei_md_5
        if self.idfa is not None:
            result['idfa'] = self.idfa
        if self.idfa_md_5 is not None:
            result['idfa_md5'] = self.idfa_md_5
        if self.first_pay_amount is not None:
            result['first_pay_amount'] = self.first_pay_amount
        if self.upgrade_pay_amount is not None:
            result['upgrade_pay_amount'] = self.upgrade_pay_amount
        if self.upgrade_renewval_amount is not None:
            result['upgrade_renewval_amount'] = self.upgrade_renewval_amount
        if self.industry is not None:
            result['industry'] = self.industry
        if self.loan_amount is not None:
            result['loan_amount'] = self.loan_amount
        if self.ext is not None:
            result['ext'] = self.ext
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.out_event_id is not None:
            result['out_event_id'] = self.out_event_id
        if self.android_id_md_5 is not None:
            result['android_id_md5'] = self.android_id_md_5
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('device_os_type') is not None:
            self.device_os_type = m.get('device_os_type')
        if m.get('muid') is not None:
            self.muid = m.get('muid')
        if m.get('click_id') is not None:
            self.click_id = m.get('click_id')
        if m.get('click_time') is not None:
            self.click_time = m.get('click_time')
        if m.get('impression_time') is not None:
            self.impression_time = m.get('impression_time')
        if m.get('mobile_md5') is not None:
            self.mobile_md_5 = m.get('mobile_md5')
        if m.get('platform') is not None:
            self.platform = m.get('platform')
        if m.get('event_code') is not None:
            self.event_code = m.get('event_code')
        if m.get('event_time') is not None:
            self.event_time = m.get('event_time')
        if m.get('oaid') is not None:
            self.oaid = m.get('oaid')
        if m.get('oaid_md5') is not None:
            self.oaid_md_5 = m.get('oaid_md5')
        if m.get('caid') is not None:
            self.caid = m.get('caid')
        if m.get('caid_md5') is not None:
            self.caid_md_5 = m.get('caid_md5')
        if m.get('android_id') is not None:
            self.android_id = m.get('android_id')
        if m.get('imei') is not None:
            self.imei = m.get('imei')
        if m.get('imei_md5') is not None:
            self.imei_md_5 = m.get('imei_md5')
        if m.get('idfa') is not None:
            self.idfa = m.get('idfa')
        if m.get('idfa_md5') is not None:
            self.idfa_md_5 = m.get('idfa_md5')
        if m.get('first_pay_amount') is not None:
            self.first_pay_amount = m.get('first_pay_amount')
        if m.get('upgrade_pay_amount') is not None:
            self.upgrade_pay_amount = m.get('upgrade_pay_amount')
        if m.get('upgrade_renewval_amount') is not None:
            self.upgrade_renewval_amount = m.get('upgrade_renewval_amount')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('loan_amount') is not None:
            self.loan_amount = m.get('loan_amount')
        if m.get('ext') is not None:
            self.ext = m.get('ext')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('out_event_id') is not None:
            self.out_event_id = m.get('out_event_id')
        if m.get('android_id_md5') is not None:
            self.android_id_md_5 = m.get('android_id_md5')
        return self


class ConvertAdDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 调用是否成功
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ClickAdDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        account_id: int = None,
        channel: str = None,
        data: str = None,
        data_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 广告主id
        self.account_id = account_id
        # 渠道，支持TENCENT
        self.channel = channel
        # 曝光/点击明细json string,曝光数据{\"impression_id\":\"dfhufhuifah\",\"impression_time\":1586437361}
        # 点击数据{\"click_id\":\"dfhufaffhuifah\,"\"click_time\":1586437361}
        self.data = data
        # 点击-CLICK，曝光-IMPRESSION
        self.data_type = data_type

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.data, 'data')
        self.validate_required(self.data_type, 'data_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.channel is not None:
            result['channel'] = self.channel
        if self.data is not None:
            result['data'] = self.data
        if self.data_type is not None:
            result['data_type'] = self.data_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        return self


class ClickAdDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 调用是否成功
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ReportAdDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        account_id: str = None,
        level: str = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 广告主账号Id
        self.account_id = account_id
        # 报表级别level
        self.level = level
        # 回传数据，json array
        self.data = data

    def validate(self):
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.level, 'level')
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.level is not None:
            result['level'] = self.level
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class ReportAdDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class OcpxAdDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        industry: str = None,
        channel: str = None,
        account_id: str = None,
        event_code: str = None,
        event_time: int = None,
        user_info: UserInfo = None,
        out_event_id: str = None,
        os_type: str = None,
        click_id: str = None,
        callback: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 见对接文档中【Industry行业枚举】部分
        self.industry = industry
        # 归因渠道编码，见对接文档中的【渠道枚举】部分
        self.channel = channel
        # 归因广告账号id
        self.account_id = account_id
        # 见对接文档中【转化事件event_code枚举】部分
        self.event_code = event_code
        # unix时间戳
        self.event_time = event_time
        # 转化用户/设备标识
        self.user_info = user_info
        # 如有去重需求，可传递业务事件id， 唯一标识当前事件。如下单事件中的订单id
        self.out_event_id = out_event_id
        # android/ios/web
        self.os_type = os_type
        # 点击id和user_info二者至少传一个
        self.click_id = click_id
        # 媒体监测链接下发的callback原值
        self.callback = callback

    def validate(self):
        self.validate_required(self.industry, 'industry')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.account_id, 'account_id')
        self.validate_required(self.event_code, 'event_code')
        self.validate_required(self.event_time, 'event_time')
        if self.user_info:
            self.user_info.validate()
        self.validate_required(self.os_type, 'os_type')
        self.validate_required(self.callback, 'callback')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.industry is not None:
            result['industry'] = self.industry
        if self.channel is not None:
            result['channel'] = self.channel
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.event_code is not None:
            result['event_code'] = self.event_code
        if self.event_time is not None:
            result['event_time'] = self.event_time
        if self.user_info is not None:
            result['user_info'] = self.user_info.to_map()
        if self.out_event_id is not None:
            result['out_event_id'] = self.out_event_id
        if self.os_type is not None:
            result['os_type'] = self.os_type
        if self.click_id is not None:
            result['click_id'] = self.click_id
        if self.callback is not None:
            result['callback'] = self.callback
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('event_code') is not None:
            self.event_code = m.get('event_code')
        if m.get('event_time') is not None:
            self.event_time = m.get('event_time')
        if m.get('user_info') is not None:
            temp_model = UserInfo()
            self.user_info = temp_model.from_map(m['user_info'])
        if m.get('out_event_id') is not None:
            self.out_event_id = m.get('out_event_id')
        if m.get('os_type') is not None:
            self.os_type = m.get('os_type')
        if m.get('click_id') is not None:
            self.click_id = m.get('click_id')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        return self


class OcpxAdDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 调用是否成功
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


