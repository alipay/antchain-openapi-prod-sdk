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


class Logic(TeaModel):
    def __init__(
        self,
        op: str = None,
        key: str = None,
        value: str = None,
        children: str = None,
    ):
        # 操作符
        # equal = _equal_, // 相等比较
        # notEqual = _notEqual_, // 不相等比较
        # AND = _AND_, // 与逻辑
        # OR = _OR_, // 或逻辑
        self.op = op
        # 只有 op 是 AND 或者 OR 才是可选，其他情况为必选
        self.key = key
        # 只有 op 是 AND 或者 OR 才是可选，其他情况为必选
        self.value = value
        # 只有 op 是 AND 或者 OR 才需要这个字段
        # [{op: _AND_, // 与逻辑
        # children: [
        # {
        # op: _equal_, // 相等比较
        # key: _validationMethod_, // 表示：验证方式
        # value: _smsCode_  // 表示：短信验证码
        # },
        # { // 判断登录信息的值不为 null
        # op: _notEqual_, // 不相等比较
        # key: _username_,  // 表示：登录信息
        # value: null
        # }]}]
        self.children = children

    def validate(self):
        self.validate_required(self.op, 'op')
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')
        self.validate_required(self.children, 'children')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.op is not None:
            result['op'] = self.op
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        if self.children is not None:
            result['children'] = self.children
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('op') is not None:
            self.op = m.get('op')
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('children') is not None:
            self.children = m.get('children')
        return self


class Rule(TeaModel):
    def __init__(
        self,
        type: str = None,
        len: int = None,
        max: int = None,
        min: int = None,
        message: str = None,
        required: bool = None,
        reg_pattern: str = None,
    ):
        # 字段值的类型，常见有 string | number| boolean | _array_
        self.type = type
        # type 为 string 类型时，表示字符串长度；number 类型时表示确定数字； array 类型时表示数组长度
        self.len = len
        # type 为 string 类型时，表示字符串最大长度；number 类型时表示最大值；array 类型时表示数组最大长度
        self.max = max
        # type 为 string 类型时，表示字符串最小长度；number 类型时表示最小值；array 类型时表示数组最小长度
        self.min = min
        # 校验出错时显示的错误消息
        self.message = message
        # 是否必填
        self.required = required
        # 正则表达式,
        self.reg_pattern = reg_pattern

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.len, 'len')
        self.validate_required(self.max, 'max')
        self.validate_required(self.min, 'min')
        self.validate_required(self.message, 'message')
        self.validate_required(self.required, 'required')
        self.validate_required(self.reg_pattern, 'reg_pattern')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.len is not None:
            result['len'] = self.len
        if self.max is not None:
            result['max'] = self.max
        if self.min is not None:
            result['min'] = self.min
        if self.message is not None:
            result['message'] = self.message
        if self.required is not None:
            result['required'] = self.required
        if self.reg_pattern is not None:
            result['reg_pattern'] = self.reg_pattern
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('len') is not None:
            self.len = m.get('len')
        if m.get('max') is not None:
            self.max = m.get('max')
        if m.get('min') is not None:
            self.min = m.get('min')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('reg_pattern') is not None:
            self.reg_pattern = m.get('reg_pattern')
        return self


class ForgetMeta(TeaModel):
    def __init__(
        self,
        label: str = None,
        link: str = None,
    ):
        # 字段名称
        self.label = label
        # 忘记密码的链接地址，供重置用
        self.link = link

    def validate(self):
        self.validate_required(self.label, 'label')
        self.validate_required(self.link, 'link')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.label is not None:
            result['label'] = self.label
        if self.link is not None:
            result['link'] = self.link
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('label') is not None:
            self.label = m.get('label')
        if m.get('link') is not None:
            self.link = m.get('link')
        return self


class SelectOption(TeaModel):
    def __init__(
        self,
        lable: str = None,
        value: str = None,
    ):
        # 选项名称
        self.lable = lable
        # 选项的值，一般是 id 之类的唯一标识符，给后端传这个
        self.value = value

    def validate(self):
        self.validate_required(self.lable, 'lable')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.lable is not None:
            result['lable'] = self.lable
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('lable') is not None:
            self.lable = m.get('lable')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class Key(TeaModel):
    def __init__(
        self,
        key: str = None,
        id: str = None,
        type: str = None,
        label: str = None,
        input_type: str = None,
        initial_value: str = None,
        placeholder: str = None,
        disabled: bool = None,
        read_only: str = None,
        tooltip: str = None,
        rules: List[Rule] = None,
        logics: List[Logic] = None,
        select_options: List[SelectOption] = None,
        forget_meta: ForgetMeta = None,
    ):
        # 名称（key的中文名称）
        self.key = key
        # id
        self.id = id
        # input, // 普通输入框
        # dropdownSelect, // 下拉选择
        # cardSelect, // 平铺选择
        # password, // 密码输入框，这个类型会包含忘记密码按钮
        # smsCode, // 手机验证码
        # qrcodeLogin, // 二维码登录
        # hiddenField,// 隐藏字段，页面上不显示，但是值会提交给后端
        self.type = type
        # 字段名称 例如：密码
        self.label = label
        # 输入框的值类型，字符串还是数字，默认 string/number/paassword
        self.input_type = input_type
        # 字段的初始值，类型要和前端提交的类型保持一致，且是可被 JSON 序列化的
        self.initial_value = initial_value
        # 占位符，比如”请输入密码“
        self.placeholder = placeholder
        # 是否为禁用状态，true 表示禁用，默认 false
        self.disabled = disabled
        # 表示输入框是否为只读状态（只读和禁用都不能输入，但是样式不一样，所以要注意区分，不要同时声明 disabled 和 readOnly，否则以 disabled 优先）
        self.read_only = read_only
        # 这个字段的提示说明文案
        self.tooltip = tooltip
        # 校验规则
        self.rules = rules
        # 逻辑列表
        self.logics = logics
        # 选择列表的可选值，只有 type 是 dropdownSelect、cardSelect 时才需要
        self.select_options = select_options
        # 忘记密码元素
        self.forget_meta = forget_meta

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.id, 'id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.label, 'label')
        self.validate_required(self.input_type, 'input_type')
        self.validate_required(self.initial_value, 'initial_value')
        self.validate_required(self.placeholder, 'placeholder')
        self.validate_required(self.disabled, 'disabled')
        self.validate_required(self.read_only, 'read_only')
        self.validate_required(self.tooltip, 'tooltip')
        self.validate_required(self.rules, 'rules')
        if self.rules:
            for k in self.rules:
                if k:
                    k.validate()
        self.validate_required(self.logics, 'logics')
        if self.logics:
            for k in self.logics:
                if k:
                    k.validate()
        self.validate_required(self.select_options, 'select_options')
        if self.select_options:
            for k in self.select_options:
                if k:
                    k.validate()
        self.validate_required(self.forget_meta, 'forget_meta')
        if self.forget_meta:
            self.forget_meta.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        if self.label is not None:
            result['label'] = self.label
        if self.input_type is not None:
            result['input_type'] = self.input_type
        if self.initial_value is not None:
            result['initial_value'] = self.initial_value
        if self.placeholder is not None:
            result['placeholder'] = self.placeholder
        if self.disabled is not None:
            result['disabled'] = self.disabled
        if self.read_only is not None:
            result['read_only'] = self.read_only
        if self.tooltip is not None:
            result['tooltip'] = self.tooltip
        result['rules'] = []
        if self.rules is not None:
            for k in self.rules:
                result['rules'].append(k.to_map() if k else None)
        result['logics'] = []
        if self.logics is not None:
            for k in self.logics:
                result['logics'].append(k.to_map() if k else None)
        result['select_options'] = []
        if self.select_options is not None:
            for k in self.select_options:
                result['select_options'].append(k.to_map() if k else None)
        if self.forget_meta is not None:
            result['forget_meta'] = self.forget_meta.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('label') is not None:
            self.label = m.get('label')
        if m.get('input_type') is not None:
            self.input_type = m.get('input_type')
        if m.get('initial_value') is not None:
            self.initial_value = m.get('initial_value')
        if m.get('placeholder') is not None:
            self.placeholder = m.get('placeholder')
        if m.get('disabled') is not None:
            self.disabled = m.get('disabled')
        if m.get('read_only') is not None:
            self.read_only = m.get('read_only')
        if m.get('tooltip') is not None:
            self.tooltip = m.get('tooltip')
        self.rules = []
        if m.get('rules') is not None:
            for k in m.get('rules'):
                temp_model = Rule()
                self.rules.append(temp_model.from_map(k))
        self.logics = []
        if m.get('logics') is not None:
            for k in m.get('logics'):
                temp_model = Logic()
                self.logics.append(temp_model.from_map(k))
        self.select_options = []
        if m.get('select_options') is not None:
            for k in m.get('select_options'):
                temp_model = SelectOption()
                self.select_options.append(temp_model.from_map(k))
        if m.get('forget_meta') is not None:
            temp_model = ForgetMeta()
            self.forget_meta = temp_model.from_map(m['forget_meta'])
        return self


