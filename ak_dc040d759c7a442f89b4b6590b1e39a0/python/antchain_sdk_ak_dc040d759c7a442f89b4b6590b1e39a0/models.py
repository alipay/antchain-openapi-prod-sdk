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


class ResponseHead(TeaModel):
    def __init__(
        self,
        request_id: str = None,
    ):
        # 请求唯一标识
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class RequestHead(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        secret_id: str = None,
        product_code: str = None,
        format_type: str = None,
        online_flag: bool = None,
    ):
        # 请求唯一标识
        self.request_id = request_id
        # 客户身份标识ID
        self.secret_id = secret_id
        # 客户签约产品code
        self.product_code = product_code
        # response输出类型，默认json
        self.format_type = format_type
        # false
        self.online_flag = online_flag

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.secret_id, 'secret_id')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.secret_id is not None:
            result['secret_id'] = self.secret_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.format_type is not None:
            result['format_type'] = self.format_type
        if self.online_flag is not None:
            result['online_flag'] = self.online_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('secret_id') is not None:
            self.secret_id = m.get('secret_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('format_type') is not None:
            self.format_type = m.get('format_type')
        if m.get('online_flag') is not None:
            self.online_flag = m.get('online_flag')
        return self


class DeviceCollectResult(TeaModel):
    def __init__(
        self,
        collect_id: str = None,
        antchain_id: str = None,
    ):
        # 上链数据采集ID
        self.collect_id = collect_id
        # 上链id
        self.antchain_id = antchain_id

    def validate(self):
        self.validate_required(self.collect_id, 'collect_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.collect_id is not None:
            result['collect_id'] = self.collect_id
        if self.antchain_id is not None:
            result['antchain_id'] = self.antchain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('collect_id') is not None:
            self.collect_id = m.get('collect_id')
        if m.get('antchain_id') is not None:
            self.antchain_id = m.get('antchain_id')
        return self


class IifaaEkytResponse(TeaModel):
    def __init__(
        self,
        head: ResponseHead = None,
        biz_res: str = None,
    ):
        # 响应头
        self.head = head
        # 业务响应结果
        self.biz_res = biz_res

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.biz_res, 'biz_res')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.biz_res is not None:
            result['biz_res'] = self.biz_res
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('head') is not None:
            temp_model = ResponseHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('biz_res') is not None:
            self.biz_res = m.get('biz_res')
        return self


class ChainModelResult(TeaModel):
    def __init__(
        self,
        biz_scene: str = None,
        data_scene: str = None,
        asset_id: str = None,
        asset_data: str = None,
        tenant_id: str = None,
        tx_time: str = None,
        business_id: str = None,
        antchain_id: str = None,
    ):
        # 所属业务
        self.biz_scene = biz_scene
        # 资产类型
        self.data_scene = data_scene
        # 资产id
        self.asset_id = asset_id
        # 资产数据内容json
        self.asset_data = asset_data
        # 租户id
        self.tenant_id = tenant_id
        # 上链时间
        self.tx_time = tx_time
        # 业务ID
        self.business_id = business_id
        # 上链id
        self.antchain_id = antchain_id

    def validate(self):
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.data_scene, 'data_scene')
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.asset_data, 'asset_data')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.tx_time, 'tx_time')
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.antchain_id, 'antchain_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.data_scene is not None:
            result['data_scene'] = self.data_scene
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.asset_data is not None:
            result['asset_data'] = self.asset_data
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tx_time is not None:
            result['tx_time'] = self.tx_time
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.antchain_id is not None:
            result['antchain_id'] = self.antchain_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('data_scene') is not None:
            self.data_scene = m.get('data_scene')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('asset_data') is not None:
            self.asset_data = m.get('asset_data')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tx_time') is not None:
            self.tx_time = m.get('tx_time')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('antchain_id') is not None:
            self.antchain_id = m.get('antchain_id')
        return self


