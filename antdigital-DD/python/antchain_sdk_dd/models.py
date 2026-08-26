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


class NameValuePair(TeaModel):
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


class QueryMap(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: List[NameValuePair] = None,
    ):
        # 键值
        self.name = name
        # 额外用户信息
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.value:
            for k in self.value:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        result['value'] = []
        if self.value is not None:
            for k in self.value:
                result['value'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        self.value = []
        if m.get('value') is not None:
            for k in m.get('value'):
                temp_model = NameValuePair()
                self.value.append(temp_model.from_map(k))
        return self


class Host(TeaModel):
    def __init__(
        self,
        system_name: str = None,
        address: str = None,
    ):
        # test_2e1ae924805f
        self.system_name = system_name
        # 地址
        self.address = address

    def validate(self):
        self.validate_required(self.system_name, 'system_name')
        self.validate_required(self.address, 'address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.system_name is not None:
            result['system_name'] = self.system_name
        if self.address is not None:
            result['address'] = self.address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('system_name') is not None:
            self.system_name = m.get('system_name')
        if m.get('address') is not None:
            self.address = m.get('address')
        return self


class AnotherClass(TeaModel):
    def __init__(
        self,
        bar: str = None,
        ref: QueryMap = None,
        new_struct: str = None,
    ):
        # 测试字段
        self.bar = bar
        # 引用字段
        self.ref = ref
        # 新增结构体
        self.new_struct = new_struct

    def validate(self):
        self.validate_required(self.bar, 'bar')
        self.validate_required(self.ref, 'ref')
        if self.ref:
            self.ref.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bar is not None:
            result['bar'] = self.bar
        if self.ref is not None:
            result['ref'] = self.ref.to_map()
        if self.new_struct is not None:
            result['new_struct'] = self.new_struct
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bar') is not None:
            self.bar = m.get('bar')
        if m.get('ref') is not None:
            temp_model = QueryMap()
            self.ref = temp_model.from_map(m['ref'])
        if m.get('new_struct') is not None:
            self.new_struct = m.get('new_struct')
        return self


class Identity(TeaModel):
    def __init__(
        self,
        ak: str = None,
    ):
        # ak
        self.ak = ak

    def validate(self):
        self.validate_required(self.ak, 'ak')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ak is not None:
            result['ak'] = self.ak
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ak') is not None:
            self.ak = m.get('ak')
        return self


class SCRealEstateQueryResponseData(TeaModel):
    def __init__(
        self,
        area_code: str = None,
        area_name: str = None,
        bdcdyh: str = None,
        bdcqzh: str = None,
        djsj: str = None,
        fwyt_1: str = None,
        gyqk: str = None,
        qllx: str = None,
        qlrmc: str = None,
        scjzmj: str = None,
    ):
        # area_code
        self.area_code = area_code
        # area_name
        self.area_name = area_name
        # bdcdyh
        self.bdcdyh = bdcdyh
        # bdcqzh
        self.bdcqzh = bdcqzh
        # djsj
        self.djsj = djsj
        # fwyt1
        self.fwyt_1 = fwyt_1
        # gyqk
        self.gyqk = gyqk
        # qllx
        self.qllx = qllx
        # qlrmc
        self.qlrmc = qlrmc
        # scjzmj
        self.scjzmj = scjzmj

    def validate(self):
        self.validate_required(self.area_code, 'area_code')
        self.validate_required(self.area_name, 'area_name')
        self.validate_required(self.bdcdyh, 'bdcdyh')
        self.validate_required(self.bdcqzh, 'bdcqzh')
        self.validate_required(self.djsj, 'djsj')
        self.validate_required(self.fwyt_1, 'fwyt_1')
        self.validate_required(self.gyqk, 'gyqk')
        self.validate_required(self.qllx, 'qllx')
        self.validate_required(self.qlrmc, 'qlrmc')
        self.validate_required(self.scjzmj, 'scjzmj')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.area_code is not None:
            result['area_code'] = self.area_code
        if self.area_name is not None:
            result['area_name'] = self.area_name
        if self.bdcdyh is not None:
            result['bdcdyh'] = self.bdcdyh
        if self.bdcqzh is not None:
            result['bdcqzh'] = self.bdcqzh
        if self.djsj is not None:
            result['djsj'] = self.djsj
        if self.fwyt_1 is not None:
            result['fwyt1'] = self.fwyt_1
        if self.gyqk is not None:
            result['gyqk'] = self.gyqk
        if self.qllx is not None:
            result['qllx'] = self.qllx
        if self.qlrmc is not None:
            result['qlrmc'] = self.qlrmc
        if self.scjzmj is not None:
            result['scjzmj'] = self.scjzmj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('area_code') is not None:
            self.area_code = m.get('area_code')
        if m.get('area_name') is not None:
            self.area_name = m.get('area_name')
        if m.get('bdcdyh') is not None:
            self.bdcdyh = m.get('bdcdyh')
        if m.get('bdcqzh') is not None:
            self.bdcqzh = m.get('bdcqzh')
        if m.get('djsj') is not None:
            self.djsj = m.get('djsj')
        if m.get('fwyt1') is not None:
            self.fwyt_1 = m.get('fwyt1')
        if m.get('gyqk') is not None:
            self.gyqk = m.get('gyqk')
        if m.get('qllx') is not None:
            self.qllx = m.get('qllx')
        if m.get('qlrmc') is not None:
            self.qlrmc = m.get('qlrmc')
        if m.get('scjzmj') is not None:
            self.scjzmj = m.get('scjzmj')
        return self


class Header(TeaModel):
    def __init__(
        self,
        identity: Identity = None,
        trace_id: str = None,
        host: Host = None,
        direction: str = None,
        request_type: str = None,
        protocol_version: str = None,
    ):
        # 身份信息
        self.identity = identity
        # 调用链编号
        self.trace_id = trace_id
        # host信息
        self.host = host
        # 方向
        self.direction = direction
        # 请求类型
        self.request_type = request_type
        # 协议版本
        self.protocol_version = protocol_version

    def validate(self):
        self.validate_required(self.identity, 'identity')
        if self.identity:
            self.identity.validate()
        self.validate_required(self.trace_id, 'trace_id')
        self.validate_required(self.host, 'host')
        if self.host:
            self.host.validate()
        self.validate_required(self.direction, 'direction')
        self.validate_required(self.request_type, 'request_type')
        self.validate_required(self.protocol_version, 'protocol_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.identity is not None:
            result['identity'] = self.identity.to_map()
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.host is not None:
            result['host'] = self.host.to_map()
        if self.direction is not None:
            result['direction'] = self.direction
        if self.request_type is not None:
            result['request_type'] = self.request_type
        if self.protocol_version is not None:
            result['protocol_version'] = self.protocol_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identity') is not None:
            temp_model = Identity()
            self.identity = temp_model.from_map(m['identity'])
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('host') is not None:
            temp_model = Host()
            self.host = temp_model.from_map(m['host'])
        if m.get('direction') is not None:
            self.direction = m.get('direction')
        if m.get('request_type') is not None:
            self.request_type = m.get('request_type')
        if m.get('protocol_version') is not None:
            self.protocol_version = m.get('protocol_version')
        return self


class RouteCondition(TeaModel):
    def __init__(
        self,
        channel_id: str = None,
    ):
        # 渠道编号
        self.channel_id = channel_id

    def validate(self):
        self.validate_required(self.channel_id, 'channel_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.channel_id is not None:
            result['channel_id'] = self.channel_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('channel_id') is not None:
            self.channel_id = m.get('channel_id')
        return self


class OrderDetail(TeaModel):
    def __init__(
        self,
        item_name: str = None,
        quantity: int = None,
        price: int = None,
    ):
        # 商品名称
        self.item_name = item_name
        # 数量
        self.quantity = quantity
        # 单价
        self.price = price

    def validate(self):
        self.validate_required(self.item_name, 'item_name')
        self.validate_required(self.quantity, 'quantity')
        self.validate_required(self.price, 'price')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.item_name is not None:
            result['item_name'] = self.item_name
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.price is not None:
            result['price'] = self.price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('item_name') is not None:
            self.item_name = m.get('item_name')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('price') is not None:
            self.price = m.get('price')
        return self


class SCRealEstateQueryBody(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        return self


class DemoClass(TeaModel):
    def __init__(
        self,
        some_string: str = None,
        some_date: str = None,
        some_boolean: bool = None,
        some_int: int = None,
        some_struct: AnotherClass = None,
    ):
        # 字符串测试
        self.some_string = some_string
        # 日期测试
        self.some_date = some_date
        # Boolean测试
        self.some_boolean = some_boolean
        # 整数测试
        self.some_int = some_int
        # 结构体字段
        self.some_struct = some_struct

    def validate(self):
        self.validate_required(self.some_string, 'some_string')
        self.validate_required(self.some_date, 'some_date')
        if self.some_date is not None:
            self.validate_pattern(self.some_date, 'some_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.some_boolean, 'some_boolean')
        self.validate_required(self.some_int, 'some_int')
        self.validate_required(self.some_struct, 'some_struct')
        if self.some_struct:
            self.some_struct.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.some_string is not None:
            result['some_string'] = self.some_string
        if self.some_date is not None:
            result['some_date'] = self.some_date
        if self.some_boolean is not None:
            result['some_boolean'] = self.some_boolean
        if self.some_int is not None:
            result['some_int'] = self.some_int
        if self.some_struct is not None:
            result['some_struct'] = self.some_struct.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('some_string') is not None:
            self.some_string = m.get('some_string')
        if m.get('some_date') is not None:
            self.some_date = m.get('some_date')
        if m.get('some_boolean') is not None:
            self.some_boolean = m.get('some_boolean')
        if m.get('some_int') is not None:
            self.some_int = m.get('some_int')
        if m.get('some_struct') is not None:
            temp_model = AnotherClass()
            self.some_struct = temp_model.from_map(m['some_struct'])
        return self


class CardInfos(TeaModel):
    def __init__(
        self,
        domian_info: Identity = None,
        test: str = None,
    ):
        # x
        self.domian_info = domian_info
        # 12
        self.test = test

    def validate(self):
        self.validate_required(self.domian_info, 'domian_info')
        if self.domian_info:
            self.domian_info.validate()
        self.validate_required(self.test, 'test')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.domian_info is not None:
            result['domian_info'] = self.domian_info.to_map()
        if self.test is not None:
            result['test'] = self.test
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('domian_info') is not None:
            temp_model = Identity()
            self.domian_info = temp_model.from_map(m['domian_info'])
        if m.get('test') is not None:
            self.test = m.get('test')
        return self


class SCRealEstateQueryRequestPayload(TeaModel):
    def __init__(
        self,
        xm: str = None,
        sfz: str = None,
    ):
        # xm
        self.xm = xm
        # sfz
        self.sfz = sfz

    def validate(self):
        self.validate_required(self.xm, 'xm')
        self.validate_required(self.sfz, 'sfz')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.xm is not None:
            result['xm'] = self.xm
        if self.sfz is not None:
            result['sfz'] = self.sfz
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('xm') is not None:
            self.xm = m.get('xm')
        if m.get('sfz') is not None:
            self.sfz = m.get('sfz')
        return self


class Cmd(TeaModel):
    def __init__(
        self,
        cmd_code: str = None,
        version: str = None,
    ):
        # cmd编码
        self.cmd_code = cmd_code
        # 版本号
        self.version = version

    def validate(self):
        self.validate_required(self.cmd_code, 'cmd_code')
        self.validate_required(self.version, 'version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cmd_code is not None:
            result['cmd_code'] = self.cmd_code
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cmd_code') is not None:
            self.cmd_code = m.get('cmd_code')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class ATest(TeaModel):
    def __init__(
        self,
        datay: str = None,
    ):
        # cc
        self.datay = datay

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.datay is not None:
            result['datay'] = self.datay
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('datay') is not None:
            self.datay = m.get('datay')
        return self


class SCRealEstateQueryResponsePayload(TeaModel):
    def __init__(
        self,
        code: str = None,
        data: List[SCRealEstateQueryResponseData] = None,
        uuid: str = None,
        ret_msg: str = None,
    ):
        # code
        self.code = code
        # data
        self.data = data
        # uuid
        self.uuid = uuid
        # ret_msg
        self.ret_msg = ret_msg

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.data, 'data')
        if self.data:
            for k in self.data:
                if k:
                    k.validate()
        self.validate_required(self.uuid, 'uuid')
        self.validate_required(self.ret_msg, 'ret_msg')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.uuid is not None:
            result['uuid'] = self.uuid
        if self.ret_msg is not None:
            result['ret_msg'] = self.ret_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = SCRealEstateQueryResponseData()
                self.data.append(temp_model.from_map(k))
        if m.get('uuid') is not None:
            self.uuid = m.get('uuid')
        if m.get('ret_msg') is not None:
            self.ret_msg = m.get('ret_msg')
        return self


class Map(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # 键
        self.key = key
        # 值
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class FaceImage(TeaModel):
    def __init__(
        self,
        content: str = None,
        rect: str = None,
    ):
        # 123
        self.content = content
        # 213
        self.rect = rect

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content is not None:
            result['content'] = self.content
        if self.rect is not None:
            result['rect'] = self.rect
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('rect') is not None:
            self.rect = m.get('rect')
        return self


class SCRealEstateQueryInvokerRequest(TeaModel):
    def __init__(
        self,
        header: Header = None,
        body: SCRealEstateQueryBody = None,
    ):
        # header
        self.header = header
        # body
        self.body = body

    def validate(self):
        self.validate_required(self.header, 'header')
        if self.header:
            self.header.validate()
        self.validate_required(self.body, 'body')
        if self.body:
            self.body.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.header is not None:
            result['header'] = self.header.to_map()
        if self.body is not None:
            result['body'] = self.body.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('header') is not None:
            temp_model = Header()
            self.header = temp_model.from_map(m['header'])
        if m.get('body') is not None:
            temp_model = SCRealEstateQueryBody()
            self.body = temp_model.from_map(m['body'])
        return self


class OrderDTO(TeaModel):
    def __init__(
        self,
        order_no: str = None,
        status: str = None,
    ):
        # 订单编号
        self.order_no = order_no
        # 状态
        self.status = status

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class OrderItem(TeaModel):
    def __init__(
        self,
        item_id: str = None,
        quantity: int = None,
    ):
        # 商品ID
        self.item_id = item_id
        # 数量
        self.quantity = quantity

    def validate(self):
        self.validate_required(self.item_id, 'item_id')
        self.validate_required(self.quantity, 'quantity')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.item_id is not None:
            result['item_id'] = self.item_id
        if self.quantity is not None:
            result['quantity'] = self.quantity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('item_id') is not None:
            self.item_id = m.get('item_id')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        return self


class RiskFactorDetail(TeaModel):
    def __init__(
        self,
        factor_type: str = None,
        score: int = None,
        evidence: List[str] = None,
    ):
        # 风险评估因子类型
        self.factor_type = factor_type
        # 分数
        self.score = score
        # 风险事件
        self.evidence = evidence

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.factor_type is not None:
            result['factor_type'] = self.factor_type
        if self.score is not None:
            result['score'] = self.score
        if self.evidence is not None:
            result['evidence'] = self.evidence
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('factor_type') is not None:
            self.factor_type = m.get('factor_type')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('evidence') is not None:
            self.evidence = m.get('evidence')
        return self


class ShangHaiTest(TeaModel):
    def __init__(
        self,
        param_1: str = None,
        param_2: int = None,
    ):
        # string
        self.param_1 = param_1
        # number
        self.param_2 = param_2

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.param_1 is not None:
            result['param_1'] = self.param_1
        if self.param_2 is not None:
            result['param_2'] = self.param_2
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('param_1') is not None:
            self.param_1 = m.get('param_1')
        if m.get('param_2') is not None:
            self.param_2 = m.get('param_2')
        return self


class InitPack(TeaModel):
    def __init__(
        self,
        time: str = None,
        operator: str = None,
        count: int = None,
    ):
        # 返回接收到请求的当前时间
        self.time = time
        # 操作人
        self.operator = operator
        # 请求编号
        self.count = count

    def validate(self):
        self.validate_required(self.time, 'time')
        self.validate_required(self.operator, 'operator')
        self.validate_required(self.count, 'count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.time is not None:
            result['time'] = self.time
        if self.operator is not None:
            result['operator'] = self.operator
        if self.count is not None:
            result['count'] = self.count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('count') is not None:
            self.count = m.get('count')
        return self


class TransactionDetails(TeaModel):
    def __init__(
        self,
        amount: int = None,
        currency: str = None,
        channel: str = None,
        location: str = None,
        time: str = None,
    ):
        # 金额
        self.amount = amount
        # 币种
        self.currency = currency
        # 渠道
        self.channel = channel
        # 地址
        self.location = location
        # 时间
        self.time = time

    def validate(self):
        if self.time is not None:
            self.validate_pattern(self.time, 'time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.amount is not None:
            result['amount'] = self.amount
        if self.currency is not None:
            result['currency'] = self.currency
        if self.channel is not None:
            result['channel'] = self.channel
        if self.location is not None:
            result['location'] = self.location
        if self.time is not None:
            result['time'] = self.time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('time') is not None:
            self.time = m.get('time')
        return self


class OrderInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        amount: int = None,
        detail: OrderDetail = None,
    ):
        # 订单号
        self.order_id = order_id
        # 金额
        self.amount = amount
        # 详情
        self.detail = detail

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.amount, 'amount')
        if self.detail:
            self.detail.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.amount is not None:
            result['amount'] = self.amount
        if self.detail is not None:
            result['detail'] = self.detail.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('detail') is not None:
            temp_model = OrderDetail()
            self.detail = temp_model.from_map(m['detail'])
        return self


class NumberTest(TeaModel):
    def __init__(
        self,
        parameter_1: int = None,
        parameter_2: int = None,
        parameter_3: int = None,
        parameter_4: int = None,
        parameter_5: DemoClass = None,
    ):
        # 1
        self.parameter_1 = parameter_1
        # 2
        self.parameter_2 = parameter_2
        # 3
        self.parameter_3 = parameter_3
        # 4
        self.parameter_4 = parameter_4
        # 5
        self.parameter_5 = parameter_5

    def validate(self):
        self.validate_required(self.parameter_1, 'parameter_1')
        if self.parameter_1 is not None:
            self.validate_maximum(self.parameter_1, 'parameter_1', 5)
            self.validate_minimum(self.parameter_1, 'parameter_1', 1)
        self.validate_required(self.parameter_2, 'parameter_2')
        if self.parameter_2 is not None:
            self.validate_maximum(self.parameter_2, 'parameter_2', 5)
            self.validate_minimum(self.parameter_2, 'parameter_2', 1)
        self.validate_required(self.parameter_3, 'parameter_3')
        if self.parameter_3 is not None:
            self.validate_maximum(self.parameter_3, 'parameter_3', 5)
            self.validate_minimum(self.parameter_3, 'parameter_3', 1)
        self.validate_required(self.parameter_4, 'parameter_4')
        if self.parameter_4 is not None:
            self.validate_maximum(self.parameter_4, 'parameter_4', 5)
            self.validate_minimum(self.parameter_4, 'parameter_4', 1)
        self.validate_required(self.parameter_5, 'parameter_5')
        if self.parameter_5:
            self.parameter_5.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.parameter_1 is not None:
            result['parameter_1'] = self.parameter_1
        if self.parameter_2 is not None:
            result['parameter_2'] = self.parameter_2
        if self.parameter_3 is not None:
            result['parameter_3'] = self.parameter_3
        if self.parameter_4 is not None:
            result['parameter_4'] = self.parameter_4
        if self.parameter_5 is not None:
            result['parameter_5'] = self.parameter_5.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('parameter_1') is not None:
            self.parameter_1 = m.get('parameter_1')
        if m.get('parameter_2') is not None:
            self.parameter_2 = m.get('parameter_2')
        if m.get('parameter_3') is not None:
            self.parameter_3 = m.get('parameter_3')
        if m.get('parameter_4') is not None:
            self.parameter_4 = m.get('parameter_4')
        if m.get('parameter_5') is not None:
            temp_model = DemoClass()
            self.parameter_5 = temp_model.from_map(m['parameter_5'])
        return self


class TestClass(TeaModel):
    def __init__(
        self,
        string_param: str = None,
        number_param: int = None,
        boolean_param: bool = None,
        date_param: str = None,
        array_param: List[str] = None,
        struct_param: DemoClass = None,
    ):
        # 字符串字段
        self.string_param = string_param
        # 数字字段
        self.number_param = number_param
        # 布尔值参数
        self.boolean_param = boolean_param
        # 日期参数
        self.date_param = date_param
        # 数组参数
        self.array_param = array_param
        # 结构体参数
        self.struct_param = struct_param

    def validate(self):
        self.validate_required(self.string_param, 'string_param')
        self.validate_required(self.number_param, 'number_param')
        self.validate_required(self.boolean_param, 'boolean_param')
        self.validate_required(self.date_param, 'date_param')
        if self.date_param is not None:
            self.validate_pattern(self.date_param, 'date_param', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.array_param, 'array_param')
        self.validate_required(self.struct_param, 'struct_param')
        if self.struct_param:
            self.struct_param.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.string_param is not None:
            result['string_param'] = self.string_param
        if self.number_param is not None:
            result['number_param'] = self.number_param
        if self.boolean_param is not None:
            result['boolean_param'] = self.boolean_param
        if self.date_param is not None:
            result['date_param'] = self.date_param
        if self.array_param is not None:
            result['array_param'] = self.array_param
        if self.struct_param is not None:
            result['struct_param'] = self.struct_param.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('string_param') is not None:
            self.string_param = m.get('string_param')
        if m.get('number_param') is not None:
            self.number_param = m.get('number_param')
        if m.get('boolean_param') is not None:
            self.boolean_param = m.get('boolean_param')
        if m.get('date_param') is not None:
            self.date_param = m.get('date_param')
        if m.get('array_param') is not None:
            self.array_param = m.get('array_param')
        if m.get('struct_param') is not None:
            temp_model = DemoClass()
            self.struct_param = temp_model.from_map(m['struct_param'])
        return self


class TestStruct(TeaModel):
    def __init__(
        self,
        x: str = None,
        y: DemoClass = None,
        z: List[DemoClass] = None,
    ):
        # x
        self.x = x
        # y
        self.y = y
        # z
        self.z = z

    def validate(self):
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')
        if self.y:
            self.y.validate()
        self.validate_required(self.z, 'z')
        if self.z:
            for k in self.z:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.x is not None:
            result['x'] = self.x
        if self.y is not None:
            result['y'] = self.y.to_map()
        result['z'] = []
        if self.z is not None:
            for k in self.z:
                result['z'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('x') is not None:
            self.x = m.get('x')
        if m.get('y') is not None:
            temp_model = DemoClass()
            self.y = temp_model.from_map(m['y'])
        self.z = []
        if m.get('z') is not None:
            for k in m.get('z'):
                temp_model = DemoClass()
                self.z.append(temp_model.from_map(k))
        return self


class CardInfo(TeaModel):
    def __init__(
        self,
        demo_info: DemoClass = None,
        name: str = None,
    ):
        # 1
        self.demo_info = demo_info
        # 测试
        self.name = name

    def validate(self):
        self.validate_required(self.demo_info, 'demo_info')
        if self.demo_info:
            self.demo_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.demo_info is not None:
            result['demo_info'] = self.demo_info.to_map()
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('demo_info') is not None:
            temp_model = DemoClass()
            self.demo_info = temp_model.from_map(m['demo_info'])
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class TestObject(TeaModel):
    def __init__(
        self,
        id: int = None,
        name: str = None,
    ):
        # 主键
        self.id = id
        # 名称
        self.name = name

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class DemoTestx(TeaModel):
    def __init__(
        self,
        ability_id: str = None,
    ):
        # ability_id
        self.ability_id = ability_id

    def validate(self):
        self.validate_required(self.ability_id, 'ability_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ability_id is not None:
            result['ability_id'] = self.ability_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ability_id') is not None:
            self.ability_id = m.get('ability_id')
        return self


class AutoCodeModel(TeaModel):
    def __init__(
        self,
        model_string_param: str = None,
        model_date_param: str = None,
        model_array_param: List[str] = None,
    ):
        # 111
        self.model_string_param = model_string_param
        # 111
        self.model_date_param = model_date_param
        # 111
        self.model_array_param = model_array_param

    def validate(self):
        self.validate_required(self.model_string_param, 'model_string_param')
        self.validate_required(self.model_date_param, 'model_date_param')
        if self.model_date_param is not None:
            self.validate_pattern(self.model_date_param, 'model_date_param', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.model_array_param, 'model_array_param')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model_string_param is not None:
            result['model_string_param'] = self.model_string_param
        if self.model_date_param is not None:
            result['model_date_param'] = self.model_date_param
        if self.model_array_param is not None:
            result['model_array_param'] = self.model_array_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model_string_param') is not None:
            self.model_string_param = m.get('model_string_param')
        if m.get('model_date_param') is not None:
            self.model_date_param = m.get('model_date_param')
        if m.get('model_array_param') is not None:
            self.model_array_param = m.get('model_array_param')
        return self


class SCRealEstateQueryRequestBody(TeaModel):
    def __init__(
        self,
        cmd: Cmd = None,
        route_condition: RouteCondition = None,
        request_id: str = None,
        payload: SCRealEstateQueryRequestPayload = None,
    ):
        # cmd
        self.cmd = cmd
        # 路由信息
        self.route_condition = route_condition
        # requestId
        self.request_id = request_id
        # payload
        self.payload = payload

    def validate(self):
        self.validate_required(self.cmd, 'cmd')
        if self.cmd:
            self.cmd.validate()
        self.validate_required(self.route_condition, 'route_condition')
        if self.route_condition:
            self.route_condition.validate()
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.payload, 'payload')
        if self.payload:
            self.payload.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cmd is not None:
            result['cmd'] = self.cmd.to_map()
        if self.route_condition is not None:
            result['route_condition'] = self.route_condition.to_map()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.payload is not None:
            result['payload'] = self.payload.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cmd') is not None:
            temp_model = Cmd()
            self.cmd = temp_model.from_map(m['cmd'])
        if m.get('route_condition') is not None:
            temp_model = RouteCondition()
            self.route_condition = temp_model.from_map(m['route_condition'])
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('payload') is not None:
            temp_model = SCRealEstateQueryRequestPayload()
            self.payload = temp_model.from_map(m['payload'])
        return self


class DemoT(TeaModel):
    def __init__(
        self,
        timeout: str = None,
    ):
        # 1
        self.timeout = timeout

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class TestStrcuct(TeaModel):
    def __init__(
        self,
        name: str = None,
    ):
        # ss
        self.name = name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class NestModel(TeaModel):
    def __init__(
        self,
        a: str = None,
    ):
        # aaaa
        self.a = a

    def validate(self):
        self.validate_required(self.a, 'a')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.a is not None:
            result['a'] = self.a
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('a') is not None:
            self.a = m.get('a')
        return self


class Btest(TeaModel):
    def __init__(
        self,
        atest: ATest = None,
    ):
        # atest
        self.atest = atest

    def validate(self):
        self.validate_required(self.atest, 'atest')
        if self.atest:
            self.atest.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.atest is not None:
            result['atest'] = self.atest.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('atest') is not None:
            temp_model = ATest()
            self.atest = temp_model.from_map(m['atest'])
        return self


class TestAPIObject(TeaModel):
    def __init__(
        self,
        id: int = None,
    ):
        # test
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class SCRealEstateQueryResponseBody(TeaModel):
    def __init__(
        self,
        cost: int = None,
        response_status: str = None,
        response_code: str = None,
        request_id: str = None,
        payload: SCRealEstateQueryResponsePayload = None,
    ):
        # cost
        self.cost = cost
        # response_status
        self.response_status = response_status
        # response_code
        self.response_code = response_code
        # request_id
        self.request_id = request_id
        # payload
        self.payload = payload

    def validate(self):
        self.validate_required(self.cost, 'cost')
        self.validate_required(self.response_status, 'response_status')
        self.validate_required(self.response_code, 'response_code')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.payload, 'payload')
        if self.payload:
            self.payload.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cost is not None:
            result['cost'] = self.cost
        if self.response_status is not None:
            result['response_status'] = self.response_status
        if self.response_code is not None:
            result['response_code'] = self.response_code
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.payload is not None:
            result['payload'] = self.payload.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cost') is not None:
            self.cost = m.get('cost')
        if m.get('response_status') is not None:
            self.response_status = m.get('response_status')
        if m.get('response_code') is not None:
            self.response_code = m.get('response_code')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('payload') is not None:
            temp_model = SCRealEstateQueryResponsePayload()
            self.payload = temp_model.from_map(m['payload'])
        return self


class UserProfile(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        id_number: str = None,
        mobile: str = None,
        age: int = None,
        credit_score: int = None,
    ):
        # 用户ID
        self.user_id = user_id
        # 用户身份证号
        self.id_number = id_number
        # 手机号
        self.mobile = mobile
        # 年龄
        self.age = age
        # 信用评分
        self.credit_score = credit_score

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.age is not None:
            result['age'] = self.age
        if self.credit_score is not None:
            result['credit_score'] = self.credit_score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('age') is not None:
            self.age = m.get('age')
        if m.get('credit_score') is not None:
            self.credit_score = m.get('credit_score')
        return self


class PersonInfo(TeaModel):
    def __init__(
        self,
        card_infos: CardInfos = None,
        name: str = None,
    ):
        # 1
        self.card_infos = card_infos
        # 123
        self.name = name

    def validate(self):
        self.validate_required(self.card_infos, 'card_infos')
        if self.card_infos:
            self.card_infos.validate()
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.card_infos is not None:
            result['card_infos'] = self.card_infos.to_map()
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('card_infos') is not None:
            temp_model = CardInfos()
            self.card_infos = temp_model.from_map(m['card_infos'])
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class A(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        return self


class TestA(TeaModel):
    def __init__(
        self,
        parameter_1: str = None,
        parameter_2: str = None,
        parameter_3: str = None,
        parameter_4: str = None,
        parameter_5: str = None,
        parameter_6: str = None,
        parameter_7: str = None,
        parameter_8: str = None,
        parameter_9: str = None,
        parameter_10: str = None,
    ):
        # 1
        self.parameter_1 = parameter_1
        # 2
        self.parameter_2 = parameter_2
        # 3
        self.parameter_3 = parameter_3
        # 4
        self.parameter_4 = parameter_4
        # 5
        self.parameter_5 = parameter_5
        # 6
        self.parameter_6 = parameter_6
        # 7
        self.parameter_7 = parameter_7
        # 8
        self.parameter_8 = parameter_8
        # 9
        self.parameter_9 = parameter_9
        # 10
        self.parameter_10 = parameter_10

    def validate(self):
        self.validate_required(self.parameter_1, 'parameter_1')
        self.validate_required(self.parameter_2, 'parameter_2')
        self.validate_required(self.parameter_3, 'parameter_3')
        self.validate_required(self.parameter_4, 'parameter_4')
        self.validate_required(self.parameter_5, 'parameter_5')
        self.validate_required(self.parameter_6, 'parameter_6')
        self.validate_required(self.parameter_7, 'parameter_7')
        self.validate_required(self.parameter_8, 'parameter_8')
        self.validate_required(self.parameter_9, 'parameter_9')
        self.validate_required(self.parameter_10, 'parameter_10')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.parameter_1 is not None:
            result['parameter_1'] = self.parameter_1
        if self.parameter_2 is not None:
            result['parameter_2'] = self.parameter_2
        if self.parameter_3 is not None:
            result['parameter_3'] = self.parameter_3
        if self.parameter_4 is not None:
            result['parameter_4'] = self.parameter_4
        if self.parameter_5 is not None:
            result['parameter_5'] = self.parameter_5
        if self.parameter_6 is not None:
            result['parameter_6'] = self.parameter_6
        if self.parameter_7 is not None:
            result['parameter_7'] = self.parameter_7
        if self.parameter_8 is not None:
            result['parameter_8'] = self.parameter_8
        if self.parameter_9 is not None:
            result['parameter_9'] = self.parameter_9
        if self.parameter_10 is not None:
            result['parameter_10'] = self.parameter_10
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('parameter_1') is not None:
            self.parameter_1 = m.get('parameter_1')
        if m.get('parameter_2') is not None:
            self.parameter_2 = m.get('parameter_2')
        if m.get('parameter_3') is not None:
            self.parameter_3 = m.get('parameter_3')
        if m.get('parameter_4') is not None:
            self.parameter_4 = m.get('parameter_4')
        if m.get('parameter_5') is not None:
            self.parameter_5 = m.get('parameter_5')
        if m.get('parameter_6') is not None:
            self.parameter_6 = m.get('parameter_6')
        if m.get('parameter_7') is not None:
            self.parameter_7 = m.get('parameter_7')
        if m.get('parameter_8') is not None:
            self.parameter_8 = m.get('parameter_8')
        if m.get('parameter_9') is not None:
            self.parameter_9 = m.get('parameter_9')
        if m.get('parameter_10') is not None:
            self.parameter_10 = m.get('parameter_10')
        return self


class Member(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        user_name: str = None,
        login_name: str = None,
        project_id: str = None,
        gmt_create: str = None,
    ):
        # 用户ID
        self.user_id = user_id
        # 用户名称
        self.user_name = user_name
        # 登录名
        self.login_name = login_name
        # 项目ID
        self.project_id = project_id
        # 创建时间
        self.gmt_create = gmt_create

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.login_name, 'login_name')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        return self


class Accessor(TeaModel):
    def __init__(
        self,
        access_key: str = None,
        access_secret: str = None,
        account: str = None,
        create_time: str = None,
        id: str = None,
        type: str = None,
    ):
        # Accessor关联的AccessKey
        self.access_key = access_key
        # Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
        self.access_secret = access_secret
        # AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
        self.account = account
        # AccessKey创建时间，ISO8601格式
        self.create_time = create_time
        # Accessor唯一标识
        self.id = id
        # Accessor类型(RAM/ACCOUNT)
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.access_secret is not None:
            result['access_secret'] = self.access_secret
        if self.account is not None:
            result['account'] = self.account
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('access_secret') is not None:
            self.access_secret = m.get('access_secret')
        if m.get('account') is not None:
            self.account = m.get('account')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class Tag(TeaModel):
    def __init__(
        self,
        tag_type: str = None,
        tag_value: str = None,
    ):
        # 标签类型
        self.tag_type = tag_type
        # 标签值
        self.tag_value = tag_value

    def validate(self):
        self.validate_required(self.tag_type, 'tag_type')
        self.validate_required(self.tag_value, 'tag_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tag_type is not None:
            result['tag_type'] = self.tag_type
        if self.tag_value is not None:
            result['tag_value'] = self.tag_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tag_type') is not None:
            self.tag_type = m.get('tag_type')
        if m.get('tag_value') is not None:
            self.tag_value = m.get('tag_value')
        return self


class AccessKey(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        id: str = None,
        secret: str = None,
        status: str = None,
        update_time: str = None,
    ):
        # AccessKey创建时间，ISO8601格式
        self.create_time = create_time
        # AccessKey唯一标识
        self.id = id
        # AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
        self.secret = secret
        # 状态
        self.status = status
        # AccessKey最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.secret is not None:
            result['secret'] = self.secret
        if self.status is not None:
            result['status'] = self.status
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('secret') is not None:
            self.secret = m.get('secret')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class Customer(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        id: str = None,
        name: str = None,
        update_time: str = None,
    ):
        # 企业创建时间，ISO8601格式
        self.create_time = create_time
        # 企业ID
        self.id = id
        # 企业名称
        self.name = name
        # 企业最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class User(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        user_name: str = None,
        login_name: str = None,
    ):
        # 用户ID
        self.user_id = user_id
        # 用户名称
        self.user_name = user_name
        # 登录名
        self.login_name = login_name

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.login_name, 'login_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.login_name is not None:
            result['login_name'] = self.login_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class Tenant(TeaModel):
    def __init__(
        self,
        ant_account: str = None,
        ant_uid: str = None,
        business_owner_id: str = None,
        create_time: str = None,
        customer: str = None,
        description: str = None,
        id: str = None,
        internal_id: str = None,
        name: str = None,
        update_time: str = None,
    ):
        # 蚂蚁通行证签约账户
        self.ant_account = ant_account
        # 蚂蚁通行证uid
        self.ant_uid = ant_uid
        # 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
        self.business_owner_id = business_owner_id
        # 租户创建时间，ISO8601格式
        self.create_time = create_time
        # 租户所在的企业的唯一标识
        self.customer = customer
        # 租户描述信息
        self.description = description
        # 租户唯一标识
        self.id = id
        # 租户内部id
        self.internal_id = internal_id
        # 租户显示名称
        self.name = name
        # 租户最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ant_account is not None:
            result['ant_account'] = self.ant_account
        if self.ant_uid is not None:
            result['ant_uid'] = self.ant_uid
        if self.business_owner_id is not None:
            result['business_owner_id'] = self.business_owner_id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.description is not None:
            result['description'] = self.description
        if self.id is not None:
            result['id'] = self.id
        if self.internal_id is not None:
            result['internal_id'] = self.internal_id
        if self.name is not None:
            result['name'] = self.name
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ant_account') is not None:
            self.ant_account = m.get('ant_account')
        if m.get('ant_uid') is not None:
            self.ant_uid = m.get('ant_uid')
        if m.get('business_owner_id') is not None:
            self.business_owner_id = m.get('business_owner_id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('internal_id') is not None:
            self.internal_id = m.get('internal_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class Action(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        type: str = None,
        status: str = None,
        description: str = None,
    ):
        # 权限点ID
        self.id = id
        # 权限点名称
        self.name = name
        # 类型
        self.type = type
        # 状态
        self.status = status
        # 描述
        self.description = description

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.status is not None:
            result['status'] = self.status
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class Project(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        project_name: str = None,
        description: str = None,
        is_default: bool = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        status: bool = None,
    ):
        # 项目ID
        self.project_id = project_id
        # 项目名称
        self.project_name = project_name
        # 项目描述
        self.description = description
        # 是否为默认项目
        self.is_default = is_default
        # 创建时间
        self.gmt_create = gmt_create
        # 更新时间
        self.gmt_modified = gmt_modified
        # 状态(false代表禁用，true代表启用)
        self.status = status

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_name, 'project_name')
        self.validate_required(self.is_default, 'is_default')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.description is not None:
            result['description'] = self.description
        if self.is_default is not None:
            result['is_default'] = self.is_default
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('is_default') is not None:
            self.is_default = m.get('is_default')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class Condition(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: List[str] = None,
    ):
        # 
        self.key = key
        # 
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class Role(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        type: str = None,
        description: str = None,
        status: str = None,
        owner: str = None,
    ):
        # 角色ID
        self.id = id
        # 角色名称
        # 
        self.name = name
        # 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
        self.type = type
        # 角色描述
        # 
        self.description = description
        # 状态
        self.status = status
        # 所有者
        self.owner = owner

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.description is not None:
            result['description'] = self.description
        if self.status is not None:
            result['status'] = self.status
        if self.owner is not None:
            result['owner'] = self.owner
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        return self


class Operator(TeaModel):
    def __init__(
        self,
        create_time: str = None,
        customer: str = None,
        email: str = None,
        external_id: str = None,
        external_system: str = None,
        id: str = None,
        login_name: str = None,
        mobile: str = None,
        nickname: str = None,
        real_name: str = None,
        department_code: str = None,
        status: str = None,
        tenants: List[str] = None,
        update_time: str = None,
    ):
        # 操作员创建时间，ISO8601格式
        self.create_time = create_time
        # 操作员所在的企业
        self.customer = customer
        # 邮箱
        self.email = email
        # 外部对接系统操作员id
        self.external_id = external_id
        # 外部对接系统类型
        self.external_system = external_system
        # 操作员ID
        self.id = id
        # 登录名
        self.login_name = login_name
        # 手机号
        self.mobile = mobile
        # 昵称
        self.nickname = nickname
        # 真实姓名
        self.real_name = real_name
        # 部门唯一码
        self.department_code = department_code
        # 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
        self.status = status
        # 操作员加入的租户列表
        self.tenants = tenants
        # 操作员最近一次修改时间，ISO8601格式
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.customer is not None:
            result['customer'] = self.customer
        if self.email is not None:
            result['email'] = self.email
        if self.external_id is not None:
            result['external_id'] = self.external_id
        if self.external_system is not None:
            result['external_system'] = self.external_system
        if self.id is not None:
            result['id'] = self.id
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.nickname is not None:
            result['nickname'] = self.nickname
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.department_code is not None:
            result['department_code'] = self.department_code
        if self.status is not None:
            result['status'] = self.status
        if self.tenants is not None:
            result['tenants'] = self.tenants
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('customer') is not None:
            self.customer = m.get('customer')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('external_id') is not None:
            self.external_id = m.get('external_id')
        if m.get('external_system') is not None:
            self.external_system = m.get('external_system')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('nickname') is not None:
            self.nickname = m.get('nickname')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('department_code') is not None:
            self.department_code = m.get('department_code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('tenants') is not None:
            self.tenants = m.get('tenants')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class Component(TeaModel):
    def __init__(
        self,
        name: str = None,
        unit: str = None,
        value: str = None,
    ):
        # 名称
        self.name = name
        # 单位
        self.unit = unit
        # 值
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.unit is not None:
            result['unit'] = self.unit
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class Renewal(TeaModel):
    def __init__(
        self,
        components: List[Component] = None,
        end_time: str = None,
        instance_id: str = None,
        start_time: str = None,
    ):
        # 实例当前配置
        self.components = components
        # 续费订单截止时间
        self.end_time = end_time
        # 实例Id
        self.instance_id = instance_id
        # 续费订单开始时间
        self.start_time = start_time

    def validate(self):
        if self.components:
            for k in self.components:
                if k:
                    k.validate()
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['components'] = []
        if self.components is not None:
            for k in self.components:
                result['components'].append(k.to_map() if k else None)
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.components = []
        if m.get('components') is not None:
            for k in m.get('components'):
                temp_model = Component()
                self.components.append(temp_model.from_map(k))
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        return self


class CommodityAttr(TeaModel):
    def __init__(
        self,
        code: str = None,
        value: str = None,
        unit: str = None,
    ):
        # 规格属性编码
        self.code = code
        # 规格属性值
        self.value = value
        # 规格属性单位
        self.unit = unit

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.value is not None:
            result['value'] = self.value
        if self.unit is not None:
            result['unit'] = self.unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        return self


class Instance(TeaModel):
    def __init__(
        self,
        charge_type: str = None,
        components: List[Component] = None,
        end_time: str = None,
        instance_id: str = None,
        product_code: str = None,
        renewals: List[Renewal] = None,
        start_time: str = None,
        status: str = None,
    ):
        # 付费方式 PREPAY_BY_MONTH _按月预付_; AFTER_PAY_BY_HOUR _按小时后收_
        self.charge_type = charge_type
        # 实例当前配置
        self.components = components
        # 合约截止时间
        self.end_time = end_time
        # 实例Id
        self.instance_id = instance_id
        # 产品code
        self.product_code = product_code
        # 续费信息
        self.renewals = renewals
        # 合约生效时间
        self.start_time = start_time
        # 实例状态 CREATING 创建中,FAILED 创建失败,STARTED 运行中,STOPPED 已停服,CHANGING 变配中,RELEASED 已释放
        self.status = status

    def validate(self):
        if self.components:
            for k in self.components:
                if k:
                    k.validate()
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.renewals:
            for k in self.renewals:
                if k:
                    k.validate()
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.charge_type is not None:
            result['charge_type'] = self.charge_type
        result['components'] = []
        if self.components is not None:
            for k in self.components:
                result['components'].append(k.to_map() if k else None)
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        result['renewals'] = []
        if self.renewals is not None:
            for k in self.renewals:
                result['renewals'].append(k.to_map() if k else None)
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('charge_type') is not None:
            self.charge_type = m.get('charge_type')
        self.components = []
        if m.get('components') is not None:
            for k in m.get('components'):
                temp_model = Component()
                self.components.append(temp_model.from_map(k))
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        self.renewals = []
        if m.get('renewals') is not None:
            for k in m.get('renewals'):
                temp_model = Renewal()
                self.renewals.append(temp_model.from_map(k))
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class RangeValue(TeaModel):
    def __init__(
        self,
        range_type: str = None,
        min_value: int = None,
        max_value: int = None,
        step: int = None,
        decimal_precision: int = None,
    ):
        # 范围类型
        self.range_type = range_type
        # 范围最小值
        self.min_value = min_value
        # 范围最大值
        self.max_value = max_value
        # 范围类型时候步长
        self.step = step
        # 小数位数
        self.decimal_precision = decimal_precision

    def validate(self):
        self.validate_required(self.range_type, 'range_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.range_type is not None:
            result['range_type'] = self.range_type
        if self.min_value is not None:
            result['min_value'] = self.min_value
        if self.max_value is not None:
            result['max_value'] = self.max_value
        if self.step is not None:
            result['step'] = self.step
        if self.decimal_precision is not None:
            result['decimal_precision'] = self.decimal_precision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('range_type') is not None:
            self.range_type = m.get('range_type')
        if m.get('min_value') is not None:
            self.min_value = m.get('min_value')
        if m.get('max_value') is not None:
            self.max_value = m.get('max_value')
        if m.get('step') is not None:
            self.step = m.get('step')
        if m.get('decimal_precision') is not None:
            self.decimal_precision = m.get('decimal_precision')
        return self


class StringMap(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # key
        self.key = key
        # value
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class FieldValueLimit(TeaModel):
    def __init__(
        self,
        value_list: List[StringMap] = None,
        range_value: RangeValue = None,
        value_data_type: str = None,
    ):
        # 枚举值，计量项为配置项的时候使用
        self.value_list = value_list
        # 范围value
        self.range_value = range_value
        # 范围类型
        self.value_data_type = value_data_type

    def validate(self):
        if self.value_list:
            for k in self.value_list:
                if k:
                    k.validate()
        if self.range_value:
            self.range_value.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['value_list'] = []
        if self.value_list is not None:
            for k in self.value_list:
                result['value_list'].append(k.to_map() if k else None)
        if self.range_value is not None:
            result['range_value'] = self.range_value.to_map()
        if self.value_data_type is not None:
            result['value_data_type'] = self.value_data_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.value_list = []
        if m.get('value_list') is not None:
            for k in m.get('value_list'):
                temp_model = StringMap()
                self.value_list.append(temp_model.from_map(k))
        if m.get('range_value') is not None:
            temp_model = RangeValue()
            self.range_value = temp_model.from_map(m['range_value'])
        if m.get('value_data_type') is not None:
            self.value_data_type = m.get('value_data_type')
        return self


class BillingFactorMeta(TeaModel):
    def __init__(
        self,
        fee_code: str = None,
        factor_code: str = None,
        factor_name: str = None,
        factor_type: str = None,
        factor_unit: str = None,
        meter_feild_code: str = None,
        factor_ratio: str = None,
        deduct_respackage: bool = None,
        is_cumulative: bool = None,
        val_original: str = None,
        default_value: str = None,
        extra_info: str = None,
        factor_model_type: str = None,
    ):
        # 费用code
        self.fee_code = fee_code
        # 因子code
        self.factor_code = factor_code
        # 因子名称
        self.factor_name = factor_name
        # 因子类型
        self.factor_type = factor_type
        # 因子单位
        self.factor_unit = factor_unit
        # 计量项code
        self.meter_feild_code = meter_feild_code
        # 转换比率，用于展示转换
        self.factor_ratio = factor_ratio
        # 是否抵扣资源包
        self.deduct_respackage = deduct_respackage
        # 是否累计
        self.is_cumulative = is_cumulative
        # 数据来源，配置，计量数据
        self.val_original = val_original
        # 默认值
        self.default_value = default_value
        # 拓展信息
        self.extra_info = extra_info
        # 订购模型，价格模型
        self.factor_model_type = factor_model_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.fee_code is not None:
            result['fee_code'] = self.fee_code
        if self.factor_code is not None:
            result['factor_code'] = self.factor_code
        if self.factor_name is not None:
            result['factor_name'] = self.factor_name
        if self.factor_type is not None:
            result['factor_type'] = self.factor_type
        if self.factor_unit is not None:
            result['factor_unit'] = self.factor_unit
        if self.meter_feild_code is not None:
            result['meter_feild_code'] = self.meter_feild_code
        if self.factor_ratio is not None:
            result['factor_ratio'] = self.factor_ratio
        if self.deduct_respackage is not None:
            result['deduct_respackage'] = self.deduct_respackage
        if self.is_cumulative is not None:
            result['is_cumulative'] = self.is_cumulative
        if self.val_original is not None:
            result['val_original'] = self.val_original
        if self.default_value is not None:
            result['default_value'] = self.default_value
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.factor_model_type is not None:
            result['factor_model_type'] = self.factor_model_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fee_code') is not None:
            self.fee_code = m.get('fee_code')
        if m.get('factor_code') is not None:
            self.factor_code = m.get('factor_code')
        if m.get('factor_name') is not None:
            self.factor_name = m.get('factor_name')
        if m.get('factor_type') is not None:
            self.factor_type = m.get('factor_type')
        if m.get('factor_unit') is not None:
            self.factor_unit = m.get('factor_unit')
        if m.get('meter_feild_code') is not None:
            self.meter_feild_code = m.get('meter_feild_code')
        if m.get('factor_ratio') is not None:
            self.factor_ratio = m.get('factor_ratio')
        if m.get('deduct_respackage') is not None:
            self.deduct_respackage = m.get('deduct_respackage')
        if m.get('is_cumulative') is not None:
            self.is_cumulative = m.get('is_cumulative')
        if m.get('val_original') is not None:
            self.val_original = m.get('val_original')
        if m.get('default_value') is not None:
            self.default_value = m.get('default_value')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('factor_model_type') is not None:
            self.factor_model_type = m.get('factor_model_type')
        return self


class ResourcePackageConstraintMeta(TeaModel):
    def __init__(
        self,
        template_name: str = None,
        constraint_code: str = None,
        constraint_name: str = None,
        constraint_expression: str = None,
        constraint_type: str = None,
    ):
        # 模板code
        self.template_name = template_name
        # 约束码
        self.constraint_code = constraint_code
        # 约束名称
        self.constraint_name = constraint_name
        # 约束表达式
        self.constraint_expression = constraint_expression
        # 约束类型
        self.constraint_type = constraint_type

    def validate(self):
        self.validate_required(self.template_name, 'template_name')
        self.validate_required(self.constraint_code, 'constraint_code')
        self.validate_required(self.constraint_name, 'constraint_name')
        self.validate_required(self.constraint_expression, 'constraint_expression')
        self.validate_required(self.constraint_type, 'constraint_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.constraint_code is not None:
            result['constraint_code'] = self.constraint_code
        if self.constraint_name is not None:
            result['constraint_name'] = self.constraint_name
        if self.constraint_expression is not None:
            result['constraint_expression'] = self.constraint_expression
        if self.constraint_type is not None:
            result['constraint_type'] = self.constraint_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('constraint_code') is not None:
            self.constraint_code = m.get('constraint_code')
        if m.get('constraint_name') is not None:
            self.constraint_name = m.get('constraint_name')
        if m.get('constraint_expression') is not None:
            self.constraint_expression = m.get('constraint_expression')
        if m.get('constraint_type') is not None:
            self.constraint_type = m.get('constraint_type')
        return self


class DomainSls(TeaModel):
    def __init__(
        self,
        sql: str = None,
        interval: str = None,
        memo: str = None,
    ):
        # 拉取sql
        self.sql = sql
        # 拉取SLS间隔
        self.interval = interval
        # 属性项
        self.memo = memo

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sql is not None:
            result['sql'] = self.sql
        if self.interval is not None:
            result['interval'] = self.interval
        if self.memo is not None:
            result['memo'] = self.memo
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sql') is not None:
            self.sql = m.get('sql')
        if m.get('interval') is not None:
            self.interval = m.get('interval')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        return self


class DomainNode(TeaModel):
    def __init__(
        self,
        code: str = None,
        english_name: str = None,
        chinese_name: str = None,
        need_check: bool = None,
        time_out: int = None,
        memo: str = None,
        status: str = None,
    ):
        # node字段
        # 目前可选枚举：CENTER, ODPS, MANUAL, SLS;
        # 也可以自定义
        self.code = code
        # node英文名称
        self.english_name = english_name
        # 中文名称
        self.chinese_name = chinese_name
        # 默认需要check
        self.need_check = need_check
        # 默认超时时间,单位:m
        self.time_out = time_out
        # 描述
        self.memo = memo
        # 状态
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.english_name is not None:
            result['english_name'] = self.english_name
        if self.chinese_name is not None:
            result['chinese_name'] = self.chinese_name
        if self.need_check is not None:
            result['need_check'] = self.need_check
        if self.time_out is not None:
            result['time_out'] = self.time_out
        if self.memo is not None:
            result['memo'] = self.memo
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('english_name') is not None:
            self.english_name = m.get('english_name')
        if m.get('chinese_name') is not None:
            self.chinese_name = m.get('chinese_name')
        if m.get('need_check') is not None:
            self.need_check = m.get('need_check')
        if m.get('time_out') is not None:
            self.time_out = m.get('time_out')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class PrimaryKeyGenRule(TeaModel):
    def __init__(
        self,
        rule_code: str = None,
        chinese_name: str = None,
        english_name: str = None,
        primary_keys: str = None,
    ):
        # 规则code
        self.rule_code = rule_code
        # 规则名称
        self.chinese_name = chinese_name
        # 规则englishName
        self.english_name = english_name
        # 规则包括的fiel列表
        self.primary_keys = primary_keys

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.rule_code is not None:
            result['rule_code'] = self.rule_code
        if self.chinese_name is not None:
            result['chinese_name'] = self.chinese_name
        if self.english_name is not None:
            result['english_name'] = self.english_name
        if self.primary_keys is not None:
            result['primary_keys'] = self.primary_keys
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('rule_code') is not None:
            self.rule_code = m.get('rule_code')
        if m.get('chinese_name') is not None:
            self.chinese_name = m.get('chinese_name')
        if m.get('english_name') is not None:
            self.english_name = m.get('english_name')
        if m.get('primary_keys') is not None:
            self.primary_keys = m.get('primary_keys')
        return self


class MeterDomainMember(TeaModel):
    def __init__(
        self,
        role: str = None,
        user_id: str = None,
        nick_name: str = None,
        name: str = None,
    ):
        # 角色
        self.role = role
        # 成员id
        self.user_id = user_id
        # 成员昵称
        self.nick_name = nick_name
        # 成员姓名
        self.name = name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.role is not None:
            result['role'] = self.role
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.nick_name is not None:
            result['nick_name'] = self.nick_name
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('nick_name') is not None:
            self.nick_name = m.get('nick_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class DeductOmsField(TeaModel):
    def __init__(
        self,
        product_code: str = None,
        oms_field: List[str] = None,
    ):
        # 抵扣的资源包商品
        self.product_code = product_code
        # 计量项列表
        self.oms_field = oms_field

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.oms_field is not None:
            result['oms_field'] = self.oms_field
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('oms_field') is not None:
            self.oms_field = m.get('oms_field')
        return self


class DomainField(TeaModel):
    def __init__(
        self,
        code: str = None,
        english_name: str = None,
        chinese_name: str = None,
        field_type: str = None,
        format_length: str = None,
        default_value: str = None,
        if_null: str = None,
        if_increment: str = None,
        unit: str = None,
        remark: str = None,
        column: str = None,
        field_value_limit: FieldValueLimit = None,
        aggregation_type: str = None,
    ):
        # 计量项code
        self.code = code
        # 计量项英文名
        self.english_name = english_name
        # 计量字段中文名称
        self.chinese_name = chinese_name
        # 枚举，可选
        # 配置型
        # 消耗型
        # *其他
        self.field_type = field_type
        # 字段构成索引时的格式化长度<br>
        self.format_length = format_length
        # 默认值,可选
        self.default_value = default_value
        # 是否必填，默认必填写
        self.if_null = if_null
        # 是否增量推送
        self.if_increment = if_increment
        # 单位
        self.unit = unit
        # 计量项说明
        self.remark = remark
        # 关联字段排序
        self.column = column
        # 计量项值约束
        self.field_value_limit = field_value_limit
        # 聚合方式
        self.aggregation_type = aggregation_type

    def validate(self):
        if self.field_value_limit:
            self.field_value_limit.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.english_name is not None:
            result['english_name'] = self.english_name
        if self.chinese_name is not None:
            result['chinese_name'] = self.chinese_name
        if self.field_type is not None:
            result['field_type'] = self.field_type
        if self.format_length is not None:
            result['format_length'] = self.format_length
        if self.default_value is not None:
            result['default_value'] = self.default_value
        if self.if_null is not None:
            result['if_null'] = self.if_null
        if self.if_increment is not None:
            result['if_increment'] = self.if_increment
        if self.unit is not None:
            result['unit'] = self.unit
        if self.remark is not None:
            result['remark'] = self.remark
        if self.column is not None:
            result['column'] = self.column
        if self.field_value_limit is not None:
            result['field_value_limit'] = self.field_value_limit.to_map()
        if self.aggregation_type is not None:
            result['aggregation_type'] = self.aggregation_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('english_name') is not None:
            self.english_name = m.get('english_name')
        if m.get('chinese_name') is not None:
            self.chinese_name = m.get('chinese_name')
        if m.get('field_type') is not None:
            self.field_type = m.get('field_type')
        if m.get('format_length') is not None:
            self.format_length = m.get('format_length')
        if m.get('default_value') is not None:
            self.default_value = m.get('default_value')
        if m.get('if_null') is not None:
            self.if_null = m.get('if_null')
        if m.get('if_increment') is not None:
            self.if_increment = m.get('if_increment')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        if m.get('column') is not None:
            self.column = m.get('column')
        if m.get('field_value_limit') is not None:
            temp_model = FieldValueLimit()
            self.field_value_limit = temp_model.from_map(m['field_value_limit'])
        if m.get('aggregation_type') is not None:
            self.aggregation_type = m.get('aggregation_type')
        return self


class MultiCurrencyMoney(TeaModel):
    def __init__(
        self,
        cent: int = None,
        currency_value: str = None,
    ):
        # 金额，以分为单位
        self.cent = cent
        # 支付宝体系内一般存储币种值
        self.currency_value = currency_value

    def validate(self):
        self.validate_required(self.cent, 'cent')
        self.validate_required(self.currency_value, 'currency_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cent is not None:
            result['cent'] = self.cent
        if self.currency_value is not None:
            result['currency_value'] = self.currency_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cent') is not None:
            self.cent = m.get('cent')
        if m.get('currency_value') is not None:
            self.currency_value = m.get('currency_value')
        return self


class RespackageConfVO(TeaModel):
    def __init__(
        self,
        template_code: str = None,
        template_name: str = None,
        template_dimension: str = None,
        product_code: str = None,
        offer_code: str = None,
        deduct_product_code: List[str] = None,
        deduct_oms_field: List[DeductOmsField] = None,
        deduct_type: str = None,
        specification: List[StringMap] = None,
        calc_amount: bool = None,
        sub_pack: bool = None,
        sub_pack_split_type: str = None,
        rel_template: str = None,
    ):
        # 模板code
        self.template_code = template_code
        # 模板展示名称
        self.template_name = template_name
        # 资源包模板维度
        self.template_dimension = template_dimension
        # 产品名称 -> 商品模型2.0中的渠道产品Code
        self.product_code = product_code
        # 商品名称 -> 商品模型2.0中的offerInnerCode
        self.offer_code = offer_code
        # 抵扣的量价商品 -> 商品模型2.0中的渠道产品Code
        self.deduct_product_code = deduct_product_code
        # 抵扣的量价商品与计量项的关系
        self.deduct_oms_field = deduct_oms_field
        # 资源包抵扣类型
        self.deduct_type = deduct_type
        # 产时的规格约束
        self.specification = specification
        # 是否计算金额
        self.calc_amount = calc_amount
        # 是否使用子包
        self.sub_pack = sub_pack
        # 子包切分规则 None(不切割)、NaturalMonth(按自然月切割) 、SubscribeMonth(按订单月切割) *\
        self.sub_pack_split_type = sub_pack_split_type
        # 关联子包模版
        self.rel_template = rel_template

    def validate(self):
        if self.deduct_oms_field:
            for k in self.deduct_oms_field:
                if k:
                    k.validate()
        if self.specification:
            for k in self.specification:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.template_dimension is not None:
            result['template_dimension'] = self.template_dimension
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.offer_code is not None:
            result['offer_code'] = self.offer_code
        if self.deduct_product_code is not None:
            result['deduct_product_code'] = self.deduct_product_code
        result['deduct_oms_field'] = []
        if self.deduct_oms_field is not None:
            for k in self.deduct_oms_field:
                result['deduct_oms_field'].append(k.to_map() if k else None)
        if self.deduct_type is not None:
            result['deduct_type'] = self.deduct_type
        result['specification'] = []
        if self.specification is not None:
            for k in self.specification:
                result['specification'].append(k.to_map() if k else None)
        if self.calc_amount is not None:
            result['calc_amount'] = self.calc_amount
        if self.sub_pack is not None:
            result['sub_pack'] = self.sub_pack
        if self.sub_pack_split_type is not None:
            result['sub_pack_split_type'] = self.sub_pack_split_type
        if self.rel_template is not None:
            result['rel_template'] = self.rel_template
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('template_dimension') is not None:
            self.template_dimension = m.get('template_dimension')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('offer_code') is not None:
            self.offer_code = m.get('offer_code')
        if m.get('deduct_product_code') is not None:
            self.deduct_product_code = m.get('deduct_product_code')
        self.deduct_oms_field = []
        if m.get('deduct_oms_field') is not None:
            for k in m.get('deduct_oms_field'):
                temp_model = DeductOmsField()
                self.deduct_oms_field.append(temp_model.from_map(k))
        if m.get('deduct_type') is not None:
            self.deduct_type = m.get('deduct_type')
        self.specification = []
        if m.get('specification') is not None:
            for k in m.get('specification'):
                temp_model = StringMap()
                self.specification.append(temp_model.from_map(k))
        if m.get('calc_amount') is not None:
            self.calc_amount = m.get('calc_amount')
        if m.get('sub_pack') is not None:
            self.sub_pack = m.get('sub_pack')
        if m.get('sub_pack_split_type') is not None:
            self.sub_pack_split_type = m.get('sub_pack_split_type')
        if m.get('rel_template') is not None:
            self.rel_template = m.get('rel_template')
        return self


class BillingPlanVO(TeaModel):
    def __init__(
        self,
        billing_rule_code: str = None,
        domain_code: str = None,
        product_code: str = None,
        offer_code: str = None,
        bill_dimension: str = None,
        enable_resource_package: bool = None,
        cumulate_cycle: str = None,
        transfer_type: str = None,
        pay_accept_type: str = None,
        write_off_type: str = None,
        max_price_yuan: str = None,
        billingfactor_metas: List[BillingFactorMeta] = None,
        accept_type: str = None,
        collect_period: str = None,
        out_paid_type: str = None,
        enable_right_row_charge: bool = None,
        high_precision_cumulative_type: str = None,
    ):
        # 计费规则code
        self.billing_rule_code = billing_rule_code
        # 计量域code
        self.domain_code = domain_code
        # 产品名称 -> 商品模型2.0中的渠道产品Code
        self.product_code = product_code
        # 商品名称 -> 商品模型2.0中的offerInnerCode
        self.offer_code = offer_code
        # 采集维度，主实例/逻辑实例，默认主实例
        self.bill_dimension = bill_dimension
        # 是否启用资源包，默认是
        self.enable_resource_package = enable_resource_package
        # 累计模式(月/年/指定时间)
        self.cumulate_cycle = cumulate_cycle
        # 转账类型(数字商品户解冻/文娱链户解冻/权益宝户解冻)，默认空
        self.transfer_type = transfer_type
        # 支付类型(代扣)，默认空
        self.pay_accept_type = pay_accept_type
        # 核销类型(业务侧)，默认空
        self.write_off_type = write_off_type
        # 单次计价最大价格保护（元），默认1000000元
        self.max_price_yuan = max_price_yuan
        # 计费因子
        self.billingfactor_metas = billingfactor_metas
        # 受理类型
        self.accept_type = accept_type
        # 周期
        self.collect_period = collect_period
        # 外部支付类型
        self.out_paid_type = out_paid_type
        # 是否立即出账
        self.enable_right_row_charge = enable_right_row_charge
        # 高精度累计类型
        self.high_precision_cumulative_type = high_precision_cumulative_type

    def validate(self):
        if self.billingfactor_metas:
            for k in self.billingfactor_metas:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.billing_rule_code is not None:
            result['billing_rule_code'] = self.billing_rule_code
        if self.domain_code is not None:
            result['domain_code'] = self.domain_code
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.offer_code is not None:
            result['offer_code'] = self.offer_code
        if self.bill_dimension is not None:
            result['bill_dimension'] = self.bill_dimension
        if self.enable_resource_package is not None:
            result['enable_resource_package'] = self.enable_resource_package
        if self.cumulate_cycle is not None:
            result['cumulate_cycle'] = self.cumulate_cycle
        if self.transfer_type is not None:
            result['transfer_type'] = self.transfer_type
        if self.pay_accept_type is not None:
            result['pay_accept_type'] = self.pay_accept_type
        if self.write_off_type is not None:
            result['write_off_type'] = self.write_off_type
        if self.max_price_yuan is not None:
            result['max_price_yuan'] = self.max_price_yuan
        result['billingfactor_metas'] = []
        if self.billingfactor_metas is not None:
            for k in self.billingfactor_metas:
                result['billingfactor_metas'].append(k.to_map() if k else None)
        if self.accept_type is not None:
            result['accept_type'] = self.accept_type
        if self.collect_period is not None:
            result['collect_period'] = self.collect_period
        if self.out_paid_type is not None:
            result['out_paid_type'] = self.out_paid_type
        if self.enable_right_row_charge is not None:
            result['enable_right_row_charge'] = self.enable_right_row_charge
        if self.high_precision_cumulative_type is not None:
            result['high_precision_cumulative_type'] = self.high_precision_cumulative_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('billing_rule_code') is not None:
            self.billing_rule_code = m.get('billing_rule_code')
        if m.get('domain_code') is not None:
            self.domain_code = m.get('domain_code')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('offer_code') is not None:
            self.offer_code = m.get('offer_code')
        if m.get('bill_dimension') is not None:
            self.bill_dimension = m.get('bill_dimension')
        if m.get('enable_resource_package') is not None:
            self.enable_resource_package = m.get('enable_resource_package')
        if m.get('cumulate_cycle') is not None:
            self.cumulate_cycle = m.get('cumulate_cycle')
        if m.get('transfer_type') is not None:
            self.transfer_type = m.get('transfer_type')
        if m.get('pay_accept_type') is not None:
            self.pay_accept_type = m.get('pay_accept_type')
        if m.get('write_off_type') is not None:
            self.write_off_type = m.get('write_off_type')
        if m.get('max_price_yuan') is not None:
            self.max_price_yuan = m.get('max_price_yuan')
        self.billingfactor_metas = []
        if m.get('billingfactor_metas') is not None:
            for k in m.get('billingfactor_metas'):
                temp_model = BillingFactorMeta()
                self.billingfactor_metas.append(temp_model.from_map(k))
        if m.get('accept_type') is not None:
            self.accept_type = m.get('accept_type')
        if m.get('collect_period') is not None:
            self.collect_period = m.get('collect_period')
        if m.get('out_paid_type') is not None:
            self.out_paid_type = m.get('out_paid_type')
        if m.get('enable_right_row_charge') is not None:
            self.enable_right_row_charge = m.get('enable_right_row_charge')
        if m.get('high_precision_cumulative_type') is not None:
            self.high_precision_cumulative_type = m.get('high_precision_cumulative_type')
        return self


class DomainConfigVO(TeaModel):
    def __init__(
        self,
        operate_type: str = None,
        domain_code: str = None,
        domain_version: str = None,
        chinese_name: str = None,
        english_name: str = None,
        domain_desc: str = None,
        service_code: str = None,
        commodity_code: str = None,
        push_type: str = None,
        dimension: str = None,
        env: str = None,
        memo: str = None,
        need_aggregate: str = None,
        creator: str = None,
        modifier: str = None,
        domain_field_set: List[DomainField] = None,
        primary_key_gen_rule: PrimaryKeyGenRule = None,
        domain_node_set: List[DomainNode] = None,
        meter_domain_member_set: List[MeterDomainMember] = None,
        domain_sls: DomainSls = None,
    ):
        # 操作类型
        self.operate_type = operate_type
        # 产品域Code，例如OSS
        self.domain_code = domain_code
        # 版本
        self.domain_version = domain_version
        # 计量域中文名称
        self.chinese_name = chinese_name
        # 计量域英文名称
        self.english_name = english_name
        # 计量域描述
        self.domain_desc = domain_desc
        # 渠道产品Code
        self.service_code = service_code
        # 商品code
        self.commodity_code = commodity_code
        # 推送类型
        self.push_type = push_type
        # 计量数据维度
        self.dimension = dimension
        # 环境标识
        self.env = env
        # 计量说明
        self.memo = memo
        # domainCode是否需要聚合
        self.need_aggregate = need_aggregate
        # 创建者
        self.creator = creator
        # 修改者
        self.modifier = modifier
        # 计量项list
        self.domain_field_set = domain_field_set
        # 主键规则配置
        self.primary_key_gen_rule = primary_key_gen_rule
        # 计量节点
        self.domain_node_set = domain_node_set
        # 计量域成员信息
        self.meter_domain_member_set = meter_domain_member_set
        # DomainSLS配置
        self.domain_sls = domain_sls

    def validate(self):
        if self.domain_field_set:
            for k in self.domain_field_set:
                if k:
                    k.validate()
        if self.primary_key_gen_rule:
            self.primary_key_gen_rule.validate()
        if self.domain_node_set:
            for k in self.domain_node_set:
                if k:
                    k.validate()
        if self.meter_domain_member_set:
            for k in self.meter_domain_member_set:
                if k:
                    k.validate()
        if self.domain_sls:
            self.domain_sls.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.operate_type is not None:
            result['operate_type'] = self.operate_type
        if self.domain_code is not None:
            result['domain_code'] = self.domain_code
        if self.domain_version is not None:
            result['domain_version'] = self.domain_version
        if self.chinese_name is not None:
            result['chinese_name'] = self.chinese_name
        if self.english_name is not None:
            result['english_name'] = self.english_name
        if self.domain_desc is not None:
            result['domain_desc'] = self.domain_desc
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.push_type is not None:
            result['push_type'] = self.push_type
        if self.dimension is not None:
            result['dimension'] = self.dimension
        if self.env is not None:
            result['env'] = self.env
        if self.memo is not None:
            result['memo'] = self.memo
        if self.need_aggregate is not None:
            result['need_aggregate'] = self.need_aggregate
        if self.creator is not None:
            result['creator'] = self.creator
        if self.modifier is not None:
            result['modifier'] = self.modifier
        result['domain_field_set'] = []
        if self.domain_field_set is not None:
            for k in self.domain_field_set:
                result['domain_field_set'].append(k.to_map() if k else None)
        if self.primary_key_gen_rule is not None:
            result['primary_key_gen_rule'] = self.primary_key_gen_rule.to_map()
        result['domain_node_set'] = []
        if self.domain_node_set is not None:
            for k in self.domain_node_set:
                result['domain_node_set'].append(k.to_map() if k else None)
        result['meter_domain_member_set'] = []
        if self.meter_domain_member_set is not None:
            for k in self.meter_domain_member_set:
                result['meter_domain_member_set'].append(k.to_map() if k else None)
        if self.domain_sls is not None:
            result['domain_sls'] = self.domain_sls.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('operate_type') is not None:
            self.operate_type = m.get('operate_type')
        if m.get('domain_code') is not None:
            self.domain_code = m.get('domain_code')
        if m.get('domain_version') is not None:
            self.domain_version = m.get('domain_version')
        if m.get('chinese_name') is not None:
            self.chinese_name = m.get('chinese_name')
        if m.get('english_name') is not None:
            self.english_name = m.get('english_name')
        if m.get('domain_desc') is not None:
            self.domain_desc = m.get('domain_desc')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('push_type') is not None:
            self.push_type = m.get('push_type')
        if m.get('dimension') is not None:
            self.dimension = m.get('dimension')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('need_aggregate') is not None:
            self.need_aggregate = m.get('need_aggregate')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('modifier') is not None:
            self.modifier = m.get('modifier')
        self.domain_field_set = []
        if m.get('domain_field_set') is not None:
            for k in m.get('domain_field_set'):
                temp_model = DomainField()
                self.domain_field_set.append(temp_model.from_map(k))
        if m.get('primary_key_gen_rule') is not None:
            temp_model = PrimaryKeyGenRule()
            self.primary_key_gen_rule = temp_model.from_map(m['primary_key_gen_rule'])
        self.domain_node_set = []
        if m.get('domain_node_set') is not None:
            for k in m.get('domain_node_set'):
                temp_model = DomainNode()
                self.domain_node_set.append(temp_model.from_map(k))
        self.meter_domain_member_set = []
        if m.get('meter_domain_member_set') is not None:
            for k in m.get('meter_domain_member_set'):
                temp_model = MeterDomainMember()
                self.meter_domain_member_set.append(temp_model.from_map(k))
        if m.get('domain_sls') is not None:
            temp_model = DomainSls()
            self.domain_sls = temp_model.from_map(m['domain_sls'])
        return self


class ResPackageTemplateNewMeta(TeaModel):
    def __init__(
        self,
        template_name: str = None,
        template_type: str = None,
        deduct_type: str = None,
        product_code: str = None,
        product_name: str = None,
        display_name: str = None,
        applicable_product_name: str = None,
        prod_event_code: str = None,
        priority: str = None,
        renewable: bool = None,
        upgradable: bool = None,
        unit_key: str = None,
        calc_amount: bool = None,
        sub_pack: bool = None,
        sub_pack_split_type: str = None,
        rel_template: str = None,
        status: str = None,
        resource_package_constraint_metas: List[ResourcePackageConstraintMeta] = None,
    ):
        # 资源包code
        self.template_name = template_name
        # 资源包模板类型
        self.template_type = template_type
        # 抵扣类型
        self.deduct_type = deduct_type
        # 资源包l5code
        self.product_code = product_code
        # 资源包serviceCode
        self.product_name = product_name
        # 资源包模板名称
        self.display_name = display_name
        # 可抵扣的l5code
        self.applicable_product_name = applicable_product_name
        # 收费事件码
        self.prod_event_code = prod_event_code
        # 抵扣优先级
        self.priority = priority
        # 是否可续费
        self.renewable = renewable
        # 是否可升级
        self.upgradable = upgradable
        # 单位转换关系
        self.unit_key = unit_key
        # 是否计算金额
        self.calc_amount = calc_amount
        # 是否使用子包
        self.sub_pack = sub_pack
        # 子包切分规则
        self.sub_pack_split_type = sub_pack_split_type
        # 关联子包模版
        self.rel_template = rel_template
        # 状态
        self.status = status
        # 资源包约束元数据列表
        self.resource_package_constraint_metas = resource_package_constraint_metas

    def validate(self):
        self.validate_required(self.template_name, 'template_name')
        self.validate_required(self.template_type, 'template_type')
        self.validate_required(self.deduct_type, 'deduct_type')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.applicable_product_name, 'applicable_product_name')
        self.validate_required(self.unit_key, 'unit_key')
        self.validate_required(self.calc_amount, 'calc_amount')
        self.validate_required(self.sub_pack, 'sub_pack')
        if self.resource_package_constraint_metas:
            for k in self.resource_package_constraint_metas:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.template_type is not None:
            result['template_type'] = self.template_type
        if self.deduct_type is not None:
            result['deduct_type'] = self.deduct_type
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.applicable_product_name is not None:
            result['applicable_product_name'] = self.applicable_product_name
        if self.prod_event_code is not None:
            result['prod_event_code'] = self.prod_event_code
        if self.priority is not None:
            result['priority'] = self.priority
        if self.renewable is not None:
            result['renewable'] = self.renewable
        if self.upgradable is not None:
            result['upgradable'] = self.upgradable
        if self.unit_key is not None:
            result['unit_key'] = self.unit_key
        if self.calc_amount is not None:
            result['calc_amount'] = self.calc_amount
        if self.sub_pack is not None:
            result['sub_pack'] = self.sub_pack
        if self.sub_pack_split_type is not None:
            result['sub_pack_split_type'] = self.sub_pack_split_type
        if self.rel_template is not None:
            result['rel_template'] = self.rel_template
        if self.status is not None:
            result['status'] = self.status
        result['resource_package_constraint_metas'] = []
        if self.resource_package_constraint_metas is not None:
            for k in self.resource_package_constraint_metas:
                result['resource_package_constraint_metas'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('template_type') is not None:
            self.template_type = m.get('template_type')
        if m.get('deduct_type') is not None:
            self.deduct_type = m.get('deduct_type')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('applicable_product_name') is not None:
            self.applicable_product_name = m.get('applicable_product_name')
        if m.get('prod_event_code') is not None:
            self.prod_event_code = m.get('prod_event_code')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        if m.get('renewable') is not None:
            self.renewable = m.get('renewable')
        if m.get('upgradable') is not None:
            self.upgradable = m.get('upgradable')
        if m.get('unit_key') is not None:
            self.unit_key = m.get('unit_key')
        if m.get('calc_amount') is not None:
            self.calc_amount = m.get('calc_amount')
        if m.get('sub_pack') is not None:
            self.sub_pack = m.get('sub_pack')
        if m.get('sub_pack_split_type') is not None:
            self.sub_pack_split_type = m.get('sub_pack_split_type')
        if m.get('rel_template') is not None:
            self.rel_template = m.get('rel_template')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.resource_package_constraint_metas = []
        if m.get('resource_package_constraint_metas') is not None:
            for k in m.get('resource_package_constraint_metas'):
                temp_model = ResourcePackageConstraintMeta()
                self.resource_package_constraint_metas.append(temp_model.from_map(k))
        return self


class FailChangeFactor(TeaModel):
    def __init__(
        self,
        fail_key: str = None,
        fail_reason: str = None,
    ):
        # 失败的路径值
        self.fail_key = fail_key
        # 失败原因
        self.fail_reason = fail_reason

    def validate(self):
        self.validate_required(self.fail_key, 'fail_key')
        self.validate_required(self.fail_reason, 'fail_reason')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.fail_key is not None:
            result['fail_key'] = self.fail_key
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('fail_key') is not None:
            self.fail_key = m.get('fail_key')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        return self


class FeeConfEntityVO(TeaModel):
    def __init__(
        self,
        domain_config_param: DomainConfigVO = None,
        billing_rule_meta: BillingPlanVO = None,
        res_package_template_meta: List[RespackageConfVO] = None,
        res_package_template_new_meta: List[ResPackageTemplateNewMeta] = None,
    ):
        # 计量域配置信息
        self.domain_config_param = domain_config_param
        # 计费计划配置
        self.billing_rule_meta = billing_rule_meta
        # 资源包配置
        self.res_package_template_meta = res_package_template_meta
        # 新资源包模板
        self.res_package_template_new_meta = res_package_template_new_meta

    def validate(self):
        if self.domain_config_param:
            self.domain_config_param.validate()
        if self.billing_rule_meta:
            self.billing_rule_meta.validate()
        if self.res_package_template_meta:
            for k in self.res_package_template_meta:
                if k:
                    k.validate()
        if self.res_package_template_new_meta:
            for k in self.res_package_template_new_meta:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.domain_config_param is not None:
            result['domain_config_param'] = self.domain_config_param.to_map()
        if self.billing_rule_meta is not None:
            result['billing_rule_meta'] = self.billing_rule_meta.to_map()
        result['res_package_template_meta'] = []
        if self.res_package_template_meta is not None:
            for k in self.res_package_template_meta:
                result['res_package_template_meta'].append(k.to_map() if k else None)
        result['res_package_template_new_meta'] = []
        if self.res_package_template_new_meta is not None:
            for k in self.res_package_template_new_meta:
                result['res_package_template_new_meta'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('domain_config_param') is not None:
            temp_model = DomainConfigVO()
            self.domain_config_param = temp_model.from_map(m['domain_config_param'])
        if m.get('billing_rule_meta') is not None:
            temp_model = BillingPlanVO()
            self.billing_rule_meta = temp_model.from_map(m['billing_rule_meta'])
        self.res_package_template_meta = []
        if m.get('res_package_template_meta') is not None:
            for k in m.get('res_package_template_meta'):
                temp_model = RespackageConfVO()
                self.res_package_template_meta.append(temp_model.from_map(k))
        self.res_package_template_new_meta = []
        if m.get('res_package_template_new_meta') is not None:
            for k in m.get('res_package_template_new_meta'):
                temp_model = ResPackageTemplateNewMeta()
                self.res_package_template_new_meta.append(temp_model.from_map(k))
        return self


class ResourcePackageLogVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        resource_package_instance_id: str = None,
        resource_package_display_name: str = None,
        capacity_before_deduct: str = None,
        capacity_before_deduct_unit: str = None,
        capacity_after_deduct: str = None,
        capacity_after_deduct_unit: str = None,
        deducted_amount: str = None,
        deducted_amount_unit: str = None,
        charge_bill_id: str = None,
        bill_detail_id: str = None,
        deducted_product_name: str = None,
        deducted_instance_id: str = None,
        oms_field: str = None,
        deduct_time: str = None,
        type: str = None,
        deducted_fund: str = None,
        remain_fund: str = None,
        oms_start_time: str = None,
        oms_end_time: str = None,
        extend_info: str = None,
    ):
        # 流水号
        self.id = id
        # 资源包实例
        self.resource_package_instance_id = resource_package_instance_id
        # 资源包展示名称
        self.resource_package_display_name = resource_package_display_name
        # 抵扣前容量
        self.capacity_before_deduct = capacity_before_deduct
        # 抵扣前容量单位
        self.capacity_before_deduct_unit = capacity_before_deduct_unit
        # 抵扣后容量
        self.capacity_after_deduct = capacity_after_deduct
        # 抵扣后容量单位
        self.capacity_after_deduct_unit = capacity_after_deduct_unit
        # 本次抵扣量
        self.deducted_amount = deducted_amount
        # 本次抵扣量单位
        self.deducted_amount_unit = deducted_amount_unit
        # 账单id
        self.charge_bill_id = charge_bill_id
        # 详单id
        self.bill_detail_id = bill_detail_id
        # 被抵扣的产品名
        self.deducted_product_name = deducted_product_name
        # 被抵扣实例id
        self.deducted_instance_id = deducted_instance_id
        # 抵扣的字段
        self.oms_field = oms_field
        # 抵扣发生时间
        self.deduct_time = deduct_time
        # 类型
        self.type = type
        # 抵扣资金
        self.deducted_fund = deducted_fund
        # 剩余资金
        self.remain_fund = remain_fund
        # 抵扣发生时间
        self.oms_start_time = oms_start_time
        # 抵扣发生时间
        self.oms_end_time = oms_end_time
        # extendInfo
        self.extend_info = extend_info

    def validate(self):
        if self.deduct_time is not None:
            self.validate_pattern(self.deduct_time, 'deduct_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.oms_start_time is not None:
            self.validate_pattern(self.oms_start_time, 'oms_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.oms_end_time is not None:
            self.validate_pattern(self.oms_end_time, 'oms_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.resource_package_instance_id is not None:
            result['resource_package_instance_id'] = self.resource_package_instance_id
        if self.resource_package_display_name is not None:
            result['resource_package_display_name'] = self.resource_package_display_name
        if self.capacity_before_deduct is not None:
            result['capacity_before_deduct'] = self.capacity_before_deduct
        if self.capacity_before_deduct_unit is not None:
            result['capacity_before_deduct_unit'] = self.capacity_before_deduct_unit
        if self.capacity_after_deduct is not None:
            result['capacity_after_deduct'] = self.capacity_after_deduct
        if self.capacity_after_deduct_unit is not None:
            result['capacity_after_deduct_unit'] = self.capacity_after_deduct_unit
        if self.deducted_amount is not None:
            result['deducted_amount'] = self.deducted_amount
        if self.deducted_amount_unit is not None:
            result['deducted_amount_unit'] = self.deducted_amount_unit
        if self.charge_bill_id is not None:
            result['charge_bill_id'] = self.charge_bill_id
        if self.bill_detail_id is not None:
            result['bill_detail_id'] = self.bill_detail_id
        if self.deducted_product_name is not None:
            result['deducted_product_name'] = self.deducted_product_name
        if self.deducted_instance_id is not None:
            result['deducted_instance_id'] = self.deducted_instance_id
        if self.oms_field is not None:
            result['oms_field'] = self.oms_field
        if self.deduct_time is not None:
            result['deduct_time'] = self.deduct_time
        if self.type is not None:
            result['type'] = self.type
        if self.deducted_fund is not None:
            result['deducted_fund'] = self.deducted_fund
        if self.remain_fund is not None:
            result['remain_fund'] = self.remain_fund
        if self.oms_start_time is not None:
            result['oms_start_time'] = self.oms_start_time
        if self.oms_end_time is not None:
            result['oms_end_time'] = self.oms_end_time
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('resource_package_instance_id') is not None:
            self.resource_package_instance_id = m.get('resource_package_instance_id')
        if m.get('resource_package_display_name') is not None:
            self.resource_package_display_name = m.get('resource_package_display_name')
        if m.get('capacity_before_deduct') is not None:
            self.capacity_before_deduct = m.get('capacity_before_deduct')
        if m.get('capacity_before_deduct_unit') is not None:
            self.capacity_before_deduct_unit = m.get('capacity_before_deduct_unit')
        if m.get('capacity_after_deduct') is not None:
            self.capacity_after_deduct = m.get('capacity_after_deduct')
        if m.get('capacity_after_deduct_unit') is not None:
            self.capacity_after_deduct_unit = m.get('capacity_after_deduct_unit')
        if m.get('deducted_amount') is not None:
            self.deducted_amount = m.get('deducted_amount')
        if m.get('deducted_amount_unit') is not None:
            self.deducted_amount_unit = m.get('deducted_amount_unit')
        if m.get('charge_bill_id') is not None:
            self.charge_bill_id = m.get('charge_bill_id')
        if m.get('bill_detail_id') is not None:
            self.bill_detail_id = m.get('bill_detail_id')
        if m.get('deducted_product_name') is not None:
            self.deducted_product_name = m.get('deducted_product_name')
        if m.get('deducted_instance_id') is not None:
            self.deducted_instance_id = m.get('deducted_instance_id')
        if m.get('oms_field') is not None:
            self.oms_field = m.get('oms_field')
        if m.get('deduct_time') is not None:
            self.deduct_time = m.get('deduct_time')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('deducted_fund') is not None:
            self.deducted_fund = m.get('deducted_fund')
        if m.get('remain_fund') is not None:
            self.remain_fund = m.get('remain_fund')
        if m.get('oms_start_time') is not None:
            self.oms_start_time = m.get('oms_start_time')
        if m.get('oms_end_time') is not None:
            self.oms_end_time = m.get('oms_end_time')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        return self


class ResourcePackageDeductDetailVO(TeaModel):
    def __init__(
        self,
        resource_package_log_id: str = None,
        deducted_amount: str = None,
        resource_package_id: str = None,
        resource_package_instance_id: str = None,
    ):
        # 资源包抵扣日志id
        self.resource_package_log_id = resource_package_log_id
        # 资源包抵扣量
        self.deducted_amount = deducted_amount
        # 资源包id
        self.resource_package_id = resource_package_id
        # 资源包实例id
        self.resource_package_instance_id = resource_package_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.resource_package_log_id is not None:
            result['resource_package_log_id'] = self.resource_package_log_id
        if self.deducted_amount is not None:
            result['deducted_amount'] = self.deducted_amount
        if self.resource_package_id is not None:
            result['resource_package_id'] = self.resource_package_id
        if self.resource_package_instance_id is not None:
            result['resource_package_instance_id'] = self.resource_package_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('resource_package_log_id') is not None:
            self.resource_package_log_id = m.get('resource_package_log_id')
        if m.get('deducted_amount') is not None:
            self.deducted_amount = m.get('deducted_amount')
        if m.get('resource_package_id') is not None:
            self.resource_package_id = m.get('resource_package_id')
        if m.get('resource_package_instance_id') is not None:
            self.resource_package_instance_id = m.get('resource_package_instance_id')
        return self


class FeeChangeFactorVO(TeaModel):
    def __init__(
        self,
        key: str = None,
        change_type: str = None,
    ):
        # 哪个字段变更
        self.key = key
        # 改变类型
        self.change_type = change_type

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.change_type, 'change_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.change_type is not None:
            result['change_type'] = self.change_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('change_type') is not None:
            self.change_type = m.get('change_type')
        return self


class ChargeBillVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        tenant_id: str = None,
        ar_no: str = None,
        prod_code: str = None,
        prod_event_code: str = None,
        instance_id: str = None,
        status: str = None,
        amount: MultiCurrencyMoney = None,
        discount_fee: MultiCurrencyMoney = None,
        high_precision_amount: str = None,
        high_precision_discount_fee: str = None,
        coupon_settle_amount: MultiCurrencyMoney = None,
        high_precision_coupon_settle_amount: str = None,
        coupon_id: str = None,
        require_amount: MultiCurrencyMoney = None,
        high_precision_require_amount: str = None,
        gmt_fee_start_time: str = None,
        gmt_fee_end_time: str = None,
        extend_info: str = None,
        is_flow_pack_deducted: bool = None,
    ):
        # 主键Id
        self.id = id
        # 租户Id
        self.tenant_id = tenant_id
        # 合约号
        self.ar_no = ar_no
        # 资源名称@ProductEnum
        self.prod_code = prod_code
        # 云产品收费事件码
        self.prod_event_code = prod_event_code
        # 实例id
        self.instance_id = instance_id
        # 账单计费状态@ChargeBillStatusEnum
        self.status = status
        # 账单金额
        self.amount = amount
        # 优惠金额
        self.discount_fee = discount_fee
        # 高精度金额
        self.high_precision_amount = high_precision_amount
        # 高精度活动金额
        self.high_precision_discount_fee = high_precision_discount_fee
        # 优惠券抵扣金额
        self.coupon_settle_amount = coupon_settle_amount
        # 高精度优惠券抵扣金额
        self.high_precision_coupon_settle_amount = high_precision_coupon_settle_amount
        # 优惠券id
        self.coupon_id = coupon_id
        # 应付金额
        self.require_amount = require_amount
        # 高精度应付金额
        self.high_precision_require_amount = high_precision_require_amount
        # 账单对应的使用时间区间的开始时间
        self.gmt_fee_start_time = gmt_fee_start_time
        # 账单对应的使用时间区间的结束时间
        self.gmt_fee_end_time = gmt_fee_end_time
        # This property corresponds to db column <tt>extend_info</tt>.
        self.extend_info = extend_info
        # 是否有流量包抵扣
        self.is_flow_pack_deducted = is_flow_pack_deducted

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.amount:
            self.amount.validate()
        if self.discount_fee:
            self.discount_fee.validate()
        if self.coupon_settle_amount:
            self.coupon_settle_amount.validate()
        if self.require_amount:
            self.require_amount.validate()
        if self.gmt_fee_start_time is not None:
            self.validate_pattern(self.gmt_fee_start_time, 'gmt_fee_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_fee_end_time is not None:
            self.validate_pattern(self.gmt_fee_end_time, 'gmt_fee_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ar_no is not None:
            result['ar_no'] = self.ar_no
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.prod_event_code is not None:
            result['prod_event_code'] = self.prod_event_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.status is not None:
            result['status'] = self.status
        if self.amount is not None:
            result['amount'] = self.amount.to_map()
        if self.discount_fee is not None:
            result['discount_fee'] = self.discount_fee.to_map()
        if self.high_precision_amount is not None:
            result['high_precision_amount'] = self.high_precision_amount
        if self.high_precision_discount_fee is not None:
            result['high_precision_discount_fee'] = self.high_precision_discount_fee
        if self.coupon_settle_amount is not None:
            result['coupon_settle_amount'] = self.coupon_settle_amount.to_map()
        if self.high_precision_coupon_settle_amount is not None:
            result['high_precision_coupon_settle_amount'] = self.high_precision_coupon_settle_amount
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        if self.require_amount is not None:
            result['require_amount'] = self.require_amount.to_map()
        if self.high_precision_require_amount is not None:
            result['high_precision_require_amount'] = self.high_precision_require_amount
        if self.gmt_fee_start_time is not None:
            result['gmt_fee_start_time'] = self.gmt_fee_start_time
        if self.gmt_fee_end_time is not None:
            result['gmt_fee_end_time'] = self.gmt_fee_end_time
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        if self.is_flow_pack_deducted is not None:
            result['is_flow_pack_deducted'] = self.is_flow_pack_deducted
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ar_no') is not None:
            self.ar_no = m.get('ar_no')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('prod_event_code') is not None:
            self.prod_event_code = m.get('prod_event_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.amount = temp_model.from_map(m['amount'])
        if m.get('discount_fee') is not None:
            temp_model = MultiCurrencyMoney()
            self.discount_fee = temp_model.from_map(m['discount_fee'])
        if m.get('high_precision_amount') is not None:
            self.high_precision_amount = m.get('high_precision_amount')
        if m.get('high_precision_discount_fee') is not None:
            self.high_precision_discount_fee = m.get('high_precision_discount_fee')
        if m.get('coupon_settle_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.coupon_settle_amount = temp_model.from_map(m['coupon_settle_amount'])
        if m.get('high_precision_coupon_settle_amount') is not None:
            self.high_precision_coupon_settle_amount = m.get('high_precision_coupon_settle_amount')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        if m.get('require_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.require_amount = temp_model.from_map(m['require_amount'])
        if m.get('high_precision_require_amount') is not None:
            self.high_precision_require_amount = m.get('high_precision_require_amount')
        if m.get('gmt_fee_start_time') is not None:
            self.gmt_fee_start_time = m.get('gmt_fee_start_time')
        if m.get('gmt_fee_end_time') is not None:
            self.gmt_fee_end_time = m.get('gmt_fee_end_time')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        if m.get('is_flow_pack_deducted') is not None:
            self.is_flow_pack_deducted = m.get('is_flow_pack_deducted')
        return self


class ChargeItemVO(TeaModel):
    def __init__(
        self,
        name: str = None,
        code: str = None,
        value: str = None,
        unit: str = None,
        type: str = None,
        display_name: str = None,
        display_unit: str = None,
        display_value: str = None,
    ):
        # 收费项对应的枚举编码@ProductConstraintEnum
        self.name = name
        # 收费项对应的云产品条件code@ProductConstraintEnum
        self.code = code
        # 使用量
        self.value = value
        # 度量单位
        self.unit = unit
        # 计费项类型
        self.type = type
        # 计费项名称-前端显示
        self.display_name = display_name
        # 计费项单位-前端显示
        self.display_unit = display_unit
        # 计费项值-前端显示
        self.display_value = display_value

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.code is not None:
            result['code'] = self.code
        if self.value is not None:
            result['value'] = self.value
        if self.unit is not None:
            result['unit'] = self.unit
        if self.type is not None:
            result['type'] = self.type
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.display_unit is not None:
            result['display_unit'] = self.display_unit
        if self.display_value is not None:
            result['display_value'] = self.display_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('display_unit') is not None:
            self.display_unit = m.get('display_unit')
        if m.get('display_value') is not None:
            self.display_value = m.get('display_value')
        return self


class PaginationResult(TeaModel):
    def __init__(
        self,
        data: List[ChargeBillVO] = None,
        current_page: int = None,
        page_size: int = None,
        total_count: int = None,
        success: bool = None,
    ):
        # 查询结果
        self.data = data
        # 当前页
        self.current_page = current_page
        # 分页大小
        self.page_size = page_size
        # 查询结果总数
        self.total_count = total_count
        # 状态
        self.success = success

    def validate(self):
        self.validate_required(self.data, 'data')
        if self.data:
            for k in self.data:
                if k:
                    k.validate()
        self.validate_required(self.current_page, 'current_page')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.total_count, 'total_count')
        self.validate_required(self.success, 'success')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.success is not None:
            result['success'] = self.success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = ChargeBillVO()
                self.data.append(temp_model.from_map(k))
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class ResourcePackageInstanceVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        tenant_id: str = None,
        instance_name: str = None,
        resource_package_display_name: str = None,
        resource_package_product_name: str = None,
        applicable_product_name: str = None,
        status: str = None,
        renewable: bool = None,
        upgradable: bool = None,
        initial_capacity: str = None,
        current_capacity: str = None,
        init_capacity_view_unit: str = None,
        current_capacity_view_unit: str = None,
        start_time: str = None,
        end_time: str = None,
        total_fund: str = None,
        remain_fund: str = None,
        sub_resource_package_vos: List[ResourcePackageLogVO] = None,
    ):
        # 流水号
        self.id = id
        # 租户id
        self.tenant_id = tenant_id
        # 实例名称
        self.instance_name = instance_name
        # 资源包前端展现名称
        self.resource_package_display_name = resource_package_display_name
        # 资源包商品名
        self.resource_package_product_name = resource_package_product_name
        # 资源包可抵扣资源名称
        self.applicable_product_name = applicable_product_name
        # 当前状态-VALID、CLOSED、INVALID
        self.status = status
        # 是否可续费
        self.renewable = renewable
        # 是否可升级
        self.upgradable = upgradable
        # 初始容量
        self.initial_capacity = initial_capacity
        # 当前容量
        self.current_capacity = current_capacity
        # 初始容量单位
        self.init_capacity_view_unit = init_capacity_view_unit
        # 当前容量单位
        self.current_capacity_view_unit = current_capacity_view_unit
        # 有效期开始时间
        self.start_time = start_time
        # 有效期结束时间
        self.end_time = end_time
        # 总资金
        self.total_fund = total_fund
        # 剩余资金
        self.remain_fund = remain_fund
        # 子包信息
        self.sub_resource_package_vos = sub_resource_package_vos

    def validate(self):
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.sub_resource_package_vos:
            for k in self.sub_resource_package_vos:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_name is not None:
            result['instance_name'] = self.instance_name
        if self.resource_package_display_name is not None:
            result['resource_package_display_name'] = self.resource_package_display_name
        if self.resource_package_product_name is not None:
            result['resource_package_product_name'] = self.resource_package_product_name
        if self.applicable_product_name is not None:
            result['applicable_product_name'] = self.applicable_product_name
        if self.status is not None:
            result['status'] = self.status
        if self.renewable is not None:
            result['renewable'] = self.renewable
        if self.upgradable is not None:
            result['upgradable'] = self.upgradable
        if self.initial_capacity is not None:
            result['initial_capacity'] = self.initial_capacity
        if self.current_capacity is not None:
            result['current_capacity'] = self.current_capacity
        if self.init_capacity_view_unit is not None:
            result['init_capacity_view_unit'] = self.init_capacity_view_unit
        if self.current_capacity_view_unit is not None:
            result['current_capacity_view_unit'] = self.current_capacity_view_unit
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.total_fund is not None:
            result['total_fund'] = self.total_fund
        if self.remain_fund is not None:
            result['remain_fund'] = self.remain_fund
        result['sub_resource_package_vos'] = []
        if self.sub_resource_package_vos is not None:
            for k in self.sub_resource_package_vos:
                result['sub_resource_package_vos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_name') is not None:
            self.instance_name = m.get('instance_name')
        if m.get('resource_package_display_name') is not None:
            self.resource_package_display_name = m.get('resource_package_display_name')
        if m.get('resource_package_product_name') is not None:
            self.resource_package_product_name = m.get('resource_package_product_name')
        if m.get('applicable_product_name') is not None:
            self.applicable_product_name = m.get('applicable_product_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('renewable') is not None:
            self.renewable = m.get('renewable')
        if m.get('upgradable') is not None:
            self.upgradable = m.get('upgradable')
        if m.get('initial_capacity') is not None:
            self.initial_capacity = m.get('initial_capacity')
        if m.get('current_capacity') is not None:
            self.current_capacity = m.get('current_capacity')
        if m.get('init_capacity_view_unit') is not None:
            self.init_capacity_view_unit = m.get('init_capacity_view_unit')
        if m.get('current_capacity_view_unit') is not None:
            self.current_capacity_view_unit = m.get('current_capacity_view_unit')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('total_fund') is not None:
            self.total_fund = m.get('total_fund')
        if m.get('remain_fund') is not None:
            self.remain_fund = m.get('remain_fund')
        self.sub_resource_package_vos = []
        if m.get('sub_resource_package_vos') is not None:
            for k in m.get('sub_resource_package_vos'):
                temp_model = ResourcePackageLogVO()
                self.sub_resource_package_vos.append(temp_model.from_map(k))
        return self


class OmsDataComponentDeductDetailResultVO(TeaModel):
    def __init__(
        self,
        resource_package_log_id: str = None,
        deduct_amount: int = None,
        deducted_fund: str = None,
        deducted_time: str = None,
        resource_package_id: str = None,
        resource_package_instance_id: str = None,
        deduct_amount_str: str = None,
    ):
        # 资源包抵扣日志id
        self.resource_package_log_id = resource_package_log_id
        # 资源包抵扣量
        self.deduct_amount = deduct_amount
        # 资源包抵扣价值
        self.deducted_fund = deducted_fund
        # 资源包抵扣时间
        self.deducted_time = deducted_time
        # 资源包id
        self.resource_package_id = resource_package_id
        # 资源包实例id
        self.resource_package_instance_id = resource_package_instance_id
        # 高精度抵扣量
        self.deduct_amount_str = deduct_amount_str

    def validate(self):
        self.validate_required(self.resource_package_log_id, 'resource_package_log_id')
        self.validate_required(self.deducted_fund, 'deducted_fund')
        self.validate_required(self.deducted_time, 'deducted_time')
        if self.deducted_time is not None:
            self.validate_pattern(self.deducted_time, 'deducted_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.resource_package_id, 'resource_package_id')
        self.validate_required(self.resource_package_instance_id, 'resource_package_instance_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.resource_package_log_id is not None:
            result['resource_package_log_id'] = self.resource_package_log_id
        if self.deduct_amount is not None:
            result['deduct_amount'] = self.deduct_amount
        if self.deducted_fund is not None:
            result['deducted_fund'] = self.deducted_fund
        if self.deducted_time is not None:
            result['deducted_time'] = self.deducted_time
        if self.resource_package_id is not None:
            result['resource_package_id'] = self.resource_package_id
        if self.resource_package_instance_id is not None:
            result['resource_package_instance_id'] = self.resource_package_instance_id
        if self.deduct_amount_str is not None:
            result['deduct_amount_str'] = self.deduct_amount_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('resource_package_log_id') is not None:
            self.resource_package_log_id = m.get('resource_package_log_id')
        if m.get('deduct_amount') is not None:
            self.deduct_amount = m.get('deduct_amount')
        if m.get('deducted_fund') is not None:
            self.deducted_fund = m.get('deducted_fund')
        if m.get('deducted_time') is not None:
            self.deducted_time = m.get('deducted_time')
        if m.get('resource_package_id') is not None:
            self.resource_package_id = m.get('resource_package_id')
        if m.get('resource_package_instance_id') is not None:
            self.resource_package_instance_id = m.get('resource_package_instance_id')
        if m.get('deduct_amount_str') is not None:
            self.deduct_amount_str = m.get('deduct_amount_str')
        return self


class InstanceMonthlyBillVO(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        product_category: str = None,
        product_name: str = None,
        charge_type: str = None,
        instance_id: str = None,
        bill_month: str = None,
        bill_amount: MultiCurrencyMoney = None,
        coupon_amount: MultiCurrencyMoney = None,
        high_precision_coupon_amount: str = None,
        discount_amount: MultiCurrencyMoney = None,
        high_precision_discount_amount: str = None,
        adjust_amount: MultiCurrencyMoney = None,
        received_amount: MultiCurrencyMoney = None,
        account_receivable_date: str = None,
        instance_monthly_bill_id: str = None,
        pay_channel: str = None,
        contract_id: str = None,
        extend_info: str = None,
        unsettled_amount: MultiCurrencyMoney = None,
        total_discount_amount: MultiCurrencyMoney = None,
    ):
        # 金融云租户id
        self.tenant_id = tenant_id
        # 产品类别@ProductServiceEnum
        self.product_category = product_category
        # 产品名称
        self.product_name = product_name
        # 付费类型
        self.charge_type = charge_type
        # 实例id
        self.instance_id = instance_id
        # 账单月份
        self.bill_month = bill_month
        # 应收金额(不包含优惠券和折扣)
        self.bill_amount = bill_amount
        # 优惠券抵扣金额
        self.coupon_amount = coupon_amount
        # 高精度优惠券金额
        self.high_precision_coupon_amount = high_precision_coupon_amount
        # 折扣金额
        self.discount_amount = discount_amount
        # 高精度折扣金额
        self.high_precision_discount_amount = high_precision_discount_amount
        # 调账金额
        self.adjust_amount = adjust_amount
        # 已收金额
        self.received_amount = received_amount
        # 账单应收日期
        self.account_receivable_date = account_receivable_date
        # 月账单号
        self.instance_monthly_bill_id = instance_monthly_bill_id
        # 支付渠道
        self.pay_channel = pay_channel
        # 合同ID
        self.contract_id = contract_id
        # map的json串
        self.extend_info = extend_info
        # 未结清金额
        self.unsettled_amount = unsettled_amount
        # 优惠金额
        self.total_discount_amount = total_discount_amount

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_category, 'product_category')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.charge_type, 'charge_type')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.bill_month, 'bill_month')
        if self.bill_amount:
            self.bill_amount.validate()
        self.validate_required(self.coupon_amount, 'coupon_amount')
        if self.coupon_amount:
            self.coupon_amount.validate()
        self.validate_required(self.high_precision_coupon_amount, 'high_precision_coupon_amount')
        self.validate_required(self.discount_amount, 'discount_amount')
        if self.discount_amount:
            self.discount_amount.validate()
        self.validate_required(self.high_precision_discount_amount, 'high_precision_discount_amount')
        self.validate_required(self.adjust_amount, 'adjust_amount')
        if self.adjust_amount:
            self.adjust_amount.validate()
        self.validate_required(self.received_amount, 'received_amount')
        if self.received_amount:
            self.received_amount.validate()
        self.validate_required(self.account_receivable_date, 'account_receivable_date')
        if self.account_receivable_date is not None:
            self.validate_pattern(self.account_receivable_date, 'account_receivable_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.instance_monthly_bill_id, 'instance_monthly_bill_id')
        self.validate_required(self.pay_channel, 'pay_channel')
        self.validate_required(self.contract_id, 'contract_id')
        self.validate_required(self.extend_info, 'extend_info')
        self.validate_required(self.unsettled_amount, 'unsettled_amount')
        if self.unsettled_amount:
            self.unsettled_amount.validate()
        self.validate_required(self.total_discount_amount, 'total_discount_amount')
        if self.total_discount_amount:
            self.total_discount_amount.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_category is not None:
            result['product_category'] = self.product_category
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.charge_type is not None:
            result['charge_type'] = self.charge_type
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.bill_month is not None:
            result['bill_month'] = self.bill_month
        if self.bill_amount is not None:
            result['bill_amount'] = self.bill_amount.to_map()
        if self.coupon_amount is not None:
            result['coupon_amount'] = self.coupon_amount.to_map()
        if self.high_precision_coupon_amount is not None:
            result['high_precision_coupon_amount'] = self.high_precision_coupon_amount
        if self.discount_amount is not None:
            result['discount_amount'] = self.discount_amount.to_map()
        if self.high_precision_discount_amount is not None:
            result['high_precision_discount_amount'] = self.high_precision_discount_amount
        if self.adjust_amount is not None:
            result['adjust_amount'] = self.adjust_amount.to_map()
        if self.received_amount is not None:
            result['received_amount'] = self.received_amount.to_map()
        if self.account_receivable_date is not None:
            result['account_receivable_date'] = self.account_receivable_date
        if self.instance_monthly_bill_id is not None:
            result['instance_monthly_bill_id'] = self.instance_monthly_bill_id
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        if self.unsettled_amount is not None:
            result['unsettled_amount'] = self.unsettled_amount.to_map()
        if self.total_discount_amount is not None:
            result['total_discount_amount'] = self.total_discount_amount.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_category') is not None:
            self.product_category = m.get('product_category')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('charge_type') is not None:
            self.charge_type = m.get('charge_type')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('bill_month') is not None:
            self.bill_month = m.get('bill_month')
        if m.get('bill_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.bill_amount = temp_model.from_map(m['bill_amount'])
        if m.get('coupon_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.coupon_amount = temp_model.from_map(m['coupon_amount'])
        if m.get('high_precision_coupon_amount') is not None:
            self.high_precision_coupon_amount = m.get('high_precision_coupon_amount')
        if m.get('discount_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.discount_amount = temp_model.from_map(m['discount_amount'])
        if m.get('high_precision_discount_amount') is not None:
            self.high_precision_discount_amount = m.get('high_precision_discount_amount')
        if m.get('adjust_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.adjust_amount = temp_model.from_map(m['adjust_amount'])
        if m.get('received_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.received_amount = temp_model.from_map(m['received_amount'])
        if m.get('account_receivable_date') is not None:
            self.account_receivable_date = m.get('account_receivable_date')
        if m.get('instance_monthly_bill_id') is not None:
            self.instance_monthly_bill_id = m.get('instance_monthly_bill_id')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        if m.get('unsettled_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.unsettled_amount = temp_model.from_map(m['unsettled_amount'])
        if m.get('total_discount_amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.total_discount_amount = temp_model.from_map(m['total_discount_amount'])
        return self


class FeeConfChangeVO(TeaModel):
    def __init__(
        self,
        old_conf_entity: FeeConfEntityVO = None,
        new_conf_entity: FeeConfEntityVO = None,
        change_factor_list: List[FeeChangeFactorVO] = None,
        fail_chang_factor_list: List[FailChangeFactor] = None,
    ):
        # 原本的计财配置
        self.old_conf_entity = old_conf_entity
        # 新的计财配置实体
        self.new_conf_entity = new_conf_entity
        # 变更字段列表
        self.change_factor_list = change_factor_list
        # 失败的变更列表
        self.fail_chang_factor_list = fail_chang_factor_list

    def validate(self):
        if self.old_conf_entity:
            self.old_conf_entity.validate()
        if self.new_conf_entity:
            self.new_conf_entity.validate()
        if self.change_factor_list:
            for k in self.change_factor_list:
                if k:
                    k.validate()
        if self.fail_chang_factor_list:
            for k in self.fail_chang_factor_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.old_conf_entity is not None:
            result['old_conf_entity'] = self.old_conf_entity.to_map()
        if self.new_conf_entity is not None:
            result['new_conf_entity'] = self.new_conf_entity.to_map()
        result['change_factor_list'] = []
        if self.change_factor_list is not None:
            for k in self.change_factor_list:
                result['change_factor_list'].append(k.to_map() if k else None)
        result['fail_chang_factor_list'] = []
        if self.fail_chang_factor_list is not None:
            for k in self.fail_chang_factor_list:
                result['fail_chang_factor_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('old_conf_entity') is not None:
            temp_model = FeeConfEntityVO()
            self.old_conf_entity = temp_model.from_map(m['old_conf_entity'])
        if m.get('new_conf_entity') is not None:
            temp_model = FeeConfEntityVO()
            self.new_conf_entity = temp_model.from_map(m['new_conf_entity'])
        self.change_factor_list = []
        if m.get('change_factor_list') is not None:
            for k in m.get('change_factor_list'):
                temp_model = FeeChangeFactorVO()
                self.change_factor_list.append(temp_model.from_map(k))
        self.fail_chang_factor_list = []
        if m.get('fail_chang_factor_list') is not None:
            for k in m.get('fail_chang_factor_list'):
                temp_model = FailChangeFactor()
                self.fail_chang_factor_list.append(temp_model.from_map(k))
        return self


class RespackegeBanlanceVO(TeaModel):
    def __init__(
        self,
        product_code: str = None,
        tempalte_name: str = None,
        display_name: str = None,
        initial_capacity: str = None,
        current_capacity: str = None,
        total_fund: MultiCurrencyMoney = None,
        remain_fund: MultiCurrencyMoney = None,
        decimal_current_capacity: str = None,
    ):
        # 资源包商品编码
        self.product_code = product_code
        # 资源包模板编码
        self.tempalte_name = tempalte_name
        # 资源包展示名称
        self.display_name = display_name
        # 初始容量
        self.initial_capacity = initial_capacity
        # 当前余量
        self.current_capacity = current_capacity
        # 总金额
        self.total_fund = total_fund
        # 剩余金额
        # 
        self.remain_fund = remain_fund
        # 高精度余量
        self.decimal_current_capacity = decimal_current_capacity

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.tempalte_name, 'tempalte_name')
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.initial_capacity, 'initial_capacity')
        self.validate_required(self.current_capacity, 'current_capacity')
        self.validate_required(self.total_fund, 'total_fund')
        if self.total_fund:
            self.total_fund.validate()
        self.validate_required(self.remain_fund, 'remain_fund')
        if self.remain_fund:
            self.remain_fund.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.tempalte_name is not None:
            result['tempalte_name'] = self.tempalte_name
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.initial_capacity is not None:
            result['initial_capacity'] = self.initial_capacity
        if self.current_capacity is not None:
            result['current_capacity'] = self.current_capacity
        if self.total_fund is not None:
            result['total_fund'] = self.total_fund.to_map()
        if self.remain_fund is not None:
            result['remain_fund'] = self.remain_fund.to_map()
        if self.decimal_current_capacity is not None:
            result['decimal_current_capacity'] = self.decimal_current_capacity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('tempalte_name') is not None:
            self.tempalte_name = m.get('tempalte_name')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('initial_capacity') is not None:
            self.initial_capacity = m.get('initial_capacity')
        if m.get('current_capacity') is not None:
            self.current_capacity = m.get('current_capacity')
        if m.get('total_fund') is not None:
            temp_model = MultiCurrencyMoney()
            self.total_fund = temp_model.from_map(m['total_fund'])
        if m.get('remain_fund') is not None:
            temp_model = MultiCurrencyMoney()
            self.remain_fund = temp_model.from_map(m['remain_fund'])
        if m.get('decimal_current_capacity') is not None:
            self.decimal_current_capacity = m.get('decimal_current_capacity')
        return self


class BillDetailVO(TeaModel):
    def __init__(
        self,
        id: str = None,
        charge_bill_id: str = None,
        ar_no: str = None,
        prod_code: str = None,
        prod_event_code: str = None,
        instance_id: str = None,
        amount: MultiCurrencyMoney = None,
        high_precision_amount: str = None,
        discount_fee: MultiCurrencyMoney = None,
        high_precision_discount_fee: str = None,
        flow_pack_deducted: int = None,
        flow_pack_deduct_detail: List[ResourcePackageDeductDetailVO] = None,
        gmt_fee_start_time: str = None,
        gmt_fee_end_time: str = None,
        fee_items: List[ChargeItemVO] = None,
        constraint_items: List[ChargeItemVO] = None,
        extend_info: str = None,
    ):
        # 主键Id
        self.id = id
        # 账单Id
        self.charge_bill_id = charge_bill_id
        # 合约号
        self.ar_no = ar_no
        # 资源名称@ResourceNameEnum
        self.prod_code = prod_code
        # 云产品收费事件码
        self.prod_event_code = prod_event_code
        # 实例id
        self.instance_id = instance_id
        # 账单金额
        self.amount = amount
        # 高精度金额
        self.high_precision_amount = high_precision_amount
        # 优惠金额
        self.discount_fee = discount_fee
        # 高精度优惠金额
        self.high_precision_discount_fee = high_precision_discount_fee
        # 流量包抵扣量
        self.flow_pack_deducted = flow_pack_deducted
        # 流量包抵扣详情
        self.flow_pack_deduct_detail = flow_pack_deduct_detail
        # 账单对应的使用时间区间的开始时间
        self.gmt_fee_start_time = gmt_fee_start_time
        # 账单对应的使用时间区间的结束时间
        self.gmt_fee_end_time = gmt_fee_end_time
        # 计费项
        self.fee_items = fee_items
        # 约束项
        self.constraint_items = constraint_items
        # This property corresponds to db column <tt>extend_info</tt>.
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.id, 'id')
        if self.amount:
            self.amount.validate()
        if self.discount_fee:
            self.discount_fee.validate()
        if self.flow_pack_deduct_detail:
            for k in self.flow_pack_deduct_detail:
                if k:
                    k.validate()
        if self.gmt_fee_start_time is not None:
            self.validate_pattern(self.gmt_fee_start_time, 'gmt_fee_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_fee_end_time is not None:
            self.validate_pattern(self.gmt_fee_end_time, 'gmt_fee_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.fee_items:
            for k in self.fee_items:
                if k:
                    k.validate()
        if self.constraint_items:
            for k in self.constraint_items:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.charge_bill_id is not None:
            result['charge_bill_id'] = self.charge_bill_id
        if self.ar_no is not None:
            result['ar_no'] = self.ar_no
        if self.prod_code is not None:
            result['prod_code'] = self.prod_code
        if self.prod_event_code is not None:
            result['prod_event_code'] = self.prod_event_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.amount is not None:
            result['amount'] = self.amount.to_map()
        if self.high_precision_amount is not None:
            result['high_precision_amount'] = self.high_precision_amount
        if self.discount_fee is not None:
            result['discount_fee'] = self.discount_fee.to_map()
        if self.high_precision_discount_fee is not None:
            result['high_precision_discount_fee'] = self.high_precision_discount_fee
        if self.flow_pack_deducted is not None:
            result['flow_pack_deducted'] = self.flow_pack_deducted
        result['flow_pack_deduct_detail'] = []
        if self.flow_pack_deduct_detail is not None:
            for k in self.flow_pack_deduct_detail:
                result['flow_pack_deduct_detail'].append(k.to_map() if k else None)
        if self.gmt_fee_start_time is not None:
            result['gmt_fee_start_time'] = self.gmt_fee_start_time
        if self.gmt_fee_end_time is not None:
            result['gmt_fee_end_time'] = self.gmt_fee_end_time
        result['fee_items'] = []
        if self.fee_items is not None:
            for k in self.fee_items:
                result['fee_items'].append(k.to_map() if k else None)
        result['constraint_items'] = []
        if self.constraint_items is not None:
            for k in self.constraint_items:
                result['constraint_items'].append(k.to_map() if k else None)
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('charge_bill_id') is not None:
            self.charge_bill_id = m.get('charge_bill_id')
        if m.get('ar_no') is not None:
            self.ar_no = m.get('ar_no')
        if m.get('prod_code') is not None:
            self.prod_code = m.get('prod_code')
        if m.get('prod_event_code') is not None:
            self.prod_event_code = m.get('prod_event_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('amount') is not None:
            temp_model = MultiCurrencyMoney()
            self.amount = temp_model.from_map(m['amount'])
        if m.get('high_precision_amount') is not None:
            self.high_precision_amount = m.get('high_precision_amount')
        if m.get('discount_fee') is not None:
            temp_model = MultiCurrencyMoney()
            self.discount_fee = temp_model.from_map(m['discount_fee'])
        if m.get('high_precision_discount_fee') is not None:
            self.high_precision_discount_fee = m.get('high_precision_discount_fee')
        if m.get('flow_pack_deducted') is not None:
            self.flow_pack_deducted = m.get('flow_pack_deducted')
        self.flow_pack_deduct_detail = []
        if m.get('flow_pack_deduct_detail') is not None:
            for k in m.get('flow_pack_deduct_detail'):
                temp_model = ResourcePackageDeductDetailVO()
                self.flow_pack_deduct_detail.append(temp_model.from_map(k))
        if m.get('gmt_fee_start_time') is not None:
            self.gmt_fee_start_time = m.get('gmt_fee_start_time')
        if m.get('gmt_fee_end_time') is not None:
            self.gmt_fee_end_time = m.get('gmt_fee_end_time')
        self.fee_items = []
        if m.get('fee_items') is not None:
            for k in m.get('fee_items'):
                temp_model = ChargeItemVO()
                self.fee_items.append(temp_model.from_map(k))
        self.constraint_items = []
        if m.get('constraint_items') is not None:
            for k in m.get('constraint_items'):
                temp_model = ChargeItemVO()
                self.constraint_items.append(temp_model.from_map(k))
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        return self


class CategoryVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        site_id: int = None,
        site: str = None,
        language: str = None,
        title: str = None,
        type: int = None,
        show_type: int = None,
        sort: int = None,
        level: int = None,
        ext_id: str = None,
        parent_id: str = None,
        source_type: int = None,
        version: str = None,
        catalogue_type: int = None,
    ):
        # 内部id
        self.id = id
        # 内容库id
        self.site_id = site_id
        # 站点
        self.site = site
        # language
        self.language = language
        # title
        self.title = title
        # 类型
        self.type = type
        # 展示类型 1为左侧展示2为列表展示
        self.show_type = show_type
        # 排序
        self.sort = sort
        # 目录层级
        self.level = level
        # 外标id
        self.ext_id = ext_id
        # 父id
        self.parent_id = parent_id
        # 来源类型
        self.source_type = source_type
        # 版本
        self.version = version
        # 语雀目录有无数据判定
        self.catalogue_type = catalogue_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.site_id is not None:
            result['site_id'] = self.site_id
        if self.site is not None:
            result['site'] = self.site
        if self.language is not None:
            result['language'] = self.language
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.show_type is not None:
            result['show_type'] = self.show_type
        if self.sort is not None:
            result['sort'] = self.sort
        if self.level is not None:
            result['level'] = self.level
        if self.ext_id is not None:
            result['ext_id'] = self.ext_id
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.version is not None:
            result['version'] = self.version
        if self.catalogue_type is not None:
            result['catalogue_type'] = self.catalogue_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('site_id') is not None:
            self.site_id = m.get('site_id')
        if m.get('site') is not None:
            self.site = m.get('site')
        if m.get('language') is not None:
            self.language = m.get('language')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('show_type') is not None:
            self.show_type = m.get('show_type')
        if m.get('sort') is not None:
            self.sort = m.get('sort')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('ext_id') is not None:
            self.ext_id = m.get('ext_id')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('catalogue_type') is not None:
            self.catalogue_type = m.get('catalogue_type')
        return self


class NoviceMustSee(TeaModel):
    def __init__(
        self,
        novice_must_see_explain: str = None,
        novice_must_see_title_1: str = None,
        novice_must_see_address_1: str = None,
        novice_must_see_title_2: str = None,
        novice_must_see_address_2: str = None,
        novice_must_see_title_3: str = None,
        novice_must_see_address_3: str = None,
    ):
        # novice_must_see_explain
        self.novice_must_see_explain = novice_must_see_explain
        # novice_must_see_title1
        self.novice_must_see_title_1 = novice_must_see_title_1
        # novice_must_see_address1
        self.novice_must_see_address_1 = novice_must_see_address_1
        # novice_must_see_title2
        self.novice_must_see_title_2 = novice_must_see_title_2
        # novice_must_see_address2
        self.novice_must_see_address_2 = novice_must_see_address_2
        # novice_must_see_title3
        self.novice_must_see_title_3 = novice_must_see_title_3
        # novice_must_see_address3
        self.novice_must_see_address_3 = novice_must_see_address_3

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.novice_must_see_explain is not None:
            result['novice_must_see_explain'] = self.novice_must_see_explain
        if self.novice_must_see_title_1 is not None:
            result['novice_must_see_title1'] = self.novice_must_see_title_1
        if self.novice_must_see_address_1 is not None:
            result['novice_must_see_address1'] = self.novice_must_see_address_1
        if self.novice_must_see_title_2 is not None:
            result['novice_must_see_title2'] = self.novice_must_see_title_2
        if self.novice_must_see_address_2 is not None:
            result['novice_must_see_address2'] = self.novice_must_see_address_2
        if self.novice_must_see_title_3 is not None:
            result['novice_must_see_title3'] = self.novice_must_see_title_3
        if self.novice_must_see_address_3 is not None:
            result['novice_must_see_address3'] = self.novice_must_see_address_3
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('novice_must_see_explain') is not None:
            self.novice_must_see_explain = m.get('novice_must_see_explain')
        if m.get('novice_must_see_title1') is not None:
            self.novice_must_see_title_1 = m.get('novice_must_see_title1')
        if m.get('novice_must_see_address1') is not None:
            self.novice_must_see_address_1 = m.get('novice_must_see_address1')
        if m.get('novice_must_see_title2') is not None:
            self.novice_must_see_title_2 = m.get('novice_must_see_title2')
        if m.get('novice_must_see_address2') is not None:
            self.novice_must_see_address_2 = m.get('novice_must_see_address2')
        if m.get('novice_must_see_title3') is not None:
            self.novice_must_see_title_3 = m.get('novice_must_see_title3')
        if m.get('novice_must_see_address3') is not None:
            self.novice_must_see_address_3 = m.get('novice_must_see_address3')
        return self


class CorporateContacts(TeaModel):
    def __init__(
        self,
        job_title: str = None,
        real_name: str = None,
        mobile_phone: str = None,
        email: str = None,
    ):
        # 职务
        self.job_title = job_title
        # 姓名
        self.real_name = real_name
        # 电话
        self.mobile_phone = mobile_phone
        # 邮箱
        self.email = email

    def validate(self):
        self.validate_required(self.real_name, 'real_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.job_title is not None:
            result['job_title'] = self.job_title
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.mobile_phone is not None:
            result['mobile_phone'] = self.mobile_phone
        if self.email is not None:
            result['email'] = self.email
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('job_title') is not None:
            self.job_title = m.get('job_title')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('mobile_phone') is not None:
            self.mobile_phone = m.get('mobile_phone')
        if m.get('email') is not None:
            self.email = m.get('email')
        return self


class PopularDocument(TeaModel):
    def __init__(
        self,
        popular_document_title: str = None,
        popular_document_id: str = None,
        popular_document_info: str = None,
        children: List[CategoryVO] = None,
    ):
        # popular_document_title
        self.popular_document_title = popular_document_title
        # popular_document_id
        self.popular_document_id = popular_document_id
        # popular_document_info
        self.popular_document_info = popular_document_info
        # children
        self.children = children

    def validate(self):
        self.validate_required(self.children, 'children')
        if self.children:
            for k in self.children:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.popular_document_title is not None:
            result['popular_document_title'] = self.popular_document_title
        if self.popular_document_id is not None:
            result['popular_document_id'] = self.popular_document_id
        if self.popular_document_info is not None:
            result['popular_document_info'] = self.popular_document_info
        result['children'] = []
        if self.children is not None:
            for k in self.children:
                result['children'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('popular_document_title') is not None:
            self.popular_document_title = m.get('popular_document_title')
        if m.get('popular_document_id') is not None:
            self.popular_document_id = m.get('popular_document_id')
        if m.get('popular_document_info') is not None:
            self.popular_document_info = m.get('popular_document_info')
        self.children = []
        if m.get('children') is not None:
            for k in m.get('children'):
                temp_model = CategoryVO()
                self.children.append(temp_model.from_map(k))
        return self


class BusinessRequest(TeaModel):
    def __init__(
        self,
        customer_name: str = None,
        customer_id: str = None,
        business_name: str = None,
        business_id: str = None,
        business_status: str = None,
        business_explain: str = None,
        source: str = None,
        business_date: str = None,
        tenant: str = None,
        creator: str = None,
        creator_nick: str = None,
    ):
        # 客户名称
        self.customer_name = customer_name
        # 客户id
        self.customer_id = customer_id
        # 商机名称
        self.business_name = business_name
        # 商机ID
        self.business_id = business_id
        # 未开通(INIT)/开通中(OPENING/已开通(OPEN)/使用中(USING)/闲置中(IDLE)/已关闭(CLOSE)
        self.business_status = business_status
        # 商机说明
        self.business_explain = business_explain
        # 线索来源
        self.source = source
        # 商机时间
        self.business_date = business_date
        # 租户
        self.tenant = tenant
        # 创建人工号
        self.creator = creator
        # 创建人花名
        self.creator_nick = creator_nick

    def validate(self):
        self.validate_required(self.customer_name, 'customer_name')
        self.validate_required(self.customer_id, 'customer_id')
        self.validate_required(self.business_name, 'business_name')
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.business_status, 'business_status')
        self.validate_required(self.source, 'source')
        self.validate_required(self.business_date, 'business_date')
        if self.business_date is not None:
            self.validate_pattern(self.business_date, 'business_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.tenant, 'tenant')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.creator_nick, 'creator_nick')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.business_name is not None:
            result['business_name'] = self.business_name
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.business_status is not None:
            result['business_status'] = self.business_status
        if self.business_explain is not None:
            result['business_explain'] = self.business_explain
        if self.source is not None:
            result['source'] = self.source
        if self.business_date is not None:
            result['business_date'] = self.business_date
        if self.tenant is not None:
            result['tenant'] = self.tenant
        if self.creator is not None:
            result['creator'] = self.creator
        if self.creator_nick is not None:
            result['creator_nick'] = self.creator_nick
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('business_name') is not None:
            self.business_name = m.get('business_name')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('business_status') is not None:
            self.business_status = m.get('business_status')
        if m.get('business_explain') is not None:
            self.business_explain = m.get('business_explain')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('business_date') is not None:
            self.business_date = m.get('business_date')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('creator_nick') is not None:
            self.creator_nick = m.get('creator_nick')
        return self


class PageContext(TeaModel):
    def __init__(
        self,
        page_id: str = None,
        page_title: str = None,
    ):
        # 页面di
        self.page_id = page_id
        # 页面标题
        self.page_title = page_title

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_id is not None:
            result['page_id'] = self.page_id
        if self.page_title is not None:
            result['page_title'] = self.page_title
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_id') is not None:
            self.page_id = m.get('page_id')
        if m.get('page_title') is not None:
            self.page_title = m.get('page_title')
        return self


class Asset(TeaModel):
    def __init__(
        self,
        asset_id: str = None,
        status: str = None,
        asset_info: str = None,
    ):
        # 资产标识，作为幂等单号
        self.asset_id = asset_id
        # VALID - 生效；INVALID - 作废
        self.status = status
        # 资产详情，自定义展示
        self.asset_info = asset_info

    def validate(self):
        self.validate_required(self.asset_id, 'asset_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.asset_info, 'asset_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.asset_id is not None:
            result['asset_id'] = self.asset_id
        if self.status is not None:
            result['status'] = self.status
        if self.asset_info is not None:
            result['asset_info'] = self.asset_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('asset_id') is not None:
            self.asset_id = m.get('asset_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('asset_info') is not None:
            self.asset_info = m.get('asset_info')
        return self


class CategoryLocalVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        site_id: int = None,
        title: str = None,
        type: int = None,
        sort: int = None,
        level: int = None,
        parent_id: str = None,
        source_type: int = None,
        show_type: int = None,
        ext_id: str = None,
        shie_id: int = None,
        status: int = None,
        deleted: int = None,
        tree: str = None,
        green: int = None,
        site_code: str = None,
        created_time: str = None,
        modified_time: str = None,
        is_catalogue: bool = None,
    ):
        # id
        self.id = id
        # siteId
        self.site_id = site_id
        # title
        self.title = title
        # type
        self.type = type
        # sort
        self.sort = sort
        # level
        self.level = level
        # parent_id
        self.parent_id = parent_id
        # sourceType
        self.source_type = source_type
        # show_type
        self.show_type = show_type
        # ext_id
        self.ext_id = ext_id
        # shield
        self.shie_id = shie_id
        # status
        self.status = status
        # deleted
        self.deleted = deleted
        # tree
        self.tree = tree
        # green
        self.green = green
        # site_code
        self.site_code = site_code
        # created_time
        self.created_time = created_time
        # modified_time
        self.modified_time = modified_time
        # isCatalogue
        self.is_catalogue = is_catalogue

    def validate(self):
        if self.created_time is not None:
            self.validate_pattern(self.created_time, 'created_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.modified_time is not None:
            self.validate_pattern(self.modified_time, 'modified_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.site_id is not None:
            result['site_id'] = self.site_id
        if self.title is not None:
            result['title'] = self.title
        if self.type is not None:
            result['type'] = self.type
        if self.sort is not None:
            result['sort'] = self.sort
        if self.level is not None:
            result['level'] = self.level
        if self.parent_id is not None:
            result['parent_id'] = self.parent_id
        if self.source_type is not None:
            result['source_type'] = self.source_type
        if self.show_type is not None:
            result['show_type'] = self.show_type
        if self.ext_id is not None:
            result['ext_id'] = self.ext_id
        if self.shie_id is not None:
            result['shie_id'] = self.shie_id
        if self.status is not None:
            result['status'] = self.status
        if self.deleted is not None:
            result['deleted'] = self.deleted
        if self.tree is not None:
            result['tree'] = self.tree
        if self.green is not None:
            result['green'] = self.green
        if self.site_code is not None:
            result['site_code'] = self.site_code
        if self.created_time is not None:
            result['created_time'] = self.created_time
        if self.modified_time is not None:
            result['modified_time'] = self.modified_time
        if self.is_catalogue is not None:
            result['is_catalogue'] = self.is_catalogue
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('site_id') is not None:
            self.site_id = m.get('site_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('sort') is not None:
            self.sort = m.get('sort')
        if m.get('level') is not None:
            self.level = m.get('level')
        if m.get('parent_id') is not None:
            self.parent_id = m.get('parent_id')
        if m.get('source_type') is not None:
            self.source_type = m.get('source_type')
        if m.get('show_type') is not None:
            self.show_type = m.get('show_type')
        if m.get('ext_id') is not None:
            self.ext_id = m.get('ext_id')
        if m.get('shie_id') is not None:
            self.shie_id = m.get('shie_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('deleted') is not None:
            self.deleted = m.get('deleted')
        if m.get('tree') is not None:
            self.tree = m.get('tree')
        if m.get('green') is not None:
            self.green = m.get('green')
        if m.get('site_code') is not None:
            self.site_code = m.get('site_code')
        if m.get('created_time') is not None:
            self.created_time = m.get('created_time')
        if m.get('modified_time') is not None:
            self.modified_time = m.get('modified_time')
        if m.get('is_catalogue') is not None:
            self.is_catalogue = m.get('is_catalogue')
        return self


class Attachment(TeaModel):
    def __init__(
        self,
        file_id: str = None,
        filename: str = None,
        url: str = None,
    ):
        # 文件唯一标识，作为幂等字段
        self.file_id = file_id
        # 文件名称，用作展示
        self.filename = filename
        # 访问地址
        self.url = url

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.url, 'url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.filename is not None:
            result['filename'] = self.filename
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('filename') is not None:
            self.filename = m.get('filename')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class ChannelTemplateInfo(TeaModel):
    def __init__(
        self,
        template_id: str = None,
        template_name: str = None,
        template_status: str = None,
        coupon_type: str = None,
        coupon_amount: str = None,
        currency: str = None,
        total_quota: int = None,
        released_quota: int = None,
        available_quota: int = None,
        template_start_time: str = None,
        template_end_time: str = None,
        item_codes: List[str] = None,
    ):
        # 优惠券模板id
        self.template_id = template_id
        # 模板名称
        self.template_name = template_name
        # 模板状态,APPROVED代表审批通过的模板
        self.template_status = template_status
        # 优惠券类型
        self.coupon_type = coupon_type
        # 单张优惠券的券面额，单位是 分/美分
        self.coupon_amount = coupon_amount
        # 券面额币种
        self.currency = currency
        # 模板最多允许发放的优惠券总数量
        self.total_quota = total_quota
        # 当前已经发出的优惠券数量
        self.released_quota = released_quota
        # 当前剩余可发数量
        self.available_quota = available_quota
        # 模板有效期开始时间
        self.template_start_time = template_start_time
        # 模板有效期结束时间
        self.template_end_time = template_end_time
        # 模板适用的商品编码列表
        self.item_codes = item_codes

    def validate(self):
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.template_status is not None:
            result['template_status'] = self.template_status
        if self.coupon_type is not None:
            result['coupon_type'] = self.coupon_type
        if self.coupon_amount is not None:
            result['coupon_amount'] = self.coupon_amount
        if self.currency is not None:
            result['currency'] = self.currency
        if self.total_quota is not None:
            result['total_quota'] = self.total_quota
        if self.released_quota is not None:
            result['released_quota'] = self.released_quota
        if self.available_quota is not None:
            result['available_quota'] = self.available_quota
        if self.template_start_time is not None:
            result['template_start_time'] = self.template_start_time
        if self.template_end_time is not None:
            result['template_end_time'] = self.template_end_time
        if self.item_codes is not None:
            result['item_codes'] = self.item_codes
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('template_status') is not None:
            self.template_status = m.get('template_status')
        if m.get('coupon_type') is not None:
            self.coupon_type = m.get('coupon_type')
        if m.get('coupon_amount') is not None:
            self.coupon_amount = m.get('coupon_amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('total_quota') is not None:
            self.total_quota = m.get('total_quota')
        if m.get('released_quota') is not None:
            self.released_quota = m.get('released_quota')
        if m.get('available_quota') is not None:
            self.available_quota = m.get('available_quota')
        if m.get('template_start_time') is not None:
            self.template_start_time = m.get('template_start_time')
        if m.get('template_end_time') is not None:
            self.template_end_time = m.get('template_end_time')
        if m.get('item_codes') is not None:
            self.item_codes = m.get('item_codes')
        return self


class ClueInformationReq(TeaModel):
    def __init__(
        self,
        title: str = None,
        status: str = None,
        created_user_nick: str = None,
        description: str = None,
        customer_name: str = None,
        biz_line: str = None,
        customer_location: str = None,
        corporate_contacts: List[CorporateContacts] = None,
        customer_industry: str = None,
        revenue_scale: str = None,
        social_credit_code: str = None,
        source: str = None,
        customer_id: str = None,
        tenant: str = None,
    ):
        # 线索标题
        self.title = title
        # 线索跟进状态   INIT:待确认 CONTACTED:跟进中 CLOSED:线索终止 TRANSFER:已转交 BUSINESS:转商机
        self.status = status
        # 线索跟进人  工号
        self.created_user_nick = created_user_nick
        # 线索描述
        self.description = description
        # 客户名称
        self.customer_name = customer_name
        # 业务线
        self.biz_line = biz_line
        # 客户地址
        self.customer_location = customer_location
        # 公司联系人
        self.corporate_contacts = corporate_contacts
        # 客户所在行业
        self.customer_industry = customer_industry
        # 客户营收规模
        self.revenue_scale = revenue_scale
        # 社会信用代码
        self.social_credit_code = social_credit_code
        # 线索来源
        self.source = source
        # 客户ID
        self.customer_id = customer_id
        # 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
        self.tenant = tenant

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.status, 'status')
        self.validate_required(self.created_user_nick, 'created_user_nick')
        self.validate_required(self.description, 'description')
        self.validate_required(self.customer_name, 'customer_name')
        self.validate_required(self.biz_line, 'biz_line')
        self.validate_required(self.customer_location, 'customer_location')
        if self.corporate_contacts:
            for k in self.corporate_contacts:
                if k:
                    k.validate()
        self.validate_required(self.customer_industry, 'customer_industry')
        self.validate_required(self.source, 'source')
        self.validate_required(self.tenant, 'tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.status is not None:
            result['status'] = self.status
        if self.created_user_nick is not None:
            result['created_user_nick'] = self.created_user_nick
        if self.description is not None:
            result['description'] = self.description
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.biz_line is not None:
            result['biz_line'] = self.biz_line
        if self.customer_location is not None:
            result['customer_location'] = self.customer_location
        result['corporate_contacts'] = []
        if self.corporate_contacts is not None:
            for k in self.corporate_contacts:
                result['corporate_contacts'].append(k.to_map() if k else None)
        if self.customer_industry is not None:
            result['customer_industry'] = self.customer_industry
        if self.revenue_scale is not None:
            result['revenue_scale'] = self.revenue_scale
        if self.social_credit_code is not None:
            result['social_credit_code'] = self.social_credit_code
        if self.source is not None:
            result['source'] = self.source
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.tenant is not None:
            result['tenant'] = self.tenant
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('created_user_nick') is not None:
            self.created_user_nick = m.get('created_user_nick')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('biz_line') is not None:
            self.biz_line = m.get('biz_line')
        if m.get('customer_location') is not None:
            self.customer_location = m.get('customer_location')
        self.corporate_contacts = []
        if m.get('corporate_contacts') is not None:
            for k in m.get('corporate_contacts'):
                temp_model = CorporateContacts()
                self.corporate_contacts.append(temp_model.from_map(k))
        if m.get('customer_industry') is not None:
            self.customer_industry = m.get('customer_industry')
        if m.get('revenue_scale') is not None:
            self.revenue_scale = m.get('revenue_scale')
        if m.get('social_credit_code') is not None:
            self.social_credit_code = m.get('social_credit_code')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('tenant') is not None:
            self.tenant = m.get('tenant')
        return self


class ContentObjVO(TeaModel):
    def __init__(
        self,
        novice_must_sees: List[NoviceMustSee] = None,
        popular_document: List[PopularDocument] = None,
        product_presentation: str = None,
    ):
        # novice_must_sees
        self.novice_must_sees = novice_must_sees
        # popular_document
        self.popular_document = popular_document
        # product_presentation
        self.product_presentation = product_presentation

    def validate(self):
        if self.novice_must_sees:
            for k in self.novice_must_sees:
                if k:
                    k.validate()
        if self.popular_document:
            for k in self.popular_document:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['novice_must_sees'] = []
        if self.novice_must_sees is not None:
            for k in self.novice_must_sees:
                result['novice_must_sees'].append(k.to_map() if k else None)
        result['popular_document'] = []
        if self.popular_document is not None:
            for k in self.popular_document:
                result['popular_document'].append(k.to_map() if k else None)
        if self.product_presentation is not None:
            result['product_presentation'] = self.product_presentation
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.novice_must_sees = []
        if m.get('novice_must_sees') is not None:
            for k in m.get('novice_must_sees'):
                temp_model = NoviceMustSee()
                self.novice_must_sees.append(temp_model.from_map(k))
        self.popular_document = []
        if m.get('popular_document') is not None:
            for k in m.get('popular_document'):
                temp_model = PopularDocument()
                self.popular_document.append(temp_model.from_map(k))
        if m.get('product_presentation') is not None:
            self.product_presentation = m.get('product_presentation')
        return self


class Coupon(TeaModel):
    def __init__(
        self,
        id: int = None,
        display_name: str = None,
        name: str = None,
        type: str = None,
        amount: str = None,
        used_amount: str = None,
        status: str = None,
        start_time: str = None,
        end_time: str = None,
        youhui_template_id: int = None,
        discount_rate: str = None,
        full_amount: str = None,
        usage_count: int = None,
        used_count: int = None,
        product_list: str = None,
        order_type_list: str = None,
        currency: str = None,
        high_precision_amount: str = None,
        high_precision_used_amount: str = None,
        high_precision_available_amount: str = None,
    ):
        # 优惠券ID
        self.id = id
        # 优惠券名称,前端展示
        self.display_name = display_name
        # 优惠券模板名称
        self.name = name
        # 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
        self.type = type
        # 优惠券总金额，单位（分）。可使用优惠金额为amount-used_amount
        self.amount = amount
        # 已使用金额，单位（分）。
        self.used_amount = used_amount
        # 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
        self.status = status
        # 有效期开始时间
        self.start_time = start_time
        # 有效期结束时间
        self.end_time = end_time
        # 模板id
        self.youhui_template_id = youhui_template_id
        # 优惠券=折扣券时使用，如0.75
        self.discount_rate = discount_rate
        # 优惠券类型=满减券时使用，如满2000元
        self.full_amount = full_amount
        # 可以使用的总次数
        self.usage_count = usage_count
        # 已使用次数（冻结次数）
        self.used_count = used_count
        # 适用产品：通用/ECS/RDS
        self.product_list = product_list
        # 适用订单类型
        self.order_type_list = order_type_list
        # 币种CurrencyCode CNY 代表人民币 USD代表美元
        self.currency = currency
        # 高精度总金额，单位元。可用金额 high_precision_available_amount = 总金额 high_precision_amount - 已使用金额 high_precision_used_amount
        self.high_precision_amount = high_precision_amount
        # 单位元
        self.high_precision_used_amount = high_precision_used_amount
        # 单位元
        self.high_precision_available_amount = high_precision_available_amount

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.youhui_template_id, 'youhui_template_id')
        self.validate_required(self.usage_count, 'usage_count')
        self.validate_required(self.used_count, 'used_count')
        self.validate_required(self.product_list, 'product_list')
        self.validate_required(self.order_type_list, 'order_type_list')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.high_precision_amount, 'high_precision_amount')
        self.validate_required(self.high_precision_used_amount, 'high_precision_used_amount')
        self.validate_required(self.high_precision_available_amount, 'high_precision_available_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.amount is not None:
            result['amount'] = self.amount
        if self.used_amount is not None:
            result['used_amount'] = self.used_amount
        if self.status is not None:
            result['status'] = self.status
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.youhui_template_id is not None:
            result['youhui_template_id'] = self.youhui_template_id
        if self.discount_rate is not None:
            result['discount_rate'] = self.discount_rate
        if self.full_amount is not None:
            result['full_amount'] = self.full_amount
        if self.usage_count is not None:
            result['usage_count'] = self.usage_count
        if self.used_count is not None:
            result['used_count'] = self.used_count
        if self.product_list is not None:
            result['product_list'] = self.product_list
        if self.order_type_list is not None:
            result['order_type_list'] = self.order_type_list
        if self.currency is not None:
            result['currency'] = self.currency
        if self.high_precision_amount is not None:
            result['high_precision_amount'] = self.high_precision_amount
        if self.high_precision_used_amount is not None:
            result['high_precision_used_amount'] = self.high_precision_used_amount
        if self.high_precision_available_amount is not None:
            result['high_precision_available_amount'] = self.high_precision_available_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('used_amount') is not None:
            self.used_amount = m.get('used_amount')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('youhui_template_id') is not None:
            self.youhui_template_id = m.get('youhui_template_id')
        if m.get('discount_rate') is not None:
            self.discount_rate = m.get('discount_rate')
        if m.get('full_amount') is not None:
            self.full_amount = m.get('full_amount')
        if m.get('usage_count') is not None:
            self.usage_count = m.get('usage_count')
        if m.get('used_count') is not None:
            self.used_count = m.get('used_count')
        if m.get('product_list') is not None:
            self.product_list = m.get('product_list')
        if m.get('order_type_list') is not None:
            self.order_type_list = m.get('order_type_list')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('high_precision_amount') is not None:
            self.high_precision_amount = m.get('high_precision_amount')
        if m.get('high_precision_used_amount') is not None:
            self.high_precision_used_amount = m.get('high_precision_used_amount')
        if m.get('high_precision_available_amount') is not None:
            self.high_precision_available_amount = m.get('high_precision_available_amount')
        return self


class PriceConditionAttr(TeaModel):
    def __init__(
        self,
        attr_code: str = None,
        attr_value_code: str = None,
        attr_value_name: str = None,
        operator: str = None,
    ):
        # 属性code
        self.attr_code = attr_code
        # 属性值code
        self.attr_value_code = attr_value_code
        # 属性值名称
        self.attr_value_name = attr_value_name
        # 运算符，只有在约束条件中会出现
        self.operator = operator

    def validate(self):
        self.validate_required(self.attr_code, 'attr_code')
        self.validate_required(self.attr_value_code, 'attr_value_code')
        self.validate_required(self.attr_value_name, 'attr_value_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.attr_code is not None:
            result['attr_code'] = self.attr_code
        if self.attr_value_code is not None:
            result['attr_value_code'] = self.attr_value_code
        if self.attr_value_name is not None:
            result['attr_value_name'] = self.attr_value_name
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('attr_code') is not None:
            self.attr_code = m.get('attr_code')
        if m.get('attr_value_code') is not None:
            self.attr_value_code = m.get('attr_value_code')
        if m.get('attr_value_name') is not None:
            self.attr_value_name = m.get('attr_value_name')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class CommodityAttribute(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        default_value: str = None,
        value_type: str = None,
        value_range: str = None,
        display_type: str = None,
        tips: str = None,
        unit: str = None,
    ):
        # 属性编码
        self.code = code
        # 属性名
        self.name = name
        # 默认值
        self.default_value = default_value
        # 属性值类型，离散值：DISCRETE，数值：NUMBER
        self.value_type = value_type
        # 当是离散值类型时，为多个离散值逗号分隔
        # 当是数值类型时，为JSON，结构为{"rangeType":"open", "min":1, "max": 100, "step:1}
        self.value_range = value_range
        # 展示类型
        self.display_type = display_type
        # 提示文案
        self.tips = tips
        # 单位
        self.unit = unit

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.default_value, 'default_value')
        self.validate_required(self.value_type, 'value_type')
        self.validate_required(self.value_range, 'value_range')
        self.validate_required(self.display_type, 'display_type')
        self.validate_required(self.tips, 'tips')
        self.validate_required(self.unit, 'unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.default_value is not None:
            result['default_value'] = self.default_value
        if self.value_type is not None:
            result['value_type'] = self.value_type
        if self.value_range is not None:
            result['value_range'] = self.value_range
        if self.display_type is not None:
            result['display_type'] = self.display_type
        if self.tips is not None:
            result['tips'] = self.tips
        if self.unit is not None:
            result['unit'] = self.unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('default_value') is not None:
            self.default_value = m.get('default_value')
        if m.get('value_type') is not None:
            self.value_type = m.get('value_type')
        if m.get('value_range') is not None:
            self.value_range = m.get('value_range')
        if m.get('display_type') is not None:
            self.display_type = m.get('display_type')
        if m.get('tips') is not None:
            self.tips = m.get('tips')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        return self


class NoExtendPrice(TeaModel):
    def __init__(
        self,
        condition_attrs: List[PriceConditionAttr] = None,
        ladder_start: str = None,
        ladder_end: str = None,
        price: str = None,
        pricing_method: str = None,
        ladder_interval_type: str = None,
        price_object_code: str = None,
        pricing_mode: str = None,
        unit: str = None,
        ladder_price_fixed: bool = None,
    ):
        # 定价条件
        self.condition_attrs = condition_attrs
        # 阶梯开始
        self.ladder_start = ladder_start
        # 阶梯结束
        self.ladder_end = ladder_end
        # 签约价
        self.price = price
        # 计价方法：具体公式、阶梯方法、自定义
        self.pricing_method = pricing_method
        # 阶梯区间类型，左开右闭/左闭右开
        self.ladder_interval_type = ladder_interval_type
        # 定价对象code
        self.price_object_code = price_object_code
        # 计价模式：公式、阶梯、自定义
        self.pricing_mode = pricing_mode
        # 价格单位
        self.unit = unit
        # 是否阶梯总价
        self.ladder_price_fixed = ladder_price_fixed

    def validate(self):
        if self.condition_attrs:
            for k in self.condition_attrs:
                if k:
                    k.validate()
        self.validate_required(self.ladder_start, 'ladder_start')
        self.validate_required(self.ladder_end, 'ladder_end')
        self.validate_required(self.price, 'price')
        self.validate_required(self.pricing_method, 'pricing_method')
        self.validate_required(self.ladder_interval_type, 'ladder_interval_type')
        self.validate_required(self.price_object_code, 'price_object_code')
        self.validate_required(self.pricing_mode, 'pricing_mode')
        self.validate_required(self.unit, 'unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['condition_attrs'] = []
        if self.condition_attrs is not None:
            for k in self.condition_attrs:
                result['condition_attrs'].append(k.to_map() if k else None)
        if self.ladder_start is not None:
            result['ladder_start'] = self.ladder_start
        if self.ladder_end is not None:
            result['ladder_end'] = self.ladder_end
        if self.price is not None:
            result['price'] = self.price
        if self.pricing_method is not None:
            result['pricing_method'] = self.pricing_method
        if self.ladder_interval_type is not None:
            result['ladder_interval_type'] = self.ladder_interval_type
        if self.price_object_code is not None:
            result['price_object_code'] = self.price_object_code
        if self.pricing_mode is not None:
            result['pricing_mode'] = self.pricing_mode
        if self.unit is not None:
            result['unit'] = self.unit
        if self.ladder_price_fixed is not None:
            result['ladder_price_fixed'] = self.ladder_price_fixed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.condition_attrs = []
        if m.get('condition_attrs') is not None:
            for k in m.get('condition_attrs'):
                temp_model = PriceConditionAttr()
                self.condition_attrs.append(temp_model.from_map(k))
        if m.get('ladder_start') is not None:
            self.ladder_start = m.get('ladder_start')
        if m.get('ladder_end') is not None:
            self.ladder_end = m.get('ladder_end')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('pricing_method') is not None:
            self.pricing_method = m.get('pricing_method')
        if m.get('ladder_interval_type') is not None:
            self.ladder_interval_type = m.get('ladder_interval_type')
        if m.get('price_object_code') is not None:
            self.price_object_code = m.get('price_object_code')
        if m.get('pricing_mode') is not None:
            self.pricing_mode = m.get('pricing_mode')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('ladder_price_fixed') is not None:
            self.ladder_price_fixed = m.get('ladder_price_fixed')
        return self


class OrderDuration(TeaModel):
    def __init__(
        self,
        duration_type: str = None,
        duration_value: int = None,
    ):
        # 周期类型，YEAR：年；MONTH：月；DAY：日
        self.duration_type = duration_type
        # 订购周期值
        self.duration_value = duration_value

    def validate(self):
        self.validate_required(self.duration_type, 'duration_type')
        self.validate_required(self.duration_value, 'duration_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.duration_type is not None:
            result['duration_type'] = self.duration_type
        if self.duration_value is not None:
            result['duration_value'] = self.duration_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('duration_type') is not None:
            self.duration_type = m.get('duration_type')
        if m.get('duration_value') is not None:
            self.duration_value = m.get('duration_value')
        return self


class PostPayPrice(TeaModel):
    def __init__(
        self,
        currency_value: str = None,
        duration: OrderDuration = None,
        no_extend_prices: List[NoExtendPrice] = None,
    ):
        # 币种单位值，156（CNY)
        self.currency_value = currency_value
        # 价格周期
        self.duration = duration
        # 非继承型一客一价
        self.no_extend_prices = no_extend_prices

    def validate(self):
        if self.duration:
            self.duration.validate()
        if self.no_extend_prices:
            for k in self.no_extend_prices:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.currency_value is not None:
            result['currency_value'] = self.currency_value
        if self.duration is not None:
            result['duration'] = self.duration.to_map()
        result['no_extend_prices'] = []
        if self.no_extend_prices is not None:
            for k in self.no_extend_prices:
                result['no_extend_prices'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('currency_value') is not None:
            self.currency_value = m.get('currency_value')
        if m.get('duration') is not None:
            temp_model = OrderDuration()
            self.duration = temp_model.from_map(m['duration'])
        self.no_extend_prices = []
        if m.get('no_extend_prices') is not None:
            for k in m.get('no_extend_prices'):
                temp_model = NoExtendPrice()
                self.no_extend_prices.append(temp_model.from_map(k))
        return self


class CommodityOrderAttribute(TeaModel):
    def __init__(
        self,
        code: str = None,
        value: str = None,
        value_unit: str = None,
    ):
        # 属性编码
        self.code = code
        # 属性值
        self.value = value
        # 属性值单位，部分数值型属性有多种单位，需要填入；其他情况不需要填
        self.value_unit = value_unit

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.value, 'value')
        self.validate_required(self.value_unit, 'value_unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.value is not None:
            result['value'] = self.value
        if self.value_unit is not None:
            result['value_unit'] = self.value_unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('value_unit') is not None:
            self.value_unit = m.get('value_unit')
        return self


class PrepayAmount(TeaModel):
    def __init__(
        self,
        amount: str = None,
        currency: str = None,
    ):
        # 指定预付费金额
        self.amount = amount
        # 币种单位，CNY\USD等标准币种单位编码
        self.currency = currency

    def validate(self):
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.currency, 'currency')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.amount is not None:
            result['amount'] = self.amount
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class FulfillmentOptions(TeaModel):
    def __init__(
        self,
        deplay: bool = None,
        start_time: str = None,
        spi_skip: bool = None,
    ):
        # 是否延迟履约，默认false
        self.deplay = deplay
        # 实际履约开始时间，默认支付完成时间；只有deplay=true时，start_time才生效
        self.start_time = start_time
        # 跳过SPI回调，默认false，优先级高于商品上默认的接入属性
        self.spi_skip = spi_skip

    def validate(self):
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.deplay is not None:
            result['deplay'] = self.deplay
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.spi_skip is not None:
            result['spi_skip'] = self.spi_skip
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('deplay') is not None:
            self.deplay = m.get('deplay')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('spi_skip') is not None:
            self.spi_skip = m.get('spi_skip')
        return self


class ComboCommodityOrder(TeaModel):
    def __init__(
        self,
        commodity_code: str = None,
        status: str = None,
        instance_ids: List[str] = None,
    ):
        # 商品编码
        self.commodity_code = commodity_code
        # 状态
        self.status = status
        # 实例ID列表
        self.instance_ids = instance_ids

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.status, 'status')
        self.validate_required(self.instance_ids, 'instance_ids')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.status is not None:
            result['status'] = self.status
        if self.instance_ids is not None:
            result['instance_ids'] = self.instance_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('instance_ids') is not None:
            self.instance_ids = m.get('instance_ids')
        return self


class ComboCommodity(TeaModel):
    def __init__(
        self,
        name: str = None,
        unique_code: str = None,
        inner_code: str = None,
        type: str = None,
        charge_type: str = None,
        attrs: List[CommodityAttribute] = None,
        quantity: int = None,
        extends_config: str = None,
    ):
        # 商品名称
        self.name = name
        # 商品在套餐中的唯一编码，当一个套餐中存在两个一样的商品时，编码会不一样
        self.unique_code = unique_code
        # 商品主数据编码
        self.inner_code = inner_code
        # 商品类型，资源包：attach
        self.type = type
        # 付费方式，预付：PREPAY，按量付费：POSTPAY
        self.charge_type = charge_type
        # 销售属性列表
        self.attrs = attrs
        # 商品数量
        self.quantity = quantity
        # 扩展信息，JSON结构，包含标签、个性化配置等数据
        self.extends_config = extends_config

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.unique_code, 'unique_code')
        self.validate_required(self.inner_code, 'inner_code')
        self.validate_required(self.type, 'type')
        self.validate_required(self.charge_type, 'charge_type')
        self.validate_required(self.attrs, 'attrs')
        if self.attrs:
            for k in self.attrs:
                if k:
                    k.validate()
        self.validate_required(self.quantity, 'quantity')
        self.validate_required(self.extends_config, 'extends_config')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.unique_code is not None:
            result['unique_code'] = self.unique_code
        if self.inner_code is not None:
            result['inner_code'] = self.inner_code
        if self.type is not None:
            result['type'] = self.type
        if self.charge_type is not None:
            result['charge_type'] = self.charge_type
        result['attrs'] = []
        if self.attrs is not None:
            for k in self.attrs:
                result['attrs'].append(k.to_map() if k else None)
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.extends_config is not None:
            result['extends_config'] = self.extends_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('unique_code') is not None:
            self.unique_code = m.get('unique_code')
        if m.get('inner_code') is not None:
            self.inner_code = m.get('inner_code')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('charge_type') is not None:
            self.charge_type = m.get('charge_type')
        self.attrs = []
        if m.get('attrs') is not None:
            for k in m.get('attrs'):
                temp_model = CommodityAttribute()
                self.attrs.append(temp_model.from_map(k))
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('extends_config') is not None:
            self.extends_config = m.get('extends_config')
        return self


class PayOptions(TeaModel):
    def __init__(
        self,
        pay_channel: str = None,
        payment_method: str = None,
    ):
        # 系统自动会根据账号类型、当前OU进行付费渠道判定；如果传入的付款渠道不满足，则报错
        self.pay_channel = pay_channel
        # 支付方式，例如：直付通
        self.payment_method = payment_method

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        if self.payment_method is not None:
            result['payment_method'] = self.payment_method
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        if m.get('payment_method') is not None:
            self.payment_method = m.get('payment_method')
        return self


class ComboOrderPayOptions(TeaModel):
    def __init__(
        self,
        auto_cancel_paying_order: bool = None,
    ):
        # 支付中的订单是否自动取消。false：不会自动取消；true：自动取消(兜底时间=支付链接超时时间+3m)
        self.auto_cancel_paying_order = auto_cancel_paying_order

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auto_cancel_paying_order is not None:
            result['auto_cancel_paying_order'] = self.auto_cancel_paying_order
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auto_cancel_paying_order') is not None:
            self.auto_cancel_paying_order = m.get('auto_cancel_paying_order')
        return self


class ProvisionOption(TeaModel):
    def __init__(
        self,
        order_start_time: str = None,
    ):
        # 订单开始时间 (ISO 8601 UTC)，可自定义覆盖默认值
        self.order_start_time = order_start_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_start_time is not None:
            result['order_start_time'] = self.order_start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_start_time') is not None:
            self.order_start_time = m.get('order_start_time')
        return self


class InstanceCapacity(TeaModel):
    def __init__(
        self,
        instance_id: str = None,
        current_capacity: str = None,
        initial_capacity: str = None,
        start_time: str = None,
        end_time: str = None,
        status: str = None,
        commodity_code: str = None,
        rel_postpay_commodity: str = None,
    ):
        # 实例ID
        self.instance_id = instance_id
        # 当前剩余容量
        self.current_capacity = current_capacity
        # 初始容量
        self.initial_capacity = initial_capacity
        # 起始时间
        self.start_time = start_time
        # 截止时间
        self.end_time = end_time
        # Valid：有效；Closed：已用完；Expired:已到期
        self.status = status
        # 资源包对应商品码
        self.commodity_code = commodity_code
        # 关联按量商品码
        self.rel_postpay_commodity = rel_postpay_commodity

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.current_capacity, 'current_capacity')
        self.validate_required(self.initial_capacity, 'initial_capacity')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.status, 'status')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.rel_postpay_commodity, 'rel_postpay_commodity')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.current_capacity is not None:
            result['current_capacity'] = self.current_capacity
        if self.initial_capacity is not None:
            result['initial_capacity'] = self.initial_capacity
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.status is not None:
            result['status'] = self.status
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.rel_postpay_commodity is not None:
            result['rel_postpay_commodity'] = self.rel_postpay_commodity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('current_capacity') is not None:
            self.current_capacity = m.get('current_capacity')
        if m.get('initial_capacity') is not None:
            self.initial_capacity = m.get('initial_capacity')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('rel_postpay_commodity') is not None:
            self.rel_postpay_commodity = m.get('rel_postpay_commodity')
        return self


class CommoditySyncCommonBuyInfo(TeaModel):
    def __init__(
        self,
        common_buy_sale_group_list_json: List[str] = None,
        offer_attr_list_json: List[str] = None,
        prod_offer_region_list_json: List[str] = None,
        offer_attr_group_list_json: List[str] = None,
        offer_extend_attr_list_json: List[str] = None,
        offer_common_buy_group_list_json: List[str] = None,
        offer_attr_constraints_list_fson: List[str] = None,
        offer_rule_group_list_json: List[str] = None,
    ):
        # 商品列表配置 ListJson字符串
        self.common_buy_sale_group_list_json = common_buy_sale_group_list_json
        # 规格配置 ListJson字符串
        self.offer_attr_list_json = offer_attr_list_json
        # Region配置 ListJson字符串
        self.prod_offer_region_list_json = prod_offer_region_list_json
        # 费用项配置 ListJson字符串
        self.offer_attr_group_list_json = offer_attr_group_list_json
        # 属性配置 ListJson字符串
        self.offer_extend_attr_list_json = offer_extend_attr_list_json
        # 界面归类配置 ListJson字符串
        self.offer_common_buy_group_list_json = offer_common_buy_group_list_json
        # 规格约束配置 ListJson字符串
        self.offer_attr_constraints_list_fson = offer_attr_constraints_list_fson
        # 售卖规则配置 ListJson字符串
        self.offer_rule_group_list_json = offer_rule_group_list_json

    def validate(self):
        self.validate_required(self.common_buy_sale_group_list_json, 'common_buy_sale_group_list_json')
        self.validate_required(self.offer_attr_list_json, 'offer_attr_list_json')
        self.validate_required(self.prod_offer_region_list_json, 'prod_offer_region_list_json')
        self.validate_required(self.offer_attr_group_list_json, 'offer_attr_group_list_json')
        self.validate_required(self.offer_extend_attr_list_json, 'offer_extend_attr_list_json')
        self.validate_required(self.offer_common_buy_group_list_json, 'offer_common_buy_group_list_json')
        self.validate_required(self.offer_attr_constraints_list_fson, 'offer_attr_constraints_list_fson')
        self.validate_required(self.offer_rule_group_list_json, 'offer_rule_group_list_json')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.common_buy_sale_group_list_json is not None:
            result['common_buy_sale_group_list_json'] = self.common_buy_sale_group_list_json
        if self.offer_attr_list_json is not None:
            result['offer_attr_list_json'] = self.offer_attr_list_json
        if self.prod_offer_region_list_json is not None:
            result['prod_offer_region_list_json'] = self.prod_offer_region_list_json
        if self.offer_attr_group_list_json is not None:
            result['offer_attr_group_list_json'] = self.offer_attr_group_list_json
        if self.offer_extend_attr_list_json is not None:
            result['offer_extend_attr_list_json'] = self.offer_extend_attr_list_json
        if self.offer_common_buy_group_list_json is not None:
            result['offer_common_buy_group_list_json'] = self.offer_common_buy_group_list_json
        if self.offer_attr_constraints_list_fson is not None:
            result['offer_attr_constraints_list_fson'] = self.offer_attr_constraints_list_fson
        if self.offer_rule_group_list_json is not None:
            result['offer_rule_group_list_json'] = self.offer_rule_group_list_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('common_buy_sale_group_list_json') is not None:
            self.common_buy_sale_group_list_json = m.get('common_buy_sale_group_list_json')
        if m.get('offer_attr_list_json') is not None:
            self.offer_attr_list_json = m.get('offer_attr_list_json')
        if m.get('prod_offer_region_list_json') is not None:
            self.prod_offer_region_list_json = m.get('prod_offer_region_list_json')
        if m.get('offer_attr_group_list_json') is not None:
            self.offer_attr_group_list_json = m.get('offer_attr_group_list_json')
        if m.get('offer_extend_attr_list_json') is not None:
            self.offer_extend_attr_list_json = m.get('offer_extend_attr_list_json')
        if m.get('offer_common_buy_group_list_json') is not None:
            self.offer_common_buy_group_list_json = m.get('offer_common_buy_group_list_json')
        if m.get('offer_attr_constraints_list_fson') is not None:
            self.offer_attr_constraints_list_fson = m.get('offer_attr_constraints_list_fson')
        if m.get('offer_rule_group_list_json') is not None:
            self.offer_rule_group_list_json = m.get('offer_rule_group_list_json')
        return self


class CommodityInstance(TeaModel):
    def __init__(
        self,
        biz_no: str = None,
        commodity_code: str = None,
        ou: str = None,
        order_type: str = None,
        duration: OrderDuration = None,
        coupon_id: str = None,
        quantity: int = None,
        commodity_attrs: List[CommodityOrderAttribute] = None,
        fulfillment_options: FulfillmentOptions = None,
        instance_id: str = None,
        prepay_amount: PrepayAmount = None,
        post_pay_price: PostPayPrice = None,
    ):
        # 订单号
        self.biz_no = biz_no
        # 商品编码
        self.commodity_code = commodity_code
        # 销售主体，不传默认ZL6
        self.ou = ou
        # 订单类型，NEW：新购；RENEW：续费； MODIFY：变配 不填默认新购
        self.order_type = order_type
        # 订购时长
        self.duration = duration
        # 优惠券ID
        self.coupon_id = coupon_id
        # 数量，不填默认1
        self.quantity = quantity
        # 
        # 商品订购属性，开通型商品部需要填写
        self.commodity_attrs = commodity_attrs
        # 履约选项
        self.fulfillment_options = fulfillment_options
        # 实例ID，续费/变配场景必传
        self.instance_id = instance_id
        # 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
        self.prepay_amount = prepay_amount
        # 后付商品签约价，用于在履约阶段生成一客一价
        self.post_pay_price = post_pay_price

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        if self.duration:
            self.duration.validate()
        if self.commodity_attrs:
            for k in self.commodity_attrs:
                if k:
                    k.validate()
        if self.fulfillment_options:
            self.fulfillment_options.validate()
        if self.prepay_amount:
            self.prepay_amount.validate()
        if self.post_pay_price:
            self.post_pay_price.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.ou is not None:
            result['ou'] = self.ou
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.duration is not None:
            result['duration'] = self.duration.to_map()
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        if self.quantity is not None:
            result['quantity'] = self.quantity
        result['commodity_attrs'] = []
        if self.commodity_attrs is not None:
            for k in self.commodity_attrs:
                result['commodity_attrs'].append(k.to_map() if k else None)
        if self.fulfillment_options is not None:
            result['fulfillment_options'] = self.fulfillment_options.to_map()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.prepay_amount is not None:
            result['prepay_amount'] = self.prepay_amount.to_map()
        if self.post_pay_price is not None:
            result['post_pay_price'] = self.post_pay_price.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('duration') is not None:
            temp_model = OrderDuration()
            self.duration = temp_model.from_map(m['duration'])
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        self.commodity_attrs = []
        if m.get('commodity_attrs') is not None:
            for k in m.get('commodity_attrs'):
                temp_model = CommodityOrderAttribute()
                self.commodity_attrs.append(temp_model.from_map(k))
        if m.get('fulfillment_options') is not None:
            temp_model = FulfillmentOptions()
            self.fulfillment_options = temp_model.from_map(m['fulfillment_options'])
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('prepay_amount') is not None:
            temp_model = PrepayAmount()
            self.prepay_amount = temp_model.from_map(m['prepay_amount'])
        if m.get('post_pay_price') is not None:
            temp_model = PostPayPrice()
            self.post_pay_price = temp_model.from_map(m['post_pay_price'])
        return self


class ComboItemDTO(TeaModel):
    def __init__(
        self,
        id: int = None,
        unique_code: str = None,
        offer_name: str = None,
        offer_inner_code: str = None,
        offer_sale_code: str = None,
        offer_attr: str = None,
        offer_attr_desc: str = None,
        charge_type: str = None,
        quantity: int = None,
        duration_type: str = None,
        duration_value: int = None,
        required: bool = None,
        seq_order: int = None,
        extends_config: str = None,
        offer_attr_option: str = None,
    ):
        # 主键ID
        self.id = id
        # 唯一编码
        self.unique_code = unique_code
        # 商品名称
        self.offer_name = offer_name
        # 商品主数据CODE
        self.offer_inner_code = offer_inner_code
        # 商品销售CODE（仅当指定 ou 且商品在该 OU 下上架时有值）
        self.offer_sale_code = offer_sale_code
        # 商品规格，JSON 结构
        self.offer_attr = offer_attr
        # 商品规格描述
        self.offer_attr_desc = offer_attr_desc
        # 付费方式（如 AFTER_PAY_BY_HOUR 后付费量价、PREPAY_BY_MONTH 预付费包年包月）
        self.charge_type = charge_type
        # 商品数量
        self.quantity = quantity
        # 订购周期类型
        self.duration_type = duration_type
        # 订购周期值
        self.duration_value = duration_value
        # 是否必选（true 必选，false 可选）
        self.required = required
        # 商品在套餐中的排序
        self.seq_order = seq_order
        # 扩展配置
        self.extends_config = extends_config
        # 商品规格 JSON 结构，CommodityInfo 的 JSON 序列化字符串
        self.offer_attr_option = offer_attr_option

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.unique_code is not None:
            result['unique_code'] = self.unique_code
        if self.offer_name is not None:
            result['offer_name'] = self.offer_name
        if self.offer_inner_code is not None:
            result['offer_inner_code'] = self.offer_inner_code
        if self.offer_sale_code is not None:
            result['offer_sale_code'] = self.offer_sale_code
        if self.offer_attr is not None:
            result['offer_attr'] = self.offer_attr
        if self.offer_attr_desc is not None:
            result['offer_attr_desc'] = self.offer_attr_desc
        if self.charge_type is not None:
            result['charge_type'] = self.charge_type
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.duration_type is not None:
            result['duration_type'] = self.duration_type
        if self.duration_value is not None:
            result['duration_value'] = self.duration_value
        if self.required is not None:
            result['required'] = self.required
        if self.seq_order is not None:
            result['seq_order'] = self.seq_order
        if self.extends_config is not None:
            result['extends_config'] = self.extends_config
        if self.offer_attr_option is not None:
            result['offer_attr_option'] = self.offer_attr_option
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('unique_code') is not None:
            self.unique_code = m.get('unique_code')
        if m.get('offer_name') is not None:
            self.offer_name = m.get('offer_name')
        if m.get('offer_inner_code') is not None:
            self.offer_inner_code = m.get('offer_inner_code')
        if m.get('offer_sale_code') is not None:
            self.offer_sale_code = m.get('offer_sale_code')
        if m.get('offer_attr') is not None:
            self.offer_attr = m.get('offer_attr')
        if m.get('offer_attr_desc') is not None:
            self.offer_attr_desc = m.get('offer_attr_desc')
        if m.get('charge_type') is not None:
            self.charge_type = m.get('charge_type')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('duration_type') is not None:
            self.duration_type = m.get('duration_type')
        if m.get('duration_value') is not None:
            self.duration_value = m.get('duration_value')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('seq_order') is not None:
            self.seq_order = m.get('seq_order')
        if m.get('extends_config') is not None:
            self.extends_config = m.get('extends_config')
        if m.get('offer_attr_option') is not None:
            self.offer_attr_option = m.get('offer_attr_option')
        return self


class ComboOrder(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        biz_no: str = None,
        order_id: str = None,
        combo_code: str = None,
        combo_name: str = None,
        status: str = None,
        provision_status: str = None,
        original_amount: str = None,
        discount_amount: str = None,
        coupon_amount: str = None,
        pay_amount: str = None,
        gmt_create: str = None,
        commodity_orders: List[ComboCommodityOrder] = None,
        pay_time: str = None,
        pay_channel: str = None,
    ):
        # 租户ID
        self.tenant_id = tenant_id
        # 业务流水号
        self.biz_no = biz_no
        # 套餐订单号
        self.order_id = order_id
        # 套餐编码
        self.combo_code = combo_code
        # 套餐名称，下单时的套餐名称
        self.combo_name = combo_name
        # 订单状态，CREATED：创建；CANCEL：取消；PAYING：支付中；PAID：支付完成
        self.status = status
        # 履约生产状态，INCOMPLETE:未完成、COMPLETED:完成
        self.provision_status = provision_status
        # 订单原始金额
        self.original_amount = original_amount
        # 折扣金额
        self.discount_amount = discount_amount
        # 优惠金额
        self.coupon_amount = coupon_amount
        # 实付金额
        self.pay_amount = pay_amount
        # 下单时间
        self.gmt_create = gmt_create
        # 套餐内商品订单列表
        self.commodity_orders = commodity_orders
        # 支付完成时间
        self.pay_time = pay_time
        # 支付渠道
        self.pay_channel = pay_channel

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.combo_code, 'combo_code')
        self.validate_required(self.combo_name, 'combo_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.provision_status, 'provision_status')
        self.validate_required(self.original_amount, 'original_amount')
        self.validate_required(self.discount_amount, 'discount_amount')
        self.validate_required(self.coupon_amount, 'coupon_amount')
        self.validate_required(self.pay_amount, 'pay_amount')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.commodity_orders, 'commodity_orders')
        if self.commodity_orders:
            for k in self.commodity_orders:
                if k:
                    k.validate()
        self.validate_required(self.pay_time, 'pay_time')
        if self.pay_time is not None:
            self.validate_pattern(self.pay_time, 'pay_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.pay_channel, 'pay_channel')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.combo_code is not None:
            result['combo_code'] = self.combo_code
        if self.combo_name is not None:
            result['combo_name'] = self.combo_name
        if self.status is not None:
            result['status'] = self.status
        if self.provision_status is not None:
            result['provision_status'] = self.provision_status
        if self.original_amount is not None:
            result['original_amount'] = self.original_amount
        if self.discount_amount is not None:
            result['discount_amount'] = self.discount_amount
        if self.coupon_amount is not None:
            result['coupon_amount'] = self.coupon_amount
        if self.pay_amount is not None:
            result['pay_amount'] = self.pay_amount
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        result['commodity_orders'] = []
        if self.commodity_orders is not None:
            for k in self.commodity_orders:
                result['commodity_orders'].append(k.to_map() if k else None)
        if self.pay_time is not None:
            result['pay_time'] = self.pay_time
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('combo_code') is not None:
            self.combo_code = m.get('combo_code')
        if m.get('combo_name') is not None:
            self.combo_name = m.get('combo_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('provision_status') is not None:
            self.provision_status = m.get('provision_status')
        if m.get('original_amount') is not None:
            self.original_amount = m.get('original_amount')
        if m.get('discount_amount') is not None:
            self.discount_amount = m.get('discount_amount')
        if m.get('coupon_amount') is not None:
            self.coupon_amount = m.get('coupon_amount')
        if m.get('pay_amount') is not None:
            self.pay_amount = m.get('pay_amount')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        self.commodity_orders = []
        if m.get('commodity_orders') is not None:
            for k in m.get('commodity_orders'):
                temp_model = ComboCommodityOrder()
                self.commodity_orders.append(temp_model.from_map(k))
        if m.get('pay_time') is not None:
            self.pay_time = m.get('pay_time')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        return self


class CommodityPricing(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        return self


class InstanceLabel(TeaModel):
    def __init__(
        self,
        instance_key: str = None,
        instance_value: str = None,
    ):
        # 标签名。
        # 传递isvId
        self.instance_key = instance_key
        # 标签值
        self.instance_value = instance_value

    def validate(self):
        self.validate_required(self.instance_key, 'instance_key')
        self.validate_required(self.instance_value, 'instance_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_key is not None:
            result['instance_key'] = self.instance_key
        if self.instance_value is not None:
            result['instance_value'] = self.instance_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instance_key') is not None:
            self.instance_key = m.get('instance_key')
        if m.get('instance_value') is not None:
            self.instance_value = m.get('instance_value')
        return self


class PriceStrategy(TeaModel):
    def __init__(
        self,
        follow_tenant_id: str = None,
    ):
        # 继承租户在商品下的价格，仅后付费商品生效
        self.follow_tenant_id = follow_tenant_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.follow_tenant_id is not None:
            result['follow_tenant_id'] = self.follow_tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('follow_tenant_id') is not None:
            self.follow_tenant_id = m.get('follow_tenant_id')
        return self


class OfferSyncCommonBuyInfo(TeaModel):
    def __init__(
        self,
        common_buy_sale_group_list_json: List[str] = None,
        offer_attr_list_json: List[str] = None,
        prod_offer_region_list_json: List[str] = None,
        offer_attr_group_list_json: List[str] = None,
        offer_extend_attr_list_json: List[str] = None,
        offer_common_buy_group_list_json: List[str] = None,
        offer_attr_constraints_list_json: List[str] = None,
        offer_rule_group_list_json: List[str] = None,
    ):
        # 商品列表配置 ListJson字符串
        self.common_buy_sale_group_list_json = common_buy_sale_group_list_json
        # 规格配置 ListJson字符串
        self.offer_attr_list_json = offer_attr_list_json
        # Region配置 ListJson字符串
        self.prod_offer_region_list_json = prod_offer_region_list_json
        # 费用项配置 ListJson字符串
        self.offer_attr_group_list_json = offer_attr_group_list_json
        # 属性配置 ListJson字符串
        self.offer_extend_attr_list_json = offer_extend_attr_list_json
        # 界面归类配置 ListJson字符串
        self.offer_common_buy_group_list_json = offer_common_buy_group_list_json
        # 规格约束配置 ListJson字符串
        self.offer_attr_constraints_list_json = offer_attr_constraints_list_json
        # 售卖规则配置 ListJson字符串
        self.offer_rule_group_list_json = offer_rule_group_list_json

    def validate(self):
        self.validate_required(self.common_buy_sale_group_list_json, 'common_buy_sale_group_list_json')
        self.validate_required(self.offer_attr_list_json, 'offer_attr_list_json')
        self.validate_required(self.prod_offer_region_list_json, 'prod_offer_region_list_json')
        self.validate_required(self.offer_attr_group_list_json, 'offer_attr_group_list_json')
        self.validate_required(self.offer_extend_attr_list_json, 'offer_extend_attr_list_json')
        self.validate_required(self.offer_common_buy_group_list_json, 'offer_common_buy_group_list_json')
        self.validate_required(self.offer_attr_constraints_list_json, 'offer_attr_constraints_list_json')
        self.validate_required(self.offer_rule_group_list_json, 'offer_rule_group_list_json')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.common_buy_sale_group_list_json is not None:
            result['common_buy_sale_group_list_json'] = self.common_buy_sale_group_list_json
        if self.offer_attr_list_json is not None:
            result['offer_attr_list_json'] = self.offer_attr_list_json
        if self.prod_offer_region_list_json is not None:
            result['prod_offer_region_list_json'] = self.prod_offer_region_list_json
        if self.offer_attr_group_list_json is not None:
            result['offer_attr_group_list_json'] = self.offer_attr_group_list_json
        if self.offer_extend_attr_list_json is not None:
            result['offer_extend_attr_list_json'] = self.offer_extend_attr_list_json
        if self.offer_common_buy_group_list_json is not None:
            result['offer_common_buy_group_list_json'] = self.offer_common_buy_group_list_json
        if self.offer_attr_constraints_list_json is not None:
            result['offer_attr_constraints_list_json'] = self.offer_attr_constraints_list_json
        if self.offer_rule_group_list_json is not None:
            result['offer_rule_group_list_json'] = self.offer_rule_group_list_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('common_buy_sale_group_list_json') is not None:
            self.common_buy_sale_group_list_json = m.get('common_buy_sale_group_list_json')
        if m.get('offer_attr_list_json') is not None:
            self.offer_attr_list_json = m.get('offer_attr_list_json')
        if m.get('prod_offer_region_list_json') is not None:
            self.prod_offer_region_list_json = m.get('prod_offer_region_list_json')
        if m.get('offer_attr_group_list_json') is not None:
            self.offer_attr_group_list_json = m.get('offer_attr_group_list_json')
        if m.get('offer_extend_attr_list_json') is not None:
            self.offer_extend_attr_list_json = m.get('offer_extend_attr_list_json')
        if m.get('offer_common_buy_group_list_json') is not None:
            self.offer_common_buy_group_list_json = m.get('offer_common_buy_group_list_json')
        if m.get('offer_attr_constraints_list_json') is not None:
            self.offer_attr_constraints_list_json = m.get('offer_attr_constraints_list_json')
        if m.get('offer_rule_group_list_json') is not None:
            self.offer_rule_group_list_json = m.get('offer_rule_group_list_json')
        return self


class CreateTradeOrderResult(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        biz_no: str = None,
        instance_ids: List[str] = None,
        pay_status: str = None,
        order_error_code: str = None,
        order_error_description: str = None,
    ):
        # 订单号
        self.order_id = order_id
        # 下单时的订单号
        self.biz_no = biz_no
        # 实例ID列表
        self.instance_ids = instance_ids
        # 订单状态
        self.pay_status = pay_status
        # 订购错误码
        self.order_error_code = order_error_code
        # 订购错误描述
        self.order_error_description = order_error_description

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.pay_status, 'pay_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.instance_ids is not None:
            result['instance_ids'] = self.instance_ids
        if self.pay_status is not None:
            result['pay_status'] = self.pay_status
        if self.order_error_code is not None:
            result['order_error_code'] = self.order_error_code
        if self.order_error_description is not None:
            result['order_error_description'] = self.order_error_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('instance_ids') is not None:
            self.instance_ids = m.get('instance_ids')
        if m.get('pay_status') is not None:
            self.pay_status = m.get('pay_status')
        if m.get('order_error_code') is not None:
            self.order_error_code = m.get('order_error_code')
        if m.get('order_error_description') is not None:
            self.order_error_description = m.get('order_error_description')
        return self


class CommodityEnquiryPrice(TeaModel):
    def __init__(
        self,
        commodity_code: str = None,
        commodity_name: str = None,
        pay_amount: str = None,
        original_amount: str = None,
        discount_amount: str = None,
        coupon_amount: str = None,
        subscription_unused_amount: str = None,
        activity_code: str = None,
        activity_name: str = None,
        price_plan_id: int = None,
        price_constraint_id: int = None,
        currency: str = None,
        min_duration_of_valid_pay_amount: OrderDuration = None,
        discount_rate: str = None,
        original_bd_amount: str = None,
        original_cost_amount: str = None,
        pay_amount_before_gst: str = None,
        pay_amount_of_gst: str = None,
    ):
        # 商品主数据编码
        self.commodity_code = commodity_code
        # 商品名称
        self.commodity_name = commodity_name
        # 预付-支付金额
        self.pay_amount = pay_amount
        # 预付费-原始金额
        self.original_amount = original_amount
        # 预付费-折扣金额
        self.discount_amount = discount_amount
        # 预付费-优惠券抵扣金额
        self.coupon_amount = coupon_amount
        # 原订购剩余价值，用于变配场景
        self.subscription_unused_amount = subscription_unused_amount
        # 命中的活动编码
        self.activity_code = activity_code
        # 命中的活动名称
        self.activity_name = activity_name
        # 命中的定价计划ID
        self.price_plan_id = price_plan_id
        # 命中的定价约束ID
        self.price_constraint_id = price_constraint_id
        # 币种，元：CNY
        self.currency = currency
        # 基于剩余价值变配场景下，预测的支付金额正常的最小订购周期
        self.min_duration_of_valid_pay_amount = min_duration_of_valid_pay_amount
        # 预付费-折扣率
        self.discount_rate = discount_rate
        # 原始BD权限价金额，白名单商品会返回此价格
        self.original_bd_amount = original_bd_amount
        # 原始成本价金额，白名单商品会返回此价格
        self.original_cost_amount = original_cost_amount
        # 税前应收价
        self.pay_amount_before_gst = pay_amount_before_gst
        # 税额
        self.pay_amount_of_gst = pay_amount_of_gst

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.commodity_name, 'commodity_name')
        self.validate_required(self.pay_amount, 'pay_amount')
        self.validate_required(self.original_amount, 'original_amount')
        self.validate_required(self.discount_amount, 'discount_amount')
        self.validate_required(self.coupon_amount, 'coupon_amount')
        self.validate_required(self.subscription_unused_amount, 'subscription_unused_amount')
        self.validate_required(self.activity_code, 'activity_code')
        self.validate_required(self.activity_name, 'activity_name')
        self.validate_required(self.price_plan_id, 'price_plan_id')
        self.validate_required(self.price_constraint_id, 'price_constraint_id')
        self.validate_required(self.currency, 'currency')
        if self.min_duration_of_valid_pay_amount:
            self.min_duration_of_valid_pay_amount.validate()
        self.validate_required(self.discount_rate, 'discount_rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        if self.pay_amount is not None:
            result['pay_amount'] = self.pay_amount
        if self.original_amount is not None:
            result['original_amount'] = self.original_amount
        if self.discount_amount is not None:
            result['discount_amount'] = self.discount_amount
        if self.coupon_amount is not None:
            result['coupon_amount'] = self.coupon_amount
        if self.subscription_unused_amount is not None:
            result['subscription_unused_amount'] = self.subscription_unused_amount
        if self.activity_code is not None:
            result['activity_code'] = self.activity_code
        if self.activity_name is not None:
            result['activity_name'] = self.activity_name
        if self.price_plan_id is not None:
            result['price_plan_id'] = self.price_plan_id
        if self.price_constraint_id is not None:
            result['price_constraint_id'] = self.price_constraint_id
        if self.currency is not None:
            result['currency'] = self.currency
        if self.min_duration_of_valid_pay_amount is not None:
            result['min_duration_of_valid_pay_amount'] = self.min_duration_of_valid_pay_amount.to_map()
        if self.discount_rate is not None:
            result['discount_rate'] = self.discount_rate
        if self.original_bd_amount is not None:
            result['original_bd_amount'] = self.original_bd_amount
        if self.original_cost_amount is not None:
            result['original_cost_amount'] = self.original_cost_amount
        if self.pay_amount_before_gst is not None:
            result['pay_amount_before_gst'] = self.pay_amount_before_gst
        if self.pay_amount_of_gst is not None:
            result['pay_amount_of_gst'] = self.pay_amount_of_gst
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        if m.get('pay_amount') is not None:
            self.pay_amount = m.get('pay_amount')
        if m.get('original_amount') is not None:
            self.original_amount = m.get('original_amount')
        if m.get('discount_amount') is not None:
            self.discount_amount = m.get('discount_amount')
        if m.get('coupon_amount') is not None:
            self.coupon_amount = m.get('coupon_amount')
        if m.get('subscription_unused_amount') is not None:
            self.subscription_unused_amount = m.get('subscription_unused_amount')
        if m.get('activity_code') is not None:
            self.activity_code = m.get('activity_code')
        if m.get('activity_name') is not None:
            self.activity_name = m.get('activity_name')
        if m.get('price_plan_id') is not None:
            self.price_plan_id = m.get('price_plan_id')
        if m.get('price_constraint_id') is not None:
            self.price_constraint_id = m.get('price_constraint_id')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('min_duration_of_valid_pay_amount') is not None:
            temp_model = OrderDuration()
            self.min_duration_of_valid_pay_amount = temp_model.from_map(m['min_duration_of_valid_pay_amount'])
        if m.get('discount_rate') is not None:
            self.discount_rate = m.get('discount_rate')
        if m.get('original_bd_amount') is not None:
            self.original_bd_amount = m.get('original_bd_amount')
        if m.get('original_cost_amount') is not None:
            self.original_cost_amount = m.get('original_cost_amount')
        if m.get('pay_amount_before_gst') is not None:
            self.pay_amount_before_gst = m.get('pay_amount_before_gst')
        if m.get('pay_amount_of_gst') is not None:
            self.pay_amount_of_gst = m.get('pay_amount_of_gst')
        return self


class ComboDTO(TeaModel):
    def __init__(
        self,
        id: int = None,
        name: str = None,
        description: str = None,
        status: str = None,
        code: str = None,
        vid: str = None,
        parent_vid: str = None,
        extends_config: str = None,
        creator: str = None,
        modify: str = None,
        audit_process_id: str = None,
        audit_status: str = None,
        quotation_id: str = None,
        project_id: str = None,
        extends_info: str = None,
    ):
        # 主键id
        self.id = id
        # 套餐名称
        self.name = name
        # 套餐描述
        self.description = description
        # 套餐状态 DRAFT("DRAFT", "草稿"), ONLINE("ONLINE", "已上架"),OFFLINE("OFFLINE", "已下架");
        self.status = status
        # 套餐编码
        self.code = code
        # 套餐唯一版本号，模板变更时更新
        self.vid = vid
        # 父版本号
        self.parent_vid = parent_vid
        # 扩展配置
        self.extends_config = extends_config
        # 创建人
        self.creator = creator
        # 修改人
        self.modify = modify
        # 审批流程ID
        self.audit_process_id = audit_process_id
        # 审批状态
        self.audit_status = audit_status
        # 合同ID
        self.quotation_id = quotation_id
        # 项目ID
        self.project_id = project_id
        # 其他扩展信息
        self.extends_info = extends_info

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.status is not None:
            result['status'] = self.status
        if self.code is not None:
            result['code'] = self.code
        if self.vid is not None:
            result['vid'] = self.vid
        if self.parent_vid is not None:
            result['parent_vid'] = self.parent_vid
        if self.extends_config is not None:
            result['extends_config'] = self.extends_config
        if self.creator is not None:
            result['creator'] = self.creator
        if self.modify is not None:
            result['modify'] = self.modify
        if self.audit_process_id is not None:
            result['audit_process_id'] = self.audit_process_id
        if self.audit_status is not None:
            result['audit_status'] = self.audit_status
        if self.quotation_id is not None:
            result['quotation_id'] = self.quotation_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.extends_info is not None:
            result['extends_info'] = self.extends_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('vid') is not None:
            self.vid = m.get('vid')
        if m.get('parent_vid') is not None:
            self.parent_vid = m.get('parent_vid')
        if m.get('extends_config') is not None:
            self.extends_config = m.get('extends_config')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('modify') is not None:
            self.modify = m.get('modify')
        if m.get('audit_process_id') is not None:
            self.audit_process_id = m.get('audit_process_id')
        if m.get('audit_status') is not None:
            self.audit_status = m.get('audit_status')
        if m.get('quotation_id') is not None:
            self.quotation_id = m.get('quotation_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('extends_info') is not None:
            self.extends_info = m.get('extends_info')
        return self


class Combo(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        vid: str = None,
        description: str = None,
        extends_config: str = None,
        status: str = None,
        commodities: List[ComboCommodity] = None,
    ):
        # 套餐名称
        self.code = code
        # 套餐编码
        self.name = name
        # 套餐版本号
        self.vid = vid
        # 套餐描述
        self.description = description
        # 扩展信息，JSON结构，包含标签、个性化配置等数据
        self.extends_config = extends_config
        # 状态
        self.status = status
        # 套餐内商品列表
        self.commodities = commodities

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.vid, 'vid')
        self.validate_required(self.description, 'description')
        self.validate_required(self.extends_config, 'extends_config')
        self.validate_required(self.status, 'status')
        self.validate_required(self.commodities, 'commodities')
        if self.commodities:
            for k in self.commodities:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.vid is not None:
            result['vid'] = self.vid
        if self.description is not None:
            result['description'] = self.description
        if self.extends_config is not None:
            result['extends_config'] = self.extends_config
        if self.status is not None:
            result['status'] = self.status
        result['commodities'] = []
        if self.commodities is not None:
            for k in self.commodities:
                result['commodities'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('vid') is not None:
            self.vid = m.get('vid')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('extends_config') is not None:
            self.extends_config = m.get('extends_config')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.commodities = []
        if m.get('commodities') is not None:
            for k in m.get('commodities'):
                temp_model = ComboCommodity()
                self.commodities.append(temp_model.from_map(k))
        return self


class ComboOrderOptions(TeaModel):
    def __init__(
        self,
        confirm_ordered: bool = None,
        auto_cancel_combo_order: bool = None,
    ):
        # 是否确认下单，默认false。true：订单状态会从待确认扭转已下单，可直接发起支付。false：不可直接发起支付，需确认后才可发起支付
        self.confirm_ordered = confirm_ordered
        # 创建订单后未发起支付前是否自动取消订单。false：不会自动取消订单。true：兜底60分钟后自动取消订单
        self.auto_cancel_combo_order = auto_cancel_combo_order

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.confirm_ordered is not None:
            result['confirm_ordered'] = self.confirm_ordered
        if self.auto_cancel_combo_order is not None:
            result['auto_cancel_combo_order'] = self.auto_cancel_combo_order
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('confirm_ordered') is not None:
            self.confirm_ordered = m.get('confirm_ordered')
        if m.get('auto_cancel_combo_order') is not None:
            self.auto_cancel_combo_order = m.get('auto_cancel_combo_order')
        return self


class SelectedConfigItem(TeaModel):
    def __init__(
        self,
        offer_inner_code: str = None,
        offer_sale_code: str = None,
        duration: int = None,
        pricing_cycle: str = None,
        quantity: int = None,
        coupon_id: str = None,
        components_map: str = None,
    ):
        # 商品主数据内码（L5内码）
        self.offer_inner_code = offer_inner_code
        # 商品销售码（带 OU 属性）
        self.offer_sale_code = offer_sale_code
        # 购买时长；预付费根据实际时长填写，后付费填 1
        self.duration = duration
        # 购买时长单位； month / year
        self.pricing_cycle = pricing_cycle
        # 购买实例的数量
        self.quantity = quantity
        # 该子商品使用的优惠券ID
        self.coupon_id = coupon_id
        # 要购买的产品规格配件值,JSON格式
        self.components_map = components_map

    def validate(self):
        self.validate_required(self.offer_inner_code, 'offer_inner_code')
        self.validate_required(self.offer_sale_code, 'offer_sale_code')
        self.validate_required(self.duration, 'duration')
        self.validate_required(self.pricing_cycle, 'pricing_cycle')
        self.validate_required(self.quantity, 'quantity')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.offer_inner_code is not None:
            result['offer_inner_code'] = self.offer_inner_code
        if self.offer_sale_code is not None:
            result['offer_sale_code'] = self.offer_sale_code
        if self.duration is not None:
            result['duration'] = self.duration
        if self.pricing_cycle is not None:
            result['pricing_cycle'] = self.pricing_cycle
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        if self.components_map is not None:
            result['components_map'] = self.components_map
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('offer_inner_code') is not None:
            self.offer_inner_code = m.get('offer_inner_code')
        if m.get('offer_sale_code') is not None:
            self.offer_sale_code = m.get('offer_sale_code')
        if m.get('duration') is not None:
            self.duration = m.get('duration')
        if m.get('pricing_cycle') is not None:
            self.pricing_cycle = m.get('pricing_cycle')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        if m.get('components_map') is not None:
            self.components_map = m.get('components_map')
        return self


class CreateOrderResult(TeaModel):
    def __init__(
        self,
        bsn_no: str = None,
        order_id: str = None,
        normal_order_line_id: str = None,
        order_status: str = None,
        instance_ids: str = None,
        order_error_code: str = None,
        order_error_description: str = None,
    ):
        # 下单时指定的业务流水号。二级订单号
        self.bsn_no = bsn_no
        # 一级订单号
        self.order_id = order_id
        # 二级订单号
        self.normal_order_line_id = normal_order_line_id
        # 订单状态
        self.order_status = order_status
        # 实例列表
        self.instance_ids = instance_ids
        # 订购错误码
        self.order_error_code = order_error_code
        # 订购错误描述
        self.order_error_description = order_error_description

    def validate(self):
        self.validate_required(self.bsn_no, 'bsn_no')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.normal_order_line_id, 'normal_order_line_id')
        self.validate_required(self.order_status, 'order_status')
        self.validate_required(self.instance_ids, 'instance_ids')
        self.validate_required(self.order_error_code, 'order_error_code')
        self.validate_required(self.order_error_description, 'order_error_description')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bsn_no is not None:
            result['bsn_no'] = self.bsn_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.normal_order_line_id is not None:
            result['normal_order_line_id'] = self.normal_order_line_id
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.instance_ids is not None:
            result['instance_ids'] = self.instance_ids
        if self.order_error_code is not None:
            result['order_error_code'] = self.order_error_code
        if self.order_error_description is not None:
            result['order_error_description'] = self.order_error_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bsn_no') is not None:
            self.bsn_no = m.get('bsn_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('normal_order_line_id') is not None:
            self.normal_order_line_id = m.get('normal_order_line_id')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('instance_ids') is not None:
            self.instance_ids = m.get('instance_ids')
        if m.get('order_error_code') is not None:
            self.order_error_code = m.get('order_error_code')
        if m.get('order_error_description') is not None:
            self.order_error_description = m.get('order_error_description')
        return self


class AbcStructC(TeaModel):
    def __init__(
        self,
        string_param_c: str = None,
        number_param_c: int = None,
        boolean_param_c: bool = None,
        date_param_c: str = None,
        array_param_c: List[str] = None,
    ):
        # string_c
        self.string_param_c = string_param_c
        # number_c
        self.number_param_c = number_param_c
        # boolean_c
        self.boolean_param_c = boolean_param_c
        # date_c
        self.date_param_c = date_param_c
        # string_c
        self.array_param_c = array_param_c

    def validate(self):
        if self.date_param_c is not None:
            self.validate_pattern(self.date_param_c, 'date_param_c', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.string_param_c is not None:
            result['string_param_c'] = self.string_param_c
        if self.number_param_c is not None:
            result['number_param_c'] = self.number_param_c
        if self.boolean_param_c is not None:
            result['boolean_param_c'] = self.boolean_param_c
        if self.date_param_c is not None:
            result['date_param_c'] = self.date_param_c
        if self.array_param_c is not None:
            result['array_param_c'] = self.array_param_c
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('string_param_c') is not None:
            self.string_param_c = m.get('string_param_c')
        if m.get('number_param_c') is not None:
            self.number_param_c = m.get('number_param_c')
        if m.get('boolean_param_c') is not None:
            self.boolean_param_c = m.get('boolean_param_c')
        if m.get('date_param_c') is not None:
            self.date_param_c = m.get('date_param_c')
        if m.get('array_param_c') is not None:
            self.array_param_c = m.get('array_param_c')
        return self


class AbcStructB(TeaModel):
    def __init__(
        self,
        string_param_b: str = None,
        number_param_b: int = None,
        boolean_param_b: bool = None,
        date_param_b: str = None,
        array_param_b: List[AbcStructC] = None,
        struct_param_b: AbcStructC = None,
    ):
        # string_b
        self.string_param_b = string_param_b
        # number_b
        self.number_param_b = number_param_b
        # boolean_b
        self.boolean_param_b = boolean_param_b
        # date_b
        self.date_param_b = date_param_b
        # array_b
        self.array_param_b = array_param_b
        # struct_b
        self.struct_param_b = struct_param_b

    def validate(self):
        if self.date_param_b is not None:
            self.validate_pattern(self.date_param_b, 'date_param_b', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.array_param_b:
            for k in self.array_param_b:
                if k:
                    k.validate()
        if self.struct_param_b:
            self.struct_param_b.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.string_param_b is not None:
            result['string_param_b'] = self.string_param_b
        if self.number_param_b is not None:
            result['number_param_b'] = self.number_param_b
        if self.boolean_param_b is not None:
            result['boolean_param_b'] = self.boolean_param_b
        if self.date_param_b is not None:
            result['date_param_b'] = self.date_param_b
        result['array_param_b'] = []
        if self.array_param_b is not None:
            for k in self.array_param_b:
                result['array_param_b'].append(k.to_map() if k else None)
        if self.struct_param_b is not None:
            result['struct_param_b'] = self.struct_param_b.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('string_param_b') is not None:
            self.string_param_b = m.get('string_param_b')
        if m.get('number_param_b') is not None:
            self.number_param_b = m.get('number_param_b')
        if m.get('boolean_param_b') is not None:
            self.boolean_param_b = m.get('boolean_param_b')
        if m.get('date_param_b') is not None:
            self.date_param_b = m.get('date_param_b')
        self.array_param_b = []
        if m.get('array_param_b') is not None:
            for k in m.get('array_param_b'):
                temp_model = AbcStructC()
                self.array_param_b.append(temp_model.from_map(k))
        if m.get('struct_param_b') is not None:
            temp_model = AbcStructC()
            self.struct_param_b = temp_model.from_map(m['struct_param_b'])
        return self


class AbcCreateStructA(TeaModel):
    def __init__(
        self,
        name: str = None,
        age: int = None,
    ):
        # 【姓名】
        self.name = name
        # 【年龄】
        self.age = age

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.age is not None:
            result['age'] = self.age
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('age') is not None:
            self.age = m.get('age')
        return self


class AbcCreateStructB(TeaModel):
    def __init__(
        self,
        info: str = None,
        region: str = None,
    ):
        # 【信息描述】
        self.info = info
        # 【地区】
        self.region = region

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.info is not None:
            result['info'] = self.info
        if self.region is not None:
            result['region'] = self.region
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('info') is not None:
            self.info = m.get('info')
        if m.get('region') is not None:
            self.region = m.get('region')
        return self


class AbcCreateStructC(TeaModel):
    def __init__(
        self,
        personal_information: AbcCreateStructA = None,
        regional_information: AbcCreateStructB = None,
        case_name: str = None,
    ):
        # 【个人信息】
        self.personal_information = personal_information
        # 【地区信息】
        self.regional_information = regional_information
        # 【用例类型】
        self.case_name = case_name

    def validate(self):
        if self.personal_information:
            self.personal_information.validate()
        if self.regional_information:
            self.regional_information.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.personal_information is not None:
            result['personal_information'] = self.personal_information.to_map()
        if self.regional_information is not None:
            result['regional_information'] = self.regional_information.to_map()
        if self.case_name is not None:
            result['case_name'] = self.case_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('personal_information') is not None:
            temp_model = AbcCreateStructA()
            self.personal_information = temp_model.from_map(m['personal_information'])
        if m.get('regional_information') is not None:
            temp_model = AbcCreateStructB()
            self.regional_information = temp_model.from_map(m['regional_information'])
        if m.get('case_name') is not None:
            self.case_name = m.get('case_name')
        return self


class AbcCreateStructD(TeaModel):
    def __init__(
        self,
        application_scene: str = None,
        tiny_app_id: str = None,
        site_name: str = None,
        sit_url: str = None,
        merchant_name: str = None,
        merchant_service_name: str = None,
    ):
        # 应用场景（payChannel =JDPAY仅支持MINI_APP） MINI_APP 小程序 APP 自有app ALL 两种都有
        self.application_scene = application_scene
        # 小程序id
        self.tiny_app_id = tiny_app_id
        # 小程序名称
        self.site_name = site_name
        # 网站地址（pay_channel=ALIPAY必填）
        self.sit_url = sit_url
        # 商户名称。（pay_channel=ALIPAY必填） 修改后的商户名称，将同步支付宝代扣签约页面字段展示
        self.merchant_name = merchant_name
        # 商户服务名称。（pay_channel=ALIPAY必填） 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
        self.merchant_service_name = merchant_service_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.application_scene is not None:
            result['application_scene'] = self.application_scene
        if self.tiny_app_id is not None:
            result['tiny_app_id'] = self.tiny_app_id
        if self.site_name is not None:
            result['site_name'] = self.site_name
        if self.sit_url is not None:
            result['sit_url'] = self.sit_url
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.merchant_service_name is not None:
            result['merchant_service_name'] = self.merchant_service_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('application_scene') is not None:
            self.application_scene = m.get('application_scene')
        if m.get('tiny_app_id') is not None:
            self.tiny_app_id = m.get('tiny_app_id')
        if m.get('site_name') is not None:
            self.site_name = m.get('site_name')
        if m.get('sit_url') is not None:
            self.sit_url = m.get('sit_url')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('merchant_service_name') is not None:
            self.merchant_service_name = m.get('merchant_service_name')
        return self


class AbcDemoStruct(TeaModel):
    def __init__(
        self,
        some_string: str = None,
    ):
        # 字符串属性
        self.some_string = some_string

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.some_string is not None:
            result['some_string'] = self.some_string
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('some_string') is not None:
            self.some_string = m.get('some_string')
        return self


class AbcStructA(TeaModel):
    def __init__(
        self,
        string_param_a: str = None,
        number_param_a: int = None,
        boolean_param_a: bool = None,
        date_param_a: str = None,
        struct_param_a: AbcStructB = None,
    ):
        # string_a
        self.string_param_a = string_param_a
        # number_a
        self.number_param_a = number_param_a
        # boolean_a
        self.boolean_param_a = boolean_param_a
        # date_a
        self.date_param_a = date_param_a
        # struct_a
        self.struct_param_a = struct_param_a

    def validate(self):
        if self.date_param_a is not None:
            self.validate_pattern(self.date_param_a, 'date_param_a', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.struct_param_a:
            self.struct_param_a.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.string_param_a is not None:
            result['string_param_a'] = self.string_param_a
        if self.number_param_a is not None:
            result['number_param_a'] = self.number_param_a
        if self.boolean_param_a is not None:
            result['boolean_param_a'] = self.boolean_param_a
        if self.date_param_a is not None:
            result['date_param_a'] = self.date_param_a
        if self.struct_param_a is not None:
            result['struct_param_a'] = self.struct_param_a.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('string_param_a') is not None:
            self.string_param_a = m.get('string_param_a')
        if m.get('number_param_a') is not None:
            self.number_param_a = m.get('number_param_a')
        if m.get('boolean_param_a') is not None:
            self.boolean_param_a = m.get('boolean_param_a')
        if m.get('date_param_a') is not None:
            self.date_param_a = m.get('date_param_a')
        if m.get('struct_param_a') is not None:
            temp_model = AbcStructB()
            self.struct_param_a = temp_model.from_map(m['struct_param_a'])
        return self


class SubDemoStruct(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
        a: str = None,
    ):
        # name
        self.name = name
        # value
        self.value = value
        # a
        self.a = a

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')
        self.validate_required(self.a, 'a')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.value is not None:
            result['value'] = self.value
        if self.a is not None:
            result['a'] = self.a
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('a') is not None:
            self.a = m.get('a')
        return self


class PriceConstraintConditionVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        price_constraint_id: int = None,
        spec_condition_code: str = None,
        operator: str = None,
        target_value: str = None,
        spec_condition_name: str = None,
        target_value_name: str = None,
        description: str = None,
    ):
        # 约束ID
        self.id = id
        # 价格约束ID
        self.price_constraint_id = price_constraint_id
        # 规格条件CODE
        self.spec_condition_code = spec_condition_code
        # 条件关系比较符
        self.operator = operator
        # 待比较对象的值
        self.target_value = target_value
        # 特定场景下set才会有值
        self.spec_condition_name = spec_condition_name
        # 特定场景下set才会有值
        self.target_value_name = target_value_name
        # 描述
        self.description = description

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.price_constraint_id, 'price_constraint_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.price_constraint_id is not None:
            result['price_constraint_id'] = self.price_constraint_id
        if self.spec_condition_code is not None:
            result['spec_condition_code'] = self.spec_condition_code
        if self.operator is not None:
            result['operator'] = self.operator
        if self.target_value is not None:
            result['target_value'] = self.target_value
        if self.spec_condition_name is not None:
            result['spec_condition_name'] = self.spec_condition_name
        if self.target_value_name is not None:
            result['target_value_name'] = self.target_value_name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('price_constraint_id') is not None:
            self.price_constraint_id = m.get('price_constraint_id')
        if m.get('spec_condition_code') is not None:
            self.spec_condition_code = m.get('spec_condition_code')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('target_value') is not None:
            self.target_value = m.get('target_value')
        if m.get('spec_condition_name') is not None:
            self.spec_condition_name = m.get('spec_condition_name')
        if m.get('target_value_name') is not None:
            self.target_value_name = m.get('target_value_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class OfferMaster(TeaModel):
    def __init__(
        self,
        inner_code: str = None,
        format_code: str = None,
        outer_code: str = None,
        name: str = None,
        description: str = None,
        product_code: str = None,
        service_code: str = None,
        spu_code: str = None,
    ):
        # 内部商品码
        self.inner_code = inner_code
        # 用于展示的格式化商品编码
        self.format_code = format_code
        # 外部商品编码
        self.outer_code = outer_code
        # 商品名称
        self.name = name
        # 商品描述
        self.description = description
        # 产品code
        self.product_code = product_code
        # 渠道产品编码
        self.service_code = service_code
        # l4编码
        self.spu_code = spu_code

    def validate(self):
        self.validate_required(self.inner_code, 'inner_code')
        self.validate_required(self.format_code, 'format_code')
        self.validate_required(self.outer_code, 'outer_code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.service_code, 'service_code')
        self.validate_required(self.spu_code, 'spu_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.inner_code is not None:
            result['inner_code'] = self.inner_code
        if self.format_code is not None:
            result['format_code'] = self.format_code
        if self.outer_code is not None:
            result['outer_code'] = self.outer_code
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.spu_code is not None:
            result['spu_code'] = self.spu_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('inner_code') is not None:
            self.inner_code = m.get('inner_code')
        if m.get('format_code') is not None:
            self.format_code = m.get('format_code')
        if m.get('outer_code') is not None:
            self.outer_code = m.get('outer_code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('spu_code') is not None:
            self.spu_code = m.get('spu_code')
        return self


class PriceConstraintResultVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        price_constraint_id: int = None,
        base_price: str = None,
        adjust_price: str = None,
        bd_price: str = None,
        cost_price: str = None,
        ladder_start: str = None,
        ladder_end: str = None,
        price_unit: str = None,
        ladder_price_fixed: bool = None,
    ):
        # 价格id
        self.id = id
        # 价格约束ID
        self.price_constraint_id = price_constraint_id
        # 基础价格费率
        self.base_price = base_price
        # 基础保底价
        self.adjust_price = adjust_price
        # BD销售最低价费率
        self.bd_price = bd_price
        # 成本价费率
        self.cost_price = cost_price
        # 阶梯区间最小值
        self.ladder_start = ladder_start
        # 阶梯区间结束值
        self.ladder_end = ladder_end
        # 价格单位，例如：元/每次
        self.price_unit = price_unit
        # 是否阶梯固定价
        self.ladder_price_fixed = ladder_price_fixed

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.price_constraint_id, 'price_constraint_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.price_constraint_id is not None:
            result['price_constraint_id'] = self.price_constraint_id
        if self.base_price is not None:
            result['base_price'] = self.base_price
        if self.adjust_price is not None:
            result['adjust_price'] = self.adjust_price
        if self.bd_price is not None:
            result['bd_price'] = self.bd_price
        if self.cost_price is not None:
            result['cost_price'] = self.cost_price
        if self.ladder_start is not None:
            result['ladder_start'] = self.ladder_start
        if self.ladder_end is not None:
            result['ladder_end'] = self.ladder_end
        if self.price_unit is not None:
            result['price_unit'] = self.price_unit
        if self.ladder_price_fixed is not None:
            result['ladder_price_fixed'] = self.ladder_price_fixed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('price_constraint_id') is not None:
            self.price_constraint_id = m.get('price_constraint_id')
        if m.get('base_price') is not None:
            self.base_price = m.get('base_price')
        if m.get('adjust_price') is not None:
            self.adjust_price = m.get('adjust_price')
        if m.get('bd_price') is not None:
            self.bd_price = m.get('bd_price')
        if m.get('cost_price') is not None:
            self.cost_price = m.get('cost_price')
        if m.get('ladder_start') is not None:
            self.ladder_start = m.get('ladder_start')
        if m.get('ladder_end') is not None:
            self.ladder_end = m.get('ladder_end')
        if m.get('price_unit') is not None:
            self.price_unit = m.get('price_unit')
        if m.get('ladder_price_fixed') is not None:
            self.ladder_price_fixed = m.get('ladder_price_fixed')
        return self


class AcceptanceDetail(TeaModel):
    def __init__(
        self,
        name: str = None,
        price: str = None,
    ):
        # 客户名称
        self.name = name
        # 客户价格
        self.price = price

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.price is not None:
            result['price'] = self.price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('price') is not None:
            self.price = m.get('price')
        return self


class AdditionDetail(TeaModel):
    def __init__(
        self,
        name: str = None,
        profit: str = None,
        technical_score: str = None,
        brand_score: str = None,
        bd_price_predict: str = None,
    ):
        # 友商名称
        self.name = name
        # 友商价格
        self.profit = profit
        # 技术分调整
        self.technical_score = technical_score
        # 品牌分调整
        self.brand_score = brand_score
        # BD权限价预估
        self.bd_price_predict = bd_price_predict

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.profit is not None:
            result['profit'] = self.profit
        if self.technical_score is not None:
            result['technical_score'] = self.technical_score
        if self.brand_score is not None:
            result['brand_score'] = self.brand_score
        if self.bd_price_predict is not None:
            result['bd_price_predict'] = self.bd_price_predict
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('profit') is not None:
            self.profit = m.get('profit')
        if m.get('technical_score') is not None:
            self.technical_score = m.get('technical_score')
        if m.get('brand_score') is not None:
            self.brand_score = m.get('brand_score')
        if m.get('bd_price_predict') is not None:
            self.bd_price_predict = m.get('bd_price_predict')
        return self


class CostInfo(TeaModel):
    def __init__(
        self,
        cost_reason: str = None,
        predict_profit: str = None,
    ):
        # 成本法原因
        self.cost_reason = cost_reason
        # 预期毛利率
        self.predict_profit = predict_profit

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cost_reason is not None:
            result['cost_reason'] = self.cost_reason
        if self.predict_profit is not None:
            result['predict_profit'] = self.predict_profit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cost_reason') is not None:
            self.cost_reason = m.get('cost_reason')
        if m.get('predict_profit') is not None:
            self.predict_profit = m.get('predict_profit')
        return self


class PriceConstraintVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        price_plan_id: int = None,
        name: str = None,
        description: str = None,
        price_constraint_condition_vo_list: List[PriceConstraintConditionVO] = None,
        price_constraint_result_vo_list: List[PriceConstraintResultVO] = None,
    ):
        # 定价计划ID
        self.id = id
        # 定价计划ID
        self.price_plan_id = price_plan_id
        # 定价计划名称
        self.name = name
        # 描述
        self.description = description
        # 约束条件列表
        self.price_constraint_condition_vo_list = price_constraint_condition_vo_list
        # 约束结果列表
        self.price_constraint_result_vo_list = price_constraint_result_vo_list

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.price_plan_id, 'price_plan_id')
        if self.price_constraint_condition_vo_list:
            for k in self.price_constraint_condition_vo_list:
                if k:
                    k.validate()
        if self.price_constraint_result_vo_list:
            for k in self.price_constraint_result_vo_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.price_plan_id is not None:
            result['price_plan_id'] = self.price_plan_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        result['price_constraint_condition_vo_list'] = []
        if self.price_constraint_condition_vo_list is not None:
            for k in self.price_constraint_condition_vo_list:
                result['price_constraint_condition_vo_list'].append(k.to_map() if k else None)
        result['price_constraint_result_vo_list'] = []
        if self.price_constraint_result_vo_list is not None:
            for k in self.price_constraint_result_vo_list:
                result['price_constraint_result_vo_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('price_plan_id') is not None:
            self.price_plan_id = m.get('price_plan_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        self.price_constraint_condition_vo_list = []
        if m.get('price_constraint_condition_vo_list') is not None:
            for k in m.get('price_constraint_condition_vo_list'):
                temp_model = PriceConstraintConditionVO()
                self.price_constraint_condition_vo_list.append(temp_model.from_map(k))
        self.price_constraint_result_vo_list = []
        if m.get('price_constraint_result_vo_list') is not None:
            for k in m.get('price_constraint_result_vo_list'):
                temp_model = PriceConstraintResultVO()
                self.price_constraint_result_vo_list.append(temp_model.from_map(k))
        return self


class CustomerValueDetail(TeaModel):
    def __init__(
        self,
        name: str = None,
        profit: str = None,
        ant_divide: str = None,
        bd_price_predict: str = None,
    ):
        # 名称
        self.name = name
        # 友商价格
        self.profit = profit
        # 蚂蚁收益
        self.ant_divide = ant_divide
        # BD权限价预估
        self.bd_price_predict = bd_price_predict

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.profit is not None:
            result['profit'] = self.profit
        if self.ant_divide is not None:
            result['ant_divide'] = self.ant_divide
        if self.bd_price_predict is not None:
            result['bd_price_predict'] = self.bd_price_predict
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('profit') is not None:
            self.profit = m.get('profit')
        if m.get('ant_divide') is not None:
            self.ant_divide = m.get('ant_divide')
        if m.get('bd_price_predict') is not None:
            self.bd_price_predict = m.get('bd_price_predict')
        return self


class PriceLimitStrategyDTO(TeaModel):
    def __init__(
        self,
        creator: str = None,
        modifier: str = None,
        deleted: bool = None,
        price_plan_id: int = None,
        duration_type: str = None,
        guarantee_price: str = None,
        guarantee_cost_price: str = None,
    ):
        # 创建人
        self.creator = creator
        # 修改人
        self.modifier = modifier
        # 是否删除
        self.deleted = deleted
        # 定价计划ID
        self.price_plan_id = price_plan_id
        # 保底周期,year年、month月
        self.duration_type = duration_type
        # 保底价格
        self.guarantee_price = guarantee_price
        # 产品成本
        self.guarantee_cost_price = guarantee_cost_price

    def validate(self):
        self.validate_required(self.price_plan_id, 'price_plan_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.creator is not None:
            result['creator'] = self.creator
        if self.modifier is not None:
            result['modifier'] = self.modifier
        if self.deleted is not None:
            result['deleted'] = self.deleted
        if self.price_plan_id is not None:
            result['price_plan_id'] = self.price_plan_id
        if self.duration_type is not None:
            result['duration_type'] = self.duration_type
        if self.guarantee_price is not None:
            result['guarantee_price'] = self.guarantee_price
        if self.guarantee_cost_price is not None:
            result['guarantee_cost_price'] = self.guarantee_cost_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('modifier') is not None:
            self.modifier = m.get('modifier')
        if m.get('deleted') is not None:
            self.deleted = m.get('deleted')
        if m.get('price_plan_id') is not None:
            self.price_plan_id = m.get('price_plan_id')
        if m.get('duration_type') is not None:
            self.duration_type = m.get('duration_type')
        if m.get('guarantee_price') is not None:
            self.guarantee_price = m.get('guarantee_price')
        if m.get('guarantee_cost_price') is not None:
            self.guarantee_cost_price = m.get('guarantee_cost_price')
        return self


class MarketInfo(TeaModel):
    def __init__(
        self,
        market_logic: str = None,
        acceptance_details: List[AcceptanceDetail] = None,
        addition_details: List[AdditionDetail] = None,
    ):
        # 市场逻辑
        self.market_logic = market_logic
        # 潜客接受度
        self.acceptance_details = acceptance_details
        # 基于竞品及加成
        self.addition_details = addition_details

    def validate(self):
        if self.acceptance_details:
            for k in self.acceptance_details:
                if k:
                    k.validate()
        if self.addition_details:
            for k in self.addition_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.market_logic is not None:
            result['market_logic'] = self.market_logic
        result['acceptance_details'] = []
        if self.acceptance_details is not None:
            for k in self.acceptance_details:
                result['acceptance_details'].append(k.to_map() if k else None)
        result['addition_details'] = []
        if self.addition_details is not None:
            for k in self.addition_details:
                result['addition_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('market_logic') is not None:
            self.market_logic = m.get('market_logic')
        self.acceptance_details = []
        if m.get('acceptance_details') is not None:
            for k in m.get('acceptance_details'):
                temp_model = AcceptanceDetail()
                self.acceptance_details.append(temp_model.from_map(k))
        self.addition_details = []
        if m.get('addition_details') is not None:
            for k in m.get('addition_details'):
                temp_model = AdditionDetail()
                self.addition_details.append(temp_model.from_map(k))
        return self


class ProductSpu(TeaModel):
    def __init__(
        self,
        spu_code: str = None,
        spu_name: str = None,
        spu_desc: str = None,
        delivery_mode: str = None,
        product_code: str = None,
        involved_one_party: bool = None,
        segment: str = None,
        offer_master: List[OfferMaster] = None,
    ):
        # SPU编码
        self.spu_code = spu_code
        # SPU名称
        self.spu_name = spu_name
        # spu描述
        self.spu_desc = spu_desc
        # 交付模式，ONLINE/OFFLINE
        self.delivery_mode = delivery_mode
        # 归属产品码
        self.product_code = product_code
        # 是否涉及一方化
        self.involved_one_party = involved_one_party
        # technical_product:技术产品，technical_service:技术服务，solution_se:标准解决方案，saas:标准化SaaS，saas+:SaaS +，trading_network:交易网络
        self.segment = segment
        # sku数据
        self.offer_master = offer_master

    def validate(self):
        self.validate_required(self.spu_code, 'spu_code')
        self.validate_required(self.spu_name, 'spu_name')
        self.validate_required(self.spu_desc, 'spu_desc')
        self.validate_required(self.delivery_mode, 'delivery_mode')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.involved_one_party, 'involved_one_party')
        self.validate_required(self.segment, 'segment')
        self.validate_required(self.offer_master, 'offer_master')
        if self.offer_master:
            for k in self.offer_master:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.spu_code is not None:
            result['spu_code'] = self.spu_code
        if self.spu_name is not None:
            result['spu_name'] = self.spu_name
        if self.spu_desc is not None:
            result['spu_desc'] = self.spu_desc
        if self.delivery_mode is not None:
            result['delivery_mode'] = self.delivery_mode
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.involved_one_party is not None:
            result['involved_one_party'] = self.involved_one_party
        if self.segment is not None:
            result['segment'] = self.segment
        result['offer_master'] = []
        if self.offer_master is not None:
            for k in self.offer_master:
                result['offer_master'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spu_code') is not None:
            self.spu_code = m.get('spu_code')
        if m.get('spu_name') is not None:
            self.spu_name = m.get('spu_name')
        if m.get('spu_desc') is not None:
            self.spu_desc = m.get('spu_desc')
        if m.get('delivery_mode') is not None:
            self.delivery_mode = m.get('delivery_mode')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('involved_one_party') is not None:
            self.involved_one_party = m.get('involved_one_party')
        if m.get('segment') is not None:
            self.segment = m.get('segment')
        self.offer_master = []
        if m.get('offer_master') is not None:
            for k in m.get('offer_master'):
                temp_model = OfferMaster()
                self.offer_master.append(temp_model.from_map(k))
        return self


class BusinessProduct(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        business_line: str = None,
        product_line: str = None,
        product_spu: List[ProductSpu] = None,
        short_code: str = None,
    ):
        # 业务产品code
        self.code = code
        # 产品线名称
        self.name = name
        # 归属业务线
        self.business_line = business_line
        # 归属产品线
        self.product_line = product_line
        # spu列表
        self.product_spu = product_spu
        # 短码
        self.short_code = short_code

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.business_line, 'business_line')
        self.validate_required(self.product_line, 'product_line')
        self.validate_required(self.product_spu, 'product_spu')
        if self.product_spu:
            for k in self.product_spu:
                if k:
                    k.validate()
        self.validate_required(self.short_code, 'short_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.business_line is not None:
            result['business_line'] = self.business_line
        if self.product_line is not None:
            result['product_line'] = self.product_line
        result['product_spu'] = []
        if self.product_spu is not None:
            for k in self.product_spu:
                result['product_spu'].append(k.to_map() if k else None)
        if self.short_code is not None:
            result['short_code'] = self.short_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('business_line') is not None:
            self.business_line = m.get('business_line')
        if m.get('product_line') is not None:
            self.product_line = m.get('product_line')
        self.product_spu = []
        if m.get('product_spu') is not None:
            for k in m.get('product_spu'):
                temp_model = ProductSpu()
                self.product_spu.append(temp_model.from_map(k))
        if m.get('short_code') is not None:
            self.short_code = m.get('short_code')
        return self


class PricePlanVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        commodity_code: str = None,
        price_object_code: str = None,
        name: str = None,
        type: str = None,
        tenant_id: str = None,
        contract_id: str = None,
        policy_id: str = None,
        business_project_id: str = None,
        execute_condition: str = None,
        priority: int = None,
        no_match_rule: str = None,
        pricing_mode: str = None,
        pricing_method: str = None,
        ladder_interval_type: str = None,
        parent_price_plan_id: int = None,
        status: str = None,
        start_time: str = None,
        end_time: str = None,
        creator: str = None,
        modifier: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        basis: str = None,
        price_condition_codes: str = None,
        price_safe_area: str = None,
        template_code: str = None,
        bpms_process_id: str = None,
        strategy: str = None,
        price_stage: str = None,
        price_constraint_vo_list: List[PriceConstraintVO] = None,
        price_limit_strategy_dto: List[PriceLimitStrategyDTO] = None,
        sale_channel: List[str] = None,
        official_sell_discount: str = None,
        customer_value_info: CustomerValueDetail = None,
        market_info: MarketInfo = None,
        cost_info: CostInfo = None,
    ):
        # 定价计划ID
        self.id = id
        # 商品CODE
        self.commodity_code = commodity_code
        # 定价对象CODE
        self.price_object_code = price_object_code
        # 定价计划名称
        self.name = name
        # 定价计划类型
        self.type = type
        # 租户ID
        self.tenant_id = tenant_id
        # 合同ID
        self.contract_id = contract_id
        # 政策ID
        self.policy_id = policy_id
        # 商务项目ID
        self.business_project_id = business_project_id
        # 执行条件
        self.execute_condition = execute_condition
        # 优先级
        self.priority = priority
        # 价格匹配不到处理策略：抛异常，继续询价
        self.no_match_rule = no_match_rule
        # 计价模式：公式、阶梯、自定义
        self.pricing_mode = pricing_mode
        # 计价方法：具体公式、阶梯方法、自定义
        self.pricing_method = pricing_method
        # 阶梯区间类型，左开右闭/左闭右开
        self.ladder_interval_type = ladder_interval_type
        # 父定价计划ID
        self.parent_price_plan_id = parent_price_plan_id
        # 定价计划状态，编辑中、预发生效、线上生效、失效
        self.status = status
        # 生效起始时间
        self.start_time = start_time
        # 生效结束时间
        self.end_time = end_time
        # 创建者
        self.creator = creator
        # 修改者
        self.modifier = modifier
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 是否是基础价格
        self.basis = basis
        # 价格条件，多个以分号分隔
        self.price_condition_codes = price_condition_codes
        # 价格安全区间，格式 min,max如0,100
        self.price_safe_area = price_safe_area
        # 关联模板
        self.template_code = template_code
        # 关联审批流程
        self.bpms_process_id = bpms_process_id
        # 定价策略
        self.strategy = strategy
        # 定价阶段
        self.price_stage = price_stage
        # 定价计划对应的约束，只有在明确需要查询定价约束时才会手动set进去
        self.price_constraint_vo_list = price_constraint_vo_list
        # 价格限制策略
        self.price_limit_strategy_dto = price_limit_strategy_dto
        # 销售渠道
        self.sale_channel = sale_channel
        # 官网售卖折扣设置
        self.official_sell_discount = official_sell_discount
        # 客户法详情
        self.customer_value_info = customer_value_info
        # 市场法详情
        self.market_info = market_info
        # 成本法详情
        self.cost_info = cost_info

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.price_object_code, 'price_object_code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.priority, 'priority')
        self.validate_required(self.status, 'status')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.price_safe_area, 'price_safe_area')
        if self.price_constraint_vo_list:
            for k in self.price_constraint_vo_list:
                if k:
                    k.validate()
        if self.price_limit_strategy_dto:
            for k in self.price_limit_strategy_dto:
                if k:
                    k.validate()
        if self.customer_value_info:
            self.customer_value_info.validate()
        if self.market_info:
            self.market_info.validate()
        if self.cost_info:
            self.cost_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.price_object_code is not None:
            result['price_object_code'] = self.price_object_code
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        if self.business_project_id is not None:
            result['business_project_id'] = self.business_project_id
        if self.execute_condition is not None:
            result['execute_condition'] = self.execute_condition
        if self.priority is not None:
            result['priority'] = self.priority
        if self.no_match_rule is not None:
            result['no_match_rule'] = self.no_match_rule
        if self.pricing_mode is not None:
            result['pricing_mode'] = self.pricing_mode
        if self.pricing_method is not None:
            result['pricing_method'] = self.pricing_method
        if self.ladder_interval_type is not None:
            result['ladder_interval_type'] = self.ladder_interval_type
        if self.parent_price_plan_id is not None:
            result['parent_price_plan_id'] = self.parent_price_plan_id
        if self.status is not None:
            result['status'] = self.status
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.creator is not None:
            result['creator'] = self.creator
        if self.modifier is not None:
            result['modifier'] = self.modifier
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.basis is not None:
            result['basis'] = self.basis
        if self.price_condition_codes is not None:
            result['price_condition_codes'] = self.price_condition_codes
        if self.price_safe_area is not None:
            result['price_safe_area'] = self.price_safe_area
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.bpms_process_id is not None:
            result['bpms_process_id'] = self.bpms_process_id
        if self.strategy is not None:
            result['strategy'] = self.strategy
        if self.price_stage is not None:
            result['price_stage'] = self.price_stage
        result['price_constraint_vo_list'] = []
        if self.price_constraint_vo_list is not None:
            for k in self.price_constraint_vo_list:
                result['price_constraint_vo_list'].append(k.to_map() if k else None)
        result['price_limit_strategy_dto'] = []
        if self.price_limit_strategy_dto is not None:
            for k in self.price_limit_strategy_dto:
                result['price_limit_strategy_dto'].append(k.to_map() if k else None)
        if self.sale_channel is not None:
            result['sale_channel'] = self.sale_channel
        if self.official_sell_discount is not None:
            result['official_sell_discount'] = self.official_sell_discount
        if self.customer_value_info is not None:
            result['customer_value_info'] = self.customer_value_info.to_map()
        if self.market_info is not None:
            result['market_info'] = self.market_info.to_map()
        if self.cost_info is not None:
            result['cost_info'] = self.cost_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('price_object_code') is not None:
            self.price_object_code = m.get('price_object_code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        if m.get('business_project_id') is not None:
            self.business_project_id = m.get('business_project_id')
        if m.get('execute_condition') is not None:
            self.execute_condition = m.get('execute_condition')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        if m.get('no_match_rule') is not None:
            self.no_match_rule = m.get('no_match_rule')
        if m.get('pricing_mode') is not None:
            self.pricing_mode = m.get('pricing_mode')
        if m.get('pricing_method') is not None:
            self.pricing_method = m.get('pricing_method')
        if m.get('ladder_interval_type') is not None:
            self.ladder_interval_type = m.get('ladder_interval_type')
        if m.get('parent_price_plan_id') is not None:
            self.parent_price_plan_id = m.get('parent_price_plan_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('modifier') is not None:
            self.modifier = m.get('modifier')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('basis') is not None:
            self.basis = m.get('basis')
        if m.get('price_condition_codes') is not None:
            self.price_condition_codes = m.get('price_condition_codes')
        if m.get('price_safe_area') is not None:
            self.price_safe_area = m.get('price_safe_area')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('bpms_process_id') is not None:
            self.bpms_process_id = m.get('bpms_process_id')
        if m.get('strategy') is not None:
            self.strategy = m.get('strategy')
        if m.get('price_stage') is not None:
            self.price_stage = m.get('price_stage')
        self.price_constraint_vo_list = []
        if m.get('price_constraint_vo_list') is not None:
            for k in m.get('price_constraint_vo_list'):
                temp_model = PriceConstraintVO()
                self.price_constraint_vo_list.append(temp_model.from_map(k))
        self.price_limit_strategy_dto = []
        if m.get('price_limit_strategy_dto') is not None:
            for k in m.get('price_limit_strategy_dto'):
                temp_model = PriceLimitStrategyDTO()
                self.price_limit_strategy_dto.append(temp_model.from_map(k))
        if m.get('sale_channel') is not None:
            self.sale_channel = m.get('sale_channel')
        if m.get('official_sell_discount') is not None:
            self.official_sell_discount = m.get('official_sell_discount')
        if m.get('customer_value_info') is not None:
            temp_model = CustomerValueDetail()
            self.customer_value_info = temp_model.from_map(m['customer_value_info'])
        if m.get('market_info') is not None:
            temp_model = MarketInfo()
            self.market_info = temp_model.from_map(m['market_info'])
        if m.get('cost_info') is not None:
            temp_model = CostInfo()
            self.cost_info = temp_model.from_map(m['cost_info'])
        return self


class ProductLine(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        business_line_code: str = None,
        business_product: List[BusinessProduct] = None,
    ):
        # 溯源产品
        self.code = code
        # 产品线名称
        self.name = name
        # 业务产品线code
        self.business_line_code = business_line_code
        # l3
        self.business_product = business_product

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.business_line_code, 'business_line_code')
        self.validate_required(self.business_product, 'business_product')
        if self.business_product:
            for k in self.business_product:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.business_line_code is not None:
            result['business_line_code'] = self.business_line_code
        result['business_product'] = []
        if self.business_product is not None:
            for k in self.business_product:
                result['business_product'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('business_line_code') is not None:
            self.business_line_code = m.get('business_line_code')
        self.business_product = []
        if m.get('business_product') is not None:
            for k in m.get('business_product'):
                temp_model = BusinessProduct()
                self.business_product.append(temp_model.from_map(k))
        return self


class PriceObjectFee(TeaModel):
    def __init__(
        self,
        price_object_code: str = None,
        price_object_name: str = None,
        price: str = None,
        price_type: str = None,
        settle_type: str = None,
        currency: str = None,
        price_plan_vo: PricePlanVO = None,
        price_constraint_vo: PriceConstraintVO = None,
        extends_map: str = None,
        bd_price: str = None,
        cost_price: str = None,
    ):
        # 收费项CODE
        self.price_object_code = price_object_code
        # 收费项名称
        self.price_object_name = price_object_name
        # 高精度价格12位
        self.price = price
        # 价格类型，标准价格，一客一价
        self.price_type = price_type
        # 结算信息
        self.settle_type = settle_type
        # 币种
        self.currency = currency
        # 命中的定价计划
        self.price_plan_vo = price_plan_vo
        # 命中的定价计划约束
        self.price_constraint_vo = price_constraint_vo
        # 扩展信息
        self.extends_map = extends_map
        # BD销售价格区间
        self.bd_price = bd_price
        # 最低成本价
        self.cost_price = cost_price

    def validate(self):
        if self.price_plan_vo:
            self.price_plan_vo.validate()
        if self.price_constraint_vo:
            self.price_constraint_vo.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.price_object_code is not None:
            result['price_object_code'] = self.price_object_code
        if self.price_object_name is not None:
            result['price_object_name'] = self.price_object_name
        if self.price is not None:
            result['price'] = self.price
        if self.price_type is not None:
            result['price_type'] = self.price_type
        if self.settle_type is not None:
            result['settle_type'] = self.settle_type
        if self.currency is not None:
            result['currency'] = self.currency
        if self.price_plan_vo is not None:
            result['price_plan_vo'] = self.price_plan_vo.to_map()
        if self.price_constraint_vo is not None:
            result['price_constraint_vo'] = self.price_constraint_vo.to_map()
        if self.extends_map is not None:
            result['extends_map'] = self.extends_map
        if self.bd_price is not None:
            result['bd_price'] = self.bd_price
        if self.cost_price is not None:
            result['cost_price'] = self.cost_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('price_object_code') is not None:
            self.price_object_code = m.get('price_object_code')
        if m.get('price_object_name') is not None:
            self.price_object_name = m.get('price_object_name')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('price_type') is not None:
            self.price_type = m.get('price_type')
        if m.get('settle_type') is not None:
            self.settle_type = m.get('settle_type')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('price_plan_vo') is not None:
            temp_model = PricePlanVO()
            self.price_plan_vo = temp_model.from_map(m['price_plan_vo'])
        if m.get('price_constraint_vo') is not None:
            temp_model = PriceConstraintVO()
            self.price_constraint_vo = temp_model.from_map(m['price_constraint_vo'])
        if m.get('extends_map') is not None:
            self.extends_map = m.get('extends_map')
        if m.get('bd_price') is not None:
            self.bd_price = m.get('bd_price')
        if m.get('cost_price') is not None:
            self.cost_price = m.get('cost_price')
        return self


class PriceDetailDTO(TeaModel):
    def __init__(
        self,
        constraint_id: int = None,
        charge_item: str = None,
        stage_level: str = None,
        provider: str = None,
        base_price: str = None,
        bd_price: str = None,
        cost_price: str = None,
        price_unit: str = None,
        currency_value: str = None,
        ladder_start: str = None,
        ladder_end: str = None,
        price_plan_id: int = None,
        price_plan_name: str = None,
        start_time: str = None,
        end_time: str = None,
    ):
        # 定价约束id
        self.constraint_id = constraint_id
        # 计费项code
        self.charge_item = charge_item
        # 定价阶梯
        self.stage_level = stage_level
        # 供应商
        self.provider = provider
        # 刊例价
        self.base_price = base_price
        # BD权限价
        self.bd_price = bd_price
        # 底价
        self.cost_price = cost_price
        # 定价单位
        self.price_unit = price_unit
        # 币种
        self.currency_value = currency_value
        # 阶梯起始值
        self.ladder_start = ladder_start
        # 阶梯结束值
        self.ladder_end = ladder_end
        # 定价id
        self.price_plan_id = price_plan_id
        # 定价计划名称
        self.price_plan_name = price_plan_name
        # 定价开始时间
        self.start_time = start_time
        # 定价结束时间
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.constraint_id, 'constraint_id')
        self.validate_required(self.charge_item, 'charge_item')
        self.validate_required(self.stage_level, 'stage_level')
        self.validate_required(self.provider, 'provider')
        self.validate_required(self.base_price, 'base_price')
        self.validate_required(self.bd_price, 'bd_price')
        self.validate_required(self.cost_price, 'cost_price')
        self.validate_required(self.price_unit, 'price_unit')
        self.validate_required(self.currency_value, 'currency_value')
        self.validate_required(self.ladder_start, 'ladder_start')
        self.validate_required(self.ladder_end, 'ladder_end')
        self.validate_required(self.price_plan_id, 'price_plan_id')
        self.validate_required(self.price_plan_name, 'price_plan_name')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.constraint_id is not None:
            result['constraint_id'] = self.constraint_id
        if self.charge_item is not None:
            result['charge_item'] = self.charge_item
        if self.stage_level is not None:
            result['stage_level'] = self.stage_level
        if self.provider is not None:
            result['provider'] = self.provider
        if self.base_price is not None:
            result['base_price'] = self.base_price
        if self.bd_price is not None:
            result['bd_price'] = self.bd_price
        if self.cost_price is not None:
            result['cost_price'] = self.cost_price
        if self.price_unit is not None:
            result['price_unit'] = self.price_unit
        if self.currency_value is not None:
            result['currency_value'] = self.currency_value
        if self.ladder_start is not None:
            result['ladder_start'] = self.ladder_start
        if self.ladder_end is not None:
            result['ladder_end'] = self.ladder_end
        if self.price_plan_id is not None:
            result['price_plan_id'] = self.price_plan_id
        if self.price_plan_name is not None:
            result['price_plan_name'] = self.price_plan_name
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('constraint_id') is not None:
            self.constraint_id = m.get('constraint_id')
        if m.get('charge_item') is not None:
            self.charge_item = m.get('charge_item')
        if m.get('stage_level') is not None:
            self.stage_level = m.get('stage_level')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('base_price') is not None:
            self.base_price = m.get('base_price')
        if m.get('bd_price') is not None:
            self.bd_price = m.get('bd_price')
        if m.get('cost_price') is not None:
            self.cost_price = m.get('cost_price')
        if m.get('price_unit') is not None:
            self.price_unit = m.get('price_unit')
        if m.get('currency_value') is not None:
            self.currency_value = m.get('currency_value')
        if m.get('ladder_start') is not None:
            self.ladder_start = m.get('ladder_start')
        if m.get('ladder_end') is not None:
            self.ladder_end = m.get('ladder_end')
        if m.get('price_plan_id') is not None:
            self.price_plan_id = m.get('price_plan_id')
        if m.get('price_plan_name') is not None:
            self.price_plan_name = m.get('price_plan_name')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class ProductBaseInfo(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        name_en: str = None,
        short_code: str = None,
    ):
        # 产品码，系统内部识别
        self.code = code
        # 产品名称
        self.name = name
        # 产品英文名称
        self.name_en = name_en
        # 产品短码，管理维度识别
        self.short_code = short_code

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.short_code, 'short_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.name_en is not None:
            result['name_en'] = self.name_en
        if self.short_code is not None:
            result['short_code'] = self.short_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('name_en') is not None:
            self.name_en = m.get('name_en')
        if m.get('short_code') is not None:
            self.short_code = m.get('short_code')
        return self


class ModelPriceItemDTO(TeaModel):
    def __init__(
        self,
        model: str = None,
        prices: List[PriceDetailDTO] = None,
    ):
        # 模型名称
        self.model = model
        # 定价详情
        self.prices = prices

    def validate(self):
        self.validate_required(self.model, 'model')
        self.validate_required(self.prices, 'prices')
        if self.prices:
            for k in self.prices:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.model is not None:
            result['model'] = self.model
        result['prices'] = []
        if self.prices is not None:
            for k in self.prices:
                result['prices'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('model') is not None:
            self.model = m.get('model')
        self.prices = []
        if m.get('prices') is not None:
            for k in m.get('prices'):
                temp_model = PriceDetailDTO()
                self.prices.append(temp_model.from_map(k))
        return self


class BusinessLine(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        product_line: List[ProductLine] = None,
    ):
        # 产品线code
        self.code = code
        # 1级产品线name
        self.name = name
        # L2
        self.product_line = product_line

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.product_line, 'product_line')
        if self.product_line:
            for k in self.product_line:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        result['product_line'] = []
        if self.product_line is not None:
            for k in self.product_line:
                result['product_line'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        self.product_line = []
        if m.get('product_line') is not None:
            for k in m.get('product_line'):
                temp_model = ProductLine()
                self.product_line.append(temp_model.from_map(k))
        return self


class CustomerValueInfo(TeaModel):
    def __init__(
        self,
        customer_value_details: List[CustomerValueDetail] = None,
    ):
        # 客户价价值法信息
        self.customer_value_details = customer_value_details

    def validate(self):
        if self.customer_value_details:
            for k in self.customer_value_details:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['customer_value_details'] = []
        if self.customer_value_details is not None:
            for k in self.customer_value_details:
                result['customer_value_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.customer_value_details = []
        if m.get('customer_value_details') is not None:
            for k in m.get('customer_value_details'):
                temp_model = CustomerValueDetail()
                self.customer_value_details.append(temp_model.from_map(k))
        return self


class InquiryPriceResponse(TeaModel):
    def __init__(
        self,
        price: str = None,
        currency: str = None,
        bd_price: str = None,
        cost_price: str = None,
        price_object_fee_list: List[PriceObjectFee] = None,
    ):
        # 高精度12位价格
        self.price = price
        # 币种
        self.currency = currency
        # BD销售价格(高精度12位)
        self.bd_price = bd_price
        # 最低成本价(高精度12位)
        self.cost_price = cost_price
        # 收费项结果明细列表
        self.price_object_fee_list = price_object_fee_list

    def validate(self):
        if self.price_object_fee_list:
            for k in self.price_object_fee_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.price is not None:
            result['price'] = self.price
        if self.currency is not None:
            result['currency'] = self.currency
        if self.bd_price is not None:
            result['bd_price'] = self.bd_price
        if self.cost_price is not None:
            result['cost_price'] = self.cost_price
        result['price_object_fee_list'] = []
        if self.price_object_fee_list is not None:
            for k in self.price_object_fee_list:
                result['price_object_fee_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('bd_price') is not None:
            self.bd_price = m.get('bd_price')
        if m.get('cost_price') is not None:
            self.cost_price = m.get('cost_price')
        self.price_object_fee_list = []
        if m.get('price_object_fee_list') is not None:
            for k in m.get('price_object_fee_list'):
                temp_model = PriceObjectFee()
                self.price_object_fee_list.append(temp_model.from_map(k))
        return self


class Commodity(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        status: str = None,
    ):
        # 商品编码
        self.code = code
        # 商品名称
        self.name = name
        # 商品状态
        self.status = status

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class AmountSummaryConfig(TeaModel):
    def __init__(
        self,
        summary_key: str = None,
        summary_value: str = None,
    ):
        # 汇总KEY
        self.summary_key = summary_key
        # 汇总金额，单位为元
        self.summary_value = summary_value

    def validate(self):
        self.validate_required(self.summary_key, 'summary_key')
        self.validate_required(self.summary_value, 'summary_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.summary_key is not None:
            result['summary_key'] = self.summary_key
        if self.summary_value is not None:
            result['summary_value'] = self.summary_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('summary_key') is not None:
            self.summary_key = m.get('summary_key')
        if m.get('summary_value') is not None:
            self.summary_value = m.get('summary_value')
        return self


class InvoiceLineVO(TeaModel):
    def __init__(
        self,
        line_amt: str = None,
        line_id: str = None,
        tax_amt: str = None,
        tax_rate: str = None,
        line_product_name: str = None,
        tax_exclusive_amt: str = None,
        quantity: int = None,
        unit: str = None,
        unit_price: str = None,
        specification_model: str = None,
        tax_classification_name: str = None,
        tax_classification_code: str = None,
        product_name_suffix: str = None,
    ):
        # 发票行金额
        self.line_amt = line_amt
        # 发票行ID
        self.line_id = line_id
        # 税额
        self.tax_amt = tax_amt
        # 税率
        self.tax_rate = tax_rate
        # 货物或劳务名称，如 软件服务费201612
        self.line_product_name = line_product_name
        # 不含税金额
        self.tax_exclusive_amt = tax_exclusive_amt
        # 数量
        self.quantity = quantity
        # 单位
        self.unit = unit
        # 单价
        self.unit_price = unit_price
        # 规格型号
        self.specification_model = specification_model
        # 服务大类
        self.tax_classification_name = tax_classification_name
        # 税收分类编号
        self.tax_classification_code = tax_classification_code
        # 货物或劳务名称后缀
        self.product_name_suffix = product_name_suffix

    def validate(self):
        self.validate_required(self.line_amt, 'line_amt')
        self.validate_required(self.line_id, 'line_id')
        self.validate_required(self.tax_amt, 'tax_amt')
        self.validate_required(self.tax_rate, 'tax_rate')
        self.validate_required(self.line_product_name, 'line_product_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.line_amt is not None:
            result['line_amt'] = self.line_amt
        if self.line_id is not None:
            result['line_id'] = self.line_id
        if self.tax_amt is not None:
            result['tax_amt'] = self.tax_amt
        if self.tax_rate is not None:
            result['tax_rate'] = self.tax_rate
        if self.line_product_name is not None:
            result['line_product_name'] = self.line_product_name
        if self.tax_exclusive_amt is not None:
            result['tax_exclusive_amt'] = self.tax_exclusive_amt
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.unit is not None:
            result['unit'] = self.unit
        if self.unit_price is not None:
            result['unit_price'] = self.unit_price
        if self.specification_model is not None:
            result['specification_model'] = self.specification_model
        if self.tax_classification_name is not None:
            result['tax_classification_name'] = self.tax_classification_name
        if self.tax_classification_code is not None:
            result['tax_classification_code'] = self.tax_classification_code
        if self.product_name_suffix is not None:
            result['product_name_suffix'] = self.product_name_suffix
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('line_amt') is not None:
            self.line_amt = m.get('line_amt')
        if m.get('line_id') is not None:
            self.line_id = m.get('line_id')
        if m.get('tax_amt') is not None:
            self.tax_amt = m.get('tax_amt')
        if m.get('tax_rate') is not None:
            self.tax_rate = m.get('tax_rate')
        if m.get('line_product_name') is not None:
            self.line_product_name = m.get('line_product_name')
        if m.get('tax_exclusive_amt') is not None:
            self.tax_exclusive_amt = m.get('tax_exclusive_amt')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('unit_price') is not None:
            self.unit_price = m.get('unit_price')
        if m.get('specification_model') is not None:
            self.specification_model = m.get('specification_model')
        if m.get('tax_classification_name') is not None:
            self.tax_classification_name = m.get('tax_classification_name')
        if m.get('tax_classification_code') is not None:
            self.tax_classification_code = m.get('tax_classification_code')
        if m.get('product_name_suffix') is not None:
            self.product_name_suffix = m.get('product_name_suffix')
        return self


class ApplyInvoiceSeller(TeaModel):
    def __init__(
        self,
        seller_address: str = None,
        seller_bank_account: str = None,
        seller_bank_name: str = None,
        seller_company_name: str = None,
        seller_tax_no: str = None,
        seller_telephone: str = None,
        seller_inst_id: str = None,
    ):
        # 地址
        self.seller_address = seller_address
        # 银行账号
        self.seller_bank_account = seller_bank_account
        # 银行名称
        self.seller_bank_name = seller_bank_name
        # 公司名称
        self.seller_company_name = seller_company_name
        # 税号
        self.seller_tax_no = seller_tax_no
        # 电话
        self.seller_telephone = seller_telephone
        # 销方机构id
        self.seller_inst_id = seller_inst_id

    def validate(self):
        self.validate_required(self.seller_bank_account, 'seller_bank_account')
        self.validate_required(self.seller_bank_name, 'seller_bank_name')
        self.validate_required(self.seller_company_name, 'seller_company_name')
        self.validate_required(self.seller_tax_no, 'seller_tax_no')
        self.validate_required(self.seller_telephone, 'seller_telephone')
        self.validate_required(self.seller_inst_id, 'seller_inst_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.seller_address is not None:
            result['seller_address'] = self.seller_address
        if self.seller_bank_account is not None:
            result['seller_bank_account'] = self.seller_bank_account
        if self.seller_bank_name is not None:
            result['seller_bank_name'] = self.seller_bank_name
        if self.seller_company_name is not None:
            result['seller_company_name'] = self.seller_company_name
        if self.seller_tax_no is not None:
            result['seller_tax_no'] = self.seller_tax_no
        if self.seller_telephone is not None:
            result['seller_telephone'] = self.seller_telephone
        if self.seller_inst_id is not None:
            result['seller_inst_id'] = self.seller_inst_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('seller_address') is not None:
            self.seller_address = m.get('seller_address')
        if m.get('seller_bank_account') is not None:
            self.seller_bank_account = m.get('seller_bank_account')
        if m.get('seller_bank_name') is not None:
            self.seller_bank_name = m.get('seller_bank_name')
        if m.get('seller_company_name') is not None:
            self.seller_company_name = m.get('seller_company_name')
        if m.get('seller_tax_no') is not None:
            self.seller_tax_no = m.get('seller_tax_no')
        if m.get('seller_telephone') is not None:
            self.seller_telephone = m.get('seller_telephone')
        if m.get('seller_inst_id') is not None:
            self.seller_inst_id = m.get('seller_inst_id')
        return self


class ApplyInvoiceDelivery(TeaModel):
    def __init__(
        self,
        delivery_type: str = None,
        pid: str = None,
        name: str = None,
        telephone: str = None,
        country: str = None,
        province: str = None,
        city: str = None,
        county_district: str = None,
        street: str = None,
        detail_address: str = None,
        email: str = None,
    ):
        # 寄送类型，如1表示快递，2表示email
        self.delivery_type = delivery_type
        # 开票人PID
        self.pid = pid
        # 收件人名称
        self.name = name
        # 电话
        self.telephone = telephone
        # 国家
        self.country = country
        # 省份
        self.province = province
        # 市
        self.city = city
        # 区县
        self.county_district = county_district
        # 街道
        self.street = street
        # 详细地址
        self.detail_address = detail_address
        # 收件人邮件
        self.email = email

    def validate(self):
        self.validate_required(self.pid, 'pid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.delivery_type is not None:
            result['delivery_type'] = self.delivery_type
        if self.pid is not None:
            result['pid'] = self.pid
        if self.name is not None:
            result['name'] = self.name
        if self.telephone is not None:
            result['telephone'] = self.telephone
        if self.country is not None:
            result['country'] = self.country
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
        if self.county_district is not None:
            result['county_district'] = self.county_district
        if self.street is not None:
            result['street'] = self.street
        if self.detail_address is not None:
            result['detail_address'] = self.detail_address
        if self.email is not None:
            result['email'] = self.email
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('delivery_type') is not None:
            self.delivery_type = m.get('delivery_type')
        if m.get('pid') is not None:
            self.pid = m.get('pid')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('telephone') is not None:
            self.telephone = m.get('telephone')
        if m.get('country') is not None:
            self.country = m.get('country')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('county_district') is not None:
            self.county_district = m.get('county_district')
        if m.get('street') is not None:
            self.street = m.get('street')
        if m.get('detail_address') is not None:
            self.detail_address = m.get('detail_address')
        if m.get('email') is not None:
            self.email = m.get('email')
        return self


class InvoiceInfoVO(TeaModel):
    def __init__(
        self,
        invoice_id: str = None,
        invoice_code: str = None,
        invoice_no: str = None,
        invoice_amt: str = None,
        invoice_type: str = None,
        status: str = None,
        invoice_material: str = None,
        invoice_lines: List[InvoiceLineVO] = None,
        invoice_date: str = None,
    ):
        # 发票ID
        self.invoice_id = invoice_id
        # 发票编号
        self.invoice_code = invoice_code
        # 发票号码
        self.invoice_no = invoice_no
        # 发票金额
        self.invoice_amt = invoice_amt
        # 发票类型,01专票 02普票 03营业税发票 04国际形式发票 05其它发票
        self.invoice_type = invoice_type
        # 发票的业务状态, 待开票: TO_INV, 开票中: INV_ING, 已开票: INVED, 退票中: INV_RETURN, 换票中: INV_REPLACE, 已失效: INV_DEP
        self.status = status
        # 发票介质，01：电子，02：纸质
        self.invoice_material = invoice_material
        # 发票行信息
        self.invoice_lines = invoice_lines
        # 开票日期
        self.invoice_date = invoice_date

    def validate(self):
        self.validate_required(self.invoice_id, 'invoice_id')
        self.validate_required(self.invoice_amt, 'invoice_amt')
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.status, 'status')
        if self.invoice_lines:
            for k in self.invoice_lines:
                if k:
                    k.validate()
        self.validate_required(self.invoice_date, 'invoice_date')
        if self.invoice_date is not None:
            self.validate_pattern(self.invoice_date, 'invoice_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoice_id is not None:
            result['invoice_id'] = self.invoice_id
        if self.invoice_code is not None:
            result['invoice_code'] = self.invoice_code
        if self.invoice_no is not None:
            result['invoice_no'] = self.invoice_no
        if self.invoice_amt is not None:
            result['invoice_amt'] = self.invoice_amt
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.status is not None:
            result['status'] = self.status
        if self.invoice_material is not None:
            result['invoice_material'] = self.invoice_material
        result['invoice_lines'] = []
        if self.invoice_lines is not None:
            for k in self.invoice_lines:
                result['invoice_lines'].append(k.to_map() if k else None)
        if self.invoice_date is not None:
            result['invoice_date'] = self.invoice_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoice_id') is not None:
            self.invoice_id = m.get('invoice_id')
        if m.get('invoice_code') is not None:
            self.invoice_code = m.get('invoice_code')
        if m.get('invoice_no') is not None:
            self.invoice_no = m.get('invoice_no')
        if m.get('invoice_amt') is not None:
            self.invoice_amt = m.get('invoice_amt')
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('invoice_material') is not None:
            self.invoice_material = m.get('invoice_material')
        self.invoice_lines = []
        if m.get('invoice_lines') is not None:
            for k in m.get('invoice_lines'):
                temp_model = InvoiceLineVO()
                self.invoice_lines.append(temp_model.from_map(k))
        if m.get('invoice_date') is not None:
            self.invoice_date = m.get('invoice_date')
        return self


class ApplyInvoiceAmountAllocation(TeaModel):
    def __init__(
        self,
        amount_summary_config: List[AmountSummaryConfig] = None,
        amount_source: str = None,
        ccy: str = None,
    ):
        # 额度汇总信息，标准可开票单据下，KEY为需要占用的单据号，VALUE为需要占用的额度
        self.amount_summary_config = amount_summary_config
        # 额度来源，默认INVOICE_RCPT
        self.amount_source = amount_source
        # 币种，默认156
        self.ccy = ccy

    def validate(self):
        if self.amount_summary_config:
            for k in self.amount_summary_config:
                if k:
                    k.validate()
        self.validate_required(self.ccy, 'ccy')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['amount_summary_config'] = []
        if self.amount_summary_config is not None:
            for k in self.amount_summary_config:
                result['amount_summary_config'].append(k.to_map() if k else None)
        if self.amount_source is not None:
            result['amount_source'] = self.amount_source
        if self.ccy is not None:
            result['ccy'] = self.ccy
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.amount_summary_config = []
        if m.get('amount_summary_config') is not None:
            for k in m.get('amount_summary_config'):
                temp_model = AmountSummaryConfig()
                self.amount_summary_config.append(temp_model.from_map(k))
        if m.get('amount_source') is not None:
            self.amount_source = m.get('amount_source')
        if m.get('ccy') is not None:
            self.ccy = m.get('ccy')
        return self


class PreviewInvoiceLine(TeaModel):
    def __init__(
        self,
        line_product_name: str = None,
        tax_rate: str = None,
        line_amt: str = None,
        ccy: str = None,
        measurement_unit: str = None,
        relate_commodity_code: str = None,
        service_mode: str = None,
        product_specification: str = None,
    ):
        # 货物名称(商品名称)
        self.line_product_name = line_product_name
        # 税率
        self.tax_rate = tax_rate
        # 发票行含税金额，单位:元
        self.line_amt = line_amt
        # 币种，默认156
        self.ccy = ccy
        # 单位
        self.measurement_unit = measurement_unit
        # 关联的L5商品
        self.relate_commodity_code = relate_commodity_code
        # 服务类型 如：AFTECH_SERVICE
        self.service_mode = service_mode
        # 规格型号
        self.product_specification = product_specification

    def validate(self):
        self.validate_required(self.line_product_name, 'line_product_name')
        self.validate_required(self.tax_rate, 'tax_rate')
        self.validate_required(self.line_amt, 'line_amt')
        self.validate_required(self.relate_commodity_code, 'relate_commodity_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.line_product_name is not None:
            result['line_product_name'] = self.line_product_name
        if self.tax_rate is not None:
            result['tax_rate'] = self.tax_rate
        if self.line_amt is not None:
            result['line_amt'] = self.line_amt
        if self.ccy is not None:
            result['ccy'] = self.ccy
        if self.measurement_unit is not None:
            result['measurement_unit'] = self.measurement_unit
        if self.relate_commodity_code is not None:
            result['relate_commodity_code'] = self.relate_commodity_code
        if self.service_mode is not None:
            result['service_mode'] = self.service_mode
        if self.product_specification is not None:
            result['product_specification'] = self.product_specification
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('line_product_name') is not None:
            self.line_product_name = m.get('line_product_name')
        if m.get('tax_rate') is not None:
            self.tax_rate = m.get('tax_rate')
        if m.get('line_amt') is not None:
            self.line_amt = m.get('line_amt')
        if m.get('ccy') is not None:
            self.ccy = m.get('ccy')
        if m.get('measurement_unit') is not None:
            self.measurement_unit = m.get('measurement_unit')
        if m.get('relate_commodity_code') is not None:
            self.relate_commodity_code = m.get('relate_commodity_code')
        if m.get('service_mode') is not None:
            self.service_mode = m.get('service_mode')
        if m.get('product_specification') is not None:
            self.product_specification = m.get('product_specification')
        return self


class ApplyInvoiceBuyer(TeaModel):
    def __init__(
        self,
        buyer_address: str = None,
        buyer_bank_account: str = None,
        buyer_bank_name: str = None,
        buyer_invoice_title: str = None,
        buyer_tax_no: str = None,
        buyer_telephone: str = None,
        tax_payer_qualification: str = None,
        buyer_config_id: str = None,
    ):
        # 购方地址
        self.buyer_address = buyer_address
        # 银行账号
        self.buyer_bank_account = buyer_bank_account
        # 银行名称
        self.buyer_bank_name = buyer_bank_name
        # 抬头
        self.buyer_invoice_title = buyer_invoice_title
        # 税号
        self.buyer_tax_no = buyer_tax_no
        # 电话
        self.buyer_telephone = buyer_telephone
        # 纳税人资格类型
        self.tax_payer_qualification = tax_payer_qualification
        # 客户开票配置ID
        self.buyer_config_id = buyer_config_id

    def validate(self):
        self.validate_required(self.buyer_invoice_title, 'buyer_invoice_title')
        self.validate_required(self.tax_payer_qualification, 'tax_payer_qualification')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.buyer_address is not None:
            result['buyer_address'] = self.buyer_address
        if self.buyer_bank_account is not None:
            result['buyer_bank_account'] = self.buyer_bank_account
        if self.buyer_bank_name is not None:
            result['buyer_bank_name'] = self.buyer_bank_name
        if self.buyer_invoice_title is not None:
            result['buyer_invoice_title'] = self.buyer_invoice_title
        if self.buyer_tax_no is not None:
            result['buyer_tax_no'] = self.buyer_tax_no
        if self.buyer_telephone is not None:
            result['buyer_telephone'] = self.buyer_telephone
        if self.tax_payer_qualification is not None:
            result['tax_payer_qualification'] = self.tax_payer_qualification
        if self.buyer_config_id is not None:
            result['buyer_config_id'] = self.buyer_config_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('buyer_address') is not None:
            self.buyer_address = m.get('buyer_address')
        if m.get('buyer_bank_account') is not None:
            self.buyer_bank_account = m.get('buyer_bank_account')
        if m.get('buyer_bank_name') is not None:
            self.buyer_bank_name = m.get('buyer_bank_name')
        if m.get('buyer_invoice_title') is not None:
            self.buyer_invoice_title = m.get('buyer_invoice_title')
        if m.get('buyer_tax_no') is not None:
            self.buyer_tax_no = m.get('buyer_tax_no')
        if m.get('buyer_telephone') is not None:
            self.buyer_telephone = m.get('buyer_telephone')
        if m.get('tax_payer_qualification') is not None:
            self.tax_payer_qualification = m.get('tax_payer_qualification')
        if m.get('buyer_config_id') is not None:
            self.buyer_config_id = m.get('buyer_config_id')
        return self


class IntlInvoiceInfoItem(TeaModel):
    def __init__(
        self,
        invoice_no: str = None,
        invoice_amt: str = None,
        excluding_tax_invoice_amt: str = None,
        tax_amt: str = None,
        tax: str = None,
        status: str = None,
        invoice_id: str = None,
    ):
        # 发票号
        self.invoice_no = invoice_no
        # 发票金额
        self.invoice_amt = invoice_amt
        # 不含税金
        self.excluding_tax_invoice_amt = excluding_tax_invoice_amt
        # 税额
        self.tax_amt = tax_amt
        # 税率
        self.tax = tax
        # 状态
        self.status = status
        # 发票ID
        self.invoice_id = invoice_id

    def validate(self):
        self.validate_required(self.invoice_no, 'invoice_no')
        self.validate_required(self.invoice_amt, 'invoice_amt')
        self.validate_required(self.excluding_tax_invoice_amt, 'excluding_tax_invoice_amt')
        self.validate_required(self.tax_amt, 'tax_amt')
        self.validate_required(self.tax, 'tax')
        self.validate_required(self.status, 'status')
        self.validate_required(self.invoice_id, 'invoice_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoice_no is not None:
            result['invoice_no'] = self.invoice_no
        if self.invoice_amt is not None:
            result['invoice_amt'] = self.invoice_amt
        if self.excluding_tax_invoice_amt is not None:
            result['excluding_tax_invoice_amt'] = self.excluding_tax_invoice_amt
        if self.tax_amt is not None:
            result['tax_amt'] = self.tax_amt
        if self.tax is not None:
            result['tax'] = self.tax
        if self.status is not None:
            result['status'] = self.status
        if self.invoice_id is not None:
            result['invoice_id'] = self.invoice_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoice_no') is not None:
            self.invoice_no = m.get('invoice_no')
        if m.get('invoice_amt') is not None:
            self.invoice_amt = m.get('invoice_amt')
        if m.get('excluding_tax_invoice_amt') is not None:
            self.excluding_tax_invoice_amt = m.get('excluding_tax_invoice_amt')
        if m.get('tax_amt') is not None:
            self.tax_amt = m.get('tax_amt')
        if m.get('tax') is not None:
            self.tax = m.get('tax')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('invoice_id') is not None:
            self.invoice_id = m.get('invoice_id')
        return self


class ApplyInvoiceLine(TeaModel):
    def __init__(
        self,
        amt: str = None,
        tax_amt: str = None,
        tax_rate: str = None,
        tax_exclusive_amt: str = None,
        unit_amt: str = None,
        tax_classification_code: str = None,
        product_name: str = None,
        product_code: str = None,
        product_specification: str = None,
        measurement_nnit: str = None,
        quantity: str = None,
        invoice_line_id: str = None,
        product_name_suffix: str = None,
    ):
        # 含税金额
        self.amt = amt
        # 税额
        self.tax_amt = tax_amt
        # 税率
        self.tax_rate = tax_rate
        # 不含税金额
        self.tax_exclusive_amt = tax_exclusive_amt
        # 含税单价
        self.unit_amt = unit_amt
        # 服务大类编号
        self.tax_classification_code = tax_classification_code
        # 货物或劳务名称
        self.product_name = product_name
        # 产品CODE
        self.product_code = product_code
        # 规格型号
        self.product_specification = product_specification
        # 计量单位
        self.measurement_nnit = measurement_nnit
        # 数量，默认为1
        self.quantity = quantity
        # 发票行ID
        self.invoice_line_id = invoice_line_id
        # 劳务与货物名称的后缀，主要有账期（202309）、PID（2088XXXX）等
        self.product_name_suffix = product_name_suffix

    def validate(self):
        self.validate_required(self.amt, 'amt')
        self.validate_required(self.tax_amt, 'tax_amt')
        self.validate_required(self.tax_rate, 'tax_rate')
        self.validate_required(self.tax_exclusive_amt, 'tax_exclusive_amt')
        self.validate_required(self.unit_amt, 'unit_amt')
        self.validate_required(self.tax_classification_code, 'tax_classification_code')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.invoice_line_id, 'invoice_line_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.amt is not None:
            result['amt'] = self.amt
        if self.tax_amt is not None:
            result['tax_amt'] = self.tax_amt
        if self.tax_rate is not None:
            result['tax_rate'] = self.tax_rate
        if self.tax_exclusive_amt is not None:
            result['tax_exclusive_amt'] = self.tax_exclusive_amt
        if self.unit_amt is not None:
            result['unit_amt'] = self.unit_amt
        if self.tax_classification_code is not None:
            result['tax_classification_code'] = self.tax_classification_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_specification is not None:
            result['product_specification'] = self.product_specification
        if self.measurement_nnit is not None:
            result['measurement_nnit'] = self.measurement_nnit
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.invoice_line_id is not None:
            result['invoice_line_id'] = self.invoice_line_id
        if self.product_name_suffix is not None:
            result['product_name_suffix'] = self.product_name_suffix
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('amt') is not None:
            self.amt = m.get('amt')
        if m.get('tax_amt') is not None:
            self.tax_amt = m.get('tax_amt')
        if m.get('tax_rate') is not None:
            self.tax_rate = m.get('tax_rate')
        if m.get('tax_exclusive_amt') is not None:
            self.tax_exclusive_amt = m.get('tax_exclusive_amt')
        if m.get('unit_amt') is not None:
            self.unit_amt = m.get('unit_amt')
        if m.get('tax_classification_code') is not None:
            self.tax_classification_code = m.get('tax_classification_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_specification') is not None:
            self.product_specification = m.get('product_specification')
        if m.get('measurement_nnit') is not None:
            self.measurement_nnit = m.get('measurement_nnit')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('invoice_line_id') is not None:
            self.invoice_line_id = m.get('invoice_line_id')
        if m.get('product_name_suffix') is not None:
            self.product_name_suffix = m.get('product_name_suffix')
        return self


class IntlInvoiceApplyInfoItem(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        invoice_apply_id: str = None,
        invoice_amt: str = None,
        invoice_ccy: str = None,
        invoice_date: str = None,
        operator_name: str = None,
        operator_id: str = None,
        status: str = None,
        bsn_no: str = None,
        relate_invoices: List[IntlInvoiceInfoItem] = None,
        invoice_type: str = None,
        apply_type: str = None,
        elc_file_map: str = None,
    ):
        # 租户ID
        self.tenant_id = tenant_id
        # 发票申请ID
        self.invoice_apply_id = invoice_apply_id
        # 发票申请金额
        self.invoice_amt = invoice_amt
        # 发票币种
        self.invoice_ccy = invoice_ccy
        # 发票申请时间
        self.invoice_date = invoice_date
        # 申请人名称
        self.operator_name = operator_name
        # 申请人ID
        self.operator_id = operator_id
        # 申请状态
        self.status = status
        # 申请业务号
        self.bsn_no = bsn_no
        # 发票列表
        self.relate_invoices = relate_invoices
        # 发票类型
        self.invoice_type = invoice_type
        # 申请类型
        self.apply_type = apply_type
        # 形式发票文件映射
        self.elc_file_map = elc_file_map

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.invoice_apply_id, 'invoice_apply_id')
        self.validate_required(self.invoice_amt, 'invoice_amt')
        self.validate_required(self.invoice_ccy, 'invoice_ccy')
        self.validate_required(self.invoice_date, 'invoice_date')
        if self.invoice_date is not None:
            self.validate_pattern(self.invoice_date, 'invoice_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.operator_name, 'operator_name')
        self.validate_required(self.operator_id, 'operator_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.bsn_no, 'bsn_no')
        if self.relate_invoices:
            for k in self.relate_invoices:
                if k:
                    k.validate()
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.apply_type, 'apply_type')
        self.validate_required(self.elc_file_map, 'elc_file_map')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.invoice_apply_id is not None:
            result['invoice_apply_id'] = self.invoice_apply_id
        if self.invoice_amt is not None:
            result['invoice_amt'] = self.invoice_amt
        if self.invoice_ccy is not None:
            result['invoice_ccy'] = self.invoice_ccy
        if self.invoice_date is not None:
            result['invoice_date'] = self.invoice_date
        if self.operator_name is not None:
            result['operator_name'] = self.operator_name
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.status is not None:
            result['status'] = self.status
        if self.bsn_no is not None:
            result['bsn_no'] = self.bsn_no
        result['relate_invoices'] = []
        if self.relate_invoices is not None:
            for k in self.relate_invoices:
                result['relate_invoices'].append(k.to_map() if k else None)
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        if self.elc_file_map is not None:
            result['elc_file_map'] = self.elc_file_map
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('invoice_apply_id') is not None:
            self.invoice_apply_id = m.get('invoice_apply_id')
        if m.get('invoice_amt') is not None:
            self.invoice_amt = m.get('invoice_amt')
        if m.get('invoice_ccy') is not None:
            self.invoice_ccy = m.get('invoice_ccy')
        if m.get('invoice_date') is not None:
            self.invoice_date = m.get('invoice_date')
        if m.get('operator_name') is not None:
            self.operator_name = m.get('operator_name')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('bsn_no') is not None:
            self.bsn_no = m.get('bsn_no')
        self.relate_invoices = []
        if m.get('relate_invoices') is not None:
            for k in m.get('relate_invoices'):
                temp_model = IntlInvoiceInfoItem()
                self.relate_invoices.append(temp_model.from_map(k))
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        if m.get('elc_file_map') is not None:
            self.elc_file_map = m.get('elc_file_map')
        return self


class PreviewInvoiceRequest(TeaModel):
    def __init__(
        self,
        invoice_biz_scene: str = None,
        tenant_id: str = None,
        invoice_biz_action: str = None,
        ccy: str = None,
        ou: str = None,
        ar_no: str = None,
        source: str = None,
        operator_no: str = None,
        operator_name: str = None,
        out_biz_no: str = None,
        invoice_type: str = None,
        invoice_material: str = None,
        invoice_note: str = None,
        apply_reason: str = None,
        invoice_buyer: ApplyInvoiceBuyer = None,
        apply_invoice_delivery: ApplyInvoiceDelivery = None,
        apply_invoice_quota: ApplyInvoiceAmountAllocation = None,
        preview_invoice_lines: List[PreviewInvoiceLine] = None,
    ):
        # 开票场景，默认基于订单开票
        self.invoice_biz_scene = invoice_biz_scene
        # 租户ID
        self.tenant_id = tenant_id
        # 开票操作，默认预览开票PREVIEW_INVOICING
        self.invoice_biz_action = invoice_biz_action
        # 币种
        self.ccy = ccy
        # ou
        self.ou = ou
        # 合同号
        self.ar_no = ar_no
        # 调用来源
        self.source = source
        # 开票人ID
        self.operator_no = operator_no
        # 操作人名称
        self.operator_name = operator_name
        # 外部申请单据号，长度不超过32位
        self.out_biz_no = out_biz_no
        # 发票类型， 01 专票 02 普票
        self.invoice_type = invoice_type
        # 发票介质 01 电子发票 02 纸质发票
        self.invoice_material = invoice_material
        # 票面备注 该内容会原样展示到发票上
        self.invoice_note = invoice_note
        # 申请说明
        self.apply_reason = apply_reason
        # 购方信息
        self.invoice_buyer = invoice_buyer
        # 寄送信息
        self.apply_invoice_delivery = apply_invoice_delivery
        # 发票需要占用的额度信息
        self.apply_invoice_quota = apply_invoice_quota
        # 发票行列表
        self.preview_invoice_lines = preview_invoice_lines

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.ccy, 'ccy')
        self.validate_required(self.ou, 'ou')
        self.validate_required(self.ar_no, 'ar_no')
        self.validate_required(self.source, 'source')
        self.validate_required(self.operator_no, 'operator_no')
        self.validate_required(self.operator_name, 'operator_name')
        self.validate_required(self.out_biz_no, 'out_biz_no')
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.invoice_material, 'invoice_material')
        self.validate_required(self.invoice_buyer, 'invoice_buyer')
        if self.invoice_buyer:
            self.invoice_buyer.validate()
        self.validate_required(self.apply_invoice_delivery, 'apply_invoice_delivery')
        if self.apply_invoice_delivery:
            self.apply_invoice_delivery.validate()
        self.validate_required(self.apply_invoice_quota, 'apply_invoice_quota')
        if self.apply_invoice_quota:
            self.apply_invoice_quota.validate()
        if self.preview_invoice_lines:
            for k in self.preview_invoice_lines:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoice_biz_scene is not None:
            result['invoice_biz_scene'] = self.invoice_biz_scene
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.invoice_biz_action is not None:
            result['invoice_biz_action'] = self.invoice_biz_action
        if self.ccy is not None:
            result['ccy'] = self.ccy
        if self.ou is not None:
            result['ou'] = self.ou
        if self.ar_no is not None:
            result['ar_no'] = self.ar_no
        if self.source is not None:
            result['source'] = self.source
        if self.operator_no is not None:
            result['operator_no'] = self.operator_no
        if self.operator_name is not None:
            result['operator_name'] = self.operator_name
        if self.out_biz_no is not None:
            result['out_biz_no'] = self.out_biz_no
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.invoice_material is not None:
            result['invoice_material'] = self.invoice_material
        if self.invoice_note is not None:
            result['invoice_note'] = self.invoice_note
        if self.apply_reason is not None:
            result['apply_reason'] = self.apply_reason
        if self.invoice_buyer is not None:
            result['invoice_buyer'] = self.invoice_buyer.to_map()
        if self.apply_invoice_delivery is not None:
            result['apply_invoice_delivery'] = self.apply_invoice_delivery.to_map()
        if self.apply_invoice_quota is not None:
            result['apply_invoice_quota'] = self.apply_invoice_quota.to_map()
        result['preview_invoice_lines'] = []
        if self.preview_invoice_lines is not None:
            for k in self.preview_invoice_lines:
                result['preview_invoice_lines'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoice_biz_scene') is not None:
            self.invoice_biz_scene = m.get('invoice_biz_scene')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('invoice_biz_action') is not None:
            self.invoice_biz_action = m.get('invoice_biz_action')
        if m.get('ccy') is not None:
            self.ccy = m.get('ccy')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('ar_no') is not None:
            self.ar_no = m.get('ar_no')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('operator_no') is not None:
            self.operator_no = m.get('operator_no')
        if m.get('operator_name') is not None:
            self.operator_name = m.get('operator_name')
        if m.get('out_biz_no') is not None:
            self.out_biz_no = m.get('out_biz_no')
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('invoice_material') is not None:
            self.invoice_material = m.get('invoice_material')
        if m.get('invoice_note') is not None:
            self.invoice_note = m.get('invoice_note')
        if m.get('apply_reason') is not None:
            self.apply_reason = m.get('apply_reason')
        if m.get('invoice_buyer') is not None:
            temp_model = ApplyInvoiceBuyer()
            self.invoice_buyer = temp_model.from_map(m['invoice_buyer'])
        if m.get('apply_invoice_delivery') is not None:
            temp_model = ApplyInvoiceDelivery()
            self.apply_invoice_delivery = temp_model.from_map(m['apply_invoice_delivery'])
        if m.get('apply_invoice_quota') is not None:
            temp_model = ApplyInvoiceAmountAllocation()
            self.apply_invoice_quota = temp_model.from_map(m['apply_invoice_quota'])
        self.preview_invoice_lines = []
        if m.get('preview_invoice_lines') is not None:
            for k in m.get('preview_invoice_lines'):
                temp_model = PreviewInvoiceLine()
                self.preview_invoice_lines.append(temp_model.from_map(k))
        return self


class ReturnInvoiceInfo(TeaModel):
    def __init__(
        self,
        invoice_id: str = None,
        return_order_type: str = None,
        return_reason_type: str = None,
        memo: str = None,
        tracking_no: str = None,
        express_company_name: str = None,
        auth: str = None,
    ):
        # 发票ID
        self.invoice_id = invoice_id
        # 退换票类型,01:退票 02:换票
        self.return_order_type = return_order_type
        # 退换票原因类型, 01：发票介质修改  02：发票类型修改  03：发票信息修改 05：其他 06：不需要发票
        self.return_reason_type = return_reason_type
        # 备注
        self.memo = memo
        # 快递单号
        self.tracking_no = tracking_no
        # 快递公司名称
        self.express_company_name = express_company_name
        # 是否认证，1：已认证抵扣 0：未认证抵扣
        self.auth = auth

    def validate(self):
        self.validate_required(self.invoice_id, 'invoice_id')
        self.validate_required(self.return_order_type, 'return_order_type')
        self.validate_required(self.return_reason_type, 'return_reason_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoice_id is not None:
            result['invoice_id'] = self.invoice_id
        if self.return_order_type is not None:
            result['return_order_type'] = self.return_order_type
        if self.return_reason_type is not None:
            result['return_reason_type'] = self.return_reason_type
        if self.memo is not None:
            result['memo'] = self.memo
        if self.tracking_no is not None:
            result['tracking_no'] = self.tracking_no
        if self.express_company_name is not None:
            result['express_company_name'] = self.express_company_name
        if self.auth is not None:
            result['auth'] = self.auth
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoice_id') is not None:
            self.invoice_id = m.get('invoice_id')
        if m.get('return_order_type') is not None:
            self.return_order_type = m.get('return_order_type')
        if m.get('return_reason_type') is not None:
            self.return_reason_type = m.get('return_reason_type')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        if m.get('tracking_no') is not None:
            self.tracking_no = m.get('tracking_no')
        if m.get('express_company_name') is not None:
            self.express_company_name = m.get('express_company_name')
        if m.get('auth') is not None:
            self.auth = m.get('auth')
        return self


class InvoiceMaterialVO(TeaModel):
    def __init__(
        self,
        material: str = None,
        name: str = None,
    ):
        # 发票介质，01: 电子发票; 02: 纸质发票
        self.material = material
        # 名称
        self.name = name

    def validate(self):
        self.validate_required(self.material, 'material')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.material is not None:
            result['material'] = self.material
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('material') is not None:
            self.material = m.get('material')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CountryCnEnItem(TeaModel):
    def __init__(
        self,
        country_code: str = None,
        country_cn: str = None,
        country_en: str = None,
    ):
        # 国家字母编号
        self.country_code = country_code
        # 国家中文名称
        self.country_cn = country_cn
        # 国家英文名称
        self.country_en = country_en

    def validate(self):
        self.validate_required(self.country_code, 'country_code')
        self.validate_required(self.country_cn, 'country_cn')
        self.validate_required(self.country_en, 'country_en')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.country_code is not None:
            result['country_code'] = self.country_code
        if self.country_cn is not None:
            result['country_cn'] = self.country_cn
        if self.country_en is not None:
            result['country_en'] = self.country_en
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('country_code') is not None:
            self.country_code = m.get('country_code')
        if m.get('country_cn') is not None:
            self.country_cn = m.get('country_cn')
        if m.get('country_en') is not None:
            self.country_en = m.get('country_en')
        return self


class InvoicePreviewVO(TeaModel):
    def __init__(
        self,
        invoice_no: str = None,
        invoice_code: str = None,
        invoice_date: str = None,
        invoice_type: str = None,
        invoice_amt: str = None,
        tax_amt: str = None,
        invoice_seller: ApplyInvoiceSeller = None,
        invoice_buyer: ApplyInvoiceBuyer = None,
        invoice_note: str = None,
        tenant_id: str = None,
        invoice_id: str = None,
        invoice_material: str = None,
        memo: str = None,
        invoice_lines: List[InvoiceLineVO] = None,
        invoice_preview_log_no: str = None,
    ):
        # 发票号码
        self.invoice_no = invoice_no
        # 发票代码
        self.invoice_code = invoice_code
        # 开票时间
        self.invoice_date = invoice_date
        # 发票类型
        self.invoice_type = invoice_type
        # 开票金额
        self.invoice_amt = invoice_amt
        # 税额
        self.tax_amt = tax_amt
        # 销方信息
        self.invoice_seller = invoice_seller
        # 购方信息
        self.invoice_buyer = invoice_buyer
        # 发票票面备注
        self.invoice_note = invoice_note
        # 租户id
        self.tenant_id = tenant_id
        # 发票ID
        self.invoice_id = invoice_id
        # 发票介质
        self.invoice_material = invoice_material
        # 申请原因
        self.memo = memo
        # 发票行信息
        self.invoice_lines = invoice_lines
        # 发票预览记录号
        self.invoice_preview_log_no = invoice_preview_log_no

    def validate(self):
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.invoice_amt, 'invoice_amt')
        self.validate_required(self.tax_amt, 'tax_amt')
        self.validate_required(self.invoice_seller, 'invoice_seller')
        if self.invoice_seller:
            self.invoice_seller.validate()
        self.validate_required(self.invoice_buyer, 'invoice_buyer')
        if self.invoice_buyer:
            self.invoice_buyer.validate()
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.invoice_material, 'invoice_material')
        self.validate_required(self.invoice_lines, 'invoice_lines')
        if self.invoice_lines:
            for k in self.invoice_lines:
                if k:
                    k.validate()
        self.validate_required(self.invoice_preview_log_no, 'invoice_preview_log_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoice_no is not None:
            result['invoice_no'] = self.invoice_no
        if self.invoice_code is not None:
            result['invoice_code'] = self.invoice_code
        if self.invoice_date is not None:
            result['invoice_date'] = self.invoice_date
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.invoice_amt is not None:
            result['invoice_amt'] = self.invoice_amt
        if self.tax_amt is not None:
            result['tax_amt'] = self.tax_amt
        if self.invoice_seller is not None:
            result['invoice_seller'] = self.invoice_seller.to_map()
        if self.invoice_buyer is not None:
            result['invoice_buyer'] = self.invoice_buyer.to_map()
        if self.invoice_note is not None:
            result['invoice_note'] = self.invoice_note
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.invoice_id is not None:
            result['invoice_id'] = self.invoice_id
        if self.invoice_material is not None:
            result['invoice_material'] = self.invoice_material
        if self.memo is not None:
            result['memo'] = self.memo
        result['invoice_lines'] = []
        if self.invoice_lines is not None:
            for k in self.invoice_lines:
                result['invoice_lines'].append(k.to_map() if k else None)
        if self.invoice_preview_log_no is not None:
            result['invoice_preview_log_no'] = self.invoice_preview_log_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoice_no') is not None:
            self.invoice_no = m.get('invoice_no')
        if m.get('invoice_code') is not None:
            self.invoice_code = m.get('invoice_code')
        if m.get('invoice_date') is not None:
            self.invoice_date = m.get('invoice_date')
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('invoice_amt') is not None:
            self.invoice_amt = m.get('invoice_amt')
        if m.get('tax_amt') is not None:
            self.tax_amt = m.get('tax_amt')
        if m.get('invoice_seller') is not None:
            temp_model = ApplyInvoiceSeller()
            self.invoice_seller = temp_model.from_map(m['invoice_seller'])
        if m.get('invoice_buyer') is not None:
            temp_model = ApplyInvoiceBuyer()
            self.invoice_buyer = temp_model.from_map(m['invoice_buyer'])
        if m.get('invoice_note') is not None:
            self.invoice_note = m.get('invoice_note')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('invoice_id') is not None:
            self.invoice_id = m.get('invoice_id')
        if m.get('invoice_material') is not None:
            self.invoice_material = m.get('invoice_material')
        if m.get('memo') is not None:
            self.memo = m.get('memo')
        self.invoice_lines = []
        if m.get('invoice_lines') is not None:
            for k in m.get('invoice_lines'):
                temp_model = InvoiceLineVO()
                self.invoice_lines.append(temp_model.from_map(k))
        if m.get('invoice_preview_log_no') is not None:
            self.invoice_preview_log_no = m.get('invoice_preview_log_no')
        return self


class InvoiceApplyItem(TeaModel):
    def __init__(
        self,
        item_name: str = None,
        excluding_tax_of_amount: str = None,
        item_code: str = None,
        amount: str = None,
        invoice_rcpt_no: str = None,
    ):
        # 商品名称
        self.item_name = item_name
        # 不含税金额
        self.excluding_tax_of_amount = excluding_tax_of_amount
        # 商品CODE
        self.item_code = item_code
        # 含税金额
        self.amount = amount
        # 关联单据号
        self.invoice_rcpt_no = invoice_rcpt_no

    def validate(self):
        self.validate_required(self.item_name, 'item_name')
        self.validate_required(self.excluding_tax_of_amount, 'excluding_tax_of_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.item_name is not None:
            result['item_name'] = self.item_name
        if self.excluding_tax_of_amount is not None:
            result['excluding_tax_of_amount'] = self.excluding_tax_of_amount
        if self.item_code is not None:
            result['item_code'] = self.item_code
        if self.amount is not None:
            result['amount'] = self.amount
        if self.invoice_rcpt_no is not None:
            result['invoice_rcpt_no'] = self.invoice_rcpt_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('item_name') is not None:
            self.item_name = m.get('item_name')
        if m.get('excluding_tax_of_amount') is not None:
            self.excluding_tax_of_amount = m.get('excluding_tax_of_amount')
        if m.get('item_code') is not None:
            self.item_code = m.get('item_code')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('invoice_rcpt_no') is not None:
            self.invoice_rcpt_no = m.get('invoice_rcpt_no')
        return self


class IntlRcptDetailItem(TeaModel):
    def __init__(
        self,
        receipt_no: str = None,
        tenant_id: str = None,
        ar_no: str = None,
        charge_type: str = None,
        rcpt_contract_amt: str = None,
        rept_inved_amt: str = None,
        rcpt_contract_remain_amt: str = None,
        commodity_code: str = None,
        commodity_name: str = None,
        ou: str = None,
        ccy: str = None,
        rate: str = None,
        rcpt_contract_amt_excl_tax: str = None,
        rept_inved_amt_excl_tax: str = None,
        rcpt_contract_remain_amt_excl_tax: str = None,
    ):
        # 可开票单据号
        self.receipt_no = receipt_no
        # 租户ID
        self.tenant_id = tenant_id
        # 合同号或订单号
        self.ar_no = ar_no
        # 计费类型
        self.charge_type = charge_type
        # 合同商品总金额
        self.rcpt_contract_amt = rcpt_contract_amt
        # 合同商品已开票金额
        self.rept_inved_amt = rept_inved_amt
        # 合同商品剩余可开票金额
        self.rcpt_contract_remain_amt = rcpt_contract_remain_amt
        # 商品CODE
        self.commodity_code = commodity_code
        # 商品名称
        self.commodity_name = commodity_name
        # ou
        self.ou = ou
        # 币种
        self.ccy = ccy
        # 税率
        self.rate = rate
        # 合同金额（不含税）
        self.rcpt_contract_amt_excl_tax = rcpt_contract_amt_excl_tax
        # 已开票金额（不含税）
        self.rept_inved_amt_excl_tax = rept_inved_amt_excl_tax
        # 剩余可开票金额（不含税）
        self.rcpt_contract_remain_amt_excl_tax = rcpt_contract_remain_amt_excl_tax

    def validate(self):
        self.validate_required(self.receipt_no, 'receipt_no')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.ar_no, 'ar_no')
        self.validate_required(self.charge_type, 'charge_type')
        self.validate_required(self.rcpt_contract_amt, 'rcpt_contract_amt')
        self.validate_required(self.rept_inved_amt, 'rept_inved_amt')
        self.validate_required(self.rcpt_contract_remain_amt, 'rcpt_contract_remain_amt')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.commodity_name, 'commodity_name')
        self.validate_required(self.ou, 'ou')
        self.validate_required(self.ccy, 'ccy')
        self.validate_required(self.rate, 'rate')
        self.validate_required(self.rcpt_contract_amt_excl_tax, 'rcpt_contract_amt_excl_tax')
        self.validate_required(self.rept_inved_amt_excl_tax, 'rept_inved_amt_excl_tax')
        self.validate_required(self.rcpt_contract_remain_amt_excl_tax, 'rcpt_contract_remain_amt_excl_tax')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.receipt_no is not None:
            result['receipt_no'] = self.receipt_no
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ar_no is not None:
            result['ar_no'] = self.ar_no
        if self.charge_type is not None:
            result['charge_type'] = self.charge_type
        if self.rcpt_contract_amt is not None:
            result['rcpt_contract_amt'] = self.rcpt_contract_amt
        if self.rept_inved_amt is not None:
            result['rept_inved_amt'] = self.rept_inved_amt
        if self.rcpt_contract_remain_amt is not None:
            result['rcpt_contract_remain_amt'] = self.rcpt_contract_remain_amt
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        if self.ou is not None:
            result['ou'] = self.ou
        if self.ccy is not None:
            result['ccy'] = self.ccy
        if self.rate is not None:
            result['rate'] = self.rate
        if self.rcpt_contract_amt_excl_tax is not None:
            result['rcpt_contract_amt_excl_tax'] = self.rcpt_contract_amt_excl_tax
        if self.rept_inved_amt_excl_tax is not None:
            result['rept_inved_amt_excl_tax'] = self.rept_inved_amt_excl_tax
        if self.rcpt_contract_remain_amt_excl_tax is not None:
            result['rcpt_contract_remain_amt_excl_tax'] = self.rcpt_contract_remain_amt_excl_tax
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('receipt_no') is not None:
            self.receipt_no = m.get('receipt_no')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ar_no') is not None:
            self.ar_no = m.get('ar_no')
        if m.get('charge_type') is not None:
            self.charge_type = m.get('charge_type')
        if m.get('rcpt_contract_amt') is not None:
            self.rcpt_contract_amt = m.get('rcpt_contract_amt')
        if m.get('rept_inved_amt') is not None:
            self.rept_inved_amt = m.get('rept_inved_amt')
        if m.get('rcpt_contract_remain_amt') is not None:
            self.rcpt_contract_remain_amt = m.get('rcpt_contract_remain_amt')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('ccy') is not None:
            self.ccy = m.get('ccy')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        if m.get('rcpt_contract_amt_excl_tax') is not None:
            self.rcpt_contract_amt_excl_tax = m.get('rcpt_contract_amt_excl_tax')
        if m.get('rept_inved_amt_excl_tax') is not None:
            self.rept_inved_amt_excl_tax = m.get('rept_inved_amt_excl_tax')
        if m.get('rcpt_contract_remain_amt_excl_tax') is not None:
            self.rcpt_contract_remain_amt_excl_tax = m.get('rcpt_contract_remain_amt_excl_tax')
        return self


class MultiCurrencyMoneyOpenApi(TeaModel):
    def __init__(
        self,
        cent: str = None,
        currency_value: str = None,
    ):
        # 最小币种单位
        self.cent = cent
        # 币种
        self.currency_value = currency_value

    def validate(self):
        self.validate_required(self.cent, 'cent')
        self.validate_required(self.currency_value, 'currency_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cent is not None:
            result['cent'] = self.cent
        if self.currency_value is not None:
            result['currency_value'] = self.currency_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cent') is not None:
            self.cent = m.get('cent')
        if m.get('currency_value') is not None:
            self.currency_value = m.get('currency_value')
        return self


class RcptDetailVO(TeaModel):
    def __init__(
        self,
        ar_no: str = None,
        ou: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        receipt_no: str = None,
        ccy: str = None,
        tax: str = None,
        commodity_code: str = None,
        mode: str = None,
        total_amt: str = None,
        inved_amt: str = None,
        remain_amt: str = None,
        commodity_name: str = None,
    ):
        # 合同号
        self.ar_no = ar_no
        # OU
        self.ou = ou
        # 租户ID
        self.tenant_id = tenant_id
        # 客户名称
        self.tenant_name = tenant_name
        # 单据唯一号
        self.receipt_no = receipt_no
        # 币种
        self.ccy = ccy
        # 税率
        self.tax = tax
        # 商品CODE
        self.commodity_code = commodity_code
        # 开票模式，01：先款后票、02：先票后款
        self.mode = mode
        # 单据可开票总金额
        self.total_amt = total_amt
        # 已开票金额
        self.inved_amt = inved_amt
        # 剩余可开票金额
        self.remain_amt = remain_amt
        # 商品名称
        self.commodity_name = commodity_name

    def validate(self):
        self.validate_required(self.ar_no, 'ar_no')
        self.validate_required(self.ou, 'ou')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.receipt_no, 'receipt_no')
        self.validate_required(self.ccy, 'ccy')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.mode, 'mode')
        self.validate_required(self.total_amt, 'total_amt')
        self.validate_required(self.inved_amt, 'inved_amt')
        self.validate_required(self.remain_amt, 'remain_amt')
        self.validate_required(self.commodity_name, 'commodity_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.ar_no is not None:
            result['ar_no'] = self.ar_no
        if self.ou is not None:
            result['ou'] = self.ou
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.receipt_no is not None:
            result['receipt_no'] = self.receipt_no
        if self.ccy is not None:
            result['ccy'] = self.ccy
        if self.tax is not None:
            result['tax'] = self.tax
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.mode is not None:
            result['mode'] = self.mode
        if self.total_amt is not None:
            result['total_amt'] = self.total_amt
        if self.inved_amt is not None:
            result['inved_amt'] = self.inved_amt
        if self.remain_amt is not None:
            result['remain_amt'] = self.remain_amt
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('ar_no') is not None:
            self.ar_no = m.get('ar_no')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('receipt_no') is not None:
            self.receipt_no = m.get('receipt_no')
        if m.get('ccy') is not None:
            self.ccy = m.get('ccy')
        if m.get('tax') is not None:
            self.tax = m.get('tax')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('mode') is not None:
            self.mode = m.get('mode')
        if m.get('total_amt') is not None:
            self.total_amt = m.get('total_amt')
        if m.get('inved_amt') is not None:
            self.inved_amt = m.get('inved_amt')
        if m.get('remain_amt') is not None:
            self.remain_amt = m.get('remain_amt')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        return self


class ApplyInvoiceRequest(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        ou: str = None,
        ar_no: str = None,
        biz_scene: str = None,
        biz_action: str = None,
        source: str = None,
        operator_no: str = None,
        operator_name: str = None,
        invoice_apply_biz_no: str = None,
        invoice_material: str = None,
        apply_reason: str = None,
        apply_invoice_delivery: ApplyInvoiceDelivery = None,
        apply_invoice_quota: ApplyInvoiceAmountAllocation = None,
        apply_invoices: List[ApplyInvoiceLine] = None,
        preview_log_no: str = None,
    ):
        # 租户ID
        self.tenant_id = tenant_id
        # OU
        self.ou = ou
        # 合同号
        self.ar_no = ar_no
        # 开票业务场景
        self.biz_scene = biz_scene
        # 业务操作
        self.biz_action = biz_action
        # 系统来源
        self.source = source
        # 操作人员工号
        self.operator_no = operator_no
        # 操作人员名称
        self.operator_name = operator_name
        # 外部业务号
        self.invoice_apply_biz_no = invoice_apply_biz_no
        # 发票介质
        self.invoice_material = invoice_material
        # 申请原因
        self.apply_reason = apply_reason
        # 寄送信息
        self.apply_invoice_delivery = apply_invoice_delivery
        # 发票需要占用的额度信息
        self.apply_invoice_quota = apply_invoice_quota
        # 发票信息列表，一次申请可能会拆分出多张票
        self.apply_invoices = apply_invoices
        # 预览记录号
        self.preview_log_no = preview_log_no

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.ou, 'ou')
        self.validate_required(self.ar_no, 'ar_no')
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.biz_action, 'biz_action')
        self.validate_required(self.source, 'source')
        self.validate_required(self.operator_no, 'operator_no')
        self.validate_required(self.operator_name, 'operator_name')
        self.validate_required(self.invoice_apply_biz_no, 'invoice_apply_biz_no')
        self.validate_required(self.invoice_material, 'invoice_material')
        self.validate_required(self.apply_invoice_delivery, 'apply_invoice_delivery')
        if self.apply_invoice_delivery:
            self.apply_invoice_delivery.validate()
        self.validate_required(self.apply_invoice_quota, 'apply_invoice_quota')
        if self.apply_invoice_quota:
            self.apply_invoice_quota.validate()
        self.validate_required(self.apply_invoices, 'apply_invoices')
        if self.apply_invoices:
            for k in self.apply_invoices:
                if k:
                    k.validate()
        self.validate_required(self.preview_log_no, 'preview_log_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ou is not None:
            result['ou'] = self.ou
        if self.ar_no is not None:
            result['ar_no'] = self.ar_no
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.biz_action is not None:
            result['biz_action'] = self.biz_action
        if self.source is not None:
            result['source'] = self.source
        if self.operator_no is not None:
            result['operator_no'] = self.operator_no
        if self.operator_name is not None:
            result['operator_name'] = self.operator_name
        if self.invoice_apply_biz_no is not None:
            result['invoice_apply_biz_no'] = self.invoice_apply_biz_no
        if self.invoice_material is not None:
            result['invoice_material'] = self.invoice_material
        if self.apply_reason is not None:
            result['apply_reason'] = self.apply_reason
        if self.apply_invoice_delivery is not None:
            result['apply_invoice_delivery'] = self.apply_invoice_delivery.to_map()
        if self.apply_invoice_quota is not None:
            result['apply_invoice_quota'] = self.apply_invoice_quota.to_map()
        result['apply_invoices'] = []
        if self.apply_invoices is not None:
            for k in self.apply_invoices:
                result['apply_invoices'].append(k.to_map() if k else None)
        if self.preview_log_no is not None:
            result['preview_log_no'] = self.preview_log_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('ar_no') is not None:
            self.ar_no = m.get('ar_no')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('biz_action') is not None:
            self.biz_action = m.get('biz_action')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('operator_no') is not None:
            self.operator_no = m.get('operator_no')
        if m.get('operator_name') is not None:
            self.operator_name = m.get('operator_name')
        if m.get('invoice_apply_biz_no') is not None:
            self.invoice_apply_biz_no = m.get('invoice_apply_biz_no')
        if m.get('invoice_material') is not None:
            self.invoice_material = m.get('invoice_material')
        if m.get('apply_reason') is not None:
            self.apply_reason = m.get('apply_reason')
        if m.get('apply_invoice_delivery') is not None:
            temp_model = ApplyInvoiceDelivery()
            self.apply_invoice_delivery = temp_model.from_map(m['apply_invoice_delivery'])
        if m.get('apply_invoice_quota') is not None:
            temp_model = ApplyInvoiceAmountAllocation()
            self.apply_invoice_quota = temp_model.from_map(m['apply_invoice_quota'])
        self.apply_invoices = []
        if m.get('apply_invoices') is not None:
            for k in m.get('apply_invoices'):
                temp_model = ApplyInvoiceLine()
                self.apply_invoices.append(temp_model.from_map(k))
        if m.get('preview_log_no') is not None:
            self.preview_log_no = m.get('preview_log_no')
        return self


class UserInvoiceInfo(TeaModel):
    def __init__(
        self,
        title: str = None,
        tax_payer_qualification: str = None,
        register_country: str = None,
        address: str = None,
        tax_no: str = None,
        telephone: str = None,
        bank_name: str = None,
        bank_account: str = None,
    ):
        # 公司标题（发票抬头）
        self.title = title
        # 纳税人类型
        self.tax_payer_qualification = tax_payer_qualification
        # 注册国家编号
        self.register_country = register_country
        # 公司注册地址
        self.address = address
        # 纳税人识别号
        self.tax_no = tax_no
        # 公司注册电话
        self.telephone = telephone
        # 开户行
        self.bank_name = bank_name
        # 银行账号
        self.bank_account = bank_account

    def validate(self):
        self.validate_required(self.title, 'title')
        self.validate_required(self.tax_payer_qualification, 'tax_payer_qualification')
        self.validate_required(self.register_country, 'register_country')
        self.validate_required(self.address, 'address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.title is not None:
            result['title'] = self.title
        if self.tax_payer_qualification is not None:
            result['tax_payer_qualification'] = self.tax_payer_qualification
        if self.register_country is not None:
            result['register_country'] = self.register_country
        if self.address is not None:
            result['address'] = self.address
        if self.tax_no is not None:
            result['tax_no'] = self.tax_no
        if self.telephone is not None:
            result['telephone'] = self.telephone
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.bank_account is not None:
            result['bank_account'] = self.bank_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('tax_payer_qualification') is not None:
            self.tax_payer_qualification = m.get('tax_payer_qualification')
        if m.get('register_country') is not None:
            self.register_country = m.get('register_country')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('tax_no') is not None:
            self.tax_no = m.get('tax_no')
        if m.get('telephone') is not None:
            self.telephone = m.get('telephone')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('bank_account') is not None:
            self.bank_account = m.get('bank_account')
        return self


class InvoiceApplyInfoVO(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        invoice_apply_id: str = None,
        invoice_amt: str = None,
        invoice_apply_date: str = None,
        invoice_type: str = None,
        apply_type: str = None,
        operator_name: str = None,
        operator_id: str = None,
        status: str = None,
        relate_invoices: List[InvoiceInfoVO] = None,
        bsn_no: str = None,
    ):
        # 租户ID
        self.tenant_id = tenant_id
        # 发票申请ID
        self.invoice_apply_id = invoice_apply_id
        # 申请金额
        self.invoice_amt = invoice_amt
        # 发票申请日期
        self.invoice_apply_date = invoice_apply_date
        # 发票类型
        self.invoice_type = invoice_type
        # 申请类型
        self.apply_type = apply_type
        # 申请人名称
        self.operator_name = operator_name
        # 申请人ID
        self.operator_id = operator_id
        # 申请状态，01：处理中，03：已完成，04：审批中，05：已驳回，06：已撤回，10：申请终止
        self.status = status
        # 关联的发票列表
        self.relate_invoices = relate_invoices
        # 业务号
        self.bsn_no = bsn_no

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.invoice_amt, 'invoice_amt')
        self.validate_required(self.invoice_apply_date, 'invoice_apply_date')
        if self.invoice_apply_date is not None:
            self.validate_pattern(self.invoice_apply_date, 'invoice_apply_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.status, 'status')
        if self.relate_invoices:
            for k in self.relate_invoices:
                if k:
                    k.validate()
        self.validate_required(self.bsn_no, 'bsn_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.invoice_apply_id is not None:
            result['invoice_apply_id'] = self.invoice_apply_id
        if self.invoice_amt is not None:
            result['invoice_amt'] = self.invoice_amt
        if self.invoice_apply_date is not None:
            result['invoice_apply_date'] = self.invoice_apply_date
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.apply_type is not None:
            result['apply_type'] = self.apply_type
        if self.operator_name is not None:
            result['operator_name'] = self.operator_name
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.status is not None:
            result['status'] = self.status
        result['relate_invoices'] = []
        if self.relate_invoices is not None:
            for k in self.relate_invoices:
                result['relate_invoices'].append(k.to_map() if k else None)
        if self.bsn_no is not None:
            result['bsn_no'] = self.bsn_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('invoice_apply_id') is not None:
            self.invoice_apply_id = m.get('invoice_apply_id')
        if m.get('invoice_amt') is not None:
            self.invoice_amt = m.get('invoice_amt')
        if m.get('invoice_apply_date') is not None:
            self.invoice_apply_date = m.get('invoice_apply_date')
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('apply_type') is not None:
            self.apply_type = m.get('apply_type')
        if m.get('operator_name') is not None:
            self.operator_name = m.get('operator_name')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.relate_invoices = []
        if m.get('relate_invoices') is not None:
            for k in m.get('relate_invoices'):
                temp_model = InvoiceInfoVO()
                self.relate_invoices.append(temp_model.from_map(k))
        if m.get('bsn_no') is not None:
            self.bsn_no = m.get('bsn_no')
        return self


class ApplyInvoice(TeaModel):
    def __init__(
        self,
        invoice_type: str = None,
        invoice_amt: str = None,
        apply_invoice_lines: List[ApplyInvoiceLine] = None,
        apply_invoice_seller: ApplyInvoiceSeller = None,
        apply_invoice_buyer: ApplyInvoiceBuyer = None,
        invoice_note: str = None,
        ccy: str = None,
        apply_invoice_id: str = None,
    ):
        # 发票类型，01,增值税专用发票; * 02,增值税普通发票; * 04,国际形式发票; * 05,其它发票
        self.invoice_type = invoice_type
        # 发票金额
        self.invoice_amt = invoice_amt
        # 发票行信息
        self.apply_invoice_lines = apply_invoice_lines
        # 销方信息
        self.apply_invoice_seller = apply_invoice_seller
        # 购方信息
        self.apply_invoice_buyer = apply_invoice_buyer
        # 发票备注
        self.invoice_note = invoice_note
        # 币种
        self.ccy = ccy
        # 发票ID
        self.apply_invoice_id = apply_invoice_id

    def validate(self):
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.invoice_amt, 'invoice_amt')
        self.validate_required(self.apply_invoice_lines, 'apply_invoice_lines')
        if self.apply_invoice_lines:
            for k in self.apply_invoice_lines:
                if k:
                    k.validate()
        self.validate_required(self.apply_invoice_seller, 'apply_invoice_seller')
        if self.apply_invoice_seller:
            self.apply_invoice_seller.validate()
        self.validate_required(self.apply_invoice_buyer, 'apply_invoice_buyer')
        if self.apply_invoice_buyer:
            self.apply_invoice_buyer.validate()
        self.validate_required(self.apply_invoice_id, 'apply_invoice_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.invoice_amt is not None:
            result['invoice_amt'] = self.invoice_amt
        result['apply_invoice_lines'] = []
        if self.apply_invoice_lines is not None:
            for k in self.apply_invoice_lines:
                result['apply_invoice_lines'].append(k.to_map() if k else None)
        if self.apply_invoice_seller is not None:
            result['apply_invoice_seller'] = self.apply_invoice_seller.to_map()
        if self.apply_invoice_buyer is not None:
            result['apply_invoice_buyer'] = self.apply_invoice_buyer.to_map()
        if self.invoice_note is not None:
            result['invoice_note'] = self.invoice_note
        if self.ccy is not None:
            result['ccy'] = self.ccy
        if self.apply_invoice_id is not None:
            result['apply_invoice_id'] = self.apply_invoice_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('invoice_amt') is not None:
            self.invoice_amt = m.get('invoice_amt')
        self.apply_invoice_lines = []
        if m.get('apply_invoice_lines') is not None:
            for k in m.get('apply_invoice_lines'):
                temp_model = ApplyInvoiceLine()
                self.apply_invoice_lines.append(temp_model.from_map(k))
        if m.get('apply_invoice_seller') is not None:
            temp_model = ApplyInvoiceSeller()
            self.apply_invoice_seller = temp_model.from_map(m['apply_invoice_seller'])
        if m.get('apply_invoice_buyer') is not None:
            temp_model = ApplyInvoiceBuyer()
            self.apply_invoice_buyer = temp_model.from_map(m['apply_invoice_buyer'])
        if m.get('invoice_note') is not None:
            self.invoice_note = m.get('invoice_note')
        if m.get('ccy') is not None:
            self.ccy = m.get('ccy')
        if m.get('apply_invoice_id') is not None:
            self.apply_invoice_id = m.get('apply_invoice_id')
        return self


class UserInvoiceConfigVO(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        company_name: str = None,
        company_phone_no: str = None,
        company_address: str = None,
        bank_name: str = None,
        bank_account: str = None,
        tax_no: str = None,
        general_taxpayer: bool = None,
    ):
        # 租户ID
        self.tenant_id = tenant_id
        # 企业名称
        self.company_name = company_name
        # 企业电话
        self.company_phone_no = company_phone_no
        # 公司地址(详细地址)
        self.company_address = company_address
        # 银行名称
        self.bank_name = bank_name
        # 银行账号
        self.bank_account = bank_account
        # 税号
        self.tax_no = tax_no
        # 是否是一般纳税人
        self.general_taxpayer = general_taxpayer

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.general_taxpayer, 'general_taxpayer')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.company_phone_no is not None:
            result['company_phone_no'] = self.company_phone_no
        if self.company_address is not None:
            result['company_address'] = self.company_address
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.bank_account is not None:
            result['bank_account'] = self.bank_account
        if self.tax_no is not None:
            result['tax_no'] = self.tax_no
        if self.general_taxpayer is not None:
            result['general_taxpayer'] = self.general_taxpayer
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('company_phone_no') is not None:
            self.company_phone_no = m.get('company_phone_no')
        if m.get('company_address') is not None:
            self.company_address = m.get('company_address')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('bank_account') is not None:
            self.bank_account = m.get('bank_account')
        if m.get('tax_no') is not None:
            self.tax_no = m.get('tax_no')
        if m.get('general_taxpayer') is not None:
            self.general_taxpayer = m.get('general_taxpayer')
        return self


class InvoiceMailInfo(TeaModel):
    def __init__(
        self,
        pid: str = None,
        name: str = None,
        country: str = None,
        email: str = None,
        telephone: str = None,
        province: str = None,
        city: str = None,
        county_district: str = None,
        street: str = None,
        detail_address: str = None,
        bd_email: str = None,
    ):
        # PID，指定发票邮寄地址归属的PID
        self.pid = pid
        # 联系人名字
        self.name = name
        # 国家
        self.country = country
        # 收件人邮箱
        self.email = email
        # 联系人电话
        self.telephone = telephone
        # 省份
        self.province = province
        # 城市
        self.city = city
        # 区/县
        self.county_district = county_district
        # 街道
        self.street = street
        # 详细地址
        self.detail_address = detail_address
        # BD邮箱
        self.bd_email = bd_email

    def validate(self):
        self.validate_required(self.pid, 'pid')
        self.validate_required(self.name, 'name')
        self.validate_required(self.country, 'country')
        self.validate_required(self.email, 'email')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pid is not None:
            result['pid'] = self.pid
        if self.name is not None:
            result['name'] = self.name
        if self.country is not None:
            result['country'] = self.country
        if self.email is not None:
            result['email'] = self.email
        if self.telephone is not None:
            result['telephone'] = self.telephone
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
        if self.county_district is not None:
            result['county_district'] = self.county_district
        if self.street is not None:
            result['street'] = self.street
        if self.detail_address is not None:
            result['detail_address'] = self.detail_address
        if self.bd_email is not None:
            result['bd_email'] = self.bd_email
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pid') is not None:
            self.pid = m.get('pid')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('country') is not None:
            self.country = m.get('country')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('telephone') is not None:
            self.telephone = m.get('telephone')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('county_district') is not None:
            self.county_district = m.get('county_district')
        if m.get('street') is not None:
            self.street = m.get('street')
        if m.get('detail_address') is not None:
            self.detail_address = m.get('detail_address')
        if m.get('bd_email') is not None:
            self.bd_email = m.get('bd_email')
        return self


class StructL(TeaModel):
    def __init__(
        self,
        paramb: str = None,
    ):
        # paramb
        self.paramb = paramb

    def validate(self):
        self.validate_required(self.paramb, 'paramb')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.paramb is not None:
            result['paramb'] = self.paramb
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('paramb') is not None:
            self.paramb = m.get('paramb')
        return self


class DemoClasses(TeaModel):
    def __init__(
        self,
        some_string: str = None,
        some_date: str = None,
        some_boolean: bool = None,
        some_int: int = None,
        some_list: List[str] = None,
    ):
        # 字符串测试
        self.some_string = some_string
        # 日期测试
        self.some_date = some_date
        # Boolean测试
        self.some_boolean = some_boolean
        # 整数测试
        self.some_int = some_int
        # 列表测试
        self.some_list = some_list

    def validate(self):
        self.validate_required(self.some_string, 'some_string')
        self.validate_required(self.some_date, 'some_date')
        if self.some_date is not None:
            self.validate_pattern(self.some_date, 'some_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.some_boolean, 'some_boolean')
        self.validate_required(self.some_int, 'some_int')
        if self.some_int is not None:
            self.validate_maximum(self.some_int, 'some_int', 2000)
            self.validate_minimum(self.some_int, 'some_int', 1)
        self.validate_required(self.some_list, 'some_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.some_string is not None:
            result['some_string'] = self.some_string
        if self.some_date is not None:
            result['some_date'] = self.some_date
        if self.some_boolean is not None:
            result['some_boolean'] = self.some_boolean
        if self.some_int is not None:
            result['some_int'] = self.some_int
        if self.some_list is not None:
            result['some_list'] = self.some_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('some_string') is not None:
            self.some_string = m.get('some_string')
        if m.get('some_date') is not None:
            self.some_date = m.get('some_date')
        if m.get('some_boolean') is not None:
            self.some_boolean = m.get('some_boolean')
        if m.get('some_int') is not None:
            self.some_int = m.get('some_int')
        if m.get('some_list') is not None:
            self.some_list = m.get('some_list')
        return self


class TesRes(TeaModel):
    def __init__(
        self,
        idcard: str = None,
    ):
        # 证件号
        self.idcard = idcard

    def validate(self):
        self.validate_required(self.idcard, 'idcard')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.idcard is not None:
            result['idcard'] = self.idcard
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('idcard') is not None:
            self.idcard = m.get('idcard')
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


class QueryDemoTestJltestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data: str = None,
        datax: str = None,
        datay: str = None,
        dataa: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据
        self.data = data
        # 数据bbb
        self.datax = datax
        # 数据bbb
        self.datay = datay
        # 数据ddd
        self.dataa = dataa

    def validate(self):
        self.validate_required(self.data, 'data')
        self.validate_required(self.datax, 'datax')
        self.validate_required(self.datay, 'datay')
        self.validate_required(self.dataa, 'dataa')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data is not None:
            result['data'] = self.data
        if self.datax is not None:
            result['datax'] = self.datax
        if self.datay is not None:
            result['datay'] = self.datay
        if self.dataa is not None:
            result['dataa'] = self.dataa
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('datax') is not None:
            self.datax = m.get('datax')
        if m.get('datay') is not None:
            self.datay = m.get('datay')
        if m.get('dataa') is not None:
            self.dataa = m.get('dataa')
        return self


class QueryDemoTestJltestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        namex: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 名字
        self.namex = namex

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
        if self.namex is not None:
            result['namex'] = self.namex
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('namex') is not None:
            self.namex = m.get('namex')
        return self


class CreateDemoBusinessOrderxRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        page_size: int = None,
        order_info: OrderInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # 分页大小
        self.page_size = page_size
        # 订单结构体
        self.order_info = order_info

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.order_info, 'order_info')
        if self.order_info:
            self.order_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.order_info is not None:
            result['order_info'] = self.order_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('order_info') is not None:
            temp_model = OrderInfo()
            self.order_info = temp_model.from_map(m['order_info'])
        return self


class CreateDemoBusinessOrderxResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_list: List[OrderDTO] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单列表
        self.order_list = order_list
        # 总数
        self.total_count = total_count

    def validate(self):
        if self.order_list:
            for k in self.order_list:
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
        result['order_list'] = []
        if self.order_list is not None:
            for k in self.order_list:
                result['order_list'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.order_list = []
        if m.get('order_list') is not None:
            for k in m.get('order_list'):
                temp_model = OrderDTO()
                self.order_list.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class CreateDemoBusinessOrderzRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        page_size: int = None,
        order_info: OrderInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # 分页大小
        self.page_size = page_size
        # 订单结构体
        self.order_info = order_info

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.order_info, 'order_info')
        if self.order_info:
            self.order_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.order_info is not None:
            result['order_info'] = self.order_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('order_info') is not None:
            temp_model = OrderInfo()
            self.order_info = temp_model.from_map(m['order_info'])
        return self


class CreateDemoBusinessOrderzResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_list: List[OrderDTO] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单列表
        self.order_list = order_list
        # 总数
        self.total_count = total_count

    def validate(self):
        if self.order_list:
            for k in self.order_list:
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
        result['order_list'] = []
        if self.order_list is not None:
            for k in self.order_list:
                result['order_list'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.order_list = []
        if m.get('order_list') is not None:
            for k in m.get('order_list'):
                temp_model = OrderDTO()
                self.order_list.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class CreateDemoBusinessOrderyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        page_size: int = None,
        order_info: OrderInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # 分页大小
        self.page_size = page_size
        # 订单结构体
        self.order_info = order_info

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.order_info, 'order_info')
        if self.order_info:
            self.order_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.order_info is not None:
            result['order_info'] = self.order_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('order_info') is not None:
            temp_model = OrderInfo()
            self.order_info = temp_model.from_map(m['order_info'])
        return self


class CreateDemoBusinessOrderyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_list: List[OrderDTO] = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单列表
        self.order_list = order_list
        # 总数
        self.total_count = total_count

    def validate(self):
        if self.order_list:
            for k in self.order_list:
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
        result['order_list'] = []
        if self.order_list is not None:
            for k in self.order_list:
                result['order_list'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.order_list = []
        if m.get('order_list') is not None:
            for k in m.get('order_list'):
                temp_model = OrderDTO()
                self.order_list.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class CreateDemoBusinessOrdernRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class CreateDemoBusinessOrdernResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总数
        self.total_count = total_count

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
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class CreateDemoBusinessOrderaaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CreateDemoBusinessOrderaaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[OrderItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品明细
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = OrderItem()
                self.item_list.append(temp_model.from_map(k))
        return self


class CreateDemoBusinessOrderqRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CreateDemoBusinessOrderqResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[OrderItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品明细
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = OrderItem()
                self.item_list.append(temp_model.from_map(k))
        return self


class CreateDemoBusinessOrderbRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CreateDemoBusinessOrderbResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[OrderItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品明细
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = OrderItem()
                self.item_list.append(temp_model.from_map(k))
        return self


class TestDemoTestApiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # bbb
        self.id = id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class TestDemoTestApiResponse(TeaModel):
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


class CreateDemoBusinessOrdercRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CreateDemoBusinessOrdercResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[OrderItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品明细
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = OrderItem()
                self.item_list.append(temp_model.from_map(k))
        return self


class CreateDemoBusinessOrderdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CreateDemoBusinessOrderdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[OrderItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品明细
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = OrderItem()
                self.item_list.append(temp_model.from_map(k))
        return self


class QueryDemoTestTestjlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class QueryDemoTestTestjlResponse(TeaModel):
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


class CreateDemoBusinessOrderppRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CreateDemoBusinessOrderppResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[OrderItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品明细
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = OrderItem()
                self.item_list.append(temp_model.from_map(k))
        return self


class CreateDemoBusinessOrderxxxRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CreateDemoBusinessOrderxxxResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[OrderItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品明细
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = OrderItem()
                self.item_list.append(temp_model.from_map(k))
        return self


class CreateDemoBusinessOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CreateDemoBusinessOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单ID
        self.order_id = order_id

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class CreateDemoBusinessOrderzzzRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class CreateDemoBusinessOrderzzzResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单ID
        self.order_id = order_id

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class ApixaDemoCliCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class ApixaDemoCliCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果描述
        self.msg = msg
        # 结果码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ApixbDemoCliCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class ApixbDemoCliCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果描述
        self.msg = msg
        # 结果码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ApizDemoCliCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class ApizDemoCliCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        item_list: List[OrderItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品明细
        self.item_list = item_list

    def validate(self):
        if self.item_list:
            for k in self.item_list:
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
        result['item_list'] = []
        if self.item_list is not None:
            for k in self.item_list:
                result['item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.item_list = []
        if m.get('item_list') is not None:
            for k in m.get('item_list'):
                temp_model = OrderItem()
                self.item_list.append(temp_model.from_map(k))
        return self


class CreateAntcloudAcmAntchainTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        name: str = None,
        user_type: str = None,
        cert_no: str = None,
        cert_type: str = None,
        real_name: str = None,
        artificial_person_cert_no: str = None,
        artificial_person_cert_type: str = None,
        login_name: str = None,
        tenant_id: str = None,
        bussiness_code: str = None,
        bussiness_role: str = None,
        is_alipay_tenant: bool = None,
        antchain_certified: bool = None,
        source_user_id: str = None,
        register_area: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 企业名称或个人名称
        self.name = name
        # 客户类型
        # PERSON("个人","1"),
        # ENTERPRISE("企业","2")
        self.user_type = user_type
        # 证件号
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 法人姓名
        self.real_name = real_name
        # 法人证件号
        self.artificial_person_cert_no = artificial_person_cert_no
        # 法人证件类型
        self.artificial_person_cert_type = artificial_person_cert_type
        # 支付宝登录号
        self.login_name = login_name
        # 支付宝uid(租户id)
        self.tenant_id = tenant_id
        # 业务场景码
        self.bussiness_code = bussiness_code
        # 在平台上的角色，比如服务提供方，服务消费方，合作机构，资金提供方
        self.bussiness_role = bussiness_role
        # 是否支付宝账户入驻
        self.is_alipay_tenant = is_alipay_tenant
        # 是否认证过，不填默认未认证
        self.antchain_certified = antchain_certified
        # 外部系统的会员ID，用于幂等
        self.source_user_id = source_user_id
        # 注册区域
        self.register_area = register_area

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.bussiness_code, 'bussiness_code')
        self.validate_required(self.is_alipay_tenant, 'is_alipay_tenant')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.name is not None:
            result['name'] = self.name
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.artificial_person_cert_no is not None:
            result['artificial_person_cert_no'] = self.artificial_person_cert_no
        if self.artificial_person_cert_type is not None:
            result['artificial_person_cert_type'] = self.artificial_person_cert_type
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.bussiness_code is not None:
            result['bussiness_code'] = self.bussiness_code
        if self.bussiness_role is not None:
            result['bussiness_role'] = self.bussiness_role
        if self.is_alipay_tenant is not None:
            result['is_alipay_tenant'] = self.is_alipay_tenant
        if self.antchain_certified is not None:
            result['antchain_certified'] = self.antchain_certified
        if self.source_user_id is not None:
            result['source_user_id'] = self.source_user_id
        if self.register_area is not None:
            result['register_area'] = self.register_area
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('artificial_person_cert_no') is not None:
            self.artificial_person_cert_no = m.get('artificial_person_cert_no')
        if m.get('artificial_person_cert_type') is not None:
            self.artificial_person_cert_type = m.get('artificial_person_cert_type')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('bussiness_code') is not None:
            self.bussiness_code = m.get('bussiness_code')
        if m.get('bussiness_role') is not None:
            self.bussiness_role = m.get('bussiness_role')
        if m.get('is_alipay_tenant') is not None:
            self.is_alipay_tenant = m.get('is_alipay_tenant')
        if m.get('antchain_certified') is not None:
            self.antchain_certified = m.get('antchain_certified')
        if m.get('source_user_id') is not None:
            self.source_user_id = m.get('source_user_id')
        if m.get('register_area') is not None:
            self.register_area = m.get('register_area')
        return self


class CreateAntcloudAcmAntchainTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: str = None,
        customer_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户id
        self.tenant_id = tenant_id
        # 客户id
        self.customer_id = customer_id

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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        return self


class UpdateAntcloudAcmCustomerIdentityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        customer_id: str = None,
        name: str = None,
        tenant_id: str = None,
        cert_no: str = None,
        cert_type: str = None,
        real_name: str = None,
        artificial_person_cert_no: str = None,
        artificial_person_cert_type: str = None,
        business_code: str = None,
        bussiness_role: str = None,
        country_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 客户id
        self.customer_id = customer_id
        # 企业名称或个人名称
        self.name = name
        # 租户id
        self.tenant_id = tenant_id
        # 证件号
        self.cert_no = cert_no
        # 证件类型
        self.cert_type = cert_type
        # 法人姓名
        self.real_name = real_name
        # 法人证件号码
        self.artificial_person_cert_no = artificial_person_cert_no
        # 法人证件类型
        self.artificial_person_cert_type = artificial_person_cert_type
        # 业务场景码
        self.business_code = business_code
        # 业务角色
        self.bussiness_role = bussiness_role
        # 国家代码
        self.country_code = country_code

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.business_code, 'business_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.name is not None:
            result['name'] = self.name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.real_name is not None:
            result['real_name'] = self.real_name
        if self.artificial_person_cert_no is not None:
            result['artificial_person_cert_no'] = self.artificial_person_cert_no
        if self.artificial_person_cert_type is not None:
            result['artificial_person_cert_type'] = self.artificial_person_cert_type
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.bussiness_role is not None:
            result['bussiness_role'] = self.bussiness_role
        if self.country_code is not None:
            result['country_code'] = self.country_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('real_name') is not None:
            self.real_name = m.get('real_name')
        if m.get('artificial_person_cert_no') is not None:
            self.artificial_person_cert_no = m.get('artificial_person_cert_no')
        if m.get('artificial_person_cert_type') is not None:
            self.artificial_person_cert_type = m.get('artificial_person_cert_type')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('bussiness_role') is not None:
            self.bussiness_role = m.get('bussiness_role')
        if m.get('country_code') is not None:
            self.country_code = m.get('country_code')
        return self


class UpdateAntcloudAcmCustomerIdentityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        customer_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回客户id
        self.customer_id = customer_id

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
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        return self


class QueryAntcloudAcmUserProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 用户ID
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class QueryAntcloudAcmUserProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_list: List[Project] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目
        self.project_list = project_list

    def validate(self):
        if self.project_list:
            for k in self.project_list:
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
        result['project_list'] = []
        if self.project_list is not None:
            for k in self.project_list:
                result['project_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.project_list = []
        if m.get('project_list') is not None:
            for k in m.get('project_list'):
                temp_model = Project()
                self.project_list.append(temp_model.from_map(k))
        return self


class UpdateAntcloudAcmTenantCountryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        country_code: str = None,
        business_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 国家代码
        self.country_code = country_code
        # 场景码
        self.business_code = business_code

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.country_code, 'country_code')
        self.validate_required(self.business_code, 'business_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.country_code is not None:
            result['country_code'] = self.country_code
        if self.business_code is not None:
            result['business_code'] = self.business_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('country_code') is not None:
            self.country_code = m.get('country_code')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        return self


class UpdateAntcloudAcmTenantCountryResponse(TeaModel):
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


class QueryAntcloudAcmTenantProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryAntcloudAcmTenantProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_list: List[Project] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 项目列表
        self.project_list = project_list

    def validate(self):
        if self.project_list:
            for k in self.project_list:
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
        result['project_list'] = []
        if self.project_list is not None:
            for k in self.project_list:
                result['project_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.project_list = []
        if m.get('project_list') is not None:
            for k in m.get('project_list'):
                temp_model = Project()
                self.project_list.append(temp_model.from_map(k))
        return self


class CreateAntcloudAcmTenantProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        project_name: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作者用户ID
        self.user_id = user_id
        # 项目名称
        self.project_name = project_name
        # 项目描述
        self.description = description

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.project_name, 'project_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class CreateAntcloudAcmTenantProjectResponse(TeaModel):
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


class UpdateAntcloudAcmTenantProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        project_id: str = None,
        project_name: str = None,
        description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作者用户ID
        self.user_id = user_id
        # 项目ID
        self.project_id = project_id
        # 项目名称
        self.project_name = project_name
        # 项目描述
        self.description = description

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_name, 'project_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class UpdateAntcloudAcmTenantProjectResponse(TeaModel):
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


class UpdateAntcloudAcmProjectStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        project_id: str = None,
        status: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作者用户ID
        self.user_id = user_id
        # 项目ID
        self.project_id = project_id
        # false代表禁用，true代表启用
        self.status = status

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class UpdateAntcloudAcmProjectStatusResponse(TeaModel):
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


class QueryAntcloudAcmProjectMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        project_id: str = None,
        user_name: str = None,
        current_page: int = None,
        page_size: int = None,
        sort_field: str = None,
        sort_order: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作者用户ID
        self.user_id = user_id
        # 项目ID
        self.project_id = project_id
        # 用户名称（模糊搜索）
        self.user_name = user_name
        # 当前页，默认为 1
        self.current_page = current_page
        # 每页大小，默认为 10
        self.page_size = page_size
        # 排序字段：UTC_CREATE（创建时间）、UTC_MODIFIED（更新时间），默认为 UTC_CREATE
        self.sort_field = sort_field
        # 排序方式：ASC（升序）、DESC（降序），默认为 DESC
        self.sort_order = sort_order

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.sort_field is not None:
            result['sort_field'] = self.sort_field
        if self.sort_order is not None:
            result['sort_order'] = self.sort_order
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('sort_field') is not None:
            self.sort_field = m.get('sort_field')
        if m.get('sort_order') is not None:
            self.sort_order = m.get('sort_order')
        return self


class QueryAntcloudAcmProjectMemberResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        members: List[Member] = None,
        current_page: int = None,
        page_size: int = None,
        total_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成员列表
        self.members = members
        # 当前页
        self.current_page = current_page
        # 每页大小
        self.page_size = page_size
        # 查询结果总数
        self.total_count = total_count

    def validate(self):
        if self.members:
            for k in self.members:
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
        result['members'] = []
        if self.members is not None:
            for k in self.members:
                result['members'].append(k.to_map() if k else None)
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.members = []
        if m.get('members') is not None:
            for k in m.get('members'):
                temp_model = Member()
                self.members.append(temp_model.from_map(k))
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class AddAntcloudAcmProjectMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        project_id: str = None,
        users: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作者用户ID
        self.user_id = user_id
        # 项目ID
        self.project_id = project_id
        # 成员用户ID列表
        self.users = users

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.users, 'users')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.users is not None:
            result['users'] = self.users
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('users') is not None:
            self.users = m.get('users')
        return self


class AddAntcloudAcmProjectMemberResponse(TeaModel):
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


class RemoveAntcloudAcmProjectMemberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        project_id: str = None,
        users: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作者用户ID
        self.user_id = user_id
        # 项目ID
        self.project_id = project_id
        # 待移除的成员用户ID列表
        self.users = users

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.users, 'users')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.users is not None:
            result['users'] = self.users
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('users') is not None:
            self.users = m.get('users')
        return self


class RemoveAntcloudAcmProjectMemberResponse(TeaModel):
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


class QueryAntcloudAcmProjectUserRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        user_id: str = None,
        project_id: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 操作者用户ID
        self.user_id = user_id
        # 项目ID
        self.project_id = project_id
        # 用户名称（模糊搜索）
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class QueryAntcloudAcmProjectUserResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        users: List[User] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户列表
        self.users = users

    def validate(self):
        if self.users:
            for k in self.users:
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
        result['users'] = []
        if self.users is not None:
            for k in self.users:
                result['users'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.users = []
        if m.get('users') is not None:
            for k in m.get('users'):
                temp_model = User()
                self.users.append(temp_model.from_map(k))
        return self


class ListAntcloudOfferInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        product_code: str = None,
        statuses: List[str] = None,
        cursor: str = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户id
        self.tenant_id = tenant_id
        # 渠道产品码
        self.product_code = product_code
        # 实例状态过滤；默认 ["STARTED","CREATING"]
        self.statuses = statuses
        # 游标（keyset）。首页请求不传或留空；后续请求传上一页响应返回的 nextCursor
        self.cursor = cursor
        # 每页条数，默认 20，上限 100
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.statuses is not None:
            result['statuses'] = self.statuses
        if self.cursor is not None:
            result['cursor'] = self.cursor
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('statuses') is not None:
            self.statuses = m.get('statuses')
        if m.get('cursor') is not None:
            self.cursor = m.get('cursor')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListAntcloudOfferInstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        instances: List[Instance] = None,
        next_cursor: str = None,
        has_more: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页实例列表（含规格明细
        self.instances = instances
        # 下一页游标。空字符串 表示无更多数据
        self.next_cursor = next_cursor
        # 是否有下一页（便于客户端控制循环）
        self.has_more = has_more

    def validate(self):
        if self.instances:
            for k in self.instances:
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
        result['instances'] = []
        if self.instances is not None:
            for k in self.instances:
                result['instances'].append(k.to_map() if k else None)
        if self.next_cursor is not None:
            result['next_cursor'] = self.next_cursor
        if self.has_more is not None:
            result['has_more'] = self.has_more
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.instances = []
        if m.get('instances') is not None:
            for k in m.get('instances'):
                temp_model = Instance()
                self.instances.append(temp_model.from_map(k))
        if m.get('next_cursor') is not None:
            self.next_cursor = m.get('next_cursor')
        if m.get('has_more') is not None:
            self.has_more = m.get('has_more')
        return self


class ApplyAntcloudBillingRespackageCountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        out_biz_id: str = None,
        tenant_id: str = None,
        product_code: str = None,
        instance_id: str = None,
        template_name: str = None,
        gmt_service: str = None,
        partial_deduct_flag: bool = None,
        need_alert: bool = None,
        deduct_amount: int = None,
        from_app: str = None,
        extend_info: str = None,
        hold: bool = None,
        hold_time: int = None,
        deduct_amount_str: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 外部唯一单据号 不超过64位
        self.out_biz_id = out_biz_id
        # 租户id
        self.tenant_id = tenant_id
        # 商品码
        self.product_code = product_code
        # 指定实例ID
        self.instance_id = instance_id
        # 指定模板
        self.template_name = template_name
        # 业务发生时间
        self.gmt_service = gmt_service
        # 是否部分抵扣
        self.partial_deduct_flag = partial_deduct_flag
        # 是否通知用户
        self.need_alert = need_alert
        # 抵扣量，后续废弃，新业务使用deduct_amount_str
        self.deduct_amount = deduct_amount
        # 来源系统
        self.from_app = from_app
        # json字符串
        self.extend_info = extend_info
        # 预占抵扣模式
        self.hold = hold
        # 预占时长
        self.hold_time = hold_time
        # 高精度抵扣量，与deduct_amount互斥，传一个就可以，deduct_amount不支持小数，deduct_amount_str支持小数
        self.deduct_amount_str = deduct_amount_str

    def validate(self):
        self.validate_required(self.out_biz_id, 'out_biz_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.gmt_service, 'gmt_service')
        if self.gmt_service is not None:
            self.validate_pattern(self.gmt_service, 'gmt_service', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.from_app, 'from_app')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.out_biz_id is not None:
            result['out_biz_id'] = self.out_biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.gmt_service is not None:
            result['gmt_service'] = self.gmt_service
        if self.partial_deduct_flag is not None:
            result['partial_deduct_flag'] = self.partial_deduct_flag
        if self.need_alert is not None:
            result['need_alert'] = self.need_alert
        if self.deduct_amount is not None:
            result['deduct_amount'] = self.deduct_amount
        if self.from_app is not None:
            result['from_app'] = self.from_app
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        if self.hold is not None:
            result['hold'] = self.hold
        if self.hold_time is not None:
            result['hold_time'] = self.hold_time
        if self.deduct_amount_str is not None:
            result['deduct_amount_str'] = self.deduct_amount_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('out_biz_id') is not None:
            self.out_biz_id = m.get('out_biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('gmt_service') is not None:
            self.gmt_service = m.get('gmt_service')
        if m.get('partial_deduct_flag') is not None:
            self.partial_deduct_flag = m.get('partial_deduct_flag')
        if m.get('need_alert') is not None:
            self.need_alert = m.get('need_alert')
        if m.get('deduct_amount') is not None:
            self.deduct_amount = m.get('deduct_amount')
        if m.get('from_app') is not None:
            self.from_app = m.get('from_app')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        if m.get('hold') is not None:
            self.hold = m.get('hold')
        if m.get('hold_time') is not None:
            self.hold_time = m.get('hold_time')
        if m.get('deduct_amount_str') is not None:
            self.deduct_amount_str = m.get('deduct_amount_str')
        return self


class ApplyAntcloudBillingRespackageCountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        out_biz_id: str = None,
        deduct_amount: int = None,
        oms_component_key: str = None,
        left_amount: int = None,
        oms_data_component_deduct_detail_resultvos: List[OmsDataComponentDeductDetailResultVO] = None,
        deduct_amount_str: str = None,
        left_amount_str: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 外部唯一单据号 不超过64位
        self.out_biz_id = out_biz_id
        # 本次抵扣总量
        self.deduct_amount = deduct_amount
        # 抵扣的oms component key
        self.oms_component_key = oms_component_key
        # 抵扣后剩余计量值
        self.left_amount = left_amount
        # 资源包抵扣详细信息
        self.oms_data_component_deduct_detail_resultvos = oms_data_component_deduct_detail_resultvos
        # 高精度本次抵扣总量，支持小数
        self.deduct_amount_str = deduct_amount_str
        # 高精度抵扣剩余量值，支持小数
        self.left_amount_str = left_amount_str

    def validate(self):
        if self.oms_data_component_deduct_detail_resultvos:
            for k in self.oms_data_component_deduct_detail_resultvos:
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
        if self.out_biz_id is not None:
            result['out_biz_id'] = self.out_biz_id
        if self.deduct_amount is not None:
            result['deduct_amount'] = self.deduct_amount
        if self.oms_component_key is not None:
            result['oms_component_key'] = self.oms_component_key
        if self.left_amount is not None:
            result['left_amount'] = self.left_amount
        result['oms_data_component_deduct_detail_resultvos'] = []
        if self.oms_data_component_deduct_detail_resultvos is not None:
            for k in self.oms_data_component_deduct_detail_resultvos:
                result['oms_data_component_deduct_detail_resultvos'].append(k.to_map() if k else None)
        if self.deduct_amount_str is not None:
            result['deduct_amount_str'] = self.deduct_amount_str
        if self.left_amount_str is not None:
            result['left_amount_str'] = self.left_amount_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('out_biz_id') is not None:
            self.out_biz_id = m.get('out_biz_id')
        if m.get('deduct_amount') is not None:
            self.deduct_amount = m.get('deduct_amount')
        if m.get('oms_component_key') is not None:
            self.oms_component_key = m.get('oms_component_key')
        if m.get('left_amount') is not None:
            self.left_amount = m.get('left_amount')
        self.oms_data_component_deduct_detail_resultvos = []
        if m.get('oms_data_component_deduct_detail_resultvos') is not None:
            for k in m.get('oms_data_component_deduct_detail_resultvos'):
                temp_model = OmsDataComponentDeductDetailResultVO()
                self.oms_data_component_deduct_detail_resultvos.append(temp_model.from_map(k))
        if m.get('deduct_amount_str') is not None:
            self.deduct_amount_str = m.get('deduct_amount_str')
        if m.get('left_amount_str') is not None:
            self.left_amount_str = m.get('left_amount_str')
        return self


class QueryAntcloudBillingRespackageBalanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        deduct_product_code: str = None,
        gmt_service: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户id
        self.tenant_id = tenant_id
        # 抵扣资源包的量价商品码
        self.deduct_product_code = deduct_product_code
        # 业务时间(不同时间余量不一样)
        self.gmt_service = gmt_service

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.deduct_product_code, 'deduct_product_code')
        self.validate_required(self.gmt_service, 'gmt_service')
        if self.gmt_service is not None:
            self.validate_pattern(self.gmt_service, 'gmt_service', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.deduct_product_code is not None:
            result['deduct_product_code'] = self.deduct_product_code
        if self.gmt_service is not None:
            result['gmt_service'] = self.gmt_service
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('deduct_product_code') is not None:
            self.deduct_product_code = m.get('deduct_product_code')
        if m.get('gmt_service') is not None:
            self.gmt_service = m.get('gmt_service')
        return self


class QueryAntcloudBillingRespackageBalanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        balance_detail: List[RespackegeBanlanceVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资源包余量明细
        self.balance_detail = balance_detail

    def validate(self):
        if self.balance_detail:
            for k in self.balance_detail:
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
        result['balance_detail'] = []
        if self.balance_detail is not None:
            for k in self.balance_detail:
                result['balance_detail'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.balance_detail = []
        if m.get('balance_detail') is not None:
            for k in m.get('balance_detail'):
                temp_model = RespackegeBanlanceVO()
                self.balance_detail.append(temp_model.from_map(k))
        return self


class CheckAntcloudBillingConfigPreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        new_fee_config: FeeConfEntityVO = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 配置字符串
        self.new_fee_config = new_fee_config
        # 请求单号
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.new_fee_config, 'new_fee_config')
        if self.new_fee_config:
            self.new_fee_config.validate()
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.new_fee_config is not None:
            result['new_fee_config'] = self.new_fee_config.to_map()
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('new_fee_config') is not None:
            temp_model = FeeConfEntityVO()
            self.new_fee_config = temp_model.from_map(m['new_fee_config'])
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class CheckAntcloudBillingConfigPreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: FeeConfChangeVO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 对比对象
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
        if m.get('result') is not None:
            temp_model = FeeConfChangeVO()
            self.result = temp_model.from_map(m['result'])
        return self


class SendAntcloudMarketingPartnerCouponRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        template_id: str = None,
        alipay_login_name: str = None,
        biz_no: str = None,
        remark: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 优惠券模版id
        self.template_id = template_id
        # 支付宝登录名称
        self.alipay_login_name = alipay_login_name
        # 业务唯一幂等标识，可以是订单号
        self.biz_no = biz_no
        # 备注
        self.remark = remark
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.alipay_login_name is not None:
            result['alipay_login_name'] = self.alipay_login_name
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.remark is not None:
            result['remark'] = self.remark
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('alipay_login_name') is not None:
            self.alipay_login_name = m.get('alipay_login_name')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class SendAntcloudMarketingPartnerCouponResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        coupon_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 优惠券id
        self.coupon_id = coupon_id

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
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        return self


class QueryAntcloudMarketingPartnerCouponstockRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        template_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 券模版id
        self.template_id = template_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class QueryAntcloudMarketingPartnerCouponstockResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_quota: int = None,
        released_quota: int = None,
        available_quota: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模版总量
        self.total_quota = total_quota
        # 已使用
        self.released_quota = released_quota
        # 可用
        self.available_quota = available_quota

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
        if self.total_quota is not None:
            result['total_quota'] = self.total_quota
        if self.released_quota is not None:
            result['released_quota'] = self.released_quota
        if self.available_quota is not None:
            result['available_quota'] = self.available_quota
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_quota') is not None:
            self.total_quota = m.get('total_quota')
        if m.get('released_quota') is not None:
            self.released_quota = m.get('released_quota')
        if m.get('available_quota') is not None:
            self.available_quota = m.get('available_quota')
        return self


class QueryAntcloudMarketingPartnerCouponRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        product_codes: List[str] = None,
        currency: str = None,
        coupon_type: List[str] = None,
        coupon_status: List[str] = None,
        start_time: str = None,
        end_time: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 目标租户2088 ID，查询发放给该租户的优惠券
        self.tenant_id = tenant_id
        # 商品规格Code列表
        self.product_codes = product_codes
        # 币种，目前仅支持CNY、USD
        self.currency = currency
        # 优惠券类型；不传或空列表表示全部类型
        self.coupon_type = coupon_type
        # 优惠券状态；不传或空列表表示全部状态.
        # AVAILABLE正常/可用状态
        # EXHAUSTED 已使用完
        # ABANDONED 已作废
        # EXPIRED 已过期
        self.coupon_status = coupon_status
        # 查询区间开始时间
        self.start_time = start_time
        # 查询区间结束时间
        self.end_time = end_time
        # 页码，从1开始
        self.page_no = page_no
        # 每页记录数，范围1～100
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_codes, 'product_codes')
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_codes is not None:
            result['product_codes'] = self.product_codes
        if self.currency is not None:
            result['currency'] = self.currency
        if self.coupon_type is not None:
            result['coupon_type'] = self.coupon_type
        if self.coupon_status is not None:
            result['coupon_status'] = self.coupon_status
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_codes') is not None:
            self.product_codes = m.get('product_codes')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('coupon_type') is not None:
            self.coupon_type = m.get('coupon_type')
        if m.get('coupon_status') is not None:
            self.coupon_status = m.get('coupon_status')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryAntcloudMarketingPartnerCouponResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_no: int = None,
        page_size: int = None,
        total_count: int = None,
        coupons: List[Coupon] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前页码
        self.page_no = page_no
        # 当前每页记录数
        self.page_size = page_size
        # 满足全部查询条件的优惠券总数
        self.total_count = total_count
        # 优惠券列表
        self.coupons = coupons

    def validate(self):
        if self.coupons:
            for k in self.coupons:
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
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['coupons'] = []
        if self.coupons is not None:
            for k in self.coupons:
                result['coupons'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.coupons = []
        if m.get('coupons') is not None:
            for k in m.get('coupons'):
                temp_model = Coupon()
                self.coupons.append(temp_model.from_map(k))
        return self


class ListAntcloudMarketingPartnerCoupontemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        start_time: str = None,
        end_time: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # start_time到end_time时间区间内可用命中的模版都可以查询出来
        self.start_time = start_time
        # start_time到end_time时间区间内可用命中的模版都可以查询出来
        self.end_time = end_time
        # 分页查询的页码
        self.page_no = page_no
        # 分页查询每一页查询的记录数量
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.page_no, 'page_no')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListAntcloudMarketingPartnerCoupontemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_no: int = None,
        page_size: int = None,
        total_count: int = None,
        templates: List[ChannelTemplateInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分页查询的页码
        self.page_no = page_no
        # 分页查询每页展示的数量
        self.page_size = page_size
        # 查询出来的总模板数量
        self.total_count = total_count
        # 优惠券模板信息
        self.templates = templates

    def validate(self):
        if self.templates:
            for k in self.templates:
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
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['templates'] = []
        if self.templates is not None:
            for k in self.templates:
                result['templates'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.templates = []
        if m.get('templates') is not None:
            for k in m.get('templates'):
                temp_model = ChannelTemplateInfo()
                self.templates.append(temp_model.from_map(k))
        return self


class QueryAntcloudTradeComboPriceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        combo_code: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        order_type: str = None,
        coupon_id: str = None,
        combo_vid: str = None,
        custom_spec_pricing: bool = None,
        selected_configs: List[SelectedConfigItem] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 套餐编码。自定义规格询价时可为空
        self.combo_code = combo_code
        # 租户ID，和租户名二选一必填
        self.tenant_id = tenant_id
        # 8位租户名，和租户ID二选一必填
        self.tenant_name = tenant_name
        # 订单类型，新购：NEW，不填则默认NEW
        self.order_type = order_type
        # 优惠券ID
        self.coupon_id = coupon_id
        # 套餐版本唯一版本号。CV开头的唯一版本号，由中台提供。自定义规格查询时必填
        self.combo_vid = combo_vid
        # 是否自定义规格询价
        self.custom_spec_pricing = custom_spec_pricing
        # 用户选择的规格配置列表
        self.selected_configs = selected_configs

    def validate(self):
        if self.selected_configs:
            for k in self.selected_configs:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.combo_code is not None:
            result['combo_code'] = self.combo_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        if self.combo_vid is not None:
            result['combo_vid'] = self.combo_vid
        if self.custom_spec_pricing is not None:
            result['custom_spec_pricing'] = self.custom_spec_pricing
        result['selected_configs'] = []
        if self.selected_configs is not None:
            for k in self.selected_configs:
                result['selected_configs'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('combo_code') is not None:
            self.combo_code = m.get('combo_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        if m.get('combo_vid') is not None:
            self.combo_vid = m.get('combo_vid')
        if m.get('custom_spec_pricing') is not None:
            self.custom_spec_pricing = m.get('custom_spec_pricing')
        self.selected_configs = []
        if m.get('selected_configs') is not None:
            for k in m.get('selected_configs'):
                temp_model = SelectedConfigItem()
                self.selected_configs.append(temp_model.from_map(k))
        return self


class QueryAntcloudTradeComboPriceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        combo_pay_amount: str = None,
        combo_coupon_amount: str = None,
        combo_discount_amount: str = None,
        combo_original_amount: str = None,
        currency: str = None,
        commodity_enquiry_prices: List[CommodityEnquiryPrice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 套餐付款金额
        self.combo_pay_amount = combo_pay_amount
        # 套餐优惠金额
        self.combo_coupon_amount = combo_coupon_amount
        # 套餐折扣金额
        self.combo_discount_amount = combo_discount_amount
        # 套餐原始金额
        self.combo_original_amount = combo_original_amount
        # 币种，元：CNY
        self.currency = currency
        # 商品询价明细
        self.commodity_enquiry_prices = commodity_enquiry_prices

    def validate(self):
        if self.commodity_enquiry_prices:
            for k in self.commodity_enquiry_prices:
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
        if self.combo_pay_amount is not None:
            result['combo_pay_amount'] = self.combo_pay_amount
        if self.combo_coupon_amount is not None:
            result['combo_coupon_amount'] = self.combo_coupon_amount
        if self.combo_discount_amount is not None:
            result['combo_discount_amount'] = self.combo_discount_amount
        if self.combo_original_amount is not None:
            result['combo_original_amount'] = self.combo_original_amount
        if self.currency is not None:
            result['currency'] = self.currency
        result['commodity_enquiry_prices'] = []
        if self.commodity_enquiry_prices is not None:
            for k in self.commodity_enquiry_prices:
                result['commodity_enquiry_prices'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('combo_pay_amount') is not None:
            self.combo_pay_amount = m.get('combo_pay_amount')
        if m.get('combo_coupon_amount') is not None:
            self.combo_coupon_amount = m.get('combo_coupon_amount')
        if m.get('combo_discount_amount') is not None:
            self.combo_discount_amount = m.get('combo_discount_amount')
        if m.get('combo_original_amount') is not None:
            self.combo_original_amount = m.get('combo_original_amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        self.commodity_enquiry_prices = []
        if m.get('commodity_enquiry_prices') is not None:
            for k in m.get('commodity_enquiry_prices'):
                temp_model = CommodityEnquiryPrice()
                self.commodity_enquiry_prices.append(temp_model.from_map(k))
        return self


class PayAntcloudTradeComboOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        combo_order_id: str = None,
        pay_channel: str = None,
        pay_mode: str = None,
        pay_return_url: str = None,
        combo_order_pay_options: ComboOrderPayOptions = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 套餐订单号
        self.combo_order_id = combo_order_id
        # 支付渠道，客资：FINANCIAL_FUND；财资：CUSTOMER_FUND；支付通：ALIPAY
        self.pay_channel = pay_channel
        # 支付模式，PAGE：页面确认支付；AUTO：系统自动扣款
        # 支付通模式只支持PAGE
        self.pay_mode = pay_mode
        # 支付回跳地址，当pay_mode=PAGE时，必传
        self.pay_return_url = pay_return_url
        # 组合下单支付配置项
        self.combo_order_pay_options = combo_order_pay_options

    def validate(self):
        self.validate_required(self.combo_order_id, 'combo_order_id')
        self.validate_required(self.pay_channel, 'pay_channel')
        self.validate_required(self.pay_mode, 'pay_mode')
        if self.combo_order_pay_options:
            self.combo_order_pay_options.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.combo_order_id is not None:
            result['combo_order_id'] = self.combo_order_id
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        if self.pay_mode is not None:
            result['pay_mode'] = self.pay_mode
        if self.pay_return_url is not None:
            result['pay_return_url'] = self.pay_return_url
        if self.combo_order_pay_options is not None:
            result['combo_order_pay_options'] = self.combo_order_pay_options.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('combo_order_id') is not None:
            self.combo_order_id = m.get('combo_order_id')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        if m.get('pay_mode') is not None:
            self.pay_mode = m.get('pay_mode')
        if m.get('pay_return_url') is not None:
            self.pay_return_url = m.get('pay_return_url')
        if m.get('combo_order_pay_options') is not None:
            temp_model = ComboOrderPayOptions()
            self.combo_order_pay_options = temp_model.from_map(m['combo_order_pay_options'])
        return self


class PayAntcloudTradeComboOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_url: str = None,
        pay_order_id: str = None,
        pay_status: str = None,
        timeout_minutes: int = None,
        expire_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页面支付地址
        self.pay_url = pay_url
        # 支付订单号
        self.pay_order_id = pay_order_id
        # 支付状态，
        # SUCCESS：已支付;
        # INIT：未支付;
        # PROCESS：支付中;
        # CANCEL：取消支付;
        self.pay_status = pay_status
        # 支付链接超时时间 单位：分钟
        self.timeout_minutes = timeout_minutes
        # 支付链接过期时间
        self.expire_time = expire_time

    def validate(self):
        if self.expire_time is not None:
            self.validate_pattern(self.expire_time, 'expire_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.pay_url is not None:
            result['pay_url'] = self.pay_url
        if self.pay_order_id is not None:
            result['pay_order_id'] = self.pay_order_id
        if self.pay_status is not None:
            result['pay_status'] = self.pay_status
        if self.timeout_minutes is not None:
            result['timeout_minutes'] = self.timeout_minutes
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_url') is not None:
            self.pay_url = m.get('pay_url')
        if m.get('pay_order_id') is not None:
            self.pay_order_id = m.get('pay_order_id')
        if m.get('pay_status') is not None:
            self.pay_status = m.get('pay_status')
        if m.get('timeout_minutes') is not None:
            self.timeout_minutes = m.get('timeout_minutes')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        return self


class QueryAntcloudTradePriceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        commodity_code: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        quantity: int = None,
        biz_time: str = None,
        order_duration: OrderDuration = None,
        commodity_order_attrs: List[CommodityOrderAttribute] = None,
        currency: str = None,
        coupon_id: str = None,
        order_type: str = None,
        instance_id: str = None,
        sale_market: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品主数据编码
        self.commodity_code = commodity_code
        # 租户ID，和租户名称二选一必填
        self.tenant_id = tenant_id
        # 8位租户名，和租户ID二选一必选
        self.tenant_name = tenant_name
        # 商品数量，不传则默认1
        self.quantity = quantity
        # 业务发生时间，不传则默认当前时间
        self.biz_time = biz_time
        # 订购周期，基于周期定价的商品必填
        self.order_duration = order_duration
        # 商品规格列表，按实际商品定义的和价格相关的属性传入
        # 1.续费询价不需要传
        # 2.变配询价需要传入变化的规格属性
        self.commodity_order_attrs = commodity_order_attrs
        # 币种，元：CNY，不传默认CNY
        self.currency = currency
        # 优惠券ID
        self.coupon_id = coupon_id
        # 不填默认为NEW；NEW：新购；RENEW：续费；MODIFY：变配
        self.order_type = order_type
        # 实例ID，续费/变配场景必传
        self.instance_id = instance_id
        # 售卖市场编码，用于识别国际场景的税商类型、币种
        self.sale_market = sale_market

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        if self.biz_time is not None:
            self.validate_pattern(self.biz_time, 'biz_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.order_duration:
            self.order_duration.validate()
        if self.commodity_order_attrs:
            for k in self.commodity_order_attrs:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.biz_time is not None:
            result['biz_time'] = self.biz_time
        if self.order_duration is not None:
            result['order_duration'] = self.order_duration.to_map()
        result['commodity_order_attrs'] = []
        if self.commodity_order_attrs is not None:
            for k in self.commodity_order_attrs:
                result['commodity_order_attrs'].append(k.to_map() if k else None)
        if self.currency is not None:
            result['currency'] = self.currency
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.sale_market is not None:
            result['sale_market'] = self.sale_market
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('biz_time') is not None:
            self.biz_time = m.get('biz_time')
        if m.get('order_duration') is not None:
            temp_model = OrderDuration()
            self.order_duration = temp_model.from_map(m['order_duration'])
        self.commodity_order_attrs = []
        if m.get('commodity_order_attrs') is not None:
            for k in m.get('commodity_order_attrs'):
                temp_model = CommodityOrderAttribute()
                self.commodity_order_attrs.append(temp_model.from_map(k))
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('sale_market') is not None:
            self.sale_market = m.get('sale_market')
        return self


class QueryAntcloudTradePriceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        commodity_enquiry_price: CommodityEnquiryPrice = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品询价结果
        self.commodity_enquiry_price = commodity_enquiry_price

    def validate(self):
        if self.commodity_enquiry_price:
            self.commodity_enquiry_price.validate()

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
        if self.commodity_enquiry_price is not None:
            result['commodity_enquiry_price'] = self.commodity_enquiry_price.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('commodity_enquiry_price') is not None:
            temp_model = CommodityEnquiryPrice()
            self.commodity_enquiry_price = temp_model.from_map(m['commodity_enquiry_price'])
        return self


class QueryAntcloudTradeComboOptionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        vid: str = None,
        ou: str = None,
        tenant_id: str = None,
        market_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 套餐版本唯一版本号，有值则优先使用
        self.vid = vid
        # 销售主体（如ZL6、ZL7）
        self.ou = ou
        # 购买租户id
        self.tenant_id = tenant_id
        # 售卖市场
        self.market_type = market_type

    def validate(self):
        self.validate_required(self.vid, 'vid')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.vid is not None:
            result['vid'] = self.vid
        if self.ou is not None:
            result['ou'] = self.ou
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.market_type is not None:
            result['market_type'] = self.market_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('vid') is not None:
            self.vid = m.get('vid')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('market_type') is not None:
            self.market_type = m.get('market_type')
        return self


class QueryAntcloudTradeComboOptionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        combo_dto: ComboDTO = None,
        combo_item_dtos: List[ComboItemDTO] = None,
        rule_check_success: bool = None,
        rule_check_error_code: str = None,
        rule_check_error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 套餐基本信息
        self.combo_dto = combo_dto
        # 套餐内商品信息列表（仅包含当前 OU 下上架的商品）
        self.combo_item_dtos = combo_item_dtos
        # 售卖规则校验是否通过
        self.rule_check_success = rule_check_success
        # 售卖规则校验失败时的错误码
        self.rule_check_error_code = rule_check_error_code
        # 该商品当前不可购买：未完成实名认证
        self.rule_check_error_message = rule_check_error_message

    def validate(self):
        if self.combo_dto:
            self.combo_dto.validate()
        if self.combo_item_dtos:
            for k in self.combo_item_dtos:
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
        if self.combo_dto is not None:
            result['combo_dto'] = self.combo_dto.to_map()
        result['combo_item_dtos'] = []
        if self.combo_item_dtos is not None:
            for k in self.combo_item_dtos:
                result['combo_item_dtos'].append(k.to_map() if k else None)
        if self.rule_check_success is not None:
            result['rule_check_success'] = self.rule_check_success
        if self.rule_check_error_code is not None:
            result['rule_check_error_code'] = self.rule_check_error_code
        if self.rule_check_error_message is not None:
            result['rule_check_error_message'] = self.rule_check_error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('combo_dto') is not None:
            temp_model = ComboDTO()
            self.combo_dto = temp_model.from_map(m['combo_dto'])
        self.combo_item_dtos = []
        if m.get('combo_item_dtos') is not None:
            for k in m.get('combo_item_dtos'):
                temp_model = ComboItemDTO()
                self.combo_item_dtos.append(temp_model.from_map(k))
        if m.get('rule_check_success') is not None:
            self.rule_check_success = m.get('rule_check_success')
        if m.get('rule_check_error_code') is not None:
            self.rule_check_error_code = m.get('rule_check_error_code')
        if m.get('rule_check_error_message') is not None:
            self.rule_check_error_message = m.get('rule_check_error_message')
        return self


class CreatewithoptionsAntcloudTradeComboRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        combo_vid: str = None,
        ou: str = None,
        tenant_id: str = None,
        selected_configs: List[SelectedConfigItem] = None,
        request_id: str = None,
        sale_market: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 套餐版本唯一版本号
        self.combo_vid = combo_vid
        # 销售主体（如 ZL6、ZL7）
        self.ou = ou
        # 购买租户ID
        self.tenant_id = tenant_id
        # 用户选择的规格配置列表
        self.selected_configs = selected_configs
        # 请求ID，用于幂等
        self.request_id = request_id
        # 售卖市场，由中台分配
        self.sale_market = sale_market

    def validate(self):
        self.validate_required(self.combo_vid, 'combo_vid')
        self.validate_required(self.ou, 'ou')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.selected_configs, 'selected_configs')
        if self.selected_configs:
            for k in self.selected_configs:
                if k:
                    k.validate()
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.sale_market, 'sale_market')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.combo_vid is not None:
            result['combo_vid'] = self.combo_vid
        if self.ou is not None:
            result['ou'] = self.ou
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        result['selected_configs'] = []
        if self.selected_configs is not None:
            for k in self.selected_configs:
                result['selected_configs'].append(k.to_map() if k else None)
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.sale_market is not None:
            result['sale_market'] = self.sale_market
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('combo_vid') is not None:
            self.combo_vid = m.get('combo_vid')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        self.selected_configs = []
        if m.get('selected_configs') is not None:
            for k in m.get('selected_configs'):
                temp_model = SelectedConfigItem()
                self.selected_configs.append(temp_model.from_map(k))
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('sale_market') is not None:
            self.sale_market = m.get('sale_market')
        return self


class CreatewithoptionsAntcloudTradeComboResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        combo_order_id: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 套餐订单ID
        self.combo_order_id = combo_order_id
        # 订单状态，创建成功为 WAIT_CONFIRM（待确认）
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
        if self.combo_order_id is not None:
            result['combo_order_id'] = self.combo_order_id
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
        if m.get('combo_order_id') is not None:
            self.combo_order_id = m.get('combo_order_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class CancelAntcloudTradeComboRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        combo_order_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 套餐订单ID
        self.combo_order_id = combo_order_id
        # 租户ID，用于校验订单归属和操作权限
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.combo_order_id, 'combo_order_id')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.combo_order_id is not None:
            result['combo_order_id'] = self.combo_order_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('combo_order_id') is not None:
            self.combo_order_id = m.get('combo_order_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class CancelAntcloudTradeComboResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取消操作结果。true 表示取消成功
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


class CreateAntcloudTradeComboOptionsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        combo_vid: str = None,
        ou: str = None,
        tenant_id: str = None,
        selected_configs: List[SelectedConfigItem] = None,
        request_id: str = None,
        sale_market: str = None,
        combo_order_options: ComboOrderOptions = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 套餐版本唯一版本号
        self.combo_vid = combo_vid
        # 销售主体（如 ZL6、ZL7）
        self.ou = ou
        # 购买租户ID
        self.tenant_id = tenant_id
        # 用户选择的规格配置列表
        self.selected_configs = selected_configs
        # 请求ID，用于幂等
        self.request_id = request_id
        # 售卖市场，由中台分配
        self.sale_market = sale_market
        # 组合单下单配置项
        self.combo_order_options = combo_order_options

    def validate(self):
        self.validate_required(self.combo_vid, 'combo_vid')
        self.validate_required(self.ou, 'ou')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.selected_configs, 'selected_configs')
        if self.selected_configs:
            for k in self.selected_configs:
                if k:
                    k.validate()
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.sale_market, 'sale_market')
        if self.combo_order_options:
            self.combo_order_options.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.combo_vid is not None:
            result['combo_vid'] = self.combo_vid
        if self.ou is not None:
            result['ou'] = self.ou
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        result['selected_configs'] = []
        if self.selected_configs is not None:
            for k in self.selected_configs:
                result['selected_configs'].append(k.to_map() if k else None)
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.sale_market is not None:
            result['sale_market'] = self.sale_market
        if self.combo_order_options is not None:
            result['combo_order_options'] = self.combo_order_options.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('combo_vid') is not None:
            self.combo_vid = m.get('combo_vid')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        self.selected_configs = []
        if m.get('selected_configs') is not None:
            for k in m.get('selected_configs'):
                temp_model = SelectedConfigItem()
                self.selected_configs.append(temp_model.from_map(k))
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('sale_market') is not None:
            self.sale_market = m.get('sale_market')
        if m.get('combo_order_options') is not None:
            temp_model = ComboOrderOptions()
            self.combo_order_options = temp_model.from_map(m['combo_order_options'])
        return self


class CreateAntcloudTradeComboOptionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        combo_order_id: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 套餐订单ID
        self.combo_order_id = combo_order_id
        # 订单状态，创建成功为 WAIT_CONFIRM（待确认）
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
        if self.combo_order_id is not None:
            result['combo_order_id'] = self.combo_order_id
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
        if m.get('combo_order_id') is not None:
            self.combo_order_id = m.get('combo_order_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class GetAntcloudTradeOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 中台订单号
        self.order_id = order_id
        # 租户 ID
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class GetAntcloudTradeOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        order_status: str = None,
        fulfill_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单号
        self.order_id = order_id
        # 订单状态，示例：
        # ORDER_SUCCESS（成功）
        # ORDER_FAIL（失败）
        # ORDER_CANCEL（取消）
        self.order_status = order_status
        # 履约状态；INIT(待履约), DOING(履约中), DONE("履约完成"), FAILED(履约失败)
        self.fulfill_status = fulfill_status

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.fulfill_status is not None:
            result['fulfill_status'] = self.fulfill_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('fulfill_status') is not None:
            self.fulfill_status = m.get('fulfill_status')
        return self


class UseAntchainAbcJustTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class UseAntchainAbcJustTestResponse(TeaModel):
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


class QueryAntcloudPccCommodityPriceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        model: str = None,
        provider: str = None,
        charge_item: str = None,
        status: str = None,
        page_num: int = None,
        page_size: int = None,
        commodity_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 模型名称，精确匹配
        self.model = model
        # 供应商
        self.provider = provider
        # 收费项（定价对象）
        self.charge_item = charge_item
        # 定价状态
        self.status = status
        # 页码
        self.page_num = page_num
        # 每页数据量
        self.page_size = page_size
        # 商品code
        self.commodity_code = commodity_code

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.commodity_code, 'commodity_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.model is not None:
            result['model'] = self.model
        if self.provider is not None:
            result['provider'] = self.provider
        if self.charge_item is not None:
            result['charge_item'] = self.charge_item
        if self.status is not None:
            result['status'] = self.status
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('model') is not None:
            self.model = m.get('model')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('charge_item') is not None:
            self.charge_item = m.get('charge_item')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        return self


class QueryAntcloudPccCommodityPriceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page_num: int = None,
        page_size: int = None,
        items: List[ModelPriceItemDTO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总数
        self.total = total
        # 页码
        self.page_num = page_num
        # 页大小
        self.page_size = page_size
        # 模型定价
        self.items = items

    def validate(self):
        if self.items:
            for k in self.items:
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
        if self.total is not None:
            result['total'] = self.total
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['items'] = []
        if self.items is not None:
            for k in self.items:
                result['items'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.items = []
        if m.get('items') is not None:
            for k in m.get('items'):
                temp_model = ModelPriceItemDTO()
                self.items.append(temp_model.from_map(k))
        return self


class QueryAntcloudInvoiceIntlconfigUserinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryAntcloudInvoiceIntlconfigUserinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: str = None,
        tax_payer_qualification: str = None,
        name: str = None,
        country: str = None,
        country_code: str = None,
        address: str = None,
        contact_name: str = None,
        contact_email: str = None,
        contact_tel: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户ID
        self.tenant_id = tenant_id
        # 纳税人类型，国际商户为03
        self.tax_payer_qualification = tax_payer_qualification
        # 公司名称
        self.name = name
        # 国家地区
        self.country = country
        # 国家地区编号，如CN
        self.country_code = country_code
        # 公司地址
        self.address = address
        # 联系人姓名
        self.contact_name = contact_name
        # 联系人邮箱
        self.contact_email = contact_email
        # 联系人电话
        self.contact_tel = contact_tel

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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tax_payer_qualification is not None:
            result['tax_payer_qualification'] = self.tax_payer_qualification
        if self.name is not None:
            result['name'] = self.name
        if self.country is not None:
            result['country'] = self.country
        if self.country_code is not None:
            result['country_code'] = self.country_code
        if self.address is not None:
            result['address'] = self.address
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_email is not None:
            result['contact_email'] = self.contact_email
        if self.contact_tel is not None:
            result['contact_tel'] = self.contact_tel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tax_payer_qualification') is not None:
            self.tax_payer_qualification = m.get('tax_payer_qualification')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('country') is not None:
            self.country = m.get('country')
        if m.get('country_code') is not None:
            self.country_code = m.get('country_code')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_email') is not None:
            self.contact_email = m.get('contact_email')
        if m.get('contact_tel') is not None:
            self.contact_tel = m.get('contact_tel')
        return self


class QueryAntcloudInvoiceIntlamountRcptRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        ar_no: str = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 合同号或订单号
        self.ar_no = ar_no
        # 当前页码，默认1
        self.current_page = current_page
        # 每页条数，默认20
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.ar_no, 'ar_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ar_no is not None:
            result['ar_no'] = self.ar_no
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ar_no') is not None:
            self.ar_no = m.get('ar_no')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryAntcloudInvoiceIntlamountRcptResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        detail_list: List[IntlRcptDetailItem] = None,
        total_count: int = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 可开票单列列表
        self.detail_list = detail_list
        # 总条数
        self.total_count = total_count
        # 当前页
        self.current_page = current_page
        # 每页条数
        self.page_size = page_size

    def validate(self):
        if self.detail_list:
            for k in self.detail_list:
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
        result['detail_list'] = []
        if self.detail_list is not None:
            for k in self.detail_list:
                result['detail_list'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.detail_list = []
        if m.get('detail_list') is not None:
            for k in m.get('detail_list'):
                temp_model = IntlRcptDetailItem()
                self.detail_list.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryAntcloudInvoiceIntlinvoicesApplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        ar_no: str = None,
        current_page: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 合同或订单号
        self.ar_no = ar_no
        # 当前页码，默认1
        self.current_page = current_page
        # 每页条数，默认20
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.ar_no, 'ar_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ar_no is not None:
            result['ar_no'] = self.ar_no
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ar_no') is not None:
            self.ar_no = m.get('ar_no')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryAntcloudInvoiceIntlinvoicesApplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
        current_page: int = None,
        page_size: int = None,
        apply_list: List[IntlInvoiceApplyInfoItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总条数
        self.total_count = total_count
        # 当前页码
        self.current_page = current_page
        # 每页条数
        self.page_size = page_size
        # 发票申请列表
        self.apply_list = apply_list

    def validate(self):
        if self.apply_list:
            for k in self.apply_list:
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
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.current_page is not None:
            result['current_page'] = self.current_page
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['apply_list'] = []
        if self.apply_list is not None:
            for k in self.apply_list:
                result['apply_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('current_page') is not None:
            self.current_page = m.get('current_page')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.apply_list = []
        if m.get('apply_list') is not None:
            for k in m.get('apply_list'):
                temp_model = IntlInvoiceApplyInfoItem()
                self.apply_list.append(temp_model.from_map(k))
        return self


class QueryAntcloudInvoiceIntlinvoicesFileurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        invoice_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 发票ID
        self.invoice_id = invoice_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.invoice_id, 'invoice_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.invoice_id is not None:
            result['invoice_id'] = self.invoice_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('invoice_id') is not None:
            self.invoice_id = m.get('invoice_id')
        return self


class QueryAntcloudInvoiceIntlinvoicesFileurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发票文件OSS预览地址
        self.file_url = file_url

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
        if self.file_url is not None:
            result['file_url'] = self.file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        return self


class PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        ar_no: str = None,
        biz_action: str = None,
        biz_scene: str = None,
        currency_code: str = None,
        tax_rate: str = None,
        invoice_apply_item_list: List[InvoiceApplyItem] = None,
        invoice_date: str = None,
        invoice_email_info: InvoiceMailInfo = None,
        invoice_type: str = None,
        operator_name: str = None,
        operator_no: str = None,
        ou: str = None,
        ou_currency_code: str = None,
        source: str = None,
        user_invoice_info: UserInvoiceInfo = None,
        apply_reason: str = None,
        expenseperiod_startdate: str = None,
        expenseperiod_enddate: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 合同号或订单号
        self.ar_no = ar_no
        # 业务动作
        self.biz_action = biz_action
        # 业务场景
        self.biz_scene = biz_scene
        # 币种
        self.currency_code = currency_code
        # 税率
        self.tax_rate = tax_rate
        # 开票申请项列表
        self.invoice_apply_item_list = invoice_apply_item_list
        # 开票日期
        self.invoice_date = invoice_date
        # 发票邮寄信息
        self.invoice_email_info = invoice_email_info
        # 发票类型
        self.invoice_type = invoice_type
        # 操作人姓名
        self.operator_name = operator_name
        # 操作人ID
        self.operator_no = operator_no
        # OU
        self.ou = ou
        # OU币种
        self.ou_currency_code = ou_currency_code
        # 来源
        self.source = source
        # 用户开票信息
        self.user_invoice_info = user_invoice_info
        # 申请原因
        self.apply_reason = apply_reason
        # 费用期间开始日期
        self.expenseperiod_startdate = expenseperiod_startdate
        # 费用期间结束日期
        self.expenseperiod_enddate = expenseperiod_enddate

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.ar_no, 'ar_no')
        self.validate_required(self.biz_action, 'biz_action')
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.currency_code, 'currency_code')
        self.validate_required(self.tax_rate, 'tax_rate')
        self.validate_required(self.invoice_apply_item_list, 'invoice_apply_item_list')
        if self.invoice_apply_item_list:
            for k in self.invoice_apply_item_list:
                if k:
                    k.validate()
        self.validate_required(self.invoice_date, 'invoice_date')
        self.validate_required(self.invoice_email_info, 'invoice_email_info')
        if self.invoice_email_info:
            self.invoice_email_info.validate()
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.operator_name, 'operator_name')
        self.validate_required(self.operator_no, 'operator_no')
        self.validate_required(self.ou, 'ou')
        self.validate_required(self.ou_currency_code, 'ou_currency_code')
        self.validate_required(self.source, 'source')
        self.validate_required(self.user_invoice_info, 'user_invoice_info')
        if self.user_invoice_info:
            self.user_invoice_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.ar_no is not None:
            result['ar_no'] = self.ar_no
        if self.biz_action is not None:
            result['biz_action'] = self.biz_action
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.currency_code is not None:
            result['currency_code'] = self.currency_code
        if self.tax_rate is not None:
            result['tax_rate'] = self.tax_rate
        result['invoice_apply_item_list'] = []
        if self.invoice_apply_item_list is not None:
            for k in self.invoice_apply_item_list:
                result['invoice_apply_item_list'].append(k.to_map() if k else None)
        if self.invoice_date is not None:
            result['invoice_date'] = self.invoice_date
        if self.invoice_email_info is not None:
            result['invoice_email_info'] = self.invoice_email_info.to_map()
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.operator_name is not None:
            result['operator_name'] = self.operator_name
        if self.operator_no is not None:
            result['operator_no'] = self.operator_no
        if self.ou is not None:
            result['ou'] = self.ou
        if self.ou_currency_code is not None:
            result['ou_currency_code'] = self.ou_currency_code
        if self.source is not None:
            result['source'] = self.source
        if self.user_invoice_info is not None:
            result['user_invoice_info'] = self.user_invoice_info.to_map()
        if self.apply_reason is not None:
            result['apply_reason'] = self.apply_reason
        if self.expenseperiod_startdate is not None:
            result['expenseperiod_startdate'] = self.expenseperiod_startdate
        if self.expenseperiod_enddate is not None:
            result['expenseperiod_enddate'] = self.expenseperiod_enddate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('ar_no') is not None:
            self.ar_no = m.get('ar_no')
        if m.get('biz_action') is not None:
            self.biz_action = m.get('biz_action')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('currency_code') is not None:
            self.currency_code = m.get('currency_code')
        if m.get('tax_rate') is not None:
            self.tax_rate = m.get('tax_rate')
        self.invoice_apply_item_list = []
        if m.get('invoice_apply_item_list') is not None:
            for k in m.get('invoice_apply_item_list'):
                temp_model = InvoiceApplyItem()
                self.invoice_apply_item_list.append(temp_model.from_map(k))
        if m.get('invoice_date') is not None:
            self.invoice_date = m.get('invoice_date')
        if m.get('invoice_email_info') is not None:
            temp_model = InvoiceMailInfo()
            self.invoice_email_info = temp_model.from_map(m['invoice_email_info'])
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('operator_name') is not None:
            self.operator_name = m.get('operator_name')
        if m.get('operator_no') is not None:
            self.operator_no = m.get('operator_no')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('ou_currency_code') is not None:
            self.ou_currency_code = m.get('ou_currency_code')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('user_invoice_info') is not None:
            temp_model = UserInvoiceInfo()
            self.user_invoice_info = temp_model.from_map(m['user_invoice_info'])
        if m.get('apply_reason') is not None:
            self.apply_reason = m.get('apply_reason')
        if m.get('expenseperiod_startdate') is not None:
            self.expenseperiod_startdate = m.get('expenseperiod_startdate')
        if m.get('expenseperiod_enddate') is not None:
            self.expenseperiod_enddate = m.get('expenseperiod_enddate')
        return self


class PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        resultcode: str = None,
        resultmessage: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 申请是否成功
        self.success = success
        # 返回结果码
        self.resultcode = resultcode
        # 返回结果描述
        self.resultmessage = resultmessage

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
        if self.resultcode is not None:
            result['resultcode'] = self.resultcode
        if self.resultmessage is not None:
            result['resultmessage'] = self.resultmessage
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
        if m.get('resultcode') is not None:
            self.resultcode = m.get('resultcode')
        if m.get('resultmessage') is not None:
            self.resultmessage = m.get('resultmessage')
        return self


class QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        keyword: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 国家英文名称
        self.keyword = keyword

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.keyword is not None:
            result['keyword'] = self.keyword
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        return self


class QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        countrylist: List[CountryCnEnItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 国家list
        self.countrylist = countrylist

    def validate(self):
        if self.countrylist:
            for k in self.countrylist:
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
        result['countrylist'] = []
        if self.countrylist is not None:
            for k in self.countrylist:
                result['countrylist'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.countrylist = []
        if m.get('countrylist') is not None:
            for k in m.get('countrylist'):
                temp_model = CountryCnEnItem()
                self.countrylist.append(temp_model.from_map(k))
        return self


class ApiaAntdigitalTestliuyzpCliCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
        name: str = None,
        age: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间
        self.timeout = timeout
        # 姓名
        self.name = name
        # 年龄
        self.age = age

    def validate(self):
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        if self.name is not None:
            result['name'] = self.name
        if self.age is not None:
            result['age'] = self.age
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('age') is not None:
            self.age = m.get('age')
        return self


class ApiaAntdigitalTestliuyzpCliCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果描述
        self.msg = msg
        # 结果码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryAntcloudDemositdevsyTesxXxxRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 超时时间
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class QueryAntcloudDemositdevsyTesxXxxResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果描述
        self.msg = msg
        # 结果码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ApiaAntcloudDemositdevsyCliCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 超时时间
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class ApiaAntcloudDemositdevsyCliCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果描述
        self.msg = msg
        # 结果码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ApiaAntcloudWorkbenchphaseiiaCliCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # string
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 超时时间
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class ApiaAntcloudWorkbenchphaseiiaCliCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果描述
        self.msg = msg
        # 结果码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ApibAntcloudWorkbenchphaseiiaCliCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # string
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 超时时间
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class ApibAntcloudWorkbenchphaseiiaCliCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果描述
        self.msg = msg
        # 结果码
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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('status') is not None:
            self.status = m.get('status')
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