class Pair(TeaModel):
    def __init__(
        self,
        left: str = None,
        right: Key = None,
    ):
        # left
        self.left = left
        # right
        self.right = right

    def validate(self):
        self.validate_required(self.left, 'left')
        self.validate_required(self.right, 'right')
        if self.right:
            self.right.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.left is not None:
            result['left'] = self.left
        if self.right is not None:
            result['right'] = self.right.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('left') is not None:
            self.left = m.get('left')
        if m.get('right') is not None:
            temp_model = Key()
            self.right = temp_model.from_map(m['right'])
        return self


class AgreementFile(TeaModel):
    def __init__(
        self,
        file_name: str = None,
        file_content_base_64string: str = None,
    ):
        # 授权文件名称
        self.file_name = file_name
        # 授权文件内容
        self.file_content_base_64string = file_content_base_64string

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_content_base_64string, 'file_content_base_64string')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_content_base_64string is not None:
            result['file_content_base64_string'] = self.file_content_base_64string
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_content_base64_string') is not None:
            self.file_content_base_64string = m.get('file_content_base64_string')
        return self


class DistrictExtRequest(TeaModel):
    def __init__(
        self,
        city_code: str = None,
    ):
        # 地区编码
        self.city_code = city_code

    def validate(self):
        self.validate_required(self.city_code, 'city_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.city_code is not None:
            result['city_code'] = self.city_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        return self


class Card(TeaModel):
    def __init__(
        self,
        name: str = None,
        tab_show_name: str = None,
        key_values: Pair = None,
        is_selected: str = None,
        return_value_key: List[str] = None,
    ):
        # 名称（该页面的名称，可能做展示用）
        self.name = name
        # 如果一层有多个卡片，那么这个名称就作为tab的头名称展示
        self.tab_show_name = tab_show_name
        # 当前模版所有需要填充元素
        self.key_values = key_values
        # true：是，false：不是
        # 是否作同一个父节点的默认展示，比如验证码和密码默认是哪个
        self.is_selected = is_selected
        # 备注：如果显示是这两个，代表返回的值得分别塞到这两个key对应的value中/\
        self.return_value_key = return_value_key

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.tab_show_name, 'tab_show_name')
        self.validate_required(self.key_values, 'key_values')
        if self.key_values:
            self.key_values.validate()
        self.validate_required(self.is_selected, 'is_selected')
        self.validate_required(self.return_value_key, 'return_value_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.tab_show_name is not None:
            result['tab_show_name'] = self.tab_show_name
        if self.key_values is not None:
            result['key_values'] = self.key_values.to_map()
        if self.is_selected is not None:
            result['is_selected'] = self.is_selected
        if self.return_value_key is not None:
            result['return_value_key'] = self.return_value_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('tab_show_name') is not None:
            self.tab_show_name = m.get('tab_show_name')
        if m.get('key_values') is not None:
            temp_model = Pair()
            self.key_values = temp_model.from_map(m['key_values'])
        if m.get('is_selected') is not None:
            self.is_selected = m.get('is_selected')
        if m.get('return_value_key') is not None:
            self.return_value_key = m.get('return_value_key')
        return self


class AgreementExtRequest(TeaModel):
    def __init__(
        self,
        type: str = None,
        is_seal: str = None,
        address: str = None,
        agreement_file_list: AgreementFile = None,
    ):
        # 证书类型
        self.type = type
        # 是否盖章，true：是 false：否
        self.is_seal = is_seal
        # 地址
        self.address = address
        # 授权文件信息
        self.agreement_file_list = agreement_file_list

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.is_seal, 'is_seal')
        self.validate_required(self.address, 'address')
        if self.agreement_file_list:
            self.agreement_file_list.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.is_seal is not None:
            result['is_seal'] = self.is_seal
        if self.address is not None:
            result['address'] = self.address
        if self.agreement_file_list is not None:
            result['agreement_file_list'] = self.agreement_file_list.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('is_seal') is not None:
            self.is_seal = m.get('is_seal')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('agreement_file_list') is not None:
            temp_model = AgreementFile()
            self.agreement_file_list = temp_model.from_map(m['agreement_file_list'])
        return self


class TreeNode(TeaModel):
    def __init__(
        self,
        id: int = None,
        parent_node_id: str = None,
        depth: int = None,
        is_leef_node: str = None,
        card: Card = None,
    ):
        # 节点id，按树的前序排列
        self.id = id
        # 父节点id，不存在为null
        self.parent_node_id = parent_node_id
        # 深度
        self.depth = depth
        # 是否叶子结点
        self.is_leef_node = is_leef_node
        # 模版
        self.card = card

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.parent_node_id, 'parent_node_id')
        self.validate_required(self.depth, 'depth')
        self.validate_required(self.is_leef_node, 'is_leef_node')
        self.validate_required(self.card, 'card')
        if self.card:
            self.card.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.parent_node_id is not None:
            result['parent_node_id'] = self.parent_node_id
        if self.depth is not None:
            result['depth'] = self.depth
        if self.is_leef_node is not None:
            result['is_leef_node'] = self.is_leef_node
        if self.card is not None:
            result['card'] = self.card.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('parent_node_id') is not None:
            self.parent_node_id = m.get('parent_node_id')
        if m.get('depth') is not None:
            self.depth = m.get('depth')
        if m.get('is_leef_node') is not None:
            self.is_leef_node = m.get('is_leef_node')
        if m.get('card') is not None:
            temp_model = Card()
            self.card = temp_model.from_map(m['card'])
        return self


