# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List


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


class GeneralResourcePatch(TeaModel):
    def __init__(
        self,
        url: str = None,
        old_version: int = None,
        md_5: str = None,
        size: int = None,
    ):
        # 差量包文件下载地址
        self.url = url
        # 差量包的旧版本号
        self.old_version = old_version
        # md5摘要值
        self.md_5 = md_5
        # 差量包文件大小
        self.size = size

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.old_version, 'old_version')
        self.validate_required(self.md_5, 'md_5')
        self.validate_required(self.size, 'size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        if self.old_version is not None:
            result['old_version'] = self.old_version
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('old_version') is not None:
            self.old_version = m.get('old_version')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class PublishMerchantDiyskuRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        channel: str = None,
        user_id: str = None,
        user_type: str = None,
        sku_id: str = None,
        sku_type: str = None,
        thumbnail_url: str = None,
        original_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务请求id，用来做业务上的幂等。后面查询状态也是此字段
        self.biz_no = biz_no
        # 调用渠道
        # PET 宠物
        # MEMBER 会员
        self.channel = channel
        # 领取数字藏品的用户ID，支持2088/手机号/1322
        self.user_id = user_id
        # 支付宝2088账号：ALIPAY_UID
        # 手机号：PHONE_NO
        # 鲸探1322账号：FANS_UID
        self.user_type = user_type
        # 需要发放的SKUID编码
        self.sku_id = sku_id
        # 一期仅支持图片：IMAGE
        self.sku_type = sku_type
        # 数字藏品的缩略图地址，可与原图相同也可不同，需要校验长宽比为1:1
        self.thumbnail_url = thumbnail_url
        # 数字藏品的原图地址，需要校验长宽比为1:1
        self.original_url = original_url

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.sku_id, 'sku_id')
        self.validate_required(self.sku_type, 'sku_type')
        self.validate_required(self.thumbnail_url, 'thumbnail_url')
        self.validate_required(self.original_url, 'original_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.channel is not None:
            result['channel'] = self.channel
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.sku_id is not None:
            result['sku_id'] = self.sku_id
        if self.sku_type is not None:
            result['sku_type'] = self.sku_type
        if self.thumbnail_url is not None:
            result['thumbnail_url'] = self.thumbnail_url
        if self.original_url is not None:
            result['original_url'] = self.original_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('sku_id') is not None:
            self.sku_id = m.get('sku_id')
        if m.get('sku_type') is not None:
            self.sku_type = m.get('sku_type')
        if m.get('thumbnail_url') is not None:
            self.thumbnail_url = m.get('thumbnail_url')
        if m.get('original_url') is not None:
            self.original_url = m.get('original_url')
        return self


class PublishMerchantDiyskuResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nft_id: str = None,
        receive_time: str = None,
        send_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的nftid结果
        self.nft_id = nft_id
        # 获得时间
        self.receive_time = receive_time
        # 发放状态
        # AUDIT_SUBMIT("审核中"),
        # AUDIT_SUCCESS("审核通过"),
        # AUDIT_FAIL("审核未通过"),
        # TRANSFER_UNKNOWN("发放结果未知"),
        # TRANSFER_SUCCESS("发放成功"),
        # TRANSFER_FAILED("发放失败"),
        # SHIELD("屏蔽"),
        # RECYCLE("回收"),
        self.send_status = send_status

    def validate(self):
        if self.receive_time is not None:
            self.validate_pattern(self.receive_time, 'receive_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.receive_time is not None:
            result['receive_time'] = self.receive_time
        if self.send_status is not None:
            result['send_status'] = self.send_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('receive_time') is not None:
            self.receive_time = m.get('receive_time')
        if m.get('send_status') is not None:
            self.send_status = m.get('send_status')
        return self


class QueryMerchantDiyskuRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务请求id，用来做业务上的幂等
        self.biz_no = biz_no
        # 领取数字藏品的用户ID，支持2088/手机号/1322
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class QueryMerchantDiyskuResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nft_id: str = None,
        receive_time: str = None,
        send_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 生成的nftid结果
        self.nft_id = nft_id
        # 获得时间
        self.receive_time = receive_time
        # 发放状态
        # AUDIT_SUBMIT("审核中"),
        # AUDIT_SUCCESS("审核通过"),
        # AUDIT_FAIL("审核未通过"),
        # TRANSFER_UNKNOWN("发放结果未知"),
        # TRANSFER_SUCCESS("发放成功"),
        # TRANSFER_FAILED("发放失败"),
        # SHIELD("屏蔽"),
        # RECYCLE("回收"),
        self.send_status = send_status

    def validate(self):
        if self.receive_time is not None:
            self.validate_pattern(self.receive_time, 'receive_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.nft_id is not None:
            result['nft_id'] = self.nft_id
        if self.receive_time is not None:
            result['receive_time'] = self.receive_time
        if self.send_status is not None:
            result['send_status'] = self.send_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('nft_id') is not None:
            self.nft_id = m.get('nft_id')
        if m.get('receive_time') is not None:
            self.receive_time = m.get('receive_time')
        if m.get('send_status') is not None:
            self.send_status = m.get('send_status')
        return self


class QueryMerchantUgcimagesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        record_id_list: List[str] = None,
        biz_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ugc资产铸造记录id列表
        self.record_id_list = record_id_list
        # 场景
        self.biz_scene = biz_scene

    def validate(self):
        self.validate_required(self.record_id_list, 'record_id_list')
        self.validate_required(self.biz_scene, 'biz_scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.record_id_list is not None:
            result['record_id_list'] = self.record_id_list
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('record_id_list') is not None:
            self.record_id_list = m.get('record_id_list')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        return self


class QueryMerchantUgcimagesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        img_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 入参中id对应的图片列表
        self.img_list = img_list

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
        if self.img_list is not None:
            result['img_list'] = self.img_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('img_list') is not None:
            self.img_list = m.get('img_list')
        return self


class CreateResourceGeneralresourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        biz_id: str = None,
        need_patch: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小程序的APP ID
        self.app_id = app_id
        # 业务幂等ID
        self.biz_id = biz_id
        # 是否需要生成差量包
        self.need_patch = need_patch

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.need_patch, 'need_patch')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.need_patch is not None:
            result['need_patch'] = self.need_patch
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('need_patch') is not None:
            self.need_patch = m.get('need_patch')
        return self


class CreateResourceGeneralresourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        resource_id: str = None,
        url: str = None,
        maas_token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资源ID
        self.resource_id = resource_id
        # 文件上传地址
        self.url = url
        # 资源上传的授权token，上传文件时需要将该值放入header中进行鉴权
        self.maas_token = maas_token

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
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.url is not None:
            result['url'] = self.url
        if self.maas_token is not None:
            result['maas_token'] = self.maas_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('maas_token') is not None:
            self.maas_token = m.get('maas_token')
        return self


class BindResourceGeneralresourcefileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        resource_id: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小程序的APP ID
        self.app_id = app_id
        # 资源ID
        self.resource_id = resource_id
        # 文件ID
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class BindResourceGeneralresourcefileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        version: int = None,
        url: str = None,
        md_5: str = None,
        size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 版本号
        self.version = version
        # 文件下载地址
        self.url = url
        # md5摘要值
        self.md_5 = md_5
        # 文件大小
        self.size = size

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
        if self.version is not None:
            result['version'] = self.version
        if self.url is not None:
            result['url'] = self.url
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class PublishResourceGeneralresourcefileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        biz_id: str = None,
        resource_id: str = None,
        file_version: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小程序的APP ID
        self.app_id = app_id
        # 业务幂等ID
        self.biz_id = biz_id
        # 资源ID
        self.resource_id = resource_id
        # 版本号
        self.file_version = file_version

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.file_version, 'file_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.file_version is not None:
            result['file_version'] = self.file_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('file_version') is not None:
            self.file_version = m.get('file_version')
        return self


class PublishResourceGeneralresourcefileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        version: int = None,
        url: str = None,
        md_5: str = None,
        size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 版本号
        self.version = version
        # 资源文件下载地址
        self.url = url
        # md5摘要值
        self.md_5 = md_5
        # 文件大小
        self.size = size

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
        if self.version is not None:
            result['version'] = self.version
        if self.url is not None:
            result['url'] = self.url
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.size is not None:
            result['size'] = self.size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('size') is not None:
            self.size = m.get('size')
        return self


class QueryResourcePatchlistRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        resource_id: str = None,
        file_version: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 小程序的APP ID
        self.app_id = app_id
        # 资源ID
        self.resource_id = resource_id
        # 版本号
        self.file_version = file_version

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.resource_id, 'resource_id')
        self.validate_required(self.file_version, 'file_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.file_version is not None:
            result['file_version'] = self.file_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('file_version') is not None:
            self.file_version = m.get('file_version')
        return self


class QueryResourcePatchlistResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        patch_status: str = None,
        url: str = None,
        resource_id: str = None,
        version: int = None,
        md_5: str = None,
        size: int = None,
        patch_list: List[GeneralResourcePatch] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 差量包生成状态，包括PATCHING（生成中）和FINISHED（生成完成）
        self.patch_status = patch_status
        # 全量包下载地址
        self.url = url
        # 资源ID
        self.resource_id = resource_id
        # 全量包版本号
        self.version = version
        # 全量包md5摘要值
        self.md_5 = md_5
        # 全量包文件大小
        self.size = size
        # 差量包文件信息列表
        self.patch_list = patch_list

    def validate(self):
        if self.patch_list:
            for k in self.patch_list:
                if k:
                    k.validate()

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
        if self.patch_status is not None:
            result['patch_status'] = self.patch_status
        if self.url is not None:
            result['url'] = self.url
        if self.resource_id is not None:
            result['resource_id'] = self.resource_id
        if self.version is not None:
            result['version'] = self.version
        if self.md_5 is not None:
            result['md5'] = self.md_5
        if self.size is not None:
            result['size'] = self.size
        result['patch_list'] = []
        if self.patch_list is not None:
            for k in self.patch_list:
                result['patch_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('patch_status') is not None:
            self.patch_status = m.get('patch_status')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('resource_id') is not None:
            self.resource_id = m.get('resource_id')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('md5') is not None:
            self.md_5 = m.get('md5')
        if m.get('size') is not None:
            self.size = m.get('size')
        self.patch_list = []
        if m.get('patch_list') is not None:
            for k in m.get('patch_list'):
                temp_model = GeneralResourcePatch()
                self.patch_list.append(temp_model.from_map(k))
        return self