class DeviceCollectFail(TeaModel):
    def __init__(
        self,
        collect_id: str = None,
        code: str = None,
        message: str = None,
    ):
        # 上链数据采集ID
        self.collect_id = collect_id
        # 错误码
        self.code = code
        # 错误信息
        self.message = message

    def validate(self):
        self.validate_required(self.collect_id, 'collect_id')
        self.validate_required(self.code, 'code')
        self.validate_required(self.message, 'message')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.collect_id is not None:
            result['collect_id'] = self.collect_id
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('collect_id') is not None:
            self.collect_id = m.get('collect_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class CollectInfo(TeaModel):
    def __init__(
        self,
        asset_id: str = None,
        data_scene: str = None,
        asset_data: str = None,
        collect_id: str = None,
    ):
        # 资产ID
        self.asset_id = asset_id
        # 数据资产类型
        self.data_scene = data_scene
        # 资产数据内容，业务要上链的数据JSON格式
        self.asset_data = asset_data
        # 上链数据采集id
        self.collect_id = collect_id

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.data_scene, 'data_scene')
        self.validate_required(self.asset_data, 'asset_data')
        self.validate_required(self.collect_id, 'collect_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.data_scene is not None:
            result['data_scene'] = self.data_scene
        if self.asset_data is not None:
            result['asset_data'] = self.asset_data
        if self.collect_id is not None:
            result['collect_id'] = self.collect_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('data_scene') is not None:
            self.data_scene = m.get('data_scene')
        if m.get('asset_data') is not None:
            self.asset_data = m.get('asset_data')
        if m.get('collect_id') is not None:
            self.collect_id = m.get('collect_id')
        return self


class OperateBlockchainBotIotbasicDevicecollectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        asset_id: str = None,
        data_scene: str = None,
        biz_scene: str = None,
        asset_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 资产ID
        self.asset_id = asset_id
        # 数据资产类型
        self.data_scene = data_scene
        # 所属业务
        self.biz_scene = biz_scene
        # 资产数据内容，业务要上链的数据JSON格式
        self.asset_data = asset_data

    def validate(self):
        self.validate_required(self.data_scene, 'data_scene')
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.asset_data, 'asset_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.data_scene is not None:
            result['data_scene'] = self.data_scene
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.asset_data is not None:
            result['asset_data'] = self.asset_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('data_scene') is not None:
            self.data_scene = m.get('data_scene')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('asset_data') is not None:
            self.asset_data = m.get('asset_data')
        return self


class OperateBlockchainBotIotbasicDevicecollectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        antchain_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 上链id
        self.antchain_id = antchain_id

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
        if self.antchain_id is not None:
            result['antchain_id'] = self.antchain_id
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
        if m.get('antchain_id') is not None:
            self.antchain_id = m.get('antchain_id')
        return self


class OperateBlockchainBotIotbasicBatchcollectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_scene: str = None,
        tenant_id: str = None,
        collect_info_list: List[CollectInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 所属业务
        self.biz_scene = biz_scene
        # 租户id
        self.tenant_id = tenant_id
        # 上链数据列表
        self.collect_info_list = collect_info_list

    def validate(self):
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.collect_info_list, 'collect_info_list')
        if self.collect_info_list:
            for k in self.collect_info_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        result['collect_info_list'] = []
        if self.collect_info_list is not None:
            for k in self.collect_info_list:
                result['collect_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        self.collect_info_list = []
        if m.get('collect_info_list') is not None:
            for k in m.get('collect_info_list'):
                temp_model = CollectInfo()
                self.collect_info_list.append(temp_model.from_map(k))
        return self


class OperateBlockchainBotIotbasicBatchcollectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        success_list: List[DeviceCollectResult] = None,
        fail_list: List[DeviceCollectFail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 上链成功列表
        self.success_list = success_list
        # 上链失败列表
        self.fail_list = fail_list

    def validate(self):
        if self.success_list:
            for k in self.success_list:
                if k:
                    k.validate()
        if self.fail_list:
            for k in self.fail_list:
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
        if self.success is not None:
            result['success'] = self.success
        result['success_list'] = []
        if self.success_list is not None:
            for k in self.success_list:
                result['success_list'].append(k.to_map() if k else None)
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
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
        self.success_list = []
        if m.get('success_list') is not None:
            for k in m.get('success_list'):
                temp_model = DeviceCollectResult()
                self.success_list.append(temp_model.from_map(k))
        self.fail_list = []
        if m.get('fail_list') is not None:
            for k in m.get('fail_list'):
                temp_model = DeviceCollectFail()
                self.fail_list.append(temp_model.from_map(k))
        return self


class QueryBlockchainBotIotbasicDevicecollectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        end_time: str = None,
        data_scene: str = None,
        biz_scene: str = None,
        tenant_id: str = None,
        antchain_id: str = None,
        asset_data: str = None,
        page_size: int = None,
        current_page: int = None,
        business_id: str = None,
        start_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询结束时间
        self.end_time = end_time
        # 资产类型
        self.data_scene = data_scene
        # 所属业务
        self.biz_scene = biz_scene
        # 租户id
        self.tenant_id = tenant_id
        # 上链hash
        self.antchain_id = antchain_id
        # 上链数据内容 json
        self.asset_data = asset_data
        # 每页数量
        self.page_size = page_size
        # 当前页码
        self.current_page = current_page
        # 业务id
        self.business_id = business_id
        # 查询开始时间
        self.start_time = start_time

    def validate(self):
        self.validate_required(self.data_scene, 'data_scene')
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 100)
            self.validate_minimum(self.page_size, 'page_size', 1)
        self.validate_required(self.current_page, 'current_page')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.data_scene is not None:
            result['data_scene'] = self.data_scene
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.antchain_id is not None:
            result['antchain_id'] = self.antchain_id
        if self.asset_data is not None:
            result['asset_data'] = self.asset_data
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('data_scene') is not None:
            self.data_scene = m.get('data_scene')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('antchain_id') is not None:
            self.antchain_id = m.get('antchain_id')
        if m.get('asset_data') is not None:
            self.asset_data = m.get('asset_data')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class QueryBlockchainBotIotbasicDevicecollectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        total_page: int = None,
        data: List[ChainModelResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页码
        self.current = current
        # 每页数据大小
        self.page_size = page_size
        # 数据总条数
        self.total = total
        # 总页数
        self.total_page = total_page
        # 查询结果
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        if self.total_page is not None:
            result['total_page'] = self.total_page
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('total_page') is not None:
            self.total_page = m.get('total_page')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ChainModelResult()
                self.data.append(temp_model.from_map(k))
        return self


class QueryAntsecuritytechGatewayEkytDriverRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        head: RequestHead = None,
        request: str = None,
        signature: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 接口请求head
        self.head = head
        # 请求业务参数，加密之后的密文信息
        self.request = request
        # 请求数据签名值
        self.signature = signature

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.request, 'request')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.request is not None:
            result['request'] = self.request
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('head') is not None:
            temp_model = RequestHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('request') is not None:
            self.request = m.get('request')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class QueryAntsecuritytechGatewayEkytDriverResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: IifaaEkytResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 接口响应结果
        self.success = success
        # 接口响应描述
        self.message = message
        # 接口响应数据
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data.to_map()
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
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            temp_model = IifaaEkytResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class ApplyAntsecuritytechGatewayIifaaDevicekeyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        head: RequestHead = None,
        request: str = None,
        signature: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求头
        self.head = head
        # 业务参数
        self.request = request
        # 签名
        self.signature = signature

    def validate(self):
        self.validate_required(self.head, 'head')
        if self.head:
            self.head.validate()
        self.validate_required(self.request, 'request')
        self.validate_required(self.signature, 'signature')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.head is not None:
            result['head'] = self.head.to_map()
        if self.request is not None:
            result['request'] = self.request
        if self.signature is not None:
            result['signature'] = self.signature
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('head') is not None:
            temp_model = RequestHead()
            self.head = temp_model.from_map(m['head'])
        if m.get('request') is not None:
            self.request = m.get('request')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        return self


class ApplyAntsecuritytechGatewayIifaaDevicekeyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        message: str = None,
        data: IifaaEkytResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 响应结果
        self.success = success
        # 结果描述
        self.message = message
        # 业务响应结果
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
        if self.message is not None:
            result['message'] = self.message
        if self.data is not None:
            result['data'] = self.data.to_map()
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
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            temp_model = IifaaEkytResponse()
            self.data = temp_model.from_map(m['data'])
        return self


class CreateBlockchainBotDevicecorpThingmodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        thing_model_json: str = None,
        category_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 新增的功能定义详情
        self.thing_model_json = thing_model_json
        # 品类code
        self.category_code = category_code

    def validate(self):
        self.validate_required(self.thing_model_json, 'thing_model_json')
        self.validate_required(self.category_code, 'category_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.thing_model_json is not None:
            result['thing_model_json'] = self.thing_model_json
        if self.category_code is not None:
            result['category_code'] = self.category_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('thing_model_json') is not None:
            self.thing_model_json = m.get('thing_model_json')
        if m.get('category_code') is not None:
            self.category_code = m.get('category_code')
        return self


class CreateBlockchainBotDevicecorpThingmodelResponse(TeaModel):
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
        # 操作结果
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


class DeleteBlockchainBotDevicecorpThingmodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        property_identifier: List[str] = None,
        service_identifier: List[str] = None,
        event_identifier: List[str] = None,
        category_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需要删除的属性标识符列表
        self.property_identifier = property_identifier
        # 需要删除的服务标识符列表
        self.service_identifier = service_identifier
        # 需要删除的事件标识符列表
        self.event_identifier = event_identifier
        # 品类code
        self.category_code = category_code

    def validate(self):
        self.validate_required(self.category_code, 'category_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.property_identifier is not None:
            result['property_identifier'] = self.property_identifier
        if self.service_identifier is not None:
            result['service_identifier'] = self.service_identifier
        if self.event_identifier is not None:
            result['event_identifier'] = self.event_identifier
        if self.category_code is not None:
            result['category_code'] = self.category_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('property_identifier') is not None:
            self.property_identifier = m.get('property_identifier')
        if m.get('service_identifier') is not None:
            self.service_identifier = m.get('service_identifier')
        if m.get('event_identifier') is not None:
            self.event_identifier = m.get('event_identifier')
        if m.get('category_code') is not None:
            self.category_code = m.get('category_code')
        return self


class DeleteBlockchainBotDevicecorpThingmodelResponse(TeaModel):
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
        # 操作结果
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


class PublishBlockchainBotDevicecorpThingmodelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        category_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 品类code
        self.category_code = category_code

    def validate(self):
        self.validate_required(self.category_code, 'category_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.category_code is not None:
            result['category_code'] = self.category_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('category_code') is not None:
            self.category_code = m.get('category_code')
        return self


class PublishBlockchainBotDevicecorpThingmodelResponse(TeaModel):
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
        # 操作结果
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


class SignBlockchainBotDigitalkeyWithholdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        personal_product_code: str = None,
        product_code: str = None,
        channel: str = None,
        return_url: str = None,
        external_logon_id: str = None,
        alipay_user_id: str = None,
        sign_scene: str = None,
        external_agreement_no: str = None,
        sign_validity_period: str = None,
        effect_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 个人签约产品码
        self.personal_product_code = personal_product_code
        # 销售产品码
        self.product_code = product_code
        # 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。 扫码或者短信页面签约需要拼装http的请求地址访问中间页面，钱包h5页面签约可直接拼接scheme的请求地址
        self.channel = channel
        # 支付宝App主动回跳商户App里指定的页面 http/https 路径。建议商户使用 https。
        self.return_url = return_url
        # 用户在商户网站的登录账号，用于在签约页面展示
        self.external_logon_id = external_logon_id
        # 支付宝用户ID
        self.alipay_user_id = alipay_user_id
        # 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
        self.sign_scene = sign_scene
        # 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
        self.external_agreement_no = external_agreement_no
        # 当前用户签约请求的协议有效周期。 整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。 目前支持的时间单位： 1. d：天 2. m：月 如果未传入，默认为长期有效。
        self.sign_validity_period = sign_validity_period
        # 签约有效时间限制，单位是秒，有效范围是0-86400，商户传入此字段会用商户传入的值否则使用支付宝侧默认值，在有效时间外进行签约，会进行安全拦截；（备注：此字段适用于需要开通安全防控的商户，且依赖商户传入生成签约时的时间戳字段timestamp）
        self.effect_time = effect_time

    def validate(self):
        self.validate_required(self.personal_product_code, 'personal_product_code')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.return_url, 'return_url')
        self.validate_required(self.external_logon_id, 'external_logon_id')
        self.validate_required(self.sign_scene, 'sign_scene')
        self.validate_required(self.external_agreement_no, 'external_agreement_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.personal_product_code is not None:
            result['personal_product_code'] = self.personal_product_code
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.channel is not None:
            result['channel'] = self.channel
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.external_logon_id is not None:
            result['external_logon_id'] = self.external_logon_id
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.sign_scene is not None:
            result['sign_scene'] = self.sign_scene
        if self.external_agreement_no is not None:
            result['external_agreement_no'] = self.external_agreement_no
        if self.sign_validity_period is not None:
            result['sign_validity_period'] = self.sign_validity_period
        if self.effect_time is not None:
            result['effect_time'] = self.effect_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('personal_product_code') is not None:
            self.personal_product_code = m.get('personal_product_code')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('external_logon_id') is not None:
            self.external_logon_id = m.get('external_logon_id')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('sign_scene') is not None:
            self.sign_scene = m.get('sign_scene')
        if m.get('external_agreement_no') is not None:
            self.external_agreement_no = m.get('external_agreement_no')
        if m.get('sign_validity_period') is not None:
            self.sign_validity_period = m.get('sign_validity_period')
        if m.get('effect_time') is not None:
            self.effect_time = m.get('effect_time')
        return self


class SignBlockchainBotDigitalkeyWithholdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 明细返回码
        self.sub_code = sub_code
        # 明细返回码描述
        self.sub_msg = sub_msg
        # 生成的签约链接地址
        self.data = data

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
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class UnbindBlockchainBotDigitalkeyWithholdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alipay_user_id: str = None,
        personal_product_code: str = None,
        sign_scene: str = None,
        external_agreement_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。
        self.alipay_user_id = alipay_user_id
        # 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
        self.personal_product_code = personal_product_code
        # 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
        self.sign_scene = sign_scene
        # 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
        self.external_agreement_no = external_agreement_no

    def validate(self):
        self.validate_required(self.alipay_user_id, 'alipay_user_id')
        self.validate_required(self.personal_product_code, 'personal_product_code')
        self.validate_required(self.sign_scene, 'sign_scene')
        self.validate_required(self.external_agreement_no, 'external_agreement_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.personal_product_code is not None:
            result['personal_product_code'] = self.personal_product_code
        if self.sign_scene is not None:
            result['sign_scene'] = self.sign_scene
        if self.external_agreement_no is not None:
            result['external_agreement_no'] = self.external_agreement_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('personal_product_code') is not None:
            self.personal_product_code = m.get('personal_product_code')
        if m.get('sign_scene') is not None:
            self.sign_scene = m.get('sign_scene')
        if m.get('external_agreement_no') is not None:
            self.external_agreement_no = m.get('external_agreement_no')
        return self


class UnbindBlockchainBotDigitalkeyWithholdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 明细返回码
        self.sub_code = sub_code
        # 明细返回码描述
        self.sub_msg = sub_msg

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
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        return self


class PayBlockchainBotDigitalkeyWithholdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_trade_no: str = None,
        subject: str = None,
        alipay_user_id: str = None,
        product_code: str = None,
        total_amount: int = None,
        deduct_permission: str = None,
        agreement_no: str = None,
        timeout_express: str = None,
        async_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户订单号，需要保证不重复
        self.out_trade_no = out_trade_no
        # 订单标题
        self.subject = subject
        # 签约时支付宝返回的用户ID
        self.alipay_user_id = alipay_user_id
        # 销售产品码，商户代扣场景固定为GENERAL_WITHHOLDING
        self.product_code = product_code
        # 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
        self.total_amount = total_amount
        # 商户代扣扣款许可
        self.deduct_permission = deduct_permission
        # 代扣协议号, 对应于签约时，支付宝返回的协议
        self.agreement_no = agreement_no
        # 该笔订单允许的最晚付款时间，逾期将关闭交易，超时关闭交易无法继续付款。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天 该参数数值不接受小数点， 如：1.5 h，可转换为 90m。
        self.timeout_express = timeout_express
        # 异步支付类型
        self.async_type = async_type

    def validate(self):
        self.validate_required(self.out_trade_no, 'out_trade_no')
        self.validate_required(self.subject, 'subject')
        self.validate_required(self.alipay_user_id, 'alipay_user_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.agreement_no, 'agreement_no')
        self.validate_required(self.async_type, 'async_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.out_trade_no is not None:
            result['out_trade_no'] = self.out_trade_no
        if self.subject is not None:
            result['subject'] = self.subject
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.deduct_permission is not None:
            result['deduct_permission'] = self.deduct_permission
        if self.agreement_no is not None:
            result['agreement_no'] = self.agreement_no
        if self.timeout_express is not None:
            result['timeout_express'] = self.timeout_express
        if self.async_type is not None:
            result['async_type'] = self.async_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_trade_no') is not None:
            self.out_trade_no = m.get('out_trade_no')
        if m.get('subject') is not None:
            self.subject = m.get('subject')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('deduct_permission') is not None:
            self.deduct_permission = m.get('deduct_permission')
        if m.get('agreement_no') is not None:
            self.agreement_no = m.get('agreement_no')
        if m.get('timeout_express') is not None:
            self.timeout_express = m.get('timeout_express')
        if m.get('async_type') is not None:
            self.async_type = m.get('async_type')
        return self


class PayBlockchainBotDigitalkeyWithholdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_msg: str = None,
        sub_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 明细返回码描述
        self.sub_msg = sub_msg
        # 明细返回码
        self.sub_code = sub_code

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
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        return self


class RefuseBlockchainBotDigitalkeyWithholdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_trade_no: str = None,
        refund_amount: int = None,
        out_request_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单支付时传入的商户订单号,不能和 trade_no同时为空。
        self.out_trade_no = out_trade_no
        # 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
        self.refund_amount = refund_amount
        # 标识一次退款请求，同一笔交易多次退款需要保证唯一。
        self.out_request_no = out_request_no

    def validate(self):
        self.validate_required(self.out_trade_no, 'out_trade_no')
        self.validate_required(self.refund_amount, 'refund_amount')
        self.validate_required(self.out_request_no, 'out_request_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.out_trade_no is not None:
            result['out_trade_no'] = self.out_trade_no
        if self.refund_amount is not None:
            result['refund_amount'] = self.refund_amount
        if self.out_request_no is not None:
            result['out_request_no'] = self.out_request_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_trade_no') is not None:
            self.out_trade_no = m.get('out_trade_no')
        if m.get('refund_amount') is not None:
            self.refund_amount = m.get('refund_amount')
        if m.get('out_request_no') is not None:
            self.out_request_no = m.get('out_request_no')
        return self


class RefuseBlockchainBotDigitalkeyWithholdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 明细返回码
        self.sub_code = sub_code
        # 明细返回码描述
        self.sub_msg = sub_msg
        # 退款返回信息
        self.data = data

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
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryBlockchainBotDigitalkeyWithholdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alipay_user_id: str = None,
        personal_product_code: str = None,
        sign_scene: str = None,
        external_agreement_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。
        self.alipay_user_id = alipay_user_id
        # 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
        self.personal_product_code = personal_product_code
        # 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
        self.sign_scene = sign_scene
        # 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
        self.external_agreement_no = external_agreement_no

    def validate(self):
        self.validate_required(self.alipay_user_id, 'alipay_user_id')
        self.validate_required(self.personal_product_code, 'personal_product_code')
        self.validate_required(self.sign_scene, 'sign_scene')
        self.validate_required(self.external_agreement_no, 'external_agreement_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.personal_product_code is not None:
            result['personal_product_code'] = self.personal_product_code
        if self.sign_scene is not None:
            result['sign_scene'] = self.sign_scene
        if self.external_agreement_no is not None:
            result['external_agreement_no'] = self.external_agreement_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('personal_product_code') is not None:
            self.personal_product_code = m.get('personal_product_code')
        if m.get('sign_scene') is not None:
            self.sign_scene = m.get('sign_scene')
        if m.get('external_agreement_no') is not None:
            self.external_agreement_no = m.get('external_agreement_no')
        return self


class QueryBlockchainBotDigitalkeyWithholdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 明细返回码
        self.sub_code = sub_code
        # 明细返回码描述
        self.sub_msg = sub_msg
        # 协议查询返回信息
        self.data = data

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
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CancelBlockchainBotDigitalkeyWithholdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_trade_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户传入外部交易订单号
        self.out_trade_no = out_trade_no

    def validate(self):
        self.validate_required(self.out_trade_no, 'out_trade_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.out_trade_no is not None:
            result['out_trade_no'] = self.out_trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_trade_no') is not None:
            self.out_trade_no = m.get('out_trade_no')
        return self


class CancelBlockchainBotDigitalkeyWithholdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 明细返回码
        self.sub_code = sub_code
        # 明细返回码描述
        self.sub_msg = sub_msg
        # 撤销返回信息
        self.data = data

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
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class NotifyBlockchainBotDigitalkeyWithholdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        out_request_no: str = None,
        total_amount: int = None,
        agreement_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户请求号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
        self.out_request_no = out_request_no
        # 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
        self.total_amount = total_amount
        # 代扣协议号, 对应于签约时，支付宝返回的协议
        self.agreement_no = agreement_no

    def validate(self):
        self.validate_required(self.out_request_no, 'out_request_no')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.agreement_no, 'agreement_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.out_request_no is not None:
            result['out_request_no'] = self.out_request_no
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.agreement_no is not None:
            result['agreement_no'] = self.agreement_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('out_request_no') is not None:
            self.out_request_no = m.get('out_request_no')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('agreement_no') is not None:
            self.agreement_no = m.get('agreement_no')
        return self


class NotifyBlockchainBotDigitalkeyWithholdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sub_code: str = None,
        sub_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 明细返回码
        self.sub_code = sub_code
        # 明细返回码描述
        self.sub_msg = sub_msg
        # 预通知返回内容
        self.data = data

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
        if self.sub_code is not None:
            result['sub_code'] = self.sub_code
        if self.sub_msg is not None:
            result['sub_msg'] = self.sub_msg
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sub_code') is not None:
            self.sub_code = m.get('sub_code')
        if m.get('sub_msg') is not None:
            self.sub_msg = m.get('sub_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