class InvoiceItem(TeaModel):
    def __init__(
        self,
        spbm: str = None,
        mc: str = None,
        jldw: str = None,
        shul: str = None,
        je: str = None,
        sl: str = None,
        se: str = None,
        mxxh: str = None,
        dj: str = None,
        ggxh: str = None,
    ):
        # 税收分类编码
        self.spbm = spbm
        # 项目名称, 如果为折扣行，商品名称须与被折扣行的商品名称相同，不能多行折扣。
        self.mc = mc
        # 单位
        self.jldw = jldw
        # 数量
        self.shul = shul
        # 含税金额,2位小数
        self.je = je
        # 税率,当fplx!=51or53时，必填,3位小数，例1%为0.010；
        self.sl = sl
        # 税额,当fplx!=51or53时，必填
        self.se = se
        # 明细序号,从1开始递增
        self.mxxh = mxxh
        # 单价
        self.dj = dj
        # 规格型号
        self.ggxh = ggxh

    def validate(self):
        self.validate_required(self.spbm, 'spbm')
        self.validate_required(self.mc, 'mc')
        self.validate_required(self.je, 'je')
        self.validate_required(self.mxxh, 'mxxh')
        self.validate_required(self.dj, 'dj')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.spbm is not None:
            result['spbm'] = self.spbm
        if self.mc is not None:
            result['mc'] = self.mc
        if self.jldw is not None:
            result['jldw'] = self.jldw
        if self.shul is not None:
            result['shul'] = self.shul
        if self.je is not None:
            result['je'] = self.je
        if self.sl is not None:
            result['sl'] = self.sl
        if self.se is not None:
            result['se'] = self.se
        if self.mxxh is not None:
            result['mxxh'] = self.mxxh
        if self.dj is not None:
            result['dj'] = self.dj
        if self.ggxh is not None:
            result['ggxh'] = self.ggxh
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spbm') is not None:
            self.spbm = m.get('spbm')
        if m.get('mc') is not None:
            self.mc = m.get('mc')
        if m.get('jldw') is not None:
            self.jldw = m.get('jldw')
        if m.get('shul') is not None:
            self.shul = m.get('shul')
        if m.get('je') is not None:
            self.je = m.get('je')
        if m.get('sl') is not None:
            self.sl = m.get('sl')
        if m.get('se') is not None:
            self.se = m.get('se')
        if m.get('mxxh') is not None:
            self.mxxh = m.get('mxxh')
        if m.get('dj') is not None:
            self.dj = m.get('dj')
        if m.get('ggxh') is not None:
            self.ggxh = m.get('ggxh')
        return self


class StandardAuthExtendInfoRequest(TeaModel):
    def __init__(
        self,
        agreement_list: List[AgreementExtRequest] = None,
        districtext_request: DistrictExtRequest = None,
    ):
        # 协议列表
        self.agreement_list = agreement_list
        # 地区请求
        self.districtext_request = districtext_request

    def validate(self):
        self.validate_required(self.agreement_list, 'agreement_list')
        if self.agreement_list:
            for k in self.agreement_list:
                if k:
                    k.validate()
        self.validate_required(self.districtext_request, 'districtext_request')
        if self.districtext_request:
            self.districtext_request.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['agreement_list'] = []
        if self.agreement_list is not None:
            for k in self.agreement_list:
                result['agreement_list'].append(k.to_map() if k else None)
        if self.districtext_request is not None:
            result['districtext_request'] = self.districtext_request.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.agreement_list = []
        if m.get('agreement_list') is not None:
            for k in m.get('agreement_list'):
                temp_model = AgreementExtRequest()
                self.agreement_list.append(temp_model.from_map(k))
        if m.get('districtext_request') is not None:
            temp_model = DistrictExtRequest()
            self.districtext_request = temp_model.from_map(m['districtext_request'])
        return self


class ReturnDetail(TeaModel):
    def __init__(
        self,
        biz_content: str = None,
        return_type: str = None,
        file_urls: List[str] = None,
        file_type: str = None,
        encrypt_model: str = None,
        secret_envelope: str = None,
    ):
        # 结果对象内容
        self.biz_content = biz_content
        # 返回形式
        self.return_type = return_type
        # 文件列表
        self.file_urls = file_urls
        # 文件类型
        self.file_type = file_type
        # 加密模式
        self.encrypt_model = encrypt_model
        # 密钥信封
        self.secret_envelope = secret_envelope

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.return_type, 'return_type')
        self.validate_required(self.file_urls, 'file_urls')
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.encrypt_model, 'encrypt_model')
        self.validate_required(self.secret_envelope, 'secret_envelope')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.return_type is not None:
            result['return_type'] = self.return_type
        if self.file_urls is not None:
            result['file_urls'] = self.file_urls
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.encrypt_model is not None:
            result['encrypt_model'] = self.encrypt_model
        if self.secret_envelope is not None:
            result['secret_envelope'] = self.secret_envelope
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('return_type') is not None:
            self.return_type = m.get('return_type')
        if m.get('file_urls') is not None:
            self.file_urls = m.get('file_urls')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('encrypt_model') is not None:
            self.encrypt_model = m.get('encrypt_model')
        if m.get('secret_envelope') is not None:
            self.secret_envelope = m.get('secret_envelope')
        return self


class QrCodeValue(TeaModel):
    def __init__(
        self,
        qr_code_url: str = None,
        desc: str = None,
        timeout: int = None,
    ):
        # 二维码链接
        self.qr_code_url = qr_code_url
        # 二维码描述信息。例如：请使用 xxx app 扫码登录
        self.desc = desc
        # 二维码在多长时间后失效，单位：秒
        self.timeout = timeout

    def validate(self):
        self.validate_required(self.qr_code_url, 'qr_code_url')
        self.validate_required(self.desc, 'desc')
        self.validate_required(self.timeout, 'timeout')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.qr_code_url is not None:
            result['qr_code_url'] = self.qr_code_url
        if self.desc is not None:
            result['desc'] = self.desc
        if self.timeout is not None:
            result['timeout'] = self.timeout
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('qr_code_url') is not None:
            self.qr_code_url = m.get('qr_code_url')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('timeout') is not None:
            self.timeout = m.get('timeout')
        return self


class TreeTemplate(TeaModel):
    def __init__(
        self,
        tree_node: TreeNode = None,
        id: str = None,
        version: str = None,
        compatible_min_version: str = None,
    ):
        # 树节点
        self.tree_node = tree_node
        # Id
        self.id = id
        # 版本号
        self.version = version
        # 向上兼容的最小版本号
        self.compatible_min_version = compatible_min_version

    def validate(self):
        self.validate_required(self.tree_node, 'tree_node')
        if self.tree_node:
            self.tree_node.validate()
        self.validate_required(self.id, 'id')
        self.validate_required(self.version, 'version')
        self.validate_required(self.compatible_min_version, 'compatible_min_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tree_node is not None:
            result['tree_node'] = self.tree_node.to_map()
        if self.id is not None:
            result['id'] = self.id
        if self.version is not None:
            result['version'] = self.version
        if self.compatible_min_version is not None:
            result['compatible_min_version'] = self.compatible_min_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tree_node') is not None:
            temp_model = TreeNode()
            self.tree_node = temp_model.from_map(m['tree_node'])
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('compatible_min_version') is not None:
            self.compatible_min_version = m.get('compatible_min_version')
        return self


class BaseAuthRequest(TeaModel):
    def __init__(
        self,
        inst_code: str = None,
        auth_type: str = None,
        order_no: str = None,
        extend_info: StandardAuthExtendInfoRequest = None,
    ):
        # 租户号
        self.inst_code = inst_code
        # 授权类型
        self.auth_type = auth_type
        # xdsadsfsdf
        self.order_no = order_no
        # 扩展信息
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.inst_code, 'inst_code')
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.extend_info, 'extend_info')
        if self.extend_info:
            self.extend_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.inst_code is not None:
            result['inst_code'] = self.inst_code
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('inst_code') is not None:
            self.inst_code = m.get('inst_code')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('extend_info') is not None:
            temp_model = StandardAuthExtendInfoRequest()
            self.extend_info = temp_model.from_map(m['extend_info'])
        return self


