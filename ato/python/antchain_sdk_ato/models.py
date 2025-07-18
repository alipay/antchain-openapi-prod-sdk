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


class FileInfo(TeaModel):
    def __init__(
        self,
        file_name: str = None,
        file_key: str = None,
    ):
        # 文件名称
        self.file_name = file_name
        # 文件key
        self.file_key = file_key

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_key, 'file_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class ScalperQueryOrderItem(TeaModel):
    def __init__(
        self,
        order_items_name: str = None,
        order_items_quantity: int = None,
        order_items_price: int = None,
    ):
        # 订单商品名称
        self.order_items_name = order_items_name
        # 订单商品数量
        self.order_items_quantity = order_items_quantity
        # 订单商品价格，单位：分
        self.order_items_price = order_items_price

    def validate(self):
        if self.order_items_name is not None:
            self.validate_max_length(self.order_items_name, 'order_items_name', 256)
        if self.order_items_quantity is not None:
            self.validate_maximum(self.order_items_quantity, 'order_items_quantity', 100000)
            self.validate_minimum(self.order_items_quantity, 'order_items_quantity', 1)
        if self.order_items_price is not None:
            self.validate_maximum(self.order_items_price, 'order_items_price', 10000000)
            self.validate_minimum(self.order_items_price, 'order_items_price', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_items_name is not None:
            result['order_items_name'] = self.order_items_name
        if self.order_items_quantity is not None:
            result['order_items_quantity'] = self.order_items_quantity
        if self.order_items_price is not None:
            result['order_items_price'] = self.order_items_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_items_name') is not None:
            self.order_items_name = m.get('order_items_name')
        if m.get('order_items_quantity') is not None:
            self.order_items_quantity = m.get('order_items_quantity')
        if m.get('order_items_price') is not None:
            self.order_items_price = m.get('order_items_price')
        return self


class OperationDivideTransInDetailInfo(TeaModel):
    def __init__(
        self,
        trans_in_name: str = None,
        trans_in_user_id: str = None,
        divide_amount: int = None,
        desc: str = None,
        divide_status: str = None,
    ):
        # 分账收入方名称
        self.trans_in_name = trans_in_name
        # 分账收入方支付宝用户id, 支付宝2088id
        self.trans_in_user_id = trans_in_user_id
        # 分账金额，单位为分
        self.divide_amount = divide_amount
        # 分账描述
        self.desc = desc
        # INIT("INIT", "初始化"),
        # PROCESSING("PROCESSING", "处理中"),
        # FAILED("FAILED", "失败"),
        # SUCCESS("SUCCESS", "分账成功");
        self.divide_status = divide_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trans_in_name is not None:
            result['trans_in_name'] = self.trans_in_name
        if self.trans_in_user_id is not None:
            result['trans_in_user_id'] = self.trans_in_user_id
        if self.divide_amount is not None:
            result['divide_amount'] = self.divide_amount
        if self.desc is not None:
            result['desc'] = self.desc
        if self.divide_status is not None:
            result['divide_status'] = self.divide_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trans_in_name') is not None:
            self.trans_in_name = m.get('trans_in_name')
        if m.get('trans_in_user_id') is not None:
            self.trans_in_user_id = m.get('trans_in_user_id')
        if m.get('divide_amount') is not None:
            self.divide_amount = m.get('divide_amount')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('divide_status') is not None:
            self.divide_status = m.get('divide_status')
        return self


class SubRentRiskItem(TeaModel):
    def __init__(
        self,
        risk_name: str = None,
        risk_rank: str = None,
        risk_desc: str = None,
    ):
        # 风险名称。枚举值：BASE_PERFORMANCE - 基础履约风险；OVERDUE - 逾期风险；MULTI_RENT - 共租风险。
        self.risk_name = risk_name
        # 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险。
        self.risk_rank = risk_rank
        # 风险描述
        self.risk_desc = risk_desc

    def validate(self):
        self.validate_required(self.risk_name, 'risk_name')
        self.validate_required(self.risk_rank, 'risk_rank')
        self.validate_required(self.risk_desc, 'risk_desc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_name is not None:
            result['risk_name'] = self.risk_name
        if self.risk_rank is not None:
            result['risk_rank'] = self.risk_rank
        if self.risk_desc is not None:
            result['risk_desc'] = self.risk_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_name') is not None:
            self.risk_name = m.get('risk_name')
        if m.get('risk_rank') is not None:
            self.risk_rank = m.get('risk_rank')
        if m.get('risk_desc') is not None:
            self.risk_desc = m.get('risk_desc')
        return self


class OrderRepayStrategy(TeaModel):
    def __init__(
        self,
        term_index: int = None,
        rental_money: int = None,
        pay_day: str = None,
    ):
        # 还款期数
        self.term_index = term_index
        # 每期应还租金(分)
        self.rental_money = rental_money
        # 每期应付时间
        self.pay_day = pay_day

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.term_index is not None:
            result['term_index'] = self.term_index
        if self.rental_money is not None:
            result['rental_money'] = self.rental_money
        if self.pay_day is not None:
            result['pay_day'] = self.pay_day
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('term_index') is not None:
            self.term_index = m.get('term_index')
        if m.get('rental_money') is not None:
            self.rental_money = m.get('rental_money')
        if m.get('pay_day') is not None:
            self.pay_day = m.get('pay_day')
        return self


class StaticDataModuleDetail(TeaModel):
    def __init__(
        self,
        property_text: str = None,
        property_value: str = None,
        icon: str = None,
        grey_icon: str = None,
        children_detail_list: str = None,
        has_children: bool = None,
    ):
        # 描述
        self.property_text = property_text
        # 商户类型
        self.property_value = property_value
        # 图标
        self.icon = icon
        # 置灰图标
        self.grey_icon = grey_icon
        # 叶子结点，目前存的一级类目下的二级类目
        self.children_detail_list = children_detail_list
        # 是否有叶子结点
        self.has_children = has_children

    def validate(self):
        self.validate_required(self.property_text, 'property_text')
        self.validate_required(self.property_value, 'property_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.property_text is not None:
            result['property_text'] = self.property_text
        if self.property_value is not None:
            result['property_value'] = self.property_value
        if self.icon is not None:
            result['icon'] = self.icon
        if self.grey_icon is not None:
            result['grey_icon'] = self.grey_icon
        if self.children_detail_list is not None:
            result['children_detail_list'] = self.children_detail_list
        if self.has_children is not None:
            result['has_children'] = self.has_children
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('property_text') is not None:
            self.property_text = m.get('property_text')
        if m.get('property_value') is not None:
            self.property_value = m.get('property_value')
        if m.get('icon') is not None:
            self.icon = m.get('icon')
        if m.get('grey_icon') is not None:
            self.grey_icon = m.get('grey_icon')
        if m.get('children_detail_list') is not None:
            self.children_detail_list = m.get('children_detail_list')
        if m.get('has_children') is not None:
            self.has_children = m.get('has_children')
        return self


class SiteInfo(TeaModel):
    def __init__(
        self,
        tiny_app_id: str = None,
        site_name: str = None,
        screenshot_file: FileInfo = None,
        site_url: str = None,
        site_type: str = None,
    ):
        # 小程序id
        self.tiny_app_id = tiny_app_id
        # 站点名称
        self.site_name = site_name
        # 
        # 截图照片
        self.screenshot_file = screenshot_file
        # 站点地址
        self.site_url = site_url
        # 站点类型
        # 网站: 01
        # APP: 02
        # 服务窗: 03
        # 公众号: 04
        # 其他: 05
        # 支付宝小程序: 06
        # 手机网站/H5: 07
        self.site_type = site_type

    def validate(self):
        if self.screenshot_file:
            self.screenshot_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tiny_app_id is not None:
            result['tiny_app_id'] = self.tiny_app_id
        if self.site_name is not None:
            result['site_name'] = self.site_name
        if self.screenshot_file is not None:
            result['screenshot_file'] = self.screenshot_file.to_map()
        if self.site_url is not None:
            result['site_url'] = self.site_url
        if self.site_type is not None:
            result['site_type'] = self.site_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tiny_app_id') is not None:
            self.tiny_app_id = m.get('tiny_app_id')
        if m.get('site_name') is not None:
            self.site_name = m.get('site_name')
        if m.get('screenshot_file') is not None:
            temp_model = FileInfo()
            self.screenshot_file = temp_model.from_map(m['screenshot_file'])
        if m.get('site_url') is not None:
            self.site_url = m.get('site_url')
        if m.get('site_type') is not None:
            self.site_type = m.get('site_type')
        return self


class AppletRiskModel(TeaModel):
    def __init__(
        self,
        code: str = None,
        record_id: str = None,
        risk_rank: str = None,
        risk_name: str = None,
        risk_desc: str = None,
        flow_id: str = None,
        sub_risk_result_list: List[SubRentRiskItem] = None,
        error_msg: str = None,
    ):
        # 智租风控调用结果码，10000 表示调用成功。
        self.code = code
        # 风险咨询事件ID
        self.record_id = record_id
        # 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险
        self.risk_rank = risk_rank
        # 风险名称
        self.risk_name = risk_name
        # 风险等级中文描述
        self.risk_desc = risk_desc
        # 流程id
        self.flow_id = flow_id
        # 子风险结果列表
        self.sub_risk_result_list = sub_risk_result_list
        # 调用失败错误提示信息，仅调用失败时返回该字段信息。
        self.error_msg = error_msg

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.record_id, 'record_id')
        self.validate_required(self.risk_rank, 'risk_rank')
        self.validate_required(self.risk_name, 'risk_name')
        self.validate_required(self.risk_desc, 'risk_desc')
        self.validate_required(self.flow_id, 'flow_id')
        if self.sub_risk_result_list:
            for k in self.sub_risk_result_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.record_id is not None:
            result['record_id'] = self.record_id
        if self.risk_rank is not None:
            result['risk_rank'] = self.risk_rank
        if self.risk_name is not None:
            result['risk_name'] = self.risk_name
        if self.risk_desc is not None:
            result['risk_desc'] = self.risk_desc
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        result['sub_risk_result_list'] = []
        if self.sub_risk_result_list is not None:
            for k in self.sub_risk_result_list:
                result['sub_risk_result_list'].append(k.to_map() if k else None)
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('record_id') is not None:
            self.record_id = m.get('record_id')
        if m.get('risk_rank') is not None:
            self.risk_rank = m.get('risk_rank')
        if m.get('risk_name') is not None:
            self.risk_name = m.get('risk_name')
        if m.get('risk_desc') is not None:
            self.risk_desc = m.get('risk_desc')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        self.sub_risk_result_list = []
        if m.get('sub_risk_result_list') is not None:
            for k in m.get('sub_risk_result_list'):
                temp_model = SubRentRiskItem()
                self.sub_risk_result_list.append(temp_model.from_map(k))
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class ExpandProcessInfo(TeaModel):
    def __init__(
        self,
        process_node: str = None,
        is_submitted: bool = None,
        audit_status: str = None,
    ):
        # TENANT_INDIRECT_MAINCLASS(间联类目)
        # TENANT_ENDPOINT（回调地址）
        # CUSTOM_SERVICE_INFO（客服信息）
        # AGENTCUSTOMERPESONINFO（间联客诉人员）
        # MERCHANT_EXPAND（商户进件）
        self.process_node = process_node
        # 是否已提交
        self.is_submitted = is_submitted
        # 审核通过
        self.audit_status = audit_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.process_node is not None:
            result['process_node'] = self.process_node
        if self.is_submitted is not None:
            result['is_submitted'] = self.is_submitted
        if self.audit_status is not None:
            result['audit_status'] = self.audit_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('process_node') is not None:
            self.process_node = m.get('process_node')
        if m.get('is_submitted') is not None:
            self.is_submitted = m.get('is_submitted')
        if m.get('audit_status') is not None:
            self.audit_status = m.get('audit_status')
        return self


class DivideBindingTransInInfo(TeaModel):
    def __init__(
        self,
        alipay_pid: str = None,
    ):
        # 分账方支付宝pid
        self.alipay_pid = alipay_pid

    def validate(self):
        self.validate_required(self.alipay_pid, 'alipay_pid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.alipay_pid is not None:
            result['alipay_pid'] = self.alipay_pid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alipay_pid') is not None:
            self.alipay_pid = m.get('alipay_pid')
        return self


class InsureProductInfo(TeaModel):
    def __init__(
        self,
        product_id: str = None,
        product_imei_id: str = None,
        purchase_amount: int = None,
    ):
        # 商品库id
        self.product_id = product_id
        # 商品设备编号
        self.product_imei_id = product_imei_id
        # 商品采购价，单位：分
        self.purchase_amount = purchase_amount

    def validate(self):
        self.validate_required(self.product_id, 'product_id')
        if self.product_id is not None:
            self.validate_max_length(self.product_id, 'product_id', 128)
        self.validate_required(self.product_imei_id, 'product_imei_id')
        if self.product_imei_id is not None:
            self.validate_max_length(self.product_imei_id, 'product_imei_id', 256)
        self.validate_required(self.purchase_amount, 'purchase_amount')
        if self.purchase_amount is not None:
            self.validate_maximum(self.purchase_amount, 'purchase_amount', 100000000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.product_imei_id is not None:
            result['product_imei_id'] = self.product_imei_id
        if self.purchase_amount is not None:
            result['purchase_amount'] = self.purchase_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('product_imei_id') is not None:
            self.product_imei_id = m.get('product_imei_id')
        if m.get('purchase_amount') is not None:
            self.purchase_amount = m.get('purchase_amount')
        return self


class TemplateComponent(TeaModel):
    def __init__(
        self,
        template_code: str = None,
        id: str = None,
        name: str = None,
        uk: str = None,
        placeholder: str = None,
        enable_edit: str = None,
        required: str = None,
        type: str = None,
        value: str = None,
    ):
        # 模板编码
        self.template_code = template_code
        # 组件（文本域）id
        self.id = id
        # 组件（文本域）名称
        self.name = name
        # 组件（文本域）的唯一标识
        self.uk = uk
        # 占位符，组件（文本域）的展示样式值
        self.placeholder = placeholder
        # 组件（文本域）是否可以编辑。取值：Y/N
        self.enable_edit = enable_edit
        # 是否必填，取值：Y/N
        self.required = required
        # 组件（文本域）类型，INPUT:单行文本 TEXTAREA:多行文本
        self.type = type
        # 组件（文本域）值
        self.value = value

    def validate(self):
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.uk is not None:
            result['uk'] = self.uk
        if self.placeholder is not None:
            result['placeholder'] = self.placeholder
        if self.enable_edit is not None:
            result['enable_edit'] = self.enable_edit
        if self.required is not None:
            result['required'] = self.required
        if self.type is not None:
            result['type'] = self.type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('uk') is not None:
            self.uk = m.get('uk')
        if m.get('placeholder') is not None:
            self.placeholder = m.get('placeholder')
        if m.get('enable_edit') is not None:
            self.enable_edit = m.get('enable_edit')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class StaticData(TeaModel):
    def __init__(
        self,
        module_name: str = None,
        module_detail_list: List[StaticDataModuleDetail] = None,
    ):
        # 商户类型
        self.module_name = module_name
        # 静态数据详情
        self.module_detail_list = module_detail_list

    def validate(self):
        self.validate_required(self.module_name, 'module_name')
        self.validate_required(self.module_detail_list, 'module_detail_list')
        if self.module_detail_list:
            for k in self.module_detail_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.module_name is not None:
            result['module_name'] = self.module_name
        result['module_detail_list'] = []
        if self.module_detail_list is not None:
            for k in self.module_detail_list:
                result['module_detail_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('module_name') is not None:
            self.module_name = m.get('module_name')
        self.module_detail_list = []
        if m.get('module_detail_list') is not None:
            for k in m.get('module_detail_list'):
                temp_model = StaticDataModuleDetail()
                self.module_detail_list.append(temp_model.from_map(k))
        return self


class MerchantAgentPage(TeaModel):
    def __init__(
        self,
        pay_expand_id: str = None,
        agent_name: str = None,
        tenant_id: str = None,
        biz_type: str = None,
        pay_expand_status: str = None,
    ):
        # 进件id
        self.pay_expand_id = pay_expand_id
        # 
        # 代理企业名称
        self.agent_name = agent_name
        # 租户8位id
        self.tenant_id = tenant_id
        # 业务类型
        self.biz_type = biz_type
        # 进件审核状态 枚举
        self.pay_expand_status = pay_expand_status

    def validate(self):
        self.validate_required(self.pay_expand_id, 'pay_expand_id')
        self.validate_required(self.agent_name, 'agent_name')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.pay_expand_status, 'pay_expand_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.pay_expand_status is not None:
            result['pay_expand_status'] = self.pay_expand_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('pay_expand_status') is not None:
            self.pay_expand_status = m.get('pay_expand_status')
        return self


class OrderInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        order_create_time: str = None,
        order_pay_time: str = None,
        total_rent_money: int = None,
        rent_term: int = None,
        rent_unit: str = None,
        order_status: str = None,
        order_sub_status: str = None,
        deposit_price: int = None,
        buy_out_price: int = None,
        logistic_type: str = None,
        due_mode: int = None,
        down_payment: int = None,
    ):
        # 订单id
        self.order_id = order_id
        # 订单创建时间
        self.order_create_time = order_create_time
        # 订单支付时间
        self.order_pay_time = order_pay_time
        # 租金总额(分)
        self.total_rent_money = total_rent_money
        # 租期
        self.rent_term = rent_term
        # 租期单位
        self.rent_unit = rent_unit
        # 订单状态
        self.order_status = order_status
        # 订单子状态
        self.order_sub_status = order_sub_status
        # 免押金额（分）
        self.deposit_price = deposit_price
        # 到期买断价(分)
        self.buy_out_price = buy_out_price
        # 物流方案
        self.logistic_type = logistic_type
        # 到期形式
        # NA(0, "无意义"),
        # BUYOUT(1, "到期买断或归还"),
        # FREE_ON_RENT(2, "租满即送"),
        # RENEW_LEASE(3, "续租"),;
        self.due_mode = due_mode
        # 首付款金额(分)
        self.down_payment = down_payment

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_create_time is not None:
            result['order_create_time'] = self.order_create_time
        if self.order_pay_time is not None:
            result['order_pay_time'] = self.order_pay_time
        if self.total_rent_money is not None:
            result['total_rent_money'] = self.total_rent_money
        if self.rent_term is not None:
            result['rent_term'] = self.rent_term
        if self.rent_unit is not None:
            result['rent_unit'] = self.rent_unit
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.order_sub_status is not None:
            result['order_sub_status'] = self.order_sub_status
        if self.deposit_price is not None:
            result['deposit_price'] = self.deposit_price
        if self.buy_out_price is not None:
            result['buy_out_price'] = self.buy_out_price
        if self.logistic_type is not None:
            result['logistic_type'] = self.logistic_type
        if self.due_mode is not None:
            result['due_mode'] = self.due_mode
        if self.down_payment is not None:
            result['down_payment'] = self.down_payment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_create_time') is not None:
            self.order_create_time = m.get('order_create_time')
        if m.get('order_pay_time') is not None:
            self.order_pay_time = m.get('order_pay_time')
        if m.get('total_rent_money') is not None:
            self.total_rent_money = m.get('total_rent_money')
        if m.get('rent_term') is not None:
            self.rent_term = m.get('rent_term')
        if m.get('rent_unit') is not None:
            self.rent_unit = m.get('rent_unit')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('order_sub_status') is not None:
            self.order_sub_status = m.get('order_sub_status')
        if m.get('deposit_price') is not None:
            self.deposit_price = m.get('deposit_price')
        if m.get('buy_out_price') is not None:
            self.buy_out_price = m.get('buy_out_price')
        if m.get('logistic_type') is not None:
            self.logistic_type = m.get('logistic_type')
        if m.get('due_mode') is not None:
            self.due_mode = m.get('due_mode')
        if m.get('down_payment') is not None:
            self.down_payment = m.get('down_payment')
        return self


class OrderPromiseInfo(TeaModel):
    def __init__(
        self,
        repay_strategy_list: List[OrderRepayStrategy] = None,
    ):
        # 订单还款策略
        self.repay_strategy_list = repay_strategy_list

    def validate(self):
        if self.repay_strategy_list:
            for k in self.repay_strategy_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['repay_strategy_list'] = []
        if self.repay_strategy_list is not None:
            for k in self.repay_strategy_list:
                result['repay_strategy_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.repay_strategy_list = []
        if m.get('repay_strategy_list') is not None:
            for k in m.get('repay_strategy_list'):
                temp_model = OrderRepayStrategy()
                self.repay_strategy_list.append(temp_model.from_map(k))
        return self


class NoticeInfo(TeaModel):
    def __init__(
        self,
        notice_id: int = None,
        title: str = None,
        notice_create_time: str = None,
        unread: bool = None,
    ):
        # 通知id
        self.notice_id = notice_id
        # 通知标题
        self.title = title
        # 通知创建时间
        self.notice_create_time = notice_create_time
        # 是否未读
        self.unread = unread

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.notice_id is not None:
            result['notice_id'] = self.notice_id
        if self.title is not None:
            result['title'] = self.title
        if self.notice_create_time is not None:
            result['notice_create_time'] = self.notice_create_time
        if self.unread is not None:
            result['unread'] = self.unread
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('notice_id') is not None:
            self.notice_id = m.get('notice_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('notice_create_time') is not None:
            self.notice_create_time = m.get('notice_create_time')
        if m.get('unread') is not None:
            self.unread = m.get('unread')
        return self


class AuditInfo(TeaModel):
    def __init__(
        self,
        stage: str = None,
        audit_subject: str = None,
        status: str = None,
        apply_date_str: str = None,
        fail_reason: str = None,
    ):
        # 审核步骤
        self.stage = stage
        # 审核主体
        self.audit_subject = audit_subject
        # 审核状态
        self.status = status
        # 审核时间
        self.apply_date_str = apply_date_str
        # 审核失败描述
        self.fail_reason = fail_reason

    def validate(self):
        self.validate_required(self.stage, 'stage')
        self.validate_required(self.audit_subject, 'audit_subject')
        self.validate_required(self.status, 'status')
        self.validate_required(self.apply_date_str, 'apply_date_str')
        self.validate_required(self.fail_reason, 'fail_reason')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.stage is not None:
            result['stage'] = self.stage
        if self.audit_subject is not None:
            result['audit_subject'] = self.audit_subject
        if self.status is not None:
            result['status'] = self.status
        if self.apply_date_str is not None:
            result['apply_date_str'] = self.apply_date_str
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('stage') is not None:
            self.stage = m.get('stage')
        if m.get('audit_subject') is not None:
            self.audit_subject = m.get('audit_subject')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('apply_date_str') is not None:
            self.apply_date_str = m.get('apply_date_str')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        return self


class ProductInfo(TeaModel):
    def __init__(
        self,
        merchant_id: str = None,
        product_name: str = None,
        product_id: str = None,
        product_model: str = None,
        product_version: str = None,
        product_price: int = None,
        main_class: str = None,
        sub_class: str = None,
        product_brand: str = None,
    ):
        # 商家社会统一信用代码
        self.merchant_id = merchant_id
        # 商品名称
        self.product_name = product_name
        # 商品id
        self.product_id = product_id
        # 商品规格
        self.product_model = product_model
        # 商品版本
        self.product_version = product_version
        # 指导价(单位分)
        self.product_price = product_price
        # 一级类目
        self.main_class = main_class
        # 二级类目
        self.sub_class = sub_class
        # 品牌
        self.product_brand = product_brand

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.product_model is not None:
            result['product_model'] = self.product_model
        if self.product_version is not None:
            result['product_version'] = self.product_version
        if self.product_price is not None:
            result['product_price'] = self.product_price
        if self.main_class is not None:
            result['main_class'] = self.main_class
        if self.sub_class is not None:
            result['sub_class'] = self.sub_class
        if self.product_brand is not None:
            result['product_brand'] = self.product_brand
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('product_model') is not None:
            self.product_model = m.get('product_model')
        if m.get('product_version') is not None:
            self.product_version = m.get('product_version')
        if m.get('product_price') is not None:
            self.product_price = m.get('product_price')
        if m.get('main_class') is not None:
            self.main_class = m.get('main_class')
        if m.get('sub_class') is not None:
            self.sub_class = m.get('sub_class')
        if m.get('product_brand') is not None:
            self.product_brand = m.get('product_brand')
        return self


class LegalInfoUpdate(TeaModel):
    def __init__(
        self,
        legal_name: str = None,
        legal_cert_no: str = None,
        legal_cert_front_file: FileInfo = None,
        legal_cert_back_file: FileInfo = None,
    ):
        # 法人名称
        self.legal_name = legal_name
        # 法人证件号
        self.legal_cert_no = legal_cert_no
        # 法人证件正面
        self.legal_cert_front_file = legal_cert_front_file
        # 法人证件反面
        self.legal_cert_back_file = legal_cert_back_file

    def validate(self):
        if self.legal_cert_front_file:
            self.legal_cert_front_file.validate()
        if self.legal_cert_back_file:
            self.legal_cert_back_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.legal_name is not None:
            result['legal_name'] = self.legal_name
        if self.legal_cert_no is not None:
            result['legal_cert_no'] = self.legal_cert_no
        if self.legal_cert_front_file is not None:
            result['legal_cert_front_file'] = self.legal_cert_front_file.to_map()
        if self.legal_cert_back_file is not None:
            result['legal_cert_back_file'] = self.legal_cert_back_file.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('legal_name') is not None:
            self.legal_name = m.get('legal_name')
        if m.get('legal_cert_no') is not None:
            self.legal_cert_no = m.get('legal_cert_no')
        if m.get('legal_cert_front_file') is not None:
            temp_model = FileInfo()
            self.legal_cert_front_file = temp_model.from_map(m['legal_cert_front_file'])
        if m.get('legal_cert_back_file') is not None:
            temp_model = FileInfo()
            self.legal_cert_back_file = temp_model.from_map(m['legal_cert_back_file'])
        return self


class PromiseInfo(TeaModel):
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


class FundAssertReport(TeaModel):
    def __init__(
        self,
        delivery_month: str = None,
        total_bill_amount: int = None,
        average_term: str = None,
        cancelled_bill_amount: int = None,
        total_bill_amount_yperiod: int = None,
        average_term_yperiod: str = None,
        cancelled_bill_amount_yperiod: int = None,
        bill_amount_overdue_by_1day_or_more: str = None,
        bill_amount_overdue_by_1day_or_more_yperiod: str = None,
        bill_amount_overdue_by_30days_or_more: str = None,
        bill_amount_overdue_by_30days_or_more_yperiod: str = None,
    ):
        # 投放月份 (整月)
        self.delivery_month = delivery_month
        # 账单金额
        self.total_bill_amount = total_bill_amount
        # 平均期限
        self.average_term = average_term
        # 状态为取消的账单金额
        self.cancelled_bill_amount = cancelled_bill_amount
        # Y期的订单的账单金额
        self.total_bill_amount_yperiod = total_bill_amount_yperiod
        # 已到Y期订单中Y期平均期限(y期订单的平均期限)
        self.average_term_yperiod = average_term_yperiod
        # Y期的订单中状态为取消的账单金额
        self.cancelled_bill_amount_yperiod = cancelled_bill_amount_yperiod
        # 状态为逾期1天及以上的账单金额
        self.bill_amount_overdue_by_1day_or_more = bill_amount_overdue_by_1day_or_more
        # Y期的订单中状态为逾期1天及以上的账单金额
        self.bill_amount_overdue_by_1day_or_more_yperiod = bill_amount_overdue_by_1day_or_more_yperiod
        # 状态为逾期30天及以上的账单金额
        self.bill_amount_overdue_by_30days_or_more = bill_amount_overdue_by_30days_or_more
        # Y期的订单中状态为逾期30天及以上的账单金额
        self.bill_amount_overdue_by_30days_or_more_yperiod = bill_amount_overdue_by_30days_or_more_yperiod

    def validate(self):
        self.validate_required(self.delivery_month, 'delivery_month')
        self.validate_required(self.total_bill_amount, 'total_bill_amount')
        self.validate_required(self.average_term, 'average_term')
        self.validate_required(self.cancelled_bill_amount, 'cancelled_bill_amount')
        self.validate_required(self.total_bill_amount_yperiod, 'total_bill_amount_yperiod')
        self.validate_required(self.average_term_yperiod, 'average_term_yperiod')
        self.validate_required(self.cancelled_bill_amount_yperiod, 'cancelled_bill_amount_yperiod')
        self.validate_required(self.bill_amount_overdue_by_1day_or_more, 'bill_amount_overdue_by_1day_or_more')
        self.validate_required(self.bill_amount_overdue_by_1day_or_more_yperiod, 'bill_amount_overdue_by_1day_or_more_yperiod')
        self.validate_required(self.bill_amount_overdue_by_30days_or_more, 'bill_amount_overdue_by_30days_or_more')
        self.validate_required(self.bill_amount_overdue_by_30days_or_more_yperiod, 'bill_amount_overdue_by_30days_or_more_yperiod')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.delivery_month is not None:
            result['delivery_month'] = self.delivery_month
        if self.total_bill_amount is not None:
            result['total_bill_amount'] = self.total_bill_amount
        if self.average_term is not None:
            result['average_term'] = self.average_term
        if self.cancelled_bill_amount is not None:
            result['cancelled_bill_amount'] = self.cancelled_bill_amount
        if self.total_bill_amount_yperiod is not None:
            result['total_bill_amount_y_period'] = self.total_bill_amount_yperiod
        if self.average_term_yperiod is not None:
            result['average_term_y_period'] = self.average_term_yperiod
        if self.cancelled_bill_amount_yperiod is not None:
            result['cancelled_bill_amount_y_period'] = self.cancelled_bill_amount_yperiod
        if self.bill_amount_overdue_by_1day_or_more is not None:
            result['bill_amount_overdue_by1day_or_more'] = self.bill_amount_overdue_by_1day_or_more
        if self.bill_amount_overdue_by_1day_or_more_yperiod is not None:
            result['bill_amount_overdue_by1day_or_more_y_period'] = self.bill_amount_overdue_by_1day_or_more_yperiod
        if self.bill_amount_overdue_by_30days_or_more is not None:
            result['bill_amount_overdue_by30_days_or_more'] = self.bill_amount_overdue_by_30days_or_more
        if self.bill_amount_overdue_by_30days_or_more_yperiod is not None:
            result['bill_amount_overdue_by30_days_or_more_y_period'] = self.bill_amount_overdue_by_30days_or_more_yperiod
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('delivery_month') is not None:
            self.delivery_month = m.get('delivery_month')
        if m.get('total_bill_amount') is not None:
            self.total_bill_amount = m.get('total_bill_amount')
        if m.get('average_term') is not None:
            self.average_term = m.get('average_term')
        if m.get('cancelled_bill_amount') is not None:
            self.cancelled_bill_amount = m.get('cancelled_bill_amount')
        if m.get('total_bill_amount_y_period') is not None:
            self.total_bill_amount_yperiod = m.get('total_bill_amount_y_period')
        if m.get('average_term_y_period') is not None:
            self.average_term_yperiod = m.get('average_term_y_period')
        if m.get('cancelled_bill_amount_y_period') is not None:
            self.cancelled_bill_amount_yperiod = m.get('cancelled_bill_amount_y_period')
        if m.get('bill_amount_overdue_by1day_or_more') is not None:
            self.bill_amount_overdue_by_1day_or_more = m.get('bill_amount_overdue_by1day_or_more')
        if m.get('bill_amount_overdue_by1day_or_more_y_period') is not None:
            self.bill_amount_overdue_by_1day_or_more_yperiod = m.get('bill_amount_overdue_by1day_or_more_y_period')
        if m.get('bill_amount_overdue_by30_days_or_more') is not None:
            self.bill_amount_overdue_by_30days_or_more = m.get('bill_amount_overdue_by30_days_or_more')
        if m.get('bill_amount_overdue_by30_days_or_more_y_period') is not None:
            self.bill_amount_overdue_by_30days_or_more_yperiod = m.get('bill_amount_overdue_by30_days_or_more_y_period')
        return self


class CustomerServiceInfo(TeaModel):
    def __init__(
        self,
        merchant_id: str = None,
        merchant_name: str = None,
        process_type: str = None,
    ):
        # 公司社会统一信息代码
        self.merchant_id = merchant_id
        # 公司名称
        self.merchant_name = merchant_name
        # 处理类型:
        # MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
        # PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
        self.process_type = process_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.process_type is not None:
            result['process_type'] = self.process_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('process_type') is not None:
            self.process_type = m.get('process_type')
        return self


class OperationDivideTransInModel(TeaModel):
    def __init__(
        self,
        trans_in_user_id: str = None,
        divide_amount: int = None,
        desc: str = None,
    ):
        # 分账收入方支付宝用户id, 支付宝2088id
        self.trans_in_user_id = trans_in_user_id
        # 分账金额，单位为分
        # 
        self.divide_amount = divide_amount
        # 分账描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.trans_in_user_id, 'trans_in_user_id')
        if self.trans_in_user_id is not None:
            self.validate_max_length(self.trans_in_user_id, 'trans_in_user_id', 64)
        self.validate_required(self.divide_amount, 'divide_amount')
        if self.divide_amount is not None:
            self.validate_minimum(self.divide_amount, 'divide_amount', 1)
        if self.desc is not None:
            self.validate_max_length(self.desc, 'desc', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trans_in_user_id is not None:
            result['trans_in_user_id'] = self.trans_in_user_id
        if self.divide_amount is not None:
            result['divide_amount'] = self.divide_amount
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trans_in_user_id') is not None:
            self.trans_in_user_id = m.get('trans_in_user_id')
        if m.get('divide_amount') is not None:
            self.divide_amount = m.get('divide_amount')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class AssetPackageOrderInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        status: str = None,
        out_reason: str = None,
        order_credit_line: int = None,
        order_merchant_repayment_money: int = None,
        divide_start_term_index: int = None,
    ):
        # 订单id
        self.order_id = order_id
        # 订单状态
        self.status = status
        # 出包原因
        self.out_reason = out_reason
        # 订单用信额度
        self.order_credit_line = order_credit_line
        # 商户应还款金额
        self.order_merchant_repayment_money = order_merchant_repayment_money
        # 订单分账起始账期
        self.divide_start_term_index = divide_start_term_index

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.status is not None:
            result['status'] = self.status
        if self.out_reason is not None:
            result['out_reason'] = self.out_reason
        if self.order_credit_line is not None:
            result['order_credit_line'] = self.order_credit_line
        if self.order_merchant_repayment_money is not None:
            result['order_merchant_repayment_money'] = self.order_merchant_repayment_money
        if self.divide_start_term_index is not None:
            result['divide_start_term_index'] = self.divide_start_term_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('out_reason') is not None:
            self.out_reason = m.get('out_reason')
        if m.get('order_credit_line') is not None:
            self.order_credit_line = m.get('order_credit_line')
        if m.get('order_merchant_repayment_money') is not None:
            self.order_merchant_repayment_money = m.get('order_merchant_repayment_money')
        if m.get('divide_start_term_index') is not None:
            self.divide_start_term_index = m.get('divide_start_term_index')
        return self


class PurchaseQueryModel(TeaModel):
    def __init__(
        self,
        out_order_no: str = None,
        order_no: str = None,
        bank_card_no: str = None,
        company_name: str = None,
        sales_amount: int = None,
    ):
        # 支付宝外部交易号
        self.out_order_no = out_order_no
        # 支付宝内部生成的交易号
        self.order_no = order_no
        # 银行卡号
        self.bank_card_no = bank_card_no
        # 公司名称
        self.company_name = company_name
        # 金额，用户购买或使用服务时产生的具体金额，单位：分
        self.sales_amount = sales_amount

    def validate(self):
        if self.out_order_no is not None:
            self.validate_max_length(self.out_order_no, 'out_order_no', 128)
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 50)
        if self.bank_card_no is not None:
            self.validate_max_length(self.bank_card_no, 'bank_card_no', 52)
        if self.company_name is not None:
            self.validate_max_length(self.company_name, 'company_name', 50)
        if self.sales_amount is not None:
            self.validate_maximum(self.sales_amount, 'sales_amount', 10000000)
            self.validate_minimum(self.sales_amount, 'sales_amount', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_order_no is not None:
            result['out_order_no'] = self.out_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.sales_amount is not None:
            result['sales_amount'] = self.sales_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_order_no') is not None:
            self.out_order_no = m.get('out_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('sales_amount') is not None:
            self.sales_amount = m.get('sales_amount')
        return self


class OperateDivideInfo(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        operation_divide_trans_in_list: List[OperationDivideTransInDetailInfo] = None,
    ):
        # 当前用户履约的租期编号
        self.period_num = period_num
        # 经营分账收入方结果信息
        self.operation_divide_trans_in_list = operation_divide_trans_in_list

    def validate(self):
        if self.operation_divide_trans_in_list:
            for k in self.operation_divide_trans_in_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        result['operation_divide_trans_in_list'] = []
        if self.operation_divide_trans_in_list is not None:
            for k in self.operation_divide_trans_in_list:
                result['operation_divide_trans_in_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        self.operation_divide_trans_in_list = []
        if m.get('operation_divide_trans_in_list') is not None:
            for k in m.get('operation_divide_trans_in_list'):
                temp_model = OperationDivideTransInDetailInfo()
                self.operation_divide_trans_in_list.append(temp_model.from_map(k))
        return self


class OrderFulfillmentInfo(TeaModel):
    def __init__(
        self,
        lease_term_index: int = None,
        rental_return_state: str = None,
        real_repay_money: int = None,
        rental_money: int = None,
        return_time: str = None,
    ):
        # 租期编号
        self.lease_term_index = lease_term_index
        # 租期归还状态
        self.rental_return_state = rental_return_state
        # 实际还款金额(分)
        self.real_repay_money = real_repay_money
        # 租金(分)
        self.rental_money = rental_money
        # 每期实付时间
        self.return_time = return_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.lease_term_index is not None:
            result['lease_term_index'] = self.lease_term_index
        if self.rental_return_state is not None:
            result['rental_return_state'] = self.rental_return_state
        if self.real_repay_money is not None:
            result['real_repay_money'] = self.real_repay_money
        if self.rental_money is not None:
            result['rental_money'] = self.rental_money
        if self.return_time is not None:
            result['return_time'] = self.return_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('lease_term_index') is not None:
            self.lease_term_index = m.get('lease_term_index')
        if m.get('rental_return_state') is not None:
            self.rental_return_state = m.get('rental_return_state')
        if m.get('real_repay_money') is not None:
            self.real_repay_money = m.get('real_repay_money')
        if m.get('rental_money') is not None:
            self.rental_money = m.get('rental_money')
        if m.get('return_time') is not None:
            self.return_time = m.get('return_time')
        return self


class RiskScene(TeaModel):
    def __init__(
        self,
        scene_code: str = None,
        decision: str = None,
    ):
        # 风险场景编码
        self.scene_code = scene_code
        # 该场景的风险决策结果
        self.decision = decision

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.decision, 'decision')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.decision is not None:
            result['decision'] = self.decision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        return self


class RelationPage(TeaModel):
    def __init__(
        self,
        relation_id: str = None,
        company_name: str = None,
        merchant_id: str = None,
        status: str = None,
        subject_merchant_id: str = None,
        subject_company_name: str = None,
    ):
        # 分账关系id
        self.relation_id = relation_id
        # 分账公司名称
        self.company_name = company_name
        # 分账公司名称统一社会信用代码
        self.merchant_id = merchant_id
        # 审核状态
        self.status = status
        # 商户公司统一社会信用代码
        self.subject_merchant_id = subject_merchant_id
        # 商户公司名称
        self.subject_company_name = subject_company_name

    def validate(self):
        self.validate_required(self.relation_id, 'relation_id')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.subject_merchant_id, 'subject_merchant_id')
        self.validate_required(self.subject_company_name, 'subject_company_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.status is not None:
            result['status'] = self.status
        if self.subject_merchant_id is not None:
            result['subject_merchant_id'] = self.subject_merchant_id
        if self.subject_company_name is not None:
            result['subject_company_name'] = self.subject_company_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('subject_merchant_id') is not None:
            self.subject_merchant_id = m.get('subject_merchant_id')
        if m.get('subject_company_name') is not None:
            self.subject_company_name = m.get('subject_company_name')
        return self


class BaddebtQueryModel(TeaModel):
    def __init__(
        self,
        service_category: str = None,
        total_amount: int = None,
        total_quantity: int = None,
        user_name: str = None,
        isv_pid: str = None,
        apdid: str = None,
    ):
        # 服务分类，服务二级分类
        self.service_category = service_category
        # 总金额，用户购买或使用服务时产生的具体金额
        self.total_amount = total_amount
        # 商品数量，用户购买或使用服务时产生的具体商品数量
        self.total_quantity = total_quantity
        # 用户姓名
        self.user_name = user_name
        # 服务商 pid
        self.isv_pid = isv_pid
        # 终端唯一标识
        self.apdid = apdid

    def validate(self):
        if self.service_category is not None:
            self.validate_max_length(self.service_category, 'service_category', 128)
        if self.total_amount is not None:
            self.validate_maximum(self.total_amount, 'total_amount', 10000000)
            self.validate_minimum(self.total_amount, 'total_amount', 1)
        if self.total_quantity is not None:
            self.validate_maximum(self.total_quantity, 'total_quantity', 10000)
            self.validate_minimum(self.total_quantity, 'total_quantity', 1)
        if self.user_name is not None:
            self.validate_max_length(self.user_name, 'user_name', 128)
        if self.isv_pid is not None:
            self.validate_max_length(self.isv_pid, 'isv_pid', 128)
        if self.apdid is not None:
            self.validate_max_length(self.apdid, 'apdid', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service_category is not None:
            result['service_category'] = self.service_category
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.total_quantity is not None:
            result['total_quantity'] = self.total_quantity
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.isv_pid is not None:
            result['isv_pid'] = self.isv_pid
        if self.apdid is not None:
            result['apdid'] = self.apdid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service_category') is not None:
            self.service_category = m.get('service_category')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('total_quantity') is not None:
            self.total_quantity = m.get('total_quantity')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('isv_pid') is not None:
            self.isv_pid = m.get('isv_pid')
        if m.get('apdid') is not None:
            self.apdid = m.get('apdid')
        return self


class CompanyInfoUpdate(TeaModel):
    def __init__(
        self,
        business_license_file: FileInfo = None,
        product_main_class: str = None,
        company_name: str = None,
        company_alias_name: str = None,
        tenant_id: str = None,
        company_mobile: str = None,
        company_address: str = None,
        contact_name: str = None,
        contact_mobile: str = None,
        merchant_type: str = None,
    ):
        # 营业执照文件信息
        self.business_license_file = business_license_file
        # 业务类型 枚举
        self.product_main_class = product_main_class
        # 公司名称
        self.company_name = company_name
        # 公司别名
        self.company_alias_name = company_alias_name
        # 公司数科租户id
        self.tenant_id = tenant_id
        # 公司联系电话
        self.company_mobile = company_mobile
        # 公司联系地址
        self.company_address = company_address
        # 联系人姓名
        self.contact_name = contact_name
        # 联系人手机号码
        self.contact_mobile = contact_mobile
        # 商户类型： 01：企业；07：个体工商户 默认不填为01
        self.merchant_type = merchant_type

    def validate(self):
        if self.business_license_file:
            self.business_license_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.business_license_file is not None:
            result['business_license_file'] = self.business_license_file.to_map()
        if self.product_main_class is not None:
            result['product_main_class'] = self.product_main_class
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.company_alias_name is not None:
            result['company_alias_name'] = self.company_alias_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.company_mobile is not None:
            result['company_mobile'] = self.company_mobile
        if self.company_address is not None:
            result['company_address'] = self.company_address
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_mobile is not None:
            result['contact_mobile'] = self.contact_mobile
        if self.merchant_type is not None:
            result['merchant_type'] = self.merchant_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('business_license_file') is not None:
            temp_model = FileInfo()
            self.business_license_file = temp_model.from_map(m['business_license_file'])
        if m.get('product_main_class') is not None:
            self.product_main_class = m.get('product_main_class')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('company_alias_name') is not None:
            self.company_alias_name = m.get('company_alias_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('company_mobile') is not None:
            self.company_mobile = m.get('company_mobile')
        if m.get('company_address') is not None:
            self.company_address = m.get('company_address')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_mobile') is not None:
            self.contact_mobile = m.get('contact_mobile')
        if m.get('merchant_type') is not None:
            self.merchant_type = m.get('merchant_type')
        return self


class CompanySummaryInfo(TeaModel):
    def __init__(
        self,
        merchant_id: str = None,
        merchant_name: str = None,
    ):
        # 社会统一信用代码
        self.merchant_id = merchant_id
        # 公司名称
        self.merchant_name = merchant_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        return self


class OrderSearchInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        agreement_no: str = None,
        order_create_time: str = None,
        total_rent_money: int = None,
        rent_term: int = None,
        rent_unit: str = None,
        order_status: str = None,
        user_name: str = None,
        user_phone_number: str = None,
    ):
        # 订单id
        self.order_id = order_id
        # 支付宝代扣协议号
        self.agreement_no = agreement_no
        # 订单创建时间
        self.order_create_time = order_create_time
        # 租金总额（单位分）
        self.total_rent_money = total_rent_money
        # 租期
        self.rent_term = rent_term
        # 租期单位
        self.rent_unit = rent_unit
        # 订单状态
        self.order_status = order_status
        # 承租人名称
        self.user_name = user_name
        # 承租人手机号
        self.user_phone_number = user_phone_number

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.agreement_no is not None:
            result['agreement_no'] = self.agreement_no
        if self.order_create_time is not None:
            result['order_create_time'] = self.order_create_time
        if self.total_rent_money is not None:
            result['total_rent_money'] = self.total_rent_money
        if self.rent_term is not None:
            result['rent_term'] = self.rent_term
        if self.rent_unit is not None:
            result['rent_unit'] = self.rent_unit
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_phone_number is not None:
            result['user_phone_number'] = self.user_phone_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('agreement_no') is not None:
            self.agreement_no = m.get('agreement_no')
        if m.get('order_create_time') is not None:
            self.order_create_time = m.get('order_create_time')
        if m.get('total_rent_money') is not None:
            self.total_rent_money = m.get('total_rent_money')
        if m.get('rent_term') is not None:
            self.rent_term = m.get('rent_term')
        if m.get('rent_unit') is not None:
            self.rent_unit = m.get('rent_unit')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_phone_number') is not None:
            self.user_phone_number = m.get('user_phone_number')
        return self


class ApplicationInfo(TeaModel):
    def __init__(
        self,
        application_scene: str = None,
        tiny_app_id: str = None,
        site_name: str = None,
        sit_url: str = None,
        merchant_name: str = None,
        merchant_service_name: str = None,
        merchant_service_desc: str = None,
        site_info: List[SiteInfo] = None,
    ):
        # 应用场景
        # MINI_APP 小程序
        # APP 自有app
        # ALL 两种都有
        self.application_scene = application_scene
        # 小程序id
        self.tiny_app_id = tiny_app_id
        # 小程序名称
        self.site_name = site_name
        # 网站地址
        self.sit_url = sit_url
        # 商户名称。
        # 修改后的商户名称，将同步支付宝代扣签约页面字段展示
        self.merchant_name = merchant_name
        # 商户服务名称。
        # 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
        self.merchant_service_name = merchant_service_name
        # 商户服务描述。
        # 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
        self.merchant_service_desc = merchant_service_desc
        # 站点信息
        self.site_info = site_info

    def validate(self):
        self.validate_required(self.application_scene, 'application_scene')
        self.validate_required(self.tiny_app_id, 'tiny_app_id')
        self.validate_required(self.site_name, 'site_name')
        self.validate_required(self.sit_url, 'sit_url')
        self.validate_required(self.merchant_name, 'merchant_name')
        self.validate_required(self.merchant_service_name, 'merchant_service_name')
        self.validate_required(self.merchant_service_desc, 'merchant_service_desc')
        if self.site_info:
            for k in self.site_info:
                if k:
                    k.validate()

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
        if self.merchant_service_desc is not None:
            result['merchant_service_desc'] = self.merchant_service_desc
        result['site_info'] = []
        if self.site_info is not None:
            for k in self.site_info:
                result['site_info'].append(k.to_map() if k else None)
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
        if m.get('merchant_service_desc') is not None:
            self.merchant_service_desc = m.get('merchant_service_desc')
        self.site_info = []
        if m.get('site_info') is not None:
            for k in m.get('site_info'):
                temp_model = SiteInfo()
                self.site_info.append(temp_model.from_map(k))
        return self


class ItemDetail(TeaModel):
    def __init__(
        self,
        goods_category: str = None,
        item_name: str = None,
        quantity: int = None,
    ):
        # 租赁商品类目，可选类型：
        # RENT_PHONE - 手机租赁；RENT_COMPUTER - 电脑/平板租赁；RENT_CAMERA - 数码摄像租赁；RENT_DIGITAL - 数码其他租赁；RENT_STATIONERY - 电子词典/电纸书/文化用品租赁；RENT_CLOTHING - 服装租赁
        self.goods_category = goods_category
        # 租赁商品名称
        self.item_name = item_name
        # 租赁商品数量
        self.quantity = quantity

    def validate(self):
        if self.goods_category is not None:
            self.validate_max_length(self.goods_category, 'goods_category', 30)
        if self.item_name is not None:
            self.validate_max_length(self.item_name, 'item_name', 128)
        if self.quantity is not None:
            self.validate_maximum(self.quantity, 'quantity', 10000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.goods_category is not None:
            result['goods_category'] = self.goods_category
        if self.item_name is not None:
            result['item_name'] = self.item_name
        if self.quantity is not None:
            result['quantity'] = self.quantity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('goods_category') is not None:
            self.goods_category = m.get('goods_category')
        if m.get('item_name') is not None:
            self.item_name = m.get('item_name')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        return self


class RiskGoModel(TeaModel):
    def __init__(
        self,
        risk_type: str = None,
        risk_value: str = None,
        risk_desc: str = None,
        info_code: str = None,
    ):
        # 风险类型。
        # 枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
        self.risk_type = risk_type
        # 风险等级。
        # 枚举：rank0 无法判断；rank1 极低风险；rank2 较低风险；rank3 中风险；rank4 高风险；rank5 极高风险
        self.risk_value = risk_value
        # 风险描述
        self.risk_desc = risk_desc
        # 风险标签
        self.info_code = info_code

    def validate(self):
        self.validate_required(self.risk_type, 'risk_type')
        self.validate_required(self.risk_value, 'risk_value')
        self.validate_required(self.risk_desc, 'risk_desc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.risk_value is not None:
            result['risk_value'] = self.risk_value
        if self.risk_desc is not None:
            result['risk_desc'] = self.risk_desc
        if self.info_code is not None:
            result['info_code'] = self.info_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('risk_value') is not None:
            self.risk_value = m.get('risk_value')
        if m.get('risk_desc') is not None:
            self.risk_desc = m.get('risk_desc')
        if m.get('info_code') is not None:
            self.info_code = m.get('info_code')
        return self


class SingleCancelModel(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        gmt_pay: str = None,
        pay_off_amount: int = None,
        pay_off_type: str = None,
        pay_off_no: str = None,
        pay_off_bank_name: str = None,
    ):
        # 第几期
        self.period_num = period_num
        # 其他方式还款的时间
        self.gmt_pay = gmt_pay
        # 取消订单某一期代扣计划中以其他方式还款金额，单位为分
        self.pay_off_amount = pay_off_amount
        # 变更其他方式还款WECHAT:微信; BANK:银行
        # ALIPAY:支付宝
        # CASH:现金
        self.pay_off_type = pay_off_type
        # 通过其他方式还款单号;例如银行流水号或微信流水号
        self.pay_off_no = pay_off_no
        # 其他方式还款银行名称，还款方式为银行时必填
        self.pay_off_bank_name = pay_off_bank_name

    def validate(self):
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        self.validate_required(self.gmt_pay, 'gmt_pay')
        if self.gmt_pay is not None:
            self.validate_pattern(self.gmt_pay, 'gmt_pay', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.pay_off_amount, 'pay_off_amount')
        if self.pay_off_amount is not None:
            self.validate_minimum(self.pay_off_amount, 'pay_off_amount', 0)
        if self.pay_off_type is not None:
            self.validate_max_length(self.pay_off_type, 'pay_off_type', 64)
        if self.pay_off_no is not None:
            self.validate_max_length(self.pay_off_no, 'pay_off_no', 64)
        if self.pay_off_bank_name is not None:
            self.validate_max_length(self.pay_off_bank_name, 'pay_off_bank_name', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.gmt_pay is not None:
            result['gmt_pay'] = self.gmt_pay
        if self.pay_off_amount is not None:
            result['pay_off_amount'] = self.pay_off_amount
        if self.pay_off_type is not None:
            result['pay_off_type'] = self.pay_off_type
        if self.pay_off_no is not None:
            result['pay_off_no'] = self.pay_off_no
        if self.pay_off_bank_name is not None:
            result['pay_off_bank_name'] = self.pay_off_bank_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('gmt_pay') is not None:
            self.gmt_pay = m.get('gmt_pay')
        if m.get('pay_off_amount') is not None:
            self.pay_off_amount = m.get('pay_off_amount')
        if m.get('pay_off_type') is not None:
            self.pay_off_type = m.get('pay_off_type')
        if m.get('pay_off_no') is not None:
            self.pay_off_no = m.get('pay_off_no')
        if m.get('pay_off_bank_name') is not None:
            self.pay_off_bank_name = m.get('pay_off_bank_name')
        return self


class RiskModel(TeaModel):
    def __init__(
        self,
        scene_code: str = None,
        score: str = None,
        delinquency_rate: str = None,
        risk_advice: str = None,
        risk_rank: str = None,
        flow_id: str = None,
    ):
        # 风险场景编码
        self.scene_code = scene_code
        # 该风险场景的风险分值
        self.score = score
        # 逾期率
        self.delinquency_rate = delinquency_rate
        # 风险建议
        self.risk_advice = risk_advice
        # 风险等级
        self.risk_rank = risk_rank
        # 流程id
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.score, 'score')
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.score is not None:
            result['score'] = self.score
        if self.delinquency_rate is not None:
            result['delinquency_rate'] = self.delinquency_rate
        if self.risk_advice is not None:
            result['risk_advice'] = self.risk_advice
        if self.risk_rank is not None:
            result['risk_rank'] = self.risk_rank
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('delinquency_rate') is not None:
            self.delinquency_rate = m.get('delinquency_rate')
        if m.get('risk_advice') is not None:
            self.risk_advice = m.get('risk_advice')
        if m.get('risk_rank') is not None:
            self.risk_rank = m.get('risk_rank')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class ScalperQueryModel(TeaModel):
    def __init__(
        self,
        registration_phone: str = None,
        certificate_date: str = None,
        login_phone: str = None,
        registration_cert: str = None,
        login_cert: str = None,
        registration_date: str = None,
        cert_type: int = None,
        bank_card_no: str = None,
        email_address: str = None,
        imei: str = None,
        imsi: str = None,
        mac_address: str = None,
        apdid: str = None,
        out_order_no: str = None,
        order_no: str = None,
        sales_amount: int = None,
        user_name: str = None,
        mailing_phone: str = None,
        mailing_address: str = None,
        is_employee: str = None,
        channel: str = None,
        isv_pid: str = None,
        store_mcc_desc: str = None,
        customer_id: str = None,
        order_items_info_list: List[ScalperQueryOrderItem] = None,
    ):
        # 注册手机号，填写咨询对象所关联的注册手机号
        self.registration_phone = registration_phone
        # 认证时间，填写风险咨询对象所关联的账号的真实身份认证时间
        self.certificate_date = certificate_date
        # 登录手机号，填写风险咨询对象关联账号的登录手机号
        self.login_phone = login_phone
        # 注册账号身份证，填写风险咨询对象所关联账号的注册身份证信息
        self.registration_cert = registration_cert
        # 登录账号身份证，登录账号的身份证号码
        self.login_cert = login_cert
        # 注册时间，填写风险咨询对象所关联的账号的注册时间
        self.registration_date = registration_date
        # 证件类型；枚举值：1 - 身份证；2 - 护照
        self.cert_type = cert_type
        # 银行卡号
        self.bank_card_no = bank_card_no
        # 用户邮箱
        self.email_address = email_address
        # 手机序列号
        self.imei = imei
        # 国际移动用户识别码
        self.imsi = imsi
        # mac 地址或设备唯一标识
        self.mac_address = mac_address
        # 设备号，设备唯一号码
        self.apdid = apdid
        # 支付宝外部交易号
        self.out_order_no = out_order_no
        # 所咨询的唯一支付宝交易号
        self.order_no = order_no
        # 用户购买或使用服务时产生的具体金额总数，单位：分
        self.sales_amount = sales_amount
        # 用户姓名
        self.user_name = user_name
        # 收货手机号，用于区分 mobile_no 所填的手机号
        self.mailing_phone = mailing_phone
        # 收货地址
        self.mailing_address = mailing_address
        # 是否为员工账号，枚举值：1 - 是
        self.is_employee = is_employee
        # 渠道，枚举值：alipay - 支付宝；app - 自有app；pc - 电脑端
        self.channel = channel
        # 服务商 pid
        self.isv_pid = isv_pid
        # 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        self.store_mcc_desc = store_mcc_desc
        # 消费者 id，外部会员账号
        self.customer_id = customer_id
        # 订单所有商品信息列表
        self.order_items_info_list = order_items_info_list

    def validate(self):
        if self.registration_phone is not None:
            self.validate_max_length(self.registration_phone, 'registration_phone', 20)
        if self.certificate_date is not None:
            self.validate_max_length(self.certificate_date, 'certificate_date', 20)
        if self.login_phone is not None:
            self.validate_max_length(self.login_phone, 'login_phone', 20)
        if self.registration_cert is not None:
            self.validate_max_length(self.registration_cert, 'registration_cert', 30)
        if self.login_cert is not None:
            self.validate_max_length(self.login_cert, 'login_cert', 30)
        if self.registration_date is not None:
            self.validate_max_length(self.registration_date, 'registration_date', 20)
        if self.cert_type is not None:
            self.validate_maximum(self.cert_type, 'cert_type', 2)
            self.validate_minimum(self.cert_type, 'cert_type', 1)
        if self.bank_card_no is not None:
            self.validate_max_length(self.bank_card_no, 'bank_card_no', 50)
        if self.email_address is not None:
            self.validate_max_length(self.email_address, 'email_address', 35)
        if self.imei is not None:
            self.validate_max_length(self.imei, 'imei', 100)
        if self.imsi is not None:
            self.validate_max_length(self.imsi, 'imsi', 100)
        if self.mac_address is not None:
            self.validate_max_length(self.mac_address, 'mac_address', 30)
        if self.apdid is not None:
            self.validate_max_length(self.apdid, 'apdid', 128)
        if self.out_order_no is not None:
            self.validate_max_length(self.out_order_no, 'out_order_no', 128)
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 128)
        if self.sales_amount is not None:
            self.validate_maximum(self.sales_amount, 'sales_amount', 1000000)
            self.validate_minimum(self.sales_amount, 'sales_amount', 1)
        if self.user_name is not None:
            self.validate_max_length(self.user_name, 'user_name', 50)
        if self.mailing_phone is not None:
            self.validate_max_length(self.mailing_phone, 'mailing_phone', 20)
        if self.mailing_address is not None:
            self.validate_max_length(self.mailing_address, 'mailing_address', 128)
        if self.is_employee is not None:
            self.validate_max_length(self.is_employee, 'is_employee', 10)
        if self.channel is not None:
            self.validate_max_length(self.channel, 'channel', 10)
        if self.isv_pid is not None:
            self.validate_max_length(self.isv_pid, 'isv_pid', 128)
        if self.store_mcc_desc is not None:
            self.validate_max_length(self.store_mcc_desc, 'store_mcc_desc', 20)
        if self.customer_id is not None:
            self.validate_max_length(self.customer_id, 'customer_id', 128)
        if self.order_items_info_list:
            for k in self.order_items_info_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.registration_phone is not None:
            result['registration_phone'] = self.registration_phone
        if self.certificate_date is not None:
            result['certificate_date'] = self.certificate_date
        if self.login_phone is not None:
            result['login_phone'] = self.login_phone
        if self.registration_cert is not None:
            result['registration_cert'] = self.registration_cert
        if self.login_cert is not None:
            result['login_cert'] = self.login_cert
        if self.registration_date is not None:
            result['registration_date'] = self.registration_date
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.email_address is not None:
            result['email_address'] = self.email_address
        if self.imei is not None:
            result['imei'] = self.imei
        if self.imsi is not None:
            result['imsi'] = self.imsi
        if self.mac_address is not None:
            result['mac_address'] = self.mac_address
        if self.apdid is not None:
            result['apdid'] = self.apdid
        if self.out_order_no is not None:
            result['out_order_no'] = self.out_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.sales_amount is not None:
            result['sales_amount'] = self.sales_amount
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.mailing_phone is not None:
            result['mailing_phone'] = self.mailing_phone
        if self.mailing_address is not None:
            result['mailing_address'] = self.mailing_address
        if self.is_employee is not None:
            result['is_employee'] = self.is_employee
        if self.channel is not None:
            result['channel'] = self.channel
        if self.isv_pid is not None:
            result['isv_pid'] = self.isv_pid
        if self.store_mcc_desc is not None:
            result['store_mcc_desc'] = self.store_mcc_desc
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        result['order_items_info_list'] = []
        if self.order_items_info_list is not None:
            for k in self.order_items_info_list:
                result['order_items_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('registration_phone') is not None:
            self.registration_phone = m.get('registration_phone')
        if m.get('certificate_date') is not None:
            self.certificate_date = m.get('certificate_date')
        if m.get('login_phone') is not None:
            self.login_phone = m.get('login_phone')
        if m.get('registration_cert') is not None:
            self.registration_cert = m.get('registration_cert')
        if m.get('login_cert') is not None:
            self.login_cert = m.get('login_cert')
        if m.get('registration_date') is not None:
            self.registration_date = m.get('registration_date')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('email_address') is not None:
            self.email_address = m.get('email_address')
        if m.get('imei') is not None:
            self.imei = m.get('imei')
        if m.get('imsi') is not None:
            self.imsi = m.get('imsi')
        if m.get('mac_address') is not None:
            self.mac_address = m.get('mac_address')
        if m.get('apdid') is not None:
            self.apdid = m.get('apdid')
        if m.get('out_order_no') is not None:
            self.out_order_no = m.get('out_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('sales_amount') is not None:
            self.sales_amount = m.get('sales_amount')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('mailing_phone') is not None:
            self.mailing_phone = m.get('mailing_phone')
        if m.get('mailing_address') is not None:
            self.mailing_address = m.get('mailing_address')
        if m.get('is_employee') is not None:
            self.is_employee = m.get('is_employee')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('isv_pid') is not None:
            self.isv_pid = m.get('isv_pid')
        if m.get('store_mcc_desc') is not None:
            self.store_mcc_desc = m.get('store_mcc_desc')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        self.order_items_info_list = []
        if m.get('order_items_info_list') is not None:
            for k in m.get('order_items_info_list'):
                temp_model = ScalperQueryOrderItem()
                self.order_items_info_list.append(temp_model.from_map(k))
        return self


class UserSyncInfo(TeaModel):
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


class CompanyInfo(TeaModel):
    def __init__(
        self,
        business_license_file: FileInfo = None,
        product_main_class: str = None,
        company_name: str = None,
        company_alias_name: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        merchant_type: str = None,
        company_mobile: str = None,
        company_address: str = None,
        contact_name: str = None,
        contact_mobile: str = None,
        bind_alipay_no: str = None,
        settle_alipay_no: str = None,
        bind_alipay_uid: str = None,
    ):
        # 营业执照文件信息
        self.business_license_file = business_license_file
        # 业务类型 枚举
        self.product_main_class = product_main_class
        # 公司名称
        self.company_name = company_name
        # 公司别名
        self.company_alias_name = company_alias_name
        # 公司数科租户id
        self.tenant_id = tenant_id
        # 统一社会信用代码
        self.merchant_id = merchant_id
        # 商户类型： 01：企业；07：个体工商户
        # 默认不填为01
        self.merchant_type = merchant_type
        # 公司联系电话
        self.company_mobile = company_mobile
        # 公司联系地址
        self.company_address = company_address
        # 联系人姓名
        self.contact_name = contact_name
        # 联系人手机号码
        self.contact_mobile = contact_mobile
        # 绑定企业支付宝账号
        self.bind_alipay_no = bind_alipay_no
        # 结算企业支付宝账号
        self.settle_alipay_no = settle_alipay_no
        # 绑定支付宝uid
        self.bind_alipay_uid = bind_alipay_uid

    def validate(self):
        self.validate_required(self.business_license_file, 'business_license_file')
        if self.business_license_file:
            self.business_license_file.validate()
        self.validate_required(self.product_main_class, 'product_main_class')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.company_alias_name, 'company_alias_name')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.company_mobile, 'company_mobile')
        self.validate_required(self.company_address, 'company_address')
        self.validate_required(self.contact_name, 'contact_name')
        self.validate_required(self.contact_mobile, 'contact_mobile')
        self.validate_required(self.bind_alipay_no, 'bind_alipay_no')
        self.validate_required(self.settle_alipay_no, 'settle_alipay_no')
        self.validate_required(self.bind_alipay_uid, 'bind_alipay_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.business_license_file is not None:
            result['business_license_file'] = self.business_license_file.to_map()
        if self.product_main_class is not None:
            result['product_main_class'] = self.product_main_class
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.company_alias_name is not None:
            result['company_alias_name'] = self.company_alias_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_type is not None:
            result['merchant_type'] = self.merchant_type
        if self.company_mobile is not None:
            result['company_mobile'] = self.company_mobile
        if self.company_address is not None:
            result['company_address'] = self.company_address
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_mobile is not None:
            result['contact_mobile'] = self.contact_mobile
        if self.bind_alipay_no is not None:
            result['bind_alipay_no'] = self.bind_alipay_no
        if self.settle_alipay_no is not None:
            result['settle_alipay_no'] = self.settle_alipay_no
        if self.bind_alipay_uid is not None:
            result['bind_alipay_uid'] = self.bind_alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('business_license_file') is not None:
            temp_model = FileInfo()
            self.business_license_file = temp_model.from_map(m['business_license_file'])
        if m.get('product_main_class') is not None:
            self.product_main_class = m.get('product_main_class')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('company_alias_name') is not None:
            self.company_alias_name = m.get('company_alias_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_type') is not None:
            self.merchant_type = m.get('merchant_type')
        if m.get('company_mobile') is not None:
            self.company_mobile = m.get('company_mobile')
        if m.get('company_address') is not None:
            self.company_address = m.get('company_address')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_mobile') is not None:
            self.contact_mobile = m.get('contact_mobile')
        if m.get('bind_alipay_no') is not None:
            self.bind_alipay_no = m.get('bind_alipay_no')
        if m.get('settle_alipay_no') is not None:
            self.settle_alipay_no = m.get('settle_alipay_no')
        if m.get('bind_alipay_uid') is not None:
            self.bind_alipay_uid = m.get('bind_alipay_uid')
        return self


class UserPerformanceInfo(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        pay_date: str = None,
        pay_money: int = None,
    ):
        # 履约期数
        self.period_num = period_num
        # 履约时间，格式 yyyy-MM-dd
        # 针对签收日作为起租日模式,未签收时：以签收日开始计算
        self.pay_date = pay_date
        # 履约金额，单位为分
        self.pay_money = pay_money

    def validate(self):
        self.validate_required(self.period_num, 'period_num')
        self.validate_required(self.pay_date, 'pay_date')
        self.validate_required(self.pay_money, 'pay_money')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.pay_date is not None:
            result['pay_date'] = self.pay_date
        if self.pay_money is not None:
            result['pay_money'] = self.pay_money
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('pay_date') is not None:
            self.pay_date = m.get('pay_date')
        if m.get('pay_money') is not None:
            self.pay_money = m.get('pay_money')
        return self


class MarketingScoreQueryInfo(TeaModel):
    def __init__(
        self,
        phone_num: str = None,
    ):
        # 手机号码
        self.phone_num = phone_num

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        return self


class OrderPromiseExcelInfo(TeaModel):
    def __init__(
        self,
        download_url: str = None,
        file_type: str = None,
        task_status: str = None,
    ):
        # 文件下载地址
        self.download_url = download_url
        # 文件类型,订单明细表:ORDER_DETAIL 还款记录表:ORDER_FULFILLMENT
        self.file_type = file_type
        # 任务状态
        # ● RUNNING:生成中
        # ● SUCCESS:已生成
        # ● FAILED:失败
        self.task_status = task_status

    def validate(self):
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.task_status, 'task_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.download_url is not None:
            result['download_url'] = self.download_url
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.task_status is not None:
            result['task_status'] = self.task_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('task_status') is not None:
            self.task_status = m.get('task_status')
        return self


class RiskStrategy(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        decision: str = None,
        scene_code: str = None,
    ):
        # 策略ID
        self.id = id
        # 策略名称
        self.name = name
        # 策略决策结果
        self.decision = decision
        # 风险场景编码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.decision, 'decision')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.decision is not None:
            result['decision'] = self.decision
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class InsureOrderInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        insure_id: str = None,
        product_name: str = None,
        insure_start_time: str = None,
        insure_end_time: str = None,
        insure_amount: int = None,
        insure_premium: int = None,
        status: str = None,
        policy_url: str = None,
        validate_code: str = None,
    ):
        # 商家订单ID
        self.order_id = order_id
        # 投保编号（承保id）
        self.insure_id = insure_id
        # 商品名称
        self.product_name = product_name
        # 保险开始时间
        self.insure_start_time = insure_start_time
        # 保险终止时间
        self.insure_end_time = insure_end_time
        # 投保金额（保额），单位分 100代表1元
        self.insure_amount = insure_amount
        # 投保费用（保费），单位分 100代表1元
        self.insure_premium = insure_premium
        # 投保状态枚举
        self.status = status
        # 电子保单下载链接
        self.policy_url = policy_url
        # 验真码
        self.validate_code = validate_code

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.insure_id is not None:
            result['insure_id'] = self.insure_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.insure_start_time is not None:
            result['insure_start_time'] = self.insure_start_time
        if self.insure_end_time is not None:
            result['insure_end_time'] = self.insure_end_time
        if self.insure_amount is not None:
            result['insure_amount'] = self.insure_amount
        if self.insure_premium is not None:
            result['insure_premium'] = self.insure_premium
        if self.status is not None:
            result['status'] = self.status
        if self.policy_url is not None:
            result['policy_url'] = self.policy_url
        if self.validate_code is not None:
            result['validate_code'] = self.validate_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('insure_id') is not None:
            self.insure_id = m.get('insure_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('insure_start_time') is not None:
            self.insure_start_time = m.get('insure_start_time')
        if m.get('insure_end_time') is not None:
            self.insure_end_time = m.get('insure_end_time')
        if m.get('insure_amount') is not None:
            self.insure_amount = m.get('insure_amount')
        if m.get('insure_premium') is not None:
            self.insure_premium = m.get('insure_premium')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('policy_url') is not None:
            self.policy_url = m.get('policy_url')
        if m.get('validate_code') is not None:
            self.validate_code = m.get('validate_code')
        return self


class MarketingScoreInfo(TeaModel):
    def __init__(
        self,
        phone_num: str = None,
        score: str = None,
    ):
        # 手机号
        self.phone_num = phone_num
        # 营销分
        self.score = score

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class OrderContractInfo(TeaModel):
    def __init__(
        self,
        sign_no: str = None,
        sign_time: str = None,
        contract_type: str = None,
        agreement_type: str = None,
        template_id: str = None,
        file_name: str = None,
        download_url: str = None,
    ):
        # 电子合同签署单号
        self.sign_no = sign_no
        # 签署时间
        self.sign_time = sign_time
        # 合同签署类型
        self.contract_type = contract_type
        # 文件合同类型
        self.agreement_type = agreement_type
        # 模板ID
        self.template_id = template_id
        # 模板文件名称
        self.file_name = file_name
        # 合同文件下载地址
        self.download_url = download_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.agreement_type is not None:
            result['agreement_type'] = self.agreement_type
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.download_url is not None:
            result['download_url'] = self.download_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('agreement_type') is not None:
            self.agreement_type = m.get('agreement_type')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        return self


class PendingEventInfo(TeaModel):
    def __init__(
        self,
        event_id: str = None,
        type: str = None,
        status: str = None,
        content_subject: str = None,
        effective_start_time: str = None,
        effective_end_time: str = None,
    ):
        # 事件id
        self.event_id = event_id
        # 通知:NOTIFICATION
        # 确认函:CONFIRMATION
        self.type = type
        # ("PENDING","待办中"),  ("CONFIRMED","确认"),
        # ("REJECTED","已拒绝")
        # ("FAILED","失败"),("EXPIRED","已过期");
        self.status = status
        # 待办内容主题
        self.content_subject = content_subject
        # 事件有效期开始
        self.effective_start_time = effective_start_time
        # 事件有效期结束
        self.effective_end_time = effective_end_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.event_id is not None:
            result['event_id'] = self.event_id
        if self.type is not None:
            result['type'] = self.type
        if self.status is not None:
            result['status'] = self.status
        if self.content_subject is not None:
            result['content_subject'] = self.content_subject
        if self.effective_start_time is not None:
            result['effective_start_time'] = self.effective_start_time
        if self.effective_end_time is not None:
            result['effective_end_time'] = self.effective_end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('content_subject') is not None:
            self.content_subject = m.get('content_subject')
        if m.get('effective_start_time') is not None:
            self.effective_start_time = m.get('effective_start_time')
        if m.get('effective_end_time') is not None:
            self.effective_end_time = m.get('effective_end_time')
        return self


class PriceDetail(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        deposit_price: int = None,
        buyout_price: int = None,
        initial_rent_price: int = None,
    ):
        # 商品租赁期数
        self.period_num = period_num
        # 押金，单位：分。
        self.deposit_price = deposit_price
        # 买断价格，单位：分
        self.buyout_price = buyout_price
        # 首期租金，单位：分
        self.initial_rent_price = initial_rent_price

    def validate(self):
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_maximum(self.period_num, 'period_num', 1000)
        self.validate_required(self.deposit_price, 'deposit_price')
        if self.deposit_price is not None:
            self.validate_maximum(self.deposit_price, 'deposit_price', 10000000)
        self.validate_required(self.buyout_price, 'buyout_price')
        if self.buyout_price is not None:
            self.validate_maximum(self.buyout_price, 'buyout_price', 10000000)
        self.validate_required(self.initial_rent_price, 'initial_rent_price')
        if self.initial_rent_price is not None:
            self.validate_maximum(self.initial_rent_price, 'initial_rent_price', 10000000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.deposit_price is not None:
            result['deposit_price'] = self.deposit_price
        if self.buyout_price is not None:
            result['buyout_price'] = self.buyout_price
        if self.initial_rent_price is not None:
            result['initial_rent_price'] = self.initial_rent_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('deposit_price') is not None:
            self.deposit_price = m.get('deposit_price')
        if m.get('buyout_price') is not None:
            self.buyout_price = m.get('buyout_price')
        if m.get('initial_rent_price') is not None:
            self.initial_rent_price = m.get('initial_rent_price')
        return self


class OrderMsgInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        msg_id: str = None,
        msg_publish_type: str = None,
        msg_create_time: str = None,
        msg_status: str = None,
        msg_retry_time: int = None,
        msg_content: str = None,
        msg_callback_url: str = None,
        new_msg_callback_url: str = None,
    ):
        # 订单id
        # 
        self.order_id = order_id
        # 消息ID
        # 
        self.msg_id = msg_id
        # 消息类型
        # 
        self.msg_publish_type = msg_publish_type
        # 消息创建时间
        # 
        self.msg_create_time = msg_create_time
        # 消息投递状态 SUCCESS 成功 FAIL 失败 WAIT 等待投递重试
        self.msg_status = msg_status
        # 消息重投次数
        # 
        self.msg_retry_time = msg_retry_time
        # 消息体内容
        self.msg_content = msg_content
        # 消息回调地址
        self.msg_callback_url = msg_callback_url
        # 新回调地址
        self.new_msg_callback_url = new_msg_callback_url

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.msg_id, 'msg_id')
        self.validate_required(self.msg_publish_type, 'msg_publish_type')
        self.validate_required(self.msg_create_time, 'msg_create_time')
        if self.msg_create_time is not None:
            self.validate_pattern(self.msg_create_time, 'msg_create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.msg_status, 'msg_status')
        self.validate_required(self.msg_retry_time, 'msg_retry_time')
        self.validate_required(self.msg_content, 'msg_content')
        self.validate_required(self.msg_callback_url, 'msg_callback_url')
        self.validate_required(self.new_msg_callback_url, 'new_msg_callback_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.msg_id is not None:
            result['msg_id'] = self.msg_id
        if self.msg_publish_type is not None:
            result['msg_publish_type'] = self.msg_publish_type
        if self.msg_create_time is not None:
            result['msg_create_time'] = self.msg_create_time
        if self.msg_status is not None:
            result['msg_status'] = self.msg_status
        if self.msg_retry_time is not None:
            result['msg_retry_time'] = self.msg_retry_time
        if self.msg_content is not None:
            result['msg_content'] = self.msg_content
        if self.msg_callback_url is not None:
            result['msg_callback_url'] = self.msg_callback_url
        if self.new_msg_callback_url is not None:
            result['new_msg_callback_url'] = self.new_msg_callback_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('msg_id') is not None:
            self.msg_id = m.get('msg_id')
        if m.get('msg_publish_type') is not None:
            self.msg_publish_type = m.get('msg_publish_type')
        if m.get('msg_create_time') is not None:
            self.msg_create_time = m.get('msg_create_time')
        if m.get('msg_status') is not None:
            self.msg_status = m.get('msg_status')
        if m.get('msg_retry_time') is not None:
            self.msg_retry_time = m.get('msg_retry_time')
        if m.get('msg_content') is not None:
            self.msg_content = m.get('msg_content')
        if m.get('msg_callback_url') is not None:
            self.msg_callback_url = m.get('msg_callback_url')
        if m.get('new_msg_callback_url') is not None:
            self.new_msg_callback_url = m.get('new_msg_callback_url')
        return self


class DataDownloadInfo(TeaModel):
    def __init__(
        self,
        merchant_id: str = None,
        biz_no: str = None,
        status: str = None,
        type: str = None,
        start_time: str = None,
        end_time: str = None,
        create_time: str = None,
        result_info: str = None,
    ):
        # 商户社会统一信用代码
        self.merchant_id = merchant_id
        # 流水号
        self.biz_no = biz_no
        # 状态
        self.status = status
        # TRADE_PROMISE_BILL: 交易履约账单
        self.type = type
        # 筛选开始时间
        self.start_time = start_time
        # 筛选结束时间
        self.end_time = end_time
        # 任务创建时间
        self.create_time = create_time
        # 下载结果
        self.result_info = result_info

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.status is not None:
            result['status'] = self.status
        if self.type is not None:
            result['type'] = self.type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.result_info is not None:
            result['result_info'] = self.result_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('result_info') is not None:
            self.result_info = m.get('result_info')
        return self


class CustomerPersonInfo(TeaModel):
    def __init__(
        self,
        alipay_logon_id: str = None,
        alipay_bind_mobile: str = None,
        customer_service_name: str = None,
    ):
        # 客诉处理员支付宝账号
        self.alipay_logon_id = alipay_logon_id
        # 客诉处理员支付宝绑定手机号
        self.alipay_bind_mobile = alipay_bind_mobile
        # 客服人员名称
        self.customer_service_name = customer_service_name

    def validate(self):
        self.validate_required(self.alipay_logon_id, 'alipay_logon_id')
        self.validate_required(self.alipay_bind_mobile, 'alipay_bind_mobile')
        self.validate_required(self.customer_service_name, 'customer_service_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.alipay_logon_id is not None:
            result['alipay_logon_id'] = self.alipay_logon_id
        if self.alipay_bind_mobile is not None:
            result['alipay_bind_mobile'] = self.alipay_bind_mobile
        if self.customer_service_name is not None:
            result['customer_service_name'] = self.customer_service_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alipay_logon_id') is not None:
            self.alipay_logon_id = m.get('alipay_logon_id')
        if m.get('alipay_bind_mobile') is not None:
            self.alipay_bind_mobile = m.get('alipay_bind_mobile')
        if m.get('customer_service_name') is not None:
            self.customer_service_name = m.get('customer_service_name')
        return self


class AwardingQueryModel(TeaModel):
    def __init__(
        self,
        opposing_userid: str = None,
        opposing_open_id: str = None,
        service_category: str = None,
        isv_pid: str = None,
        bank_card_no: str = None,
        imei: str = None,
        imsi: str = None,
        sales_amount: int = None,
        user_name: str = None,
        store_mcc_desc: str = None,
        customer_id: str = None,
        qr_code: str = None,
    ):
        # 对方支付宝账户 uid，用于表示两个账户在业务交互中的对方账户，如人传人活动用户A会拉用户B来注册领奖，其中用户B为对方账户
        self.opposing_userid = opposing_userid
        # 对方支付宝账户openid，营销发奖风险识别场景，userid 与 open_id 至少传入一个
        self.opposing_open_id = opposing_open_id
        # 服务二级分类
        self.service_category = service_category
        # 服务商 pid
        self.isv_pid = isv_pid
        # 银行卡号
        self.bank_card_no = bank_card_no
        # 手机序列号
        self.imei = imei
        # 国际移动用户识别码
        self.imsi = imsi
        # 金额，用户购买或使用服务时产生的具体金额，单位：分
        self.sales_amount = sales_amount
        # 用户姓名
        self.user_name = user_name
        # 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        self.store_mcc_desc = store_mcc_desc
        # 消费者 id，外部会员账号
        self.customer_id = customer_id
        # 填入想要咨询风控的二维码值，需为唯一值
        self.qr_code = qr_code

    def validate(self):
        if self.opposing_userid is not None:
            self.validate_max_length(self.opposing_userid, 'opposing_userid', 128)
        if self.opposing_open_id is not None:
            self.validate_max_length(self.opposing_open_id, 'opposing_open_id', 128)
        if self.service_category is not None:
            self.validate_max_length(self.service_category, 'service_category', 128)
        if self.isv_pid is not None:
            self.validate_max_length(self.isv_pid, 'isv_pid', 128)
        if self.bank_card_no is not None:
            self.validate_max_length(self.bank_card_no, 'bank_card_no', 128)
        if self.imei is not None:
            self.validate_max_length(self.imei, 'imei', 128)
        if self.imsi is not None:
            self.validate_max_length(self.imsi, 'imsi', 128)
        if self.sales_amount is not None:
            self.validate_maximum(self.sales_amount, 'sales_amount', 10000000)
            self.validate_minimum(self.sales_amount, 'sales_amount', 1)
        if self.user_name is not None:
            self.validate_max_length(self.user_name, 'user_name', 128)
        if self.store_mcc_desc is not None:
            self.validate_max_length(self.store_mcc_desc, 'store_mcc_desc', 30)
        self.validate_required(self.customer_id, 'customer_id')
        if self.customer_id is not None:
            self.validate_max_length(self.customer_id, 'customer_id', 128)
        if self.qr_code is not None:
            self.validate_max_length(self.qr_code, 'qr_code', 256)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.opposing_userid is not None:
            result['opposing_userid'] = self.opposing_userid
        if self.opposing_open_id is not None:
            result['opposing_open_id'] = self.opposing_open_id
        if self.service_category is not None:
            result['service_category'] = self.service_category
        if self.isv_pid is not None:
            result['isv_pid'] = self.isv_pid
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.imei is not None:
            result['imei'] = self.imei
        if self.imsi is not None:
            result['imsi'] = self.imsi
        if self.sales_amount is not None:
            result['sales_amount'] = self.sales_amount
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.store_mcc_desc is not None:
            result['store_mcc_desc'] = self.store_mcc_desc
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.qr_code is not None:
            result['qr_code'] = self.qr_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('opposing_userid') is not None:
            self.opposing_userid = m.get('opposing_userid')
        if m.get('opposing_open_id') is not None:
            self.opposing_open_id = m.get('opposing_open_id')
        if m.get('service_category') is not None:
            self.service_category = m.get('service_category')
        if m.get('isv_pid') is not None:
            self.isv_pid = m.get('isv_pid')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('imei') is not None:
            self.imei = m.get('imei')
        if m.get('imsi') is not None:
            self.imsi = m.get('imsi')
        if m.get('sales_amount') is not None:
            self.sales_amount = m.get('sales_amount')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('store_mcc_desc') is not None:
            self.store_mcc_desc = m.get('store_mcc_desc')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('qr_code') is not None:
            self.qr_code = m.get('qr_code')
        return self


class ApplicationInfoUpdate(TeaModel):
    def __init__(
        self,
        application_scene: str = None,
        tiny_app_id: str = None,
        site_name: str = None,
        sit_url: str = None,
        merchant_name: str = None,
        merchant_service_name: str = None,
        merchant_service_desc: str = None,
        site_info: List[SiteInfo] = None,
    ):
        # 应用场景 MINI_APP 小程序 APP 自有app ALL 两种都有
        self.application_scene = application_scene
        # 小程序id
        self.tiny_app_id = tiny_app_id
        # 小程序名称
        self.site_name = site_name
        # http://asdasas.com
        self.sit_url = sit_url
        # 商户名称。 修改后的商户名称，将同步支付宝代扣签约页面字段展示
        self.merchant_name = merchant_name
        # 商户服务名称。 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
        self.merchant_service_name = merchant_service_name
        # 商户服务描述。 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
        self.merchant_service_desc = merchant_service_desc
        # 站点信息
        self.site_info = site_info

    def validate(self):
        if self.site_info:
            for k in self.site_info:
                if k:
                    k.validate()

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
        if self.merchant_service_desc is not None:
            result['merchant_service_desc'] = self.merchant_service_desc
        result['site_info'] = []
        if self.site_info is not None:
            for k in self.site_info:
                result['site_info'].append(k.to_map() if k else None)
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
        if m.get('merchant_service_desc') is not None:
            self.merchant_service_desc = m.get('merchant_service_desc')
        self.site_info = []
        if m.get('site_info') is not None:
            for k in m.get('site_info'):
                temp_model = SiteInfo()
                self.site_info.append(temp_model.from_map(k))
        return self


class OrderUserInfo(TeaModel):
    def __init__(
        self,
        user_name: str = None,
        user_phone_number: str = None,
        user_address: str = None,
        alipay_uid: str = None,
        lessee_type: int = None,
        user_id: str = None,
    ):
        # 承租人名称
        self.user_name = user_name
        # 承租人手机号
        self.user_phone_number = user_phone_number
        # 地址
        self.user_address = user_address
        # 支付宝账号
        self.alipay_uid = alipay_uid
        # 租赁类别
        # 1:个人用户
        # 2:企业用户
        self.lessee_type = lessee_type
        # 承租人身份证
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_phone_number is not None:
            result['user_phone_number'] = self.user_phone_number
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        if self.lessee_type is not None:
            result['lessee_type'] = self.lessee_type
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_phone_number') is not None:
            self.user_phone_number = m.get('user_phone_number')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        if m.get('lessee_type') is not None:
            self.lessee_type = m.get('lessee_type')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class OrderGoodsModel(TeaModel):
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


class DeliveryDetail(TeaModel):
    def __init__(
        self,
        receiver_name: str = None,
        receiver_mobile: str = None,
        receiver_address: str = None,
    ):
        # 收件人姓名
        self.receiver_name = receiver_name
        # 收件人手机号
        self.receiver_mobile = receiver_mobile
        # 收件人地址
        self.receiver_address = receiver_address

    def validate(self):
        if self.receiver_name is not None:
            self.validate_max_length(self.receiver_name, 'receiver_name', 32)
        if self.receiver_mobile is not None:
            self.validate_max_length(self.receiver_mobile, 'receiver_mobile', 32)
        if self.receiver_address is not None:
            self.validate_max_length(self.receiver_address, 'receiver_address', 256)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.receiver_name is not None:
            result['receiver_name'] = self.receiver_name
        if self.receiver_mobile is not None:
            result['receiver_mobile'] = self.receiver_mobile
        if self.receiver_address is not None:
            result['receiver_address'] = self.receiver_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('receiver_name') is not None:
            self.receiver_name = m.get('receiver_name')
        if m.get('receiver_mobile') is not None:
            self.receiver_mobile = m.get('receiver_mobile')
        if m.get('receiver_address') is not None:
            self.receiver_address = m.get('receiver_address')
        return self


class AgreementPage(TeaModel):
    def __init__(
        self,
        agreement_id: str = None,
        merchant_name: str = None,
        tenant_id: str = None,
        product_main_class: str = None,
        agreement_type: str = None,
        sign_status: str = None,
    ):
        # 协议id
        self.agreement_id = agreement_id
        # 代理企业名称
        self.merchant_name = merchant_name
        # 租户8位id
        self.tenant_id = tenant_id
        # 业务类型 枚举
        self.product_main_class = product_main_class
        # 协议类型 枚举
        self.agreement_type = agreement_type
        # 租户签约状态 枚举
        self.sign_status = sign_status

    def validate(self):
        self.validate_required(self.agreement_id, 'agreement_id')
        self.validate_required(self.merchant_name, 'merchant_name')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_main_class, 'product_main_class')
        self.validate_required(self.agreement_type, 'agreement_type')
        self.validate_required(self.sign_status, 'sign_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.agreement_id is not None:
            result['agreement_id'] = self.agreement_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_main_class is not None:
            result['product_main_class'] = self.product_main_class
        if self.agreement_type is not None:
            result['agreement_type'] = self.agreement_type
        if self.sign_status is not None:
            result['sign_status'] = self.sign_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agreement_id') is not None:
            self.agreement_id = m.get('agreement_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_main_class') is not None:
            self.product_main_class = m.get('product_main_class')
        if m.get('agreement_type') is not None:
            self.agreement_type = m.get('agreement_type')
        if m.get('sign_status') is not None:
            self.sign_status = m.get('sign_status')
        return self


class FarmingQueryModel(TeaModel):
    def __init__(
        self,
        out_order_no: str = None,
        order_no: str = None,
        sales_amount: int = None,
        bank_card_no: str = None,
        isv_pid: str = None,
        store_mcc_desc: str = None,
        outlet_address: str = None,
        company_name: str = None,
        store_name: str = None,
    ):
        # 支付宝外部交易号
        self.out_order_no = out_order_no
        # 支付宝内部交易号
        self.order_no = order_no
        # 金额，用户购买或使用服务时产生的具体金额，单位：分
        self.sales_amount = sales_amount
        # 银行卡号
        self.bank_card_no = bank_card_no
        # 服务商 pid
        self.isv_pid = isv_pid
        # 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        self.store_mcc_desc = store_mcc_desc
        # 门店地址；不需要传城市和行政区
        self.outlet_address = outlet_address
        # 公司名称
        self.company_name = company_name
        # 店铺名称
        self.store_name = store_name

    def validate(self):
        if self.out_order_no is not None:
            self.validate_max_length(self.out_order_no, 'out_order_no', 128)
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 128)
        if self.sales_amount is not None:
            self.validate_maximum(self.sales_amount, 'sales_amount', 10000000)
            self.validate_minimum(self.sales_amount, 'sales_amount', 1)
        if self.bank_card_no is not None:
            self.validate_max_length(self.bank_card_no, 'bank_card_no', 128)
        if self.isv_pid is not None:
            self.validate_max_length(self.isv_pid, 'isv_pid', 128)
        if self.store_mcc_desc is not None:
            self.validate_max_length(self.store_mcc_desc, 'store_mcc_desc', 30)
        if self.outlet_address is not None:
            self.validate_max_length(self.outlet_address, 'outlet_address', 128)
        if self.company_name is not None:
            self.validate_max_length(self.company_name, 'company_name', 128)
        if self.store_name is not None:
            self.validate_max_length(self.store_name, 'store_name', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_order_no is not None:
            result['out_order_no'] = self.out_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.sales_amount is not None:
            result['sales_amount'] = self.sales_amount
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.isv_pid is not None:
            result['isv_pid'] = self.isv_pid
        if self.store_mcc_desc is not None:
            result['store_mcc_desc'] = self.store_mcc_desc
        if self.outlet_address is not None:
            result['outlet_address'] = self.outlet_address
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.store_name is not None:
            result['store_name'] = self.store_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_order_no') is not None:
            self.out_order_no = m.get('out_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('sales_amount') is not None:
            self.sales_amount = m.get('sales_amount')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('isv_pid') is not None:
            self.isv_pid = m.get('isv_pid')
        if m.get('store_mcc_desc') is not None:
            self.store_mcc_desc = m.get('store_mcc_desc')
        if m.get('outlet_address') is not None:
            self.outlet_address = m.get('outlet_address')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('store_name') is not None:
            self.store_name = m.get('store_name')
        return self


class OrderProductInfo(TeaModel):
    def __init__(
        self,
        product_id: str = None,
        product_name: str = None,
        product_number: int = None,
    ):
        # 商品编码
        self.product_id = product_id
        # 商品名称
        self.product_name = product_name
        # 商品数量
        self.product_number = product_number

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_number is not None:
            result['product_number'] = self.product_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_number') is not None:
            self.product_number = m.get('product_number')
        return self


class CreditUtilizationOrder(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        order_credit_line: int = None,
        order_merchant_repayment_money: int = None,
        divide_start_term_index: int = None,
    ):
        # 123
        self.order_id = order_id
        # 订单用信额度，单位为分
        self.order_credit_line = order_credit_line
        # 订单商户应还金额，单位为分
        self.order_merchant_repayment_money = order_merchant_repayment_money
        # 分账起始日期
        self.divide_start_term_index = divide_start_term_index

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.order_credit_line, 'order_credit_line')
        if self.order_credit_line is not None:
            self.validate_minimum(self.order_credit_line, 'order_credit_line', 1)
        self.validate_required(self.order_merchant_repayment_money, 'order_merchant_repayment_money')
        if self.order_merchant_repayment_money is not None:
            self.validate_minimum(self.order_merchant_repayment_money, 'order_merchant_repayment_money', 1)
        self.validate_required(self.divide_start_term_index, 'divide_start_term_index')
        if self.divide_start_term_index is not None:
            self.validate_minimum(self.divide_start_term_index, 'divide_start_term_index', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_credit_line is not None:
            result['order_credit_line'] = self.order_credit_line
        if self.order_merchant_repayment_money is not None:
            result['order_merchant_repayment_money'] = self.order_merchant_repayment_money
        if self.divide_start_term_index is not None:
            result['divide_start_term_index'] = self.divide_start_term_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_credit_line') is not None:
            self.order_credit_line = m.get('order_credit_line')
        if m.get('order_merchant_repayment_money') is not None:
            self.order_merchant_repayment_money = m.get('order_merchant_repayment_money')
        if m.get('divide_start_term_index') is not None:
            self.divide_start_term_index = m.get('divide_start_term_index')
        return self


class ActivePayOrder(TeaModel):
    def __init__(
        self,
        trade_no: str = None,
        trade_status: str = None,
        status_reason_code: str = None,
        status_reason_msg: str = None,
        total_amount: int = None,
        paid_amount: int = None,
        receipt_amount: int = None,
        gmt_pay: str = None,
    ):
        # 支付宝支付订单号，用于拉起主动支付页面
        self.trade_no = trade_no
        # 状态
        # INIT：交易创建
        # FAILED：付款失败
        # SUCCESS：付款成功
        self.trade_status = trade_status
        # 状态原因码
        self.status_reason_code = status_reason_code
        # 超时关闭
        self.status_reason_msg = status_reason_msg
        # 本次交易支付的订单金额，单位为分
        # 付款成功或付款成功之后的状态必填
        self.total_amount = total_amount
        # 用户在交易中支付的金额，单位为分
        # 付款成功的状态必填
        self.paid_amount = paid_amount
        # 商家在交易中实际收到的款项，单位为分
        # 付款成功的状态必填
        self.receipt_amount = receipt_amount
        # 交易支付时间
        # 付款成功的状态必填
        self.gmt_pay = gmt_pay

    def validate(self):
        self.validate_required(self.trade_no, 'trade_no')
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 64)
        self.validate_required(self.trade_status, 'trade_status')
        if self.trade_status is not None:
            self.validate_max_length(self.trade_status, 'trade_status', 64)
        if self.total_amount is not None:
            self.validate_minimum(self.total_amount, 'total_amount', 1)
        if self.paid_amount is not None:
            self.validate_minimum(self.paid_amount, 'paid_amount', 1)
        if self.receipt_amount is not None:
            self.validate_minimum(self.receipt_amount, 'receipt_amount', 1)
        if self.gmt_pay is not None:
            self.validate_pattern(self.gmt_pay, 'gmt_pay', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.trade_status is not None:
            result['trade_status'] = self.trade_status
        if self.status_reason_code is not None:
            result['status_reason_code'] = self.status_reason_code
        if self.status_reason_msg is not None:
            result['status_reason_msg'] = self.status_reason_msg
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.paid_amount is not None:
            result['paid_amount'] = self.paid_amount
        if self.receipt_amount is not None:
            result['receipt_amount'] = self.receipt_amount
        if self.gmt_pay is not None:
            result['gmt_pay'] = self.gmt_pay
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('trade_status') is not None:
            self.trade_status = m.get('trade_status')
        if m.get('status_reason_code') is not None:
            self.status_reason_code = m.get('status_reason_code')
        if m.get('status_reason_msg') is not None:
            self.status_reason_msg = m.get('status_reason_msg')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('paid_amount') is not None:
            self.paid_amount = m.get('paid_amount')
        if m.get('receipt_amount') is not None:
            self.receipt_amount = m.get('receipt_amount')
        if m.get('gmt_pay') is not None:
            self.gmt_pay = m.get('gmt_pay')
        return self


class GoodsInfo(TeaModel):
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


class PageQuery(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        page_index: int = None,
    ):
        # 页大小
        self.page_size = page_size
        # 当前页
        self.page_index = page_index

    def validate(self):
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.page_index, 'page_index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_index is not None:
            result['page_index'] = self.page_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        return self


class LegalInfo(TeaModel):
    def __init__(
        self,
        legal_name: str = None,
        legal_cert_no: str = None,
        legal_cert_front_file: FileInfo = None,
        legal_cert_back_file: FileInfo = None,
    ):
        # 法人名称
        self.legal_name = legal_name
        # 法人证件号
        self.legal_cert_no = legal_cert_no
        # 法人证件正面
        self.legal_cert_front_file = legal_cert_front_file
        # 法人证件反面
        self.legal_cert_back_file = legal_cert_back_file

    def validate(self):
        self.validate_required(self.legal_name, 'legal_name')
        self.validate_required(self.legal_cert_no, 'legal_cert_no')
        self.validate_required(self.legal_cert_front_file, 'legal_cert_front_file')
        if self.legal_cert_front_file:
            self.legal_cert_front_file.validate()
        self.validate_required(self.legal_cert_back_file, 'legal_cert_back_file')
        if self.legal_cert_back_file:
            self.legal_cert_back_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.legal_name is not None:
            result['legal_name'] = self.legal_name
        if self.legal_cert_no is not None:
            result['legal_cert_no'] = self.legal_cert_no
        if self.legal_cert_front_file is not None:
            result['legal_cert_front_file'] = self.legal_cert_front_file.to_map()
        if self.legal_cert_back_file is not None:
            result['legal_cert_back_file'] = self.legal_cert_back_file.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('legal_name') is not None:
            self.legal_name = m.get('legal_name')
        if m.get('legal_cert_no') is not None:
            self.legal_cert_no = m.get('legal_cert_no')
        if m.get('legal_cert_front_file') is not None:
            temp_model = FileInfo()
            self.legal_cert_front_file = temp_model.from_map(m['legal_cert_front_file'])
        if m.get('legal_cert_back_file') is not None:
            temp_model = FileInfo()
            self.legal_cert_back_file = temp_model.from_map(m['legal_cert_back_file'])
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


class TransferBrokerUserdataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_id: str = None,
        data_type: str = None,
        data_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据的唯一id，支持数字、大小写字母或下划线
        self.data_id = data_id
        # 枚举，数据类型
        self.data_type = data_type
        # 数据内容,使用JSONArray结构
        self.data_content = data_content

    def validate(self):
        self.validate_required(self.data_id, 'data_id')
        if self.data_id is not None:
            self.validate_max_length(self.data_id, 'data_id', 20)
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.data_content, 'data_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.data_content is not None:
            result['data_content'] = self.data_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('data_content') is not None:
            self.data_content = m.get('data_content')
        return self


class TransferBrokerUserdataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据id
        self.data_id = data_id

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
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class SyncFundSplittingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        fund_no: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        term_num: int = None,
        deduction_time: str = None,
        deduction_amount: int = None,
        merchant_split_amount: int = None,
        fund_split_amount: int = None,
        other_split_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资方订单号
        self.fund_no = fund_no
        # 商户的订单号
        self.order_id = order_id
        # 商户的数科租户ID
        self.merchant_tenant_id = merchant_tenant_id
        # 第几期，例如：2表示第二期
        self.term_num = term_num
        # 扣款时间， yyyy-MM-dd HH:mm:ss 格式
        self.deduction_time = deduction_time
        # 扣款金额，单位精确到分， 例如：12462300为124623.00元
        self.deduction_amount = deduction_amount
        # 商户分账金额，单位精确到分，比如：666601 = 6666.01元
        self.merchant_split_amount = merchant_split_amount
        # 资方分账金额，单位精确到分。比如：666610 = 6666.10元
        self.fund_split_amount = fund_split_amount
        # 其他参与方分账信息，JSON格式的数组，样例：
        # [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
        self.other_split_info = other_split_info

    def validate(self):
        self.validate_required(self.fund_no, 'fund_no')
        if self.fund_no is not None:
            self.validate_max_length(self.fund_no, 'fund_no', 50)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 50)
        self.validate_required(self.term_num, 'term_num')
        self.validate_required(self.deduction_time, 'deduction_time')
        self.validate_required(self.deduction_amount, 'deduction_amount')
        self.validate_required(self.merchant_split_amount, 'merchant_split_amount')
        self.validate_required(self.fund_split_amount, 'fund_split_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.fund_no is not None:
            result['fund_no'] = self.fund_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.term_num is not None:
            result['term_num'] = self.term_num
        if self.deduction_time is not None:
            result['deduction_time'] = self.deduction_time
        if self.deduction_amount is not None:
            result['deduction_amount'] = self.deduction_amount
        if self.merchant_split_amount is not None:
            result['merchant_split_amount'] = self.merchant_split_amount
        if self.fund_split_amount is not None:
            result['fund_split_amount'] = self.fund_split_amount
        if self.other_split_info is not None:
            result['other_split_info'] = self.other_split_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fund_no') is not None:
            self.fund_no = m.get('fund_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('term_num') is not None:
            self.term_num = m.get('term_num')
        if m.get('deduction_time') is not None:
            self.deduction_time = m.get('deduction_time')
        if m.get('deduction_amount') is not None:
            self.deduction_amount = m.get('deduction_amount')
        if m.get('merchant_split_amount') is not None:
            self.merchant_split_amount = m.get('merchant_split_amount')
        if m.get('fund_split_amount') is not None:
            self.fund_split_amount = m.get('fund_split_amount')
        if m.get('other_split_info') is not None:
            self.other_split_info = m.get('other_split_info')
        return self


class SyncFundSplittingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 流水同步描述信息
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class SyncFundOrderfinancialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        application_id: str = None,
        status: int = None,
        reason: str = None,
        extras: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # 商户在数科的租户ID
        self.merchant_tenant_id = merchant_tenant_id
        # 订单融资唯一标识
        self.application_id = application_id
        # 订单融资状态：1-成功；2-失败
        self.status = status
        # 融资结果描述，长度不超过64
        self.reason = reason
        # 额外信息
        self.extras = extras

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 50)
        self.validate_required(self.application_id, 'application_id')
        if self.application_id is not None:
            self.validate_max_length(self.application_id, 'application_id', 128)
        self.validate_required(self.status, 'status')
        if self.reason is not None:
            self.validate_max_length(self.reason, 'reason', 64)

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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.application_id is not None:
            result['application_id'] = self.application_id
        if self.status is not None:
            result['status'] = self.status
        if self.reason is not None:
            result['reason'] = self.reason
        if self.extras is not None:
            result['extras'] = self.extras
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('application_id') is not None:
            self.application_id = m.get('application_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        if m.get('extras') is not None:
            self.extras = m.get('extras')
        return self


class SyncFundOrderfinancialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果描述信息
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class SyncFundWithholdingcontractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        withholding_contract_id: str = None,
        extra_info: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # 商家在数科注册的租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 代扣协议号
        self.withholding_contract_id = withholding_contract_id
        # json的字符串，存储额外信息
        self.extra_info = extra_info
        # 签署状态：
        # - ACCEPT : 接受
        # - REFUSE : 拒绝
        # - TIMEOUT : 超时
        self.status = status

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 50)
        self.validate_required(self.withholding_contract_id, 'withholding_contract_id')
        if self.withholding_contract_id is not None:
            self.validate_max_length(self.withholding_contract_id, 'withholding_contract_id', 100)
        self.validate_required(self.status, 'status')

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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.withholding_contract_id is not None:
            result['withholding_contract_id'] = self.withholding_contract_id
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('withholding_contract_id') is not None:
            self.withholding_contract_id = m.get('withholding_contract_id')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class SyncFundWithholdingcontractResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存储成功
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class SyncFundOrderfulfillmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        order_id: str = None,
        lease_term_index: int = None,
        remain_term: int = None,
        total_term: int = None,
        rental_return_state: str = None,
        rental_money: int = None,
        penalty_fee_money: int = None,
        total_money: int = None,
        return_time: str = None,
        return_way: str = None,
        return_voucher_serial: str = None,
        bank_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户id
        self.merchant_tenant_id = merchant_tenant_id
        # 订单id
        self.order_id = order_id
        # 租期编号
        self.lease_term_index = lease_term_index
        # 剩余归还期数
        self.remain_term = remain_term
        # 总期数
        self.total_term = total_term
        # 租金归还状态，
        # RETURN_FULL : 足额归还 【终态】
        # NOT_RETURN : 未归还
        # CANCEL : 取消 【终态】
        self.rental_return_state = rental_return_state
        # 租金归还金额,精确到分，即1234表示12.34元
        self.rental_money = rental_money
        # 罚息金额，分，1234表示12.34元
        self.penalty_fee_money = penalty_fee_money
        # 总金额，单位分
        self.total_money = total_money
        # 归还时间，格式为"2019-07-31 12:00:00"
        self.return_time = return_time
        # 归还方式，
        # ANTDIGITAL： 数科代扣
        # FUND : 资方代扣
        # BANK : 银行转账
        # WECHAT : 微信支付
        self.return_way = return_way
        # 还款凭证编号
        self.return_voucher_serial = return_voucher_serial
        # 银行名字
        self.bank_name = bank_name

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 49)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.lease_term_index, 'lease_term_index')
        self.validate_required(self.remain_term, 'remain_term')
        self.validate_required(self.total_term, 'total_term')
        self.validate_required(self.rental_return_state, 'rental_return_state')
        self.validate_required(self.rental_money, 'rental_money')
        self.validate_required(self.penalty_fee_money, 'penalty_fee_money')
        self.validate_required(self.total_money, 'total_money')
        if self.return_voucher_serial is not None:
            self.validate_max_length(self.return_voucher_serial, 'return_voucher_serial', 127)
        if self.bank_name is not None:
            self.validate_max_length(self.bank_name, 'bank_name', 127)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.lease_term_index is not None:
            result['lease_term_index'] = self.lease_term_index
        if self.remain_term is not None:
            result['remain_term'] = self.remain_term
        if self.total_term is not None:
            result['total_term'] = self.total_term
        if self.rental_return_state is not None:
            result['rental_return_state'] = self.rental_return_state
        if self.rental_money is not None:
            result['rental_money'] = self.rental_money
        if self.penalty_fee_money is not None:
            result['penalty_fee_money'] = self.penalty_fee_money
        if self.total_money is not None:
            result['total_money'] = self.total_money
        if self.return_time is not None:
            result['return_time'] = self.return_time
        if self.return_way is not None:
            result['return_way'] = self.return_way
        if self.return_voucher_serial is not None:
            result['return_voucher_serial'] = self.return_voucher_serial
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('lease_term_index') is not None:
            self.lease_term_index = m.get('lease_term_index')
        if m.get('remain_term') is not None:
            self.remain_term = m.get('remain_term')
        if m.get('total_term') is not None:
            self.total_term = m.get('total_term')
        if m.get('rental_return_state') is not None:
            self.rental_return_state = m.get('rental_return_state')
        if m.get('rental_money') is not None:
            self.rental_money = m.get('rental_money')
        if m.get('penalty_fee_money') is not None:
            self.penalty_fee_money = m.get('penalty_fee_money')
        if m.get('total_money') is not None:
            self.total_money = m.get('total_money')
        if m.get('return_time') is not None:
            self.return_time = m.get('return_time')
        if m.get('return_way') is not None:
            self.return_way = m.get('return_way')
        if m.get('return_voucher_serial') is not None:
            self.return_voucher_serial = m.get('return_voucher_serial')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        return self


class SyncFundOrderfulfillmentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 添加成功
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetFundOrderfulfillmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        term_idx: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 租赁订单所属商家租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 期数
        # 如果填入，获取term_idx下的履约记录
        # 如果不填入，获取order_id下的所有履约记录
        self.term_idx = term_idx

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 49)

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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.term_idx is not None:
            result['term_idx'] = self.term_idx
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('term_idx') is not None:
            self.term_idx = m.get('term_idx')
        return self


class GetFundOrderfulfillmentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_fulfillment_data_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单履约信息的列表数组
        # List<OrderFulfillment> 的jsonArray.toString
        self.order_fulfillment_data_list = order_fulfillment_data_list

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
        if self.order_fulfillment_data_list is not None:
            result['order_fulfillment_data_list'] = self.order_fulfillment_data_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_fulfillment_data_list') is not None:
            self.order_fulfillment_data_list = m.get('order_fulfillment_data_list')
        return self


class UploadFundFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        sign_no: str = None,
        file_item_no: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的订单号
        self.order_id = order_id
        # 签署合同单号
        self.sign_no = sign_no
        # 返回的文件fileItemNo编号
        self.file_item_no = file_item_no
        # 上传的pdf文件，需要以.pdf后缀结尾
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 资方统一社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sign_no, 'sign_no')
        self.validate_required(self.file_item_no, 'file_item_no')
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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.file_item_no is not None:
            result['file_item_no'] = self.file_item_no
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('file_item_no') is not None:
            self.file_item_no = m.get('file_item_no')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class UploadFundFlowResponse(TeaModel):
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


class GetFundFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        contract_type: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的订单号
        self.order_id = order_id
        # 合同类型
        self.contract_type = contract_type
        # 资方统一社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetFundFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        contract_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商户的订单号
        self.order_id = order_id
        # 需要落章的合同列表，需要status状态为FINISH可以落章
        self.contract_list = contract_list

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
        if self.contract_list is not None:
            result['contract_list'] = self.contract_list
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
        if m.get('contract_list') is not None:
            self.contract_list = m.get('contract_list')
        return self


class RefuseFundFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        sign_no: str = None,
        sign_reason: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的订单号
        self.order_id = order_id
        # 签署合同单号
        self.sign_no = sign_no
        # 填写拒绝落章原因，如果同意则不用填写
        self.sign_reason = sign_reason
        # 资方统一社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sign_no, 'sign_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.sign_reason is not None:
            result['sign_reason'] = self.sign_reason
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('sign_reason') is not None:
            self.sign_reason = m.get('sign_reason')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class RefuseFundFlowResponse(TeaModel):
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


class AuthFundFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        sign_no: str = None,
        tag: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的订单号
        self.order_id = order_id
        # 签署的电子合同ID
        self.sign_no = sign_no
        # 签署区域的tag，和发起签署流程的机构的tag对应
        self.tag = tag

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sign_no, 'sign_no')
        self.validate_required(self.tag, 'tag')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.tag is not None:
            result['tag'] = self.tag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        return self


class AuthFundFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_field_ids: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署最后落签的签署区域id列表
        self.sign_field_ids = sign_field_ids

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
        if self.sign_field_ids is not None:
            result['sign_field_ids'] = self.sign_field_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_field_ids') is not None:
            self.sign_field_ids = m.get('sign_field_ids')
        return self


class CancelFundPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        cancel_reason: str = None,
        fund_id: str = None,
        operation: str = None,
        redeem_amount: int = None,
        redeem_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 取消原因
        # ACTIVE_REDEEM:自主赎回
        # RENTING_OUT_REDEEM:退租赎回
        # RENTING_AND_RESALE_REDEEM:租转售赎回
        self.cancel_reason = cancel_reason
        # 融资单的资方社会信用代码
        self.fund_id = fund_id
        # 操作
        self.operation = operation
        # 赎回金额,单位为分,取消并赎回时必填
        self.redeem_amount = redeem_amount
        # 赎回类型，为空默认为 TRANSFER
        # 转账代偿：TRANSFER
        # 代扣代偿：WITHHOLD
        self.redeem_type = redeem_type

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.cancel_reason, 'cancel_reason')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)
        if self.operation is not None:
            self.validate_max_length(self.operation, 'operation', 64)
        if self.redeem_amount is not None:
            self.validate_minimum(self.redeem_amount, 'redeem_amount', 10)
        if self.redeem_type is not None:
            self.validate_max_length(self.redeem_type, 'redeem_type', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.cancel_reason is not None:
            result['cancel_reason'] = self.cancel_reason
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.operation is not None:
            result['operation'] = self.operation
        if self.redeem_amount is not None:
            result['redeem_amount'] = self.redeem_amount
        if self.redeem_type is not None:
            result['redeem_type'] = self.redeem_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('cancel_reason') is not None:
            self.cancel_reason = m.get('cancel_reason')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('operation') is not None:
            self.operation = m.get('operation')
        if m.get('redeem_amount') is not None:
            self.redeem_amount = m.get('redeem_amount')
        if m.get('redeem_type') is not None:
            self.redeem_type = m.get('redeem_type')
        return self


class CancelFundPlanResponse(TeaModel):
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


class CallbackFundNotifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        type: str = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ASYNC_UNSIGN_APPLY
        self.type = type
        # 数据
        self.data = data

    def validate(self):
        self.validate_required(self.type, 'type')
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
        if self.type is not None:
            result['type'] = self.type
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackFundNotifyResponse(TeaModel):
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


class SyncFundMerchantpromiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        biz_content: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # json字符串,填入「MerchantPromiseReq」的json字符串
        self.biz_content = biz_content
        # 资方公司社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.biz_content, 'biz_content')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class SyncFundMerchantpromiseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单id
        self.order_id = order_id
        # 订单所属商家社会信用代码
        self.merchant_id = merchant_id

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
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
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class SyncFundFinanceloanresultsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        biz_content: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 商家的社会信用代码
        self.merchant_id = merchant_id
        # json字符串,填入「FinanceLoanResultsReq」的json字符串
        self.biz_content = biz_content
        # 资方的社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 200)
        self.validate_required(self.biz_content, 'biz_content')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class SyncFundFinanceloanresultsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        merchant_id: str = None,
        loan_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # "ERROR": 放款同步异常
        # “SUCCESS":放款同步成功
        self.loan_result = loan_result

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.loan_result is not None:
            result['loan_result'] = self.loan_result
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
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('loan_result') is not None:
            self.loan_result = m.get('loan_result')
        return self


class GetFundUserpromiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 资方的社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 200)
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetFundUserpromiseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值为「OrderPromise」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetFundUserperformanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 订单所属融资公司的社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 64)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetFundUserperformanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 「UserPerformanceInfo」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetFundMerchantperformanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 订单所属融资方的社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetFundMerchantperformanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 「MerchantPerformanceInfo」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetFundOrderfullinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单Id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 订单所属商户的社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetFundOrderfullinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # OrderFullInfoResp的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class NotifyFundFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        sign_no: str = None,
        file_item_no: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的订单号
        self.order_id = order_id
        # 签署合同单号
        self.sign_no = sign_no
        # 返回的文件fileItemNo编号
        self.file_item_no = file_item_no
        # 资方统一社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sign_no, 'sign_no')
        self.validate_required(self.file_item_no, 'file_item_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.file_item_no is not None:
            result['file_item_no'] = self.file_item_no
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('file_item_no') is not None:
            self.file_item_no = m.get('file_item_no')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class NotifyFundFlowResponse(TeaModel):
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


class UploadFundCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no_type: str = None,
        order_no: str = None,
        fund_id: str = None,
        credit_type: str = None,
        credit_name: str = None,
        content_type: str = None,
        file_url: str = None,
        content: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号类型
        self.order_no_type = order_no_type
        # 订单号，或资产包号
        self.order_no = order_no
        # 资方统一社会信用代码
        self.fund_id = fund_id
        # 凭证类型
        self.credit_type = credit_type
        # 凭证名称
        self.credit_name = credit_name
        # 文本类型
        self.content_type = content_type
        # 文本下载链接，如果类型是FILE则必填
        self.file_url = file_url
        # 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
        self.content = content
        # 商户统一社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_no_type, 'order_no_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.credit_type, 'credit_type')
        self.validate_required(self.content_type, 'content_type')
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no_type is not None:
            result['order_no_type'] = self.order_no_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.credit_type is not None:
            result['credit_type'] = self.credit_type
        if self.credit_name is not None:
            result['credit_name'] = self.credit_name
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.content is not None:
            result['content'] = self.content
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no_type') is not None:
            self.order_no_type = m.get('order_no_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('credit_type') is not None:
            self.credit_type = m.get('credit_type')
        if m.get('credit_name') is not None:
            self.credit_name = m.get('credit_name')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class UploadFundCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 凭证内容id
        self.content_id = content_id

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
        if self.content_id is not None:
            result['content_id'] = self.content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        return self


class QueryFundCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no_type: str = None,
        order_no: str = None,
        fund_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号类型
        self.order_no_type = order_no_type
        # 订单号，或资产包号
        self.order_no = order_no
        # 资方统一社会信用代码
        self.fund_id = fund_id
        # 商户统一社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_no_type, 'order_no_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no_type is not None:
            result['order_no_type'] = self.order_no_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no_type') is not None:
            self.order_no_type = m.get('order_no_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class QueryFundCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内容信息
        self.content_info = content_info

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
        if self.content_info is not None:
            result['content_info'] = self.content_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_info') is not None:
            self.content_info = m.get('content_info')
        return self


class SyncFundFinanceprecheckresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
        result: str = None,
        refuse_reason: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 资方的社会信用代码
        self.fund_id = fund_id
        # 预审结果
        # ● APPROVAL ： 通过
        # ● REFUSE ：拒绝
        self.result = result
        # 拒绝原因
        self.refuse_reason = refuse_reason

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.result, 'result')
        if self.refuse_reason is not None:
            self.validate_max_length(self.refuse_reason, 'refuse_reason', 100)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.result is not None:
            result['result'] = self.result
        if self.refuse_reason is not None:
            result['refuse_reason'] = self.refuse_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('refuse_reason') is not None:
            self.refuse_reason = m.get('refuse_reason')
        return self


class SyncFundFinanceprecheckresultResponse(TeaModel):
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


class QueryFundCompensateaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        fund_id: str = None,
        merchant_id: str = None,
        merchant_tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资方社会信用代码
        self.fund_id = fund_id
        # 商户社会信用代码
        self.merchant_id = merchant_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id

    def validate(self):
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        return self


class QueryFundCompensateaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        available_amount: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 可用余额，单位为分
        self.available_amount = available_amount

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
        if self.available_amount is not None:
            result['available_amount'] = self.available_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('available_amount') is not None:
            self.available_amount = m.get('available_amount')
        return self


class GetFundOrderfinanceinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # order_id
        self.order_id = order_id
        # merchant_id
        self.merchant_id = merchant_id
        # fund_id
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.fund_id, 'fund_id')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetFundOrderfinanceinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # {}
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class AddFundDividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        divide_binding_trans_in_info_list: List[DivideBindingTransInInfo] = None,
        divide_radio: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被分账方社会统一信用代码
        self.merchant_id = merchant_id
        # 分账方信息，最多支持10组
        self.divide_binding_trans_in_info_list = divide_binding_trans_in_info_list
        # 分账比例上限
        self.divide_radio = divide_radio

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.divide_binding_trans_in_info_list, 'divide_binding_trans_in_info_list')
        if self.divide_binding_trans_in_info_list:
            for k in self.divide_binding_trans_in_info_list:
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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        result['divide_binding_trans_in_info_list'] = []
        if self.divide_binding_trans_in_info_list is not None:
            for k in self.divide_binding_trans_in_info_list:
                result['divide_binding_trans_in_info_list'].append(k.to_map() if k else None)
        if self.divide_radio is not None:
            result['divide_radio'] = self.divide_radio
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        self.divide_binding_trans_in_info_list = []
        if m.get('divide_binding_trans_in_info_list') is not None:
            for k in m.get('divide_binding_trans_in_info_list'):
                temp_model = DivideBindingTransInInfo()
                self.divide_binding_trans_in_info_list.append(temp_model.from_map(k))
        if m.get('divide_radio') is not None:
            self.divide_radio = m.get('divide_radio')
        return self


class AddFundDividerelationResponse(TeaModel):
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


class QueryFundDividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被分账方社会统一信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class QueryFundDividerelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        alipay_pid_list: List[str] = None,
        divide_radio: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分账绑定关系支付宝pid
        self.alipay_pid_list = alipay_pid_list
        # 分账比例上限
        self.divide_radio = divide_radio

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
        if self.alipay_pid_list is not None:
            result['alipay_pid_list'] = self.alipay_pid_list
        if self.divide_radio is not None:
            result['divide_radio'] = self.divide_radio
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('alipay_pid_list') is not None:
            self.alipay_pid_list = m.get('alipay_pid_list')
        if m.get('divide_radio') is not None:
            self.divide_radio = m.get('divide_radio')
        return self


class ApplyFundCreditutilizationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_list: List[CreditUtilizationOrder] = None,
        tenant_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
        granting_id: str = None,
        utilization_auth_id: str = None,
        utilization_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单列表
        self.order_list = order_list
        # 商户租户id
        self.tenant_id = tenant_id
        # 商户统一社会信用代码
        self.merchant_id = merchant_id
        # 资方统一社会信用代码
        self.fund_id = fund_id
        # 授信Id
        self.granting_id = granting_id
        # 用信授权id
        self.utilization_auth_id = utilization_auth_id
        # 用信id, 需保证唯一性
        self.utilization_id = utilization_id

    def validate(self):
        self.validate_required(self.order_list, 'order_list')
        if self.order_list:
            for k in self.order_list:
                if k:
                    k.validate()
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.tenant_id is not None:
            self.validate_max_length(self.tenant_id, 'tenant_id', 20)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 200)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 200)
        self.validate_required(self.granting_id, 'granting_id')
        if self.granting_id is not None:
            self.validate_max_length(self.granting_id, 'granting_id', 20)
        self.validate_required(self.utilization_auth_id, 'utilization_auth_id')
        if self.utilization_auth_id is not None:
            self.validate_max_length(self.utilization_auth_id, 'utilization_auth_id', 20)
        self.validate_required(self.utilization_id, 'utilization_id')
        if self.utilization_id is not None:
            self.validate_max_length(self.utilization_id, 'utilization_id', 20)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        result['order_list'] = []
        if self.order_list is not None:
            for k in self.order_list:
                result['order_list'].append(k.to_map() if k else None)
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.granting_id is not None:
            result['granting_id'] = self.granting_id
        if self.utilization_auth_id is not None:
            result['utilization_auth_id'] = self.utilization_auth_id
        if self.utilization_id is not None:
            result['utilization_id'] = self.utilization_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.order_list = []
        if m.get('order_list') is not None:
            for k in m.get('order_list'):
                temp_model = CreditUtilizationOrder()
                self.order_list.append(temp_model.from_map(k))
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('granting_id') is not None:
            self.granting_id = m.get('granting_id')
        if m.get('utilization_auth_id') is not None:
            self.utilization_auth_id = m.get('utilization_auth_id')
        if m.get('utilization_id') is not None:
            self.utilization_id = m.get('utilization_id')
        return self


class ApplyFundCreditutilizationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        utilization_id: str = None,
        utilization_auth_id: str = None,
        asset_package_id: str = None,
        merchant_auth_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用信Id
        self.utilization_id = utilization_id
        # 用信授权id
        self.utilization_auth_id = utilization_auth_id
        # 资产包id
        self.asset_package_id = asset_package_id
        # 商户授权链接
        self.merchant_auth_url = merchant_auth_url

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
        if self.utilization_id is not None:
            result['utilization_id'] = self.utilization_id
        if self.utilization_auth_id is not None:
            result['utilization_auth_id'] = self.utilization_auth_id
        if self.asset_package_id is not None:
            result['asset_package_id'] = self.asset_package_id
        if self.merchant_auth_url is not None:
            result['merchant_auth_url'] = self.merchant_auth_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('utilization_id') is not None:
            self.utilization_id = m.get('utilization_id')
        if m.get('utilization_auth_id') is not None:
            self.utilization_auth_id = m.get('utilization_auth_id')
        if m.get('asset_package_id') is not None:
            self.asset_package_id = m.get('asset_package_id')
        if m.get('merchant_auth_url') is not None:
            self.merchant_auth_url = m.get('merchant_auth_url')
        return self


class ApplyFundAssertorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_id: str = None,
        fund_id: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        biz_no: str = None,
        start_time: str = None,
        end_time: str = None,
        filter_financing_status: bool = None,
        filter_cancel: bool = None,
        filter_early_settlement: bool = None,
        filter_overdue: bool = None,
        filter_retry: bool = None,
        filter_today_pay: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权id
        self.auth_id = auth_id
        # 资方统一社会信用代码
        self.fund_id = fund_id
        # 商户的租户id
        self.tenant_id = tenant_id
        # 商家统一社会信用代码
        self.merchant_id = merchant_id
        # 异步生成文件任务流水号
        self.biz_no = biz_no
        # 查询开始时间
        self.start_time = start_time
        # 查询结束时间
        self.end_time = end_time
        # 是否过滤被其他资方标记的订单（融资申请中+融资申请通过），默认值false
        self.filter_financing_status = filter_financing_status
        # 是否过滤已取消订单 （无剩余应还期数），默认值false
        self.filter_cancel = filter_cancel
        # 是否过滤提前结清订单,默认值false
        self.filter_early_settlement = filter_early_settlement
        # 是否过滤某一期已逾期的订单,默认值false
        self.filter_overdue = filter_overdue
        # 是否过滤最新一期晚于计划扣款日的重试中订单 ,默认值false
        self.filter_retry = filter_retry
        # 是否过滤付款日为当日（查询日）的订单 （当日需执行扣款的）,默认值false
        self.filter_today_pay = filter_today_pay

    def validate(self):
        self.validate_required(self.auth_id, 'auth_id')
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_id is not None:
            result['auth_id'] = self.auth_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.filter_financing_status is not None:
            result['filter_financing_status'] = self.filter_financing_status
        if self.filter_cancel is not None:
            result['filter_cancel'] = self.filter_cancel
        if self.filter_early_settlement is not None:
            result['filter_early_settlement'] = self.filter_early_settlement
        if self.filter_overdue is not None:
            result['filter_overdue'] = self.filter_overdue
        if self.filter_retry is not None:
            result['filter_retry'] = self.filter_retry
        if self.filter_today_pay is not None:
            result['filter_today_pay'] = self.filter_today_pay
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_id') is not None:
            self.auth_id = m.get('auth_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('filter_financing_status') is not None:
            self.filter_financing_status = m.get('filter_financing_status')
        if m.get('filter_cancel') is not None:
            self.filter_cancel = m.get('filter_cancel')
        if m.get('filter_early_settlement') is not None:
            self.filter_early_settlement = m.get('filter_early_settlement')
        if m.get('filter_overdue') is not None:
            self.filter_overdue = m.get('filter_overdue')
        if m.get('filter_retry') is not None:
            self.filter_retry = m.get('filter_retry')
        if m.get('filter_today_pay') is not None:
            self.filter_today_pay = m.get('filter_today_pay')
        return self


class ApplyFundAssertorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务状态
        # ● RUNNING:生成中
        # ● SUCCESS:已生成
        # ● FAILED:失败
        self.task_status = task_status

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
        if self.task_status is not None:
            result['task_status'] = self.task_status
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
        return self


class QueryFundAssertorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_id: str = None,
        fund_id: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权id
        self.auth_id = auth_id
        # 资方统一社会信用代码
        self.fund_id = fund_id
        # 商户的租户id
        self.tenant_id = tenant_id
        # 商家统一社会信用代码
        self.merchant_id = merchant_id
        # 异步生成文件任务流水号
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.auth_id, 'auth_id')
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_id is not None:
            result['auth_id'] = self.auth_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_id') is not None:
            self.auth_id = m.get('auth_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class QueryFundAssertorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[OrderPromiseExcelInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用信订单履约信息
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = OrderPromiseExcelInfo()
                self.data.append(temp_model.from_map(k))
        return self


class SyncFundCreditgrantingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        granting_id: str = None,
        auth_id: str = None,
        fund_id: str = None,
        merchant_id: str = None,
        tenant_id: str = None,
        granting_line: int = None,
        effect_start_time: str = None,
        effect_end_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授信id
        self.granting_id = granting_id
        # 授信授权id
        self.auth_id = auth_id
        # 资方社会信用代码
        self.fund_id = fund_id
        # 商户社会信用代码
        self.merchant_id = merchant_id
        # 商户租户id
        self.tenant_id = tenant_id
        # 授信额度，单位为分
        self.granting_line = granting_line
        # 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
        self.effect_start_time = effect_start_time
        # 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
        self.effect_end_time = effect_end_time

    def validate(self):
        self.validate_required(self.granting_id, 'granting_id')
        if self.granting_id is not None:
            self.validate_max_length(self.granting_id, 'granting_id', 20)
        self.validate_required(self.auth_id, 'auth_id')
        if self.auth_id is not None:
            self.validate_max_length(self.auth_id, 'auth_id', 20)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 32)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 32)
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.tenant_id is not None:
            self.validate_max_length(self.tenant_id, 'tenant_id', 32)
        self.validate_required(self.granting_line, 'granting_line')
        if self.granting_line is not None:
            self.validate_minimum(self.granting_line, 'granting_line', 1)
        self.validate_required(self.effect_start_time, 'effect_start_time')
        if self.effect_start_time is not None:
            self.validate_max_length(self.effect_start_time, 'effect_start_time', 20)
        self.validate_required(self.effect_end_time, 'effect_end_time')
        if self.effect_end_time is not None:
            self.validate_max_length(self.effect_end_time, 'effect_end_time', 20)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.granting_id is not None:
            result['granting_id'] = self.granting_id
        if self.auth_id is not None:
            result['auth_id'] = self.auth_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.granting_line is not None:
            result['granting_line'] = self.granting_line
        if self.effect_start_time is not None:
            result['effect_start_time'] = self.effect_start_time
        if self.effect_end_time is not None:
            result['effect_end_time'] = self.effect_end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('granting_id') is not None:
            self.granting_id = m.get('granting_id')
        if m.get('auth_id') is not None:
            self.auth_id = m.get('auth_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('granting_line') is not None:
            self.granting_line = m.get('granting_line')
        if m.get('effect_start_time') is not None:
            self.effect_start_time = m.get('effect_start_time')
        if m.get('effect_end_time') is not None:
            self.effect_end_time = m.get('effect_end_time')
        return self


class SyncFundCreditgrantingResponse(TeaModel):
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


class AuthFundCreditgrantingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
        auth_id: str = None,
        auth_begin_time: str = None,
        auth_end_time: str = None,
        order_query_begin: str = None,
        order_query_end: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 商户统一社会信用代码
        self.merchant_id = merchant_id
        # 资方统一社会信用代码
        self.fund_id = fund_id
        # 授权id
        self.auth_id = auth_id
        # 授权开始时间，格式为yyyy-MM-dd
        self.auth_begin_time = auth_begin_time
        # 授权结束时间，格式为yyyy-MM-dd
        self.auth_end_time = auth_end_time
        # 订单查询开始时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_begin_time之后。
        self.order_query_begin = order_query_begin
        # 订单查询结束时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_end_time之前
        self.order_query_end = order_query_end

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.auth_id, 'auth_id')
        self.validate_required(self.order_query_begin, 'order_query_begin')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.auth_id is not None:
            result['auth_id'] = self.auth_id
        if self.auth_begin_time is not None:
            result['auth_begin_time'] = self.auth_begin_time
        if self.auth_end_time is not None:
            result['auth_end_time'] = self.auth_end_time
        if self.order_query_begin is not None:
            result['order_query_begin'] = self.order_query_begin
        if self.order_query_end is not None:
            result['order_query_end'] = self.order_query_end
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('auth_id') is not None:
            self.auth_id = m.get('auth_id')
        if m.get('auth_begin_time') is not None:
            self.auth_begin_time = m.get('auth_begin_time')
        if m.get('auth_end_time') is not None:
            self.auth_end_time = m.get('auth_end_time')
        if m.get('order_query_begin') is not None:
            self.order_query_begin = m.get('order_query_begin')
        if m.get('order_query_end') is not None:
            self.order_query_end = m.get('order_query_end')
        return self


class AuthFundCreditgrantingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        merchant_auth_url: str = None,
        auth_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商家授权链接
        self.merchant_auth_url = merchant_auth_url
        # 传入的auth_id
        self.auth_id = auth_id

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
        if self.merchant_auth_url is not None:
            result['merchant_auth_url'] = self.merchant_auth_url
        if self.auth_id is not None:
            result['auth_id'] = self.auth_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('merchant_auth_url') is not None:
            self.merchant_auth_url = m.get('merchant_auth_url')
        if m.get('auth_id') is not None:
            self.auth_id = m.get('auth_id')
        return self


class QueryFundAssertreportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_id: str = None,
        fund_id: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权id
        self.auth_id = auth_id
        # 资方统一社会信用代码
        self.fund_id = fund_id
        # 商户的租户id
        self.tenant_id = tenant_id
        # 商家统一社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.auth_id, 'auth_id')
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_id is not None:
            result['auth_id'] = self.auth_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_id') is not None:
            self.auth_id = m.get('auth_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class QueryFundAssertreportResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[FundAssertReport] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产报告详情
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
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = FundAssertReport()
                self.data.append(temp_model.from_map(k))
        return self


class QueryFundCreditgrantingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        granting_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授信id
        self.granting_id = granting_id
        # 资方社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.granting_id, 'granting_id')
        if self.granting_id is not None:
            self.validate_max_length(self.granting_id, 'granting_id', 20)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.granting_id is not None:
            result['granting_id'] = self.granting_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('granting_id') is not None:
            self.granting_id = m.get('granting_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class QueryFundCreditgrantingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        granting_id: str = None,
        auth_id: str = None,
        fund_id: str = None,
        merchant_id: str = None,
        tenant_id: str = None,
        granting_line: int = None,
        effect_start_time: str = None,
        effect_end_time: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授信id
        self.granting_id = granting_id
        # 授信授权id
        self.auth_id = auth_id
        # 资方社会信用代码
        self.fund_id = fund_id
        # 商户社会信用代码
        self.merchant_id = merchant_id
        # 商户租户id
        # 
        self.tenant_id = tenant_id
        # 授信额度，单位为分
        self.granting_line = granting_line
        # 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
        self.effect_start_time = effect_start_time
        # 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
        self.effect_end_time = effect_end_time
        # 授信状态
        # CREDITED:已授信
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
        if self.granting_id is not None:
            result['granting_id'] = self.granting_id
        if self.auth_id is not None:
            result['auth_id'] = self.auth_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.granting_line is not None:
            result['granting_line'] = self.granting_line
        if self.effect_start_time is not None:
            result['effect_start_time'] = self.effect_start_time
        if self.effect_end_time is not None:
            result['effect_end_time'] = self.effect_end_time
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
        if m.get('granting_id') is not None:
            self.granting_id = m.get('granting_id')
        if m.get('auth_id') is not None:
            self.auth_id = m.get('auth_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('granting_line') is not None:
            self.granting_line = m.get('granting_line')
        if m.get('effect_start_time') is not None:
            self.effect_start_time = m.get('effect_start_time')
        if m.get('effect_end_time') is not None:
            self.effect_end_time = m.get('effect_end_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryFundCreditauthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        fund_id: str = None,
        auth_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资方社会引用代码
        self.fund_id = fund_id
        # 授权id
        self.auth_id = auth_id

    def validate(self):
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.auth_id, 'auth_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.auth_id is not None:
            result['auth_id'] = self.auth_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('auth_id') is not None:
            self.auth_id = m.get('auth_id')
        return self


class QueryFundCreditauthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_id: str = None,
        auth_type: str = None,
        auth_result: str = None,
        auth_begin_time: str = None,
        auth_end_time: str = None,
        auth_apply_expire_time: str = None,
        auth_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权id
        self.auth_id = auth_id
        # 授权类型
        # ● CREDIT_GRANTING 授信
        # ● CREDIT_UTILIZATION 用信
        self.auth_type = auth_type
        # 授权结果
        # AUTHORIZED 已同意
        # REJECTED 已拒绝
        # EXPIRED 已过期
        self.auth_result = auth_result
        # 授权开始时间
        self.auth_begin_time = auth_begin_time
        # 授权结束时间
        self.auth_end_time = auth_end_time
        # 授权申请过期时间
        self.auth_apply_expire_time = auth_apply_expire_time
        # 授信/用信授权信息,json结构
        self.auth_info = auth_info

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
        if self.auth_id is not None:
            result['auth_id'] = self.auth_id
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.auth_result is not None:
            result['auth_result'] = self.auth_result
        if self.auth_begin_time is not None:
            result['auth_begin_time'] = self.auth_begin_time
        if self.auth_end_time is not None:
            result['auth_end_time'] = self.auth_end_time
        if self.auth_apply_expire_time is not None:
            result['auth_apply_expire_time'] = self.auth_apply_expire_time
        if self.auth_info is not None:
            result['auth_info'] = self.auth_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_id') is not None:
            self.auth_id = m.get('auth_id')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('auth_result') is not None:
            self.auth_result = m.get('auth_result')
        if m.get('auth_begin_time') is not None:
            self.auth_begin_time = m.get('auth_begin_time')
        if m.get('auth_end_time') is not None:
            self.auth_end_time = m.get('auth_end_time')
        if m.get('auth_apply_expire_time') is not None:
            self.auth_apply_expire_time = m.get('auth_apply_expire_time')
        if m.get('auth_info') is not None:
            self.auth_info = m.get('auth_info')
        return self


class QueryFundAssetpackageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        fund_id: str = None,
        merchant_id: str = None,
        tenant_id: str = None,
        utilization_id: str = None,
        asset_package_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资方社会信用代码
        self.fund_id = fund_id
        # 商家统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的租户id
        self.tenant_id = tenant_id
        # 用信id
        self.utilization_id = utilization_id
        # 资产包id
        self.asset_package_id = asset_package_id

    def validate(self):
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 200)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 200)
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.tenant_id is not None:
            self.validate_max_length(self.tenant_id, 'tenant_id', 10)
        if self.utilization_id is not None:
            self.validate_max_length(self.utilization_id, 'utilization_id', 32)
        self.validate_required(self.asset_package_id, 'asset_package_id')
        if self.asset_package_id is not None:
            self.validate_max_length(self.asset_package_id, 'asset_package_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.utilization_id is not None:
            result['utilization_id'] = self.utilization_id
        if self.asset_package_id is not None:
            result['asset_package_id'] = self.asset_package_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('utilization_id') is not None:
            self.utilization_id = m.get('utilization_id')
        if m.get('asset_package_id') is not None:
            self.asset_package_id = m.get('asset_package_id')
        return self


class QueryFundAssetpackageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        asset_package_id: str = None,
        utilization_id: str = None,
        status: str = None,
        gmt_grouping_end: str = None,
        order_list: List[AssetPackageOrderInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产包id
        self.asset_package_id = asset_package_id
        # 用信id
        self.utilization_id = utilization_id
        # 资产包状态
        self.status = status
        # 组包完成时间， yyyy-MM-dd HH:mm:ss
        self.gmt_grouping_end = gmt_grouping_end
        # 订单列表
        self.order_list = order_list

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
        if self.asset_package_id is not None:
            result['asset_package_id'] = self.asset_package_id
        if self.utilization_id is not None:
            result['utilization_id'] = self.utilization_id
        if self.status is not None:
            result['status'] = self.status
        if self.gmt_grouping_end is not None:
            result['gmt_grouping_end'] = self.gmt_grouping_end
        result['order_list'] = []
        if self.order_list is not None:
            for k in self.order_list:
                result['order_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('asset_package_id') is not None:
            self.asset_package_id = m.get('asset_package_id')
        if m.get('utilization_id') is not None:
            self.utilization_id = m.get('utilization_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('gmt_grouping_end') is not None:
            self.gmt_grouping_end = m.get('gmt_grouping_end')
        self.order_list = []
        if m.get('order_list') is not None:
            for k in m.get('order_list'):
                temp_model = AssetPackageOrderInfo()
                self.order_list.append(temp_model.from_map(k))
        return self


class ConfirmFundUsercancelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 融资单的资方社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class ConfirmFundUsercancelResponse(TeaModel):
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


class RepayFundPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
        term_index: int = None,
        amount: int = None,
        payment_description: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 融资单的资方社会信用代码
        self.fund_id = fund_id
        # 商户履约的期数
        self.term_index = term_index
        # 还款金额
        self.amount = amount
        # 支付描述
        self.payment_description = payment_description

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)
        self.validate_required(self.term_index, 'term_index')
        if self.term_index is not None:
            self.validate_minimum(self.term_index, 'term_index', 1)
        self.validate_required(self.amount, 'amount')
        if self.amount is not None:
            self.validate_minimum(self.amount, 'amount', 0)
        self.validate_required(self.payment_description, 'payment_description')
        if self.payment_description is not None:
            self.validate_max_length(self.payment_description, 'payment_description', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.term_index is not None:
            result['term_index'] = self.term_index
        if self.amount is not None:
            result['amount'] = self.amount
        if self.payment_description is not None:
            result['payment_description'] = self.payment_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('term_index') is not None:
            self.term_index = m.get('term_index')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('payment_description') is not None:
            self.payment_description = m.get('payment_description')
        return self


class RepayFundPlanResponse(TeaModel):
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


class GetFundCompensatesignurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        fund_id: str = None,
        merchant_tenant_id: str = None,
        merchant_id: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资方社会统一信用代码
        self.fund_id = fund_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 商户社会统一信用代码
        self.merchant_id = merchant_id
        # 签约串类型
        # TRANSFER:转账代偿签约串
        # WITHHOLD:代扣代偿签约串
        self.type = type

    def validate(self):
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class GetFundCompensatesignurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约链接
        self.sign_url = sign_url

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
        if self.sign_url is not None:
            result['sign_url'] = self.sign_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_url') is not None:
            self.sign_url = m.get('sign_url')
        return self


class ConfirmFundCompensateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        fund_id: str = None,
        merchant_tenant_id: str = None,
        merchant_id: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资方社会统一信用代码
        self.fund_id = fund_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 商户社会统一信用代码
        self.merchant_id = merchant_id
        # 签约串类型
        # TRANSFER:转账代偿签约串
        # WITHHOLD:代扣代偿签约串
        self.type = type

    def validate(self):
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class ConfirmFundCompensateResponse(TeaModel):
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


class GetInnerProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        merchant_id: str = None,
        product_id: str = None,
        product_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户在数科的租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 商户统一社会信用代码
        self.merchant_id = merchant_id
        # 商品id
        self.product_id = product_id
        # 商品版本
        self.product_version = product_version

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 32)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 199)
        self.validate_required(self.product_id, 'product_id')
        if self.product_id is not None:
            self.validate_max_length(self.product_id, 'product_id', 32)
        self.validate_required(self.product_version, 'product_version')
        if self.product_version is not None:
            self.validate_max_length(self.product_version, 'product_version', 10)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.product_version is not None:
            result['product_version'] = self.product_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('product_version') is not None:
            self.product_version = m.get('product_version')
        return self


class GetInnerProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # {}json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetInnerTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户在数科的租户id
        self.merchant_tenant_id = merchant_tenant_id

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        return self


class GetInnerTenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # {}租户信息
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class SyncInnerMeterforwholeorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        merchant_id: str = None,
        meter_product_code: str = None,
        order_id: str = None,
        order_rent_term: int = None,
        order_total_money: int = None,
        sys_name: str = None,
        order_product_subclass: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 商户统一社会信用代码
        self.merchant_id = merchant_id
        # 商户购买的产品code
        self.meter_product_code = meter_product_code
        # 订单id
        self.order_id = order_id
        # 订单总租期
        self.order_rent_term = order_rent_term
        # 订单总租金，单位为分
        self.order_total_money = order_total_money
        # 系统名称
        self.sys_name = sys_name
        # 订单产品的二级类目
        self.order_product_subclass = order_product_subclass

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 32)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 199)
        self.validate_required(self.meter_product_code, 'meter_product_code')
        if self.meter_product_code is not None:
            self.validate_max_length(self.meter_product_code, 'meter_product_code', 64)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.order_rent_term, 'order_rent_term')
        self.validate_required(self.order_total_money, 'order_total_money')
        self.validate_required(self.sys_name, 'sys_name')
        if self.sys_name is not None:
            self.validate_max_length(self.sys_name, 'sys_name', 32)
        self.validate_required(self.order_product_subclass, 'order_product_subclass')
        if self.order_product_subclass is not None:
            self.validate_max_length(self.order_product_subclass, 'order_product_subclass', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.meter_product_code is not None:
            result['meter_product_code'] = self.meter_product_code
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_rent_term is not None:
            result['order_rent_term'] = self.order_rent_term
        if self.order_total_money is not None:
            result['order_total_money'] = self.order_total_money
        if self.sys_name is not None:
            result['sys_name'] = self.sys_name
        if self.order_product_subclass is not None:
            result['order_product_subclass'] = self.order_product_subclass
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('meter_product_code') is not None:
            self.meter_product_code = m.get('meter_product_code')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_rent_term') is not None:
            self.order_rent_term = m.get('order_rent_term')
        if m.get('order_total_money') is not None:
            self.order_total_money = m.get('order_total_money')
        if m.get('sys_name') is not None:
            self.sys_name = m.get('sys_name')
        if m.get('order_product_subclass') is not None:
            self.order_product_subclass = m.get('order_product_subclass')
        return self


class SyncInnerMeterforwholeorderResponse(TeaModel):
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


class SyncInnerMeterforagsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        merchant_id: str = None,
        meter_product_code: str = None,
        sys_name: str = None,
        order_id: str = None,
        sign_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 商户社会信用代码
        self.merchant_id = merchant_id
        # 计量上报Code
        self.meter_product_code = meter_product_code
        # 系统名字
        self.sys_name = sys_name
        # 订单id
        self.order_id = order_id
        # 合同编号
        self.sign_no = sign_no

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 32)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 199)
        self.validate_required(self.meter_product_code, 'meter_product_code')
        if self.meter_product_code is not None:
            self.validate_max_length(self.meter_product_code, 'meter_product_code', 64)
        self.validate_required(self.sys_name, 'sys_name')
        if self.sys_name is not None:
            self.validate_max_length(self.sys_name, 'sys_name', 32)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.sign_no, 'sign_no')
        if self.sign_no is not None:
            self.validate_max_length(self.sign_no, 'sign_no', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.meter_product_code is not None:
            result['meter_product_code'] = self.meter_product_code
        if self.sys_name is not None:
            result['sys_name'] = self.sys_name
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('meter_product_code') is not None:
            self.meter_product_code = m.get('meter_product_code')
        if m.get('sys_name') is not None:
            self.sys_name = m.get('sys_name')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        return self


class SyncInnerMeterforagsignResponse(TeaModel):
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


class AllInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_info: PageQuery = None,
        tenant_id: str = None,
        template_code: str = None,
        template_name: str = None,
        template_code_prod: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分页查询结构体
        self.page_info = page_info
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板文件名称
        self.template_name = template_name
        # 线上模板ID
        self.template_code_prod = template_code_prod

    def validate(self):
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.template_code_prod is not None:
            result['template_code_prod'] = self.template_code_prod
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('template_code_prod') is not None:
            self.template_code_prod = m.get('template_code_prod')
        return self


class AllInnerTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板列表数据
        self.template_list = template_list

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
        if self.template_list is not None:
            result['template_list'] = self.template_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_list') is not None:
            self.template_list = m.get('template_list')
        return self


class ListInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_info: PageQuery = None,
        tenant_id: str = None,
        template_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分页查询
        self.page_info = page_info
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code

    def validate(self):
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        return self


class ListInnerTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板列表数据
        self.template_list = template_list

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
        if self.template_list is not None:
            result['template_list'] = self.template_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_list') is not None:
            self.template_list = m.get('template_list')
        return self


class DetailInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class DetailInnerTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板详情信息
        self.template_info = template_info

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
        if self.template_info is not None:
            result['template_info'] = self.template_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_info') is not None:
            self.template_info = m.get('template_info')
        return self


class CreateInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_name: str = None,
        file_key: str = None,
        file_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 创建的模板名称
        self.template_name = template_name
        # 文件oss存储的key
        self.file_key = file_key
        # 模板文件的名称
        self.file_name = file_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_name, 'template_name')
        if self.template_name is not None:
            self.validate_max_length(self.template_name, 'template_name', 32)

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
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.file_key is not None:
            result['file_key'] = self.file_key
        if self.file_name is not None:
            result['file_name'] = self.file_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        return self


class CreateInnerTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 魔法库模板code
        self.template_code = template_code

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        return self


class SaveInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
        preview_address: str = None,
        template_element_list: str = None,
        file_key: str = None,
        confirm: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version
        # 文件预览地址
        self.preview_address = preview_address
        # 创建模板的元素列表
        self.template_element_list = template_element_list
        # 文件oss存储的key
        self.file_key = file_key
        # 是否确认保存。点击”保存“按钮传false、点击”下一步“按钮传true
        self.confirm = confirm

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')
        self.validate_required(self.preview_address, 'preview_address')
        self.validate_required(self.file_key, 'file_key')
        self.validate_required(self.confirm, 'confirm')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.preview_address is not None:
            result['preview_address'] = self.preview_address
        if self.template_element_list is not None:
            result['template_element_list'] = self.template_element_list
        if self.file_key is not None:
            result['file_key'] = self.file_key
        if self.confirm is not None:
            result['confirm'] = self.confirm
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('preview_address') is not None:
            self.preview_address = m.get('preview_address')
        if m.get('template_element_list') is not None:
            self.template_element_list = m.get('template_element_list')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        if m.get('confirm') is not None:
            self.confirm = m.get('confirm')
        return self


class SaveInnerTemplateResponse(TeaModel):
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


class SaveInnerSignfieldsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
        sign_field_list: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version
        # 模板签署区列表
        self.sign_field_list = sign_field_list

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')
        self.validate_required(self.sign_field_list, 'sign_field_list')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.sign_field_list is not None:
            result['sign_field_list'] = self.sign_field_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('sign_field_list') is not None:
            self.sign_field_list = m.get('sign_field_list')
        return self


class SaveInnerSignfieldsResponse(TeaModel):
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


class PublishInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version_id: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库版本id
        self.template_version_id = template_version_id
        # 合同模板制作版本id
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version_id, 'template_version_id')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version_id is not None:
            result['template_version_id'] = self.template_version_id
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version_id') is not None:
            self.template_version_id = m.get('template_version_id')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class PublishInnerTemplateResponse(TeaModel):
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


class PreviewInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        file_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 文件oss存储的key
        self.file_key = file_key

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.file_key, 'file_key')

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
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class PreviewInnerTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预览接口返回
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
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class DeleteInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
        template_version_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version
        # 魔法库模板版本id
        self.template_version_id = template_version_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')
        self.validate_required(self.template_version_id, 'template_version_id')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.template_version_id is not None:
            result['template_version_id'] = self.template_version_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('template_version_id') is not None:
            self.template_version_id = m.get('template_version_id')
        return self


class DeleteInnerTemplateResponse(TeaModel):
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


class CloneInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        voucher_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 模板code
        self.template_code = template_code
        # 魔法库对应模板的模板复制id
        self.voucher_id = voucher_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.voucher_id, 'voucher_id')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.voucher_id is not None:
            result['voucher_id'] = self.voucher_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('voucher_id') is not None:
            self.voucher_id = m.get('voucher_id')
        return self


class CloneInnerTemplateResponse(TeaModel):
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


class UploadInnerFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        file_name: str = None,
        biz_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 文件名称
        self.file_name = file_name
        # ● BUSINESS_LICENSE 营业执照
        # ● CARD_FRONT 身份证正面
        # ● CARD_BACK 身份证反面
        # ● SPLITTING 分账
        # ● CONTRACT_TEMPLATE 合同模板
        self.biz_scene = biz_scene

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.file_name, 'file_name')
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        return self


class UploadInnerFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        upload_url: str = None,
        file_key: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 临时上传地址
        self.upload_url = upload_url
        # 文件key
        self.file_key = file_key

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
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class DownloadInnerFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        file_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 文件key
        self.file_key = file_key

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.file_key, 'file_key')

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
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class DownloadInnerFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        download_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件临时下载地址
        self.download_url = download_url

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
        if self.download_url is not None:
            result['download_url'] = self.download_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        return self


class GetInnerTemplateofficeurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class GetInnerTemplateofficeurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值
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
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class RefreshInnerTemplatetokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        access_token: str = None,
        refresh_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # accessToken
        self.access_token = access_token
        # refreshToekn
        self.refresh_token = refresh_token

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.refresh_token, 'refresh_token')

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
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.refresh_token is not None:
            result['refresh_token'] = self.refresh_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('refresh_token') is not None:
            self.refresh_token = m.get('refresh_token')
        return self


class RefreshInnerTemplatetokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值
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
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CreateInnerTemplatetextareaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
        component_type: str = None,
        component_name: str = None,
        required: bool = None,
        line: int = None,
        multi_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 模板编码
        self.template_code = template_code
        # 模板版本号
        self.template_version = template_version
        # 组件类型，INPUT:单行文本 TEXTAREA:多行文本
        self.component_type = component_type
        # 组件名称（占位符）
        self.component_name = component_name
        # 是否必填
        self.required = required
        # 预估文本行数
        self.line = line
        # 多行文本域名称
        self.multi_name = multi_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')
        self.validate_required(self.component_type, 'component_type')
        self.validate_required(self.component_name, 'component_name')
        self.validate_required(self.required, 'required')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.component_type is not None:
            result['component_type'] = self.component_type
        if self.component_name is not None:
            result['component_name'] = self.component_name
        if self.required is not None:
            result['required'] = self.required
        if self.line is not None:
            result['line'] = self.line
        if self.multi_name is not None:
            result['multi_name'] = self.multi_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('component_type') is not None:
            self.component_type = m.get('component_type')
        if m.get('component_name') is not None:
            self.component_name = m.get('component_name')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('line') is not None:
            self.line = m.get('line')
        if m.get('multi_name') is not None:
            self.multi_name = m.get('multi_name')
        return self


class CreateInnerTemplatetextareaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建成功的文本域组件信息
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
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryInnerTemplateimageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        page_info: PageQuery = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 分页查询结构体
        self.page_info = page_info
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class QueryInnerTemplateimageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板图片列表
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
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CreateInnerFunddividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        relation_id: str = None,
        company_name: str = None,
        merchant_id: str = None,
        contract_files: List[FileInfo] = None,
        desc: str = None,
        alipay_pid: str = None,
        alipay_account: str = None,
        submit: str = None,
        user_name: str = None,
        subject_merchant_id: str = None,
        expand_mode: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 第一次暂存或提交可以不传，由后端生成
        self.relation_id = relation_id
        # 分账公司名称
        self.company_name = company_name
        # 分账公司社会信用代码
        self.merchant_id = merchant_id
        # 分账合同或协议
        self.contract_files = contract_files
        # 分账关系说明
        self.desc = desc
        # 分账方企业pid
        self.alipay_pid = alipay_pid
        # 分账方企业支付宝账号
        self.alipay_account = alipay_account
        # 是否直接提交
        # SUBMITTED 直接提交
        # STAGE 暂存
        self.submit = submit
        # 操作人名称
        self.user_name = user_name
        # 商户公司社会统一信用代码,
        # 如果expandMode=AGENT, 非空，长度不超过32位
        self.subject_merchant_id = subject_merchant_id
        # 进件模式	:DIRECT(直连进件) ,AGENT(代理进件)
        # 默认值：DIRECT
        self.expand_mode = expand_mode

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.contract_files:
            for k in self.contract_files:
                if k:
                    k.validate()
        self.validate_required(self.submit, 'submit')
        self.validate_required(self.user_name, 'user_name')

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
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        result['contract_files'] = []
        if self.contract_files is not None:
            for k in self.contract_files:
                result['contract_files'].append(k.to_map() if k else None)
        if self.desc is not None:
            result['desc'] = self.desc
        if self.alipay_pid is not None:
            result['alipay_pid'] = self.alipay_pid
        if self.alipay_account is not None:
            result['alipay_account'] = self.alipay_account
        if self.submit is not None:
            result['submit'] = self.submit
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.subject_merchant_id is not None:
            result['subject_merchant_id'] = self.subject_merchant_id
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        self.contract_files = []
        if m.get('contract_files') is not None:
            for k in m.get('contract_files'):
                temp_model = FileInfo()
                self.contract_files.append(temp_model.from_map(k))
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('alipay_pid') is not None:
            self.alipay_pid = m.get('alipay_pid')
        if m.get('alipay_account') is not None:
            self.alipay_account = m.get('alipay_account')
        if m.get('submit') is not None:
            self.submit = m.get('submit')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('subject_merchant_id') is not None:
            self.subject_merchant_id = m.get('subject_merchant_id')
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        return self


class CreateInnerFunddividerelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        relation_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分账关系id
        self.relation_id = relation_id

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
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        return self


class SubmitInnerFunddividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        relation_id: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 分账关系id
        self.relation_id = relation_id
        # 操作人名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.relation_id, 'relation_id')
        self.validate_required(self.user_name, 'user_name')

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
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class SubmitInnerFunddividerelationResponse(TeaModel):
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


class QueryInnerFunddividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        relation_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 分账关系id
        self.relation_id = relation_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.relation_id, 'relation_id')

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
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        return self


class QueryInnerFunddividerelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_name: str = None,
        subject_merchant_id: str = None,
        subject_company_name: str = None,
        merchant_id: str = None,
        contract_files: List[FileInfo] = None,
        desc: str = None,
        alipay_pid: str = None,
        alipay_account: str = None,
        audit_infos: List[AuditInfo] = None,
        relation_status: str = None,
        relation_fail_reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分账公司名称
        self.company_name = company_name
        # 分账主体企业统一社会信用代码
        self.subject_merchant_id = subject_merchant_id
        # 分账主体公司名称
        self.subject_company_name = subject_company_name
        # 分账对象统一社会信用代码
        self.merchant_id = merchant_id
        # 分账合同或协议
        self.contract_files = contract_files
        # 分账关系说明
        self.desc = desc
        # 分账方企业pid
        self.alipay_pid = alipay_pid
        # 分账方企业支付宝账号
        self.alipay_account = alipay_account
        # 审核列表
        self.audit_infos = audit_infos
        # INIT:待提交 AUDIT:审批中 AUDIT_PASSED:审批通过 AUDIT_NOT_PASSED:审批不通过
        self.relation_status = relation_status
        # 分账关系绑定失败原因
        self.relation_fail_reason = relation_fail_reason

    def validate(self):
        if self.contract_files:
            for k in self.contract_files:
                if k:
                    k.validate()
        if self.audit_infos:
            for k in self.audit_infos:
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
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.subject_merchant_id is not None:
            result['subject_merchant_id'] = self.subject_merchant_id
        if self.subject_company_name is not None:
            result['subject_company_name'] = self.subject_company_name
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        result['contract_files'] = []
        if self.contract_files is not None:
            for k in self.contract_files:
                result['contract_files'].append(k.to_map() if k else None)
        if self.desc is not None:
            result['desc'] = self.desc
        if self.alipay_pid is not None:
            result['alipay_pid'] = self.alipay_pid
        if self.alipay_account is not None:
            result['alipay_account'] = self.alipay_account
        result['audit_infos'] = []
        if self.audit_infos is not None:
            for k in self.audit_infos:
                result['audit_infos'].append(k.to_map() if k else None)
        if self.relation_status is not None:
            result['relation_status'] = self.relation_status
        if self.relation_fail_reason is not None:
            result['relation_fail_reason'] = self.relation_fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('subject_merchant_id') is not None:
            self.subject_merchant_id = m.get('subject_merchant_id')
        if m.get('subject_company_name') is not None:
            self.subject_company_name = m.get('subject_company_name')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        self.contract_files = []
        if m.get('contract_files') is not None:
            for k in m.get('contract_files'):
                temp_model = FileInfo()
                self.contract_files.append(temp_model.from_map(k))
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('alipay_pid') is not None:
            self.alipay_pid = m.get('alipay_pid')
        if m.get('alipay_account') is not None:
            self.alipay_account = m.get('alipay_account')
        self.audit_infos = []
        if m.get('audit_infos') is not None:
            for k in m.get('audit_infos'):
                temp_model = AuditInfo()
                self.audit_infos.append(temp_model.from_map(k))
        if m.get('relation_status') is not None:
            self.relation_status = m.get('relation_status')
        if m.get('relation_fail_reason') is not None:
            self.relation_fail_reason = m.get('relation_fail_reason')
        return self


class PagequeryInnerFunddividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        page_info: PageQuery = None,
        subject_merchant_id: str = None,
        subject_company_name: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 分页查询对象
        self.page_info = page_info
        # 商户公司社会统一信用代码
        self.subject_merchant_id = subject_merchant_id
        # 商户公司名称
        self.subject_company_name = subject_company_name
        # 状态
        # NIT:待提交
        # AUDIT:审批中 AUDIT_PASSED:审批通过
        # AUDIT_NOT_PASSED:审批不通过
        self.status = status

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.subject_merchant_id is not None:
            result['subject_merchant_id'] = self.subject_merchant_id
        if self.subject_company_name is not None:
            result['subject_company_name'] = self.subject_company_name
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('subject_merchant_id') is not None:
            self.subject_merchant_id = m.get('subject_merchant_id')
        if m.get('subject_company_name') is not None:
            self.subject_company_name = m.get('subject_company_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class PagequeryInnerFunddividerelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_size: int = None,
        relations: List[RelationPage] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据总量
        self.total_size = total_size
        # 分账关系页对象列表
        self.relations = relations

    def validate(self):
        if self.relations:
            for k in self.relations:
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
        if self.total_size is not None:
            result['total_size'] = self.total_size
        result['relations'] = []
        if self.relations is not None:
            for k in self.relations:
                result['relations'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        self.relations = []
        if m.get('relations') is not None:
            for k in m.get('relations'):
                temp_model = RelationPage()
                self.relations.append(temp_model.from_map(k))
        return self


class CreateInnerMerchantagreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        agreement_id: str = None,
        sign_action: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 协议编号
        self.agreement_id = agreement_id
        # 签署动作
        self.sign_action = sign_action
        # 操作人名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.agreement_id, 'agreement_id')
        self.validate_required(self.sign_action, 'sign_action')
        self.validate_required(self.user_name, 'user_name')

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
        if self.agreement_id is not None:
            result['agreement_id'] = self.agreement_id
        if self.sign_action is not None:
            result['sign_action'] = self.sign_action
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('agreement_id') is not None:
            self.agreement_id = m.get('agreement_id')
        if m.get('sign_action') is not None:
            self.sign_action = m.get('sign_action')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class CreateInnerMerchantagreementResponse(TeaModel):
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


class QueryInnerMerchantagreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        agreement_id: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 协议id
        self.agreement_id = agreement_id
        # 租户账号
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.agreement_id, 'agreement_id')

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
        if self.agreement_id is not None:
            result['agreement_id'] = self.agreement_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('agreement_id') is not None:
            self.agreement_id = m.get('agreement_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class QueryInnerMerchantagreementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_status: str = None,
        sign_date_str: str = None,
        agreement_content: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约状态 枚举
        # TOBE 待签
        # FAIL 签约失败
        # SUCCESS 签约成功
        self.sign_status = sign_status
        # 签约时间
        self.sign_date_str = sign_date_str
        # 协议内容 富文本
        self.agreement_content = agreement_content

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
        if self.sign_status is not None:
            result['sign_status'] = self.sign_status
        if self.sign_date_str is not None:
            result['sign_date_str'] = self.sign_date_str
        if self.agreement_content is not None:
            result['agreement_content'] = self.agreement_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_status') is not None:
            self.sign_status = m.get('sign_status')
        if m.get('sign_date_str') is not None:
            self.sign_date_str = m.get('sign_date_str')
        if m.get('agreement_content') is not None:
            self.agreement_content = m.get('agreement_content')
        return self


class PagequeryInnerMerchantagreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        page_info: PageQuery = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 分页对象
        self.page_info = page_info
        # 租户账号
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class PagequeryInnerMerchantagreementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_size: int = None,
        agreement_page: List[AgreementPage] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据总量
        self.total_size = total_size
        # 协议分页对象
        self.agreement_page = agreement_page

    def validate(self):
        if self.agreement_page:
            for k in self.agreement_page:
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
        if self.total_size is not None:
            result['total_size'] = self.total_size
        result['agreement_page'] = []
        if self.agreement_page is not None:
            for k in self.agreement_page:
                result['agreement_page'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        self.agreement_page = []
        if m.get('agreement_page') is not None:
            for k in m.get('agreement_page'):
                temp_model = AgreementPage()
                self.agreement_page.append(temp_model.from_map(k))
        return self


class CreateInnerMerchantpayexpandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        company_info: CompanyInfo = None,
        legal_info: LegalInfo = None,
        application_info: ApplicationInfo = None,
        submit: str = None,
        expand_mode: str = None,
        sub_tenant_id: str = None,
        user_name: str = None,
        pay_expand_id: str = None,
        allow_duplicate: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户ID
        self.tenant_id = tenant_id
        # 公司信息
        self.company_info = company_info
        # 法人信息
        self.legal_info = legal_info
        # 应用信息
        self.application_info = application_info
        # 是否直接提交
        # SUBMITTED 直接提交
        # STAGE 暂存
        self.submit = submit
        # 进件模式
        # DIRECT(直连进件)
        # AGENT(代理进件)
        self.expand_mode = expand_mode
        # expand_mode=_AGENT_ 必填
        self.sub_tenant_id = sub_tenant_id
        # 操作人名称
        self.user_name = user_name
        # 第一次暂存或保存可以不传，后端直接生成
        self.pay_expand_id = pay_expand_id
        # true允许重复进件，false不允许重复进件
        self.allow_duplicate = allow_duplicate

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.company_info, 'company_info')
        if self.company_info:
            self.company_info.validate()
        self.validate_required(self.legal_info, 'legal_info')
        if self.legal_info:
            self.legal_info.validate()
        self.validate_required(self.application_info, 'application_info')
        if self.application_info:
            self.application_info.validate()
        self.validate_required(self.submit, 'submit')
        self.validate_required(self.expand_mode, 'expand_mode')
        self.validate_required(self.user_name, 'user_name')

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
        if self.company_info is not None:
            result['company_info'] = self.company_info.to_map()
        if self.legal_info is not None:
            result['legal_info'] = self.legal_info.to_map()
        if self.application_info is not None:
            result['application_info'] = self.application_info.to_map()
        if self.submit is not None:
            result['submit'] = self.submit
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        if self.sub_tenant_id is not None:
            result['sub_tenant_id'] = self.sub_tenant_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.allow_duplicate is not None:
            result['allow_duplicate'] = self.allow_duplicate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('company_info') is not None:
            temp_model = CompanyInfo()
            self.company_info = temp_model.from_map(m['company_info'])
        if m.get('legal_info') is not None:
            temp_model = LegalInfo()
            self.legal_info = temp_model.from_map(m['legal_info'])
        if m.get('application_info') is not None:
            temp_model = ApplicationInfo()
            self.application_info = temp_model.from_map(m['application_info'])
        if m.get('submit') is not None:
            self.submit = m.get('submit')
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        if m.get('sub_tenant_id') is not None:
            self.sub_tenant_id = m.get('sub_tenant_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('allow_duplicate') is not None:
            self.allow_duplicate = m.get('allow_duplicate')
        return self


class CreateInnerMerchantpayexpandResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_expand_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 进件流水号
        self.pay_expand_id = pay_expand_id

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
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        return self


class SubmitInnerMerchantpayexpandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        pay_expand_id: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 进件id
        self.pay_expand_id = pay_expand_id
        # 操作人名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.pay_expand_id, 'pay_expand_id')
        self.validate_required(self.user_name, 'user_name')

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
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class SubmitInnerMerchantpayexpandResponse(TeaModel):
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


class QueryInnerMerchantpayexpandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        pay_expand_id: str = None,
        expand_mode: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 进件id expand_mode=AGENT 必填 DIRECT可以根据tenant_id推断
        self.pay_expand_id = pay_expand_id
        # 进件模式 DIRECT(直连进件) AGENT(代理进件)
        self.expand_mode = expand_mode

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.expand_mode, 'expand_mode')

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
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        return self


class QueryInnerMerchantpayexpandResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_info: CompanyInfo = None,
        legal_info: LegalInfo = None,
        application_info: ApplicationInfo = None,
        audit_infos: List[AuditInfo] = None,
        pay_expand_id: str = None,
        expand_mode: str = None,
        expand_status: str = None,
        expand_fail_reason: str = None,
        show_customer_service_banner: bool = None,
        zft_expand_successful: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 公司信息
        self.company_info = company_info
        # 法人信息
        self.legal_info = legal_info
        # 应用信息
        self.application_info = application_info
        # 审核列表
        self.audit_infos = audit_infos
        # 进件流水号
        self.pay_expand_id = pay_expand_id
        # 进件模式 DIRECT(直连进件) AGENT(代理进件)
        self.expand_mode = expand_mode
        # INIT:草稿态 SUB_MERCHANT_CREDIT:二级户商户签约中 AUDIT:审核中 AUDIT_PASSED:进件成功 AUDIT_NOT_PASSED:进件失败 MERCHANT_CONFIRM:待商户确认
        self.expand_status = expand_status
        # 进件失败描述
        self.expand_fail_reason = expand_fail_reason
        # 是否展示客服信息登记入口
        self.show_customer_service_banner = show_customer_service_banner
        # 是否直付通进件已成功
        # 用于前端判断进件成功之后用户修改操作
        self.zft_expand_successful = zft_expand_successful

    def validate(self):
        if self.company_info:
            self.company_info.validate()
        if self.legal_info:
            self.legal_info.validate()
        if self.application_info:
            self.application_info.validate()
        if self.audit_infos:
            for k in self.audit_infos:
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
        if self.company_info is not None:
            result['company_info'] = self.company_info.to_map()
        if self.legal_info is not None:
            result['legal_info'] = self.legal_info.to_map()
        if self.application_info is not None:
            result['application_info'] = self.application_info.to_map()
        result['audit_infos'] = []
        if self.audit_infos is not None:
            for k in self.audit_infos:
                result['audit_infos'].append(k.to_map() if k else None)
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        if self.expand_status is not None:
            result['expand_status'] = self.expand_status
        if self.expand_fail_reason is not None:
            result['expand_fail_reason'] = self.expand_fail_reason
        if self.show_customer_service_banner is not None:
            result['show_customer_service_banner'] = self.show_customer_service_banner
        if self.zft_expand_successful is not None:
            result['zft_expand_successful'] = self.zft_expand_successful
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('company_info') is not None:
            temp_model = CompanyInfo()
            self.company_info = temp_model.from_map(m['company_info'])
        if m.get('legal_info') is not None:
            temp_model = LegalInfo()
            self.legal_info = temp_model.from_map(m['legal_info'])
        if m.get('application_info') is not None:
            temp_model = ApplicationInfo()
            self.application_info = temp_model.from_map(m['application_info'])
        self.audit_infos = []
        if m.get('audit_infos') is not None:
            for k in m.get('audit_infos'):
                temp_model = AuditInfo()
                self.audit_infos.append(temp_model.from_map(k))
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        if m.get('expand_status') is not None:
            self.expand_status = m.get('expand_status')
        if m.get('expand_fail_reason') is not None:
            self.expand_fail_reason = m.get('expand_fail_reason')
        if m.get('show_customer_service_banner') is not None:
            self.show_customer_service_banner = m.get('show_customer_service_banner')
        if m.get('zft_expand_successful') is not None:
            self.zft_expand_successful = m.get('zft_expand_successful')
        return self


class PagequeryInnerMerchantagentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        agent_name: str = None,
        pay_expand_status: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 代理商户名称
        self.agent_name = agent_name
        # 进件状态
        self.pay_expand_status = pay_expand_status
        # 分页对象
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.pay_expand_status is not None:
            result['pay_expand_status'] = self.pay_expand_status
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('pay_expand_status') is not None:
            self.pay_expand_status = m.get('pay_expand_status')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerMerchantagentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_size: int = None,
        merchant_agent_page: List[MerchantAgentPage] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据总量
        self.total_size = total_size
        # 代理租户分页对象
        self.merchant_agent_page = merchant_agent_page

    def validate(self):
        if self.merchant_agent_page:
            for k in self.merchant_agent_page:
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
        if self.total_size is not None:
            result['total_size'] = self.total_size
        result['merchant_agent_page'] = []
        if self.merchant_agent_page is not None:
            for k in self.merchant_agent_page:
                result['merchant_agent_page'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        self.merchant_agent_page = []
        if m.get('merchant_agent_page') is not None:
            for k in m.get('merchant_agent_page'):
                temp_model = MerchantAgentPage()
                self.merchant_agent_page.append(temp_model.from_map(k))
        return self


class CloneInnerTemplatefileaddressRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        file_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 模板编码
        self.template_code = template_code
        # 文件key
        self.file_key = file_key

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.file_key, 'file_key')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class CloneInnerTemplatefileaddressResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_key: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 拷贝后的文件key
        self.file_key = file_key

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
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class QueryInnerSignfieldsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class QueryInnerSignfieldsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_field_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署区列表
        self.sign_field_list = sign_field_list

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
        if self.sign_field_list is not None:
            result['sign_field_list'] = self.sign_field_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_field_list') is not None:
            self.sign_field_list = m.get('sign_field_list')
        return self


class SyncInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        source_template_code: str = None,
        target_template_name: str = None,
        scene: str = None,
        source_template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 来源魔法库模板code
        self.source_template_code = source_template_code
        # 目标魔法库模板名称
        self.target_template_name = target_template_name
        # 模板同步的场景，值参考：CREATE_TEMPLATE、SYNC_PROD
        self.scene = scene
        # 魔法库来源模板版本
        self.source_template_version = source_template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.source_template_code, 'source_template_code')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.source_template_version, 'source_template_version')

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
        if self.source_template_code is not None:
            result['source_template_code'] = self.source_template_code
        if self.target_template_name is not None:
            result['target_template_name'] = self.target_template_name
        if self.scene is not None:
            result['scene'] = self.scene
        if self.source_template_version is not None:
            result['source_template_version'] = self.source_template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('source_template_code') is not None:
            self.source_template_code = m.get('source_template_code')
        if m.get('target_template_name') is not None:
            self.target_template_name = m.get('target_template_name')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('source_template_version') is not None:
            self.source_template_version = m.get('source_template_version')
        return self


class SyncInnerTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        target_template_code: str = None,
        valid_result: bool = None,
        valid_field_detail: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 同步后的新模板code
        self.target_template_code = target_template_code
        # 模板同步上线时(强管控字段)校验结果
        self.valid_result = valid_result
        # 校验结果明细JSONStr
        self.valid_field_detail = valid_field_detail

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
        if self.target_template_code is not None:
            result['target_template_code'] = self.target_template_code
        if self.valid_result is not None:
            result['valid_result'] = self.valid_result
        if self.valid_field_detail is not None:
            result['valid_field_detail'] = self.valid_field_detail
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('target_template_code') is not None:
            self.target_template_code = m.get('target_template_code')
        if m.get('valid_result') is not None:
            self.valid_result = m.get('valid_result')
        if m.get('valid_field_detail') is not None:
            self.valid_field_detail = m.get('valid_field_detail')
        return self


class UpdateInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_name: str = None,
        template_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 模板名称
        self.template_name = template_name
        # 模板code
        self.template_code = template_code

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_name, 'template_name')
        self.validate_required(self.template_code, 'template_code')

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
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.template_code is not None:
            result['template_code'] = self.template_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        return self


class UpdateInnerTemplateResponse(TeaModel):
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


class QueryInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_code: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模板code
        self.template_code = template_code
        # 租户8位id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryInnerTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板的基本信息，json格式
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
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryInnerTemplateelementlinkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 模板code
        self.template_code = template_code
        # 模板版本
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class QueryInnerTemplateelementlinkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板元素列表，json格式
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
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryInnerTemplateversionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 模板编码
        self.template_code = template_code
        # 模板的版本号，示例：1、2、3等
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class QueryInnerTemplateversionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板的版本详情信息
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
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class PagequeryInnerOrdermsgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        order_id: str = None,
        msg_publish_type: str = None,
        msg_create_time_from: str = None,
        msg_create_time_to: str = None,
        env: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        # 
        self.tenant_id = tenant_id
        # 订单ID
        self.order_id = order_id
        # 消息类型
        self.msg_publish_type = msg_publish_type
        # 消息创建时间起始
        self.msg_create_time_from = msg_create_time_from
        # 消息创建时间结束
        self.msg_create_time_to = msg_create_time_to
        # SANDBOX 沙箱 ；PROD 生产
        self.env = env
        # 分页查询对象
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.order_id, 'order_id')
        if self.msg_create_time_from is not None:
            self.validate_pattern(self.msg_create_time_from, 'msg_create_time_from', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.msg_create_time_to is not None:
            self.validate_pattern(self.msg_create_time_to, 'msg_create_time_to', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.env, 'env')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.msg_publish_type is not None:
            result['msg_publish_type'] = self.msg_publish_type
        if self.msg_create_time_from is not None:
            result['msg_create_time_from'] = self.msg_create_time_from
        if self.msg_create_time_to is not None:
            result['msg_create_time_to'] = self.msg_create_time_to
        if self.env is not None:
            result['env'] = self.env
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('msg_publish_type') is not None:
            self.msg_publish_type = m.get('msg_publish_type')
        if m.get('msg_create_time_from') is not None:
            self.msg_create_time_from = m.get('msg_create_time_from')
        if m.get('msg_create_time_to') is not None:
            self.msg_create_time_to = m.get('msg_create_time_to')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerOrdermsgResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_size: int = None,
        order_msg_infos: List[OrderMsgInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据总量
        self.total_size = total_size
        # 消息内容列表
        self.order_msg_infos = order_msg_infos

    def validate(self):
        if self.order_msg_infos:
            for k in self.order_msg_infos:
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
        if self.total_size is not None:
            result['total_size'] = self.total_size
        result['order_msg_infos'] = []
        if self.order_msg_infos is not None:
            for k in self.order_msg_infos:
                result['order_msg_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        self.order_msg_infos = []
        if m.get('order_msg_infos') is not None:
            for k in m.get('order_msg_infos'):
                temp_model = OrderMsgInfo()
                self.order_msg_infos.append(temp_model.from_map(k))
        return self


class RetryInnerOrdermsgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        env: str = None,
        order_id: str = None,
        msg_id: str = None,
        using_new_callback_url: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户ID
        self.tenant_id = tenant_id
        # SANDBOX 沙箱 PROD 生产
        self.env = env
        # 订单id
        # 
        self.order_id = order_id
        # 消息ID
        # 
        self.msg_id = msg_id
        # 使用租户新回调地址
        self.using_new_callback_url = using_new_callback_url

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.env, 'env')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.msg_id, 'msg_id')
        self.validate_required(self.using_new_callback_url, 'using_new_callback_url')

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
        if self.env is not None:
            result['env'] = self.env
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.msg_id is not None:
            result['msg_id'] = self.msg_id
        if self.using_new_callback_url is not None:
            result['using_new_callback_url'] = self.using_new_callback_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('msg_id') is not None:
            self.msg_id = m.get('msg_id')
        if m.get('using_new_callback_url') is not None:
            self.using_new_callback_url = m.get('using_new_callback_url')
        return self


class RetryInnerOrdermsgResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        retry_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 消息重试结果
        self.retry_result = retry_result

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
        if self.retry_result is not None:
            result['retry_result'] = self.retry_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('retry_result') is not None:
            self.retry_result = m.get('retry_result')
        return self


class QueryInnerAuthorizationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署合同的流程id
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')
        if self.flow_id is not None:
            self.validate_max_length(self.flow_id, 'flow_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class QueryInnerAuthorizationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        is_need_ask_auth: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # true代表需要进行授权询问
        # false代表不需要进行授权询问
        self.is_need_ask_auth = is_need_ask_auth

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
        if self.is_need_ask_auth is not None:
            result['is_need_ask_auth'] = self.is_need_ask_auth
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('is_need_ask_auth') is not None:
            self.is_need_ask_auth = m.get('is_need_ask_auth')
        return self


class SignInnerAuthorizationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
        auth_result: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署合同的流程id
        self.flow_id = flow_id
        # true代表用户同意授权，
        # false代表不同意
        self.auth_result = auth_result

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')
        if self.flow_id is not None:
            self.validate_max_length(self.flow_id, 'flow_id', 64)
        self.validate_required(self.auth_result, 'auth_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.auth_result is not None:
            result['auth_result'] = self.auth_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('auth_result') is not None:
            self.auth_result = m.get('auth_result')
        return self


class SignInnerAuthorizationResponse(TeaModel):
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


class QueryInnerSupplementalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户ID
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.tenant_id is not None:
            self.validate_max_length(self.tenant_id, 'tenant_id', 64)

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryInnerSupplementalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        is_need_ask_auth: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # true代表需要进行授权询问
        # false代表不需要进行授权询问
        self.is_need_ask_auth = is_need_ask_auth

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
        if self.is_need_ask_auth is not None:
            result['is_need_ask_auth'] = self.is_need_ask_auth
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('is_need_ask_auth') is not None:
            self.is_need_ask_auth = m.get('is_need_ask_auth')
        return self


class SignInnerSupplementalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        auth_result: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户ID
        self.tenant_id = tenant_id
        # 同意接受用户补充接口，目前取值只能为true
        self.auth_result = auth_result

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.tenant_id is not None:
            self.validate_max_length(self.tenant_id, 'tenant_id', 64)
        self.validate_required(self.auth_result, 'auth_result')

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
        if self.auth_result is not None:
            result['auth_result'] = self.auth_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('auth_result') is not None:
            self.auth_result = m.get('auth_result')
        return self


class SignInnerSupplementalResponse(TeaModel):
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


class QueryInnerWithholdplanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 订单id
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 64)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class QueryInnerWithholdplanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_money: int = None,
        total_term: int = None,
        pay_info: List[UserPerformanceInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总金额，单位为分
        self.total_money = total_money
        # 总期数
        self.total_term = total_term
        # 用户履约信息列表
        self.pay_info = pay_info

    def validate(self):
        if self.pay_info:
            for k in self.pay_info:
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
        if self.total_money is not None:
            result['total_money'] = self.total_money
        if self.total_term is not None:
            result['total_term'] = self.total_term
        result['pay_info'] = []
        if self.pay_info is not None:
            for k in self.pay_info:
                result['pay_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_money') is not None:
            self.total_money = m.get('total_money')
        if m.get('total_term') is not None:
            self.total_term = m.get('total_term')
        self.pay_info = []
        if m.get('pay_info') is not None:
            for k in m.get('pay_info'):
                temp_model = UserPerformanceInfo()
                self.pay_info.append(temp_model.from_map(k))
        return self


class CreateInnerWithholdsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        order_id: str = None,
        alipay_user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 订单id
        self.order_id = order_id
        # 用户支付宝2088uid
        self.alipay_user_id = alipay_user_id

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 64)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        return self


class CreateInnerWithholdsignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_str: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 代扣签约串
        self.sign_str = sign_str

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
        if self.sign_str is not None:
            result['sign_str'] = self.sign_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_str') is not None:
            self.sign_str = m.get('sign_str')
        return self


class QueryInnerWithholdsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 订单id
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 64)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class QueryInnerWithholdsignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        agreement_no: str = None,
        sign_time: str = None,
        valid_time: str = None,
        invalid_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 协议当前状态
        # 1. UNSIGNED：未签约
        # 2. SIGNED：已签约；
        # 3.APPLY_TERMINATE:申请解约
        # 4. TERMINATED：已解约
        # 5.TIMEOUT_CLOSE:超时关闭
        self.status = status
        # 支付宝代扣协议号
        self.agreement_no = agreement_no
        # 协议签署时间
        # yyyy-MM-dd HH:mm:ss 格式
        self.sign_time = sign_time
        # 协议生效时间
        # yyyy-MM-dd HH:mm:ss 格式
        self.valid_time = valid_time
        # 协议失效时间
        # yyyy-MM-dd HH:mm:ss 格式
        self.invalid_time = invalid_time

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
        if self.agreement_no is not None:
            result['agreement_no'] = self.agreement_no
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.invalid_time is not None:
            result['invalid_time'] = self.invalid_time
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
        if m.get('agreement_no') is not None:
            self.agreement_no = m.get('agreement_no')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('invalid_time') is not None:
            self.invalid_time = m.get('invalid_time')
        return self


class GetInnerMerchantstaticdataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
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
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class GetInnerMerchantstaticdataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        static_data_list: List[StaticData] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商户入驻静态数据
        self.static_data_list = static_data_list

    def validate(self):
        if self.static_data_list:
            for k in self.static_data_list:
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
        result['static_data_list'] = []
        if self.static_data_list is not None:
            for k in self.static_data_list:
                result['static_data_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.static_data_list = []
        if m.get('static_data_list') is not None:
            for k in m.get('static_data_list'):
                temp_model = StaticData()
                self.static_data_list.append(temp_model.from_map(k))
        return self


class GetInnerFunddividemerchantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
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
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class GetInnerFunddividemerchantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_name: str = None,
        merchant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分账方公司名称
        self.company_name = company_name
        # 分账方公司统一社会信用代码
        self.merchant_id = merchant_id

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
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class QueryInnerInsuresignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        insure_merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 保司社会统一信用代码
        self.insure_merchant_id = insure_merchant_id

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        self.validate_required(self.insure_merchant_id, 'insure_merchant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.insure_merchant_id is not None:
            result['insure_merchant_id'] = self.insure_merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('insure_merchant_id') is not None:
            self.insure_merchant_id = m.get('insure_merchant_id')
        return self


class QueryInnerInsuresignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        merchant_id: str = None,
        insure_merchant_id: str = None,
        external_agreement_no: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商户社会统一信用代码
        self.merchant_id = merchant_id
        # 保司社会统一信用代码
        self.insure_merchant_id = insure_merchant_id
        # 外部代扣协议号
        self.external_agreement_no = external_agreement_no
        # 合同未签署：CONTRACT_UN_SIGNED
        # 合同已签署：CONTRACT_SIGNED
        # 代扣已签署：WITHHOLD_SIGNED
        # 代扣已解约：WITHHOLD_UN_SIGNED
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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.insure_merchant_id is not None:
            result['insure_merchant_id'] = self.insure_merchant_id
        if self.external_agreement_no is not None:
            result['external_agreement_no'] = self.external_agreement_no
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
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('insure_merchant_id') is not None:
            self.insure_merchant_id = m.get('insure_merchant_id')
        if m.get('external_agreement_no') is not None:
            self.external_agreement_no = m.get('external_agreement_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class CreateInnerInsuresignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        external_agreement_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 外部代扣协议号
        self.external_agreement_no = external_agreement_no

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.external_agreement_no is not None:
            result['external_agreement_no'] = self.external_agreement_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('external_agreement_no') is not None:
            self.external_agreement_no = m.get('external_agreement_no')
        return self


class CreateInnerInsuresignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_str: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约链接
        self.sign_str = sign_str

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
        if self.sign_str is not None:
            result['sign_str'] = self.sign_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_str') is not None:
            self.sign_str = m.get('sign_str')
        return self


class PagequeryInnerInsureorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        order_id: str = None,
        page_info: PageQuery = None,
        insure_merchant_id: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        # (商家后台接口特有)
        self.tenant_id = tenant_id
        # 商家订单ID
        self.order_id = order_id
        # 分页查询对象
        self.page_info = page_info
        # 保司信息merchant_id
        self.insure_merchant_id = insure_merchant_id
        # 投保状态枚举
        self.status = status

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()
        self.validate_required(self.insure_merchant_id, 'insure_merchant_id')

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.insure_merchant_id is not None:
            result['insure_merchant_id'] = self.insure_merchant_id
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('insure_merchant_id') is not None:
            self.insure_merchant_id = m.get('insure_merchant_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class PagequeryInnerInsureorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_size: int = None,
        inusre_order_infos: List[InsureOrderInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据总量
        self.total_size = total_size
        # 保单信息
        self.inusre_order_infos = inusre_order_infos

    def validate(self):
        if self.inusre_order_infos:
            for k in self.inusre_order_infos:
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
        if self.total_size is not None:
            result['total_size'] = self.total_size
        result['inusre_order_infos'] = []
        if self.inusre_order_infos is not None:
            for k in self.inusre_order_infos:
                result['inusre_order_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        self.inusre_order_infos = []
        if m.get('inusre_order_infos') is not None:
            for k in m.get('inusre_order_infos'):
                temp_model = InsureOrderInfo()
                self.inusre_order_infos.append(temp_model.from_map(k))
        return self


class PagequeryInnerProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        product_name: str = None,
        product_id: str = None,
        main_class: str = None,
        sub_class: str = None,
        product_brand: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.tenant_id = tenant_id
        # 商品名称
        self.product_name = product_name
        # 商品id
        self.product_id = product_id
        # 一级类目
        self.main_class = main_class
        # 二级类目
        self.sub_class = sub_class
        # 品牌
        self.product_brand = product_brand
        # 分页
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.main_class is not None:
            result['main_class'] = self.main_class
        if self.sub_class is not None:
            result['sub_class'] = self.sub_class
        if self.product_brand is not None:
            result['product_brand'] = self.product_brand
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('main_class') is not None:
            self.main_class = m.get('main_class')
        if m.get('sub_class') is not None:
            self.sub_class = m.get('sub_class')
        if m.get('product_brand') is not None:
            self.product_brand = m.get('product_brand')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        product_info_list: List[ProductInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总量
        self.total = total
        # 商品列表
        self.product_info_list = product_info_list

    def validate(self):
        if self.product_info_list:
            for k in self.product_info_list:
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
        result['product_info_list'] = []
        if self.product_info_list is not None:
            for k in self.product_info_list:
                result['product_info_list'].append(k.to_map() if k else None)
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
        self.product_info_list = []
        if m.get('product_info_list') is not None:
            for k in m.get('product_info_list'):
                temp_model = ProductInfo()
                self.product_info_list.append(temp_model.from_map(k))
        return self


class GetInnerHomepagenoticeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
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
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class GetInnerHomepagenoticeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        notice_id: int = None,
        title: str = None,
        unread_count: int = None,
        unread: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 通知id
        self.notice_id = notice_id
        # 通知标题
        self.title = title
        # 未读数量
        self.unread_count = unread_count
        # 是否未读
        self.unread = unread

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
        if self.notice_id is not None:
            result['notice_id'] = self.notice_id
        if self.title is not None:
            result['title'] = self.title
        if self.unread_count is not None:
            result['unread_count'] = self.unread_count
        if self.unread is not None:
            result['unread'] = self.unread
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('notice_id') is not None:
            self.notice_id = m.get('notice_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('unread_count') is not None:
            self.unread_count = m.get('unread_count')
        if m.get('unread') is not None:
            self.unread = m.get('unread')
        return self


class PagequeryInnerNoticeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        page_info: PageQuery = None,
        unread: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.tenant_id = tenant_id
        # 分页
        self.page_info = page_info
        # 是否未读
        self.unread = unread

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.unread is not None:
            result['unread'] = self.unread
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('unread') is not None:
            self.unread = m.get('unread')
        return self


class PagequeryInnerNoticeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        notice_info_list: List[NoticeInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总量
        self.total = total
        # 商户通知信息
        self.notice_info_list = notice_info_list

    def validate(self):
        if self.notice_info_list:
            for k in self.notice_info_list:
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
        result['notice_info_list'] = []
        if self.notice_info_list is not None:
            for k in self.notice_info_list:
                result['notice_info_list'].append(k.to_map() if k else None)
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
        self.notice_info_list = []
        if m.get('notice_info_list') is not None:
            for k in m.get('notice_info_list'):
                temp_model = NoticeInfo()
                self.notice_info_list.append(temp_model.from_map(k))
        return self


class DetailInnerNoticeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        notice_id: int = None,
        unread: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.tenant_id = tenant_id
        # 通知id
        self.notice_id = notice_id
        # 是否未读
        self.unread = unread

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.notice_id, 'notice_id')
        self.validate_required(self.unread, 'unread')

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
        if self.notice_id is not None:
            result['notice_id'] = self.notice_id
        if self.unread is not None:
            result['unread'] = self.unread
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('notice_id') is not None:
            self.notice_id = m.get('notice_id')
        if m.get('unread') is not None:
            self.unread = m.get('unread')
        return self


class DetailInnerNoticeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        title: str = None,
        content: str = None,
        notice_create_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 通知标题
        self.title = title
        # 通知内容
        self.content = content
        # 通知创建时间
        self.notice_create_time = notice_create_time

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
        if self.title is not None:
            result['title'] = self.title
        if self.content is not None:
            result['content'] = self.content
        if self.notice_create_time is not None:
            result['notice_create_time'] = self.notice_create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('notice_create_time') is not None:
            self.notice_create_time = m.get('notice_create_time')
        return self


class PagequeryInnerOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        order_id: str = None,
        agreement_no: str = None,
        order_create_time_start: str = None,
        order_create_time_end: str = None,
        order_status: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.tenant_id = tenant_id
        # 订单id
        self.order_id = order_id
        # 支付宝代扣协议号
        self.agreement_no = agreement_no
        # 订单创建时间开始
        self.order_create_time_start = order_create_time_start
        # 订单创建时间结束
        self.order_create_time_end = order_create_time_end
        # 订单状态
        self.order_status = order_status
        # 分页
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.order_create_time_start is not None:
            self.validate_pattern(self.order_create_time_start, 'order_create_time_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.order_create_time_end is not None:
            self.validate_pattern(self.order_create_time_end, 'order_create_time_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.agreement_no is not None:
            result['agreement_no'] = self.agreement_no
        if self.order_create_time_start is not None:
            result['order_create_time_start'] = self.order_create_time_start
        if self.order_create_time_end is not None:
            result['order_create_time_end'] = self.order_create_time_end
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('agreement_no') is not None:
            self.agreement_no = m.get('agreement_no')
        if m.get('order_create_time_start') is not None:
            self.order_create_time_start = m.get('order_create_time_start')
        if m.get('order_create_time_end') is not None:
            self.order_create_time_end = m.get('order_create_time_end')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_info_list: List[OrderSearchInfo] = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单列表信息
        self.order_info_list = order_info_list
        # 总量
        self.total = total

    def validate(self):
        if self.order_info_list:
            for k in self.order_info_list:
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
        result['order_info_list'] = []
        if self.order_info_list is not None:
            for k in self.order_info_list:
                result['order_info_list'].append(k.to_map() if k else None)
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.order_info_list = []
        if m.get('order_info_list') is not None:
            for k in m.get('order_info_list'):
                temp_model = OrderSearchInfo()
                self.order_info_list.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class DetailInnerOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.tenant_id = tenant_id
        # 订单id
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class DetailInnerOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        agreement_no: str = None,
        product_total_count: int = None,
        order_info: OrderInfo = None,
        order_user_info: OrderUserInfo = None,
        order_fulfillment_info_list: List[OrderFulfillmentInfo] = None,
        order_promise_info: OrderPromiseInfo = None,
        order_product_info_list: List[OrderProductInfo] = None,
        operate_divide_info_list: List[OperateDivideInfo] = None,
        order_contract_info_list: List[OrderContractInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单id
        self.order_id = order_id
        # 支付宝代扣协议号
        self.agreement_no = agreement_no
        # 商品总数量
        self.product_total_count = product_total_count
        # 订单基础信息
        self.order_info = order_info
        # 用户信息
        self.order_user_info = order_user_info
        # 订单履约
        self.order_fulfillment_info_list = order_fulfillment_info_list
        # 订单还款承诺
        self.order_promise_info = order_promise_info
        # 订单商品信息
        self.order_product_info_list = order_product_info_list
        # 经营分账信息
        self.operate_divide_info_list = operate_divide_info_list
        # 订单合同信息
        self.order_contract_info_list = order_contract_info_list

    def validate(self):
        if self.order_info:
            self.order_info.validate()
        if self.order_user_info:
            self.order_user_info.validate()
        if self.order_fulfillment_info_list:
            for k in self.order_fulfillment_info_list:
                if k:
                    k.validate()
        if self.order_promise_info:
            self.order_promise_info.validate()
        if self.order_product_info_list:
            for k in self.order_product_info_list:
                if k:
                    k.validate()
        if self.operate_divide_info_list:
            for k in self.operate_divide_info_list:
                if k:
                    k.validate()
        if self.order_contract_info_list:
            for k in self.order_contract_info_list:
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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.agreement_no is not None:
            result['agreement_no'] = self.agreement_no
        if self.product_total_count is not None:
            result['product_total_count'] = self.product_total_count
        if self.order_info is not None:
            result['order_info'] = self.order_info.to_map()
        if self.order_user_info is not None:
            result['order_user_info'] = self.order_user_info.to_map()
        result['order_fulfillment_info_list'] = []
        if self.order_fulfillment_info_list is not None:
            for k in self.order_fulfillment_info_list:
                result['order_fulfillment_info_list'].append(k.to_map() if k else None)
        if self.order_promise_info is not None:
            result['order_promise_info'] = self.order_promise_info.to_map()
        result['order_product_info_list'] = []
        if self.order_product_info_list is not None:
            for k in self.order_product_info_list:
                result['order_product_info_list'].append(k.to_map() if k else None)
        result['operate_divide_info_list'] = []
        if self.operate_divide_info_list is not None:
            for k in self.operate_divide_info_list:
                result['operate_divide_info_list'].append(k.to_map() if k else None)
        result['order_contract_info_list'] = []
        if self.order_contract_info_list is not None:
            for k in self.order_contract_info_list:
                result['order_contract_info_list'].append(k.to_map() if k else None)
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
        if m.get('agreement_no') is not None:
            self.agreement_no = m.get('agreement_no')
        if m.get('product_total_count') is not None:
            self.product_total_count = m.get('product_total_count')
        if m.get('order_info') is not None:
            temp_model = OrderInfo()
            self.order_info = temp_model.from_map(m['order_info'])
        if m.get('order_user_info') is not None:
            temp_model = OrderUserInfo()
            self.order_user_info = temp_model.from_map(m['order_user_info'])
        self.order_fulfillment_info_list = []
        if m.get('order_fulfillment_info_list') is not None:
            for k in m.get('order_fulfillment_info_list'):
                temp_model = OrderFulfillmentInfo()
                self.order_fulfillment_info_list.append(temp_model.from_map(k))
        if m.get('order_promise_info') is not None:
            temp_model = OrderPromiseInfo()
            self.order_promise_info = temp_model.from_map(m['order_promise_info'])
        self.order_product_info_list = []
        if m.get('order_product_info_list') is not None:
            for k in m.get('order_product_info_list'):
                temp_model = OrderProductInfo()
                self.order_product_info_list.append(temp_model.from_map(k))
        self.operate_divide_info_list = []
        if m.get('operate_divide_info_list') is not None:
            for k in m.get('operate_divide_info_list'):
                temp_model = OperateDivideInfo()
                self.operate_divide_info_list.append(temp_model.from_map(k))
        self.order_contract_info_list = []
        if m.get('order_contract_info_list') is not None:
            for k in m.get('order_contract_info_list'):
                temp_model = OrderContractInfo()
                self.order_contract_info_list.append(temp_model.from_map(k))
        return self


class RenderInnerTemplateinstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_codes: List[str] = None,
        idempotent: str = None,
        biz_business_id: str = None,
        component_inst_dtos: List[TemplateComponent] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 模板编码集，数组
        self.template_codes = template_codes
        # 幂等值
        self.idempotent = idempotent
        # 业务方id，唯一
        self.biz_business_id = biz_business_id
        # 组件（文本域）的实际值
        self.component_inst_dtos = component_inst_dtos

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_codes, 'template_codes')
        self.validate_required(self.idempotent, 'idempotent')
        self.validate_required(self.biz_business_id, 'biz_business_id')
        self.validate_required(self.component_inst_dtos, 'component_inst_dtos')
        if self.component_inst_dtos:
            for k in self.component_inst_dtos:
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_codes is not None:
            result['template_codes'] = self.template_codes
        if self.idempotent is not None:
            result['idempotent'] = self.idempotent
        if self.biz_business_id is not None:
            result['biz_business_id'] = self.biz_business_id
        result['component_inst_dtos'] = []
        if self.component_inst_dtos is not None:
            for k in self.component_inst_dtos:
                result['component_inst_dtos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_codes') is not None:
            self.template_codes = m.get('template_codes')
        if m.get('idempotent') is not None:
            self.idempotent = m.get('idempotent')
        if m.get('biz_business_id') is not None:
            self.biz_business_id = m.get('biz_business_id')
        self.component_inst_dtos = []
        if m.get('component_inst_dtos') is not None:
            for k in m.get('component_inst_dtos'):
                temp_model = TemplateComponent()
                self.component_inst_dtos.append(temp_model.from_map(k))
        return self


class RenderInnerTemplateinstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        business_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实例化成功时返回唯一业务id
        self.business_id = business_id

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
        if self.business_id is not None:
            result['business_id'] = self.business_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        return self


class BatchqueryInnerMarketingscoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        marketing_score_query_infos: List[MarketingScoreQueryInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 营销分查询对象
        self.marketing_score_query_infos = marketing_score_query_infos

    def validate(self):
        self.validate_required(self.marketing_score_query_infos, 'marketing_score_query_infos')
        if self.marketing_score_query_infos:
            for k in self.marketing_score_query_infos:
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
        result['marketing_score_query_infos'] = []
        if self.marketing_score_query_infos is not None:
            for k in self.marketing_score_query_infos:
                result['marketing_score_query_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        self.marketing_score_query_infos = []
        if m.get('marketing_score_query_infos') is not None:
            for k in m.get('marketing_score_query_infos'):
                temp_model = MarketingScoreQueryInfo()
                self.marketing_score_query_infos.append(temp_model.from_map(k))
        return self


class BatchqueryInnerMarketingscoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        marketing_score_info: List[MarketingScoreInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 营销分返回对象
        self.marketing_score_info = marketing_score_info

    def validate(self):
        if self.marketing_score_info:
            for k in self.marketing_score_info:
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
        result['marketing_score_info'] = []
        if self.marketing_score_info is not None:
            for k in self.marketing_score_info:
                result['marketing_score_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.marketing_score_info = []
        if m.get('marketing_score_info') is not None:
            for k in m.get('marketing_score_info'):
                temp_model = MarketingScoreInfo()
                self.marketing_score_info.append(temp_model.from_map(k))
        return self


class CreateInnerCustomerserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        merchant_name: str = None,
        process_type: str = None,
        service_provider_name: str = None,
        customer_service_phone: str = None,
        alipay_bind_mobile: str = None,
        alipay_logon_id: str = None,
        customer_service_name: str = None,
        online_support_site_url: str = None,
        customer_complaint_issues: str = None,
        customer_person_info_list: List[CustomerPersonInfo] = None,
        expand_mode: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 公司社会统一信息代码,间联模式必传
        self.merchant_id = merchant_id
        # 公司名称
        self.merchant_name = merchant_name
        # 处理类型:
        # MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
        # PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
        self.process_type = process_type
        # 服务商名称（已废弃）
        self.service_provider_name = service_provider_name
        # 客服电话
        self.customer_service_phone = customer_service_phone
        # 客诉处理员支付宝绑定手机号（已废弃）
        self.alipay_bind_mobile = alipay_bind_mobile
        # 客诉处理员支付宝账号（已废弃）
        self.alipay_logon_id = alipay_logon_id
        # 客服人员名称（已废弃）
        self.customer_service_name = customer_service_name
        # 在线客服网址
        self.online_support_site_url = online_support_site_url
        # 投诉问题
        self.customer_complaint_issues = customer_complaint_issues
        # 客诉人员信息，直连必填
        self.customer_person_info_list = customer_person_info_list
        # 进件类型
        # DIRECT("DIRECT", "直连进件模式"),
        # AGENT("AGENT", "代理商进件模式"),
        self.expand_mode = expand_mode

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.process_type, 'process_type')
        self.validate_required(self.customer_service_phone, 'customer_service_phone')
        if self.customer_person_info_list:
            for k in self.customer_person_info_list:
                if k:
                    k.validate()
        self.validate_required(self.expand_mode, 'expand_mode')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.process_type is not None:
            result['process_type'] = self.process_type
        if self.service_provider_name is not None:
            result['service_provider_name'] = self.service_provider_name
        if self.customer_service_phone is not None:
            result['customer_service_phone'] = self.customer_service_phone
        if self.alipay_bind_mobile is not None:
            result['alipay_bind_mobile'] = self.alipay_bind_mobile
        if self.alipay_logon_id is not None:
            result['alipay_logon_id'] = self.alipay_logon_id
        if self.customer_service_name is not None:
            result['customer_service_name'] = self.customer_service_name
        if self.online_support_site_url is not None:
            result['online_support_site_url'] = self.online_support_site_url
        if self.customer_complaint_issues is not None:
            result['customer_complaint_issues'] = self.customer_complaint_issues
        result['customer_person_info_list'] = []
        if self.customer_person_info_list is not None:
            for k in self.customer_person_info_list:
                result['customer_person_info_list'].append(k.to_map() if k else None)
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('process_type') is not None:
            self.process_type = m.get('process_type')
        if m.get('service_provider_name') is not None:
            self.service_provider_name = m.get('service_provider_name')
        if m.get('customer_service_phone') is not None:
            self.customer_service_phone = m.get('customer_service_phone')
        if m.get('alipay_bind_mobile') is not None:
            self.alipay_bind_mobile = m.get('alipay_bind_mobile')
        if m.get('alipay_logon_id') is not None:
            self.alipay_logon_id = m.get('alipay_logon_id')
        if m.get('customer_service_name') is not None:
            self.customer_service_name = m.get('customer_service_name')
        if m.get('online_support_site_url') is not None:
            self.online_support_site_url = m.get('online_support_site_url')
        if m.get('customer_complaint_issues') is not None:
            self.customer_complaint_issues = m.get('customer_complaint_issues')
        self.customer_person_info_list = []
        if m.get('customer_person_info_list') is not None:
            for k in m.get('customer_person_info_list'):
                temp_model = CustomerPersonInfo()
                self.customer_person_info_list.append(temp_model.from_map(k))
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        return self


class CreateInnerCustomerserviceResponse(TeaModel):
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


class UpdateInnerCustomerserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        merchant_name: str = None,
        process_type: str = None,
        service_provider_name: str = None,
        alipay_bind_mobile: str = None,
        alipay_logon_id: str = None,
        customer_service_phone: str = None,
        customer_service_name: str = None,
        online_support_site_url: str = None,
        customer_complaint_issues: str = None,
        customer_person_info_list: List[CustomerPersonInfo] = None,
        expand_mode: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 商家社会统一信用代码，间联模式必传
        self.merchant_id = merchant_id
        # 公司名称
        self.merchant_name = merchant_name
        # 处理类型:
        # MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
        # PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
        self.process_type = process_type
        # 服务商名称（已废弃）
        self.service_provider_name = service_provider_name
        # 客诉处理员支付宝绑定手机号（已废弃）
        self.alipay_bind_mobile = alipay_bind_mobile
        # 客诉处理员支付宝账号（已废弃）
        self.alipay_logon_id = alipay_logon_id
        # 客服电话
        self.customer_service_phone = customer_service_phone
        # 客服人员名称（已废弃）
        self.customer_service_name = customer_service_name
        # 在线客服网址
        self.online_support_site_url = online_support_site_url
        # 投诉问题
        self.customer_complaint_issues = customer_complaint_issues
        # 客诉处理人员信息
        self.customer_person_info_list = customer_person_info_list
        # 进件类型
        # DIRECT("DIRECT", "直连进件模式"), AGENT("AGENT", "代理商进件模式"),
        self.expand_mode = expand_mode

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.process_type, 'process_type')
        self.validate_required(self.customer_service_phone, 'customer_service_phone')
        if self.customer_person_info_list:
            for k in self.customer_person_info_list:
                if k:
                    k.validate()
        self.validate_required(self.expand_mode, 'expand_mode')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.process_type is not None:
            result['process_type'] = self.process_type
        if self.service_provider_name is not None:
            result['service_provider_name'] = self.service_provider_name
        if self.alipay_bind_mobile is not None:
            result['alipay_bind_mobile'] = self.alipay_bind_mobile
        if self.alipay_logon_id is not None:
            result['alipay_logon_id'] = self.alipay_logon_id
        if self.customer_service_phone is not None:
            result['customer_service_phone'] = self.customer_service_phone
        if self.customer_service_name is not None:
            result['customer_service_name'] = self.customer_service_name
        if self.online_support_site_url is not None:
            result['online_support_site_url'] = self.online_support_site_url
        if self.customer_complaint_issues is not None:
            result['customer_complaint_issues'] = self.customer_complaint_issues
        result['customer_person_info_list'] = []
        if self.customer_person_info_list is not None:
            for k in self.customer_person_info_list:
                result['customer_person_info_list'].append(k.to_map() if k else None)
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('process_type') is not None:
            self.process_type = m.get('process_type')
        if m.get('service_provider_name') is not None:
            self.service_provider_name = m.get('service_provider_name')
        if m.get('alipay_bind_mobile') is not None:
            self.alipay_bind_mobile = m.get('alipay_bind_mobile')
        if m.get('alipay_logon_id') is not None:
            self.alipay_logon_id = m.get('alipay_logon_id')
        if m.get('customer_service_phone') is not None:
            self.customer_service_phone = m.get('customer_service_phone')
        if m.get('customer_service_name') is not None:
            self.customer_service_name = m.get('customer_service_name')
        if m.get('online_support_site_url') is not None:
            self.online_support_site_url = m.get('online_support_site_url')
        if m.get('customer_complaint_issues') is not None:
            self.customer_complaint_issues = m.get('customer_complaint_issues')
        self.customer_person_info_list = []
        if m.get('customer_person_info_list') is not None:
            for k in m.get('customer_person_info_list'):
                temp_model = CustomerPersonInfo()
                self.customer_person_info_list.append(temp_model.from_map(k))
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        return self


class UpdateInnerCustomerserviceResponse(TeaModel):
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


class PagequeryInnerCustomerserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        page_info: PageQuery = None,
        process_type: str = None,
        merchant_id: str = None,
        merchant_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 分页信息
        self.page_info = page_info
        # 处理类型:
        # MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
        # PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
        self.process_type = process_type
        # 公司社会统一信息代码
        self.merchant_id = merchant_id
        # 公司名称
        self.merchant_name = merchant_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.process_type is not None:
            result['process_type'] = self.process_type
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('process_type') is not None:
            self.process_type = m.get('process_type')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        return self


class PagequeryInnerCustomerserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        customer_service_info_list: List[CustomerServiceInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总数
        self.total = total
        # 客服信息
        self.customer_service_info_list = customer_service_info_list

    def validate(self):
        if self.customer_service_info_list:
            for k in self.customer_service_info_list:
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
        result['customer_service_info_list'] = []
        if self.customer_service_info_list is not None:
            for k in self.customer_service_info_list:
                result['customer_service_info_list'].append(k.to_map() if k else None)
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
        self.customer_service_info_list = []
        if m.get('customer_service_info_list') is not None:
            for k in m.get('customer_service_info_list'):
                temp_model = CustomerServiceInfo()
                self.customer_service_info_list.append(temp_model.from_map(k))
        return self


class DetailInnerCustomerserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        expand_mode: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 公司社会统一信息代码，间联模式必传
        self.merchant_id = merchant_id
        # 进件类型
        # DIRECT("DIRECT", "直连进件模式"),
        # AGENT("AGENT", "代理商进件模式"),
        self.expand_mode = expand_mode

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.expand_mode, 'expand_mode')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        return self


class DetailInnerCustomerserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        merchant_id: str = None,
        merchant_name: str = None,
        process_type: str = None,
        service_provider_name: str = None,
        alipay_bind_mobile: str = None,
        alipay_logon_id: str = None,
        customer_service_phone: str = None,
        customer_service_name: str = None,
        online_support_site_url: str = None,
        customer_complaint_issues: str = None,
        customer_person_info_list: List[CustomerPersonInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 公司社会统一信息代码
        self.merchant_id = merchant_id
        # 公司名称
        self.merchant_name = merchant_name
        # 处理类型:
        # MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
        # PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
        self.process_type = process_type
        # 服务商名称（已废弃）
        self.service_provider_name = service_provider_name
        # 客诉处理员支付宝绑定手机号（已废弃）
        self.alipay_bind_mobile = alipay_bind_mobile
        # 客诉处理员支付宝账号（已废弃）
        self.alipay_logon_id = alipay_logon_id
        # 客服电话
        self.customer_service_phone = customer_service_phone
        # 客服人员名称（已废弃）
        self.customer_service_name = customer_service_name
        # 在线客服网址
        self.online_support_site_url = online_support_site_url
        # 投诉问题
        self.customer_complaint_issues = customer_complaint_issues
        # 客诉处理人员信息
        self.customer_person_info_list = customer_person_info_list

    def validate(self):
        if self.customer_person_info_list:
            for k in self.customer_person_info_list:
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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.process_type is not None:
            result['process_type'] = self.process_type
        if self.service_provider_name is not None:
            result['service_provider_name'] = self.service_provider_name
        if self.alipay_bind_mobile is not None:
            result['alipay_bind_mobile'] = self.alipay_bind_mobile
        if self.alipay_logon_id is not None:
            result['alipay_logon_id'] = self.alipay_logon_id
        if self.customer_service_phone is not None:
            result['customer_service_phone'] = self.customer_service_phone
        if self.customer_service_name is not None:
            result['customer_service_name'] = self.customer_service_name
        if self.online_support_site_url is not None:
            result['online_support_site_url'] = self.online_support_site_url
        if self.customer_complaint_issues is not None:
            result['customer_complaint_issues'] = self.customer_complaint_issues
        result['customer_person_info_list'] = []
        if self.customer_person_info_list is not None:
            for k in self.customer_person_info_list:
                result['customer_person_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('process_type') is not None:
            self.process_type = m.get('process_type')
        if m.get('service_provider_name') is not None:
            self.service_provider_name = m.get('service_provider_name')
        if m.get('alipay_bind_mobile') is not None:
            self.alipay_bind_mobile = m.get('alipay_bind_mobile')
        if m.get('alipay_logon_id') is not None:
            self.alipay_logon_id = m.get('alipay_logon_id')
        if m.get('customer_service_phone') is not None:
            self.customer_service_phone = m.get('customer_service_phone')
        if m.get('customer_service_name') is not None:
            self.customer_service_name = m.get('customer_service_name')
        if m.get('online_support_site_url') is not None:
            self.online_support_site_url = m.get('online_support_site_url')
        if m.get('customer_complaint_issues') is not None:
            self.customer_complaint_issues = m.get('customer_complaint_issues')
        self.customer_person_info_list = []
        if m.get('customer_person_info_list') is not None:
            for k in m.get('customer_person_info_list'):
                temp_model = CustomerPersonInfo()
                self.customer_person_info_list.append(temp_model.from_map(k))
        return self


class GetInnerCustomerservicetemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        expand_mode: str = None,
        process_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 进件类型
        # DIRECT("DIRECT", "直连进件模式")
        # AGENT("AGENT", "代理商进件模式")
        self.expand_mode = expand_mode
        # 处理类型:
        # MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
        # PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
        self.process_type = process_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.expand_mode, 'expand_mode')
        self.validate_required(self.process_type, 'process_type')

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
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        if self.process_type is not None:
            result['process_type'] = self.process_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        if m.get('process_type') is not None:
            self.process_type = m.get('process_type')
        return self


class GetInnerCustomerservicetemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        service_provider_name: str = None,
        alipay_bind_mobile: str = None,
        alipay_logon_id: str = None,
        customer_service_phone: str = None,
        customer_service_name: str = None,
        online_support_site_url: str = None,
        customer_complaint_issues: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 服务商名称
        self.service_provider_name = service_provider_name
        # 客诉处理员支付宝绑定手机号
        self.alipay_bind_mobile = alipay_bind_mobile
        # 客诉处理员支付宝账号
        self.alipay_logon_id = alipay_logon_id
        # 客服电话
        self.customer_service_phone = customer_service_phone
        # 客服人员名称
        self.customer_service_name = customer_service_name
        # 在线客服网址
        self.online_support_site_url = online_support_site_url
        # 投诉问题
        self.customer_complaint_issues = customer_complaint_issues

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
        if self.service_provider_name is not None:
            result['service_provider_name'] = self.service_provider_name
        if self.alipay_bind_mobile is not None:
            result['alipay_bind_mobile'] = self.alipay_bind_mobile
        if self.alipay_logon_id is not None:
            result['alipay_logon_id'] = self.alipay_logon_id
        if self.customer_service_phone is not None:
            result['customer_service_phone'] = self.customer_service_phone
        if self.customer_service_name is not None:
            result['customer_service_name'] = self.customer_service_name
        if self.online_support_site_url is not None:
            result['online_support_site_url'] = self.online_support_site_url
        if self.customer_complaint_issues is not None:
            result['customer_complaint_issues'] = self.customer_complaint_issues
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('service_provider_name') is not None:
            self.service_provider_name = m.get('service_provider_name')
        if m.get('alipay_bind_mobile') is not None:
            self.alipay_bind_mobile = m.get('alipay_bind_mobile')
        if m.get('alipay_logon_id') is not None:
            self.alipay_logon_id = m.get('alipay_logon_id')
        if m.get('customer_service_phone') is not None:
            self.customer_service_phone = m.get('customer_service_phone')
        if m.get('customer_service_name') is not None:
            self.customer_service_name = m.get('customer_service_name')
        if m.get('online_support_site_url') is not None:
            self.online_support_site_url = m.get('online_support_site_url')
        if m.get('customer_complaint_issues') is not None:
            self.customer_complaint_issues = m.get('customer_complaint_issues')
        return self


class QueryInnerTemplateinstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        business_id: str = None,
        need_pdf_file: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 模板code
        self.template_code = template_code
        # 业务唯一实例id（模板实例化时的业务id）
        self.business_id = business_id
        # 实例化文件是否需要pdf格式
        self.need_pdf_file = need_pdf_file

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.business_id, 'business_id')
        self.validate_required(self.need_pdf_file, 'need_pdf_file')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.business_id is not None:
            result['business_id'] = self.business_id
        if self.need_pdf_file is not None:
            result['need_pdf_file'] = self.need_pdf_file
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('business_id') is not None:
            self.business_id = m.get('business_id')
        if m.get('need_pdf_file') is not None:
            self.need_pdf_file = m.get('need_pdf_file')
        return self


class QueryInnerTemplateinstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板实例化后的信息
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
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryInnerTenantindirectmainclassRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
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
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryInnerTenantindirectmainclassResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_indirect_main_class_list: List[str] = None,
        desc: str = None,
        status: str = None,
        fail_reason: str = None,
        changing_indirect_main_class_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前开通类目
        self.current_indirect_main_class_list = current_indirect_main_class_list
        # 开通说明
        self.desc = desc
        # 状态
        # INIT:初始化
        # AUDIT:审批中
        # AUDIT_PASSED:审批通过
        # AUDIT_NOT_PASSED:审批不通过
        self.status = status
        # 审核拒绝原因
        self.fail_reason = fail_reason
        # 申请开通的类目
        self.changing_indirect_main_class_list = changing_indirect_main_class_list

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
        if self.current_indirect_main_class_list is not None:
            result['current_indirect_main_class_list'] = self.current_indirect_main_class_list
        if self.desc is not None:
            result['desc'] = self.desc
        if self.status is not None:
            result['status'] = self.status
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        if self.changing_indirect_main_class_list is not None:
            result['changing_indirect_main_class_list'] = self.changing_indirect_main_class_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current_indirect_main_class_list') is not None:
            self.current_indirect_main_class_list = m.get('current_indirect_main_class_list')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        if m.get('changing_indirect_main_class_list') is not None:
            self.changing_indirect_main_class_list = m.get('changing_indirect_main_class_list')
        return self


class UpdateInnerTenantindirectmainclassRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        indirect_main_class_list: List[str] = None,
        desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 开通类目
        self.indirect_main_class_list = indirect_main_class_list
        # 开通说明
        # 
        self.desc = desc

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.indirect_main_class_list, 'indirect_main_class_list')

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
        if self.indirect_main_class_list is not None:
            result['indirect_main_class_list'] = self.indirect_main_class_list
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('indirect_main_class_list') is not None:
            self.indirect_main_class_list = m.get('indirect_main_class_list')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class UpdateInnerTenantindirectmainclassResponse(TeaModel):
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


class SubmitInnerTemplatesyncreviewRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        source_template_code: str = None,
        target_template_name: str = None,
        source_template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 来源魔法库模板code
        self.source_template_code = source_template_code
        # 目标魔法库模板名称
        self.target_template_name = target_template_name
        # 魔法库来源模板版本
        self.source_template_version = source_template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.source_template_code, 'source_template_code')
        self.validate_required(self.target_template_name, 'target_template_name')
        self.validate_required(self.source_template_version, 'source_template_version')

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
        if self.source_template_code is not None:
            result['source_template_code'] = self.source_template_code
        if self.target_template_name is not None:
            result['target_template_name'] = self.target_template_name
        if self.source_template_version is not None:
            result['source_template_version'] = self.source_template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('source_template_code') is not None:
            self.source_template_code = m.get('source_template_code')
        if m.get('target_template_name') is not None:
            self.target_template_name = m.get('target_template_name')
        if m.get('source_template_version') is not None:
            self.source_template_version = m.get('source_template_version')
        return self


class SubmitInnerTemplatesyncreviewResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        source_template_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 提交同步上线审核的模板code
        self.source_template_code = source_template_code

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
        if self.source_template_code is not None:
            result['source_template_code'] = self.source_template_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('source_template_code') is not None:
            self.source_template_code = m.get('source_template_code')
        return self


class SubmitInnerPendingeventRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        event_id: str = None,
        action: str = None,
        operator: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 待办事件id
        self.event_id = event_id
        # 商家处理动作
        # REJECT拒绝，APPROVE 同意
        self.action = action
        # 操作人
        self.operator = operator

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.event_id, 'event_id')
        self.validate_required(self.action, 'action')
        self.validate_required(self.operator, 'operator')

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
        if self.event_id is not None:
            result['event_id'] = self.event_id
        if self.action is not None:
            result['action'] = self.action
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class SubmitInnerPendingeventResponse(TeaModel):
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


class DetailInnerPendingeventRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        event_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 事件id
        self.event_id = event_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.event_id, 'event_id')

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
        if self.event_id is not None:
            result['event_id'] = self.event_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        return self


class DetailInnerPendingeventResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        event_id: str = None,
        type: str = None,
        status: str = None,
        content_subject: str = None,
        content_details: str = None,
        action_options_config: str = None,
        effective_start_time: str = None,
        effective_end_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 事件id
        self.event_id = event_id
        # 通知:NOTIFICATION
        # 确认函:CONFIRMATION
        self.type = type
        # ("PENDING","待办中"), ("CONFIRMED","确认"), ("REJECTED","已拒绝") ("FAILED","失败"),("EXPIRED","已过期");
        self.status = status
        # 待办内容主题
        self.content_subject = content_subject
        # 待办内容详情
        self.content_details = content_details
        # 待办处理页面操作按钮
        # ACKNOWLEDGE 我已知晓
        # CONFIRM 确认
        # RETURN 返回
        # REJECT 拒绝
        self.action_options_config = action_options_config
        # 事件有效期开始
        self.effective_start_time = effective_start_time
        # 事件有效期结束
        self.effective_end_time = effective_end_time

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
        if self.event_id is not None:
            result['event_id'] = self.event_id
        if self.type is not None:
            result['type'] = self.type
        if self.status is not None:
            result['status'] = self.status
        if self.content_subject is not None:
            result['content_subject'] = self.content_subject
        if self.content_details is not None:
            result['content_details'] = self.content_details
        if self.action_options_config is not None:
            result['action_options_config'] = self.action_options_config
        if self.effective_start_time is not None:
            result['effective_start_time'] = self.effective_start_time
        if self.effective_end_time is not None:
            result['effective_end_time'] = self.effective_end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('content_subject') is not None:
            self.content_subject = m.get('content_subject')
        if m.get('content_details') is not None:
            self.content_details = m.get('content_details')
        if m.get('action_options_config') is not None:
            self.action_options_config = m.get('action_options_config')
        if m.get('effective_start_time') is not None:
            self.effective_start_time = m.get('effective_start_time')
        if m.get('effective_end_time') is not None:
            self.effective_end_time = m.get('effective_end_time')
        return self


class AddInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 合同模板code
        self.template_code = template_code

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        return self


class AddInnerTemplateResponse(TeaModel):
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


class PagequeryInnerPendingeventRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        status_list: List[str] = None,
        type: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 待办状态
        self.status_list = status_list
        # 事件类型
        # 通知:NOTIFICATION
        # 确认函:CONFIRMATION
        self.type = type
        # 分页
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.status_list is not None:
            result['status_list'] = self.status_list
        if self.type is not None:
            result['type'] = self.type
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('status_list') is not None:
            self.status_list = m.get('status_list')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerPendingeventResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        pending_event_info_list: List[PendingEventInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总量
        self.total = total
        # 待办列表信息
        self.pending_event_info_list = pending_event_info_list

    def validate(self):
        if self.pending_event_info_list:
            for k in self.pending_event_info_list:
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
        result['pending_event_info_list'] = []
        if self.pending_event_info_list is not None:
            for k in self.pending_event_info_list:
                result['pending_event_info_list'].append(k.to_map() if k else None)
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
        self.pending_event_info_list = []
        if m.get('pending_event_info_list') is not None:
            for k in m.get('pending_event_info_list'):
                temp_model = PendingEventInfo()
                self.pending_event_info_list.append(temp_model.from_map(k))
        return self


class UpdateInnerMerchantpayexpandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_info: CompanyInfoUpdate = None,
        legal_info: LegalInfoUpdate = None,
        application_info: ApplicationInfoUpdate = None,
        pay_expand_id: str = None,
        merchant_id: str = None,
        tenant_id: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 公司信息
        self.company_info = company_info
        # 法人信息
        self.legal_info = legal_info
        # 应用信息
        self.application_info = application_info
        # 进件流水号
        self.pay_expand_id = pay_expand_id
        # 社会统一信用代码
        self.merchant_id = merchant_id
        # 租户id
        self.tenant_id = tenant_id
        # 操作人名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.company_info, 'company_info')
        if self.company_info:
            self.company_info.validate()
        self.validate_required(self.legal_info, 'legal_info')
        if self.legal_info:
            self.legal_info.validate()
        self.validate_required(self.application_info, 'application_info')
        if self.application_info:
            self.application_info.validate()
        self.validate_required(self.pay_expand_id, 'pay_expand_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_info is not None:
            result['company_info'] = self.company_info.to_map()
        if self.legal_info is not None:
            result['legal_info'] = self.legal_info.to_map()
        if self.application_info is not None:
            result['application_info'] = self.application_info.to_map()
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_info') is not None:
            temp_model = CompanyInfoUpdate()
            self.company_info = temp_model.from_map(m['company_info'])
        if m.get('legal_info') is not None:
            temp_model = LegalInfoUpdate()
            self.legal_info = temp_model.from_map(m['legal_info'])
        if m.get('application_info') is not None:
            temp_model = ApplicationInfoUpdate()
            self.application_info = temp_model.from_map(m['application_info'])
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class UpdateInnerMerchantpayexpandResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_expand_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 进件流水号
        self.pay_expand_id = pay_expand_id

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
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        return self


class QueryInnerTenantaccountinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
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
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryInnerTenantaccountinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: str = None,
        bind_mobile: str = None,
        login_name: str = None,
        create_time: str = None,
        is_certified: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户id
        self.tenant_id = tenant_id
        # 绑定手机号
        self.bind_mobile = bind_mobile
        # 登录账号
        self.login_name = login_name
        # 注册时间
        self.create_time = create_time
        # 是否已实名认证
        self.is_certified = is_certified

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
        if self.bind_mobile is not None:
            result['bind_mobile'] = self.bind_mobile
        if self.login_name is not None:
            result['login_name'] = self.login_name
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.is_certified is not None:
            result['is_certified'] = self.is_certified
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
        if m.get('bind_mobile') is not None:
            self.bind_mobile = m.get('bind_mobile')
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('is_certified') is not None:
            self.is_certified = m.get('is_certified')
        return self


class CreateInnerTenantaccountinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alipay_user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支付宝账号id
        self.alipay_user_id = alipay_user_id

    def validate(self):
        self.validate_required(self.alipay_user_id, 'alipay_user_id')

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        return self


class CreateInnerTenantaccountinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: str = None,
        login_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户id
        self.tenant_id = tenant_id
        # 登录账号
        self.login_name = login_name

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
        if self.login_name is not None:
            result['login_name'] = self.login_name
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
        if m.get('login_name') is not None:
            self.login_name = m.get('login_name')
        return self


class GetInnerAgentcustomerserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
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
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class GetInnerAgentcustomerserviceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        customer_complaint_issues: str = None,
        customer_person_info_list: List[CustomerPersonInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 客诉问题
        self.customer_complaint_issues = customer_complaint_issues
        # 客诉处理人员信息
        self.customer_person_info_list = customer_person_info_list

    def validate(self):
        if self.customer_person_info_list:
            for k in self.customer_person_info_list:
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
        if self.customer_complaint_issues is not None:
            result['customer_complaint_issues'] = self.customer_complaint_issues
        result['customer_person_info_list'] = []
        if self.customer_person_info_list is not None:
            for k in self.customer_person_info_list:
                result['customer_person_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('customer_complaint_issues') is not None:
            self.customer_complaint_issues = m.get('customer_complaint_issues')
        self.customer_person_info_list = []
        if m.get('customer_person_info_list') is not None:
            for k in m.get('customer_person_info_list'):
                temp_model = CustomerPersonInfo()
                self.customer_person_info_list.append(temp_model.from_map(k))
        return self


class SaveInnerAgentcustomerserviceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        customer_complaint_issues: str = None,
        customer_person_info_list: List[CustomerPersonInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 客诉问题
        self.customer_complaint_issues = customer_complaint_issues
        # 客诉处理人员信息
        self.customer_person_info_list = customer_person_info_list

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.customer_complaint_issues, 'customer_complaint_issues')
        self.validate_required(self.customer_person_info_list, 'customer_person_info_list')
        if self.customer_person_info_list:
            for k in self.customer_person_info_list:
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.customer_complaint_issues is not None:
            result['customer_complaint_issues'] = self.customer_complaint_issues
        result['customer_person_info_list'] = []
        if self.customer_person_info_list is not None:
            for k in self.customer_person_info_list:
                result['customer_person_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('customer_complaint_issues') is not None:
            self.customer_complaint_issues = m.get('customer_complaint_issues')
        self.customer_person_info_list = []
        if m.get('customer_person_info_list') is not None:
            for k in m.get('customer_person_info_list'):
                temp_model = CustomerPersonInfo()
                self.customer_person_info_list.append(temp_model.from_map(k))
        return self


class SaveInnerAgentcustomerserviceResponse(TeaModel):
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


class QueryInnerLoggerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        channel: str = None,
        channel_account_id: str = None,
        trace_id: str = None,
        start_time: str = None,
        end_time: str = None,
        page_info: PageQuery = None,
        ext_query_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务渠道：DINGDING
        self.channel = channel
        # 钉钉群id
        # 租户id
        # 支付宝uuid
        self.channel_account_id = channel_account_id
        # traceid
        self.trace_id = trace_id
        # 开始时间
        self.start_time = start_time
        # 结束时间
        self.end_time = end_time
        # 分页
        self.page_info = page_info
        # 额外查询参数
        self.ext_query_param = ext_query_param

    def validate(self):
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.channel_account_id, 'channel_account_id')
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.channel is not None:
            result['channel'] = self.channel
        if self.channel_account_id is not None:
            result['channel_account_id'] = self.channel_account_id
        if self.trace_id is not None:
            result['trace_id'] = self.trace_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.ext_query_param is not None:
            result['ext_query_param'] = self.ext_query_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('channel_account_id') is not None:
            self.channel_account_id = m.get('channel_account_id')
        if m.get('trace_id') is not None:
            self.trace_id = m.get('trace_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('ext_query_param') is not None:
            self.ext_query_param = m.get('ext_query_param')
        return self


class QueryInnerLoggerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content: str = None,
        total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 日志内容
        self.content = content
        # 总条数
        self.total = total

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
        if self.content is not None:
            result['content'] = self.content
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class SubmitInnerDatadownloadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        merchant_name: str = None,
        start_time: str = None,
        end_time: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 商户社会统一信用代码
        self.merchant_id = merchant_id
        # 公司名称
        self.merchant_name = merchant_name
        # 开始时间
        self.start_time = start_time
        # 结束时间
        self.end_time = end_time
        # 下载数据类型
        # 交易履约账单:TRADE_PROMISE_BILL
        self.type = type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')
        self.validate_required(self.type, 'type')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class SubmitInnerDatadownloadResponse(TeaModel):
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


class PagequeryInnerDatadownloadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        status: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 状态
        self.status = status
        # 分页参数
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.status is not None:
            result['status'] = self.status
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerDatadownloadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        data_download_info: List[DataDownloadInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总数
        self.total = total
        # 下载数据列表
        self.data_download_info = data_download_info

    def validate(self):
        if self.data_download_info:
            for k in self.data_download_info:
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
        result['data_download_info'] = []
        if self.data_download_info is not None:
            for k in self.data_download_info:
                result['data_download_info'].append(k.to_map() if k else None)
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
        self.data_download_info = []
        if m.get('data_download_info') is not None:
            for k in m.get('data_download_info'):
                temp_model = DataDownloadInfo()
                self.data_download_info.append(temp_model.from_map(k))
        return self


class DeleteInnerDatadownloadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 流水号
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_no, 'biz_no')

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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class DeleteInnerDatadownloadResponse(TeaModel):
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


class PagequeryInnerCompanyinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 分页参数
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

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
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerCompanyinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        company_info: List[CompanySummaryInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总数
        self.total = total
        # 公司信息
        self.company_info = company_info

    def validate(self):
        if self.company_info:
            for k in self.company_info:
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
        result['company_info'] = []
        if self.company_info is not None:
            for k in self.company_info:
                result['company_info'].append(k.to_map() if k else None)
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
        self.company_info = []
        if m.get('company_info') is not None:
            for k in m.get('company_info'):
                temp_model = CompanySummaryInfo()
                self.company_info.append(temp_model.from_map(k))
        return self


class QueryInnerExpandprocessRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        expand_mode: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 进件类型
        # DIRECT("DIRECT", "直连进件模式"),
        # AGENT("AGENT", "代理商进件模式"),
        # 
        self.expand_mode = expand_mode

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.expand_mode, 'expand_mode')

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
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        return self


class QueryInnerExpandprocessResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        process_info_list: List[ExpandProcessInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 进件流程信息
        self.process_info_list = process_info_list

    def validate(self):
        if self.process_info_list:
            for k in self.process_info_list:
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
        result['process_info_list'] = []
        if self.process_info_list is not None:
            for k in self.process_info_list:
                result['process_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.process_info_list = []
        if m.get('process_info_list') is not None:
            for k in m.get('process_info_list'):
                temp_model = ExpandProcessInfo()
                self.process_info_list.append(temp_model.from_map(k))
        return self


class CreateInsureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        risk_flow_id: str = None,
        insure_company_type: str = None,
        insure_product_type: str = None,
        product_info_list: List[InsureProductInfo] = None,
        delivery_type: str = None,
        contact_name: str = None,
        contact_mobile: str = None,
        facevrf_flow_id: str = None,
        logistics_number: str = None,
        trade_time: str = None,
        address: str = None,
        period: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户的订单号，后续用作和保单结果交互
        self.order_id = order_id
        # 风控业务流水号
        self.risk_flow_id = risk_flow_id
        # 保险公司枚举，PA：平安保险
        self.insure_company_type = insure_company_type
        # 保险类型枚举，PERFORMANCE：履约
        self.insure_product_type = insure_product_type
        # 投保商品信息列表
        self.product_info_list = product_info_list
        # 发货方式枚举，可选值：
        # EXPRESS-物流发货
        # OFFLINE-线下交易
        self.delivery_type = delivery_type
        # 公司联系人姓名，RSA 加密传输
        self.contact_name = contact_name
        # 公司联系人手机号，RSA 加密传输
        self.contact_mobile = contact_mobile
        # 实人认证业务流水号
        self.facevrf_flow_id = facevrf_flow_id
        # 物流单号，非必填参数。如果选择的物流发货方式为 EXPRESS（物流发货），则该字段必填。
        self.logistics_number = logistics_number
        # 交易时间，非必填参数。如果发货方式为 OFFLINE（线下交易），则该字段必填。
        self.trade_time = trade_time
        # 公司地址信息，此处填写的地址信息为投保时最高优先级地址，其次为公司进件时填写的地址信息。如果取不到明确地址信息，投保会失败。
        self.address = address
        # 保险投保期数
        self.period = period

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.risk_flow_id, 'risk_flow_id')
        self.validate_required(self.insure_company_type, 'insure_company_type')
        self.validate_required(self.insure_product_type, 'insure_product_type')
        self.validate_required(self.product_info_list, 'product_info_list')
        if self.product_info_list:
            for k in self.product_info_list:
                if k:
                    k.validate()
        self.validate_required(self.delivery_type, 'delivery_type')
        if self.delivery_type is not None:
            self.validate_max_length(self.delivery_type, 'delivery_type', 64)
        self.validate_required(self.contact_name, 'contact_name')
        if self.contact_name is not None:
            self.validate_max_length(self.contact_name, 'contact_name', 2000)
        self.validate_required(self.contact_mobile, 'contact_mobile')
        if self.contact_mobile is not None:
            self.validate_max_length(self.contact_mobile, 'contact_mobile', 2000)
        if self.logistics_number is not None:
            self.validate_max_length(self.logistics_number, 'logistics_number', 64)
        if self.address is not None:
            self.validate_max_length(self.address, 'address', 512)
        if self.period is not None:
            self.validate_maximum(self.period, 'period', 120)
            self.validate_minimum(self.period, 'period', 1)

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
        if self.risk_flow_id is not None:
            result['risk_flow_id'] = self.risk_flow_id
        if self.insure_company_type is not None:
            result['insure_company_type'] = self.insure_company_type
        if self.insure_product_type is not None:
            result['insure_product_type'] = self.insure_product_type
        result['product_info_list'] = []
        if self.product_info_list is not None:
            for k in self.product_info_list:
                result['product_info_list'].append(k.to_map() if k else None)
        if self.delivery_type is not None:
            result['delivery_type'] = self.delivery_type
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_mobile is not None:
            result['contact_mobile'] = self.contact_mobile
        if self.facevrf_flow_id is not None:
            result['facevrf_flow_id'] = self.facevrf_flow_id
        if self.logistics_number is not None:
            result['logistics_number'] = self.logistics_number
        if self.trade_time is not None:
            result['trade_time'] = self.trade_time
        if self.address is not None:
            result['address'] = self.address
        if self.period is not None:
            result['period'] = self.period
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('risk_flow_id') is not None:
            self.risk_flow_id = m.get('risk_flow_id')
        if m.get('insure_company_type') is not None:
            self.insure_company_type = m.get('insure_company_type')
        if m.get('insure_product_type') is not None:
            self.insure_product_type = m.get('insure_product_type')
        self.product_info_list = []
        if m.get('product_info_list') is not None:
            for k in m.get('product_info_list'):
                temp_model = InsureProductInfo()
                self.product_info_list.append(temp_model.from_map(k))
        if m.get('delivery_type') is not None:
            self.delivery_type = m.get('delivery_type')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_mobile') is not None:
            self.contact_mobile = m.get('contact_mobile')
        if m.get('facevrf_flow_id') is not None:
            self.facevrf_flow_id = m.get('facevrf_flow_id')
        if m.get('logistics_number') is not None:
            self.logistics_number = m.get('logistics_number')
        if m.get('trade_time') is not None:
            self.trade_time = m.get('trade_time')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('period') is not None:
            self.period = m.get('period')
        return self


class CreateInsureResponse(TeaModel):
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


class QueryInsureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        insure_product_type: str = None,
        insure_company_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户的订单号
        self.order_id = order_id
        # 保险类型枚举，PERFORMANCE：履约
        self.insure_product_type = insure_product_type
        # 保险公司枚举，PA：平安保险
        self.insure_company_type = insure_company_type

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.insure_product_type, 'insure_product_type')
        self.validate_required(self.insure_company_type, 'insure_company_type')

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
        if self.insure_product_type is not None:
            result['insure_product_type'] = self.insure_product_type
        if self.insure_company_type is not None:
            result['insure_company_type'] = self.insure_company_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('insure_product_type') is not None:
            self.insure_product_type = m.get('insure_product_type')
        if m.get('insure_company_type') is not None:
            self.insure_company_type = m.get('insure_company_type')
        return self


class QueryInsureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        insure_id: str = None,
        status: str = None,
        product_name: str = None,
        insure_start_time: str = None,
        insure_end_time: str = None,
        insure_amount: str = None,
        insure_premium: str = None,
        policy_url: str = None,
        validate_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商户的订单号
        self.order_id = order_id
        # 保单号
        self.insure_id = insure_id
        # 保险订单状态。TOBE_INSURE：待发起投保 ；INSUR_PRE_SUCC：投保成功。WITHHOLD_DEDUCTING：代扣中；WITHHOLD_SUCC：代扣成功。WITHHOLD_FAIL：代扣失败。INSUR_SUCC：承保成功
        self.status = status
        # 商品名称
        self.product_name = product_name
        # 2024-09-24 20:04:35
        self.insure_start_time = insure_start_time
        # 2024-12-24 20:04:35
        self.insure_end_time = insure_end_time
        # 投保金额（保额），单位分。100代表1元
        self.insure_amount = insure_amount
        # 投保费用（保费），单位分。100代表1元
        self.insure_premium = insure_premium
        # 电子保单下载链接
        self.policy_url = policy_url
        # 验真码
        self.validate_code = validate_code

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
        if self.insure_id is not None:
            result['insure_id'] = self.insure_id
        if self.status is not None:
            result['status'] = self.status
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.insure_start_time is not None:
            result['insure_start_time'] = self.insure_start_time
        if self.insure_end_time is not None:
            result['insure_end_time'] = self.insure_end_time
        if self.insure_amount is not None:
            result['insure_amount'] = self.insure_amount
        if self.insure_premium is not None:
            result['insure_premium'] = self.insure_premium
        if self.policy_url is not None:
            result['policy_url'] = self.policy_url
        if self.validate_code is not None:
            result['validate_code'] = self.validate_code
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
        if m.get('insure_id') is not None:
            self.insure_id = m.get('insure_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('insure_start_time') is not None:
            self.insure_start_time = m.get('insure_start_time')
        if m.get('insure_end_time') is not None:
            self.insure_end_time = m.get('insure_end_time')
        if m.get('insure_amount') is not None:
            self.insure_amount = m.get('insure_amount')
        if m.get('insure_premium') is not None:
            self.insure_premium = m.get('insure_premium')
        if m.get('policy_url') is not None:
            self.policy_url = m.get('policy_url')
        if m.get('validate_code') is not None:
            self.validate_code = m.get('validate_code')
        return self


class RetryInsurePayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        insure_product_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户的订单号，后续用作和保单结果交互
        self.order_id = order_id
        # 保险公司产品（险种）类型
        self.insure_product_type = insure_product_type

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.insure_product_type, 'insure_product_type')
        if self.insure_product_type is not None:
            self.validate_max_length(self.insure_product_type, 'insure_product_type', 64)

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
        if self.insure_product_type is not None:
            result['insure_product_type'] = self.insure_product_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('insure_product_type') is not None:
            self.insure_product_type = m.get('insure_product_type')
        return self


class RetryInsurePayResponse(TeaModel):
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


class RegisterMerchantexpandMerchantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_info: CompanyInfo = None,
        legal_info: LegalInfo = None,
        application_info: ApplicationInfo = None,
        expand_mode: str = None,
        sub_tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 公司信息
        self.company_info = company_info
        # 法人信息
        self.legal_info = legal_info
        # 应用信息
        self.application_info = application_info
        # 进件模式 DIRECT(直连进件) AGENT(代理进件)
        self.expand_mode = expand_mode
        # expand_mode=_AGENT_ 必填
        self.sub_tenant_id = sub_tenant_id

    def validate(self):
        self.validate_required(self.company_info, 'company_info')
        if self.company_info:
            self.company_info.validate()
        self.validate_required(self.legal_info, 'legal_info')
        if self.legal_info:
            self.legal_info.validate()
        self.validate_required(self.application_info, 'application_info')
        if self.application_info:
            self.application_info.validate()
        self.validate_required(self.expand_mode, 'expand_mode')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_info is not None:
            result['company_info'] = self.company_info.to_map()
        if self.legal_info is not None:
            result['legal_info'] = self.legal_info.to_map()
        if self.application_info is not None:
            result['application_info'] = self.application_info.to_map()
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        if self.sub_tenant_id is not None:
            result['sub_tenant_id'] = self.sub_tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_info') is not None:
            temp_model = CompanyInfo()
            self.company_info = temp_model.from_map(m['company_info'])
        if m.get('legal_info') is not None:
            temp_model = LegalInfo()
            self.legal_info = temp_model.from_map(m['legal_info'])
        if m.get('application_info') is not None:
            temp_model = ApplicationInfo()
            self.application_info = temp_model.from_map(m['application_info'])
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        if m.get('sub_tenant_id') is not None:
            self.sub_tenant_id = m.get('sub_tenant_id')
        return self


class RegisterMerchantexpandMerchantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_expand_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 进件流水号
        self.pay_expand_id = pay_expand_id

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
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        return self


class UploadMerchantexpandFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_name: str = None,
        biz_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件名称 包含后缀
        self.file_name = file_name
        # ● BUSINESS_LICENSE 营业执照 ● CARD_FRONT 身份证正面 ● CARD_BACK 身份证反面 ● SPLITTING 分账
        self.biz_scene = biz_scene

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
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
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        return self


class UploadMerchantexpandFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        upload_url: str = None,
        file_key: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 临时上传文件地址
        self.upload_url = upload_url
        # 文件key
        self.file_key = file_key

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
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class QueryMerchantexpandMerchantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        pay_expand_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户入驻返回的进件编号 expand_mode=AGENT必填
        self.pay_expand_id = pay_expand_id

    def validate(self):
        self.validate_required(self.pay_expand_id, 'pay_expand_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        return self


class QueryMerchantexpandMerchantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        enrollment_status: str = None,
        fail_reason: str = None,
        pending_event_link: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商户入驻状态
        # INIT 入驻中
        # SUCCESS 入驻成功
        # FAIL 入驻失败
        # MERCHANT_CONFIRM 待商户B站确认
        # SUB_MERCHANT_CREDIT 二级户商户签约中
        self.enrollment_status = enrollment_status
        # 入驻失败原因
        self.fail_reason = fail_reason
        # 商户进件流程待办事件跳转链接
        self.pending_event_link = pending_event_link

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
        if self.enrollment_status is not None:
            result['enrollment_status'] = self.enrollment_status
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        if self.pending_event_link is not None:
            result['pending_event_link'] = self.pending_event_link
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('enrollment_status') is not None:
            self.enrollment_status = m.get('enrollment_status')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        if m.get('pending_event_link') is not None:
            self.pending_event_link = m.get('pending_event_link')
        return self


class UpdateMerchantexpandMerchantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_info: CompanyInfoUpdate = None,
        legal_info: LegalInfoUpdate = None,
        application_info: ApplicationInfoUpdate = None,
        pay_expand_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 公司信息
        self.company_info = company_info
        # 法人信息
        self.legal_info = legal_info
        # 应用信息
        self.application_info = application_info
        # 进件流水号
        self.pay_expand_id = pay_expand_id
        # 社会统一信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.company_info, 'company_info')
        if self.company_info:
            self.company_info.validate()
        self.validate_required(self.legal_info, 'legal_info')
        if self.legal_info:
            self.legal_info.validate()
        self.validate_required(self.application_info, 'application_info')
        if self.application_info:
            self.application_info.validate()
        self.validate_required(self.pay_expand_id, 'pay_expand_id')
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_info is not None:
            result['company_info'] = self.company_info.to_map()
        if self.legal_info is not None:
            result['legal_info'] = self.legal_info.to_map()
        if self.application_info is not None:
            result['application_info'] = self.application_info.to_map()
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_info') is not None:
            temp_model = CompanyInfoUpdate()
            self.company_info = temp_model.from_map(m['company_info'])
        if m.get('legal_info') is not None:
            temp_model = LegalInfoUpdate()
            self.legal_info = temp_model.from_map(m['legal_info'])
        if m.get('application_info') is not None:
            temp_model = ApplicationInfoUpdate()
            self.application_info = temp_model.from_map(m['application_info'])
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class UpdateMerchantexpandMerchantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_expand_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 进件流水号
        self.pay_expand_id = pay_expand_id

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
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        return self


class AddMerchantexpandDividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        divide_binding_trans_in_info_list: List[DivideBindingTransInInfo] = None,
        divide_radio: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被分账方社会统一信用代码
        self.merchant_id = merchant_id
        # 分账方信息，最多支持10组
        self.divide_binding_trans_in_info_list = divide_binding_trans_in_info_list
        # 分账比例上限
        self.divide_radio = divide_radio

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.divide_binding_trans_in_info_list, 'divide_binding_trans_in_info_list')
        if self.divide_binding_trans_in_info_list:
            for k in self.divide_binding_trans_in_info_list:
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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        result['divide_binding_trans_in_info_list'] = []
        if self.divide_binding_trans_in_info_list is not None:
            for k in self.divide_binding_trans_in_info_list:
                result['divide_binding_trans_in_info_list'].append(k.to_map() if k else None)
        if self.divide_radio is not None:
            result['divide_radio'] = self.divide_radio
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        self.divide_binding_trans_in_info_list = []
        if m.get('divide_binding_trans_in_info_list') is not None:
            for k in m.get('divide_binding_trans_in_info_list'):
                temp_model = DivideBindingTransInInfo()
                self.divide_binding_trans_in_info_list.append(temp_model.from_map(k))
        if m.get('divide_radio') is not None:
            self.divide_radio = m.get('divide_radio')
        return self


class AddMerchantexpandDividerelationResponse(TeaModel):
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


class QueryMerchantexpandDividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被分账方社会统一信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class QueryMerchantexpandDividerelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        alipay_pid_list: List[str] = None,
        divide_radio: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分账绑定关系支付宝pid
        self.alipay_pid_list = alipay_pid_list
        # 分账比例上限
        self.divide_radio = divide_radio

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
        if self.alipay_pid_list is not None:
            result['alipay_pid_list'] = self.alipay_pid_list
        if self.divide_radio is not None:
            result['divide_radio'] = self.divide_radio
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('alipay_pid_list') is not None:
            self.alipay_pid_list = m.get('alipay_pid_list')
        if m.get('divide_radio') is not None:
            self.divide_radio = m.get('divide_radio')
        return self


class CreateRealpersonFacevrfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        solution_type: str = None,
        cert_name: str = None,
        cert_no: str = None,
        cert_type: str = None,
        face_reserve_strategy: str = None,
        return_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 实人认证方案枚举
        # APP（客户端android/ios方案）
        # H5（网页）
        # ZFB（支付宝客户端H5方案）
        self.solution_type = solution_type
        # 真实姓名
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 身份信息来源类型
        # IDENTITY_CARD（身份证）
        self.cert_type = cert_type
        # 【solution_type=ZFB使用】
        # reserve（保存活体人脸 默认值）
        # never（不保存活体人脸）
        self.face_reserve_strategy = face_reserve_strategy
        # 【solution_type=ZFB使用】
        # 认证成功后需要跳转的地址
        self.return_url = return_url

    def validate(self):
        self.validate_required(self.solution_type, 'solution_type')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_type, 'cert_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.solution_type is not None:
            result['solution_type'] = self.solution_type
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.face_reserve_strategy is not None:
            result['face_reserve_strategy'] = self.face_reserve_strategy
        if self.return_url is not None:
            result['return_url'] = self.return_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('solution_type') is not None:
            self.solution_type = m.get('solution_type')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('face_reserve_strategy') is not None:
            self.face_reserve_strategy = m.get('face_reserve_strategy')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        return self


class CreateRealpersonFacevrfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        real_person_verification_code: str = None,
        web_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求唯一ID标识，为空则是异常
        self.real_person_verification_code = real_person_verification_code
        # 【solution_type=H5 | ZFB返回】
        # 人脸核身url地址
        self.web_url = web_url

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
        if self.real_person_verification_code is not None:
            result['real_person_verification_code'] = self.real_person_verification_code
        if self.web_url is not None:
            result['web_url'] = self.web_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('real_person_verification_code') is not None:
            self.real_person_verification_code = m.get('real_person_verification_code')
        if m.get('web_url') is not None:
            self.web_url = m.get('web_url')
        return self


class QueryRealpersonFacevrfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        real_person_verification_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 可信实人认证的唯一标识
        self.real_person_verification_code = real_person_verification_code

    def validate(self):
        self.validate_required(self.real_person_verification_code, 'real_person_verification_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.real_person_verification_code is not None:
            result['real_person_verification_code'] = self.real_person_verification_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('real_person_verification_code') is not None:
            self.real_person_verification_code = m.get('real_person_verification_code')
        return self


class QueryRealpersonFacevrfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certify_state: str = None,
        attack_flag: str = None,
        alive_photo: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实人认证结果
        # PROCESSING（初始化）
        # SUCCESS（认证通过）FAIL（认证不通过）
        self.certify_state = certify_state
        # 【solution_type=H5 | APP 返回】
        # 本次认证是否存在安全风险
        # true(检测到安全风险)
        # false(未检测到安全风险)
        self.attack_flag = attack_flag
        # 【solution_type=H5 | APP 返回】
        # base64过后的二值化图片
        self.alive_photo = alive_photo

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
        if self.certify_state is not None:
            result['certify_state'] = self.certify_state
        if self.attack_flag is not None:
            result['attack_flag'] = self.attack_flag
        if self.alive_photo is not None:
            result['alive_photo'] = self.alive_photo
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certify_state') is not None:
            self.certify_state = m.get('certify_state')
        if m.get('attack_flag') is not None:
            self.attack_flag = m.get('attack_flag')
        if m.get('alive_photo') is not None:
            self.alive_photo = m.get('alive_photo')
        return self


class QueryRiskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_name: str = None,
        user_name: str = None,
        cert_no: str = None,
        mobile: str = None,
        alipay_user_id: str = None,
        source: str = None,
        risk_biz_scene: str = None,
        item_detail: ItemDetail = None,
        price_detail: PriceDetail = None,
        delivery_detail: DeliveryDetail = None,
        industry: str = None,
        model_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 枚举值：蚁盾版、智租版、旗舰版，蚁盾版代表仅调用蚁盾风控，智租版代表仅调用小程序云风控，旗舰版代表调用蚁盾+旗舰版风控接口
        self.product_name = product_name
        # 用户姓名
        self.user_name = user_name
        # 用户证件号码
        self.cert_no = cert_no
        # 用户手机号码
        self.mobile = mobile
        # 支付宝账户 UserId，智租版可选
        self.alipay_user_id = alipay_user_id
        # 下单渠道，智租版必选。枚举值：支付宝-ALIPAY；微信-WECHAT；独立APP-APP；抖音-DOUYIN；美团-MEITUAN；其他:-OTHER
        self.source = source
        # 风险业务场景，智租版选填。默认值：PRE_RENT。
        # PRE_RENT - 3c租赁；PRE_RENT_3C - 3c租赁定制；PRE_RENT_PET - 宠物；PRE_RENT_EDU - 教培；PRE_RENT_BEAUTY - 美业；
        self.risk_biz_scene = risk_biz_scene
        # 商品详情，智租版可选
        self.item_detail = item_detail
        # 价格详情，智租版可选
        self.price_detail = price_detail
        # 物流信息，智租版可选
        self.delivery_detail = delivery_detail
        # 枚举值：3C_RENTAL、NE_RENTAL、OTHER_RENTAL、PETS、BEAUTY、EDUCATION、FITNESS、GENERAL_INDUSTRY_OTHER
        self.industry = industry
        # 枚举值：ZOLOZ_V2、ZOLOZ_V3、GENERAL_INDUSTRY、APPLET_RISK
        self.model_version = model_version

    def validate(self):
        self.validate_required(self.user_name, 'user_name')
        if self.user_name is not None:
            self.validate_max_length(self.user_name, 'user_name', 2000)
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 20)
        if self.source is not None:
            self.validate_max_length(self.source, 'source', 10)
        if self.risk_biz_scene is not None:
            self.validate_max_length(self.risk_biz_scene, 'risk_biz_scene', 100)
        if self.item_detail:
            self.item_detail.validate()
        if self.price_detail:
            self.price_detail.validate()
        if self.delivery_detail:
            self.delivery_detail.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.source is not None:
            result['source'] = self.source
        if self.risk_biz_scene is not None:
            result['risk_biz_scene'] = self.risk_biz_scene
        if self.item_detail is not None:
            result['item_detail'] = self.item_detail.to_map()
        if self.price_detail is not None:
            result['price_detail'] = self.price_detail.to_map()
        if self.delivery_detail is not None:
            result['delivery_detail'] = self.delivery_detail.to_map()
        if self.industry is not None:
            result['industry'] = self.industry
        if self.model_version is not None:
            result['model_version'] = self.model_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('risk_biz_scene') is not None:
            self.risk_biz_scene = m.get('risk_biz_scene')
        if m.get('item_detail') is not None:
            temp_model = ItemDetail()
            self.item_detail = temp_model.from_map(m['item_detail'])
        if m.get('price_detail') is not None:
            temp_model = PriceDetail()
            self.price_detail = temp_model.from_map(m['price_detail'])
        if m.get('delivery_detail') is not None:
            temp_model = DeliveryDetail()
            self.delivery_detail = temp_model.from_map(m['delivery_detail'])
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('model_version') is not None:
            self.model_version = m.get('model_version')
        return self


class QueryRiskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        models: List[RiskModel] = None,
        applet_model: AppletRiskModel = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型结果详情
        self.models = models
        # 智租风控-风控模型结果
        self.applet_model = applet_model

    def validate(self):
        if self.models:
            for k in self.models:
                if k:
                    k.validate()
        if self.applet_model:
            self.applet_model.validate()

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
        result['models'] = []
        if self.models is not None:
            for k in self.models:
                result['models'].append(k.to_map() if k else None)
        if self.applet_model is not None:
            result['applet_model'] = self.applet_model.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.models = []
        if m.get('models') is not None:
            for k in m.get('models'):
                temp_model = RiskModel()
                self.models.append(temp_model.from_map(k))
        if m.get('applet_model') is not None:
            temp_model = AppletRiskModel()
            self.applet_model = temp_model.from_map(m['applet_model'])
        return self


class QueryRiskGoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        risk_type: str = None,
        flow_id: str = None,
        business_code: str = None,
        scene: str = None,
        user_id: str = None,
        open_id: str = None,
        mer_pid: str = None,
        mobile_no: str = None,
        cert_no: str = None,
        ip: str = None,
        lbs: str = None,
        role: str = None,
        activity_info: str = None,
        purchase_query_model: PurchaseQueryModel = None,
        scalper_query_model: ScalperQueryModel = None,
        awarding_query_model: AwardingQueryModel = None,
        farming_query_model: FarmingQueryModel = None,
        baddebt_query_model: BaddebtQueryModel = None,
        merchant_app_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 风险类型。枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
        self.risk_type = risk_type
        # 单次请求流水号，需要保证唯一
        self.flow_id = flow_id
        # 调用行业，枚举值：
        # insurance 保险；retail 零售；finance 金融行业；logistics 物流行业；city_services 城市服务；medical 医疗服务；digital_media 数媒行业；recycle 回收行业；payment 缴费行业；vehicle 汽车；travel 旅游；air_travel 航旅行业；FMCG 快消零售；education 教育行业；fashion_retail 时尚零售；game_industry 文体行业；rental 租赁；advertisement 广告行业；restaurants 餐饮行业；ticket 票务行业；complexes 综合体行业
        self.business_code = business_code
        # 风险咨询对应的自身业务场景/环节，枚举值：
        # register 注册；order 下单；payment 支付；login 登录；offline_query 离线查询；inquery 查询；reserve 预约；invitation 邀请；other 其他
        self.scene = scene
        # 支付宝用户 2088 账号
        self.user_id = user_id
        # 支付宝用户 open_id 账号。需要注意，user_id 和 open_id 不可同时为空，同时传入时，以 user_id 为准
        self.open_id = open_id
        # 支付宝商家 pid，如果风险咨询对象是支付宝商家，则填写pid
        self.mer_pid = mer_pid
        # 手机号码，用于直接输入风险咨询对象的手机号码
        self.mobile_no = mobile_no
        # 身份证号码
        self.cert_no = cert_no
        # 账户登录 ip
        self.ip = ip
        # 地理位置，用于输入用户产生交易时的地理位置信息
        self.lbs = lbs
        # 咨询方类型，填写风险咨询中对应的商户或服务商对于蚂蚁的类型。枚举值：direct_isv 直连服务商；indirect_isv 间连服务商；unconn_isv 无关服务商；direct_mer 直连商户；indirect_mer 间连商户；unconn_mer 无关联商户；unknown 其他
        self.role = role
        # 可填入活动id唯一值，或其他活动信息
        self.activity_info = activity_info
        # 营销抢购风险识别入参模型
        self.purchase_query_model = purchase_query_model
        # 行业黄牛风险识别入参模型
        self.scalper_query_model = scalper_query_model
        # 营销发奖风险识别入参模型
        self.awarding_query_model = awarding_query_model
        # 行业刷单风险识别入参模型
        self.farming_query_model = farming_query_model
        # 行业履约风险识别入参模型
        self.baddebt_query_model = baddebt_query_model
        # 商户appId,当openId不为空时必填
        self.merchant_app_id = merchant_app_id

    def validate(self):
        self.validate_required(self.risk_type, 'risk_type')
        if self.risk_type is not None:
            self.validate_max_length(self.risk_type, 'risk_type', 50)
        self.validate_required(self.flow_id, 'flow_id')
        if self.flow_id is not None:
            self.validate_max_length(self.flow_id, 'flow_id', 32)
        self.validate_required(self.business_code, 'business_code')
        if self.business_code is not None:
            self.validate_max_length(self.business_code, 'business_code', 30)
        self.validate_required(self.scene, 'scene')
        if self.scene is not None:
            self.validate_max_length(self.scene, 'scene', 50)
        if self.user_id is not None:
            self.validate_max_length(self.user_id, 'user_id', 50)
        if self.open_id is not None:
            self.validate_max_length(self.open_id, 'open_id', 128)
        if self.mer_pid is not None:
            self.validate_max_length(self.mer_pid, 'mer_pid', 50)
        if self.mobile_no is not None:
            self.validate_max_length(self.mobile_no, 'mobile_no', 50)
        if self.cert_no is not None:
            self.validate_max_length(self.cert_no, 'cert_no', 50)
        if self.ip is not None:
            self.validate_max_length(self.ip, 'ip', 32)
        if self.lbs is not None:
            self.validate_max_length(self.lbs, 'lbs', 50)
        if self.role is not None:
            self.validate_max_length(self.role, 'role', 128)
        if self.activity_info is not None:
            self.validate_max_length(self.activity_info, 'activity_info', 100)
        if self.purchase_query_model:
            self.purchase_query_model.validate()
        if self.scalper_query_model:
            self.scalper_query_model.validate()
        if self.awarding_query_model:
            self.awarding_query_model.validate()
        if self.farming_query_model:
            self.farming_query_model.validate()
        if self.baddebt_query_model:
            self.baddebt_query_model.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.business_code is not None:
            result['business_code'] = self.business_code
        if self.scene is not None:
            result['scene'] = self.scene
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.open_id is not None:
            result['open_id'] = self.open_id
        if self.mer_pid is not None:
            result['mer_pid'] = self.mer_pid
        if self.mobile_no is not None:
            result['mobile_no'] = self.mobile_no
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.ip is not None:
            result['ip'] = self.ip
        if self.lbs is not None:
            result['lbs'] = self.lbs
        if self.role is not None:
            result['role'] = self.role
        if self.activity_info is not None:
            result['activity_info'] = self.activity_info
        if self.purchase_query_model is not None:
            result['purchase_query_model'] = self.purchase_query_model.to_map()
        if self.scalper_query_model is not None:
            result['scalper_query_model'] = self.scalper_query_model.to_map()
        if self.awarding_query_model is not None:
            result['awarding_query_model'] = self.awarding_query_model.to_map()
        if self.farming_query_model is not None:
            result['farming_query_model'] = self.farming_query_model.to_map()
        if self.baddebt_query_model is not None:
            result['baddebt_query_model'] = self.baddebt_query_model.to_map()
        if self.merchant_app_id is not None:
            result['merchant_app_id'] = self.merchant_app_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('business_code') is not None:
            self.business_code = m.get('business_code')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('open_id') is not None:
            self.open_id = m.get('open_id')
        if m.get('mer_pid') is not None:
            self.mer_pid = m.get('mer_pid')
        if m.get('mobile_no') is not None:
            self.mobile_no = m.get('mobile_no')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        if m.get('lbs') is not None:
            self.lbs = m.get('lbs')
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('activity_info') is not None:
            self.activity_info = m.get('activity_info')
        if m.get('purchase_query_model') is not None:
            temp_model = PurchaseQueryModel()
            self.purchase_query_model = temp_model.from_map(m['purchase_query_model'])
        if m.get('scalper_query_model') is not None:
            temp_model = ScalperQueryModel()
            self.scalper_query_model = temp_model.from_map(m['scalper_query_model'])
        if m.get('awarding_query_model') is not None:
            temp_model = AwardingQueryModel()
            self.awarding_query_model = temp_model.from_map(m['awarding_query_model'])
        if m.get('farming_query_model') is not None:
            temp_model = FarmingQueryModel()
            self.farming_query_model = temp_model.from_map(m['farming_query_model'])
        if m.get('baddebt_query_model') is not None:
            temp_model = BaddebtQueryModel()
            self.baddebt_query_model = temp_model.from_map(m['baddebt_query_model'])
        if m.get('merchant_app_id') is not None:
            self.merchant_app_id = m.get('merchant_app_id')
        return self


class QueryRiskGoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        model: RiskGoModel = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 风险查询结果
        self.model = model

    def validate(self):
        if self.model:
            self.model.validate()

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
        if self.model is not None:
            result['model'] = self.model.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('model') is not None:
            temp_model = RiskGoModel()
            self.model = temp_model.from_map(m['model'])
        return self


class UploadInnerRiskcallRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        idempotent_id: str = None,
        pid: str = None,
        service_amount: int = None,
        start_time: str = None,
        end_time: str = None,
        alipay_instance_id: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 幂等id
        self.idempotent_id = idempotent_id
        # 商户的支付宝唯一id
        self.pid = pid
        # 计量值
        self.service_amount = service_amount
        # 上报的数据开始时间，格式 yyyy-MM-dd HH:mm:ss
        self.start_time = start_time
        # 上报的数据结束时间，格式 yyyy-MM-dd HH:mm:ss
        self.end_time = end_time
        # 支付宝开放平台购买的实例 id
        self.alipay_instance_id = alipay_instance_id
        # 扩展参数
        # jsonString
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.idempotent_id, 'idempotent_id')
        if self.idempotent_id is not None:
            self.validate_max_length(self.idempotent_id, 'idempotent_id', 32)
        self.validate_required(self.pid, 'pid')
        if self.pid is not None:
            self.validate_max_length(self.pid, 'pid', 32)
        self.validate_required(self.service_amount, 'service_amount')
        if self.service_amount is not None:
            self.validate_minimum(self.service_amount, 'service_amount', 1)
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_max_length(self.start_time, 'start_time', 32)
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_max_length(self.end_time, 'end_time', 32)
        self.validate_required(self.alipay_instance_id, 'alipay_instance_id')
        if self.alipay_instance_id is not None:
            self.validate_max_length(self.alipay_instance_id, 'alipay_instance_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.idempotent_id is not None:
            result['idempotent_id'] = self.idempotent_id
        if self.pid is not None:
            result['pid'] = self.pid
        if self.service_amount is not None:
            result['service_amount'] = self.service_amount
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.alipay_instance_id is not None:
            result['alipay_instance_id'] = self.alipay_instance_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('idempotent_id') is not None:
            self.idempotent_id = m.get('idempotent_id')
        if m.get('pid') is not None:
            self.pid = m.get('pid')
        if m.get('service_amount') is not None:
            self.service_amount = m.get('service_amount')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('alipay_instance_id') is not None:
            self.alipay_instance_id = m.get('alipay_instance_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class UploadInnerRiskcallResponse(TeaModel):
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
        # 上报成功返回 true，否则返回 false
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


class AllSignTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        contract_type: str = None,
        merchant_id: str = None,
        fund_id: str = None,
        fund_type: str = None,
        template_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合同类型，如果不传则返回所有
        self.contract_type = contract_type
        # 商户统一社会信用代码，SIT环境，非融必填
        self.merchant_id = merchant_id
        # 查询融资类型时，需要传入资方统一社会信用代码
        self.fund_id = fund_id
        # -FINANCE 融资
        # -NON_FINANCE 非融资
        self.fund_type = fund_type
        # 模板id
        self.template_id = template_id

    def validate(self):
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 42)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.fund_type is not None:
            result['fund_type'] = self.fund_type
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('fund_type') is not None:
            self.fund_type = m.get('fund_type')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class AllSignTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # List<JSONObject>格式内容
        self.template_list = template_list

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
        if self.template_list is not None:
            result['template_list'] = self.template_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_list') is not None:
            self.template_list = m.get('template_list')
        return self


class SubmitSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        user_id_type: str = None,
        user_id_number: str = None,
        user_name: str = None,
        user_mobile: str = None,
        user_email: str = None,
        sign_validity: str = None,
        flow_notify_type: str = None,
        business_scene: str = None,
        signed_redirect_url: str = None,
        template_list: str = None,
        alipay_user_id: str = None,
        merchant_name: str = None,
        merchant_tag: str = None,
        merchant_seal_id: str = None,
        merchant_sign_order: int = None,
        merchant_id_type: str = None,
        merchant_id_number: str = None,
        merchant_legal_name: str = None,
        merchant_legal_id_number: str = None,
        third_signer: str = None,
        user_open_id: str = None,
        merchant_app_id: str = None,
        user_type: str = None,
        user_org_name: str = None,
        user_org_id_type: str = None,
        user_org_id_number: str = None,
        need_face: bool = None,
        seal_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # CRED_PSN_CH_IDCARD： 大陆身份证
        # CRED_PSN_CH_TWCARD：台湾来往大陆通行证
        # CRED_PSN_CH_MACAO"：澳门来往大陆通行证
        # CRED_PSN_CH_HONGKONG：香港来往大陆通行证
        # CRED_PSN_PASSPORT：护照
        self.user_id_type = user_id_type
        # 用户证件号，需要采用RSA加密传输
        self.user_id_number = user_id_number
        # 姓名，需要采用RSA加密传输
        self.user_name = user_name
        # 用户手机号，可不传；传的话需要采用RSA加密传输
        self.user_mobile = user_mobile
        # 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
        self.user_email = user_email
        # 签署有效期，时间戳，例如：new Date().getTime()
        self.sign_validity = sign_validity
        # 1-短信；2-邮件
        self.flow_notify_type = flow_notify_type
        # 业务场景，电子合同签署协议的时候的标题
        self.business_scene = business_scene
        # 签署完成跳转链接
        self.signed_redirect_url = signed_redirect_url
        # 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
        self.template_list = template_list
        # 用户的支付宝uid
        self.alipay_user_id = alipay_user_id
        # 公司名称
        self.merchant_name = merchant_name
        # 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        self.merchant_tag = merchant_tag
        # 商户需要盖的印章ID
        self.merchant_seal_id = merchant_seal_id
        # 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
        self.merchant_sign_order = merchant_sign_order
        # CRED_ORG_USCC：统一社会信用代码，CRED_ORG_REGCODE：工商注册号，只支持这两个值
        self.merchant_id_type = merchant_id_type
        # 商户证件号，需要采用RSA加密传输
        self.merchant_id_number = merchant_id_number
        # 法人姓名，需要RSA加密传输
        self.merchant_legal_name = merchant_legal_name
        # 法人证件号，需要采用RSA加密传输
        self.merchant_legal_id_number = merchant_legal_id_number
        # 除商户以外的第三方签署信息，需要通过此字段传入，需要使用JSONArray格式。注意其中orgIdNumber、orgLegalName、orgLegalIdNumber需要RSA加密。
        self.third_signer = third_signer
        # 支付宝用户 open_id
        self.user_open_id = user_open_id
        # 商户支付宝应用 id
        self.merchant_app_id = merchant_app_id
        # 用户类型，个人或企业，默认是个人
        self.user_type = user_type
        # (企业作为消费者时)公司名称
        self.user_org_name = user_org_name
        # (企业作为消费者时)公司证件类型
        self.user_org_id_type = user_org_id_type
        # (企业作为消费者时)公司证件号，无需加密
        self.user_org_id_number = user_org_id_number
        # 合并签署是否开启人脸识别（默认true-开启）,非合并签署无需设值
        self.need_face = need_face
        # 0-手绘签名
        # 1-模板印章签名
        # 多种类型时逗号分割，为空不限制
        self.seal_type = seal_type

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.user_id_number, 'user_id_number')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.business_scene, 'business_scene')
        self.validate_required(self.template_list, 'template_list')
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 20)
        self.validate_required(self.merchant_name, 'merchant_name')
        if self.merchant_name is not None:
            self.validate_max_length(self.merchant_name, 'merchant_name', 256)
        if self.merchant_tag is not None:
            self.validate_max_length(self.merchant_tag, 'merchant_tag', 32)
        if self.merchant_sign_order is not None:
            self.validate_maximum(self.merchant_sign_order, 'merchant_sign_order', 10000)
            self.validate_minimum(self.merchant_sign_order, 'merchant_sign_order', 1)
        self.validate_required(self.merchant_id_type, 'merchant_id_type')
        if self.merchant_id_type is not None:
            self.validate_max_length(self.merchant_id_type, 'merchant_id_type', 20)
        self.validate_required(self.merchant_id_number, 'merchant_id_number')
        if self.merchant_id_number is not None:
            self.validate_max_length(self.merchant_id_number, 'merchant_id_number', 1000)
        if self.user_open_id is not None:
            self.validate_max_length(self.user_open_id, 'user_open_id', 64)
        if self.merchant_app_id is not None:
            self.validate_max_length(self.merchant_app_id, 'merchant_app_id', 32)

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
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.user_id_number is not None:
            result['user_id_number'] = self.user_id_number
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_mobile is not None:
            result['user_mobile'] = self.user_mobile
        if self.user_email is not None:
            result['user_email'] = self.user_email
        if self.sign_validity is not None:
            result['sign_validity'] = self.sign_validity
        if self.flow_notify_type is not None:
            result['flow_notify_type'] = self.flow_notify_type
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.signed_redirect_url is not None:
            result['signed_redirect_url'] = self.signed_redirect_url
        if self.template_list is not None:
            result['template_list'] = self.template_list
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.merchant_tag is not None:
            result['merchant_tag'] = self.merchant_tag
        if self.merchant_seal_id is not None:
            result['merchant_seal_id'] = self.merchant_seal_id
        if self.merchant_sign_order is not None:
            result['merchant_sign_order'] = self.merchant_sign_order
        if self.merchant_id_type is not None:
            result['merchant_id_type'] = self.merchant_id_type
        if self.merchant_id_number is not None:
            result['merchant_id_number'] = self.merchant_id_number
        if self.merchant_legal_name is not None:
            result['merchant_legal_name'] = self.merchant_legal_name
        if self.merchant_legal_id_number is not None:
            result['merchant_legal_id_number'] = self.merchant_legal_id_number
        if self.third_signer is not None:
            result['third_signer'] = self.third_signer
        if self.user_open_id is not None:
            result['user_open_id'] = self.user_open_id
        if self.merchant_app_id is not None:
            result['merchant_app_id'] = self.merchant_app_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_org_name is not None:
            result['user_org_name'] = self.user_org_name
        if self.user_org_id_type is not None:
            result['user_org_id_type'] = self.user_org_id_type
        if self.user_org_id_number is not None:
            result['user_org_id_number'] = self.user_org_id_number
        if self.need_face is not None:
            result['need_face'] = self.need_face
        if self.seal_type is not None:
            result['seal_type'] = self.seal_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('user_id_number') is not None:
            self.user_id_number = m.get('user_id_number')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_mobile') is not None:
            self.user_mobile = m.get('user_mobile')
        if m.get('user_email') is not None:
            self.user_email = m.get('user_email')
        if m.get('sign_validity') is not None:
            self.sign_validity = m.get('sign_validity')
        if m.get('flow_notify_type') is not None:
            self.flow_notify_type = m.get('flow_notify_type')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('signed_redirect_url') is not None:
            self.signed_redirect_url = m.get('signed_redirect_url')
        if m.get('template_list') is not None:
            self.template_list = m.get('template_list')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('merchant_tag') is not None:
            self.merchant_tag = m.get('merchant_tag')
        if m.get('merchant_seal_id') is not None:
            self.merchant_seal_id = m.get('merchant_seal_id')
        if m.get('merchant_sign_order') is not None:
            self.merchant_sign_order = m.get('merchant_sign_order')
        if m.get('merchant_id_type') is not None:
            self.merchant_id_type = m.get('merchant_id_type')
        if m.get('merchant_id_number') is not None:
            self.merchant_id_number = m.get('merchant_id_number')
        if m.get('merchant_legal_name') is not None:
            self.merchant_legal_name = m.get('merchant_legal_name')
        if m.get('merchant_legal_id_number') is not None:
            self.merchant_legal_id_number = m.get('merchant_legal_id_number')
        if m.get('third_signer') is not None:
            self.third_signer = m.get('third_signer')
        if m.get('user_open_id') is not None:
            self.user_open_id = m.get('user_open_id')
        if m.get('merchant_app_id') is not None:
            self.merchant_app_id = m.get('merchant_app_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_org_name') is not None:
            self.user_org_name = m.get('user_org_name')
        if m.get('user_org_id_type') is not None:
            self.user_org_id_type = m.get('user_org_id_type')
        if m.get('user_org_id_number') is not None:
            self.user_org_id_number = m.get('user_org_id_number')
        if m.get('need_face') is not None:
            self.need_face = m.get('need_face')
        if m.get('seal_type') is not None:
            self.seal_type = m.get('seal_type')
        return self


class SubmitSignFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_no: str = None,
        flow_id: str = None,
        account_id: str = None,
        sign_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署合同单号
        self.sign_no = sign_no
        # 电子签署流程ID
        self.flow_id = flow_id
        # 签署用户ID
        self.account_id = account_id
        # 签署信息，包括短链接、长链接、小程序链接等。
        self.sign_info = sign_info

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
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.sign_info is not None:
            result['sign_info'] = self.sign_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('sign_info') is not None:
            self.sign_info = m.get('sign_info')
        return self


class GetSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sign_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署合同单号
        self.sign_no = sign_no

    def validate(self):
        self.validate_required(self.sign_no, 'sign_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        return self


class GetSignFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_no: str = None,
        order_id: str = None,
        account_id: str = None,
        status: str = None,
        flow_id: str = None,
        doc_list: str = None,
        business_scene: str = None,
        alipay_user_id: str = None,
        sign_info: str = None,
        initiator_account_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署合同单号
        self.sign_no = sign_no
        # 订单号
        self.order_id = order_id
        # 签署用户ID
        self.account_id = account_id
        # 状态：DRAFT - 草稿； SIGNING - 签署中； FINISH - 签署完成；UNDO - 撤销； TERMINATE - 终止； EXPIRE - 过期； REJECTED - 拒签； CANCELLED - 解约
        # 
        self.status = status
        # 签署流程ID
        self.flow_id = flow_id
        # 签署文件列表，参考：
        # _[{"fileItemNo":"10090801000001699892007791144960","agreementType":"COMMON","fileName":"xxx合同","fileSize":228530,"signAccountId":"fe2eb3814c4e49edba2bc012f790771f","fileId":"2c7684461a0f4d33bc02f6d77f7b3937","downloadUrl":"https://dev.oss-cn-shanghai.aliyuncs.com/ag/ord/xxx/16939683744483057_%E6%B5%8B%E8%AF%95%E6%A8%A1%E6%9D%BF%E4%B9%8B%E5%8D%8F%E8%AE%AE%E7%AD%BE%E7%BD%B2%E8%AF%81%E6%98%8E.pdf?Expires=1693971989&OSSAccessKeyId=LTAI5tR3hHiaXPAh8YsY9Dce&Signature=i%2FfAgDem33guI%2F0KjIFj24XZNCc%3D"}]_
        self.doc_list = doc_list
        # 业务场景，主要用于签署合同的标题描述
        self.business_scene = business_scene
        # 签署合同中的订单的uid。
        self.alipay_user_id = alipay_user_id
        # 签署扩展信息，用于获取签署链接等。JSON格式字符串。
        self.sign_info = sign_info
        # 发起人账户id
        self.initiator_account_id = initiator_account_id

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
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.status is not None:
            result['status'] = self.status
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.doc_list is not None:
            result['doc_list'] = self.doc_list
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.sign_info is not None:
            result['sign_info'] = self.sign_info
        if self.initiator_account_id is not None:
            result['initiator_account_id'] = self.initiator_account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('doc_list') is not None:
            self.doc_list = m.get('doc_list')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('sign_info') is not None:
            self.sign_info = m.get('sign_info')
        if m.get('initiator_account_id') is not None:
            self.initiator_account_id = m.get('initiator_account_id')
        return self


class AuthSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sign_no: str = None,
        tag: str = None,
        biz_flow_id: str = None,
        account_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署的电子合同ID
        self.sign_no = sign_no
        # 签署区域的tag，和发起签署流程的机构的tag对应。
        self.tag = tag
        # 电子合同签署服务返回的biz_flow_id
        self.biz_flow_id = biz_flow_id
        # 电子合同签署服务的返回的account_id
        self.account_id = account_id

    def validate(self):
        self.validate_required(self.sign_no, 'sign_no')
        if self.sign_no is not None:
            self.validate_max_length(self.sign_no, 'sign_no', 64)
        if self.tag is not None:
            self.validate_max_length(self.tag, 'tag', 32)
        if self.biz_flow_id is not None:
            self.validate_max_length(self.biz_flow_id, 'biz_flow_id', 64)
        if self.account_id is not None:
            self.validate_max_length(self.account_id, 'account_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.tag is not None:
            result['tag'] = self.tag
        if self.biz_flow_id is not None:
            result['biz_flow_id'] = self.biz_flow_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        if m.get('biz_flow_id') is not None:
            self.biz_flow_id = m.get('biz_flow_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        return self


class AuthSignFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_field_ids: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署最后落签的签署区域id列表
        self.sign_field_ids = sign_field_ids

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
        if self.sign_field_ids is not None:
            result['sign_field_ids'] = self.sign_field_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_field_ids') is not None:
            self.sign_field_ids = m.get('sign_field_ids')
        return self


class SubmitFrontSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        user_id_type: str = None,
        user_id_number: str = None,
        user_name: str = None,
        user_mobile: str = None,
        user_email: str = None,
        sign_validity: str = None,
        flow_notify_type: str = None,
        business_scene: str = None,
        signed_redirect_url: str = None,
        template_list: str = None,
        alipay_user_id: str = None,
        merchant_name: str = None,
        merchant_tag: str = None,
        merchant_sign_order: int = None,
        merchant_seal_id: str = None,
        merchant_id_type: str = None,
        merchant_id_number: str = None,
        merchant_legal_name: str = None,
        merchant_legal_id_number: str = None,
        third_signer: str = None,
        user_open_id: str = None,
        merchant_app_id: str = None,
        user_type: str = None,
        user_org_id_number: str = None,
        user_org_id_type: str = None,
        user_org_name: str = None,
        need_face: bool = None,
        seal_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户的订单号
        self.order_id = order_id
        # CRED_PSN_CH_IDCARD： 大陆身份证
        # CRED_PSN_CH_TWCARD：台湾来往大陆通行证
        # CRED_PSN_CH_MACAO"：澳门来往大陆通行证
        # CRED_PSN_CH_HONGKONG：香港来往大陆通行证
        # CRED_PSN_PASSPORT：护照
        self.user_id_type = user_id_type
        # 用户证件号，需要采用RSA加密传输
        self.user_id_number = user_id_number
        # 姓名，需要采用RSA加密传输
        # 
        self.user_name = user_name
        # 用户手机号，可不传；传的话需要采用RSA加密传输
        # 
        self.user_mobile = user_mobile
        # 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
        # 
        self.user_email = user_email
        # 签署有效期，时间戳，例如：new Date().getTime()
        self.sign_validity = sign_validity
        # 1-短信；2-邮件
        self.flow_notify_type = flow_notify_type
        # 业务场景，电子合同签署协议的时候的标题
        # 
        self.business_scene = business_scene
        # 签署完成跳转链接
        # 
        self.signed_redirect_url = signed_redirect_url
        # 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
        self.template_list = template_list
        # 用户的支付宝uid
        self.alipay_user_id = alipay_user_id
        # 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        self.merchant_name = merchant_name
        # 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        self.merchant_tag = merchant_tag
        # 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
        self.merchant_sign_order = merchant_sign_order
        # 商户需要盖的印章ID
        self.merchant_seal_id = merchant_seal_id
        # CRED_ORG_USCC：统一社会信用代码，
        # CRED_ORG_REGCODE：工商注册号，
        # 只支持这两个值
        self.merchant_id_type = merchant_id_type
        # 商户证件号，需要采用RSA加密传输
        self.merchant_id_number = merchant_id_number
        # 法人姓名，需要RSA加密传输
        # 
        self.merchant_legal_name = merchant_legal_name
        # 法人证件号，需要采用RSA加密传输
        # 
        self.merchant_legal_id_number = merchant_legal_id_number
        # 除商户以外的第三方签署信息，需要通过此字段传入，需要使用JSONArray格式。注意其中orgIdNumber、orgLegalName、orgLegalIdNumber需要RSA加密。
        self.third_signer = third_signer
        # 用户在支付宝开放平台下应用的 open_id
        self.user_open_id = user_open_id
        # 商户支付宝应用 id
        self.merchant_app_id = merchant_app_id
        # 用户类型，个人或企业，默认是个人
        self.user_type = user_type
        # (企业作为消费者时)公司证件号，无需加密
        self.user_org_id_number = user_org_id_number
        # (企业作为消费者时)公司证件类型
        self.user_org_id_type = user_org_id_type
        # (企业作为消费者时)公司名称
        self.user_org_name = user_org_name
        # 合并签署是否开启人脸识别（默认true-开启）,非合并签署无需设值
        self.need_face = need_face
        # 0-手绘签名
        # 1-模板印章签名
        # 多种类型时逗号分割，为空不限制
        self.seal_type = seal_type

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 64)
        self.validate_required(self.user_id_type, 'user_id_type')
        if self.user_id_type is not None:
            self.validate_max_length(self.user_id_type, 'user_id_type', 40)
        self.validate_required(self.user_id_number, 'user_id_number')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.business_scene, 'business_scene')
        if self.business_scene is not None:
            self.validate_max_length(self.business_scene, 'business_scene', 200)
        self.validate_required(self.template_list, 'template_list')
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 24)
        self.validate_required(self.merchant_name, 'merchant_name')
        if self.merchant_tag is not None:
            self.validate_max_length(self.merchant_tag, 'merchant_tag', 32)
        self.validate_required(self.merchant_id_type, 'merchant_id_type')
        if self.merchant_id_type is not None:
            self.validate_max_length(self.merchant_id_type, 'merchant_id_type', 32)
        self.validate_required(self.merchant_id_number, 'merchant_id_number')
        if self.user_open_id is not None:
            self.validate_max_length(self.user_open_id, 'user_open_id', 64)
        if self.merchant_app_id is not None:
            self.validate_max_length(self.merchant_app_id, 'merchant_app_id', 32)

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
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.user_id_number is not None:
            result['user_id_number'] = self.user_id_number
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_mobile is not None:
            result['user_mobile'] = self.user_mobile
        if self.user_email is not None:
            result['user_email'] = self.user_email
        if self.sign_validity is not None:
            result['sign_validity'] = self.sign_validity
        if self.flow_notify_type is not None:
            result['flow_notify_type'] = self.flow_notify_type
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.signed_redirect_url is not None:
            result['signed_redirect_url'] = self.signed_redirect_url
        if self.template_list is not None:
            result['template_list'] = self.template_list
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.merchant_tag is not None:
            result['merchant_tag'] = self.merchant_tag
        if self.merchant_sign_order is not None:
            result['merchant_sign_order'] = self.merchant_sign_order
        if self.merchant_seal_id is not None:
            result['merchant_seal_id'] = self.merchant_seal_id
        if self.merchant_id_type is not None:
            result['merchant_id_type'] = self.merchant_id_type
        if self.merchant_id_number is not None:
            result['merchant_id_number'] = self.merchant_id_number
        if self.merchant_legal_name is not None:
            result['merchant_legal_name'] = self.merchant_legal_name
        if self.merchant_legal_id_number is not None:
            result['merchant_legal_id_number'] = self.merchant_legal_id_number
        if self.third_signer is not None:
            result['third_signer'] = self.third_signer
        if self.user_open_id is not None:
            result['user_open_id'] = self.user_open_id
        if self.merchant_app_id is not None:
            result['merchant_app_id'] = self.merchant_app_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_org_id_number is not None:
            result['user_org_id_number'] = self.user_org_id_number
        if self.user_org_id_type is not None:
            result['user_org_id_type'] = self.user_org_id_type
        if self.user_org_name is not None:
            result['user_org_name'] = self.user_org_name
        if self.need_face is not None:
            result['need_face'] = self.need_face
        if self.seal_type is not None:
            result['seal_type'] = self.seal_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('user_id_number') is not None:
            self.user_id_number = m.get('user_id_number')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_mobile') is not None:
            self.user_mobile = m.get('user_mobile')
        if m.get('user_email') is not None:
            self.user_email = m.get('user_email')
        if m.get('sign_validity') is not None:
            self.sign_validity = m.get('sign_validity')
        if m.get('flow_notify_type') is not None:
            self.flow_notify_type = m.get('flow_notify_type')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('signed_redirect_url') is not None:
            self.signed_redirect_url = m.get('signed_redirect_url')
        if m.get('template_list') is not None:
            self.template_list = m.get('template_list')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('merchant_tag') is not None:
            self.merchant_tag = m.get('merchant_tag')
        if m.get('merchant_sign_order') is not None:
            self.merchant_sign_order = m.get('merchant_sign_order')
        if m.get('merchant_seal_id') is not None:
            self.merchant_seal_id = m.get('merchant_seal_id')
        if m.get('merchant_id_type') is not None:
            self.merchant_id_type = m.get('merchant_id_type')
        if m.get('merchant_id_number') is not None:
            self.merchant_id_number = m.get('merchant_id_number')
        if m.get('merchant_legal_name') is not None:
            self.merchant_legal_name = m.get('merchant_legal_name')
        if m.get('merchant_legal_id_number') is not None:
            self.merchant_legal_id_number = m.get('merchant_legal_id_number')
        if m.get('third_signer') is not None:
            self.third_signer = m.get('third_signer')
        if m.get('user_open_id') is not None:
            self.user_open_id = m.get('user_open_id')
        if m.get('merchant_app_id') is not None:
            self.merchant_app_id = m.get('merchant_app_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_org_id_number') is not None:
            self.user_org_id_number = m.get('user_org_id_number')
        if m.get('user_org_id_type') is not None:
            self.user_org_id_type = m.get('user_org_id_type')
        if m.get('user_org_name') is not None:
            self.user_org_name = m.get('user_org_name')
        if m.get('need_face') is not None:
            self.need_face = m.get('need_face')
        if m.get('seal_type') is not None:
            self.seal_type = m.get('seal_type')
        return self


class SubmitFrontSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_no: str = None,
        flow_id: str = None,
        account_id: str = None,
        sign_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署合同单号
        # 
        self.sign_no = sign_no
        # 电子签署流程ID
        # 
        self.flow_id = flow_id
        # 签署用户ID
        # 
        self.account_id = account_id
        # 签署信息，包括短链接、长链接、小程序链接等。
        self.sign_info = sign_info

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
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.sign_info is not None:
            result['sign_info'] = self.sign_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('sign_info') is not None:
            self.sign_info = m.get('sign_info')
        return self


class UploadSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        sign_no: str = None,
        template_id: str = None,
        sign_time: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 
        # 商户的订单号
        self.order_id = order_id
        # 签署合同单号
        self.sign_no = sign_no
        # 模板id
        self.template_id = template_id
        # 合同签署时间，格式为yyyy-MM-dd HH:mm:ss
        self.sign_time = sign_time
        # 上传的pdf文件，需要以.pdf后缀结尾
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sign_no, 'sign_no')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.sign_time, 'sign_time')
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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
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
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadSignFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_item_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件编号
        self.file_item_no = file_item_no

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
        if self.file_item_no is not None:
            result['file_item_no'] = self.file_item_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_item_no') is not None:
            self.file_item_no = m.get('file_item_no')
        return self


class UploadSignTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        contract_type: str = None,
        agreement_type: str = None,
        pos_conf: str = None,
        template_args: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        fund_id: str = None,
        fund_sign: bool = None,
        fund_pos_conf: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 合同类型
        self.contract_type = contract_type
        # 模板类型
        self.agreement_type = agreement_type
        # 签署区坐标配置
        self.pos_conf = pos_conf
        # 模板参数
        self.template_args = template_args
        # 上传的pdf文件，需要以.pdf后缀结尾
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 资方统一社会信用代码，默认为空
        self.fund_id = fund_id
        # 是否需要资方签署，默认为否
        self.fund_sign = fund_sign
        # 资方签署区坐标，默认为空
        self.fund_pos_conf = fund_pos_conf

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.pos_conf, 'pos_conf')
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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.agreement_type is not None:
            result['agreement_type'] = self.agreement_type
        if self.pos_conf is not None:
            result['pos_conf'] = self.pos_conf
        if self.template_args is not None:
            result['template_args'] = self.template_args
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.fund_sign is not None:
            result['fund_sign'] = self.fund_sign
        if self.fund_pos_conf is not None:
            result['fund_pos_conf'] = self.fund_pos_conf
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('agreement_type') is not None:
            self.agreement_type = m.get('agreement_type')
        if m.get('pos_conf') is not None:
            self.pos_conf = m.get('pos_conf')
        if m.get('template_args') is not None:
            self.template_args = m.get('template_args')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('fund_sign') is not None:
            self.fund_sign = m.get('fund_sign')
        if m.get('fund_pos_conf') is not None:
            self.fund_pos_conf = m.get('fund_pos_conf')
        return self


class UploadSignTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上传模板后返回的模板id
        self.template_id = template_id

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
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class UploadSignCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no_type: str = None,
        order_no: str = None,
        credit_type: str = None,
        credit_name: str = None,
        content_type: str = None,
        file_url: str = None,
        content: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号类型
        self.order_no_type = order_no_type
        # 订单号，或资产包号
        self.order_no = order_no
        # 凭证合同类型
        self.credit_type = credit_type
        # 凭证名称
        self.credit_name = credit_name
        # 文本类型
        self.content_type = content_type
        # 文本下载链接，如果类型是FILE则必填
        self.file_url = file_url
        # 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
        self.content = content
        # 商户统一社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_no_type, 'order_no_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.credit_type, 'credit_type')
        self.validate_required(self.content_type, 'content_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no_type is not None:
            result['order_no_type'] = self.order_no_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.credit_type is not None:
            result['credit_type'] = self.credit_type
        if self.credit_name is not None:
            result['credit_name'] = self.credit_name
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.content is not None:
            result['content'] = self.content
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no_type') is not None:
            self.order_no_type = m.get('order_no_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('credit_type') is not None:
            self.credit_type = m.get('credit_type')
        if m.get('credit_name') is not None:
            self.credit_name = m.get('credit_name')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class UploadSignCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 凭证内容id
        self.content_id = content_id

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
        if self.content_id is not None:
            result['content_id'] = self.content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        return self


class QuerySignCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no_type: str = None,
        order_no: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号类型
        self.order_no_type = order_no_type
        # 订单号，或资产包号
        self.order_no = order_no
        # 商户统一社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_no_type, 'order_no_type')
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
        if self.order_no_type is not None:
            result['order_no_type'] = self.order_no_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no_type') is not None:
            self.order_no_type = m.get('order_no_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class QuerySignCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内容信息
        self.content_info = content_info

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
        if self.content_info is not None:
            result['content_info'] = self.content_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_info') is not None:
            self.content_info = m.get('content_info')
        return self


class CancelSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sign_no: str = None,
        revoke_reason: str = None,
        operator_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署合同单号
        self.sign_no = sign_no
        # 默认:“撤销”，最大长度50
        self.revoke_reason = revoke_reason
        # 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
        self.operator_id = operator_id

    def validate(self):
        self.validate_required(self.sign_no, 'sign_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.revoke_reason is not None:
            result['revoke_reason'] = self.revoke_reason
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('revoke_reason') is not None:
            self.revoke_reason = m.get('revoke_reason')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        return self


class CancelSignFlowResponse(TeaModel):
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


class GetSignContractcertificateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sign_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 流程id
        self.sign_no = sign_no

    def validate(self):
        self.validate_required(self.sign_no, 'sign_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        return self


class GetSignContractcertificateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 下载文件地址(一小时内有效)
        self.url = url

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
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class SyncTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务字段，具体传入信息需参考文档
        # 传入格式需为json字符串
        self.biz_content = biz_content
        # 接口执行类型
        # 
        self.type = type

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class SyncTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # resp信息
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询信息，必须遵循json字符串格式
        self.biz_content = biz_content
        # 接口类型
        self.type = type

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class GetTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回的查询值
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class SyncFrontTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        type: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 类型
        # 1. orderFullInfo ， 订单所有信息同步
        self.type = type
        # json.toString
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.type is not None:
            result['type'] = self.type
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class SyncFrontTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回信息
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class SyncTradeFinanceloanapplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        merchant_name: str = None,
        fund_id: str = None,
        type: str = None,
        asset_package_id: str = None,
        stage: str = None,
        order_id_list: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 融资放款申请接口
        self.merchant_name = merchant_name
        # 资方的社会信用代码
        self.fund_id = fund_id
        # 类型
        # ● 默认为：ORDER, 单订单申请
        # ● PACKAGE_ORDER , 资产包订单模式
        self.type = type
        # 资产包id
        # type = PACKAGE_ORDER ， 必填
        self.asset_package_id = asset_package_id
        # type = PACKAGE_ORDER ， 必填
        # 
        # ● APPEND: 追加订单列表
        # ● FINIISH : 结束
        self.stage = stage
        # 订单id列表的jsonArray
        self.order_id_list = order_id_list

    def validate(self):
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.merchant_name, 'merchant_name')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)
        if self.asset_package_id is not None:
            self.validate_max_length(self.asset_package_id, 'asset_package_id', 50)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.type is not None:
            result['type'] = self.type
        if self.asset_package_id is not None:
            result['asset_package_id'] = self.asset_package_id
        if self.stage is not None:
            result['stage'] = self.stage
        if self.order_id_list is not None:
            result['order_id_list'] = self.order_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('asset_package_id') is not None:
            self.asset_package_id = m.get('asset_package_id')
        if m.get('stage') is not None:
            self.stage = m.get('stage')
        if m.get('order_id_list') is not None:
            self.order_id_list = m.get('order_id_list')
        return self


class SyncTradeFinanceloanapplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
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
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class GetTradeMerchantfulfillmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        term_idx: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 履约期数，不填返回为所有履约期的履约信息
        # - 如果有填写，返回当前期数的履约信息，列表长度为1
        self.term_idx = term_idx

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.term_idx is not None:
            result['term_idx'] = self.term_idx
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('term_idx') is not None:
            self.term_idx = m.get('term_idx')
        return self


class GetTradeMerchantfulfillmentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值为 「MerchantFulfillmentResp」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetTradeUserperformanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 商家公司社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class GetTradeUserperformanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 「UserPerformanceInfo」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetTradeMerchantperformanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class GetTradeMerchantperformanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 「MerchantPerformanceInfo」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class UpdateTradeUserpromiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        term_idx: int = None,
        updated_rental_money: int = None,
        reason: str = None,
        desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 商家社会信用代码
        self.merchant_id = merchant_id
        # 修改的用户履约期数
        self.term_idx = term_idx
        # 更新后的租金，单位为分
        # 1234=12.34元
        self.updated_rental_money = updated_rental_money
        # 调整原因，枚举
        # ● A01 : 违章罚金
        # ● A02 : 水电煤费用
        self.reason = reason
        # 调整说明，本说明同步到支付宝账户备注中，需准确填写
        self.desc = desc

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 199)
        self.validate_required(self.term_idx, 'term_idx')
        self.validate_required(self.updated_rental_money, 'updated_rental_money')
        self.validate_required(self.reason, 'reason')
        if self.reason is not None:
            self.validate_max_length(self.reason, 'reason', 10)
        self.validate_required(self.desc, 'desc')
        if self.desc is not None:
            self.validate_max_length(self.desc, 'desc', 64)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.term_idx is not None:
            result['term_idx'] = self.term_idx
        if self.updated_rental_money is not None:
            result['updated_rental_money'] = self.updated_rental_money
        if self.reason is not None:
            result['reason'] = self.reason
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('term_idx') is not None:
            self.term_idx = m.get('term_idx')
        if m.get('updated_rental_money') is not None:
            self.updated_rental_money = m.get('updated_rental_money')
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class UpdateTradeUserpromiseResponse(TeaModel):
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


class SyncFrontIndirectorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务参数,json.toString
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class SyncFrontIndirectorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值，json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class SyncTradeIndirectorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务参数,json.toString
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class SyncTradeIndirectorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回业务参数，json.toString
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class ReplaceTradeUserpromiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # json字符串
        self.biz_content = biz_content
        # order_id
        self.order_id = order_id
        # 订单所属商户社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 200)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class ReplaceTradeUserpromiseResponse(TeaModel):
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


class ApplyTradeFinanceprecheckRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
        transparent_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度大于6，小于50
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 提交预审的资方的社会信用代码
        self.fund_id = fund_id
        # 透传到资方，不做格式限制
        self.transparent_info = transparent_info

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.fund_id, 'fund_id')
        if self.transparent_info is not None:
            self.validate_max_length(self.transparent_info, 'transparent_info', 1000)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.transparent_info is not None:
            result['transparent_info'] = self.transparent_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('transparent_info') is not None:
            self.transparent_info = m.get('transparent_info')
        return self


class ApplyTradeFinanceprecheckResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # ● EXEMPTION ： 资方免预审
        # ● SUBMIT_SUCCESS: 异步预审提交成功
        self.response_data = response_data
        # order_id
        self.order_id = order_id
        # merchant_id
        self.merchant_id = merchant_id

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class TransferTradeFinanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id_list: List[str] = None,
        fund_sign_mode: str = None,
        divide_start_term_index: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 公司社会信用代码
        self.merchant_id = merchant_id
        # 待预审资方列表
        self.fund_id_list = fund_id_list
        # 融资签署模式
        self.fund_sign_mode = fund_sign_mode
        # 商户分账起始期数
        self.divide_start_term_index = divide_start_term_index

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.fund_id_list, 'fund_id_list')
        self.validate_required(self.fund_sign_mode, 'fund_sign_mode')
        self.validate_required(self.divide_start_term_index, 'divide_start_term_index')
        if self.divide_start_term_index is not None:
            self.validate_minimum(self.divide_start_term_index, 'divide_start_term_index', 1)

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id_list is not None:
            result['fund_id_list'] = self.fund_id_list
        if self.fund_sign_mode is not None:
            result['fund_sign_mode'] = self.fund_sign_mode
        if self.divide_start_term_index is not None:
            result['divide_start_term_index'] = self.divide_start_term_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id_list') is not None:
            self.fund_id_list = m.get('fund_id_list')
        if m.get('fund_sign_mode') is not None:
            self.fund_sign_mode = m.get('fund_sign_mode')
        if m.get('divide_start_term_index') is not None:
            self.divide_start_term_index = m.get('divide_start_term_index')
        return self


class TransferTradeFinanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_candidates: str = None,
        transfer_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # order_id
        self.order_id = order_id
        # merchant_id
        self.merchant_id = merchant_id
        # jsonArray.toString
        self.fund_candidates = fund_candidates
        # 转融资结果
        self.transfer_result = transfer_result

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_candidates is not None:
            result['fund_candidates'] = self.fund_candidates
        if self.transfer_result is not None:
            result['transfer_result'] = self.transfer_result
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
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_candidates') is not None:
            self.fund_candidates = m.get('fund_candidates')
        if m.get('transfer_result') is not None:
            self.transfer_result = m.get('transfer_result')
        return self


class UpdateTradeOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        update_order_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # order_id
        self.order_id = order_id
        # merchant_id
        self.merchant_id = merchant_id
        # json字符串
        self.update_order_info = update_order_info

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.update_order_info, 'update_order_info')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.update_order_info is not None:
            result['update_order_info'] = self.update_order_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('update_order_info') is not None:
            self.update_order_info = m.get('update_order_info')
        return self


class UpdateTradeOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # order_id
        self.order_id = order_id
        # merchant_id
        self.merchant_id = merchant_id

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
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
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class AddTradeFinanceprecheckRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id_list: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # order_id
        self.order_id = order_id
        # merchant_id
        self.merchant_id = merchant_id
        # ["1","2"]
        self.fund_id_list = fund_id_list

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.fund_id_list, 'fund_id_list')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id_list is not None:
            result['fund_id_list'] = self.fund_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id_list') is not None:
            self.fund_id_list = m.get('fund_id_list')
        return self


class AddTradeFinanceprecheckResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        merchant_id: str = None,
        order_id: str = None,
        fund_candidates: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # merchant_id
        self.merchant_id = merchant_id
        # order_id
        self.order_id = order_id
        # fund_candidates
        # List<FundCompanyInfo> 的jsonArray.toString
        self.fund_candidates = fund_candidates

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.fund_candidates is not None:
            result['fund_candidates'] = self.fund_candidates
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('fund_candidates') is not None:
            self.fund_candidates = m.get('fund_candidates')
        return self


class GetTradeOrderfinanceinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单Id
        self.order_id = order_id
        # 商户社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class GetTradeOrderfinanceinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单融资信息
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class SyncTradeUserpromisedelayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        delay_start_period: int = None,
        delay_time_unit: str = None,
        delay_time_value: int = None,
        reason: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # order_id
        self.order_id = order_id
        # merchant_id
        self.merchant_id = merchant_id
        # 1
        self.delay_start_period = delay_start_period
        # 延期时间单位
        self.delay_time_unit = delay_time_unit
        # 延期时间数值
        self.delay_time_value = delay_time_value
        # 原因描述
        self.reason = reason

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.delay_start_period, 'delay_start_period')
        if self.delay_start_period is not None:
            self.validate_minimum(self.delay_start_period, 'delay_start_period', 1)
        self.validate_required(self.delay_time_unit, 'delay_time_unit')
        self.validate_required(self.delay_time_value, 'delay_time_value')
        if self.delay_time_value is not None:
            self.validate_minimum(self.delay_time_value, 'delay_time_value', 1)
        self.validate_required(self.reason, 'reason')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.delay_start_period is not None:
            result['delay_start_period'] = self.delay_start_period
        if self.delay_time_unit is not None:
            result['delay_time_unit'] = self.delay_time_unit
        if self.delay_time_value is not None:
            result['delay_time_value'] = self.delay_time_value
        if self.reason is not None:
            result['reason'] = self.reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('delay_start_period') is not None:
            self.delay_start_period = m.get('delay_start_period')
        if m.get('delay_time_unit') is not None:
            self.delay_time_unit = m.get('delay_time_unit')
        if m.get('delay_time_value') is not None:
            self.delay_time_value = m.get('delay_time_value')
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        return self


class SyncTradeUserpromisedelayResponse(TeaModel):
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


class PauseTradeUserpromiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        reason: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 社会信用代码
        self.merchant_id = merchant_id
        # 理由
        self.reason = reason

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.reason, 'reason')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.reason is not None:
            result['reason'] = self.reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        return self


class PauseTradeUserpromiseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auto_resume_day: str = None,
        auto_withhold_restart_day: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 暂停后自动重启时间
        self.auto_resume_day = auto_resume_day
        # 暂停后自动执行代扣时间，为autoResumeDay的第二天重新开始执行代扣计划
        self.auto_withhold_restart_day = auto_withhold_restart_day

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
        if self.auto_resume_day is not None:
            result['auto_resume_day'] = self.auto_resume_day
        if self.auto_withhold_restart_day is not None:
            result['auto_withhold_restart_day'] = self.auto_withhold_restart_day
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auto_resume_day') is not None:
            self.auto_resume_day = m.get('auto_resume_day')
        if m.get('auto_withhold_restart_day') is not None:
            self.auto_withhold_restart_day = m.get('auto_withhold_restart_day')
        return self


class ResumeTradeUserpromiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # order_id
        self.order_id = order_id
        # merchant_id
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')

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
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class ResumeTradeUserpromiseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        resume_day: str = None,
        withhold_restart_day: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单重启时间
        self.resume_day = resume_day
        # withhold_restart_day
        self.withhold_restart_day = withhold_restart_day

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
        if self.resume_day is not None:
            result['resume_day'] = self.resume_day
        if self.withhold_restart_day is not None:
            result['withhold_restart_day'] = self.withhold_restart_day
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('resume_day') is not None:
            self.resume_day = m.get('resume_day')
        if m.get('withhold_restart_day') is not None:
            self.withhold_restart_day = m.get('withhold_restart_day')
        return self


class CreateWithholdSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        alipay_merchant_id: str = None,
        alipay_merchant_name: str = None,
        alipay_merchant_service_name: str = None,
        alipay_merchant_service_description: str = None,
        alipay_user_id: str = None,
        return_url: str = None,
        user_open_id: str = None,
        merchant_app_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 支付宝商户id，使用签约能力前时候进行向平台申请
        self.alipay_merchant_id = alipay_merchant_id
        # 支付宝商户名称，会展示在支付并签约界面
        self.alipay_merchant_name = alipay_merchant_name
        # 支付宝商户服务名称，会展示在支付并签约界面
        self.alipay_merchant_service_name = alipay_merchant_service_name
        # 支付宝商户服务描述，会展示在支付并签约界面
        self.alipay_merchant_service_description = alipay_merchant_service_description
        # 支付宝uid，非必填
        self.alipay_user_id = alipay_user_id
        # 签约完成后的跳转地址，注意只有在h5跳转场景下才有意义其他场景通过方法回调处理业务；无需使用此字段。
        self.return_url = return_url
        # 支付宝用户 open_id，非必填
        self.user_open_id = user_open_id
        # 商户支付宝应用 id
        self.merchant_app_id = merchant_app_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        if self.alipay_merchant_id is not None:
            self.validate_max_length(self.alipay_merchant_id, 'alipay_merchant_id', 20)
        if self.alipay_merchant_name is not None:
            self.validate_max_length(self.alipay_merchant_name, 'alipay_merchant_name', 50)
        if self.alipay_merchant_service_name is not None:
            self.validate_max_length(self.alipay_merchant_service_name, 'alipay_merchant_service_name', 50)
        if self.alipay_merchant_service_description is not None:
            self.validate_max_length(self.alipay_merchant_service_description, 'alipay_merchant_service_description', 150)
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 128)
        if self.return_url is not None:
            self.validate_max_length(self.return_url, 'return_url', 256)
        if self.user_open_id is not None:
            self.validate_max_length(self.user_open_id, 'user_open_id', 128)
        if self.merchant_app_id is not None:
            self.validate_max_length(self.merchant_app_id, 'merchant_app_id', 32)

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
        if self.alipay_merchant_id is not None:
            result['alipay_merchant_id'] = self.alipay_merchant_id
        if self.alipay_merchant_name is not None:
            result['alipay_merchant_name'] = self.alipay_merchant_name
        if self.alipay_merchant_service_name is not None:
            result['alipay_merchant_service_name'] = self.alipay_merchant_service_name
        if self.alipay_merchant_service_description is not None:
            result['alipay_merchant_service_description'] = self.alipay_merchant_service_description
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.user_open_id is not None:
            result['user_open_id'] = self.user_open_id
        if self.merchant_app_id is not None:
            result['merchant_app_id'] = self.merchant_app_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('alipay_merchant_id') is not None:
            self.alipay_merchant_id = m.get('alipay_merchant_id')
        if m.get('alipay_merchant_name') is not None:
            self.alipay_merchant_name = m.get('alipay_merchant_name')
        if m.get('alipay_merchant_service_name') is not None:
            self.alipay_merchant_service_name = m.get('alipay_merchant_service_name')
        if m.get('alipay_merchant_service_description') is not None:
            self.alipay_merchant_service_description = m.get('alipay_merchant_service_description')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('user_open_id') is not None:
            self.user_open_id = m.get('user_open_id')
        if m.get('merchant_app_id') is not None:
            self.merchant_app_id = m.get('merchant_app_id')
        return self


class CreateWithholdSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_str: str = None,
        sign_str_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约字符串
        self.sign_str = sign_str
        # 签约字符串类型。SIGN_ONLY:仅签约;PAY_SIGN:支付并签约
        self.sign_str_type = sign_str_type

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
        if self.sign_str is not None:
            result['sign_str'] = self.sign_str
        if self.sign_str_type is not None:
            result['sign_str_type'] = self.sign_str_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_str') is not None:
            self.sign_str = m.get('sign_str')
        if m.get('sign_str_type') is not None:
            self.sign_str_type = m.get('sign_str_type')
        return self


class QueryWithholdSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)

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


class QueryWithholdSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        sign_time: str = None,
        valid_time: str = None,
        invalid_time: str = None,
        agreement_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 协议当前状态
        # 1. UNSIGNED：未签约
        # 2. SIGNED：已签约；
        # 3. TERMINATED：已解约
        self.status = status
        # 协议签署时间
        self.sign_time = sign_time
        # 协议生效时间
        self.valid_time = valid_time
        # 协议失效时间
        self.invalid_time = invalid_time
        # 代扣协议号
        self.agreement_no = agreement_no

    def validate(self):
        if self.sign_time is not None:
            self.validate_pattern(self.sign_time, 'sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.valid_time is not None:
            self.validate_pattern(self.valid_time, 'valid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.invalid_time is not None:
            self.validate_pattern(self.invalid_time, 'invalid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.invalid_time is not None:
            result['invalid_time'] = self.invalid_time
        if self.agreement_no is not None:
            result['agreement_no'] = self.agreement_no
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
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('invalid_time') is not None:
            self.invalid_time = m.get('invalid_time')
        if m.get('agreement_no') is not None:
            self.agreement_no = m.get('agreement_no')
        return self


class UnbindWithholdSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)

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


class UnbindWithholdSignResponse(TeaModel):
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


class CancelWithholdPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        cancel_reason: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当发现跨天继续提交
        self.order_id = order_id
        # 取消原因
        # RENTING_OUT:退租
        # RENTING_AND_RESALE:租转售
        # 
        # 
        self.cancel_reason = cancel_reason

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.cancel_reason, 'cancel_reason')
        if self.cancel_reason is not None:
            self.validate_max_length(self.cancel_reason, 'cancel_reason', 64)

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
        if self.cancel_reason is not None:
            result['cancel_reason'] = self.cancel_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('cancel_reason') is not None:
            self.cancel_reason = m.get('cancel_reason')
        return self


class CancelWithholdPlanResponse(TeaModel):
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


class RepayWithholdPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        gmt_pay: str = None,
        pay_off_amount: int = None,
        pay_off_type: str = None,
        pay_off_no: str = None,
        pay_off_bank_name: str = None,
        operation: str = None,
        cancel_list: List[SingleCancelModel] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期，单期取消必填
        self.period_num = period_num
        # 取消订单某一期代扣计划中以其他方式还款金额，单位为分，单期取消必填
        self.gmt_pay = gmt_pay
        # 取消订单某一期代扣计划中以其他方式还款金额，单位为分
        self.pay_off_amount = pay_off_amount
        # 变更其他方式还款
        # WECHAT:微信;
        # BANK:银行
        # ALIPAY:支付宝
        self.pay_off_type = pay_off_type
        # 通过其他方式还款单号;例如银行流水号或微信流水号
        self.pay_off_no = pay_off_no
        # 其他方式还款银行名称，还款方式为银行时必填
        self.pay_off_bank_name = pay_off_bank_name
        # 操作，默认为单期取消；
        # 多期取消：MULTI_CANCEL
        # 单期取消：SINGLE_CANCEL
        self.operation = operation
        # 取消列表，多期取消必填
        self.cancel_list = cancel_list

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        if self.gmt_pay is not None:
            self.validate_pattern(self.gmt_pay, 'gmt_pay', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.pay_off_amount is not None:
            self.validate_minimum(self.pay_off_amount, 'pay_off_amount', 0)
        if self.pay_off_type is not None:
            self.validate_max_length(self.pay_off_type, 'pay_off_type', 64)
        if self.pay_off_no is not None:
            self.validate_max_length(self.pay_off_no, 'pay_off_no', 64)
        if self.pay_off_bank_name is not None:
            self.validate_max_length(self.pay_off_bank_name, 'pay_off_bank_name', 64)
        if self.operation is not None:
            self.validate_max_length(self.operation, 'operation', 64)
        if self.cancel_list:
            for k in self.cancel_list:
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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.gmt_pay is not None:
            result['gmt_pay'] = self.gmt_pay
        if self.pay_off_amount is not None:
            result['pay_off_amount'] = self.pay_off_amount
        if self.pay_off_type is not None:
            result['pay_off_type'] = self.pay_off_type
        if self.pay_off_no is not None:
            result['pay_off_no'] = self.pay_off_no
        if self.pay_off_bank_name is not None:
            result['pay_off_bank_name'] = self.pay_off_bank_name
        if self.operation is not None:
            result['operation'] = self.operation
        result['cancel_list'] = []
        if self.cancel_list is not None:
            for k in self.cancel_list:
                result['cancel_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('gmt_pay') is not None:
            self.gmt_pay = m.get('gmt_pay')
        if m.get('pay_off_amount') is not None:
            self.pay_off_amount = m.get('pay_off_amount')
        if m.get('pay_off_type') is not None:
            self.pay_off_type = m.get('pay_off_type')
        if m.get('pay_off_no') is not None:
            self.pay_off_no = m.get('pay_off_no')
        if m.get('pay_off_bank_name') is not None:
            self.pay_off_bank_name = m.get('pay_off_bank_name')
        if m.get('operation') is not None:
            self.operation = m.get('operation')
        self.cancel_list = []
        if m.get('cancel_list') is not None:
            for k in m.get('cancel_list'):
                temp_model = SingleCancelModel()
                self.cancel_list.append(temp_model.from_map(k))
        return self


class RepayWithholdPlanResponse(TeaModel):
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


class RetryWithholdPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期
        self.period_num = period_num

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)

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
        if self.period_num is not None:
            result['period_num'] = self.period_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        return self


class RetryWithholdPlanResponse(TeaModel):
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


class ConfirmWithholdSignasyncunsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        operate: str = None,
        refuse_reason_code: str = None,
        user_owe_money: int = None,
        user_in_service: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 操作动作
        # 同意：AGREE
        # 拒绝：REFUSE
        self.operate = operate
        # 拒绝原因码,商户拒绝时必填。
        # USER_OWE_MONEY：用户账户存在欠费订单
        # USER_IN_SERVICE：用户有进行的订单
        self.refuse_reason_code = refuse_reason_code
        # 用户欠款金额，单位为分
        # refuse_reason_code=USER_OWE_MONEY时必填
        self.user_owe_money = user_owe_money
        # 用户进行中的服务
        # refuse_reason_code=USER_IN_SERVICE时必填
        self.user_in_service = user_in_service

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.operate, 'operate')
        if self.operate is not None:
            self.validate_max_length(self.operate, 'operate', 16)
        if self.refuse_reason_code is not None:
            self.validate_max_length(self.refuse_reason_code, 'refuse_reason_code', 16)
        if self.user_owe_money is not None:
            self.validate_minimum(self.user_owe_money, 'user_owe_money', 1)
        if self.user_in_service is not None:
            self.validate_max_length(self.user_in_service, 'user_in_service', 128)

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
        if self.operate is not None:
            result['operate'] = self.operate
        if self.refuse_reason_code is not None:
            result['refuse_reason_code'] = self.refuse_reason_code
        if self.user_owe_money is not None:
            result['user_owe_money'] = self.user_owe_money
        if self.user_in_service is not None:
            result['user_in_service'] = self.user_in_service
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('operate') is not None:
            self.operate = m.get('operate')
        if m.get('refuse_reason_code') is not None:
            self.refuse_reason_code = m.get('refuse_reason_code')
        if m.get('user_owe_money') is not None:
            self.user_owe_money = m.get('user_owe_money')
        if m.get('user_in_service') is not None:
            self.user_in_service = m.get('user_in_service')
        return self


class ConfirmWithholdSignasyncunsignResponse(TeaModel):
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


class CreateWithholdActivepayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        pay_type: str = None,
        pay_channel: str = None,
        pay_amount: int = None,
        operation_divide_flag: str = None,
        operation_divide_trans_in_list: List[OperationDivideTransInModel] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期,当支付类型为PERFORMANCE或为空必填
        self.period_num = period_num
        # 支付类型
        self.pay_type = pay_type
        # 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
        self.pay_channel = pay_channel
        # 支付金额，单位为分
        self.pay_amount = pay_amount
        # 经营分账标识Y/N
        # 当pay_type=BUYOUT、PENALTY必填。
        self.operation_divide_flag = operation_divide_flag
        # 当operation_divide_flag=Y 必填
        # 经营分账收入列表，最多10条，分账比例与正常限制一致。
        self.operation_divide_trans_in_list = operation_divide_trans_in_list

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        if self.pay_type is not None:
            self.validate_max_length(self.pay_type, 'pay_type', 64)
        if self.pay_channel is not None:
            self.validate_max_length(self.pay_channel, 'pay_channel', 64)
        if self.pay_amount is not None:
            self.validate_minimum(self.pay_amount, 'pay_amount', 1)
        if self.operation_divide_flag is not None:
            self.validate_max_length(self.operation_divide_flag, 'operation_divide_flag', 1)
        if self.operation_divide_trans_in_list:
            for k in self.operation_divide_trans_in_list:
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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        if self.pay_amount is not None:
            result['pay_amount'] = self.pay_amount
        if self.operation_divide_flag is not None:
            result['operation_divide_flag'] = self.operation_divide_flag
        result['operation_divide_trans_in_list'] = []
        if self.operation_divide_trans_in_list is not None:
            for k in self.operation_divide_trans_in_list:
                result['operation_divide_trans_in_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        if m.get('pay_amount') is not None:
            self.pay_amount = m.get('pay_amount')
        if m.get('operation_divide_flag') is not None:
            self.operation_divide_flag = m.get('operation_divide_flag')
        self.operation_divide_trans_in_list = []
        if m.get('operation_divide_trans_in_list') is not None:
            for k in m.get('operation_divide_trans_in_list'):
                temp_model = OperationDivideTransInModel()
                self.operation_divide_trans_in_list.append(temp_model.from_map(k))
        return self


class CreateWithholdActivepayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
        order_str: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付宝支付订单号，用于拉起主动支付页面
        self.trade_no = trade_no
        # 签名字符串，用于APP支付场景，客户端唤起支付宝收银台使用。
        self.order_str = order_str

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
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.order_str is not None:
            result['order_str'] = self.order_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('order_str') is not None:
            self.order_str = m.get('order_str')
        return self


class QueryWithholdActivepayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        trade_no: str = None,
        pay_type: str = None,
        pay_channel: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期,当支付类型为PERFORMANCE或为空必填
        self.period_num = period_num
        # 支付宝支付订单号，当传递此单号时，只会返回当前单据
        self.trade_no = trade_no
        # 支付类型
        self.pay_type = pay_type
        # 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
        self.pay_channel = pay_channel

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 64)
        if self.pay_type is not None:
            self.validate_max_length(self.pay_type, 'pay_type', 64)
        if self.pay_channel is not None:
            self.validate_max_length(self.pay_channel, 'pay_channel', 64)

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
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        return self


class QueryWithholdActivepayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_order: ActivePayOrder = None,
        orders: List[ActivePayOrder] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前支付单
        self.current_order = current_order
        # 主动支付单列表，当不通过trade_no查询时有值
        self.orders = orders

    def validate(self):
        if self.current_order:
            self.current_order.validate()
        if self.orders:
            for k in self.orders:
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
        if self.current_order is not None:
            result['current_order'] = self.current_order.to_map()
        result['orders'] = []
        if self.orders is not None:
            for k in self.orders:
                result['orders'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current_order') is not None:
            temp_model = ActivePayOrder()
            self.current_order = temp_model.from_map(m['current_order'])
        self.orders = []
        if m.get('orders') is not None:
            for k in m.get('orders'):
                temp_model = ActivePayOrder()
                self.orders.append(temp_model.from_map(k))
        return self


class CancelWithholdActivepayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        trade_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期
        self.period_num = period_num
        # 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
        self.trade_no = trade_no

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.period_num, 'period_num')

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
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        return self


class CancelWithholdActivepayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取消的单号
        self.trade_no = trade_no

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
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        return self


class CreateWithholdRefundRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        refund_request_no: str = None,
        refund_money: int = None,
        refund_reason: str = None,
        pay_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 第几期
        # 针对用户履约的第几期进行退款申请
        self.period_num = period_num
        # 外部系统传入的退款请求号
        self.refund_request_no = refund_request_no
        # 本次请求的退款金额，单位为分
        # 1234=12.34元
        self.refund_money = refund_money
        # 退款原因
        self.refund_reason = refund_reason
        # 支付类型
        # ORDER_BUYOUT:买断金
        # ORDER_PENALTY:违约金
        # PERFORMANCE:正常履约（默认）
        self.pay_type = pay_type

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 128)
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        self.validate_required(self.refund_request_no, 'refund_request_no')
        if self.refund_request_no is not None:
            self.validate_max_length(self.refund_request_no, 'refund_request_no', 128)
        self.validate_required(self.refund_money, 'refund_money')
        if self.refund_money is not None:
            self.validate_minimum(self.refund_money, 'refund_money', 1)
        if self.refund_reason is not None:
            self.validate_max_length(self.refund_reason, 'refund_reason', 200)
        if self.pay_type is not None:
            self.validate_max_length(self.pay_type, 'pay_type', 64)

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
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.refund_request_no is not None:
            result['refund_request_no'] = self.refund_request_no
        if self.refund_money is not None:
            result['refund_money'] = self.refund_money
        if self.refund_reason is not None:
            result['refund_reason'] = self.refund_reason
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('refund_request_no') is not None:
            self.refund_request_no = m.get('refund_request_no')
        if m.get('refund_money') is not None:
            self.refund_money = m.get('refund_money')
        if m.get('refund_reason') is not None:
            self.refund_reason = m.get('refund_reason')
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        return self


class CreateWithholdRefundResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        refund_request_no: str = None,
        status: str = None,
        refund_order_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 外部系统传入的退款请求号
        self.refund_request_no = refund_request_no
        # ACCEPT : 受理成功
        self.status = status
        # 请求支付宝的退款单据号
        self.refund_order_no = refund_order_no

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
        if self.refund_request_no is not None:
            result['refund_request_no'] = self.refund_request_no
        if self.status is not None:
            result['status'] = self.status
        if self.refund_order_no is not None:
            result['refund_order_no'] = self.refund_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('refund_request_no') is not None:
            self.refund_request_no = m.get('refund_request_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('refund_order_no') is not None:
            self.refund_order_no = m.get('refund_order_no')
        return self


class QueryWithholdRefundRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        refund_request_no: str = None,
        pay_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 几期
        # 针对用户履约的第几期进行退款申请
        self.period_num = period_num
        # 外部系统传入的退款请求号
        self.refund_request_no = refund_request_no
        # 支付类型
        # ORDER_BUYOUT:买断金
        # ORDER_PENALTY:违约金
        # PERFORMANCE:正常履约（默认）
        self.pay_type = pay_type

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 128)
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        self.validate_required(self.refund_request_no, 'refund_request_no')
        if self.refund_request_no is not None:
            self.validate_max_length(self.refund_request_no, 'refund_request_no', 128)
        if self.pay_type is not None:
            self.validate_max_length(self.pay_type, 'pay_type', 64)

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
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.refund_request_no is not None:
            result['refund_request_no'] = self.refund_request_no
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('refund_request_no') is not None:
            self.refund_request_no = m.get('refund_request_no')
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        return self


class QueryWithholdRefundResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        refund_request_no: str = None,
        refund_order_no: str = None,
        status: str = None,
        refund_error_msg: str = None,
        total_refund_amount: int = None,
        send_back_amount: int = None,
        gmt_refund_pay: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 外部系统传入的退款请求号
        self.refund_request_no = refund_request_no
        # 请求支付宝的退款单据号
        self.refund_order_no = refund_order_no
        # 退款请求状态
        # ● ACCEPT: 受理成功
        # ● PENDING: 需人工介入
        # ● SUCCESS: 成功
        # ● FAILED : 失败
        self.status = status
        # 退款失败原因
        self.refund_error_msg = refund_error_msg
        # 本笔交易总退款金额，单位为分
        # 12300=123元
        self.total_refund_amount = total_refund_amount
        # 本次退款申请的实际退款金额，单位为分
        # 12300=123元
        self.send_back_amount = send_back_amount
        # 实际退款时间,13位时间戳（毫秒）
        self.gmt_refund_pay = gmt_refund_pay

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
        if self.refund_request_no is not None:
            result['refund_request_no'] = self.refund_request_no
        if self.refund_order_no is not None:
            result['refund_order_no'] = self.refund_order_no
        if self.status is not None:
            result['status'] = self.status
        if self.refund_error_msg is not None:
            result['refund_error_msg'] = self.refund_error_msg
        if self.total_refund_amount is not None:
            result['total_refund_amount'] = self.total_refund_amount
        if self.send_back_amount is not None:
            result['send_back_amount'] = self.send_back_amount
        if self.gmt_refund_pay is not None:
            result['gmt_refund_pay'] = self.gmt_refund_pay
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('refund_request_no') is not None:
            self.refund_request_no = m.get('refund_request_no')
        if m.get('refund_order_no') is not None:
            self.refund_order_no = m.get('refund_order_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('refund_error_msg') is not None:
            self.refund_error_msg = m.get('refund_error_msg')
        if m.get('total_refund_amount') is not None:
            self.total_refund_amount = m.get('total_refund_amount')
        if m.get('send_back_amount') is not None:
            self.send_back_amount = m.get('send_back_amount')
        if m.get('gmt_refund_pay') is not None:
            self.gmt_refund_pay = m.get('gmt_refund_pay')
        return self


class QueryWithholdCompensateaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
        fund_tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户社会信用代码
        self.merchant_id = merchant_id
        # 资方社会信用代码
        self.fund_id = fund_id
        # 资方租户id
        self.fund_tenant_id = fund_tenant_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)
        self.validate_required(self.fund_tenant_id, 'fund_tenant_id')
        if self.fund_tenant_id is not None:
            self.validate_max_length(self.fund_tenant_id, 'fund_tenant_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.fund_tenant_id is not None:
            result['fund_tenant_id'] = self.fund_tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('fund_tenant_id') is not None:
            self.fund_tenant_id = m.get('fund_tenant_id')
        return self


class QueryWithholdCompensateaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        card_no: str = None,
        available_amount: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 代偿卡号
        self.card_no = card_no
        # 可用余额，单位为分
        self.available_amount = available_amount

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
        if self.card_no is not None:
            result['card_no'] = self.card_no
        if self.available_amount is not None:
            result['available_amount'] = self.available_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('card_no') is not None:
            self.card_no = m.get('card_no')
        if m.get('available_amount') is not None:
            self.available_amount = m.get('available_amount')
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


