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


class XMessageResult(TeaModel):
    def __init__(
        self,
        msg_key: str = None,
        provider_id: str = None,
        consumer_id: str = None,
        status: str = None,
        push_times: int = None,
        biz_content: str = None,
        error_code: str = None,
        error_msg: str = None,
        target_url: str = None,
        unique_id: str = None,
    ):
        # 消息key
        self.msg_key = msg_key
        # 发送方租户
        self.provider_id = provider_id
        # 接收方租户
        self.consumer_id = consumer_id
        # 发送结果
        self.status = status
        # 发送次数（重试次数）
        self.push_times = push_times
        # 发送内容
        self.biz_content = biz_content
        # 错误码
        self.error_code = error_code
        # 错误消息
        self.error_msg = error_msg
        # 发送地址
        self.target_url = target_url
        # 消息唯一id
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.msg_key, 'msg_key')
        self.validate_required(self.provider_id, 'provider_id')
        self.validate_required(self.consumer_id, 'consumer_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.push_times, 'push_times')
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.target_url, 'target_url')
        self.validate_required(self.unique_id, 'unique_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.msg_key is not None:
            result['msg_key'] = self.msg_key
        if self.provider_id is not None:
            result['provider_id'] = self.provider_id
        if self.consumer_id is not None:
            result['consumer_id'] = self.consumer_id
        if self.status is not None:
            result['status'] = self.status
        if self.push_times is not None:
            result['push_times'] = self.push_times
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.target_url is not None:
            result['target_url'] = self.target_url
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('msg_key') is not None:
            self.msg_key = m.get('msg_key')
        if m.get('provider_id') is not None:
            self.provider_id = m.get('provider_id')
        if m.get('consumer_id') is not None:
            self.consumer_id = m.get('consumer_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('push_times') is not None:
            self.push_times = m.get('push_times')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('target_url') is not None:
            self.target_url = m.get('target_url')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class XMessageInfo(TeaModel):
    def __init__(
        self,
        msg_key: str = None,
        consumer_id: str = None,
        consumer_type: str = None,
        biz_content: str = None,
        msg_id: str = None,
    ):
        # 消息事件编码
        self.msg_key = msg_key
        # 消费方id，例如appId，tenantId
        self.consumer_id = consumer_id
        # 消费者类型，例如TENANT, APP
        self.consumer_type = consumer_type
        # 业务消息内容，json格式
        self.biz_content = biz_content
        # 消息发送过程中的唯一ID
        self.msg_id = msg_id

    def validate(self):
        self.validate_required(self.msg_key, 'msg_key')
        self.validate_required(self.consumer_id, 'consumer_id')
        self.validate_required(self.consumer_type, 'consumer_type')
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.msg_id, 'msg_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.msg_key is not None:
            result['msg_key'] = self.msg_key
        if self.consumer_id is not None:
            result['consumer_id'] = self.consumer_id
        if self.consumer_type is not None:
            result['consumer_type'] = self.consumer_type
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.msg_id is not None:
            result['msg_id'] = self.msg_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('msg_key') is not None:
            self.msg_key = m.get('msg_key')
        if m.get('consumer_id') is not None:
            self.consumer_id = m.get('consumer_id')
        if m.get('consumer_type') is not None:
            self.consumer_type = m.get('consumer_type')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('msg_id') is not None:
            self.msg_id = m.get('msg_id')
        return self


class XNameValuePair(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 键名
        self.name = name
        # 键值
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class XInvokerInfo(TeaModel):
    def __init__(
        self,
        invoke_channel: str = None,
        invoke_channel_uid: str = None,
        invoke_tenant: str = None,
        invoke_user_id: str = None,
    ):
        # 调用渠道
        self.invoke_channel = invoke_channel
        # 渠道的用户id
        self.invoke_channel_uid = invoke_channel_uid
        # 8位金融云租户ID
        self.invoke_tenant = invoke_tenant
        # 调用者用户金融云id
        self.invoke_user_id = invoke_user_id

    def validate(self):
        self.validate_required(self.invoke_channel, 'invoke_channel')
        self.validate_required(self.invoke_channel_uid, 'invoke_channel_uid')
        self.validate_required(self.invoke_tenant, 'invoke_tenant')
        self.validate_required(self.invoke_user_id, 'invoke_user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoke_channel is not None:
            result['invoke_channel'] = self.invoke_channel
        if self.invoke_channel_uid is not None:
            result['invoke_channel_uid'] = self.invoke_channel_uid
        if self.invoke_tenant is not None:
            result['invoke_tenant'] = self.invoke_tenant
        if self.invoke_user_id is not None:
            result['invoke_user_id'] = self.invoke_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoke_channel') is not None:
            self.invoke_channel = m.get('invoke_channel')
        if m.get('invoke_channel_uid') is not None:
            self.invoke_channel_uid = m.get('invoke_channel_uid')
        if m.get('invoke_tenant') is not None:
            self.invoke_tenant = m.get('invoke_tenant')
        if m.get('invoke_user_id') is not None:
            self.invoke_user_id = m.get('invoke_user_id')
        return self


class CreateBizeventMessageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_content: str = None,
        utc_timestamp: int = None,
        msg_id: str = None,
        msg_key: str = None,
        consumer_id: str = None,
        consumer_type: str = None,
        tags: str = None,
        msg_type: str = None,
        header: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 业务消息内容，json格式
        self.biz_content = biz_content
        # 日期对应的timestamp
        self.utc_timestamp = utc_timestamp
        # 消息发送过程中的唯一ID
        self.msg_id = msg_id
        # 消息事件编码
        self.msg_key = msg_key
        # 消费方id，例如appId，tenantId，可以多个，多个之间使用","分割
        self.consumer_id = consumer_id
        # 消费者类型，例如TENANT, APP
        self.consumer_type = consumer_type
        # 二级消息主题,订阅方可以过滤消息
        self.tags = tags
        # 消息类型，1：点对点，2: 广播消息
        self.msg_type = msg_type
        # 上下文透传的自定义header
        self.header = header

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.utc_timestamp, 'utc_timestamp')
        self.validate_required(self.msg_id, 'msg_id')
        self.validate_required(self.msg_key, 'msg_key')
        self.validate_required(self.consumer_id, 'consumer_id')
        self.validate_required(self.consumer_type, 'consumer_type')
        self.validate_required(self.msg_type, 'msg_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.utc_timestamp is not None:
            result['utc_timestamp'] = self.utc_timestamp
        if self.msg_id is not None:
            result['msg_id'] = self.msg_id
        if self.msg_key is not None:
            result['msg_key'] = self.msg_key
        if self.consumer_id is not None:
            result['consumer_id'] = self.consumer_id
        if self.consumer_type is not None:
            result['consumer_type'] = self.consumer_type
        if self.tags is not None:
            result['tags'] = self.tags
        if self.msg_type is not None:
            result['msg_type'] = self.msg_type
        if self.header is not None:
            result['header'] = self.header
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('utc_timestamp') is not None:
            self.utc_timestamp = m.get('utc_timestamp')
        if m.get('msg_id') is not None:
            self.msg_id = m.get('msg_id')
        if m.get('msg_key') is not None:
            self.msg_key = m.get('msg_key')
        if m.get('consumer_id') is not None:
            self.consumer_id = m.get('consumer_id')
        if m.get('consumer_type') is not None:
            self.consumer_type = m.get('consumer_type')
        if m.get('tags') is not None:
            self.tags = m.get('tags')
        if m.get('msg_type') is not None:
            self.msg_type = m.get('msg_type')
        if m.get('header') is not None:
            self.header = m.get('header')
        return self


class CreateBizeventMessageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class CreateFileUploadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_code: str = None,
        file_label: str = None,
        file_metadata: str = None,
        file_name: str = None,
        mime_type: str = None,
        api_cluster: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 上传文件作用的openapi method
        self.api_code = api_code
        # 文件标签，多个标签;分割
        self.file_label = file_label
        # 自定义的文件元数据
        self.file_metadata = file_metadata
        # 文件名，不传则随机生成文件名
        self.file_name = file_name
        # 文件的多媒体类型
        self.mime_type = mime_type
        # 产品方的api归属集群，即productInstanceId
        self.api_cluster = api_cluster

    def validate(self):
        self.validate_required(self.api_code, 'api_code')
        if self.file_label is not None:
            self.validate_max_length(self.file_label, 'file_label', 100)
        if self.file_metadata is not None:
            self.validate_max_length(self.file_metadata, 'file_metadata', 1000)
        if self.file_name is not None:
            self.validate_max_length(self.file_name, 'file_name', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.api_code is not None:
            result['api_code'] = self.api_code
        if self.file_label is not None:
            result['file_label'] = self.file_label
        if self.file_metadata is not None:
            result['file_metadata'] = self.file_metadata
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.mime_type is not None:
            result['mime_type'] = self.mime_type
        if self.api_cluster is not None:
            result['api_cluster'] = self.api_cluster
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_code') is not None:
            self.api_code = m.get('api_code')
        if m.get('file_label') is not None:
            self.file_label = m.get('file_label')
        if m.get('file_metadata') is not None:
            self.file_metadata = m.get('file_metadata')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('mime_type') is not None:
            self.mime_type = m.get('mime_type')
        if m.get('api_cluster') is not None:
            self.api_cluster = m.get('api_cluster')
        return self


class CreateFileUploadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        expired_time: str = None,
        file_id: str = None,
        upload_headers: List[XNameValuePair] = None,
        upload_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上传有效期
        self.expired_time = expired_time
        # 32位文件唯一id
        self.file_id = file_id
        # 放入http请求头里
        self.upload_headers = upload_headers
        # 文件上传地址
        self.upload_url = upload_url

    def validate(self):
        if self.expired_time is not None:
            self.validate_pattern(self.expired_time, 'expired_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.upload_headers:
            for k in self.upload_headers:
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
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.file_id is not None:
            result['file_id'] = self.file_id
        result['upload_headers'] = []
        if self.upload_headers is not None:
            for k in self.upload_headers:
                result['upload_headers'].append(k.to_map() if k else None)
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        self.upload_headers = []
        if m.get('upload_headers') is not None:
            for k in m.get('upload_headers'):
                temp_model = XNameValuePair()
                self.upload_headers.append(temp_model.from_map(k))
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        return self


class GetFileDownloadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 文件唯一id
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class GetFileDownloadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        api_code: str = None,
        download_url: str = None,
        expired_time: str = None,
        file_label: str = None,
        file_metadata: str = None,
        file_name: str = None,
        file_path: str = None,
        file_size: int = None,
        upload_invoker: XInvokerInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建文件使用的apiCode
        self.api_code = api_code
        # 文件下载地址
        self.download_url = download_url
        # 下载超时时间
        self.expired_time = expired_time
        # 文件标签
        self.file_label = file_label
        # 请求上传时的自定义元数据
        self.file_metadata = file_metadata
        # 文件名
        self.file_name = file_name
        # 文件路径
        self.file_path = file_path
        # 文件大小
        self.file_size = file_size
        # 上传的调用者信息
        self.upload_invoker = upload_invoker

    def validate(self):
        if self.expired_time is not None:
            self.validate_pattern(self.expired_time, 'expired_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.upload_invoker:
            self.upload_invoker.validate()

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
        if self.api_code is not None:
            result['api_code'] = self.api_code
        if self.download_url is not None:
            result['download_url'] = self.download_url
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.file_label is not None:
            result['file_label'] = self.file_label
        if self.file_metadata is not None:
            result['file_metadata'] = self.file_metadata
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_path is not None:
            result['file_path'] = self.file_path
        if self.file_size is not None:
            result['file_size'] = self.file_size
        if self.upload_invoker is not None:
            result['upload_invoker'] = self.upload_invoker.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('api_code') is not None:
            self.api_code = m.get('api_code')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('file_label') is not None:
            self.file_label = m.get('file_label')
        if m.get('file_metadata') is not None:
            self.file_metadata = m.get('file_metadata')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        if m.get('file_size') is not None:
            self.file_size = m.get('file_size')
        if m.get('upload_invoker') is not None:
            temp_model = XInvokerInfo()
            self.upload_invoker = temp_model.from_map(m['upload_invoker'])
        return self


class QueryMessageFailedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        msg_key: str = None,
        consumer_id: str = None,
        consumer_type: str = None,
        page_size: int = None,
        page_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 消息事件编码
        self.msg_key = msg_key
        # 消费方id，例如appId，tenantId 只支持单个传入
        self.consumer_id = consumer_id
        # 消费者类型，例如TENANT, APP
        self.consumer_type = consumer_type
        # 每页条数，最大1000条，不传则默认1000条
        self.page_size = page_size
        # 第几页，从1开始，不传则默认为1
        self.page_num = page_num

    def validate(self):
        self.validate_required(self.msg_key, 'msg_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.msg_key is not None:
            result['msg_key'] = self.msg_key
        if self.consumer_id is not None:
            result['consumer_id'] = self.consumer_id
        if self.consumer_type is not None:
            result['consumer_type'] = self.consumer_type
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_num is not None:
            result['page_num'] = self.page_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('msg_key') is not None:
            self.msg_key = m.get('msg_key')
        if m.get('consumer_id') is not None:
            self.consumer_id = m.get('consumer_id')
        if m.get('consumer_type') is not None:
            self.consumer_type = m.get('consumer_type')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        return self


class QueryMessageFailedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_size: str = None,
        page_num: str = None,
        total_num: str = None,
        msg_list: List[XMessageInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 每页条数
        self.page_size = page_size
        # 第几页
        self.page_num = page_num
        # 总条数
        self.total_num = total_num
        # 最终失败的消息列表
        self.msg_list = msg_list

    def validate(self):
        if self.msg_list:
            for k in self.msg_list:
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
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.total_num is not None:
            result['total_num'] = self.total_num
        result['msg_list'] = []
        if self.msg_list is not None:
            for k in self.msg_list:
                result['msg_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('total_num') is not None:
            self.total_num = m.get('total_num')
        self.msg_list = []
        if m.get('msg_list') is not None:
            for k in m.get('msg_list'):
                temp_model = XMessageInfo()
                self.msg_list.append(temp_model.from_map(k))
        return self


class QueryMessageResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        msg_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 消息id
        self.msg_id = msg_id

    def validate(self):
        self.validate_required(self.msg_id, 'msg_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.msg_id is not None:
            result['msg_id'] = self.msg_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('msg_id') is not None:
            self.msg_id = m.get('msg_id')
        return self


class QueryMessageResultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        messages: List[XMessageResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 消息列表
        self.messages = messages

    def validate(self):
        if self.messages:
            for k in self.messages:
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
        result['messages'] = []
        if self.messages is not None:
            for k in self.messages:
                result['messages'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.messages = []
        if m.get('messages') is not None:
            for k in m.get('messages'):
                temp_model = XMessageResult()
                self.messages.append(temp_model.from_map(k))
        return self