class Invoice(TeaModel):
    def __init__(
        self,
        bz: str = None,
        fhr: str = None,
        fpdm: str = None,
        fphm: str = None,
        fplx: str = None,
        fpxxmxs: List[InvoiceItem] = None,
        fpztdm: str = None,
        gfdzdh: str = None,
        gfmc: str = None,
        gfsh: str = None,
        gfyhzh: str = None,
        gmflx: str = None,
        je: str = None,
        jshj: str = None,
        kplx: str = None,
        kpr: str = None,
        kprq: str = None,
        qdbz: str = None,
        rzdklbdjgdm: str = None,
        rzdklbdrq: str = None,
        se: str = None,
        skr: str = None,
        slbz: str = None,
        ssdq: str = None,
        xfdzdh: str = None,
        xfmc: str = None,
        xfsh: str = None,
        xfyhzh: str = None,
        yfpdm: str = None,
        yfphm: str = None,
        zfbz: str = None,
        zfsj: str = None,
        ext_filed: str = None,
    ):
        # 备注
        self.bz = bz
        # 复核人
        self.fhr = fhr
        # 发票代码, 发票代码+发票号码唯一
        self.fpdm = fpdm
        # 发票号码,发票代码+发票号码唯一
        self.fphm = fphm
        # 发票类型代码,
        # 默认填:20:广东电子普通发票
        # 01：增值税专用发票
        # 04：增值税普通发票
        # 10：增值税电子普通发票
        # 51：重庆通用机打一联发票76
        # 53：重庆通用机打三联发票210
        # 90：重庆通用机打三联发票190
        self.fplx = fplx
        # 发票明细集合
        self.fpxxmxs = fpxxmxs
        # 发票状态代码,0 正常 1 失控 2 作废 3 红字 4 异常票
        self.fpztdm = fpztdm
        # 购买方地址、电话
        self.gfdzdh = gfdzdh
        # 购买方名称
        self.gfmc = gfmc
        # 购买方纳税人识别号
        self.gfsh = gfsh
        # 购买方银行账号
        self.gfyhzh = gfyhzh
        # 购买方类型,1企业 2个人 3其他
        self.gmflx = gmflx
        # 金额
        self.je = je
        # 价税合计	， 单位：元（2 位小数）
        self.jshj = jshj
        # 开票类型,0-蓝字发票；1-红字发票；
        self.kplx = kplx
        # 开票人
        self.kpr = kpr
        # 开票日期
        self.kprq = kprq
        # 清单标志,00:无清单 01:有清单
        self.qdbz = qdbz
        # 认证状态
        self.rzdklbdjgdm = rzdklbdjgdm
        # 认证日期
        self.rzdklbdrq = rzdklbdrq
        # 税额,当发票类型代码	 fplx!=51or fplx!=53时，必填
        self.se = se
        # 收款人
        self.skr = skr
        # 税率标识,0不含税税率；1含税税率
        self.slbz = slbz
        # 所属税务机关代码:
        # 山东省343
        # 重庆市350
        # 广东省347
        self.ssdq = ssdq
        # 销售方地址、电话
        self.xfdzdh = xfdzdh
        # 销售方名称
        self.xfmc = xfmc
        # 销售方纳税人识别号
        self.xfsh = xfsh
        # 销售方银行账号
        self.xfyhzh = xfyhzh
        # 原发票代码, kplx开票类型为1时必填
        self.yfpdm = yfpdm
        # 原发票号码,kplx开票类型为1时必填
        self.yfphm = yfphm
        # 作废标志,0:未作废，1作废
        self.zfbz = zfbz
        # 作废时间
        self.zfsj = zfsj
        # 扩展字段
        self.ext_filed = ext_filed

    def validate(self):
        self.validate_required(self.fpdm, 'fpdm')
        self.validate_required(self.fphm, 'fphm')
        self.validate_required(self.fplx, 'fplx')
        if self.fpxxmxs:
            for k in self.fpxxmxs:
                if k:
                    k.validate()
        self.validate_required(self.fpztdm, 'fpztdm')
        self.validate_required(self.gfmc, 'gfmc')
        self.validate_required(self.je, 'je')
        self.validate_required(self.jshj, 'jshj')
        self.validate_required(self.kplx, 'kplx')
        self.validate_required(self.kpr, 'kpr')
        self.validate_required(self.kprq, 'kprq')
        if self.kprq is not None:
            self.validate_pattern(self.kprq, 'kprq', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.rzdklbdrq is not None:
            self.validate_pattern(self.rzdklbdrq, 'rzdklbdrq', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.slbz, 'slbz')
        self.validate_required(self.ssdq, 'ssdq')
        self.validate_required(self.xfmc, 'xfmc')
        self.validate_required(self.xfsh, 'xfsh')
        self.validate_required(self.zfbz, 'zfbz')
        if self.zfsj is not None:
            self.validate_pattern(self.zfsj, 'zfsj', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.ext_filed, 'ext_filed')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bz is not None:
            result['bz'] = self.bz
        if self.fhr is not None:
            result['fhr'] = self.fhr
        if self.fpdm is not None:
            result['fpdm'] = self.fpdm
        if self.fphm is not None:
            result['fphm'] = self.fphm
        if self.fplx is not None:
            result['fplx'] = self.fplx
        result['fpxxmxs'] = []
        if self.fpxxmxs is not None:
            for k in self.fpxxmxs:
                result['fpxxmxs'].append(k.to_map() if k else None)
        if self.fpztdm is not None:
            result['fpztdm'] = self.fpztdm
        if self.gfdzdh is not None:
            result['gfdzdh'] = self.gfdzdh
        if self.gfmc is not None:
            result['gfmc'] = self.gfmc
        if self.gfsh is not None:
            result['gfsh'] = self.gfsh
        if self.gfyhzh is not None:
            result['gfyhzh'] = self.gfyhzh
        if self.gmflx is not None:
            result['gmflx'] = self.gmflx
        if self.je is not None:
            result['je'] = self.je
        if self.jshj is not None:
            result['jshj'] = self.jshj
        if self.kplx is not None:
            result['kplx'] = self.kplx
        if self.kpr is not None:
            result['kpr'] = self.kpr
        if self.kprq is not None:
            result['kprq'] = self.kprq
        if self.qdbz is not None:
            result['qdbz'] = self.qdbz
        if self.rzdklbdjgdm is not None:
            result['rzdklbdjgdm'] = self.rzdklbdjgdm
        if self.rzdklbdrq is not None:
            result['rzdklbdrq'] = self.rzdklbdrq
        if self.se is not None:
            result['se'] = self.se
        if self.skr is not None:
            result['skr'] = self.skr
        if self.slbz is not None:
            result['slbz'] = self.slbz
        if self.ssdq is not None:
            result['ssdq'] = self.ssdq
        if self.xfdzdh is not None:
            result['xfdzdh'] = self.xfdzdh
        if self.xfmc is not None:
            result['xfmc'] = self.xfmc
        if self.xfsh is not None:
            result['xfsh'] = self.xfsh
        if self.xfyhzh is not None:
            result['xfyhzh'] = self.xfyhzh
        if self.yfpdm is not None:
            result['yfpdm'] = self.yfpdm
        if self.yfphm is not None:
            result['yfphm'] = self.yfphm
        if self.zfbz is not None:
            result['zfbz'] = self.zfbz
        if self.zfsj is not None:
            result['zfsj'] = self.zfsj
        if self.ext_filed is not None:
            result['ext_filed'] = self.ext_filed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bz') is not None:
            self.bz = m.get('bz')
        if m.get('fhr') is not None:
            self.fhr = m.get('fhr')
        if m.get('fpdm') is not None:
            self.fpdm = m.get('fpdm')
        if m.get('fphm') is not None:
            self.fphm = m.get('fphm')
        if m.get('fplx') is not None:
            self.fplx = m.get('fplx')
        self.fpxxmxs = []
        if m.get('fpxxmxs') is not None:
            for k in m.get('fpxxmxs'):
                temp_model = InvoiceItem()
                self.fpxxmxs.append(temp_model.from_map(k))
        if m.get('fpztdm') is not None:
            self.fpztdm = m.get('fpztdm')
        if m.get('gfdzdh') is not None:
            self.gfdzdh = m.get('gfdzdh')
        if m.get('gfmc') is not None:
            self.gfmc = m.get('gfmc')
        if m.get('gfsh') is not None:
            self.gfsh = m.get('gfsh')
        if m.get('gfyhzh') is not None:
            self.gfyhzh = m.get('gfyhzh')
        if m.get('gmflx') is not None:
            self.gmflx = m.get('gmflx')
        if m.get('je') is not None:
            self.je = m.get('je')
        if m.get('jshj') is not None:
            self.jshj = m.get('jshj')
        if m.get('kplx') is not None:
            self.kplx = m.get('kplx')
        if m.get('kpr') is not None:
            self.kpr = m.get('kpr')
        if m.get('kprq') is not None:
            self.kprq = m.get('kprq')
        if m.get('qdbz') is not None:
            self.qdbz = m.get('qdbz')
        if m.get('rzdklbdjgdm') is not None:
            self.rzdklbdjgdm = m.get('rzdklbdjgdm')
        if m.get('rzdklbdrq') is not None:
            self.rzdklbdrq = m.get('rzdklbdrq')
        if m.get('se') is not None:
            self.se = m.get('se')
        if m.get('skr') is not None:
            self.skr = m.get('skr')
        if m.get('slbz') is not None:
            self.slbz = m.get('slbz')
        if m.get('ssdq') is not None:
            self.ssdq = m.get('ssdq')
        if m.get('xfdzdh') is not None:
            self.xfdzdh = m.get('xfdzdh')
        if m.get('xfmc') is not None:
            self.xfmc = m.get('xfmc')
        if m.get('xfsh') is not None:
            self.xfsh = m.get('xfsh')
        if m.get('xfyhzh') is not None:
            self.xfyhzh = m.get('xfyhzh')
        if m.get('yfpdm') is not None:
            self.yfpdm = m.get('yfpdm')
        if m.get('yfphm') is not None:
            self.yfphm = m.get('yfphm')
        if m.get('zfbz') is not None:
            self.zfbz = m.get('zfbz')
        if m.get('zfsj') is not None:
            self.zfsj = m.get('zfsj')
        if m.get('ext_filed') is not None:
            self.ext_filed = m.get('ext_filed')
        return self


class StandardRealPersonAuthRequest(TeaModel):
    def __init__(
        self,
        identity_id: str = None,
        identity_name: str = None,
    ):
        # 个人证件号
        self.identity_id = identity_id
        # 名字
        self.identity_name = identity_name

    def validate(self):
        self.validate_required(self.identity_id, 'identity_id')
        self.validate_required(self.identity_name, 'identity_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        if self.identity_name is not None:
            result['identity_name'] = self.identity_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        if m.get('identity_name') is not None:
            self.identity_name = m.get('identity_name')
        return self


class AuthCorpRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        corp_address_phone_no: str = None,
        corp_bank_no: str = None,
        corp_name: str = None,
        corp_private_key: str = None,
        corp_tax_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业注册地址和电话号码
        self.corp_address_phone_no = corp_address_phone_no
        # 企业银行账号
        self.corp_bank_no = corp_bank_no
        # 填写公司名称
        self.corp_name = corp_name
        # 企业授权秘钥
        self.corp_private_key = corp_private_key
        # 企业纳税人识别号
        self.corp_tax_id = corp_tax_id

    def validate(self):
        self.validate_required(self.corp_address_phone_no, 'corp_address_phone_no')
        self.validate_required(self.corp_bank_no, 'corp_bank_no')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.corp_private_key, 'corp_private_key')
        self.validate_required(self.corp_tax_id, 'corp_tax_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.corp_address_phone_no is not None:
            result['corp_address_phone_no'] = self.corp_address_phone_no
        if self.corp_bank_no is not None:
            result['corp_bank_no'] = self.corp_bank_no
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.corp_private_key is not None:
            result['corp_private_key'] = self.corp_private_key
        if self.corp_tax_id is not None:
            result['corp_tax_id'] = self.corp_tax_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('corp_address_phone_no') is not None:
            self.corp_address_phone_no = m.get('corp_address_phone_no')
        if m.get('corp_bank_no') is not None:
            self.corp_bank_no = m.get('corp_bank_no')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('corp_private_key') is not None:
            self.corp_private_key = m.get('corp_private_key')
        if m.get('corp_tax_id') is not None:
            self.corp_tax_id = m.get('corp_tax_id')
        return self


class AuthCorpResponse(TeaModel):
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


class PushChargeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_tenant: str = None,
        biz_type: str = None,
        customer_id: str = None,
        system_code: str = None,
        task_request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户
        self.biz_tenant = biz_tenant
        # 平台分发,子业务类型，对应原来的authType.
        self.biz_type = biz_type
        # 用户ID，根据业务对主体定义决定，比如票据业务的纳税人识别号
        self.customer_id = customer_id
        # 系统编码,平台分发，定义枚举，全局用
        self.system_code = system_code
        # 请求id
        self.task_request_id = task_request_id

    def validate(self):
        self.validate_required(self.biz_tenant, 'biz_tenant')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.customer_id, 'customer_id')
        self.validate_required(self.system_code, 'system_code')
        self.validate_required(self.task_request_id, 'task_request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_tenant is not None:
            result['biz_tenant'] = self.biz_tenant
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.system_code is not None:
            result['system_code'] = self.system_code
        if self.task_request_id is not None:
            result['task_request_id'] = self.task_request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_tenant') is not None:
            self.biz_tenant = m.get('biz_tenant')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('system_code') is not None:
            self.system_code = m.get('system_code')
        if m.get('task_request_id') is not None:
            self.task_request_id = m.get('task_request_id')
        return self


class PushChargeResponse(TeaModel):
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


class QueryChargeAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_tenant: str = None,
        biz_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户
        self.biz_tenant = biz_tenant
        # 授权类型,业务类型
        self.biz_type = biz_type

    def validate(self):
        self.validate_required(self.biz_tenant, 'biz_tenant')
        self.validate_required(self.biz_type, 'biz_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_tenant is not None:
            result['biz_tenant'] = self.biz_tenant
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_tenant') is not None:
            self.biz_tenant = m.get('biz_tenant')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        return self


class QueryChargeAuthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # OPEN:开通
        # STOP：停止
        # NOT_SALE：未授权
        self.auth_type = auth_type

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
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        return self


class PushIcmInvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        pch: str = None,
        fpxx: str = None,
        fplx: str = None,
        islsp: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批次号
        self.pch = pch
        # 发票信息（json格式）
        self.fpxx = fpxx
        # 发票类型
        # 01：增值税专用发票
        # 04：增值税普通发票
        # 10：增值税电子普通发票
        self.fplx = fplx
        # 是否是历史数据推送
        self.islsp = islsp

    def validate(self):
        self.validate_required(self.pch, 'pch')
        self.validate_required(self.fpxx, 'fpxx')
        self.validate_required(self.fplx, 'fplx')
        self.validate_required(self.islsp, 'islsp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.pch is not None:
            result['pch'] = self.pch
        if self.fpxx is not None:
            result['fpxx'] = self.fpxx
        if self.fplx is not None:
            result['fplx'] = self.fplx
        if self.islsp is not None:
            result['islsp'] = self.islsp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('pch') is not None:
            self.pch = m.get('pch')
        if m.get('fpxx') is not None:
            self.fpxx = m.get('fpxx')
        if m.get('fplx') is not None:
            self.fplx = m.get('fplx')
        if m.get('islsp') is not None:
            self.islsp = m.get('islsp')
        return self


class PushIcmInvoiceResponse(TeaModel):
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


class QueryIcmInvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        auth_type: str = None,
        callback_url: str = None,
        end_amount: int = None,
        end_date: str = None,
        invoice_type: str = None,
        nsrsbh: str = None,
        request_id: str = None,
        start_amount: int = None,
        start_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ISV名称，用于标识合作的企业
        self.app_id = app_id
        # 授权类型
        # 01:发票归集授权; 02:记账; 03:报销; 11:发票贷授权; （0X发票相关授权，1X金融类授权）
        self.auth_type = auth_type
        # 数据通知地址接口 (当type=02或者03时必填) 用于数据采集完毕后通知该接口如何取发票数据
        # 
        self.callback_url = callback_url
        # java long型
        # 起始金额，当type=03（报销查询）时必填
        self.end_amount = end_amount
        # 查询起始时间(当auth_type=02或者03时必填)
        # 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
        # 最大查询范围为6.1-6.30
        self.end_date = end_date
        # 非必填，不填则查询所有类型发票
        # "01": "增值税专用发票"
        # "04": "增值税普通发票"
        # "10": "增值税电子普通发票"
        self.invoice_type = invoice_type
        # 查询的企业纳税人识别号
        self.nsrsbh = nsrsbh
        # 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
        self.request_id = request_id
        # java long型
        # 起始金额，当type=03（报销查询）时必填
        self.start_amount = start_amount
        # 查询起始时间(当auth_type=02或者03时必填)
        # 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
        # 最大查询范围为6.1-6.30
        self.start_date = start_date

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.auth_type, 'auth_type')
        if self.end_date is not None:
            self.validate_pattern(self.end_date, 'end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.nsrsbh, 'nsrsbh')
        self.validate_required(self.request_id, 'request_id')
        if self.start_date is not None:
            self.validate_pattern(self.start_date, 'start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.end_amount is not None:
            result['end_amount'] = self.end_amount
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.nsrsbh is not None:
            result['nsrsbh'] = self.nsrsbh
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.start_amount is not None:
            result['start_amount'] = self.start_amount
        if self.start_date is not None:
            result['start_date'] = self.start_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('end_amount') is not None:
            self.end_amount = m.get('end_amount')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('nsrsbh') is not None:
            self.nsrsbh = m.get('nsrsbh')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('start_amount') is not None:
            self.start_amount = m.get('start_amount')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        return self


class QueryIcmInvoiceResponse(TeaModel):
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


class PushIcmInvoiceinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        invoice: Invoice = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 上票ISV app_id即secret_id
        self.app_id = app_id
        # 发票号码
        self.invoice = invoice

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.invoice, 'invoice')
        if self.invoice:
            self.invoice.validate()

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
        if self.invoice is not None:
            result['invoice'] = self.invoice.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('invoice') is not None:
            temp_model = Invoice()
            self.invoice = temp_model.from_map(m['invoice'])
        return self


class PushIcmInvoiceinfoResponse(TeaModel):
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


class DescribeIcmInvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        xfsh: str = None,
        fpdm: str = None,
        fphm: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 发票销方税号
        self.xfsh = xfsh
        # 发票代码
        self.fpdm = fpdm
        # 发票号码
        self.fphm = fphm

    def validate(self):
        self.validate_required(self.xfsh, 'xfsh')
        if self.xfsh is not None:
            self.validate_max_length(self.xfsh, 'xfsh', 30)
        self.validate_required(self.fpdm, 'fpdm')
        if self.fpdm is not None:
            self.validate_max_length(self.fpdm, 'fpdm', 100)
        self.validate_required(self.fphm, 'fphm')
        if self.fphm is not None:
            self.validate_max_length(self.fphm, 'fphm', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.xfsh is not None:
            result['xfsh'] = self.xfsh
        if self.fpdm is not None:
            result['fpdm'] = self.fpdm
        if self.fphm is not None:
            result['fphm'] = self.fphm
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('xfsh') is not None:
            self.xfsh = m.get('xfsh')
        if m.get('fpdm') is not None:
            self.fpdm = m.get('fpdm')
        if m.get('fphm') is not None:
            self.fphm = m.get('fphm')
        return self


class DescribeIcmInvoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        txhash: str = None,
        block_number: str = None,
        timestamp: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易hash即txhash
        self.txhash = txhash
        # 交易块号
        self.block_number = block_number
        # 交易时间
        self.timestamp = timestamp

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
        if self.txhash is not None:
            result['txhash'] = self.txhash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('txhash') is not None:
            self.txhash = m.get('txhash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class AuthIcmInvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        nsrsbh: str = None,
        corp_name: str = None,
        identity_number: str = None,
        cognizant_mobile: str = None,
        cognizant_name: str = None,
        biz_context: str = None,
        auth_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
        self.request_id = request_id
        # 查询的企业纳税人识别号
        # 
        self.nsrsbh = nsrsbh
        # 企业名称
        self.corp_name = corp_name
        # 身份证号
        self.identity_number = identity_number
        # 已认证的法人手机号
        self.cognizant_mobile = cognizant_mobile
        # 已认证的法人姓名
        self.cognizant_name = cognizant_name
        # 透传字段
        self.biz_context = biz_context
        # 授权业务类型
        self.auth_type = auth_type

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.nsrsbh, 'nsrsbh')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.identity_number, 'identity_number')
        self.validate_required(self.cognizant_mobile, 'cognizant_mobile')
        self.validate_required(self.cognizant_name, 'cognizant_name')
        self.validate_required(self.auth_type, 'auth_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.nsrsbh is not None:
            result['nsrsbh'] = self.nsrsbh
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.identity_number is not None:
            result['identity_number'] = self.identity_number
        if self.cognizant_mobile is not None:
            result['cognizant_mobile'] = self.cognizant_mobile
        if self.cognizant_name is not None:
            result['cognizant_name'] = self.cognizant_name
        if self.biz_context is not None:
            result['biz_context'] = self.biz_context
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('nsrsbh') is not None:
            self.nsrsbh = m.get('nsrsbh')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('identity_number') is not None:
            self.identity_number = m.get('identity_number')
        if m.get('cognizant_mobile') is not None:
            self.cognizant_mobile = m.get('cognizant_mobile')
        if m.get('cognizant_name') is not None:
            self.cognizant_name = m.get('cognizant_name')
        if m.get('biz_context') is not None:
            self.biz_context = m.get('biz_context')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        return self


class AuthIcmInvoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: str = None,
        biz_context: str = None,
        nsrsbh: str = None,
        expired_time: str = None,
        request_id: str = None,
        error_code: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权是否成功：true：成功 false：失败
        self.success = success
        # 透传字段
        self.biz_context = biz_context
        # 纳税人识别号
        self.nsrsbh = nsrsbh
        # 过期时间
        self.expired_time = expired_time
        # 业务请求id
        self.request_id = request_id
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_msg = error_msg

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
        if self.biz_context is not None:
            result['biz_context'] = self.biz_context
        if self.nsrsbh is not None:
            result['nsrsbh'] = self.nsrsbh
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
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
        if m.get('biz_context') is not None:
            self.biz_context = m.get('biz_context')
        if m.get('nsrsbh') is not None:
            self.nsrsbh = m.get('nsrsbh')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class AuthIcmRealpersonRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request: BaseAuthRequest = None,
        identity_id: str = None,
        identity_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 基础授权请求
        self.request = request
        # 个人证件号
        self.identity_id = identity_id
        # 名字
        self.identity_name = identity_name

    def validate(self):
        self.validate_required(self.request, 'request')
        if self.request:
            self.request.validate()
        self.validate_required(self.identity_id, 'identity_id')
        self.validate_required(self.identity_name, 'identity_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request is not None:
            result['request'] = self.request.to_map()
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        if self.identity_name is not None:
            result['identity_name'] = self.identity_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request') is not None:
            temp_model = BaseAuthRequest()
            self.request = temp_model.from_map(m['request'])
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        if m.get('identity_name') is not None:
            self.identity_name = m.get('identity_name')
        return self


class AuthIcmRealpersonResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_success: bool = None,
        order_no: str = None,
        expire_time: str = None,
        auth_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否授权成功true是，false否
        self.auth_success = auth_success
        # 订单号
        self.order_no = order_no
        # 过期时间
        self.expire_time = expire_time
        # 授权时间 unix时间戳
        self.auth_time = auth_time

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
        if self.auth_success is not None:
            result['auth_success'] = self.auth_success
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.auth_time is not None:
            result['auth_time'] = self.auth_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_success') is not None:
            self.auth_success = m.get('auth_success')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('auth_time') is not None:
            self.auth_time = m.get('auth_time')
        return self


class ExecIcmSyncgatheringRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        inst_code: str = None,
        biz_request_id: str = None,
        identity_id: str = None,
        auth_type: str = None,
        order_no: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 机构号码
        self.inst_code = inst_code
        # 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
        self.biz_request_id = biz_request_id
        # 纳税人识别号(必填)
        self.identity_id = identity_id
        # 授权类型(必填)
        self.auth_type = auth_type
        # 订单号
        self.order_no = order_no
        # 补充内容,如果不动产中字段为空的话查的就是授权中的cityCode
        self.content = content

    def validate(self):
        self.validate_required(self.inst_code, 'inst_code')
        self.validate_required(self.biz_request_id, 'biz_request_id')
        self.validate_required(self.identity_id, 'identity_id')
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.inst_code is not None:
            result['inst_code'] = self.inst_code
        if self.biz_request_id is not None:
            result['biz_request_id'] = self.biz_request_id
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('inst_code') is not None:
            self.inst_code = m.get('inst_code')
        if m.get('biz_request_id') is not None:
            self.biz_request_id = m.get('biz_request_id')
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class ExecIcmSyncgatheringResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_content: str = None,
        query_time: str = None,
        return_mode: str = None,
        return_result: List[ReturnDetail] = None,
        null_data_flag: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回的请求对象jsonString
        self.biz_content = biz_content
        # unix秒时间戳,查询时间，用来对账使用
        self.query_time = query_time
        # 返回模式
        self.return_mode = return_mode
        # 返回结果
        self.return_result = return_result
        # 是否查得
        self.null_data_flag = null_data_flag

    def validate(self):
        if self.return_result:
            for k in self.return_result:
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
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.query_time is not None:
            result['query_time'] = self.query_time
        if self.return_mode is not None:
            result['return_mode'] = self.return_mode
        result['return_result'] = []
        if self.return_result is not None:
            for k in self.return_result:
                result['return_result'].append(k.to_map() if k else None)
        if self.null_data_flag is not None:
            result['null_data_flag'] = self.null_data_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('query_time') is not None:
            self.query_time = m.get('query_time')
        if m.get('return_mode') is not None:
            self.return_mode = m.get('return_mode')
        self.return_result = []
        if m.get('return_result') is not None:
            for k in m.get('return_result'):
                temp_model = ReturnDetail()
                self.return_result.append(temp_model.from_map(k))
        if m.get('null_data_flag') is not None:
            self.null_data_flag = m.get('null_data_flag')
        return self


class QueryApiAuthteplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        identity_id: str = None,
        identity_name: str = None,
        auth_type: str = None,
        cognizant_name: str = None,
        coidentity_number: str = None,
        cognizant_mobile: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务订单号
        self.order_no = order_no
        # 身份ID 身份证或者统一社会信用编码
        self.identity_id = identity_id
        # 名称
        self.identity_name = identity_name
        # 业务类型
        # 11 税
        # 12票
        # 13税+票
        self.auth_type = auth_type
        # 法人名称
        self.cognizant_name = cognizant_name
        # 法人证件号
        self.coidentity_number = coidentity_number
        # 法人手机号
        self.cognizant_mobile = cognizant_mobile

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.identity_id, 'identity_id')
        self.validate_required(self.identity_name, 'identity_name')
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.cognizant_name, 'cognizant_name')
        self.validate_required(self.coidentity_number, 'coidentity_number')
        self.validate_required(self.cognizant_mobile, 'cognizant_mobile')

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
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        if self.identity_name is not None:
            result['identity_name'] = self.identity_name
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.cognizant_name is not None:
            result['cognizant_name'] = self.cognizant_name
        if self.coidentity_number is not None:
            result['coidentity_number'] = self.coidentity_number
        if self.cognizant_mobile is not None:
            result['cognizant_mobile'] = self.cognizant_mobile
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        if m.get('identity_name') is not None:
            self.identity_name = m.get('identity_name')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('cognizant_name') is not None:
            self.cognizant_name = m.get('cognizant_name')
        if m.get('coidentity_number') is not None:
            self.coidentity_number = m.get('coidentity_number')
        if m.get('cognizant_mobile') is not None:
            self.cognizant_mobile = m.get('cognizant_mobile')
        return self


class QueryApiAuthteplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        token: str = None,
        expire_time: int = None,
        tree_template: TreeTemplate = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # JWT生成，设置失效时间，维持会话数据
        self.token = token
        # Unix时间戳 秒
        self.expire_time = expire_time
        # 模版树
        self.tree_template = tree_template

    def validate(self):
        if self.tree_template:
            self.tree_template.validate()

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
        if self.token is not None:
            result['token'] = self.token
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.tree_template is not None:
            result['tree_template'] = self.tree_template.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('tree_template') is not None:
            temp_model = TreeTemplate()
            self.tree_template = temp_model.from_map(m['tree_template'])
        return self


class ExecApiAuthtemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        token: str = None,
        tree_template_id: str = None,
        tree_version: str = None,
        node_id: str = None,
        pairs: Pair = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # token
        self.token = token
        # 树的模版id
        self.tree_template_id = tree_template_id
        # 模版对应的版本号
        self.tree_version = tree_version
        # 对应节点ID
        self.node_id = node_id
        # 当前卡片所有需要填充元素key
        # 和value值
        self.pairs = pairs

    def validate(self):
        self.validate_required(self.token, 'token')
        self.validate_required(self.tree_template_id, 'tree_template_id')
        self.validate_required(self.tree_version, 'tree_version')
        self.validate_required(self.node_id, 'node_id')
        self.validate_required(self.pairs, 'pairs')
        if self.pairs:
            self.pairs.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.token is not None:
            result['token'] = self.token
        if self.tree_template_id is not None:
            result['tree_template_id'] = self.tree_template_id
        if self.tree_version is not None:
            result['tree_version'] = self.tree_version
        if self.node_id is not None:
            result['node_id'] = self.node_id
        if self.pairs is not None:
            result['pairs'] = self.pairs.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('tree_template_id') is not None:
            self.tree_template_id = m.get('tree_template_id')
        if m.get('tree_version') is not None:
            self.tree_version = m.get('tree_version')
        if m.get('node_id') is not None:
            self.node_id = m.get('node_id')
        if m.get('pairs') is not None:
            temp_model = Pair()
            self.pairs = temp_model.from_map(m['pairs'])
        return self


class ExecApiAuthtemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        nodes: List[TreeNode] = None,
        tree_template_id: str = None,
        auth_state: str = None,
        success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回的下一层节点集合
        self.nodes = nodes
        # 树id
        self.tree_template_id = tree_template_id
        # 授权状态,提交接口此字段为空
        # 1、正在处理中
        # 2、登陆成功
        self.auth_state = auth_state
        # 请求是否成功
        # true 成功
        # false 失败
        self.success = success

    def validate(self):
        if self.nodes:
            for k in self.nodes:
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
        result['nodes'] = []
        if self.nodes is not None:
            for k in self.nodes:
                result['nodes'].append(k.to_map() if k else None)
        if self.tree_template_id is not None:
            result['tree_template_id'] = self.tree_template_id
        if self.auth_state is not None:
            result['auth_state'] = self.auth_state
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
        self.nodes = []
        if m.get('nodes') is not None:
            for k in m.get('nodes'):
                temp_model = TreeNode()
                self.nodes.append(temp_model.from_map(k))
        if m.get('tree_template_id') is not None:
            self.tree_template_id = m.get('tree_template_id')
        if m.get('auth_state') is not None:
            self.auth_state = m.get('auth_state')
        if m.get('success') is not None:
            self.success = m.get('success')
        return self


class QueryApiAuthtemplatedefineRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        token: str = None,
        action_type: str = None,
        depends_value: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # token
        self.token = token
        # message：短信
        # qrCode：二维码
        self.action_type = action_type
        # 依赖的数据值 比如身份证
        self.depends_value = depends_value

    def validate(self):
        self.validate_required(self.token, 'token')
        self.validate_required(self.action_type, 'action_type')
        self.validate_required(self.depends_value, 'depends_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.token is not None:
            result['token'] = self.token
        if self.action_type is not None:
            result['action_type'] = self.action_type
        if self.depends_value is not None:
            result['depends_value'] = self.depends_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        if m.get('depends_value') is not None:
            self.depends_value = m.get('depends_value')
        return self


class QueryApiAuthtemplatedefineResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        value: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 二维码类型返回二维码描述
        # 短信无返回，接口成功即可
        self.value = value

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
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class QueryApiAuthtemplateresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        identity_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务授权订单号 用户幂等控制，调用方保证唯一
        self.order_no = order_no
        # 身份ID
        self.identity_id = identity_id

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.identity_id, 'identity_id')

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
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        return self


class QueryApiAuthtemplateresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        auth_state: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.success = success
        # 授权状态
        # 1、正在处理中
        # 2、登陆成功
        self.auth_state = auth_state

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
        if self.auth_state is not None:
            result['auth_state'] = self.auth_state
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
        if m.get('auth_state') is not None:
            self.auth_state = m.get('auth_state')
        return self


class AuthIcmEnterpriseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        identity_id: str = None,
        identity_name: str = None,
        auth_type: str = None,
        order_no: str = None,
        extend_info: StandardAuthExtendInfoRequest = None,
        cognizant_name: str = None,
        cognizant_mobile: str = None,
        cognizant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 身份id，统一社会信用编码or其他
        self.identity_id = identity_id
        # 企业名称
        self.identity_name = identity_name
        # 授权类型，不动产100，电力200
        self.auth_type = auth_type
        # 授权订单号
        self.order_no = order_no
        # 扩展信息
        self.extend_info = extend_info
        # 法人姓名
        self.cognizant_name = cognizant_name
        # 法人手机号
        self.cognizant_mobile = cognizant_mobile
        # 法人身份证号
        self.cognizant_id = cognizant_id

    def validate(self):
        self.validate_required(self.identity_id, 'identity_id')
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.extend_info, 'extend_info')
        if self.extend_info:
            self.extend_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.identity_id is not None:
            result['identity_id'] = self.identity_id
        if self.identity_name is not None:
            result['identity_name'] = self.identity_name
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info.to_map()
        if self.cognizant_name is not None:
            result['cognizant_name'] = self.cognizant_name
        if self.cognizant_mobile is not None:
            result['cognizant_mobile'] = self.cognizant_mobile
        if self.cognizant_id is not None:
            result['cognizant_id'] = self.cognizant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('identity_id') is not None:
            self.identity_id = m.get('identity_id')
        if m.get('identity_name') is not None:
            self.identity_name = m.get('identity_name')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('extend_info') is not None:
            temp_model = StandardAuthExtendInfoRequest()
            self.extend_info = temp_model.from_map(m['extend_info'])
        if m.get('cognizant_name') is not None:
            self.cognizant_name = m.get('cognizant_name')
        if m.get('cognizant_mobile') is not None:
            self.cognizant_mobile = m.get('cognizant_mobile')
        if m.get('cognizant_id') is not None:
            self.cognizant_id = m.get('cognizant_id')
        return self


class AuthIcmEnterpriseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_success: bool = None,
        order_no: str = None,
        expire_time: int = None,
        auth_time: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否授权成功true是，false否
        # 
        self.auth_success = auth_success
        # 授权订单订单号
        # 
        self.order_no = order_no
        # 过期时间，unix时间戳 毫秒
        self.expire_time = expire_time
        # unix时间戳 毫秒
        self.auth_time = auth_time

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
        if self.auth_success is not None:
            result['auth_success'] = self.auth_success
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.expire_time is not None:
            result['expire_time'] = self.expire_time
        if self.auth_time is not None:
            result['auth_time'] = self.auth_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_success') is not None:
            self.auth_success = m.get('auth_success')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('expire_time') is not None:
            self.expire_time = m.get('expire_time')
        if m.get('auth_time') is not None:
            self.auth_time = m.get('auth_time')
        return self


class CreateApiAuthurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_type: str = None,
        nsrsbh: str = None,
        corp_name: str = None,
        call_back_url: str = None,
        cognizant_mobile: str = None,
        cognizant_name: str = None,
        identity_number: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 01发票归集授权 02记账 03报销 11发票贷授权（0X发票相关授权，1X金融类授权）
        self.auth_type = auth_type
        # 纳税人识别号
        self.nsrsbh = nsrsbh
        # 企业名称
        self.corp_name = corp_name
        # 授权回调地址，授权成功后，会跳转该地址，该地址填接入方自己的接收授权结果的地址
        self.call_back_url = call_back_url
        # 已认证的法人手机号
        self.cognizant_mobile = cognizant_mobile
        # 已认证的法人姓名
        self.cognizant_name = cognizant_name
        # 已认证的法人身份证号
        self.identity_number = identity_number

    def validate(self):
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.nsrsbh, 'nsrsbh')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.call_back_url, 'call_back_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.nsrsbh is not None:
            result['nsrsbh'] = self.nsrsbh
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.call_back_url is not None:
            result['call_back_url'] = self.call_back_url
        if self.cognizant_mobile is not None:
            result['cognizant_mobile'] = self.cognizant_mobile
        if self.cognizant_name is not None:
            result['cognizant_name'] = self.cognizant_name
        if self.identity_number is not None:
            result['identity_number'] = self.identity_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('nsrsbh') is not None:
            self.nsrsbh = m.get('nsrsbh')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('call_back_url') is not None:
            self.call_back_url = m.get('call_back_url')
        if m.get('cognizant_mobile') is not None:
            self.cognizant_mobile = m.get('cognizant_mobile')
        if m.get('cognizant_name') is not None:
            self.cognizant_name = m.get('cognizant_name')
        if m.get('identity_number') is not None:
            self.identity_number = m.get('identity_number')
        return self


class CreateApiAuthurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        login_url: str = None,
        order_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 短链接地址
        self.login_url = login_url
        # 蚂蚁生成的订单号，此次授权的唯一标识
        self.order_no = order_no

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
        if self.login_url is not None:
            result['login_url'] = self.login_url
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('login_url') is not None:
            self.login_url = m.get('login_url')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


