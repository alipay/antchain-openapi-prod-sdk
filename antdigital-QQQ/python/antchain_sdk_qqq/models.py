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


class TestParamC(TeaModel):
    def __init__(
        self,
        string_param: str = None,
        number_param: int = None,
        boolean_param: bool = None,
        date_param: str = None,
        array_param: List[str] = None,
    ):
        # string_param
        self.string_param = string_param
        # number_param
        self.number_param = number_param
        # boolean_param
        self.boolean_param = boolean_param
        # date_param
        self.date_param = date_param
        # string
        self.array_param = array_param

    def validate(self):
        if self.date_param is not None:
            self.validate_pattern(self.date_param, 'date_param', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        return self


class TestParamB(TeaModel):
    def __init__(
        self,
        string_param: str = None,
        number_param: int = None,
        boolean_param: bool = None,
        date_param: str = None,
        struct_param: TestParamC = None,
        struct_list_b: TestParamC = None,
    ):
        # string_param
        self.string_param = string_param
        # number_param
        self.number_param = number_param
        # boolean_param
        self.boolean_param = boolean_param
        # date_param
        self.date_param = date_param
        # struct_param
        self.struct_param = struct_param
        # aa
        self.struct_list_b = struct_list_b

    def validate(self):
        if self.date_param is not None:
            self.validate_pattern(self.date_param, 'date_param', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.struct_param, 'struct_param')
        if self.struct_param:
            self.struct_param.validate()
        if self.struct_list_b:
            self.struct_list_b.validate()

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
        if self.struct_param is not None:
            result['struct_param'] = self.struct_param.to_map()
        if self.struct_list_b is not None:
            result['struct_list_b'] = self.struct_list_b.to_map()
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
        if m.get('struct_param') is not None:
            temp_model = TestParamC()
            self.struct_param = temp_model.from_map(m['struct_param'])
        if m.get('struct_list_b') is not None:
            temp_model = TestParamC()
            self.struct_list_b = temp_model.from_map(m['struct_list_b'])
        return self


class TestParamA(TeaModel):
    def __init__(
        self,
        string_param: str = None,
        number_param: int = None,
        boolean_param: bool = None,
        date_param: str = None,
        struct_parama: TestParamB = None,
        struct_list_a: List[TestParamB] = None,
    ):
        # string_param
        self.string_param = string_param
        # number_param
        self.number_param = number_param
        # boolean_param
        self.boolean_param = boolean_param
        # date_param
        self.date_param = date_param
        # struct_parama
        self.struct_parama = struct_parama
        # 结构体列表a
        self.struct_list_a = struct_list_a

    def validate(self):
        if self.date_param is not None:
            self.validate_pattern(self.date_param, 'date_param', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.struct_parama, 'struct_parama')
        if self.struct_parama:
            self.struct_parama.validate()
        if self.struct_list_a:
            for k in self.struct_list_a:
                if k:
                    k.validate()

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
        if self.struct_parama is not None:
            result['struct_parama'] = self.struct_parama.to_map()
        result['struct_list_a'] = []
        if self.struct_list_a is not None:
            for k in self.struct_list_a:
                result['struct_list_a'].append(k.to_map() if k else None)
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
        if m.get('struct_parama') is not None:
            temp_model = TestParamB()
            self.struct_parama = temp_model.from_map(m['struct_parama'])
        self.struct_list_a = []
        if m.get('struct_list_a') is not None:
            for k in m.get('struct_list_a'):
                temp_model = TestParamB()
                self.struct_list_a.append(temp_model.from_map(k))
        return self


class TestDemo(TeaModel):
    def __init__(
        self,
        timeout: str = None,
    ):
        # a
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


class TestParams(TeaModel):
    def __init__(
        self,
        parameter: TestParamA = None,
        string: str = None,
    ):
        # a
        self.parameter = parameter
        # string
        self.string = string

    def validate(self):
        if self.parameter:
            self.parameter.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.parameter is not None:
            result['parameter'] = self.parameter.to_map()
        if self.string is not None:
            result['string'] = self.string
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('parameter') is not None:
            temp_model = TestParamA()
            self.parameter = temp_model.from_map(m['parameter'])
        if m.get('string') is not None:
            self.string = m.get('string')
        return self


class OrderA(TeaModel):
    def __init__(
        self,
        aaa: str = None,
    ):
        # aa
        self.aaa = aaa

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.aaa is not None:
            result['aaa'] = self.aaa
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('aaa') is not None:
            self.aaa = m.get('aaa')
        return self


class DemosdkStructA(TeaModel):
    def __init__(
        self,
        company_name: str = None,
        product_main_class: str = None,
        company_address: str = None,
        contact_name: str = None,
        contact_mobile: str = None,
    ):
        # 【公司名称】
        self.company_name = company_name
        # 【业务类型】
        self.product_main_class = product_main_class
        # 【公司地址】
        self.company_address = company_address
        # 【联系人】
        self.contact_name = contact_name
        # 【联系人手机号】
        self.contact_mobile = contact_mobile

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.product_main_class is not None:
            result['product_main_class'] = self.product_main_class
        if self.company_address is not None:
            result['company_address'] = self.company_address
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_mobile is not None:
            result['contact_mobile'] = self.contact_mobile
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('product_main_class') is not None:
            self.product_main_class = m.get('product_main_class')
        if m.get('company_address') is not None:
            self.company_address = m.get('company_address')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_mobile') is not None:
            self.contact_mobile = m.get('contact_mobile')
        return self


class ResultTest(TeaModel):
    def __init__(
        self,
        name: str = None,
    ):
        # 姓名
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


class CreateStructA(TeaModel):
    def __init__(
        self,
        timeouta: str = None,
    ):
        # 超时时间
        self.timeouta = timeouta

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.timeouta is not None:
            result['timeouta'] = self.timeouta
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('timeouta') is not None:
            self.timeouta = m.get('timeouta')
        return self


class SumBean(TeaModel):
    def __init__(
        self,
        a: int = None,
    ):
        # 1
        self.a = a

    def validate(self):
        pass

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


class QueryDemoStreamTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 名称
        self.name = name

    def validate(self):
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class QueryDemoStreamTestResponse(TeaModel):
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


class QueryDemoTestTimeTestaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        a: str = None,
        b: TestClass = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # a
        self.a = a
        # b
        self.b = b

    def validate(self):
        if self.b:
            self.b.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.a is not None:
            result['a'] = self.a
        if self.b is not None:
            result['b'] = self.b.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('a') is not None:
            self.a = m.get('a')
        if m.get('b') is not None:
            temp_model = TestClass()
            self.b = temp_model.from_map(m['b'])
        return self


class QueryDemoTestTimeTestaResponse(TeaModel):
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


class QueryDemoTtUseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_card: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 测试
        self.id_card = id_card

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
        if self.id_card is not None:
            result['id_card'] = self.id_card
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        return self


class QueryDemoTtUseResponse(TeaModel):
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


class QueryDemoUtListRequest(TeaModel):
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


class QueryDemoUtListResponse(TeaModel):
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


class QueryAntchainAbcTimeFiveRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 下游超时时间
        self.timeout = timeout

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


class QueryAntchainAbcTimeFiveResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # OK
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class QueryAntchainAbcApprovalTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        input: str = None,
        delete: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 入参
        self.input = input
        # 新增字段
        self.delete = delete

    def validate(self):
        self.validate_required(self.input, 'input')
        self.validate_required(self.delete, 'delete')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.input is not None:
            result['input'] = self.input
        if self.delete is not None:
            result['delete'] = self.delete
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('input') is not None:
            self.input = m.get('input')
        if m.get('delete') is not None:
            self.delete = m.get('delete')
        return self


class QueryAntchainAbcApprovalTestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        code: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 回参
        self.msg = msg
        # 新增字段
        self.code = code

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
        if self.code is not None:
            result['code'] = self.code
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
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class ApiAntchainAbcTestCreateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 1
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


class ApiAntchainAbcTestCreateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求返回描述
        self.status = status
        # msg
        self.msg = msg

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
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class QueryAntchainAbcOneLimitRequest(TeaModel):
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


class QueryAntchainAbcOneLimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # 状态码描述
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class ImportAntchainAbcOneLimitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        timeout: str = None,
        idcard: AbcDemoStruct = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 超时时间
        self.timeout = timeout
        # 123
        self.idcard = idcard

    def validate(self):
        self.validate_required(self.timeout, 'timeout')
        if self.idcard:
            self.idcard.validate()

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
        if self.idcard is not None:
            result['idcard'] = self.idcard.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        if m.get('idcard') is not None:
            temp_model = AbcDemoStruct()
            self.idcard = temp_model.from_map(m['idcard'])
        return self


class ImportAntchainAbcOneLimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        stauts: str = None,
        msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 状态码
        self.stauts = stauts
        # 状态描述
        self.msg = msg

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
        if self.msg is not None:
            result['msg'] = self.msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        return self


class UnstabilizeAntchainAbcOneLimitRequest(TeaModel):
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


class UnstabilizeAntchainAbcOneLimitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        stauts: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码描述
        self.msg = msg
        # 状态码
        self.stauts = stauts

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
        if self.stauts is not None:
            result['stauts'] = self.stauts
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
        if m.get('stauts') is not None:
            self.stauts = m.get('stauts')
        return self


class ApibAntchainDemointernationalxjpInternationalPushRequest(TeaModel):
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


class ApibAntchainDemointernationalxjpInternationalPushResponse(TeaModel):
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


class BindAntchainDemosdkXxxRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        date: str = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.date = date
        # 123
        self.data = data

    def validate(self):
        self.validate_required(self.date, 'date')
        if self.date is not None:
            self.validate_pattern(self.date, 'date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.date is not None:
            result['date'] = self.date
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class BindAntchainDemosdkXxxResponse(TeaModel):
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


class ZzzAntchainDemosdkAaaBbbRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        date: str = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 123
        self.date = date
        # 123
        self.data = data

    def validate(self):
        self.validate_required(self.date, 'date')
        if self.date is not None:
            self.validate_pattern(self.date, 'date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.date is not None:
            result['date'] = self.date
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class ZzzAntchainDemosdkAaaBbbResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 名称
        self.name = name

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
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class CallDemoAaaBbbCccRequest(TeaModel):
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


class CallDemoAaaBbbCccResponse(TeaModel):
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


