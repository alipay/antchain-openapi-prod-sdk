# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List, BinaryIO


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


class BatchResult(TeaModel):
    def __init__(
        self,
        biz_no: str = None,
        biz_no_type: str = None,
        result: str = None,
        result_code: str = None,
    ):
        # 业务号
        self.biz_no = biz_no
        # 业务号类型
        self.biz_no_type = biz_no_type
        # 结果
        self.result = result
        # 结果码
        self.result_code = result_code

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        if self.biz_no is not None:
            self.validate_max_length(self.biz_no, 'biz_no', 64)
        self.validate_required(self.biz_no_type, 'biz_no_type')
        if self.biz_no_type is not None:
            self.validate_max_length(self.biz_no_type, 'biz_no_type', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.biz_no_type is not None:
            result['biz_no_type'] = self.biz_no_type
        if self.result is not None:
            result['result'] = self.result
        if self.result_code is not None:
            result['result_code'] = self.result_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('biz_no_type') is not None:
            self.biz_no_type = m.get('biz_no_type')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        return self


class TaskDetailResult(TeaModel):
    def __init__(
        self,
        total_count: int = None,
        success_count: int = None,
        fail_count: int = None,
        processing_count: int = None,
        error_info: str = None,
    ):
        # 总数量
        self.total_count = total_count
        # 成功数量
        self.success_count = success_count
        # 失败数量
        self.fail_count = fail_count
        # 处理中数量
        self.processing_count = processing_count
        # 当状态为无效时，显示具体的错误信息
        self.error_info = error_info

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.fail_count is not None:
            result['fail_count'] = self.fail_count
        if self.processing_count is not None:
            result['processing_count'] = self.processing_count
        if self.error_info is not None:
            result['error_info'] = self.error_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('fail_count') is not None:
            self.fail_count = m.get('fail_count')
        if m.get('processing_count') is not None:
            self.processing_count = m.get('processing_count')
        if m.get('error_info') is not None:
            self.error_info = m.get('error_info')
        return self


class Address(TeaModel):
    def __init__(
        self,
        city: str = None,
        district: str = None,
    ):
        # 市级
        self.city = city
        # 区、县级
        self.district = district

    def validate(self):
        self.validate_required(self.city, 'city')
        if self.city is not None:
            self.validate_max_length(self.city, 'city', 6)
        if self.district is not None:
            self.validate_max_length(self.district, 'district', 6)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.city is not None:
            result['city'] = self.city
        if self.district is not None:
            result['district'] = self.district
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('district') is not None:
            self.district = m.get('district')
        return self


class BizNoCondition(TeaModel):
    def __init__(
        self,
        dimension: str = None,
        value_scope: List[str] = None,
    ):
        # 枚举
        # CITY 城市
        # BLOCK 区县
        # AGE 年龄
        self.dimension = dimension
        # 枚举范围，每个维度的值是或的关系,需要校验场景和取值范围是否匹配
        # CITY:区划码
        # BLOCK:区划码（底包暂不支持）
        # AGE:30+、40+、50+（底包暂不支持
        self.value_scope = value_scope

    def validate(self):
        self.validate_required(self.dimension, 'dimension')
        self.validate_required(self.value_scope, 'value_scope')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.dimension is not None:
            result['dimension'] = self.dimension
        if self.value_scope is not None:
            result['value_scope'] = self.value_scope
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('dimension') is not None:
            self.dimension = m.get('dimension')
        if m.get('value_scope') is not None:
            self.value_scope = m.get('value_scope')
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


class JudgeCrowdPrefermentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        biz_no_type: str = None,
        encrypt_type: str = None,
        properties: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务号：可以标识用户的编码，例如手机号，身份证号等，通过业务号类型来控制，与biz_no_type和encrypt_type共同确定编码形式。
        self.biz_no = biz_no
        # 业务号类型：1-手机号，2-支付宝用户id
        self.biz_no_type = biz_no_type
        # 加密方式：0-不加密，1-SHA1，2-MD5
        self.encrypt_type = encrypt_type
        # json结构，可以传递自定义参数
        self.properties = properties

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.biz_no_type, 'biz_no_type')
        self.validate_required(self.encrypt_type, 'encrypt_type')
        if self.properties is not None:
            self.validate_max_length(self.properties, 'properties', 512)

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
        if self.biz_no_type is not None:
            result['biz_no_type'] = self.biz_no_type
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.properties is not None:
            result['properties'] = self.properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('biz_no_type') is not None:
            self.biz_no_type = m.get('biz_no_type')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
        return self


class JudgeCrowdPrefermentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        is_preferment: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否优待群体：YES-是，NO-否
        self.is_preferment = is_preferment

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
        if self.is_preferment is not None:
            result['is_preferment'] = self.is_preferment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('is_preferment') is not None:
            self.is_preferment = m.get('is_preferment')
        return self


class SubmitScenedataTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        biz_no_type: str = None,
        source_mark: str = None,
        expect_condition: List[BizNoCondition] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 约定的场景枚举
        self.scene = scene
        # 枚举
        # PHONE_SHA1
        # PHONE_MD5
        self.biz_no_type = biz_no_type
        # 适配客户的来源
        # 可能是客户的任务/AK
        self.source_mark = source_mark
        # 业务号预期条件
        self.expect_condition = expect_condition

    def validate(self):
        self.validate_required(self.scene, 'scene')
        if self.scene is not None:
            self.validate_max_length(self.scene, 'scene', 32)
        self.validate_required(self.biz_no_type, 'biz_no_type')
        if self.biz_no_type is not None:
            self.validate_max_length(self.biz_no_type, 'biz_no_type', 32)
        if self.source_mark is not None:
            self.validate_max_length(self.source_mark, 'source_mark', 32)
        if self.expect_condition:
            for k in self.expect_condition:
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
        if self.scene is not None:
            result['scene'] = self.scene
        if self.biz_no_type is not None:
            result['biz_no_type'] = self.biz_no_type
        if self.source_mark is not None:
            result['source_mark'] = self.source_mark
        result['expect_condition'] = []
        if self.expect_condition is not None:
            for k in self.expect_condition:
                result['expect_condition'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('biz_no_type') is not None:
            self.biz_no_type = m.get('biz_no_type')
        if m.get('source_mark') is not None:
            self.source_mark = m.get('source_mark')
        self.expect_condition = []
        if m.get('expect_condition') is not None:
            for k in m.get('expect_condition'):
                temp_model = BizNoCondition()
                self.expect_condition.append(temp_model.from_map(k))
        return self


class SubmitScenedataTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        batch_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建任务成功后，返回批次号
        self.batch_no = batch_no

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
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        return self


class UploadScenedataFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_no: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批次号
        self.batch_no = batch_no
        # 文件参数
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.batch_no, 'batch_no')
        if self.batch_no is not None:
            self.validate_max_length(self.batch_no, 'batch_no', 64)
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
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadScenedataFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # batchNo对应的任务状态，上传后，返回RECEIVED
        self.status = status

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
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class BatchqueryScenedataTaskresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_no: str = None,
        cursor: str = None,
        sync_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批次号
        self.batch_no = batch_no
        # 游标，上一次的最后一条
        self.cursor = cursor
        # 本次同步数量
        self.sync_num = sync_num

    def validate(self):
        self.validate_required(self.batch_no, 'batch_no')
        if self.batch_no is not None:
            self.validate_max_length(self.batch_no, 'batch_no', 64)
        if self.cursor is not None:
            self.validate_max_length(self.cursor, 'cursor', 256)
        if self.sync_num is not None:
            self.validate_maximum(self.sync_num, 'sync_num', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        if self.cursor is not None:
            result['cursor'] = self.cursor
        if self.sync_num is not None:
            result['sync_num'] = self.sync_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('cursor') is not None:
            self.cursor = m.get('cursor')
        if m.get('sync_num') is not None:
            self.sync_num = m.get('sync_num')
        return self


class BatchqueryScenedataTaskresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sync_status: str = None,
        last_cursor: str = None,
        result_list: List[BatchResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 0-未开始
        # 1-可继续
        # 2-结束
        self.sync_status = sync_status
        # 本次的最后一个游标，保存起来下一次使用
        self.last_cursor = last_cursor
        # 结果列表
        self.result_list = result_list

    def validate(self):
        if self.result_list:
            for k in self.result_list:
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
        if self.sync_status is not None:
            result['sync_status'] = self.sync_status
        if self.last_cursor is not None:
            result['last_cursor'] = self.last_cursor
        result['result_list'] = []
        if self.result_list is not None:
            for k in self.result_list:
                result['result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sync_status') is not None:
            self.sync_status = m.get('sync_status')
        if m.get('last_cursor') is not None:
            self.last_cursor = m.get('last_cursor')
        self.result_list = []
        if m.get('result_list') is not None:
            for k in m.get('result_list'):
                temp_model = BatchResult()
                self.result_list.append(temp_model.from_map(k))
        return self


class QueryScenedataOnlineRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        biz_no_type: str = None,
        scene: str = None,
        source_mark: str = None,
        condition: BizNoCondition = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务号，根据biz_no_type修改类型
        self.biz_no = biz_no
        # 业务号类型
        self.biz_no_type = biz_no_type
        # 场景，根据此参数路由适配到不同数据源
        self.scene = scene
        # 来源标识
        self.source_mark = source_mark
        # 条件，目前只支持IN的逻辑
        self.condition = condition

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        if self.biz_no is not None:
            self.validate_max_length(self.biz_no, 'biz_no', 256)
        self.validate_required(self.biz_no_type, 'biz_no_type')
        if self.biz_no_type is not None:
            self.validate_max_length(self.biz_no_type, 'biz_no_type', 64)
        self.validate_required(self.scene, 'scene')
        if self.scene is not None:
            self.validate_max_length(self.scene, 'scene', 32)
        if self.source_mark is not None:
            self.validate_max_length(self.source_mark, 'source_mark', 32)
        if self.condition:
            self.condition.validate()

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
        if self.biz_no_type is not None:
            result['biz_no_type'] = self.biz_no_type
        if self.scene is not None:
            result['scene'] = self.scene
        if self.source_mark is not None:
            result['source_mark'] = self.source_mark
        if self.condition is not None:
            result['condition'] = self.condition.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('biz_no_type') is not None:
            self.biz_no_type = m.get('biz_no_type')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('source_mark') is not None:
            self.source_mark = m.get('source_mark')
        if m.get('condition') is not None:
            temp_model = BizNoCondition()
            self.condition = temp_model.from_map(m['condition'])
        return self


class QueryScenedataOnlineResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果字段，可以是Y/程度值/自定义加密串
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryScenedataTaskinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批次号
        self.batch_no = batch_no

    def validate(self):
        self.validate_required(self.batch_no, 'batch_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        return self


class QueryScenedataTaskinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_status: str = None,
        biz_date: str = None,
        scene: str = None,
        task_type: str = None,
        tenant_id: str = None,
        source_mark: str = None,
        create_time: str = None,
        result: TaskDetailResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -1-无效，0-待处理，1-处理中，2-处理完成
        self.task_status = task_status
        # 业务日期
        self.biz_date = biz_date
        # 场景
        self.scene = scene
        # 任务类型
        self.task_type = task_type
        # 批次所属租户id
        self.tenant_id = tenant_id
        # 来源标识
        self.source_mark = source_mark
        # 任务创建时间
        self.create_time = create_time
        # 批次统计结果信息
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

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
        if self.task_status is not None:
            result['task_status'] = self.task_status
        if self.biz_date is not None:
            result['biz_date'] = self.biz_date
        if self.scene is not None:
            result['scene'] = self.scene
        if self.task_type is not None:
            result['task_type'] = self.task_type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.source_mark is not None:
            result['source_mark'] = self.source_mark
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_status') is not None:
            self.task_status = m.get('task_status')
        if m.get('biz_date') is not None:
            self.biz_date = m.get('biz_date')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('task_type') is not None:
            self.task_type = m.get('task_type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('source_mark') is not None:
            self.source_mark = m.get('source_mark')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('result') is not None:
            temp_model = TaskDetailResult()
            self.result = temp_model.from_map(m['result'])
        return self


class CreateAntcloudGatewayxFileUploadRequest(TeaModel):
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


class CreateAntcloudGatewayxFileUploadResponse(TeaModel):
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


