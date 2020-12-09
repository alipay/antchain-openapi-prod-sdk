# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
try:
    from typing import List
except ImportError:
    pass


class Config(TeaModel):
    """
    Model for initing client
    """
    def __init__(self, access_key_id=None, access_key_secret=None, security_token=None, protocol=None,
                 read_timeout=None, connect_timeout=None, http_proxy=None, https_proxy=None, endpoint=None, no_proxy=None,
                 max_idle_conns=None, user_agent=None, socks_5proxy=None, socks_5net_work=None):
        # accesskey id
        self.access_key_id = access_key_id  # type: str
        # accesskey secret
        self.access_key_secret = access_key_secret  # type: str
        # security token
        self.security_token = security_token  # type: str
        # http protocol
        self.protocol = protocol        # type: str
        # read timeout
        self.read_timeout = read_timeout  # type: int
        # connect timeout
        self.connect_timeout = connect_timeout  # type: int
        # http proxy
        self.http_proxy = http_proxy    # type: str
        # https proxy
        self.https_proxy = https_proxy  # type: str
        # endpoint
        self.endpoint = endpoint        # type: str
        # proxy white list
        self.no_proxy = no_proxy        # type: str
        # max idle conns
        self.max_idle_conns = max_idle_conns  # type: int
        # user agent
        self.user_agent = user_agent    # type: str
        # socks5 proxy
        self.socks_5proxy = socks_5proxy  # type: str
        # socks5 network
        self.socks_5net_work = socks_5net_work  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['accessKeyId'] = self.access_key_id
        result['accessKeySecret'] = self.access_key_secret
        result['securityToken'] = self.security_token
        result['protocol'] = self.protocol
        result['readTimeout'] = self.read_timeout
        result['connectTimeout'] = self.connect_timeout
        result['httpProxy'] = self.http_proxy
        result['httpsProxy'] = self.https_proxy
        result['endpoint'] = self.endpoint
        result['noProxy'] = self.no_proxy
        result['maxIdleConns'] = self.max_idle_conns
        result['userAgent'] = self.user_agent
        result['socks5Proxy'] = self.socks_5proxy
        result['socks5NetWork'] = self.socks_5net_work
        return result

    def from_map(self, map={}):
        self.access_key_id = map.get('accessKeyId')
        self.access_key_secret = map.get('accessKeySecret')
        self.security_token = map.get('securityToken')
        self.protocol = map.get('protocol')
        self.read_timeout = map.get('readTimeout')
        self.connect_timeout = map.get('connectTimeout')
        self.http_proxy = map.get('httpProxy')
        self.https_proxy = map.get('httpsProxy')
        self.endpoint = map.get('endpoint')
        self.no_proxy = map.get('noProxy')
        self.max_idle_conns = map.get('maxIdleConns')
        self.user_agent = map.get('userAgent')
        self.socks_5proxy = map.get('socks5Proxy')
        self.socks_5net_work = map.get('socks5NetWork')
        return self


class InsureCarrierObjectInfo(TeaModel):
    def __init__(self, cp_model=None, frame_no=None, license_no=None, ton_nage=None, driv_per=None, run_no=None,
                 ts_car_go=None):
        # 厂牌型号
        self.cp_model = cp_model        # type: str
        # 车架号
        self.frame_no = frame_no        # type: str
        # 车牌号码
        self.license_no = license_no    # type: str
        # 吨位
        self.ton_nage = ton_nage        # type: str
        # 行驶证车主
        self.driv_per = driv_per        # type: str
        # 运营证号
        self.run_no = run_no            # type: str
        # 运输货物
        self.ts_car_go = ts_car_go      # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cp_model'] = self.cp_model
        result['frame_no'] = self.frame_no
        result['license_no'] = self.license_no
        result['ton_nage'] = self.ton_nage
        result['driv_per'] = self.driv_per
        result['run_no'] = self.run_no
        result['ts_car_go'] = self.ts_car_go
        return result

    def from_map(self, map={}):
        self.cp_model = map.get('cp_model')
        self.frame_no = map.get('frame_no')
        self.license_no = map.get('license_no')
        self.ton_nage = map.get('ton_nage')
        self.driv_per = map.get('driv_per')
        self.run_no = map.get('run_no')
        self.ts_car_go = map.get('ts_car_go')
        return self


class PayAmount(TeaModel):
    def __init__(self, amount=None, pay_type=None):
        # 支付金额（2位小数）
        self.amount = amount            # type: str
        # 支付方式
        self.pay_type = pay_type        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['amount'] = self.amount
        result['pay_type'] = self.pay_type
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.pay_type = map.get('pay_type')
        return self


class MasterBlGoodsDto(TeaModel):
    def __init__(self, marks=None, goods=None, goods_type=None, package_type=None, number=None, weight=None,
                 volume=None):
        # 唛头
        self.marks = marks              # type: str
        # 货物
        self.goods = goods              # type: str
        # 货物类型
        self.goods_type = goods_type    # type: str
        # 包装类型
        self.package_type = package_type  # type: str
        # 委托件数
        self.number = number            # type: str
        # 委托重量
        self.weight = weight            # type: str
        # 委托体积
        self.volume = volume            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['marks'] = self.marks
        result['goods'] = self.goods
        result['goods_type'] = self.goods_type
        result['package_type'] = self.package_type
        result['number'] = self.number
        result['weight'] = self.weight
        result['volume'] = self.volume
        return result

    def from_map(self, map={}):
        self.marks = map.get('marks')
        self.goods = map.get('goods')
        self.goods_type = map.get('goods_type')
        self.package_type = map.get('package_type')
        self.number = map.get('number')
        self.weight = map.get('weight')
        self.volume = map.get('volume')
        return self


class EblDeatil(TeaModel):
    def __init__(self, ebl_copy_pdf_file_hash=None, ebl_copy_pdf_file_id=None, ebl_no=None):
        # 电子提单copy文件hash
        self.ebl_copy_pdf_file_hash = ebl_copy_pdf_file_hash  # type: str
        # 电子提单copy文件id
        self.ebl_copy_pdf_file_id = ebl_copy_pdf_file_id  # type: str
        # 电子提单编号
        self.ebl_no = ebl_no            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['ebl_copy_pdf_file_hash'] = self.ebl_copy_pdf_file_hash
        result['ebl_copy_pdf_file_id'] = self.ebl_copy_pdf_file_id
        result['ebl_no'] = self.ebl_no
        return result

    def from_map(self, map={}):
        self.ebl_copy_pdf_file_hash = map.get('ebl_copy_pdf_file_hash')
        self.ebl_copy_pdf_file_id = map.get('ebl_copy_pdf_file_id')
        self.ebl_no = map.get('ebl_no')
        return self


class ReceiptTariffInvoiceParam(TeaModel):
    def __init__(self, action=None, invoice_amount=None, receipt_tariff_amount=None, receipt_tariff_code=None,
                 receipt_tariff_invoice_code=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 发票金额 业务必填
        self.invoice_amount = invoice_amount  # type: str
        # 资费项金额 业务必填
        self.receipt_tariff_amount = receipt_tariff_amount  # type: str
        # 资费单据编号 业务必填
        self.receipt_tariff_code = receipt_tariff_code  # type: str
        # 资费项发票code
        self.receipt_tariff_invoice_code = receipt_tariff_invoice_code  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['invoice_amount'] = self.invoice_amount
        result['receipt_tariff_amount'] = self.receipt_tariff_amount
        result['receipt_tariff_code'] = self.receipt_tariff_code
        result['receipt_tariff_invoice_code'] = self.receipt_tariff_invoice_code
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.invoice_amount = map.get('invoice_amount')
        self.receipt_tariff_amount = map.get('receipt_tariff_amount')
        self.receipt_tariff_code = map.get('receipt_tariff_code')
        self.receipt_tariff_invoice_code = map.get('receipt_tariff_invoice_code')
        return self


class HouseBlContainerParam(TeaModel):
    def __init__(self, action=None, container_id=None, container_no=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 集装箱ID
        self.container_id = container_id  # type: str
        # 箱号
        self.container_no = container_no  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['container_id'] = self.container_id
        result['container_no'] = self.container_no
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.container_id = map.get('container_id')
        self.container_no = map.get('container_no')
        return self


class MasterBlBookingParam(TeaModel):
    def __init__(self, action=None, booking_no=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 订舱单号
        self.booking_no = booking_no    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['booking_no'] = self.booking_no
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.booking_no = map.get('booking_no')
        return self


class UploadOrderBooking(TeaModel):
    def __init__(self, booking_no=None, container_nos=None):
        # 订舱单号
        self.booking_no = booking_no    # type: str
        # 集装箱号  json字符串上传
        self.container_nos = container_nos  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['booking_no'] = self.booking_no
        result['container_nos'] = self.container_nos
        return result

    def from_map(self, map={}):
        self.booking_no = map.get('booking_no')
        self.container_nos = map.get('container_nos')
        return self


class TrackCheckResult(TeaModel):
    def __init__(self, track_check_status=None, track_check_status_msg=None):
        # 轨迹核验状态code
        self.track_check_status = track_check_status  # type: str
        # 轨迹核验结果描述
        self.track_check_status_msg = track_check_status_msg  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['track_check_status'] = self.track_check_status
        result['track_check_status_msg'] = self.track_check_status_msg
        return result

    def from_map(self, map={}):
        self.track_check_status = map.get('track_check_status')
        self.track_check_status_msg = map.get('track_check_status_msg')
        return self


class PayBillTariffParam(TeaModel):
    def __init__(self, action=None, bill_amount=None, pay_bill_tariff_code=None, pay_tariff_amount=None,
                 pay_tariff_code=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 账单金额 业务必填
        self.bill_amount = bill_amount  # type: str
        # 应付账单、应付资费项 多对多code
        self.pay_bill_tariff_code = pay_bill_tariff_code  # type: str
        # 资费项金额 业务必填
        self.pay_tariff_amount = pay_tariff_amount  # type: str
        # 应付资费项编号 业务必填
        self.pay_tariff_code = pay_tariff_code  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['bill_amount'] = self.bill_amount
        result['pay_bill_tariff_code'] = self.pay_bill_tariff_code
        result['pay_tariff_amount'] = self.pay_tariff_amount
        result['pay_tariff_code'] = self.pay_tariff_code
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.bill_amount = map.get('bill_amount')
        self.pay_bill_tariff_code = map.get('pay_bill_tariff_code')
        self.pay_tariff_amount = map.get('pay_tariff_amount')
        self.pay_tariff_code = map.get('pay_tariff_code')
        return self


class VehicleContainerParam(TeaModel):
    def __init__(self, action=None, container_id=None, container_no=None, seal_no=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 集装箱ID
        self.container_id = container_id  # type: str
        # 箱号
        self.container_no = container_no  # type: str
        # 封号
        self.seal_no = seal_no          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['container_id'] = self.container_id
        result['container_no'] = self.container_no
        result['seal_no'] = self.seal_no
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.container_id = map.get('container_id')
        self.container_no = map.get('container_no')
        self.seal_no = map.get('seal_no')
        return self


class UploadFileInfo(TeaModel):
    def __init__(self, file_id=None, file_hash=None):
        # 文件id
        self.file_id = file_id          # type: str
        # 文件hash
        self.file_hash = file_hash      # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['file_id'] = self.file_id
        result['file_hash'] = self.file_hash
        return result

    def from_map(self, map={}):
        self.file_id = map.get('file_id')
        self.file_hash = map.get('file_hash')
        return self


class ContainerGoodsParam(TeaModel):
    def __init__(self, cargo_ready_date=None, dg_page_no=None, dg_type=None, flash_point=None, goods=None,
                 goods_cn=None, goods_type=None, hs_codes=None, marks=None, number=None, package_type=None, real_number=None,
                 real_volume=None, real_weight=None, un_no=None, volume=None, weight=None):
        # 预计备货时间
        self.cargo_ready_date = cargo_ready_date  # type: int
        # 危险品页号
        self.dg_page_no = dg_page_no    # type: str
        # 危险品级别
        self.dg_type = dg_type          # type: str
        # 危险品闪点
        self.flash_point = flash_point  # type: str
        # 货物
        self.goods = goods              # type: str
        # 货物中文名
        self.goods_cn = goods_cn        # type: str
        # 货物类型 业务必填
        self.goods_type = goods_type    # type: str
        # HS CODE
        self.hs_codes = hs_codes        # type: List[str]
        # 唛头
        self.marks = marks              # type: str
        # 件数 业务必填
        self.number = number            # type: str
        # 包装类型
        self.package_type = package_type  # type: str
        # 实际件数
        self.real_number = real_number  # type: str
        # 实际体积
        self.real_volume = real_volume  # type: str
        # 实际重量
        self.real_weight = real_weight  # type: str
        # 危险品联合国编号
        self.un_no = un_no              # type: str
        # 体积 业务必填
        self.volume = volume            # type: str
        # 毛重 业务必填
        self.weight = weight            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cargo_ready_date'] = self.cargo_ready_date
        result['dg_page_no'] = self.dg_page_no
        result['dg_type'] = self.dg_type
        result['flash_point'] = self.flash_point
        result['goods'] = self.goods
        result['goods_cn'] = self.goods_cn
        result['goods_type'] = self.goods_type
        result['hs_codes'] = self.hs_codes
        result['marks'] = self.marks
        result['number'] = self.number
        result['package_type'] = self.package_type
        result['real_number'] = self.real_number
        result['real_volume'] = self.real_volume
        result['real_weight'] = self.real_weight
        result['un_no'] = self.un_no
        result['volume'] = self.volume
        result['weight'] = self.weight
        return result

    def from_map(self, map={}):
        self.cargo_ready_date = map.get('cargo_ready_date')
        self.dg_page_no = map.get('dg_page_no')
        self.dg_type = map.get('dg_type')
        self.flash_point = map.get('flash_point')
        self.goods = map.get('goods')
        self.goods_cn = map.get('goods_cn')
        self.goods_type = map.get('goods_type')
        self.hs_codes = map.get('hs_codes')
        self.marks = map.get('marks')
        self.number = map.get('number')
        self.package_type = map.get('package_type')
        self.real_number = map.get('real_number')
        self.real_volume = map.get('real_volume')
        self.real_weight = map.get('real_weight')
        self.un_no = map.get('un_no')
        self.volume = map.get('volume')
        self.weight = map.get('weight')
        return self


class StatementInfo(TeaModel):
    def __init__(self, batch_id=None, out_biz_no=None, issue_id=None, contract_id=None, waybill_id=None,
                 pay_order=None, credit_limit=None, state_type=None, state_msg=None, from_did=None, to_did=None,
                 issue_date=None, expire_date=None):
        # 信用流转批次号
        self.batch_id = batch_id        # type: str
        # 全局唯一业务号
        self.out_biz_no = out_biz_no    # type: str
        # 信用流转凭证
        self.issue_id = issue_id        # type: str
        # 合同号（预留）
        self.contract_id = contract_id  # type: str
        # 发行信用流转的运单号
        self.waybill_id = waybill_id    # type: str
        # 发行信用流转的支付单号
        self.pay_order = pay_order      # type: str
        # 金额信息
        self.credit_limit = credit_limit  # type: str
        # 流水类型
        self.state_type = state_type    # type: str
        # 流水类型说明
        self.state_msg = state_msg      # type: str
        # 凭证来源方did
        self.from_did = from_did        # type: str
        # 凭证流转方did
        self.to_did = to_did            # type: str
        # 信用凭证发起时间
        self.issue_date = issue_date    # type: str
        # 信用凭证到期时间
        self.expire_date = expire_date  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['batch_id'] = self.batch_id
        result['out_biz_no'] = self.out_biz_no
        result['issue_id'] = self.issue_id
        result['contract_id'] = self.contract_id
        result['waybill_id'] = self.waybill_id
        result['pay_order'] = self.pay_order
        result['credit_limit'] = self.credit_limit
        result['state_type'] = self.state_type
        result['state_msg'] = self.state_msg
        result['from_did'] = self.from_did
        result['to_did'] = self.to_did
        result['issue_date'] = self.issue_date
        result['expire_date'] = self.expire_date
        return result

    def from_map(self, map={}):
        self.batch_id = map.get('batch_id')
        self.out_biz_no = map.get('out_biz_no')
        self.issue_id = map.get('issue_id')
        self.contract_id = map.get('contract_id')
        self.waybill_id = map.get('waybill_id')
        self.pay_order = map.get('pay_order')
        self.credit_limit = map.get('credit_limit')
        self.state_type = map.get('state_type')
        self.state_msg = map.get('state_msg')
        self.from_did = map.get('from_did')
        self.to_did = map.get('to_did')
        self.issue_date = map.get('issue_date')
        self.expire_date = map.get('expire_date')
        return self


class CustomsOrderBookingParam(TeaModel):
    def __init__(self, action=None, booking_no=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 订舱单号
        self.booking_no = booking_no    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['booking_no'] = self.booking_no
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.booking_no = map.get('booking_no')
        return self


class IssueTransferData(TeaModel):
    def __init__(self, issue_id=None, payer_did=None, rcv_did=None):
        # 凭证id
        self.issue_id = issue_id        # type: str
        # 转出方did
        self.payer_did = payer_did      # type: str
        # 接收方did
        self.rcv_did = rcv_did          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['issue_id'] = self.issue_id
        result['payer_did'] = self.payer_did
        result['rcv_did'] = self.rcv_did
        return result

    def from_map(self, map={}):
        self.issue_id = map.get('issue_id')
        self.payer_did = map.get('payer_did')
        self.rcv_did = map.get('rcv_did')
        return self


class EblStatusDetail(TeaModel):
    def __init__(self, current_ebl_status=None, ebl_no=None, next_ebl_status=None):
        # 当前提单状态
        self.current_ebl_status = current_ebl_status  # type: str
        # 电子提单编号
        self.ebl_no = ebl_no            # type: str
        # 下一个提单状态
        self.next_ebl_status = next_ebl_status  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['current_ebl_status'] = self.current_ebl_status
        result['ebl_no'] = self.ebl_no
        result['next_ebl_status'] = self.next_ebl_status
        return result

    def from_map(self, map={}):
        self.current_ebl_status = map.get('current_ebl_status')
        self.ebl_no = map.get('ebl_no')
        self.next_ebl_status = map.get('next_ebl_status')
        return self


class FinishWaybillOrderReq(TeaModel):
    def __init__(self, all_freight=None, back_fee=None, consignor_freight_amount=None, freight_incr=None,
                 loss_fee=None, platform_did=None, tax_waybill_id=None):
        # 运费
        self.all_freight = all_freight  # type: str
        # 回单押金
        self.back_fee = back_fee        # type: str
        # 货主支付运费金额
        self.consignor_freight_amount = consignor_freight_amount  # type: str
        # 运费增项
        self.freight_incr = freight_incr  # type: str
        # 运费扣减
        self.loss_fee = loss_fee        # type: str
        # 平台did
        self.platform_did = platform_did  # type: str
        # 运单id
        self.tax_waybill_id = tax_waybill_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['all_freight'] = self.all_freight
        result['back_fee'] = self.back_fee
        result['consignor_freight_amount'] = self.consignor_freight_amount
        result['freight_incr'] = self.freight_incr
        result['loss_fee'] = self.loss_fee
        result['platform_did'] = self.platform_did
        result['tax_waybill_id'] = self.tax_waybill_id
        return result

    def from_map(self, map={}):
        self.all_freight = map.get('all_freight')
        self.back_fee = map.get('back_fee')
        self.consignor_freight_amount = map.get('consignor_freight_amount')
        self.freight_incr = map.get('freight_incr')
        self.loss_fee = map.get('loss_fee')
        self.platform_did = map.get('platform_did')
        self.tax_waybill_id = map.get('tax_waybill_id')
        return self


class IssueIdInfo(TeaModel):
    def __init__(self, issue_id=None, out_biz_no=None, contract_id=None, waybill_id=None, pay_order=None,
                 ticket_amt=None, issue_date=None, expire_date=None, status=None, err_msg=None):
        # 信用流转凭证
        self.issue_id = issue_id        # type: str
        # 全局唯一业务号
        self.out_biz_no = out_biz_no    # type: str
        # 合同号（预留）
        self.contract_id = contract_id  # type: str
        # 发行信用流转的运单号
        self.waybill_id = waybill_id    # type: str
        # 支付订单
        self.pay_order = pay_order      # type: str
        # 凭证金额
        self.ticket_amt = ticket_amt    # type: str
        # 信用凭证发起时间
        self.issue_date = issue_date    # type: str
        # 信用凭证到期时间
        self.expire_date = expire_date  # type: str
        # 发行结果状态 -1:发行失败状态， 0:未完成状态， 1:已发行状态
        self.status = status            # type: int
        # 失败原因信息
        self.err_msg = err_msg          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['issue_id'] = self.issue_id
        result['out_biz_no'] = self.out_biz_no
        result['contract_id'] = self.contract_id
        result['waybill_id'] = self.waybill_id
        result['pay_order'] = self.pay_order
        result['ticket_amt'] = self.ticket_amt
        result['issue_date'] = self.issue_date
        result['expire_date'] = self.expire_date
        result['status'] = self.status
        result['err_msg'] = self.err_msg
        return result

    def from_map(self, map={}):
        self.issue_id = map.get('issue_id')
        self.out_biz_no = map.get('out_biz_no')
        self.contract_id = map.get('contract_id')
        self.waybill_id = map.get('waybill_id')
        self.pay_order = map.get('pay_order')
        self.ticket_amt = map.get('ticket_amt')
        self.issue_date = map.get('issue_date')
        self.expire_date = map.get('expire_date')
        self.status = map.get('status')
        self.err_msg = map.get('err_msg')
        return self


class WaybillAmount(TeaModel):
    def __init__(self, amount=None, waybill_id=None):
        # 运单金额（2位小数）
        self.amount = amount            # type: str
        # 运单号
        self.waybill_id = waybill_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['amount'] = self.amount
        result['waybill_id'] = self.waybill_id
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.waybill_id = map.get('waybill_id')
        return self


class SoNotifyBookingParam(TeaModel):
    def __init__(self, action=None, booking_no=None, carrier=None, container_params=None, customs_clearance=None,
                 cy=None, cy_closing=None, etd=None, port=None, si_closing=None, vessel=None, voyage=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 订舱单号
        self.booking_no = booking_no    # type: str
        # 船公司  业务必填
        self.carrier = carrier          # type: str
        # 箱型箱量 json格式 业务必填
        # [{"containerVolume":"33","containerType":"22"}]
        # containerVolume--箱量 业务必填
        # containerType--箱型 业务必填
        self.container_params = container_params  # type: str
        # 截关时间
        self.customs_clearance = customs_clearance  # type: int
        # 场站
        self.cy = cy                    # type: str
        # 截港时间
        self.cy_closing = cy_closing    # type: int
        # 预计船期
        self.etd = etd                  # type: int
        # 港口
        self.port = port                # type: str
        # 截单时间
        self.si_closing = si_closing    # type: int
        # 船名  业务必填
        self.vessel = vessel            # type: str
        # 航次 业务必填
        self.voyage = voyage            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['booking_no'] = self.booking_no
        result['carrier'] = self.carrier
        result['container_params'] = self.container_params
        result['customs_clearance'] = self.customs_clearance
        result['cy'] = self.cy
        result['cy_closing'] = self.cy_closing
        result['etd'] = self.etd
        result['port'] = self.port
        result['si_closing'] = self.si_closing
        result['vessel'] = self.vessel
        result['voyage'] = self.voyage
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.booking_no = map.get('booking_no')
        self.carrier = map.get('carrier')
        self.container_params = map.get('container_params')
        self.customs_clearance = map.get('customs_clearance')
        self.cy = map.get('cy')
        self.cy_closing = map.get('cy_closing')
        self.etd = map.get('etd')
        self.port = map.get('port')
        self.si_closing = map.get('si_closing')
        self.vessel = map.get('vessel')
        self.voyage = map.get('voyage')
        return self


class ScpTicketIssueDataParam(TeaModel):
    def __init__(self, issue_id=None, did=None):
        # 凭证id
        self.issue_id = issue_id        # type: str
        # 凭证对应的司机/货主的did
        self.did = did                  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['issue_id'] = self.issue_id
        result['did'] = self.did
        return result

    def from_map(self, map={}):
        self.issue_id = map.get('issue_id')
        self.did = map.get('did')
        return self


class SaasIssueApplyInfo(TeaModel):
    def __init__(self, cargo_order=None, contract_id=None, out_biz_no=None, pay_order=None, waybill_id=None,
                 driver_did=None, freight=None, expire_date=None):
        # 货源订单
        self.cargo_order = cargo_order  # type: str
        # 合同号
        self.contract_id = contract_id  # type: str
        # 全局唯一业务单号
        self.out_biz_no = out_biz_no    # type: str
        # 支付单号
        self.pay_order = pay_order      # type: str
        # 运单号
        self.waybill_id = waybill_id    # type: str
        # 司机did
        self.driver_did = driver_did    # type: str
        # 发行费
        self.freight = freight          # type: str
        # 到期时间戳
        self.expire_date = expire_date  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cargo_order'] = self.cargo_order
        result['contract_id'] = self.contract_id
        result['out_biz_no'] = self.out_biz_no
        result['pay_order'] = self.pay_order
        result['waybill_id'] = self.waybill_id
        result['driver_did'] = self.driver_did
        result['freight'] = self.freight
        result['expire_date'] = self.expire_date
        return result

    def from_map(self, map={}):
        self.cargo_order = map.get('cargo_order')
        self.contract_id = map.get('contract_id')
        self.out_biz_no = map.get('out_biz_no')
        self.pay_order = map.get('pay_order')
        self.waybill_id = map.get('waybill_id')
        self.driver_did = map.get('driver_did')
        self.freight = map.get('freight')
        self.expire_date = map.get('expire_date')
        return self


class ReceiptBillTariffParam(TeaModel):
    def __init__(self, action=None, bill_amount=None, receipt_bill_tariff_code=None, receipt_tariff_amount=None,
                 receipt_tariff_code=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 账单金额 业务必填
        self.bill_amount = bill_amount  # type: str
        # 应收账单 、应收资费项 多对多关联code
        self.receipt_bill_tariff_code = receipt_bill_tariff_code  # type: str
        # 资费项金额 业务必填
        self.receipt_tariff_amount = receipt_tariff_amount  # type: str
        # 应收资费项编号 业务必填
        self.receipt_tariff_code = receipt_tariff_code  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['bill_amount'] = self.bill_amount
        result['receipt_bill_tariff_code'] = self.receipt_bill_tariff_code
        result['receipt_tariff_amount'] = self.receipt_tariff_amount
        result['receipt_tariff_code'] = self.receipt_tariff_code
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.bill_amount = map.get('bill_amount')
        self.receipt_bill_tariff_code = map.get('receipt_bill_tariff_code')
        self.receipt_tariff_amount = map.get('receipt_tariff_amount')
        self.receipt_tariff_code = map.get('receipt_tariff_code')
        return self


class IssueApplyInfo(TeaModel):
    def __init__(self, cargo_order=None, contract_id=None, expire_date=None, freight=None, out_biz_no=None,
                 pay_order=None, waybill_id=None, driver_did=None):
        # 货源订单
        self.cargo_order = cargo_order  # type: str
        # 合同号（预留）
        self.contract_id = contract_id  # type: str
        # 凭证到期时间
        self.expire_date = expire_date  # type: str
        # 支付单运费，运费最多精确到小数点后2位
        self.freight = freight          # type: str
        # 全局唯一业务号
        self.out_biz_no = out_biz_no    # type: str
        # 支付订单
        self.pay_order = pay_order      # type: str
        # 运单id
        self.waybill_id = waybill_id    # type: str
        # 司机did
        self.driver_did = driver_did    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cargo_order'] = self.cargo_order
        result['contract_id'] = self.contract_id
        result['expire_date'] = self.expire_date
        result['freight'] = self.freight
        result['out_biz_no'] = self.out_biz_no
        result['pay_order'] = self.pay_order
        result['waybill_id'] = self.waybill_id
        result['driver_did'] = self.driver_did
        return result

    def from_map(self, map={}):
        self.cargo_order = map.get('cargo_order')
        self.contract_id = map.get('contract_id')
        self.expire_date = map.get('expire_date')
        self.freight = map.get('freight')
        self.out_biz_no = map.get('out_biz_no')
        self.pay_order = map.get('pay_order')
        self.waybill_id = map.get('waybill_id')
        self.driver_did = map.get('driver_did')
        return self


class CargoAmount(TeaModel):
    def __init__(self, amount=None, cargo_order=None):
        # 货运单对应金额（2位小数）
        self.amount = amount            # type: str
        # 货源单号
        self.cargo_order = cargo_order  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['amount'] = self.amount
        result['cargo_order'] = self.cargo_order
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.cargo_order = map.get('cargo_order')
        return self


class MasterBlContainerParam(TeaModel):
    def __init__(self, action=None, container_id=None, container_no=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 集装箱ID
        self.container_id = container_id  # type: str
        # 箱号
        self.container_no = container_no  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['container_id'] = self.container_id
        result['container_no'] = self.container_no
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.container_id = map.get('container_id')
        self.container_no = map.get('container_no')
        return self


class LogisticLocation(TeaModel):
    def __init__(self, address=None, city_code=None, lat=None, lon=None, track_time=None):
        # 结构化地址信息,规则遵循：国家、省份、城市、区县、城镇、乡村、街道、门牌号码、屋邨、大厦
        self.address = address          # type: str
        # 行政区划代码
        self.city_code = city_code      # type: str
        # 纬度
        # 
        self.lat = lat                  # type: str
        # 经度
        self.lon = lon                  # type: str
        # 轨迹时间戳
        self.track_time = track_time    # type: int

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['address'] = self.address
        result['city_code'] = self.city_code
        result['lat'] = self.lat
        result['lon'] = self.lon
        result['track_time'] = self.track_time
        return result

    def from_map(self, map={}):
        self.address = map.get('address')
        self.city_code = map.get('city_code')
        self.lat = map.get('lat')
        self.lon = map.get('lon')
        self.track_time = map.get('track_time')
        return self


class HouseBlBookingParam(TeaModel):
    def __init__(self, action=None, booking_no=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 订舱单号
        self.booking_no = booking_no    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['booking_no'] = self.booking_no
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.booking_no = map.get('booking_no')
        return self


class PfCreditQuotaInfo(TeaModel):
    def __init__(self, cert_no=None, cert_type=None, credit_end=None, credit_start=None, quota_no=None,
                 remaining_quota=None, remark=None, status=None, total_quota=None, update_time=None, total_pledge_quota=None,
                 remain_pledge_quota=None):
        # 证件号
        self.cert_no = cert_no          # type: str
        # 证件类型
        self.cert_type = cert_type      # type: str
        # 授信到期日期
        self.credit_end = credit_end    # type: str
        # 授信起始日期
        self.credit_start = credit_start  # type: str
        # 额度编号
        self.quota_no = quota_no        # type: str
        # 剩余额度
        self.remaining_quota = remaining_quota  # type: str
        # SON:放款账号loanAccNo
        # 还款账号repayAcctNo
        self.remark = remark            # type: str
        # 额度状态：
        # 0、停用 / 1、启用  /  2、冻结
        self.status = status            # type: str
        # 授信额度
        self.total_quota = total_quota  # type: str
        # 数据更新时间
        self.update_time = update_time  # type: str
        # 总质押额度
        self.total_pledge_quota = total_pledge_quota  # type: str
        # 剩余质押额度
        self.remain_pledge_quota = remain_pledge_quota  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cert_no'] = self.cert_no
        result['cert_type'] = self.cert_type
        result['credit_end'] = self.credit_end
        result['credit_start'] = self.credit_start
        result['quota_no'] = self.quota_no
        result['remaining_quota'] = self.remaining_quota
        result['remark'] = self.remark
        result['status'] = self.status
        result['total_quota'] = self.total_quota
        result['update_time'] = self.update_time
        result['total_pledge_quota'] = self.total_pledge_quota
        result['remain_pledge_quota'] = self.remain_pledge_quota
        return result

    def from_map(self, map={}):
        self.cert_no = map.get('cert_no')
        self.cert_type = map.get('cert_type')
        self.credit_end = map.get('credit_end')
        self.credit_start = map.get('credit_start')
        self.quota_no = map.get('quota_no')
        self.remaining_quota = map.get('remaining_quota')
        self.remark = map.get('remark')
        self.status = map.get('status')
        self.total_quota = map.get('total_quota')
        self.update_time = map.get('update_time')
        self.total_pledge_quota = map.get('total_pledge_quota')
        self.remain_pledge_quota = map.get('remain_pledge_quota')
        return self


class PayTariffInvoiceParam(TeaModel):
    def __init__(self, action=None, invoice_amount=None, pay_tariff_amount=None, pay_tariff_code=None,
                 pay_tariff_invoice_code=None):
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 发票金额 业务必填
        self.invoice_amount = invoice_amount  # type: str
        # 资费项金额 业务必填
        self.pay_tariff_amount = pay_tariff_amount  # type: str
        # 资费单据编号 业务必填
        self.pay_tariff_code = pay_tariff_code  # type: str
        # 资费项发票code
        self.pay_tariff_invoice_code = pay_tariff_invoice_code  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['action'] = self.action
        result['invoice_amount'] = self.invoice_amount
        result['pay_tariff_amount'] = self.pay_tariff_amount
        result['pay_tariff_code'] = self.pay_tariff_code
        result['pay_tariff_invoice_code'] = self.pay_tariff_invoice_code
        return result

    def from_map(self, map={}):
        self.action = map.get('action')
        self.invoice_amount = map.get('invoice_amount')
        self.pay_tariff_amount = map.get('pay_tariff_amount')
        self.pay_tariff_code = map.get('pay_tariff_code')
        self.pay_tariff_invoice_code = map.get('pay_tariff_invoice_code')
        return self


class PayBillInvoiceParam(TeaModel):
    def __init__(self, pay_bill_invoice_code=None, pay_bill_order_code=None, pay_bill_amount=None,
                 invoice_amount=None, action=None):
        # 账单发票code
        self.pay_bill_invoice_code = pay_bill_invoice_code  # type: str
        # 账单编号
        self.pay_bill_order_code = pay_bill_order_code  # type: str
        # 账单金额
        self.pay_bill_amount = pay_bill_amount  # type: str
        # 发票金额
        self.invoice_amount = invoice_amount  # type: str
        # 操作动作
        self.action = action            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['pay_bill_invoice_code'] = self.pay_bill_invoice_code
        result['pay_bill_order_code'] = self.pay_bill_order_code
        result['pay_bill_amount'] = self.pay_bill_amount
        result['invoice_amount'] = self.invoice_amount
        result['action'] = self.action
        return result

    def from_map(self, map={}):
        self.pay_bill_invoice_code = map.get('pay_bill_invoice_code')
        self.pay_bill_order_code = map.get('pay_bill_order_code')
        self.pay_bill_amount = map.get('pay_bill_amount')
        self.invoice_amount = map.get('invoice_amount')
        self.action = map.get('action')
        return self


class InsureBaseInfo(TeaModel):
    def __init__(self, tbr_name=None, tbr_id_no=None, tbr_id_type=None, tbr_tel=None, tbr_addr=None, tbr_email=None,
                 bbr_name=None, bbr_id_type=None, bbr_id_no=None, bbr_tel=None, bbr_addr=None, pre_mium=None, eff_date=None,
                 term_date=None, idenrify_period_start=None, identify_period_end=None):
        # 投保人姓名
        self.tbr_name = tbr_name        # type: str
        # 投保人证件号
        self.tbr_id_no = tbr_id_no      # type: str
        # 投保人证件类型
        self.tbr_id_type = tbr_id_type  # type: str
        # 投保人联系电话
        self.tbr_tel = tbr_tel          # type: str
        # 投保人地址
        self.tbr_addr = tbr_addr        # type: str
        # 投保人邮箱
        self.tbr_email = tbr_email      # type: str
        # 被保险人姓名
        self.bbr_name = bbr_name        # type: str
        # 被保险人证件类型
        self.bbr_id_type = bbr_id_type  # type: str
        # 被保险人证件号码
        self.bbr_id_no = bbr_id_no      # type: str
        # 被保险人联系电话
        self.bbr_tel = bbr_tel          # type: str
        # 被保险人地址
        self.bbr_addr = bbr_addr        # type: str
        # 含税保费(元)，小数点两位
        self.pre_mium = pre_mium        # type: str
        # 保险起期
        self.eff_date = eff_date        # type: str
        # 保险止期
        self.term_date = term_date      # type: str
        # 投保人证件类型有效起期
        self.idenrify_period_start = idenrify_period_start  # type: str
        # 投保人证件类型有效止期
        self.identify_period_end = identify_period_end  # type: str

    def validate(self):
        if self.eff_date is not None:
            self.validate_pattern(self.eff_date, 'eff_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.term_date is not None:
            self.validate_pattern(self.term_date, 'term_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.idenrify_period_start is not None:
            self.validate_pattern(self.idenrify_period_start, 'idenrify_period_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.identify_period_end is not None:
            self.validate_pattern(self.identify_period_end, 'identify_period_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['tbr_name'] = self.tbr_name
        result['tbr_id_no'] = self.tbr_id_no
        result['tbr_id_type'] = self.tbr_id_type
        result['tbr_tel'] = self.tbr_tel
        result['tbr_addr'] = self.tbr_addr
        result['tbr_email'] = self.tbr_email
        result['bbr_name'] = self.bbr_name
        result['bbr_id_type'] = self.bbr_id_type
        result['bbr_id_no'] = self.bbr_id_no
        result['bbr_tel'] = self.bbr_tel
        result['bbr_addr'] = self.bbr_addr
        result['pre_mium'] = self.pre_mium
        result['eff_date'] = self.eff_date
        result['term_date'] = self.term_date
        result['idenrify_period_start'] = self.idenrify_period_start
        result['identify_period_end'] = self.identify_period_end
        return result

    def from_map(self, map={}):
        self.tbr_name = map.get('tbr_name')
        self.tbr_id_no = map.get('tbr_id_no')
        self.tbr_id_type = map.get('tbr_id_type')
        self.tbr_tel = map.get('tbr_tel')
        self.tbr_addr = map.get('tbr_addr')
        self.tbr_email = map.get('tbr_email')
        self.bbr_name = map.get('bbr_name')
        self.bbr_id_type = map.get('bbr_id_type')
        self.bbr_id_no = map.get('bbr_id_no')
        self.bbr_tel = map.get('bbr_tel')
        self.bbr_addr = map.get('bbr_addr')
        self.pre_mium = map.get('pre_mium')
        self.eff_date = map.get('eff_date')
        self.term_date = map.get('term_date')
        self.idenrify_period_start = map.get('idenrify_period_start')
        self.identify_period_end = map.get('identify_period_end')
        return self


class ScpTicketIssueData(TeaModel):
    def __init__(self, did=None, issue_id=None):
        # 凭证对应的司机/货主的did
        self.did = did                  # type: str
        # 
        # 凭证id
        self.issue_id = issue_id        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['did'] = self.did
        result['issue_id'] = self.issue_id
        return result

    def from_map(self, map={}):
        self.did = map.get('did')
        self.issue_id = map.get('issue_id')
        return self


class HouseBlGoodsParam(TeaModel):
    def __init__(self, cargo_ready_date=None, dg_page_no=None, dg_type=None, flash_point=None, goods=None,
                 goods_cn=None, goods_type=None, hs_codes=None, marks=None, number=None, package_type=None, real_number=None,
                 real_volume=None, real_weight=None, un_no=None, volume=None, weight=None):
        # 预计备货时间
        self.cargo_ready_date = cargo_ready_date  # type: int
        # 危险品页号
        self.dg_page_no = dg_page_no    # type: str
        # 危险品级别
        self.dg_type = dg_type          # type: str
        # 危险品闪点
        self.flash_point = flash_point  # type: str
        # 货物名称 业务必填
        self.goods = goods              # type: str
        # 货物中文名
        self.goods_cn = goods_cn        # type: str
        # 货物类型 业务必填
        self.goods_type = goods_type    # type: str
        # HS CODE
        self.hs_codes = hs_codes        # type: List[str]
        # 唛头
        self.marks = marks              # type: str
        # 件数 业务必填
        self.number = number            # type: str
        # 包装类型
        self.package_type = package_type  # type: str
        # 实际件数
        self.real_number = real_number  # type: str
        # 实际体积
        self.real_volume = real_volume  # type: str
        # 实际重量
        self.real_weight = real_weight  # type: str
        # 危险品联合国编号
        self.un_no = un_no              # type: str
        # 委托体积 业务必填
        self.volume = volume            # type: str
        # 委托重量 业务必填
        self.weight = weight            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cargo_ready_date'] = self.cargo_ready_date
        result['dg_page_no'] = self.dg_page_no
        result['dg_type'] = self.dg_type
        result['flash_point'] = self.flash_point
        result['goods'] = self.goods
        result['goods_cn'] = self.goods_cn
        result['goods_type'] = self.goods_type
        result['hs_codes'] = self.hs_codes
        result['marks'] = self.marks
        result['number'] = self.number
        result['package_type'] = self.package_type
        result['real_number'] = self.real_number
        result['real_volume'] = self.real_volume
        result['real_weight'] = self.real_weight
        result['un_no'] = self.un_no
        result['volume'] = self.volume
        result['weight'] = self.weight
        return result

    def from_map(self, map={}):
        self.cargo_ready_date = map.get('cargo_ready_date')
        self.dg_page_no = map.get('dg_page_no')
        self.dg_type = map.get('dg_type')
        self.flash_point = map.get('flash_point')
        self.goods = map.get('goods')
        self.goods_cn = map.get('goods_cn')
        self.goods_type = map.get('goods_type')
        self.hs_codes = map.get('hs_codes')
        self.marks = map.get('marks')
        self.number = map.get('number')
        self.package_type = map.get('package_type')
        self.real_number = map.get('real_number')
        self.real_volume = map.get('real_volume')
        self.real_weight = map.get('real_weight')
        self.un_no = map.get('un_no')
        self.volume = map.get('volume')
        self.weight = map.get('weight')
        return self


class UploadOrderAmount(TeaModel):
    def __init__(self, currency=None, total_amount=None):
        # 币种
        self.currency = currency        # type: str
        # 总金额
        self.total_amount = total_amount  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['currency'] = self.currency
        result['total_amount'] = self.total_amount
        return result

    def from_map(self, map={}):
        self.currency = map.get('currency')
        self.total_amount = map.get('total_amount')
        return self


class EblDetail(TeaModel):
    def __init__(self, ebl_copy_pdf_file_hash=None, ebl_copy_pdf_file_id=None, ebl_no=None):
        # 电子提单copy文件hash
        self.ebl_copy_pdf_file_hash = ebl_copy_pdf_file_hash  # type: str
        # 电子提单copy文件id
        self.ebl_copy_pdf_file_id = ebl_copy_pdf_file_id  # type: str
        # 电子提单编号
        self.ebl_no = ebl_no            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['ebl_copy_pdf_file_hash'] = self.ebl_copy_pdf_file_hash
        result['ebl_copy_pdf_file_id'] = self.ebl_copy_pdf_file_id
        result['ebl_no'] = self.ebl_no
        return result

    def from_map(self, map={}):
        self.ebl_copy_pdf_file_hash = map.get('ebl_copy_pdf_file_hash')
        self.ebl_copy_pdf_file_id = map.get('ebl_copy_pdf_file_id')
        self.ebl_no = map.get('ebl_no')
        return self


class MasterBlGoodsParam(TeaModel):
    def __init__(self, cargo_ready_date=None, dg_page_no=None, dg_type=None, flash_point=None, goods=None,
                 goods_cn=None, goods_type=None, gross_weight=None, hs_codes=None, marks=None, number=None, package_type=None,
                 real_number=None, real_volume=None, real_weight=None, un_no=None, volume=None, weight=None):
        # 预计备货时间
        self.cargo_ready_date = cargo_ready_date  # type: int
        # 危险品页号
        self.dg_page_no = dg_page_no    # type: str
        # 危险品级别
        self.dg_type = dg_type          # type: str
        # 危险品闪点
        self.flash_point = flash_point  # type: str
        # 货物名称 业务必填
        self.goods = goods              # type: str
        # 货物中文名
        self.goods_cn = goods_cn        # type: str
        # 货物类型 业务必填
        self.goods_type = goods_type    # type: str
        # 毛重 业务必填
        self.gross_weight = gross_weight  # type: str
        # HS CODE
        self.hs_codes = hs_codes        # type: List[str]
        # 唛头
        self.marks = marks              # type: str
        # 件数 业务必填
        self.number = number            # type: str
        # 包装类型
        self.package_type = package_type  # type: str
        # 实际件数
        self.real_number = real_number  # type: str
        # 实际体积
        self.real_volume = real_volume  # type: str
        # 实际重量
        self.real_weight = real_weight  # type: str
        # 危险品联合国编号
        self.un_no = un_no              # type: str
        # 委托体积 业务必填
        self.volume = volume            # type: str
        # 委托重量 业务必填
        self.weight = weight            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cargo_ready_date'] = self.cargo_ready_date
        result['dg_page_no'] = self.dg_page_no
        result['dg_type'] = self.dg_type
        result['flash_point'] = self.flash_point
        result['goods'] = self.goods
        result['goods_cn'] = self.goods_cn
        result['goods_type'] = self.goods_type
        result['gross_weight'] = self.gross_weight
        result['hs_codes'] = self.hs_codes
        result['marks'] = self.marks
        result['number'] = self.number
        result['package_type'] = self.package_type
        result['real_number'] = self.real_number
        result['real_volume'] = self.real_volume
        result['real_weight'] = self.real_weight
        result['un_no'] = self.un_no
        result['volume'] = self.volume
        result['weight'] = self.weight
        return result

    def from_map(self, map={}):
        self.cargo_ready_date = map.get('cargo_ready_date')
        self.dg_page_no = map.get('dg_page_no')
        self.dg_type = map.get('dg_type')
        self.flash_point = map.get('flash_point')
        self.goods = map.get('goods')
        self.goods_cn = map.get('goods_cn')
        self.goods_type = map.get('goods_type')
        self.gross_weight = map.get('gross_weight')
        self.hs_codes = map.get('hs_codes')
        self.marks = map.get('marks')
        self.number = map.get('number')
        self.package_type = map.get('package_type')
        self.real_number = map.get('real_number')
        self.real_volume = map.get('real_volume')
        self.real_weight = map.get('real_weight')
        self.un_no = map.get('un_no')
        self.volume = map.get('volume')
        self.weight = map.get('weight')
        return self


class IssueApplyInfoPlus(TeaModel):
    def __init__(self, booking_no=None, carrier_did=None, container_no=None, expire_date=None, issue_amt=None,
                 out_biz_no=None, out_order_no=None, waybill_id=None):
        # 订单中的BookingNo，以英文逗号分割
        self.booking_no = booking_no    # type: str
        # 船公司did
        self.carrier_did = carrier_did  # type: str
        # BookingNo中的箱号，以英文逗号分割
        self.container_no = container_no  # type: str
        # 到期时间戳
        self.expire_date = expire_date  # type: str
        # 发行金额，精确到小数点后2位
        self.issue_amt = issue_amt      # type: str
        # 全局唯一业务号
        self.out_biz_no = out_biz_no    # type: str
        # 支付单号
        self.out_order_no = out_order_no  # type: str
        # 运单订单id
        self.waybill_id = waybill_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['booking_no'] = self.booking_no
        result['carrier_did'] = self.carrier_did
        result['container_no'] = self.container_no
        result['expire_date'] = self.expire_date
        result['issue_amt'] = self.issue_amt
        result['out_biz_no'] = self.out_biz_no
        result['out_order_no'] = self.out_order_no
        result['waybill_id'] = self.waybill_id
        return result

    def from_map(self, map={}):
        self.booking_no = map.get('booking_no')
        self.carrier_did = map.get('carrier_did')
        self.container_no = map.get('container_no')
        self.expire_date = map.get('expire_date')
        self.issue_amt = map.get('issue_amt')
        self.out_biz_no = map.get('out_biz_no')
        self.out_order_no = map.get('out_order_no')
        self.waybill_id = map.get('waybill_id')
        return self


class UploadFinancingParam(TeaModel):
    def __init__(self, booking_count=None, code=None, end_date=None, forwarder_did=None, start_date=None, teu=None,
                 amounts=None):
        # 订舱单量（票）
        self.booking_count = booking_count  # type: int
        # 唯一标识
        self.code = code                # type: str
        # 结束日期
        self.end_date = end_date        # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 开始日期
        self.start_date = start_date    # type: str
        # 箱量【数量，不区分箱型，20GP是1TEU，40GP是2TEU】
        self.teu = teu                  # type: int
        # 运输总额
        self.amounts = amounts          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['booking_count'] = self.booking_count
        result['code'] = self.code
        result['end_date'] = self.end_date
        result['forwarder_did'] = self.forwarder_did
        result['start_date'] = self.start_date
        result['teu'] = self.teu
        result['amounts'] = self.amounts
        return result

    def from_map(self, map={}):
        self.booking_count = map.get('booking_count')
        self.code = map.get('code')
        self.end_date = map.get('end_date')
        self.forwarder_did = map.get('forwarder_did')
        self.start_date = map.get('start_date')
        self.teu = map.get('teu')
        self.amounts = map.get('amounts')
        return self


class TxDto(TeaModel):
    def __init__(self, tx_code=None, data_type=None):
        # 链上凭证
        self.tx_code = tx_code          # type: str
        # 链上存储结构对应类型
        self.data_type = data_type      # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['tx_code'] = self.tx_code
        result['data_type'] = self.data_type
        return result

    def from_map(self, map={}):
        self.tx_code = map.get('tx_code')
        self.data_type = map.get('data_type')
        return self


class UserIssueId(TeaModel):
    def __init__(self, issue_id=None, balance_amt=None):
        # 凭证id
        self.issue_id = issue_id        # type: str
        # 凭证余额
        self.balance_amt = balance_amt  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['issue_id'] = self.issue_id
        result['balance_amt'] = self.balance_amt
        return result

    def from_map(self, map={}):
        self.issue_id = map.get('issue_id')
        self.balance_amt = map.get('balance_amt')
        return self


class EblStatusDeatil(TeaModel):
    def __init__(self, current_ebl_status=None, ebl_no=None, next_ebl_status=None):
        # 当前提单状态
        self.current_ebl_status = current_ebl_status  # type: str
        # 电子提单编号
        self.ebl_no = ebl_no            # type: str
        # 下一个提单状态
        self.next_ebl_status = next_ebl_status  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['current_ebl_status'] = self.current_ebl_status
        result['ebl_no'] = self.ebl_no
        result['next_ebl_status'] = self.next_ebl_status
        return result

    def from_map(self, map={}):
        self.current_ebl_status = map.get('current_ebl_status')
        self.ebl_no = map.get('ebl_no')
        self.next_ebl_status = map.get('next_ebl_status')
        return self


class CreateDigitalLogisticPlatformDidRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, ep_cert_name=None,
                 ep_cert_no=None, legal_person_cert_name=None, legal_person_cert_no=None, extension_info=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 企业名称
        self.ep_cert_name = ep_cert_name  # type: str
        # 企业信用号码
        self.ep_cert_no = ep_cert_no    # type: str
        # 企业法人姓名
        self.legal_person_cert_name = legal_person_cert_name  # type: str
        # 企业法人身份证号码
        self.legal_person_cert_no = legal_person_cert_no  # type: str
        # 扩展字段
        self.extension_info = extension_info  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        result['extension_info'] = self.extension_info
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        self.extension_info = map.get('extension_info')
        return self


class CreateDigitalLogisticPlatformDidResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 无车承运平台DIS
        self.did = did                  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        return self


class CreateDigitalLogisticAgentDidRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, agent_did=None,
                 ep_cert_name=None, ep_cert_no=None, extension_info=None, legal_person_cert_name=None,
                 legal_person_cert_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 创建did的代理did
        self.agent_did = agent_did      # type: str
        # 企业名称
        self.ep_cert_name = ep_cert_name  # type: str
        # 企业信用号码
        self.ep_cert_no = ep_cert_no    # type: str
        # 扩展字段
        self.extension_info = extension_info  # type: str
        # 企业法人姓名
        self.legal_person_cert_name = legal_person_cert_name  # type: str
        # 企业法人身份证号码
        self.legal_person_cert_no = legal_person_cert_no  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['agent_did'] = self.agent_did
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['extension_info'] = self.extension_info
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.agent_did = map.get('agent_did')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.extension_info = map.get('extension_info')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        return self


class CreateDigitalLogisticAgentDidResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 无车承运平台did
        self.did = did                  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        return self


class CreateDigitalLogisticConsignorDisRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, ep_cert_name=None,
                 ep_cert_no=None, extension_info=None, legal_person_cert_name=None, legal_person_cert_no=None,
                 platform_did=None, check_all=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 企业名称
        self.ep_cert_name = ep_cert_name  # type: str
        # 企业信用号码
        self.ep_cert_no = ep_cert_no    # type: str
        # 扩展字段
        self.extension_info = extension_info  # type: str
        # 企业法人姓名
        self.legal_person_cert_name = legal_person_cert_name  # type: str
        # 企业法人身份证号码
        self.legal_person_cert_no = legal_person_cert_no  # type: str
        # 所属承运平台did
        self.platform_did = platform_did  # type: str
        # 是否核验货主四要素，如果为true  法人姓名和法人身份证号为必填
        self.check_all = check_all      # type: bool

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['extension_info'] = self.extension_info
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        result['platform_did'] = self.platform_did
        result['check_all'] = self.check_all
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.extension_info = map.get('extension_info')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        self.platform_did = map.get('platform_did')
        self.check_all = map.get('check_all')
        return self


class CreateDigitalLogisticConsignorDisResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 货主did信息
        self.did = did                  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        return self


class CreateDigitalLogisticDriverDisRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_no=None,
                 extension_info=None, mobile=None, name=None, platform_did=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 司机身份证号码
        self.cert_no = cert_no          # type: str
        # 扩展字段
        self.extension_info = extension_info  # type: str
        # 司机手机号码
        self.mobile = mobile            # type: str
        # 司机姓名
        self.name = name                # type: str
        # 所属承运平台did
        self.platform_did = platform_did  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_no'] = self.cert_no
        result['extension_info'] = self.extension_info
        result['mobile'] = self.mobile
        result['name'] = self.name
        result['platform_did'] = self.platform_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_no = map.get('cert_no')
        self.extension_info = map.get('extension_info')
        self.mobile = map.get('mobile')
        self.name = map.get('name')
        self.platform_did = map.get('platform_did')
        return self


class CreateDigitalLogisticDriverDisResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 司机did
        self.did = did                  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        return self


class CreateDigitalLogisticCargoOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, all_freight=None,
                 cargo_business_code=None, cargo_code=None, cargo_insurance_money=None, cargo_name=None, cargo_order=None,
                 cargo_type=None, cargo_unit=None, cargo_volume=None, consignor_did=None, delivery_place=None,
                 loading_place=None, platform_did=None, start_time=None, user_phone=None, weight=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 运费
        self.all_freight = all_freight  # type: str
        # 货物行业编码
        self.cargo_business_code = cargo_business_code  # type: str
        # 货物商品编码
        self.cargo_code = cargo_code    # type: str
        # 货运险金额
        self.cargo_insurance_money = cargo_insurance_money  # type: str
        # 货物名称
        self.cargo_name = cargo_name    # type: str
        # 货源单号
        self.cargo_order = cargo_order  # type: str
        # 货物类型
        self.cargo_type = cargo_type    # type: str
        # 货物单位
        self.cargo_unit = cargo_unit    # type: str
        # 货物体积，单位（方）
        self.cargo_volume = cargo_volume  # type: str
        # 货主did
        self.consignor_did = consignor_did  # type: str
        # 卸货地，XX省-XX市-XX区
        self.delivery_place = delivery_place  # type: str
        # 装货地，XX省-XX市-XX区
        self.loading_place = loading_place  # type: str
        # 所属承运平台did
        self.platform_did = platform_did  # type: str
        # 货源单创建时间
        self.start_time = start_time    # type: int
        # 联系人电话
        self.user_phone = user_phone    # type: str
        # 货物重量，单位（吨）
        self.weight = weight            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['all_freight'] = self.all_freight
        result['cargo_business_code'] = self.cargo_business_code
        result['cargo_code'] = self.cargo_code
        result['cargo_insurance_money'] = self.cargo_insurance_money
        result['cargo_name'] = self.cargo_name
        result['cargo_order'] = self.cargo_order
        result['cargo_type'] = self.cargo_type
        result['cargo_unit'] = self.cargo_unit
        result['cargo_volume'] = self.cargo_volume
        result['consignor_did'] = self.consignor_did
        result['delivery_place'] = self.delivery_place
        result['loading_place'] = self.loading_place
        result['platform_did'] = self.platform_did
        result['start_time'] = self.start_time
        result['user_phone'] = self.user_phone
        result['weight'] = self.weight
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.all_freight = map.get('all_freight')
        self.cargo_business_code = map.get('cargo_business_code')
        self.cargo_code = map.get('cargo_code')
        self.cargo_insurance_money = map.get('cargo_insurance_money')
        self.cargo_name = map.get('cargo_name')
        self.cargo_order = map.get('cargo_order')
        self.cargo_type = map.get('cargo_type')
        self.cargo_unit = map.get('cargo_unit')
        self.cargo_volume = map.get('cargo_volume')
        self.consignor_did = map.get('consignor_did')
        self.delivery_place = map.get('delivery_place')
        self.loading_place = map.get('loading_place')
        self.platform_did = map.get('platform_did')
        self.start_time = map.get('start_time')
        self.user_phone = map.get('user_phone')
        self.weight = map.get('weight')
        return self


class CreateDigitalLogisticCargoOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 货源链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CreateDigitalLogisticCargoPayRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bank_account_of_payee=None,
                 bank_account_of_payer=None, bank_no=None, bank_of_payee=None, bank_of_payer=None, cargo_order=None, check_channel=None,
                 currency=None, expense_type=None, payee=None, payer=None, payment=None, pay_check=None, pay_did=None,
                 pay_id=None, pay_note=None, pay_time=None, pay_type=None, recv_did=None, tax_waybill_ids=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 收款方银行账号
        self.bank_account_of_payee = bank_account_of_payee  # type: str
        # 付款方银行账号,货主付款的开户银行账号
        self.bank_account_of_payer = bank_account_of_payer  # type: str
        # 银行流水号
        self.bank_no = bank_no          # type: str
        # 收款方开户行（平台收款）
        # 取值：
        # MYBank_CloudCapital_2,  ## 云资金2.0
        self.bank_of_payee = bank_of_payee  # type: str
        # MYBank_CloudCapital_2,  ## 云资金2.0
        self.bank_of_payer = bank_of_payer  # type: str
        # 货源单号
        self.cargo_order = cargo_order  # type: str
        # 核验渠道，请按取值约束值填入。
        # 
        # YBank_CloudCapital_2,  ## 云资金2.0
        self.check_channel = check_channel  # type: str
        # CNY、USD
        # 币种
        self.currency = currency        # type: str
        # 费用类型 (运费、调度费、服务费)
        self.expense_type = expense_type  # type: str
        # 收款方名称
        self.payee = payee              # type: str
        # 付款方名称
        self.payer = payer              # type: str
        # 费用金额
        self.payment = payment          # type: str
        # 是否核验
        self.pay_check = pay_check      # type: bool
        # 付款方did
        self.pay_did = pay_did          # type: str
        # 平台支付单号
        self.pay_id = pay_id            # type: str
        # 支付备注
        self.pay_note = pay_note        # type: str
        # 支付时间
        self.pay_time = pay_time        # type: int
        # 支付类型
        self.pay_type = pay_type        # type: str
        # 收款方did
        self.recv_did = recv_did        # type: str
        # 支持关联单个运单和多个运单
        self.tax_waybill_ids = tax_waybill_ids  # type: List[str]

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bank_account_of_payee'] = self.bank_account_of_payee
        result['bank_account_of_payer'] = self.bank_account_of_payer
        result['bank_no'] = self.bank_no
        result['bank_of_payee'] = self.bank_of_payee
        result['bank_of_payer'] = self.bank_of_payer
        result['cargo_order'] = self.cargo_order
        result['check_channel'] = self.check_channel
        result['currency'] = self.currency
        result['expense_type'] = self.expense_type
        result['payee'] = self.payee
        result['payer'] = self.payer
        result['payment'] = self.payment
        result['pay_check'] = self.pay_check
        result['pay_did'] = self.pay_did
        result['pay_id'] = self.pay_id
        result['pay_note'] = self.pay_note
        result['pay_time'] = self.pay_time
        result['pay_type'] = self.pay_type
        result['recv_did'] = self.recv_did
        result['tax_waybill_ids'] = self.tax_waybill_ids
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bank_account_of_payee = map.get('bank_account_of_payee')
        self.bank_account_of_payer = map.get('bank_account_of_payer')
        self.bank_no = map.get('bank_no')
        self.bank_of_payee = map.get('bank_of_payee')
        self.bank_of_payer = map.get('bank_of_payer')
        self.cargo_order = map.get('cargo_order')
        self.check_channel = map.get('check_channel')
        self.currency = map.get('currency')
        self.expense_type = map.get('expense_type')
        self.payee = map.get('payee')
        self.payer = map.get('payer')
        self.payment = map.get('payment')
        self.pay_check = map.get('pay_check')
        self.pay_did = map.get('pay_did')
        self.pay_id = map.get('pay_id')
        self.pay_note = map.get('pay_note')
        self.pay_time = map.get('pay_time')
        self.pay_type = map.get('pay_type')
        self.recv_did = map.get('recv_did')
        self.tax_waybill_ids = map.get('tax_waybill_ids')
        return self


class CreateDigitalLogisticCargoPayResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 货源支付链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CreateDigitalLogisticWaybillOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None,
                 all_freight=None, back_fee=None, business_type=None, cargo_business_code=None, cargo_code=None,
                 cargo_insurance_money=None, cargo_order=None, cargo_orders=None, cargo_unit=None, cargo_volume=None, cargo_weight=None,
                 cart_badge_color=None, cart_badge_no=None, car_captain_did=None, consignor_freight_amount=None, created_time=None,
                 dest_doors_end_time=None, doors_city_code=None, doors_city_name=None, doors_county_code=None, doors_county_name=None,
                 doors_division_code=None, doors_province_code=None, doors_province_name=None, drawee=None, drawee_tax_no=None,
                 driver_did=None, driver_name=None, end_address=None, end_city_code=None, end_city_name=None,
                 end_county_code=None, end_county_name=None, end_division_code=None, end_province_code=None,
                 end_province_name=None, end_street_code=None, end_street_name=None, freight_incr=None, goods_amount=None,
                 goods_amount_type=None, goods_name=None, id_card=None, loss_fee=None, mobile_no=None, partner_id=None,
                 platform_did=None, prepayments=None, prepayments_buy_etc=None, prepayments_buy_gas=None,
                 prepayments_buy_oil=None, prepayments_etccard=None, prepayments_oilcard=None, present_amount_oil=None,
                 start_address=None, start_city_code=None, start_city_name=None, start_county_code=None, start_county_name=None,
                 start_division_code=None, start_province_code=None, start_province_name=None, start_street_code=None,
                 start_street_name=None, start_time=None, tax_waybill_id=None, truck_length=None, truck_type=None, unit_price=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 用户链上账户 与司机did 二选一填写
        self.account_id = account_id    # type: str
        # 运费，单位（元），平台支付给司机的运费金额
        self.all_freight = all_freight  # type: str
        # 回单押金
        self.back_fee = back_fee        # type: str
        # 业务类型
        self.business_type = business_type  # type: str
        # 货物行业编码
        self.cargo_business_code = cargo_business_code  # type: str
        # 货物商品编码
        self.cargo_code = cargo_code    # type: str
        # 货运险金额
        self.cargo_insurance_money = cargo_insurance_money  # type: str
        # 货源单号，关联货主订单
        self.cargo_order = cargo_order  # type: str
        # 货源单号数组
        self.cargo_orders = cargo_orders  # type: List[str]
        # 货物单位
        self.cargo_unit = cargo_unit    # type: str
        # 货物体积，单位（方）
        self.cargo_volume = cargo_volume  # type: str
        # 货物重量，单位（吨）
        self.cargo_weight = cargo_weight  # type: str
        # 车牌颜色，黄色、蓝色、绿色
        self.cart_badge_color = cart_badge_color  # type: str
        # 车牌号
        # 
        self.cart_badge_no = cart_badge_no  # type: str
        # 承运商did
        self.car_captain_did = car_captain_did  # type: str
        # 货主运费金额，单位（元），货主支付给平台的运费金额
        self.consignor_freight_amount = consignor_freight_amount  # type: str
        # 建单时间，13位毫秒级时间戳
        # 
        self.created_time = created_time  # type: int
        # 到达门点时间，13位毫秒级时间戳
        self.dest_doors_end_time = dest_doors_end_time  # type: int
        # 门点城市CODE，6位区域行政编码
        self.doors_city_code = doors_city_code  # type: str
        # 门点城市名称
        self.doors_city_name = doors_city_name  # type: str
        # 门点区县CODE，6位区域行政编码
        self.doors_county_code = doors_county_code  # type: str
        # 门点区县名称
        self.doors_county_name = doors_county_name  # type: str
        # 门点行政区划代码
        self.doors_division_code = doors_division_code  # type: str
        # 门点省份CODE，6位区域行政编码
        self.doors_province_code = doors_province_code  # type: str
        # 门点省份名称
        self.doors_province_name = doors_province_name  # type: str
        # 发货方名称
        # 
        self.drawee = drawee            # type: str
        # 发货方纳税人识别号
        # 
        self.drawee_tax_no = drawee_tax_no  # type: str
        # 司机分布式身份
        self.driver_did = driver_did    # type: str
        # 司机姓名 已填司机分布式身份的情况下可不填
        # 
        self.driver_name = driver_name  # type: str
        # 目的地详细地址
        self.end_address = end_address  # type: str
        # 目的地城市CODE，6位区域行政编码
        # 
        self.end_city_code = end_city_code  # type: str
        # 目的地城市名称
        # 
        self.end_city_name = end_city_name  # type: str
        # 目的地区县CODE，6位区域行政编码
        self.end_county_code = end_county_code  # type: str
        # 目的地区县名称
        # 
        self.end_county_name = end_county_name  # type: str
        # 结束行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        # 
        self.end_division_code = end_division_code  # type: str
        # 目的地省份CODE，6位区域行政编码
        # 
        self.end_province_code = end_province_code  # type: str
        # 目的地省份名称
        # 
        self.end_province_name = end_province_name  # type: str
        # 目的地街道CODE，12区域行政编码
        self.end_street_code = end_street_code  # type: str
        # 目的地街道名称
        self.end_street_name = end_street_name  # type: str
        # 运费增项
        # 
        self.freight_incr = freight_incr  # type: str
        # 货物数量
        # 
        self.goods_amount = goods_amount  # type: int
        # 货物数量单位类型
        # 
        self.goods_amount_type = goods_amount_type  # type: str
        # 货物名称
        # 
        self.goods_name = goods_name    # type: str
        # 司机身份证号 已填司机分布式身份的情况下可不填
        self.id_card = id_card          # type: str
        # 运费扣减
        # 
        self.loss_fee = loss_fee        # type: str
        # 司机手机号 已填司机分布式身份的情况下可不填
        # 
        self.mobile_no = mobile_no      # type: str
        # 系统识别id 网商识别号
        # 
        self.partner_id = partner_id    # type: str
        # 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        # 
        self.platform_did = platform_did  # type: str
        # 预付款金额
        # 
        self.prepayments = prepayments  # type: str
        # 线下预付ETC
        # 
        self.prepayments_buy_etc = prepayments_buy_etc  # type: str
        # 线下气款金额
        # 
        self.prepayments_buy_gas = prepayments_buy_gas  # type: str
        # 线下油款预付
        # 
        self.prepayments_buy_oil = prepayments_buy_oil  # type: str
        # 预付ETC卡金额
        # 
        self.prepayments_etccard = prepayments_etccard  # type: str
        # 预付油卡金额
        # 
        self.prepayments_oilcard = prepayments_oilcard  # type: str
        # 油卡赠送金额
        # 
        self.present_amount_oil = present_amount_oil  # type: str
        # 起始地详细地址
        self.start_address = start_address  # type: str
        # 起始地城市CODE，6位区域行政编码
        self.start_city_code = start_city_code  # type: str
        # 起始地城市名称
        # 
        self.start_city_name = start_city_name  # type: str
        # 起始地区县CODE，6位区域行政编码
        self.start_county_code = start_county_code  # type: str
        # 起始地区县名称
        # 
        self.start_county_name = start_county_name  # type: str
        # 起始行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        # 
        self.start_division_code = start_division_code  # type: str
        # 起始地省份CODE，6位区域行政编码
        self.start_province_code = start_province_code  # type: str
        # 起始地省份名称
        # 
        self.start_province_name = start_province_name  # type: str
        # 起始地街道CODE，12区域行政编码
        self.start_street_code = start_street_code  # type: str
        # 起始地街道名称
        self.start_street_name = start_street_name  # type: str
        # 起运时间戳，13位毫秒级时间戳
        self.start_time = start_time    # type: int
        # 运单id
        # 
        self.tax_waybill_id = tax_waybill_id  # type: str
        # 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
        self.truck_length = truck_length  # type: str
        # 可以填：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
        self.truck_type = truck_type    # type: str
        # 运输单价
        # 
        self.unit_price = unit_price    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['all_freight'] = self.all_freight
        result['back_fee'] = self.back_fee
        result['business_type'] = self.business_type
        result['cargo_business_code'] = self.cargo_business_code
        result['cargo_code'] = self.cargo_code
        result['cargo_insurance_money'] = self.cargo_insurance_money
        result['cargo_order'] = self.cargo_order
        result['cargo_orders'] = self.cargo_orders
        result['cargo_unit'] = self.cargo_unit
        result['cargo_volume'] = self.cargo_volume
        result['cargo_weight'] = self.cargo_weight
        result['cart_badge_color'] = self.cart_badge_color
        result['cart_badge_no'] = self.cart_badge_no
        result['car_captain_did'] = self.car_captain_did
        result['consignor_freight_amount'] = self.consignor_freight_amount
        result['created_time'] = self.created_time
        result['dest_doors_end_time'] = self.dest_doors_end_time
        result['doors_city_code'] = self.doors_city_code
        result['doors_city_name'] = self.doors_city_name
        result['doors_county_code'] = self.doors_county_code
        result['doors_county_name'] = self.doors_county_name
        result['doors_division_code'] = self.doors_division_code
        result['doors_province_code'] = self.doors_province_code
        result['doors_province_name'] = self.doors_province_name
        result['drawee'] = self.drawee
        result['drawee_tax_no'] = self.drawee_tax_no
        result['driver_did'] = self.driver_did
        result['driver_name'] = self.driver_name
        result['end_address'] = self.end_address
        result['end_city_code'] = self.end_city_code
        result['end_city_name'] = self.end_city_name
        result['end_county_code'] = self.end_county_code
        result['end_county_name'] = self.end_county_name
        result['end_division_code'] = self.end_division_code
        result['end_province_code'] = self.end_province_code
        result['end_province_name'] = self.end_province_name
        result['end_street_code'] = self.end_street_code
        result['end_street_name'] = self.end_street_name
        result['freight_incr'] = self.freight_incr
        result['goods_amount'] = self.goods_amount
        result['goods_amount_type'] = self.goods_amount_type
        result['goods_name'] = self.goods_name
        result['id_card'] = self.id_card
        result['loss_fee'] = self.loss_fee
        result['mobile_no'] = self.mobile_no
        result['partner_id'] = self.partner_id
        result['platform_did'] = self.platform_did
        result['prepayments'] = self.prepayments
        result['prepayments_buy_etc'] = self.prepayments_buy_etc
        result['prepayments_buy_gas'] = self.prepayments_buy_gas
        result['prepayments_buy_oil'] = self.prepayments_buy_oil
        result['prepayments_etccard'] = self.prepayments_etccard
        result['prepayments_oilcard'] = self.prepayments_oilcard
        result['present_amount_oil'] = self.present_amount_oil
        result['start_address'] = self.start_address
        result['start_city_code'] = self.start_city_code
        result['start_city_name'] = self.start_city_name
        result['start_county_code'] = self.start_county_code
        result['start_county_name'] = self.start_county_name
        result['start_division_code'] = self.start_division_code
        result['start_province_code'] = self.start_province_code
        result['start_province_name'] = self.start_province_name
        result['start_street_code'] = self.start_street_code
        result['start_street_name'] = self.start_street_name
        result['start_time'] = self.start_time
        result['tax_waybill_id'] = self.tax_waybill_id
        result['truck_length'] = self.truck_length
        result['truck_type'] = self.truck_type
        result['unit_price'] = self.unit_price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.all_freight = map.get('all_freight')
        self.back_fee = map.get('back_fee')
        self.business_type = map.get('business_type')
        self.cargo_business_code = map.get('cargo_business_code')
        self.cargo_code = map.get('cargo_code')
        self.cargo_insurance_money = map.get('cargo_insurance_money')
        self.cargo_order = map.get('cargo_order')
        self.cargo_orders = map.get('cargo_orders')
        self.cargo_unit = map.get('cargo_unit')
        self.cargo_volume = map.get('cargo_volume')
        self.cargo_weight = map.get('cargo_weight')
        self.cart_badge_color = map.get('cart_badge_color')
        self.cart_badge_no = map.get('cart_badge_no')
        self.car_captain_did = map.get('car_captain_did')
        self.consignor_freight_amount = map.get('consignor_freight_amount')
        self.created_time = map.get('created_time')
        self.dest_doors_end_time = map.get('dest_doors_end_time')
        self.doors_city_code = map.get('doors_city_code')
        self.doors_city_name = map.get('doors_city_name')
        self.doors_county_code = map.get('doors_county_code')
        self.doors_county_name = map.get('doors_county_name')
        self.doors_division_code = map.get('doors_division_code')
        self.doors_province_code = map.get('doors_province_code')
        self.doors_province_name = map.get('doors_province_name')
        self.drawee = map.get('drawee')
        self.drawee_tax_no = map.get('drawee_tax_no')
        self.driver_did = map.get('driver_did')
        self.driver_name = map.get('driver_name')
        self.end_address = map.get('end_address')
        self.end_city_code = map.get('end_city_code')
        self.end_city_name = map.get('end_city_name')
        self.end_county_code = map.get('end_county_code')
        self.end_county_name = map.get('end_county_name')
        self.end_division_code = map.get('end_division_code')
        self.end_province_code = map.get('end_province_code')
        self.end_province_name = map.get('end_province_name')
        self.end_street_code = map.get('end_street_code')
        self.end_street_name = map.get('end_street_name')
        self.freight_incr = map.get('freight_incr')
        self.goods_amount = map.get('goods_amount')
        self.goods_amount_type = map.get('goods_amount_type')
        self.goods_name = map.get('goods_name')
        self.id_card = map.get('id_card')
        self.loss_fee = map.get('loss_fee')
        self.mobile_no = map.get('mobile_no')
        self.partner_id = map.get('partner_id')
        self.platform_did = map.get('platform_did')
        self.prepayments = map.get('prepayments')
        self.prepayments_buy_etc = map.get('prepayments_buy_etc')
        self.prepayments_buy_gas = map.get('prepayments_buy_gas')
        self.prepayments_buy_oil = map.get('prepayments_buy_oil')
        self.prepayments_etccard = map.get('prepayments_etccard')
        self.prepayments_oilcard = map.get('prepayments_oilcard')
        self.present_amount_oil = map.get('present_amount_oil')
        self.start_address = map.get('start_address')
        self.start_city_code = map.get('start_city_code')
        self.start_city_name = map.get('start_city_name')
        self.start_county_code = map.get('start_county_code')
        self.start_county_name = map.get('start_county_name')
        self.start_division_code = map.get('start_division_code')
        self.start_province_code = map.get('start_province_code')
        self.start_province_name = map.get('start_province_name')
        self.start_street_code = map.get('start_street_code')
        self.start_street_name = map.get('start_street_name')
        self.start_time = map.get('start_time')
        self.tax_waybill_id = map.get('tax_waybill_id')
        self.truck_length = map.get('truck_length')
        self.truck_type = map.get('truck_type')
        self.unit_price = map.get('unit_price')
        return self


class CreateDigitalLogisticWaybillOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CreateDigitalLogisticWaybillPayRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, arrive_time=None, bank_sn=None,
                 pay_amount=None, pay_bank_card_no=None, pay_bank_name=None, pay_check=None, pay_did=None, pay_name=None,
                 pay_time=None, pay_type_new=None, pay_way=None, platform_did=None, pos_info_id=None, real_pay_bank=None,
                 real_pay_bank_card_no=None, real_pay_name=None, recv_bank_card_no=None, recv_bank_name=None, recv_did=None,
                 recv_name=None, waybill_id=None, check_channel=None, currency=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 确认到账时间
        # 
        self.arrive_time = arrive_time  # type: int
        # 关联银行流水号
        # 
        self.bank_sn = bank_sn          # type: str
        # 付款金额
        # 
        self.pay_amount = pay_amount    # type: str
        # 付款方银行账号
        # 
        self.pay_bank_card_no = pay_bank_card_no  # type: str
        # 付款方开户行
        # 
        self.pay_bank_name = pay_bank_name  # type: str
        # 是否核验
        self.pay_check = pay_check      # type: bool
        # 付款方did
        # 
        self.pay_did = pay_did          # type: str
        # 付款方名称
        # 
        self.pay_name = pay_name        # type: str
        # 付款时间戳
        # 
        self.pay_time = pay_time        # type: int
        # 支付类型
        # 
        self.pay_type_new = pay_type_new  # type: str
        # 支付方式
        # 
        self.pay_way = pay_way          # type: str
        # 无车承运平台分布式数字身份，缺省为自己的分布式数字身份
        # 
        self.platform_did = platform_did  # type: str
        # 支付订单ID
        # 
        self.pos_info_id = pos_info_id  # type: str
        # 实际付款方开户行
        # 
        self.real_pay_bank = real_pay_bank  # type: str
        # 实际付款方银行账号
        # 
        self.real_pay_bank_card_no = real_pay_bank_card_no  # type: str
        # 实际付款方名称
        # 
        self.real_pay_name = real_pay_name  # type: str
        # 收款方银行账号
        # 
        self.recv_bank_card_no = recv_bank_card_no  # type: str
        # 收款方开户行
        # 
        self.recv_bank_name = recv_bank_name  # type: str
        # 收款方did
        # 
        self.recv_did = recv_did        # type: str
        # 收款方名称
        # 
        self.recv_name = recv_name      # type: str
        # 关联的运单ID
        # 
        self.waybill_id = waybill_id    # type: str
        # MYBank_CloudCapital_1,  ## 云资金1.0
        # MYBank_CloudCapital_2,  ## 云资金2.0
        self.check_channel = check_channel  # type: str
        # CNY, USD
        self.currency = currency        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['arrive_time'] = self.arrive_time
        result['bank_sn'] = self.bank_sn
        result['pay_amount'] = self.pay_amount
        result['pay_bank_card_no'] = self.pay_bank_card_no
        result['pay_bank_name'] = self.pay_bank_name
        result['pay_check'] = self.pay_check
        result['pay_did'] = self.pay_did
        result['pay_name'] = self.pay_name
        result['pay_time'] = self.pay_time
        result['pay_type_new'] = self.pay_type_new
        result['pay_way'] = self.pay_way
        result['platform_did'] = self.platform_did
        result['pos_info_id'] = self.pos_info_id
        result['real_pay_bank'] = self.real_pay_bank
        result['real_pay_bank_card_no'] = self.real_pay_bank_card_no
        result['real_pay_name'] = self.real_pay_name
        result['recv_bank_card_no'] = self.recv_bank_card_no
        result['recv_bank_name'] = self.recv_bank_name
        result['recv_did'] = self.recv_did
        result['recv_name'] = self.recv_name
        result['waybill_id'] = self.waybill_id
        result['check_channel'] = self.check_channel
        result['currency'] = self.currency
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.arrive_time = map.get('arrive_time')
        self.bank_sn = map.get('bank_sn')
        self.pay_amount = map.get('pay_amount')
        self.pay_bank_card_no = map.get('pay_bank_card_no')
        self.pay_bank_name = map.get('pay_bank_name')
        self.pay_check = map.get('pay_check')
        self.pay_did = map.get('pay_did')
        self.pay_name = map.get('pay_name')
        self.pay_time = map.get('pay_time')
        self.pay_type_new = map.get('pay_type_new')
        self.pay_way = map.get('pay_way')
        self.platform_did = map.get('platform_did')
        self.pos_info_id = map.get('pos_info_id')
        self.real_pay_bank = map.get('real_pay_bank')
        self.real_pay_bank_card_no = map.get('real_pay_bank_card_no')
        self.real_pay_name = map.get('real_pay_name')
        self.recv_bank_card_no = map.get('recv_bank_card_no')
        self.recv_bank_name = map.get('recv_bank_name')
        self.recv_did = map.get('recv_did')
        self.recv_name = map.get('recv_name')
        self.waybill_id = map.get('waybill_id')
        self.check_channel = map.get('check_channel')
        self.currency = map.get('currency')
        return self


class CreateDigitalLogisticWaybillPayResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        # 
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class ImportDigitalLogisticWaybillLocationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, desc=None, location=None,
                 platform_did=None, tax_waybill_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 描述信息
        # 
        self.desc = desc                # type: str
        # 运单轨迹信息
        self.location = location        # type: List[LogisticLocation]
        # 所属平台分布式数字身份，缺省时为自己的分布式数字身份
        # 
        self.platform_did = platform_did  # type: str
        # 运单id
        # 
        self.tax_waybill_id = tax_waybill_id  # type: str

    def validate(self):
        if self.location:
            for k in self.location:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['desc'] = self.desc
        result['location'] = []
        if self.location is not None:
            for k in self.location:
                result['location'].append(k.to_map() if k else None)
        else:
            result['location'] = None
        result['platform_did'] = self.platform_did
        result['tax_waybill_id'] = self.tax_waybill_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.desc = map.get('desc')
        self.location = []
        if map.get('location') is not None:
            for k in map.get('location'):
                temp_model = LogisticLocation()
                self.location.append(temp_model.from_map(k))
        else:
            self.location = None
        self.platform_did = map.get('platform_did')
        self.tax_waybill_id = map.get('tax_waybill_id')
        return self


class ImportDigitalLogisticWaybillLocationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class CreateDigitalLogisticWaybillBillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, drawee=None, drawee_tax_no=None,
                 lzfpdm=None, lzfphm=None, open_time=None, platform_did=None, waybill_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 受票方名称
        # 
        self.drawee = drawee            # type: str
        # 受票方纳税人识别号
        # 
        self.drawee_tax_no = drawee_tax_no  # type: str
        # 发票代码
        # 
        self.lzfpdm = lzfpdm            # type: str
        # 发票号码
        # 
        self.lzfphm = lzfphm            # type: str
        # 开票时间戳
        # 
        self.open_time = open_time      # type: int
        # 所属平台的分布式数字身份，缺省时为自己的分布式数字身份
        # 
        self.platform_did = platform_did  # type: str
        # 关联的运单ID
        # 
        self.waybill_id = waybill_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['drawee'] = self.drawee
        result['drawee_tax_no'] = self.drawee_tax_no
        result['lzfpdm'] = self.lzfpdm
        result['lzfphm'] = self.lzfphm
        result['open_time'] = self.open_time
        result['platform_did'] = self.platform_did
        result['waybill_id'] = self.waybill_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.drawee = map.get('drawee')
        self.drawee_tax_no = map.get('drawee_tax_no')
        self.lzfpdm = map.get('lzfpdm')
        self.lzfphm = map.get('lzfphm')
        self.open_time = map.get('open_time')
        self.platform_did = map.get('platform_did')
        self.waybill_id = map.get('waybill_id')
        return self


class CreateDigitalLogisticWaybillBillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        # 
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class QueryDigitalLogisticWaybillStatusRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, platform_did=None,
                 tax_waybill_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        # 
        self.platform_did = platform_did  # type: str
        # 运单ID
        # 
        self.tax_waybill_id = tax_waybill_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['platform_did'] = self.platform_did
        result['tax_waybill_id'] = self.tax_waybill_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.platform_did = map.get('platform_did')
        self.tax_waybill_id = map.get('tax_waybill_id')
        return self


class QueryDigitalLogisticWaybillStatusResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, status=None, track_check_result=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 运单状态
        # 
        self.status = status            # type: str
        # 轨迹核验结果
        self.track_check_result = track_check_result  # type: TrackCheckResult

    def validate(self):
        if self.track_check_result:
            self.track_check_result.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['status'] = self.status
        if self.track_check_result is not None:
            result['track_check_result'] = self.track_check_result.to_map()
        else:
            result['track_check_result'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.status = map.get('status')
        if map.get('track_check_result') is not None:
            temp_model = TrackCheckResult()
            self.track_check_result = temp_model.from_map(map['track_check_result'])
        else:
            self.track_check_result = None
        return self


class FinishDigitalLogisticWaybillOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None,
                 all_freight=None, back_fee=None, business_type=None, cargo_business_code=None, cargo_code=None,
                 cargo_insurance_money=None, cargo_order=None, cargo_unit=None, cargo_volume=None, cargo_weight=None,
                 cart_badge_color=None, cart_badge_no=None, car_captain_did=None, consignor_freight_amount=None, created_time=None,
                 dest_doors_end_time=None, doors_city_code=None, doors_city_name=None, doors_county_code=None, doors_county_name=None,
                 doors_division_code=None, doors_province_code=None, doors_province_name=None, drawee=None, drawee_tax_no=None,
                 driver_did=None, driver_name=None, end_address=None, end_city_code=None, end_city_name=None,
                 end_county_code=None, end_county_name=None, end_division_code=None, end_province_code=None,
                 end_province_name=None, end_street_code=None, end_street_name=None, end_time=None, freight_incr=None,
                 goods_amount=None, goods_amount_type=None, goods_name=None, id_card=None, loss_fee=None, mobile_no=None,
                 partner_id=None, pay_check=None, platform_did=None, prepayments=None, prepayments_buy_etc=None,
                 prepayments_buy_gas=None, prepayments_buy_oil=None, prepayments_etccard=None, prepayments_oilcard=None,
                 present_amount_oil=None, start_address=None, start_city_code=None, start_city_name=None, start_county_code=None,
                 start_county_name=None, start_division_code=None, start_province_code=None, start_province_name=None,
                 start_street_code=None, start_street_name=None, start_time=None, tax_waybill_id=None, truck_length=None,
                 truck_type=None, unit_price=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 链上账号 与司机did 二选一填写
        # 
        self.account_id = account_id    # type: str
        # 运费，单位（元），平台支付给司机的运费
        self.all_freight = all_freight  # type: str
        # 回单押金
        # 
        self.back_fee = back_fee        # type: str
        # 业务类型
        self.business_type = business_type  # type: str
        # 货物行业编码
        self.cargo_business_code = cargo_business_code  # type: str
        # 货物商品编码
        self.cargo_code = cargo_code    # type: str
        # 货物运费险
        self.cargo_insurance_money = cargo_insurance_money  # type: str
        # 货源单号
        # 
        self.cargo_order = cargo_order  # type: str
        # 货物单位
        self.cargo_unit = cargo_unit    # type: str
        # 货物体积，单位（方）
        self.cargo_volume = cargo_volume  # type: str
        # 货物重量，单位（吨）
        self.cargo_weight = cargo_weight  # type: str
        # 车牌颜色，黄色、蓝色、绿色
        self.cart_badge_color = cart_badge_color  # type: str
        # 车牌号
        # 
        self.cart_badge_no = cart_badge_no  # type: str
        # 承运商did
        self.car_captain_did = car_captain_did  # type: str
        # 货主运费金额，货主支付给平台的运费金额
        self.consignor_freight_amount = consignor_freight_amount  # type: str
        # 建单时间，13位毫秒级时间戳
        self.created_time = created_time  # type: int
        # 到达门点时间，13位毫秒级时间戳
        self.dest_doors_end_time = dest_doors_end_time  # type: int
        # 门点城市CODE，6位区域行政编码
        self.doors_city_code = doors_city_code  # type: str
        # 门点城市名称
        self.doors_city_name = doors_city_name  # type: str
        # 门点区县CODE，6位区域行政编码
        self.doors_county_code = doors_county_code  # type: str
        # 门点区县名称
        self.doors_county_name = doors_county_name  # type: str
        # 门点行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        self.doors_division_code = doors_division_code  # type: str
        # 门点省份CODE，6位区域行政编
        self.doors_province_code = doors_province_code  # type: str
        # 门点省份名称
        self.doors_province_name = doors_province_name  # type: str
        # 发货方名称
        # 
        self.drawee = drawee            # type: str
        # 发货方纳税人识别号
        # 
        self.drawee_tax_no = drawee_tax_no  # type: str
        # 司机分布式数字身份
        # 
        self.driver_did = driver_did    # type: str
        # 司机姓名 已填司机分布式身份的情况下可不填
        # 
        self.driver_name = driver_name  # type: str
        # 目的地详细地址
        self.end_address = end_address  # type: str
        # 目的地城市CODE，6位区域行政编
        self.end_city_code = end_city_code  # type: str
        # 目的地城市名称
        # 
        self.end_city_name = end_city_name  # type: str
        # 目的地区县CODE，6位区域行政编
        self.end_county_code = end_county_code  # type: str
        # 目的地区县名称
        # 
        self.end_county_name = end_county_name  # type: str
        # 结束行政区划代码 ，12位区域行政编，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        # 
        self.end_division_code = end_division_code  # type: str
        # 目的地省份CODE，6位区域行政编
        # 
        self.end_province_code = end_province_code  # type: str
        # 目的地省份名称
        # 
        self.end_province_name = end_province_name  # type: str
        # 目的地街道CODE，12位行政区域编码
        self.end_street_code = end_street_code  # type: str
        # 目的地街道名称
        self.end_street_name = end_street_name  # type: str
        # 终结时间，13位毫秒级时间戳
        self.end_time = end_time        # type: int
        # 运费增项
        # 
        self.freight_incr = freight_incr  # type: str
        # 货物数量
        # 
        self.goods_amount = goods_amount  # type: int
        # 货物数量单位类型
        # 
        self.goods_amount_type = goods_amount_type  # type: str
        # 货物名称
        # 
        self.goods_name = goods_name    # type: str
        # 司机身份证号 已填司机分布式身份的情况下可不填
        # 
        self.id_card = id_card          # type: str
        # 运费扣减
        # 
        self.loss_fee = loss_fee        # type: str
        # 司机手机号 已填司机分布式身份的情况下可不填
        # 
        self.mobile_no = mobile_no      # type: str
        # 系统识别id 网商识别号
        # 
        self.partner_id = partner_id    # type: str
        # 是否进行资金验证
        # 
        self.pay_check = pay_check      # type: bool
        # 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        # 
        self.platform_did = platform_did  # type: str
        # 预付款金额
        # 
        self.prepayments = prepayments  # type: str
        # 线下预付ETC
        # 
        self.prepayments_buy_etc = prepayments_buy_etc  # type: str
        # 线下气款金额
        # 
        self.prepayments_buy_gas = prepayments_buy_gas  # type: str
        # 线下油款预付
        # 
        self.prepayments_buy_oil = prepayments_buy_oil  # type: str
        # 预付ETC卡金额
        # 
        self.prepayments_etccard = prepayments_etccard  # type: str
        # 预付油卡金额
        # 
        self.prepayments_oilcard = prepayments_oilcard  # type: str
        # 油卡赠送金额
        # 
        self.present_amount_oil = present_amount_oil  # type: str
        # 起始地详细地址
        self.start_address = start_address  # type: str
        # 起始地CODE
        # ，6位区域行政编
        self.start_city_code = start_city_code  # type: str
        # 起始地城市名称
        # 
        self.start_city_name = start_city_name  # type: str
        # 起始地区县CODE
        # ，6位区域行政编
        self.start_county_code = start_county_code  # type: str
        # 起始地区县名称
        # 
        self.start_county_name = start_county_name  # type: str
        # 起始行政区划代码，12位区域行政编，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        # 
        self.start_division_code = start_division_code  # type: str
        # 起始地省份CODE
        # ，6位区域行政编
        self.start_province_code = start_province_code  # type: str
        # 起始地省份名称
        # 
        self.start_province_name = start_province_name  # type: str
        # 起始地街道CODE，12位区域行政编
        self.start_street_code = start_street_code  # type: str
        # 起始地街道名称
        self.start_street_name = start_street_name  # type: str
        # 起运时间，13位毫秒级时间戳
        # 
        self.start_time = start_time    # type: int
        # 运单ID
        # 
        self.tax_waybill_id = tax_waybill_id  # type: str
        # 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
        self.truck_length = truck_length  # type: str
        # 车型，可以填写：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
        self.truck_type = truck_type    # type: str
        # 运输单价
        # 
        self.unit_price = unit_price    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['all_freight'] = self.all_freight
        result['back_fee'] = self.back_fee
        result['business_type'] = self.business_type
        result['cargo_business_code'] = self.cargo_business_code
        result['cargo_code'] = self.cargo_code
        result['cargo_insurance_money'] = self.cargo_insurance_money
        result['cargo_order'] = self.cargo_order
        result['cargo_unit'] = self.cargo_unit
        result['cargo_volume'] = self.cargo_volume
        result['cargo_weight'] = self.cargo_weight
        result['cart_badge_color'] = self.cart_badge_color
        result['cart_badge_no'] = self.cart_badge_no
        result['car_captain_did'] = self.car_captain_did
        result['consignor_freight_amount'] = self.consignor_freight_amount
        result['created_time'] = self.created_time
        result['dest_doors_end_time'] = self.dest_doors_end_time
        result['doors_city_code'] = self.doors_city_code
        result['doors_city_name'] = self.doors_city_name
        result['doors_county_code'] = self.doors_county_code
        result['doors_county_name'] = self.doors_county_name
        result['doors_division_code'] = self.doors_division_code
        result['doors_province_code'] = self.doors_province_code
        result['doors_province_name'] = self.doors_province_name
        result['drawee'] = self.drawee
        result['drawee_tax_no'] = self.drawee_tax_no
        result['driver_did'] = self.driver_did
        result['driver_name'] = self.driver_name
        result['end_address'] = self.end_address
        result['end_city_code'] = self.end_city_code
        result['end_city_name'] = self.end_city_name
        result['end_county_code'] = self.end_county_code
        result['end_county_name'] = self.end_county_name
        result['end_division_code'] = self.end_division_code
        result['end_province_code'] = self.end_province_code
        result['end_province_name'] = self.end_province_name
        result['end_street_code'] = self.end_street_code
        result['end_street_name'] = self.end_street_name
        result['end_time'] = self.end_time
        result['freight_incr'] = self.freight_incr
        result['goods_amount'] = self.goods_amount
        result['goods_amount_type'] = self.goods_amount_type
        result['goods_name'] = self.goods_name
        result['id_card'] = self.id_card
        result['loss_fee'] = self.loss_fee
        result['mobile_no'] = self.mobile_no
        result['partner_id'] = self.partner_id
        result['pay_check'] = self.pay_check
        result['platform_did'] = self.platform_did
        result['prepayments'] = self.prepayments
        result['prepayments_buy_etc'] = self.prepayments_buy_etc
        result['prepayments_buy_gas'] = self.prepayments_buy_gas
        result['prepayments_buy_oil'] = self.prepayments_buy_oil
        result['prepayments_etccard'] = self.prepayments_etccard
        result['prepayments_oilcard'] = self.prepayments_oilcard
        result['present_amount_oil'] = self.present_amount_oil
        result['start_address'] = self.start_address
        result['start_city_code'] = self.start_city_code
        result['start_city_name'] = self.start_city_name
        result['start_county_code'] = self.start_county_code
        result['start_county_name'] = self.start_county_name
        result['start_division_code'] = self.start_division_code
        result['start_province_code'] = self.start_province_code
        result['start_province_name'] = self.start_province_name
        result['start_street_code'] = self.start_street_code
        result['start_street_name'] = self.start_street_name
        result['start_time'] = self.start_time
        result['tax_waybill_id'] = self.tax_waybill_id
        result['truck_length'] = self.truck_length
        result['truck_type'] = self.truck_type
        result['unit_price'] = self.unit_price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.all_freight = map.get('all_freight')
        self.back_fee = map.get('back_fee')
        self.business_type = map.get('business_type')
        self.cargo_business_code = map.get('cargo_business_code')
        self.cargo_code = map.get('cargo_code')
        self.cargo_insurance_money = map.get('cargo_insurance_money')
        self.cargo_order = map.get('cargo_order')
        self.cargo_unit = map.get('cargo_unit')
        self.cargo_volume = map.get('cargo_volume')
        self.cargo_weight = map.get('cargo_weight')
        self.cart_badge_color = map.get('cart_badge_color')
        self.cart_badge_no = map.get('cart_badge_no')
        self.car_captain_did = map.get('car_captain_did')
        self.consignor_freight_amount = map.get('consignor_freight_amount')
        self.created_time = map.get('created_time')
        self.dest_doors_end_time = map.get('dest_doors_end_time')
        self.doors_city_code = map.get('doors_city_code')
        self.doors_city_name = map.get('doors_city_name')
        self.doors_county_code = map.get('doors_county_code')
        self.doors_county_name = map.get('doors_county_name')
        self.doors_division_code = map.get('doors_division_code')
        self.doors_province_code = map.get('doors_province_code')
        self.doors_province_name = map.get('doors_province_name')
        self.drawee = map.get('drawee')
        self.drawee_tax_no = map.get('drawee_tax_no')
        self.driver_did = map.get('driver_did')
        self.driver_name = map.get('driver_name')
        self.end_address = map.get('end_address')
        self.end_city_code = map.get('end_city_code')
        self.end_city_name = map.get('end_city_name')
        self.end_county_code = map.get('end_county_code')
        self.end_county_name = map.get('end_county_name')
        self.end_division_code = map.get('end_division_code')
        self.end_province_code = map.get('end_province_code')
        self.end_province_name = map.get('end_province_name')
        self.end_street_code = map.get('end_street_code')
        self.end_street_name = map.get('end_street_name')
        self.end_time = map.get('end_time')
        self.freight_incr = map.get('freight_incr')
        self.goods_amount = map.get('goods_amount')
        self.goods_amount_type = map.get('goods_amount_type')
        self.goods_name = map.get('goods_name')
        self.id_card = map.get('id_card')
        self.loss_fee = map.get('loss_fee')
        self.mobile_no = map.get('mobile_no')
        self.partner_id = map.get('partner_id')
        self.pay_check = map.get('pay_check')
        self.platform_did = map.get('platform_did')
        self.prepayments = map.get('prepayments')
        self.prepayments_buy_etc = map.get('prepayments_buy_etc')
        self.prepayments_buy_gas = map.get('prepayments_buy_gas')
        self.prepayments_buy_oil = map.get('prepayments_buy_oil')
        self.prepayments_etccard = map.get('prepayments_etccard')
        self.prepayments_oilcard = map.get('prepayments_oilcard')
        self.present_amount_oil = map.get('present_amount_oil')
        self.start_address = map.get('start_address')
        self.start_city_code = map.get('start_city_code')
        self.start_city_name = map.get('start_city_name')
        self.start_county_code = map.get('start_county_code')
        self.start_county_name = map.get('start_county_name')
        self.start_division_code = map.get('start_division_code')
        self.start_province_code = map.get('start_province_code')
        self.start_province_name = map.get('start_province_name')
        self.start_street_code = map.get('start_street_code')
        self.start_street_name = map.get('start_street_name')
        self.start_time = map.get('start_time')
        self.tax_waybill_id = map.get('tax_waybill_id')
        self.truck_length = map.get('truck_length')
        self.truck_type = map.get('truck_type')
        self.unit_price = map.get('unit_price')
        return self


class FinishDigitalLogisticWaybillOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        # 
        # 
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CreateDigitalLogisticCargoPayorderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bank_account_of_payee=None,
                 bank_account_of_payer=None, bank_no=None, bank_of_payee=None, bank_of_payer=None, bill_id=None, cargo_order=None,
                 check_channel=None, currency=None, expense_type=None, payee=None, payer=None, payment=None, pay_check=None,
                 pay_did=None, pay_id=None, pay_note=None, pay_time=None, pay_type=None, platform_did=None, recv_did=None,
                 request_id=None, tax_waybill_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 收款方银行账号
        self.bank_account_of_payee = bank_account_of_payee  # type: str
        # 付款方银行账号,货主付款的开户银行账号
        self.bank_account_of_payer = bank_account_of_payer  # type: str
        # 银行流水号，云资金校验时 必传；
        # 
        self.bank_no = bank_no          # type: str
        # 收款方开户行（平台收款）
        # 
        # MYBank_CloudCapital_2,  ## 云资金2.0
        # 
        # 
        self.bank_of_payee = bank_of_payee  # type: str
        # 付款方开户行(货主付款)  取值
        # 
        # MYBank_CloudCapital_2,  ## 云资金2.0
        self.bank_of_payer = bank_of_payer  # type: str
        # 账单编号
        self.bill_id = bill_id          # type: str
        # 货源单号
        # 
        self.cargo_order = cargo_order  # type: str
        # 核验渠道，请按取值约束值填入
        # MYBank_CloudCapital_2,  ## 云资金2.0
        self.check_channel = check_channel  # type: str
        # 币种
        # 按下列取值：
        # CNY、USD
        # 
        # 
        self.currency = currency        # type: str
        # 费用类型 (运费、调度费、服务费)
        # 
        self.expense_type = expense_type  # type: str
        # 收款方名称
        self.payee = payee              # type: str
        # 付款方名称
        self.payer = payer              # type: str
        # 费用金额（运单维度）
        # 
        self.payment = payment          # type: str
        # 是否核验
        self.pay_check = pay_check      # type: bool
        # 付款方did
        # 
        self.pay_did = pay_did          # type: str
        # 支付单号
        # 
        self.pay_id = pay_id            # type: str
        # 支付备注
        # 
        self.pay_note = pay_note        # type: str
        # 支付时间
        # 
        self.pay_time = pay_time        # type: int
        # 支付类型
        # 
        self.pay_type = pay_type        # type: str
        # 所属平台did
        self.platform_did = platform_did  # type: str
        # 收款方did
        self.recv_did = recv_did        # type: str
        # 请求唯一标识
        self.request_id = request_id    # type: str
        # 运单号
        self.tax_waybill_id = tax_waybill_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bank_account_of_payee'] = self.bank_account_of_payee
        result['bank_account_of_payer'] = self.bank_account_of_payer
        result['bank_no'] = self.bank_no
        result['bank_of_payee'] = self.bank_of_payee
        result['bank_of_payer'] = self.bank_of_payer
        result['bill_id'] = self.bill_id
        result['cargo_order'] = self.cargo_order
        result['check_channel'] = self.check_channel
        result['currency'] = self.currency
        result['expense_type'] = self.expense_type
        result['payee'] = self.payee
        result['payer'] = self.payer
        result['payment'] = self.payment
        result['pay_check'] = self.pay_check
        result['pay_did'] = self.pay_did
        result['pay_id'] = self.pay_id
        result['pay_note'] = self.pay_note
        result['pay_time'] = self.pay_time
        result['pay_type'] = self.pay_type
        result['platform_did'] = self.platform_did
        result['recv_did'] = self.recv_did
        result['request_id'] = self.request_id
        result['tax_waybill_id'] = self.tax_waybill_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bank_account_of_payee = map.get('bank_account_of_payee')
        self.bank_account_of_payer = map.get('bank_account_of_payer')
        self.bank_no = map.get('bank_no')
        self.bank_of_payee = map.get('bank_of_payee')
        self.bank_of_payer = map.get('bank_of_payer')
        self.bill_id = map.get('bill_id')
        self.cargo_order = map.get('cargo_order')
        self.check_channel = map.get('check_channel')
        self.currency = map.get('currency')
        self.expense_type = map.get('expense_type')
        self.payee = map.get('payee')
        self.payer = map.get('payer')
        self.payment = map.get('payment')
        self.pay_check = map.get('pay_check')
        self.pay_did = map.get('pay_did')
        self.pay_id = map.get('pay_id')
        self.pay_note = map.get('pay_note')
        self.pay_time = map.get('pay_time')
        self.pay_type = map.get('pay_type')
        self.platform_did = map.get('platform_did')
        self.recv_did = map.get('recv_did')
        self.request_id = map.get('request_id')
        self.tax_waybill_id = map.get('tax_waybill_id')
        return self


class CreateDigitalLogisticCargoPayorderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 货源支付链上凭证
        # 
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class SaveDigitalLogisticWaybillOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None,
                 all_freight=None, back_fee=None, business_type=None, cargo_business_code=None, cargo_code=None,
                 cargo_insurance_money=None, cargo_order=None, cargo_unit=None, cargo_volume=None, cargo_weight=None,
                 cart_badge_color=None, cart_badge_no=None, car_captain_did=None, consignor_freight_amount=None, created_time=None,
                 dest_doors_end_time=None, doors_city_code=None, doors_city_name=None, doors_county_code=None, doors_county_name=None,
                 doors_division_code=None, doors_province_code=None, doors_province_name=None, drawee=None, drawee_tax_no=None,
                 driver_did=None, driver_name=None, end_address=None, end_city_code=None, end_city_name=None,
                 end_county_code=None, end_county_name=None, end_division_code=None, end_province_code=None,
                 end_province_name=None, end_street_code=None, end_street_name=None, end_time=None, freight_incr=None,
                 goods_amount=None, goods_amount_type=None, goods_name=None, id_card=None, loss_fee=None, mobile_no=None,
                 partner_id=None, pay_check=None, platform_did=None, prepayments=None, prepayments_buy_etc=None,
                 prepayments_buy_gas=None, prepayments_buy_oil=None, prepayments_etccard=None, prepayments_oilcard=None,
                 present_amount_oil=None, start_address=None, start_city_code=None, start_city_name=None, start_county_code=None,
                 start_county_name=None, start_division_code=None, start_province_code=None, start_province_name=None,
                 start_street_code=None, start_street_name=None, start_time=None, tax_waybill_id=None, truck_length=None,
                 truck_type=None, unit_price=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 链上账号 与司机did 二选一填写
        # 
        self.account_id = account_id    # type: str
        # 运费，单位（元），平台支付给司机的运费
        self.all_freight = all_freight  # type: str
        # 回单押金
        # 
        self.back_fee = back_fee        # type: str
        # 业务类型
        self.business_type = business_type  # type: str
        # 货物行业编码
        # 
        self.cargo_business_code = cargo_business_code  # type: str
        # 货物商品编码
        # 
        self.cargo_code = cargo_code    # type: str
        # 货物运费险
        # 
        self.cargo_insurance_money = cargo_insurance_money  # type: str
        # 货源单号
        # 
        self.cargo_order = cargo_order  # type: str
        # 货物单位
        # 
        self.cargo_unit = cargo_unit    # type: str
        # 货物体积，单位（方）
        # 
        self.cargo_volume = cargo_volume  # type: str
        # 货物重量，单位（吨）
        self.cargo_weight = cargo_weight  # type: str
        # 车牌颜色，黄色、蓝色、绿色
        self.cart_badge_color = cart_badge_color  # type: str
        # 车牌号
        # 
        self.cart_badge_no = cart_badge_no  # type: str
        # 承运商did
        self.car_captain_did = car_captain_did  # type: str
        # 货主运费金额，货主支付给平台的运费
        # 
        self.consignor_freight_amount = consignor_freight_amount  # type: str
        # 建单时间，13位毫秒级时间戳
        self.created_time = created_time  # type: int
        # 到达门点时间，13位毫秒级时间戳
        self.dest_doors_end_time = dest_doors_end_time  # type: int
        # 门点城市CODE，6位区域行政编码
        self.doors_city_code = doors_city_code  # type: str
        # 门点城市名称
        self.doors_city_name = doors_city_name  # type: str
        # 门点区县CODE，6位区域行政编码
        self.doors_county_code = doors_county_code  # type: str
        # 门点区县名称
        self.doors_county_name = doors_county_name  # type: str
        # 门点行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        self.doors_division_code = doors_division_code  # type: str
        # 门点省份CODE，6位区域行政编码
        self.doors_province_code = doors_province_code  # type: str
        # 门点省份名称
        self.doors_province_name = doors_province_name  # type: str
        # 发货方名称
        # 
        self.drawee = drawee            # type: str
        # 发货方纳税人识别号
        # 
        self.drawee_tax_no = drawee_tax_no  # type: str
        # 司机分布式数字身份
        # 
        self.driver_did = driver_did    # type: str
        # 司机姓名 已填司机分布式身份的情况下可不填
        # 
        self.driver_name = driver_name  # type: str
        # 目的地详细地址
        self.end_address = end_address  # type: str
        # 目的地城市CODE，6位区域行政编码
        # 
        self.end_city_code = end_city_code  # type: str
        # 目的地城市名称
        # 
        self.end_city_name = end_city_name  # type: str
        # 目的地区县CODE，6位区域行政编码
        self.end_county_code = end_county_code  # type: str
        # 目的地区县名称
        # 
        self.end_county_name = end_county_name  # type: str
        # 结束行政区划代码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        # 
        self.end_division_code = end_division_code  # type: str
        # 目的地省份CODE，6位区域行政编码
        self.end_province_code = end_province_code  # type: str
        # 目的地省份名称
        # 
        self.end_province_name = end_province_name  # type: str
        # 目的地街道CODE，12位区域行政编码
        self.end_street_code = end_street_code  # type: str
        # 目的地街道名称
        self.end_street_name = end_street_name  # type: str
        # 运达时间，13位毫秒级时间戳
        self.end_time = end_time        # type: int
        # 运费增项
        # 
        self.freight_incr = freight_incr  # type: str
        # 货物数量
        # 
        self.goods_amount = goods_amount  # type: str
        # 货物数量单位类型
        # 
        self.goods_amount_type = goods_amount_type  # type: str
        # 货物名称
        # 
        self.goods_name = goods_name    # type: str
        # 司机身份证号 已填司机分布式身份的情况下可不填
        # 
        self.id_card = id_card          # type: str
        # 运费扣减
        # 
        self.loss_fee = loss_fee        # type: str
        # 司机手机号 已填司机分布式身份的情况下可不填
        # 
        self.mobile_no = mobile_no      # type: str
        # 系统识别id 网商识别号
        # 
        self.partner_id = partner_id    # type: str
        # 是否进行资金验证
        # 
        self.pay_check = pay_check      # type: bool
        # 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        # 
        self.platform_did = platform_did  # type: str
        # 预付款金额
        # 
        self.prepayments = prepayments  # type: str
        # 线下预付ETC
        # 
        self.prepayments_buy_etc = prepayments_buy_etc  # type: str
        # 线下气款金额
        # 
        self.prepayments_buy_gas = prepayments_buy_gas  # type: str
        # 线下油款预付
        # 
        self.prepayments_buy_oil = prepayments_buy_oil  # type: str
        # 预付ETC卡金额
        # 
        self.prepayments_etccard = prepayments_etccard  # type: str
        # 预付油卡金额
        # 
        self.prepayments_oilcard = prepayments_oilcard  # type: str
        # 油卡赠送金额
        # 
        self.present_amount_oil = present_amount_oil  # type: str
        # 起始地详细地址
        self.start_address = start_address  # type: str
        # 起始地城市CODE，6位区域行政编码
        # 
        self.start_city_code = start_city_code  # type: str
        # 起始地城市名称
        # 
        self.start_city_name = start_city_name  # type: str
        # 起始地区县CODE，6位区域行政编码
        # 
        # 
        self.start_county_code = start_county_code  # type: str
        # 起始地区县名称
        # 
        self.start_county_name = start_county_name  # type: str
        # 起始行政区划代码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        # 
        self.start_division_code = start_division_code  # type: str
        # 起始地省份CODE，6位区域行政编码
        # 
        # 
        self.start_province_code = start_province_code  # type: str
        # 起始地省份名称
        # 
        self.start_province_name = start_province_name  # type: str
        # 起始地街道CODE，12位区域行政编码
        self.start_street_code = start_street_code  # type: str
        # 起始地街道名称
        self.start_street_name = start_street_name  # type: str
        # 起运时间，13位毫秒级时间戳
        self.start_time = start_time    # type: int
        # 运单ID
        # 
        self.tax_waybill_id = tax_waybill_id  # type: str
        # 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
        self.truck_length = truck_length  # type: str
        # 车型
        self.truck_type = truck_type    # type: str
        # 运输单价
        # 
        self.unit_price = unit_price    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['all_freight'] = self.all_freight
        result['back_fee'] = self.back_fee
        result['business_type'] = self.business_type
        result['cargo_business_code'] = self.cargo_business_code
        result['cargo_code'] = self.cargo_code
        result['cargo_insurance_money'] = self.cargo_insurance_money
        result['cargo_order'] = self.cargo_order
        result['cargo_unit'] = self.cargo_unit
        result['cargo_volume'] = self.cargo_volume
        result['cargo_weight'] = self.cargo_weight
        result['cart_badge_color'] = self.cart_badge_color
        result['cart_badge_no'] = self.cart_badge_no
        result['car_captain_did'] = self.car_captain_did
        result['consignor_freight_amount'] = self.consignor_freight_amount
        result['created_time'] = self.created_time
        result['dest_doors_end_time'] = self.dest_doors_end_time
        result['doors_city_code'] = self.doors_city_code
        result['doors_city_name'] = self.doors_city_name
        result['doors_county_code'] = self.doors_county_code
        result['doors_county_name'] = self.doors_county_name
        result['doors_division_code'] = self.doors_division_code
        result['doors_province_code'] = self.doors_province_code
        result['doors_province_name'] = self.doors_province_name
        result['drawee'] = self.drawee
        result['drawee_tax_no'] = self.drawee_tax_no
        result['driver_did'] = self.driver_did
        result['driver_name'] = self.driver_name
        result['end_address'] = self.end_address
        result['end_city_code'] = self.end_city_code
        result['end_city_name'] = self.end_city_name
        result['end_county_code'] = self.end_county_code
        result['end_county_name'] = self.end_county_name
        result['end_division_code'] = self.end_division_code
        result['end_province_code'] = self.end_province_code
        result['end_province_name'] = self.end_province_name
        result['end_street_code'] = self.end_street_code
        result['end_street_name'] = self.end_street_name
        result['end_time'] = self.end_time
        result['freight_incr'] = self.freight_incr
        result['goods_amount'] = self.goods_amount
        result['goods_amount_type'] = self.goods_amount_type
        result['goods_name'] = self.goods_name
        result['id_card'] = self.id_card
        result['loss_fee'] = self.loss_fee
        result['mobile_no'] = self.mobile_no
        result['partner_id'] = self.partner_id
        result['pay_check'] = self.pay_check
        result['platform_did'] = self.platform_did
        result['prepayments'] = self.prepayments
        result['prepayments_buy_etc'] = self.prepayments_buy_etc
        result['prepayments_buy_gas'] = self.prepayments_buy_gas
        result['prepayments_buy_oil'] = self.prepayments_buy_oil
        result['prepayments_etccard'] = self.prepayments_etccard
        result['prepayments_oilcard'] = self.prepayments_oilcard
        result['present_amount_oil'] = self.present_amount_oil
        result['start_address'] = self.start_address
        result['start_city_code'] = self.start_city_code
        result['start_city_name'] = self.start_city_name
        result['start_county_code'] = self.start_county_code
        result['start_county_name'] = self.start_county_name
        result['start_division_code'] = self.start_division_code
        result['start_province_code'] = self.start_province_code
        result['start_province_name'] = self.start_province_name
        result['start_street_code'] = self.start_street_code
        result['start_street_name'] = self.start_street_name
        result['start_time'] = self.start_time
        result['tax_waybill_id'] = self.tax_waybill_id
        result['truck_length'] = self.truck_length
        result['truck_type'] = self.truck_type
        result['unit_price'] = self.unit_price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.all_freight = map.get('all_freight')
        self.back_fee = map.get('back_fee')
        self.business_type = map.get('business_type')
        self.cargo_business_code = map.get('cargo_business_code')
        self.cargo_code = map.get('cargo_code')
        self.cargo_insurance_money = map.get('cargo_insurance_money')
        self.cargo_order = map.get('cargo_order')
        self.cargo_unit = map.get('cargo_unit')
        self.cargo_volume = map.get('cargo_volume')
        self.cargo_weight = map.get('cargo_weight')
        self.cart_badge_color = map.get('cart_badge_color')
        self.cart_badge_no = map.get('cart_badge_no')
        self.car_captain_did = map.get('car_captain_did')
        self.consignor_freight_amount = map.get('consignor_freight_amount')
        self.created_time = map.get('created_time')
        self.dest_doors_end_time = map.get('dest_doors_end_time')
        self.doors_city_code = map.get('doors_city_code')
        self.doors_city_name = map.get('doors_city_name')
        self.doors_county_code = map.get('doors_county_code')
        self.doors_county_name = map.get('doors_county_name')
        self.doors_division_code = map.get('doors_division_code')
        self.doors_province_code = map.get('doors_province_code')
        self.doors_province_name = map.get('doors_province_name')
        self.drawee = map.get('drawee')
        self.drawee_tax_no = map.get('drawee_tax_no')
        self.driver_did = map.get('driver_did')
        self.driver_name = map.get('driver_name')
        self.end_address = map.get('end_address')
        self.end_city_code = map.get('end_city_code')
        self.end_city_name = map.get('end_city_name')
        self.end_county_code = map.get('end_county_code')
        self.end_county_name = map.get('end_county_name')
        self.end_division_code = map.get('end_division_code')
        self.end_province_code = map.get('end_province_code')
        self.end_province_name = map.get('end_province_name')
        self.end_street_code = map.get('end_street_code')
        self.end_street_name = map.get('end_street_name')
        self.end_time = map.get('end_time')
        self.freight_incr = map.get('freight_incr')
        self.goods_amount = map.get('goods_amount')
        self.goods_amount_type = map.get('goods_amount_type')
        self.goods_name = map.get('goods_name')
        self.id_card = map.get('id_card')
        self.loss_fee = map.get('loss_fee')
        self.mobile_no = map.get('mobile_no')
        self.partner_id = map.get('partner_id')
        self.pay_check = map.get('pay_check')
        self.platform_did = map.get('platform_did')
        self.prepayments = map.get('prepayments')
        self.prepayments_buy_etc = map.get('prepayments_buy_etc')
        self.prepayments_buy_gas = map.get('prepayments_buy_gas')
        self.prepayments_buy_oil = map.get('prepayments_buy_oil')
        self.prepayments_etccard = map.get('prepayments_etccard')
        self.prepayments_oilcard = map.get('prepayments_oilcard')
        self.present_amount_oil = map.get('present_amount_oil')
        self.start_address = map.get('start_address')
        self.start_city_code = map.get('start_city_code')
        self.start_city_name = map.get('start_city_name')
        self.start_county_code = map.get('start_county_code')
        self.start_county_name = map.get('start_county_name')
        self.start_division_code = map.get('start_division_code')
        self.start_province_code = map.get('start_province_code')
        self.start_province_name = map.get('start_province_name')
        self.start_street_code = map.get('start_street_code')
        self.start_street_name = map.get('start_street_name')
        self.start_time = map.get('start_time')
        self.tax_waybill_id = map.get('tax_waybill_id')
        self.truck_length = map.get('truck_length')
        self.truck_type = map.get('truck_type')
        self.unit_price = map.get('unit_price')
        return self


class SaveDigitalLogisticWaybillOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        # 
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CloseDigitalLogisticWaybillOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, platform_did=None,
                 tax_waybill_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 无车承运平台分布式数字身份
        self.platform_did = platform_did  # type: str
        # 运单ID
        # 
        self.tax_waybill_id = tax_waybill_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['platform_did'] = self.platform_did
        result['tax_waybill_id'] = self.tax_waybill_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.platform_did = map.get('platform_did')
        self.tax_waybill_id = map.get('tax_waybill_id')
        return self


class CloseDigitalLogisticWaybillOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        # 
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class FinishDigitalLogisticFinanceWaybillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, all_freight=None, back_fee=None,
                 consignor_freight_amount=None, freight_incr=None, loss_fee=None, platform_did=None, tax_waybill_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 运费
        self.all_freight = all_freight  # type: str
        # 回单押金
        self.back_fee = back_fee        # type: str
        # 货主支付运费金额
        self.consignor_freight_amount = consignor_freight_amount  # type: str
        # 运费增项
        self.freight_incr = freight_incr  # type: str
        # 运费扣减
        self.loss_fee = loss_fee        # type: str
        # 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        self.platform_did = platform_did  # type: str
        # 运单id
        self.tax_waybill_id = tax_waybill_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['all_freight'] = self.all_freight
        result['back_fee'] = self.back_fee
        result['consignor_freight_amount'] = self.consignor_freight_amount
        result['freight_incr'] = self.freight_incr
        result['loss_fee'] = self.loss_fee
        result['platform_did'] = self.platform_did
        result['tax_waybill_id'] = self.tax_waybill_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.all_freight = map.get('all_freight')
        self.back_fee = map.get('back_fee')
        self.consignor_freight_amount = map.get('consignor_freight_amount')
        self.freight_incr = map.get('freight_incr')
        self.loss_fee = map.get('loss_fee')
        self.platform_did = map.get('platform_did')
        self.tax_waybill_id = map.get('tax_waybill_id')
        return self


class FinishDigitalLogisticFinanceWaybillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class FinishDigitalLogisticFinanceTransportRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, all_freight=None, back_fee=None,
                 consignor_freight_amount=None, dest_doors_end_time=None, end_time=None, freight_incr=None, loss_fee=None, platform_did=None,
                 tax_waybill_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 运费
        self.all_freight = all_freight  # type: str
        # 回单押金
        self.back_fee = back_fee        # type: str
        # 货主支付运费金额
        self.consignor_freight_amount = consignor_freight_amount  # type: str
        # 到达门点时间
        self.dest_doors_end_time = dest_doors_end_time  # type: int
        # 终结时间
        self.end_time = end_time        # type: int
        # 运费增项
        self.freight_incr = freight_incr  # type: str
        # 运费扣减
        self.loss_fee = loss_fee        # type: str
        # 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        self.platform_did = platform_did  # type: str
        # 运单id
        self.tax_waybill_id = tax_waybill_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['all_freight'] = self.all_freight
        result['back_fee'] = self.back_fee
        result['consignor_freight_amount'] = self.consignor_freight_amount
        result['dest_doors_end_time'] = self.dest_doors_end_time
        result['end_time'] = self.end_time
        result['freight_incr'] = self.freight_incr
        result['loss_fee'] = self.loss_fee
        result['platform_did'] = self.platform_did
        result['tax_waybill_id'] = self.tax_waybill_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.all_freight = map.get('all_freight')
        self.back_fee = map.get('back_fee')
        self.consignor_freight_amount = map.get('consignor_freight_amount')
        self.dest_doors_end_time = map.get('dest_doors_end_time')
        self.end_time = map.get('end_time')
        self.freight_incr = map.get('freight_incr')
        self.loss_fee = map.get('loss_fee')
        self.platform_did = map.get('platform_did')
        self.tax_waybill_id = map.get('tax_waybill_id')
        return self


class FinishDigitalLogisticFinanceTransportResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 货源支付链上凭证
        # 
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class UpdateDigitalLogisticFinanceWaybillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, all_freight=None, back_fee=None,
                 business_type=None, cargo_business_code=None, cargo_code=None, cargo_insurance_money=None, cargo_order=None,
                 cargo_unit=None, cargo_volume=None, cargo_weight=None, cart_badge_color=None, cart_badge_no=None,
                 car_captain_did=None, consignor_freight_amount=None, created_time=None, dest_doors_end_time=None,
                 doors_city_code=None, doors_city_name=None, doors_county_code=None, doors_county_name=None,
                 doors_division_code=None, doors_province_code=None, doors_province_name=None, drawee=None, drawee_tax_no=None,
                 driver_did=None, end_address=None, end_city_code=None, end_city_name=None, end_county_code=None,
                 end_county_name=None, end_division_code=None, end_province_code=None, end_province_name=None,
                 end_street_code=None, end_street_name=None, end_time=None, freight_incr=None, goods_amount=None,
                 goods_amount_type=None, goods_name=None, loss_fee=None, partner_id=None, platform_did=None, prepayments=None,
                 prepayments_buy_etc=None, prepayments_buy_gas=None, prepayments_buy_oil=None, prepayments_etccard=None,
                 prepayments_oilcard=None, present_amount_oil=None, start_address=None, start_city_code=None, start_city_name=None,
                 start_county_code=None, start_county_name=None, start_division_code=None, start_province_code=None,
                 start_province_name=None, start_street_code=None, start_street_name=None, start_time=None, tax_waybill_id=None,
                 truck_length=None, truck_type=None, unit_price=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 运费，单位（元），平台支付给司机的运费
        self.all_freight = all_freight  # type: str
        # 回单押金
        self.back_fee = back_fee        # type: str
        # 业务类型
        self.business_type = business_type  # type: str
        # 货物行业编码
        self.cargo_business_code = cargo_business_code  # type: str
        # 货物商品编码
        self.cargo_code = cargo_code    # type: str
        # 货物运费险
        self.cargo_insurance_money = cargo_insurance_money  # type: str
        # 货源单号
        self.cargo_order = cargo_order  # type: str
        # 货物单位
        self.cargo_unit = cargo_unit    # type: str
        # 货物体积，单位（方）
        self.cargo_volume = cargo_volume  # type: str
        # 货物重量，单位（吨）
        self.cargo_weight = cargo_weight  # type: str
        # 车牌颜色，黄色、蓝色、绿色
        self.cart_badge_color = cart_badge_color  # type: str
        # 车牌号
        self.cart_badge_no = cart_badge_no  # type: str
        # 承运商did
        self.car_captain_did = car_captain_did  # type: str
        # 货主支付运费金额，货主支付给平台的运费金额
        self.consignor_freight_amount = consignor_freight_amount  # type: str
        # 建单时间，13位毫秒级时间戳
        self.created_time = created_time  # type: int
        # 到达门点时间，13位毫秒级时间戳
        self.dest_doors_end_time = dest_doors_end_time  # type: str
        # 门点城市CODE，6位区域行政编码
        self.doors_city_code = doors_city_code  # type: str
        # 门点城市名称
        self.doors_city_name = doors_city_name  # type: str
        # 门点区县CODE，6位区域行政编码
        self.doors_county_code = doors_county_code  # type: str
        # 门点区县名称
        self.doors_county_name = doors_county_name  # type: str
        # 门点行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        self.doors_division_code = doors_division_code  # type: str
        # 门点省份CODE，6位行政区域编码
        self.doors_province_code = doors_province_code  # type: str
        # 门点省份名称
        self.doors_province_name = doors_province_name  # type: str
        # 发货方名称
        self.drawee = drawee            # type: str
        # 发货方纳税人识别号
        self.drawee_tax_no = drawee_tax_no  # type: str
        # 司机分布式数字身份
        self.driver_did = driver_did    # type: str
        # 目的地详细地址
        self.end_address = end_address  # type: str
        # 目的地城市CODE，6位区域行政编码
        self.end_city_code = end_city_code  # type: str
        # 目的地城市名称
        self.end_city_name = end_city_name  # type: str
        # 目的地区县CODE
        self.end_county_code = end_county_code  # type: str
        # 目的地区县名称，6位区域行政编码
        self.end_county_name = end_county_name  # type: str
        # 结束行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        self.end_division_code = end_division_code  # type: str
        # 目的地省份CODE，6位区域行政编码
        self.end_province_code = end_province_code  # type: str
        # 目的地省份名称
        self.end_province_name = end_province_name  # type: str
        # 目的地街道CODE，12位区域行政编码
        self.end_street_code = end_street_code  # type: str
        # 目的地街道名称
        self.end_street_name = end_street_name  # type: str
        # 终结时间，13位毫秒级时间戳
        self.end_time = end_time        # type: int
        # 运费增项
        self.freight_incr = freight_incr  # type: str
        # 货物数量
        self.goods_amount = goods_amount  # type: int
        # 货物数量单位类型
        self.goods_amount_type = goods_amount_type  # type: str
        # 货物名称
        self.goods_name = goods_name    # type: str
        # 运费扣减
        self.loss_fee = loss_fee        # type: str
        # 网商识别号
        self.partner_id = partner_id    # type: str
        # 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        # 
        self.platform_did = platform_did  # type: str
        # 预付款金额
        self.prepayments = prepayments  # type: str
        # 线下预付ETC
        self.prepayments_buy_etc = prepayments_buy_etc  # type: str
        # 线下气款金额
        self.prepayments_buy_gas = prepayments_buy_gas  # type: str
        # 线下油款预付
        self.prepayments_buy_oil = prepayments_buy_oil  # type: str
        # 预付ETC卡金额
        self.prepayments_etccard = prepayments_etccard  # type: str
        # 预付油卡金额
        self.prepayments_oilcard = prepayments_oilcard  # type: str
        # 油卡赠送金额
        self.present_amount_oil = present_amount_oil  # type: str
        # 起始地详细地址
        self.start_address = start_address  # type: str
        # 起始地CODE，6位区域行政编码
        self.start_city_code = start_city_code  # type: str
        # 起始地城市名称
        self.start_city_name = start_city_name  # type: str
        # 起始地区县CODE，6位区域行政编码
        self.start_county_code = start_county_code  # type: str
        # 起始地区县名称
        self.start_county_name = start_county_name  # type: str
        # 起始行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        self.start_division_code = start_division_code  # type: str
        # 起始地省份CODE，6位区域行政编码
        self.start_province_code = start_province_code  # type: str
        # 起始地省份名称
        self.start_province_name = start_province_name  # type: str
        # 起始地街道CODE，12位区域行政编码
        self.start_street_code = start_street_code  # type: str
        # 起始地街道名称
        self.start_street_name = start_street_name  # type: str
        # 起运时间戳，13位毫秒级时间戳
        self.start_time = start_time    # type: int
        # 运单id
        self.tax_waybill_id = tax_waybill_id  # type: str
        # 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
        self.truck_length = truck_length  # type: str
        # 车型，可以填写：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
        self.truck_type = truck_type    # type: str
        # 运输单价
        self.unit_price = unit_price    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['all_freight'] = self.all_freight
        result['back_fee'] = self.back_fee
        result['business_type'] = self.business_type
        result['cargo_business_code'] = self.cargo_business_code
        result['cargo_code'] = self.cargo_code
        result['cargo_insurance_money'] = self.cargo_insurance_money
        result['cargo_order'] = self.cargo_order
        result['cargo_unit'] = self.cargo_unit
        result['cargo_volume'] = self.cargo_volume
        result['cargo_weight'] = self.cargo_weight
        result['cart_badge_color'] = self.cart_badge_color
        result['cart_badge_no'] = self.cart_badge_no
        result['car_captain_did'] = self.car_captain_did
        result['consignor_freight_amount'] = self.consignor_freight_amount
        result['created_time'] = self.created_time
        result['dest_doors_end_time'] = self.dest_doors_end_time
        result['doors_city_code'] = self.doors_city_code
        result['doors_city_name'] = self.doors_city_name
        result['doors_county_code'] = self.doors_county_code
        result['doors_county_name'] = self.doors_county_name
        result['doors_division_code'] = self.doors_division_code
        result['doors_province_code'] = self.doors_province_code
        result['doors_province_name'] = self.doors_province_name
        result['drawee'] = self.drawee
        result['drawee_tax_no'] = self.drawee_tax_no
        result['driver_did'] = self.driver_did
        result['end_address'] = self.end_address
        result['end_city_code'] = self.end_city_code
        result['end_city_name'] = self.end_city_name
        result['end_county_code'] = self.end_county_code
        result['end_county_name'] = self.end_county_name
        result['end_division_code'] = self.end_division_code
        result['end_province_code'] = self.end_province_code
        result['end_province_name'] = self.end_province_name
        result['end_street_code'] = self.end_street_code
        result['end_street_name'] = self.end_street_name
        result['end_time'] = self.end_time
        result['freight_incr'] = self.freight_incr
        result['goods_amount'] = self.goods_amount
        result['goods_amount_type'] = self.goods_amount_type
        result['goods_name'] = self.goods_name
        result['loss_fee'] = self.loss_fee
        result['partner_id'] = self.partner_id
        result['platform_did'] = self.platform_did
        result['prepayments'] = self.prepayments
        result['prepayments_buy_etc'] = self.prepayments_buy_etc
        result['prepayments_buy_gas'] = self.prepayments_buy_gas
        result['prepayments_buy_oil'] = self.prepayments_buy_oil
        result['prepayments_etccard'] = self.prepayments_etccard
        result['prepayments_oilcard'] = self.prepayments_oilcard
        result['present_amount_oil'] = self.present_amount_oil
        result['start_address'] = self.start_address
        result['start_city_code'] = self.start_city_code
        result['start_city_name'] = self.start_city_name
        result['start_county_code'] = self.start_county_code
        result['start_county_name'] = self.start_county_name
        result['start_division_code'] = self.start_division_code
        result['start_province_code'] = self.start_province_code
        result['start_province_name'] = self.start_province_name
        result['start_street_code'] = self.start_street_code
        result['start_street_name'] = self.start_street_name
        result['start_time'] = self.start_time
        result['tax_waybill_id'] = self.tax_waybill_id
        result['truck_length'] = self.truck_length
        result['truck_type'] = self.truck_type
        result['unit_price'] = self.unit_price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.all_freight = map.get('all_freight')
        self.back_fee = map.get('back_fee')
        self.business_type = map.get('business_type')
        self.cargo_business_code = map.get('cargo_business_code')
        self.cargo_code = map.get('cargo_code')
        self.cargo_insurance_money = map.get('cargo_insurance_money')
        self.cargo_order = map.get('cargo_order')
        self.cargo_unit = map.get('cargo_unit')
        self.cargo_volume = map.get('cargo_volume')
        self.cargo_weight = map.get('cargo_weight')
        self.cart_badge_color = map.get('cart_badge_color')
        self.cart_badge_no = map.get('cart_badge_no')
        self.car_captain_did = map.get('car_captain_did')
        self.consignor_freight_amount = map.get('consignor_freight_amount')
        self.created_time = map.get('created_time')
        self.dest_doors_end_time = map.get('dest_doors_end_time')
        self.doors_city_code = map.get('doors_city_code')
        self.doors_city_name = map.get('doors_city_name')
        self.doors_county_code = map.get('doors_county_code')
        self.doors_county_name = map.get('doors_county_name')
        self.doors_division_code = map.get('doors_division_code')
        self.doors_province_code = map.get('doors_province_code')
        self.doors_province_name = map.get('doors_province_name')
        self.drawee = map.get('drawee')
        self.drawee_tax_no = map.get('drawee_tax_no')
        self.driver_did = map.get('driver_did')
        self.end_address = map.get('end_address')
        self.end_city_code = map.get('end_city_code')
        self.end_city_name = map.get('end_city_name')
        self.end_county_code = map.get('end_county_code')
        self.end_county_name = map.get('end_county_name')
        self.end_division_code = map.get('end_division_code')
        self.end_province_code = map.get('end_province_code')
        self.end_province_name = map.get('end_province_name')
        self.end_street_code = map.get('end_street_code')
        self.end_street_name = map.get('end_street_name')
        self.end_time = map.get('end_time')
        self.freight_incr = map.get('freight_incr')
        self.goods_amount = map.get('goods_amount')
        self.goods_amount_type = map.get('goods_amount_type')
        self.goods_name = map.get('goods_name')
        self.loss_fee = map.get('loss_fee')
        self.partner_id = map.get('partner_id')
        self.platform_did = map.get('platform_did')
        self.prepayments = map.get('prepayments')
        self.prepayments_buy_etc = map.get('prepayments_buy_etc')
        self.prepayments_buy_gas = map.get('prepayments_buy_gas')
        self.prepayments_buy_oil = map.get('prepayments_buy_oil')
        self.prepayments_etccard = map.get('prepayments_etccard')
        self.prepayments_oilcard = map.get('prepayments_oilcard')
        self.present_amount_oil = map.get('present_amount_oil')
        self.start_address = map.get('start_address')
        self.start_city_code = map.get('start_city_code')
        self.start_city_name = map.get('start_city_name')
        self.start_county_code = map.get('start_county_code')
        self.start_county_name = map.get('start_county_name')
        self.start_division_code = map.get('start_division_code')
        self.start_province_code = map.get('start_province_code')
        self.start_province_name = map.get('start_province_name')
        self.start_street_code = map.get('start_street_code')
        self.start_street_name = map.get('start_street_name')
        self.start_time = map.get('start_time')
        self.tax_waybill_id = map.get('tax_waybill_id')
        self.truck_length = map.get('truck_length')
        self.truck_type = map.get('truck_type')
        self.unit_price = map.get('unit_price')
        return self


class UpdateDigitalLogisticFinanceWaybillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 货源支付链上凭证
        # 
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class StartDigitalLogisticFinanceWaybillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cargo_insurance_money=None,
                 cart_badge_color=None, cart_badge_no=None, car_captain_did=None, driver_did=None, platform_did=None,
                 start_time=None, tax_waybill_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 货物运费险
        self.cargo_insurance_money = cargo_insurance_money  # type: str
        # 车牌颜色
        self.cart_badge_color = cart_badge_color  # type: str
        # 车牌号
        self.cart_badge_no = cart_badge_no  # type: str
        # 承运商did
        self.car_captain_did = car_captain_did  # type: str
        # 司机分布式数字身份
        self.driver_did = driver_did    # type: str
        # 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        self.platform_did = platform_did  # type: str
        # 起运时间，13位毫秒级时间戳
        self.start_time = start_time    # type: int
        # 运单id
        self.tax_waybill_id = tax_waybill_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cargo_insurance_money'] = self.cargo_insurance_money
        result['cart_badge_color'] = self.cart_badge_color
        result['cart_badge_no'] = self.cart_badge_no
        result['car_captain_did'] = self.car_captain_did
        result['driver_did'] = self.driver_did
        result['platform_did'] = self.platform_did
        result['start_time'] = self.start_time
        result['tax_waybill_id'] = self.tax_waybill_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cargo_insurance_money = map.get('cargo_insurance_money')
        self.cart_badge_color = map.get('cart_badge_color')
        self.cart_badge_no = map.get('cart_badge_no')
        self.car_captain_did = map.get('car_captain_did')
        self.driver_did = map.get('driver_did')
        self.platform_did = map.get('platform_did')
        self.start_time = map.get('start_time')
        self.tax_waybill_id = map.get('tax_waybill_id')
        return self


class StartDigitalLogisticFinanceWaybillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 货源支付链上凭证
        # 
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CreateDigitalLogisticCaptainDisRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_no=None,
                 extension_info=None, mobile=None, name=None, platform_did=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 身份证号码
        self.cert_no = cert_no          # type: str
        # 扩展字段
        self.extension_info = extension_info  # type: str
        # 手机号码
        self.mobile = mobile            # type: str
        # 姓名
        self.name = name                # type: str
        # 所属平台did
        self.platform_did = platform_did  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_no'] = self.cert_no
        result['extension_info'] = self.extension_info
        result['mobile'] = self.mobile
        result['name'] = self.name
        result['platform_did'] = self.platform_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_no = map.get('cert_no')
        self.extension_info = map.get('extension_info')
        self.mobile = map.get('mobile')
        self.name = map.get('name')
        self.platform_did = map.get('platform_did')
        return self


class CreateDigitalLogisticCaptainDisResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 车队长did
        self.did = did                  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        return self


class CreateDigitalLogisticCargowaybillBillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bill_amount=None,
                 bill_code=None, bill_create_time=None, bill_deadline=None, bill_payer_did=None, cargo_amounts=None,
                 currency=None, pay_amounts=None, platform_did=None, pre_consignor_pay_date=None, waybill_amounts=None,
                 deadline=None, waybill_upload_status=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 货主账单总额（两位小数）
        self.bill_amount = bill_amount  # type: str
        # 账单code（唯一标识）
        self.bill_code = bill_code      # type: str
        # 账单生成时间(毫秒)
        self.bill_create_time = bill_create_time  # type: int
        # 账单期限
        self.bill_deadline = bill_deadline  # type: str
        # 付款方did
        self.bill_payer_did = bill_payer_did  # type: str
        # 货源单号-货主运费列表
        self.cargo_amounts = cargo_amounts  # type: List[CargoAmount]
        # 币种
        self.currency = currency        # type: str
        # 货主支付方式-支付金额列表
        self.pay_amounts = pay_amounts  # type: List[PayAmount]
        # 平台did
        self.platform_did = platform_did  # type: str
        # 预计货主付款日期
        self.pre_consignor_pay_date = pre_consignor_pay_date  # type: int
        # 运单号-司机运费列表
        self.waybill_amounts = waybill_amounts  # type: List[WaybillAmount]
        # 账单到期日期
        self.deadline = deadline        # type: int
        # 运单上传状态，可填写：已完成、未完成
        self.waybill_upload_status = waybill_upload_status  # type: str

    def validate(self):
        if self.cargo_amounts:
            for k in self.cargo_amounts:
                if k:
                    k.validate()
        if self.pay_amounts:
            for k in self.pay_amounts:
                if k:
                    k.validate()
        if self.waybill_amounts:
            for k in self.waybill_amounts:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bill_amount'] = self.bill_amount
        result['bill_code'] = self.bill_code
        result['bill_create_time'] = self.bill_create_time
        result['bill_deadline'] = self.bill_deadline
        result['bill_payer_did'] = self.bill_payer_did
        result['cargo_amounts'] = []
        if self.cargo_amounts is not None:
            for k in self.cargo_amounts:
                result['cargo_amounts'].append(k.to_map() if k else None)
        else:
            result['cargo_amounts'] = None
        result['currency'] = self.currency
        result['pay_amounts'] = []
        if self.pay_amounts is not None:
            for k in self.pay_amounts:
                result['pay_amounts'].append(k.to_map() if k else None)
        else:
            result['pay_amounts'] = None
        result['platform_did'] = self.platform_did
        result['pre_consignor_pay_date'] = self.pre_consignor_pay_date
        result['waybill_amounts'] = []
        if self.waybill_amounts is not None:
            for k in self.waybill_amounts:
                result['waybill_amounts'].append(k.to_map() if k else None)
        else:
            result['waybill_amounts'] = None
        result['deadline'] = self.deadline
        result['waybill_upload_status'] = self.waybill_upload_status
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bill_amount = map.get('bill_amount')
        self.bill_code = map.get('bill_code')
        self.bill_create_time = map.get('bill_create_time')
        self.bill_deadline = map.get('bill_deadline')
        self.bill_payer_did = map.get('bill_payer_did')
        self.cargo_amounts = []
        if map.get('cargo_amounts') is not None:
            for k in map.get('cargo_amounts'):
                temp_model = CargoAmount()
                self.cargo_amounts.append(temp_model.from_map(k))
        else:
            self.cargo_amounts = None
        self.currency = map.get('currency')
        self.pay_amounts = []
        if map.get('pay_amounts') is not None:
            for k in map.get('pay_amounts'):
                temp_model = PayAmount()
                self.pay_amounts.append(temp_model.from_map(k))
        else:
            self.pay_amounts = None
        self.platform_did = map.get('platform_did')
        self.pre_consignor_pay_date = map.get('pre_consignor_pay_date')
        self.waybill_amounts = []
        if map.get('waybill_amounts') is not None:
            for k in map.get('waybill_amounts'):
                temp_model = WaybillAmount()
                self.waybill_amounts.append(temp_model.from_map(k))
        else:
            self.waybill_amounts = None
        self.deadline = map.get('deadline')
        self.waybill_upload_status = map.get('waybill_upload_status')
        return self


class CreateDigitalLogisticCargowaybillBillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class ConfirmDigitalLogisticCargowaybillBillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bill_amount=None,
                 bill_code=None, bill_consignor_did=None, bill_sure_date=None, whether_settle=None, platform_did=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 账单金额（两位小数）
        self.bill_amount = bill_amount  # type: str
        # 账单code（账单唯一标识）
        self.bill_code = bill_code      # type: str
        # 账单确认货主did
        self.bill_consignor_did = bill_consignor_did  # type: str
        # 账单确认日期（毫秒）
        self.bill_sure_date = bill_sure_date  # type: int
        # 是否结算
        self.whether_settle = whether_settle  # type: bool
        # 平台did
        self.platform_did = platform_did  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bill_amount'] = self.bill_amount
        result['bill_code'] = self.bill_code
        result['bill_consignor_did'] = self.bill_consignor_did
        result['bill_sure_date'] = self.bill_sure_date
        result['whether_settle'] = self.whether_settle
        result['platform_did'] = self.platform_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bill_amount = map.get('bill_amount')
        self.bill_code = map.get('bill_code')
        self.bill_consignor_did = map.get('bill_consignor_did')
        self.bill_sure_date = map.get('bill_sure_date')
        self.whether_settle = map.get('whether_settle')
        self.platform_did = map.get('platform_did')
        return self


class ConfirmDigitalLogisticCargowaybillBillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CreateDigitalLogisticCargowaybillBillsettleRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, platform_did=None,
                 bill_code=None, settle_amount=None, settle_status=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 平台did
        self.platform_did = platform_did  # type: str
        # 账单code（账单唯一标识）
        self.bill_code = bill_code      # type: str
        # 结算金额（2位小数）
        self.settle_amount = settle_amount  # type: str
        # 结算状态（只有2种状态：部分结算、已结清）
        self.settle_status = settle_status  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['platform_did'] = self.platform_did
        result['bill_code'] = self.bill_code
        result['settle_amount'] = self.settle_amount
        result['settle_status'] = self.settle_status
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.platform_did = map.get('platform_did')
        self.bill_code = map.get('bill_code')
        self.settle_amount = map.get('settle_amount')
        self.settle_status = map.get('settle_status')
        return self


class CreateDigitalLogisticCargowaybillBillsettleResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class UpdateDigitalLogisticWaybillorderPlatformdidRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, new_platform_did=None,
                 old_platform_did=None, tax_waybill_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 新平台diid
        self.new_platform_did = new_platform_did  # type: str
        # 老平台did
        self.old_platform_did = old_platform_did  # type: str
        # 运单号
        self.tax_waybill_id = tax_waybill_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['new_platform_did'] = self.new_platform_did
        result['old_platform_did'] = self.old_platform_did
        result['tax_waybill_id'] = self.tax_waybill_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.new_platform_did = map.get('new_platform_did')
        self.old_platform_did = map.get('old_platform_did')
        self.tax_waybill_id = map.get('tax_waybill_id')
        return self


class UpdateDigitalLogisticWaybillorderPlatformdidResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class UpdateDigitalLogisticCargowaybillBillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bill_amount=None,
                 bill_code=None, bill_create_time=None, bill_deadline=None, bill_payer_did=None, cargo_amounts=None,
                 currency=None, deadline=None, pay_amounts=None, platform_did=None, pre_consignor_pay_date=None,
                 waybill_amounts=None, waybill_upload_status=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 货主账单总额（两位小数）
        self.bill_amount = bill_amount  # type: str
        # 账单code（唯一标识）
        self.bill_code = bill_code      # type: str
        # 账单生成时间(毫秒)
        self.bill_create_time = bill_create_time  # type: int
        # 账单期限
        self.bill_deadline = bill_deadline  # type: str
        # 付款方did
        self.bill_payer_did = bill_payer_did  # type: str
        # 货源单号-货主运费列表
        self.cargo_amounts = cargo_amounts  # type: List[CargoAmount]
        # 币种
        self.currency = currency        # type: str
        # 账单到期日期
        self.deadline = deadline        # type: int
        # 货主支付方式-支付金额列表
        self.pay_amounts = pay_amounts  # type: List[PayAmount]
        # 平台did
        self.platform_did = platform_did  # type: str
        # 预计货主付款日期
        self.pre_consignor_pay_date = pre_consignor_pay_date  # type: int
        # 运单号-司机运费列表
        self.waybill_amounts = waybill_amounts  # type: List[WaybillAmount]
        # 运单上传状态，可填写：已完成、未完成
        self.waybill_upload_status = waybill_upload_status  # type: str

    def validate(self):
        if self.cargo_amounts:
            for k in self.cargo_amounts:
                if k:
                    k.validate()
        if self.pay_amounts:
            for k in self.pay_amounts:
                if k:
                    k.validate()
        if self.waybill_amounts:
            for k in self.waybill_amounts:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bill_amount'] = self.bill_amount
        result['bill_code'] = self.bill_code
        result['bill_create_time'] = self.bill_create_time
        result['bill_deadline'] = self.bill_deadline
        result['bill_payer_did'] = self.bill_payer_did
        result['cargo_amounts'] = []
        if self.cargo_amounts is not None:
            for k in self.cargo_amounts:
                result['cargo_amounts'].append(k.to_map() if k else None)
        else:
            result['cargo_amounts'] = None
        result['currency'] = self.currency
        result['deadline'] = self.deadline
        result['pay_amounts'] = []
        if self.pay_amounts is not None:
            for k in self.pay_amounts:
                result['pay_amounts'].append(k.to_map() if k else None)
        else:
            result['pay_amounts'] = None
        result['platform_did'] = self.platform_did
        result['pre_consignor_pay_date'] = self.pre_consignor_pay_date
        result['waybill_amounts'] = []
        if self.waybill_amounts is not None:
            for k in self.waybill_amounts:
                result['waybill_amounts'].append(k.to_map() if k else None)
        else:
            result['waybill_amounts'] = None
        result['waybill_upload_status'] = self.waybill_upload_status
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bill_amount = map.get('bill_amount')
        self.bill_code = map.get('bill_code')
        self.bill_create_time = map.get('bill_create_time')
        self.bill_deadline = map.get('bill_deadline')
        self.bill_payer_did = map.get('bill_payer_did')
        self.cargo_amounts = []
        if map.get('cargo_amounts') is not None:
            for k in map.get('cargo_amounts'):
                temp_model = CargoAmount()
                self.cargo_amounts.append(temp_model.from_map(k))
        else:
            self.cargo_amounts = None
        self.currency = map.get('currency')
        self.deadline = map.get('deadline')
        self.pay_amounts = []
        if map.get('pay_amounts') is not None:
            for k in map.get('pay_amounts'):
                temp_model = PayAmount()
                self.pay_amounts.append(temp_model.from_map(k))
        else:
            self.pay_amounts = None
        self.platform_did = map.get('platform_did')
        self.pre_consignor_pay_date = map.get('pre_consignor_pay_date')
        self.waybill_amounts = []
        if map.get('waybill_amounts') is not None:
            for k in map.get('waybill_amounts'):
                temp_model = WaybillAmount()
                self.waybill_amounts.append(temp_model.from_map(k))
        else:
            self.waybill_amounts = None
        self.waybill_upload_status = map.get('waybill_upload_status')
        return self


class UpdateDigitalLogisticCargowaybillBillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CreateDigitalLogisticDisDidRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_no=None, ep_cert_name=None,
                 ep_cert_no=None, extension_info=None, legal_person_cert_name=None, legal_person_cert_no=None, mobile=None,
                 name=None, organization_type=None, platform_did=None, role_type=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 个人身份证号。当组织类型为个人时，此字段为必填项
        self.cert_no = cert_no          # type: str
        # 企业名称。当组织类型为企业时，此字段为必填项
        self.ep_cert_name = ep_cert_name  # type: str
        # 企业信用号码。当组织类型为企业时，此字段为必填项
        self.ep_cert_no = ep_cert_no    # type: str
        # 扩展字段
        self.extension_info = extension_info  # type: str
        # 企业法人姓名。当申请企业类型网络货运平台或者子平台时，此字段为必填项
        self.legal_person_cert_name = legal_person_cert_name  # type: str
        # 企业法人身份证号码。当申请企业类型网络货运平台或者子平台时，此字段为必填项
        self.legal_person_cert_no = legal_person_cert_no  # type: str
        # 个人手机号码。当组织类型为个人时，此字段为必填项
        self.mobile = mobile            # type: str
        # 个人姓名。当组织类型为个人时，此字段为必填项
        self.name = name                # type: str
        # 组织类型。企业或者个人，二选一填入
        self.organization_type = organization_type  # type: str
        # 所属承运平台did。在申请“网络货运平台”角色的时候，这个字段非必填；申请其他角色类型时，此字段必填
        self.platform_did = platform_did  # type: str
        # 角色类型。
        # 当组织类型为个人时，可填角色：货主、司机、承运商；
        # 当组织类型为企业时，可填角色：网络货运平台、道路运输企业/3pl、货主、子平台、承运商
        self.role_type = role_type      # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_no'] = self.cert_no
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['extension_info'] = self.extension_info
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        result['mobile'] = self.mobile
        result['name'] = self.name
        result['organization_type'] = self.organization_type
        result['platform_did'] = self.platform_did
        result['role_type'] = self.role_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_no = map.get('cert_no')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.extension_info = map.get('extension_info')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        self.mobile = map.get('mobile')
        self.name = map.get('name')
        self.organization_type = map.get('organization_type')
        self.platform_did = map.get('platform_did')
        self.role_type = map.get('role_type')
        return self


class CreateDigitalLogisticDisDidResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None, organization_type=None,
                 role_types=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 分布式数字身份did
        self.did = did                  # type: str
        # 组织类型
        self.organization_type = organization_type  # type: str
        # 现阶段此did下的所有授予的角色
        self.role_types = role_types    # type: List[str]

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        result['organization_type'] = self.organization_type
        result['role_types'] = self.role_types
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        self.organization_type = map.get('organization_type')
        self.role_types = map.get('role_types')
        return self


class UploadDigitalLogisticTransportContractRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, consignor_did=None,
                 contract_effective_date=None, contract_expires_date=None, file_infos=None, third_party_logistics_did=None,
                 transport_contract_code=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 货主did，一般为合同甲方的链上数字身份
        self.consignor_did = consignor_did  # type: str
        # 运输合同生效日期，格式要求yyyy-MM-dd
        self.contract_effective_date = contract_effective_date  # type: str
        # 运输合同到期日期，要求格式yyyy-MM-dd
        self.contract_expires_date = contract_expires_date  # type: str
        # 影像件文件信息列表，可以包含多个文件，每个文件需要有文件id和文件hash  (请求蚂蚁影像上传接口获取的文件id和文件hash)。影像文件格式要求：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
        self.file_infos = file_infos    # type: List[UploadFileInfo]
        # 3plDid，一般为合同乙方的链上数字身份
        self.third_party_logistics_did = third_party_logistics_did  # type: str
        # 运输合同编号
        self.transport_contract_code = transport_contract_code  # type: str

    def validate(self):
        if self.file_infos:
            for k in self.file_infos:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['consignor_did'] = self.consignor_did
        result['contract_effective_date'] = self.contract_effective_date
        result['contract_expires_date'] = self.contract_expires_date
        result['file_infos'] = []
        if self.file_infos is not None:
            for k in self.file_infos:
                result['file_infos'].append(k.to_map() if k else None)
        else:
            result['file_infos'] = None
        result['third_party_logistics_did'] = self.third_party_logistics_did
        result['transport_contract_code'] = self.transport_contract_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.consignor_did = map.get('consignor_did')
        self.contract_effective_date = map.get('contract_effective_date')
        self.contract_expires_date = map.get('contract_expires_date')
        self.file_infos = []
        if map.get('file_infos') is not None:
            for k in map.get('file_infos'):
                temp_model = UploadFileInfo()
                self.file_infos.append(temp_model.from_map(k))
        else:
            self.file_infos = None
        self.third_party_logistics_did = map.get('third_party_logistics_did')
        self.transport_contract_code = map.get('transport_contract_code')
        return self


class UploadDigitalLogisticTransportContractResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class UploadDigitalLogisticTransportRouteRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, end_address=None,
                 end_detailed_address=None, start_address=None, start_detailed_address=None, third_party_logistics_did=None,
                 transport_contract_code=None, transport_route_code=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
        self.end_address = end_address  # type: str
        # 目的地详细地址，街道村社区道路楼宇门牌号
        self.end_detailed_address = end_detailed_address  # type: str
        # 起始地省市区，要求格式  XX省-XX市-XX区。比如浙江省-杭州市-余杭区
        self.start_address = start_address  # type: str
        # 起始地详细地址，街道村社区道路楼宇门牌号
        self.start_detailed_address = start_detailed_address  # type: str
        # 3plDid
        self.third_party_logistics_did = third_party_logistics_did  # type: str
        # 运输合同编号
        self.transport_contract_code = transport_contract_code  # type: str
        # 运输线路编码
        self.transport_route_code = transport_route_code  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['end_address'] = self.end_address
        result['end_detailed_address'] = self.end_detailed_address
        result['start_address'] = self.start_address
        result['start_detailed_address'] = self.start_detailed_address
        result['third_party_logistics_did'] = self.third_party_logistics_did
        result['transport_contract_code'] = self.transport_contract_code
        result['transport_route_code'] = self.transport_route_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.end_address = map.get('end_address')
        self.end_detailed_address = map.get('end_detailed_address')
        self.start_address = map.get('start_address')
        self.start_detailed_address = map.get('start_detailed_address')
        self.third_party_logistics_did = map.get('third_party_logistics_did')
        self.transport_contract_code = map.get('transport_contract_code')
        self.transport_route_code = map.get('transport_route_code')
        return self


class UploadDigitalLogisticTransportRouteResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CreateDigitalLogisticTransportWaybillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, all_freight=None,
                 cargo_name=None, cargo_volume=None, cargo_weight=None, carrier_did=None, car_badge_color=None,
                 car_badge_no=None, consignor_did=None, create_time=None, driver_did=None, end_address=None,
                 end_detailed_address=None, goods_amount=None, goods_amount_type=None, start_address=None, start_detailed_address=None,
                 tax_waybill_id=None, third_party_logistics_did=None, transport_contract_code=None, transport_route_code=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
        self.all_freight = all_freight  # type: str
        # 货物名称
        self.cargo_name = cargo_name    # type: str
        # 货物体积，单位（方）。货物重量、货物体积二选一填写
        self.cargo_volume = cargo_volume  # type: str
        # 货物重量，单位（吨）。货物重量、货物体积二选一填写
        self.cargo_weight = cargo_weight  # type: str
        # 下游承运商did，一般为下一级承运商数字身份
        self.carrier_did = carrier_did  # type: str
        # 车牌颜色，需填写黄色、蓝色、绿色中的一种
        self.car_badge_color = car_badge_color  # type: str
        # 车牌号，承运车牌号
        self.car_badge_no = car_badge_no  # type: str
        # 货主did，一般为合同甲方的链上数字身份
        self.consignor_did = consignor_did  # type: str
        # 创建时间，13位毫秒级时间戳
        self.create_time = create_time  # type: int
        # 实际承运司机did，实际承运司机的链上数字身份
        self.driver_did = driver_did    # type: str
        # 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
        self.end_address = end_address  # type: str
        # 目的地详细地址，街道村社区道路楼宇门牌号
        self.end_detailed_address = end_detailed_address  # type: str
        # 货物数量
        self.goods_amount = goods_amount  # type: int
        # 货物数量单位类型
        self.goods_amount_type = goods_amount_type  # type: str
        # 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
        self.start_address = start_address  # type: str
        # 起始地详细地址，街道村社区道路楼宇门牌号
        self.start_detailed_address = start_detailed_address  # type: str
        # 客户系统内运单编号
        self.tax_waybill_id = tax_waybill_id  # type: str
        # 3plDid，一般为合同乙方的链上数字身份
        self.third_party_logistics_did = third_party_logistics_did  # type: str
        # 所属合同编号
        self.transport_contract_code = transport_contract_code  # type: str
        # 所属运输线路编码
        self.transport_route_code = transport_route_code  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['all_freight'] = self.all_freight
        result['cargo_name'] = self.cargo_name
        result['cargo_volume'] = self.cargo_volume
        result['cargo_weight'] = self.cargo_weight
        result['carrier_did'] = self.carrier_did
        result['car_badge_color'] = self.car_badge_color
        result['car_badge_no'] = self.car_badge_no
        result['consignor_did'] = self.consignor_did
        result['create_time'] = self.create_time
        result['driver_did'] = self.driver_did
        result['end_address'] = self.end_address
        result['end_detailed_address'] = self.end_detailed_address
        result['goods_amount'] = self.goods_amount
        result['goods_amount_type'] = self.goods_amount_type
        result['start_address'] = self.start_address
        result['start_detailed_address'] = self.start_detailed_address
        result['tax_waybill_id'] = self.tax_waybill_id
        result['third_party_logistics_did'] = self.third_party_logistics_did
        result['transport_contract_code'] = self.transport_contract_code
        result['transport_route_code'] = self.transport_route_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.all_freight = map.get('all_freight')
        self.cargo_name = map.get('cargo_name')
        self.cargo_volume = map.get('cargo_volume')
        self.cargo_weight = map.get('cargo_weight')
        self.carrier_did = map.get('carrier_did')
        self.car_badge_color = map.get('car_badge_color')
        self.car_badge_no = map.get('car_badge_no')
        self.consignor_did = map.get('consignor_did')
        self.create_time = map.get('create_time')
        self.driver_did = map.get('driver_did')
        self.end_address = map.get('end_address')
        self.end_detailed_address = map.get('end_detailed_address')
        self.goods_amount = map.get('goods_amount')
        self.goods_amount_type = map.get('goods_amount_type')
        self.start_address = map.get('start_address')
        self.start_detailed_address = map.get('start_detailed_address')
        self.tax_waybill_id = map.get('tax_waybill_id')
        self.third_party_logistics_did = map.get('third_party_logistics_did')
        self.transport_contract_code = map.get('transport_contract_code')
        self.transport_route_code = map.get('transport_route_code')
        return self


class CreateDigitalLogisticTransportWaybillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class UpdateDigitalLogisticWaybillActionRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, operate_action=None,
                 operate_action_time=None, tax_waybill_id=None, third_party_logistics_did=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作类型，以下二选一填写：运单起运、运输完成
        self.operate_action = operate_action  # type: str
        # 运单起运或运输完成的时间，要求为13位毫秒级时间戳
        self.operate_action_time = operate_action_time  # type: int
        # 客户系统内运单编号
        self.tax_waybill_id = tax_waybill_id  # type: str
        # 3plDid，一般为合同乙方的链上数字身份
        self.third_party_logistics_did = third_party_logistics_did  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['operate_action'] = self.operate_action
        result['operate_action_time'] = self.operate_action_time
        result['tax_waybill_id'] = self.tax_waybill_id
        result['third_party_logistics_did'] = self.third_party_logistics_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.operate_action = map.get('operate_action')
        self.operate_action_time = map.get('operate_action_time')
        self.tax_waybill_id = map.get('tax_waybill_id')
        self.third_party_logistics_did = map.get('third_party_logistics_did')
        return self


class UpdateDigitalLogisticWaybillActionResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class UpdateDigitalLogisticTransportWaybillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, all_freight=None,
                 cargo_name=None, cargo_volume=None, cargo_weight=None, carrier_did=None, car_badge_color=None,
                 car_badge_no=None, consignor_did=None, create_time=None, driver_did=None, end_address=None,
                 end_detailed_address=None, end_time=None, goods_amount=None, goods_amount_type=None, start_address=None,
                 start_detailed_address=None, start_time=None, tax_waybill_id=None, third_party_logistics_did=None,
                 transport_contract_code=None, transport_route_code=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
        self.all_freight = all_freight  # type: str
        # 货物名称
        self.cargo_name = cargo_name    # type: str
        # 单位（方），货物体积
        self.cargo_volume = cargo_volume  # type: str
        # 单位（吨），货物重量
        self.cargo_weight = cargo_weight  # type: str
        # 下游承运商did，一般为下一级承运商数字身份
        self.carrier_did = carrier_did  # type: str
        # 车牌颜色，需填写黄色、蓝色、绿色中的一种
        self.car_badge_color = car_badge_color  # type: str
        # 车牌号，承运车牌号
        self.car_badge_no = car_badge_no  # type: str
        # 货主did，一般为合同甲方的链上数字身份
        self.consignor_did = consignor_did  # type: str
        # 创建时间，13位毫秒级时间戳
        self.create_time = create_time  # type: int
        # 实际承运司机did，实际承运司机的链上数字身份
        self.driver_did = driver_did    # type: str
        # 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
        self.end_address = end_address  # type: str
        # 目的地详细地址，街道村社区道路楼宇门牌号
        self.end_detailed_address = end_detailed_address  # type: str
        # 到达时间，13位毫秒级时间戳
        self.end_time = end_time        # type: int
        # 货物数量
        self.goods_amount = goods_amount  # type: int
        # 货物数量单位类型
        self.goods_amount_type = goods_amount_type  # type: str
        # 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
        self.start_address = start_address  # type: str
        # 起始地详细地址，街道村社区道路楼宇门牌号
        self.start_detailed_address = start_detailed_address  # type: str
        # 起运时间，13位毫秒级时间戳
        self.start_time = start_time    # type: int
        # 客户系统内运单编号
        self.tax_waybill_id = tax_waybill_id  # type: str
        # 3plDid，一般为合同乙方的链上数字身份
        self.third_party_logistics_did = third_party_logistics_did  # type: str
        # 所属合同编号
        self.transport_contract_code = transport_contract_code  # type: str
        # 所属运输线路编码
        self.transport_route_code = transport_route_code  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['all_freight'] = self.all_freight
        result['cargo_name'] = self.cargo_name
        result['cargo_volume'] = self.cargo_volume
        result['cargo_weight'] = self.cargo_weight
        result['carrier_did'] = self.carrier_did
        result['car_badge_color'] = self.car_badge_color
        result['car_badge_no'] = self.car_badge_no
        result['consignor_did'] = self.consignor_did
        result['create_time'] = self.create_time
        result['driver_did'] = self.driver_did
        result['end_address'] = self.end_address
        result['end_detailed_address'] = self.end_detailed_address
        result['end_time'] = self.end_time
        result['goods_amount'] = self.goods_amount
        result['goods_amount_type'] = self.goods_amount_type
        result['start_address'] = self.start_address
        result['start_detailed_address'] = self.start_detailed_address
        result['start_time'] = self.start_time
        result['tax_waybill_id'] = self.tax_waybill_id
        result['third_party_logistics_did'] = self.third_party_logistics_did
        result['transport_contract_code'] = self.transport_contract_code
        result['transport_route_code'] = self.transport_route_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.all_freight = map.get('all_freight')
        self.cargo_name = map.get('cargo_name')
        self.cargo_volume = map.get('cargo_volume')
        self.cargo_weight = map.get('cargo_weight')
        self.carrier_did = map.get('carrier_did')
        self.car_badge_color = map.get('car_badge_color')
        self.car_badge_no = map.get('car_badge_no')
        self.consignor_did = map.get('consignor_did')
        self.create_time = map.get('create_time')
        self.driver_did = map.get('driver_did')
        self.end_address = map.get('end_address')
        self.end_detailed_address = map.get('end_detailed_address')
        self.end_time = map.get('end_time')
        self.goods_amount = map.get('goods_amount')
        self.goods_amount_type = map.get('goods_amount_type')
        self.start_address = map.get('start_address')
        self.start_detailed_address = map.get('start_detailed_address')
        self.start_time = map.get('start_time')
        self.tax_waybill_id = map.get('tax_waybill_id')
        self.third_party_logistics_did = map.get('third_party_logistics_did')
        self.transport_contract_code = map.get('transport_contract_code')
        self.transport_route_code = map.get('transport_route_code')
        return self


class UpdateDigitalLogisticTransportWaybillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class UploadDigitalLogisticTransportReceiptRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, consignor_did=None,
                 file_info=None, receipt_id=None, tax_waybill_id=None, third_party_logistics_did=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 货主did，一般为合同甲方的链上数字身份
        self.consignor_did = consignor_did  # type: str
        # 请求蚂蚁影像上传接口上传文件获取的文件id和文件hash信息。影像文件格式：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
        self.file_info = file_info      # type: UploadFileInfo
        # 回单id，客户编辑的唯一回单编码
        self.receipt_id = receipt_id    # type: str
        # 客户系统内运单编号
        self.tax_waybill_id = tax_waybill_id  # type: str
        # 3plDid，一般为合同乙方的链上数字身份
        self.third_party_logistics_did = third_party_logistics_did  # type: str

    def validate(self):
        if self.file_info:
            self.file_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['consignor_did'] = self.consignor_did
        if self.file_info is not None:
            result['file_info'] = self.file_info.to_map()
        else:
            result['file_info'] = None
        result['receipt_id'] = self.receipt_id
        result['tax_waybill_id'] = self.tax_waybill_id
        result['third_party_logistics_did'] = self.third_party_logistics_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.consignor_did = map.get('consignor_did')
        if map.get('file_info') is not None:
            temp_model = UploadFileInfo()
            self.file_info = temp_model.from_map(map['file_info'])
        else:
            self.file_info = None
        self.receipt_id = map.get('receipt_id')
        self.tax_waybill_id = map.get('tax_waybill_id')
        self.third_party_logistics_did = map.get('third_party_logistics_did')
        return self


class UploadDigitalLogisticTransportReceiptResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CreateDigitalLogisticBillReceivablebillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bill_amount=None,
                 bill_create_time=None, bill_deadline=None, bill_id=None, bill_payee_did=None, bill_payer_did=None,
                 bill_start_time=None, contract_code=None, deadline=None, waybill_ids=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
        self.bill_amount = bill_amount  # type: str
        # 账单生成时间，13位毫秒级时间戳
        self.bill_create_time = bill_create_time  # type: int
        # 账单期限，单位（天），合同约定的结算周期
        self.bill_deadline = bill_deadline  # type: int
        # 账单id，客户生成的账单唯一编号
        self.bill_id = bill_id          # type: str
        # 收款方did，账单的收款方数字身份
        self.bill_payee_did = bill_payee_did  # type: str
        # 付款方did，账单的付款方数字身份
        self.bill_payer_did = bill_payer_did  # type: str
        # 账单起始日期，13位毫秒级时间戳
        self.bill_start_time = bill_start_time  # type: int
        # 关联合同编号，账单关联的合同编号，如为合同物流请填写
        # 
        self.contract_code = contract_code  # type: str
        # 账单到期日期，13位毫秒级时间戳
        self.deadline = deadline        # type: int
        # 账单关联运单号数组，元素个数不能超过1000个
        self.waybill_ids = waybill_ids  # type: List[str]

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bill_amount'] = self.bill_amount
        result['bill_create_time'] = self.bill_create_time
        result['bill_deadline'] = self.bill_deadline
        result['bill_id'] = self.bill_id
        result['bill_payee_did'] = self.bill_payee_did
        result['bill_payer_did'] = self.bill_payer_did
        result['bill_start_time'] = self.bill_start_time
        result['contract_code'] = self.contract_code
        result['deadline'] = self.deadline
        result['waybill_ids'] = self.waybill_ids
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bill_amount = map.get('bill_amount')
        self.bill_create_time = map.get('bill_create_time')
        self.bill_deadline = map.get('bill_deadline')
        self.bill_id = map.get('bill_id')
        self.bill_payee_did = map.get('bill_payee_did')
        self.bill_payer_did = map.get('bill_payer_did')
        self.bill_start_time = map.get('bill_start_time')
        self.contract_code = map.get('contract_code')
        self.deadline = map.get('deadline')
        self.waybill_ids = map.get('waybill_ids')
        return self


class CreateDigitalLogisticBillReceivablebillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class UpdateDigitalLogisticReceivablebillStatusRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bill_id=None,
                 bill_payee_did=None, update_status=None, update_status_time=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 账单id，客户生成的账单唯一编号
        self.bill_id = bill_id          # type: str
        # 收款方did，账单的收款方数字身份
        self.bill_payee_did = bill_payee_did  # type: str
        # 账单后续所可能产生的状态，以下三选一填写：账单确认、部分结算、已结清
        # 
        # 
        self.update_status = update_status  # type: str
        # 更新状态时间，13位毫秒级时间戳
        self.update_status_time = update_status_time  # type: int

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bill_id'] = self.bill_id
        result['bill_payee_did'] = self.bill_payee_did
        result['update_status'] = self.update_status
        result['update_status_time'] = self.update_status_time
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bill_id = map.get('bill_id')
        self.bill_payee_did = map.get('bill_payee_did')
        self.update_status = map.get('update_status')
        self.update_status_time = map.get('update_status_time')
        return self


class UpdateDigitalLogisticReceivablebillStatusResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class UpdateDigitalLogisticBillReceivablebillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bill_amount=None,
                 bill_create_time=None, bill_deadline=None, bill_id=None, bill_payee_did=None, bill_payer_did=None,
                 bill_start_time=None, contract_code=None, deadline=None, waybill_ids=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
        self.bill_amount = bill_amount  # type: str
        # 账单生成时间，13位毫秒级时间戳
        self.bill_create_time = bill_create_time  # type: int
        # 账单期限，单位（天），合同约定的结算周期
        self.bill_deadline = bill_deadline  # type: int
        # 账单id，客户生成的账单唯一编号
        self.bill_id = bill_id          # type: str
        # 收款方did，账单的收款方数字身份
        self.bill_payee_did = bill_payee_did  # type: str
        # 付款方did，账单的付款方数字身份
        self.bill_payer_did = bill_payer_did  # type: str
        # 账单起始日期，13位毫秒级时间戳
        self.bill_start_time = bill_start_time  # type: int
        # 关联合同编号，账单关联的合同编号，如为合同物流请填写
        self.contract_code = contract_code  # type: str
        # 账单到期日期，13位毫秒级时间戳
        self.deadline = deadline        # type: int
        # 账单关联运单号数组，元素个数不能超过1000个
        self.waybill_ids = waybill_ids  # type: List[str]

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bill_amount'] = self.bill_amount
        result['bill_create_time'] = self.bill_create_time
        result['bill_deadline'] = self.bill_deadline
        result['bill_id'] = self.bill_id
        result['bill_payee_did'] = self.bill_payee_did
        result['bill_payer_did'] = self.bill_payer_did
        result['bill_start_time'] = self.bill_start_time
        result['contract_code'] = self.contract_code
        result['deadline'] = self.deadline
        result['waybill_ids'] = self.waybill_ids
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bill_amount = map.get('bill_amount')
        self.bill_create_time = map.get('bill_create_time')
        self.bill_deadline = map.get('bill_deadline')
        self.bill_id = map.get('bill_id')
        self.bill_payee_did = map.get('bill_payee_did')
        self.bill_payer_did = map.get('bill_payer_did')
        self.bill_start_time = map.get('bill_start_time')
        self.contract_code = map.get('contract_code')
        self.deadline = map.get('deadline')
        self.waybill_ids = map.get('waybill_ids')
        return self


class UpdateDigitalLogisticBillReceivablebillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class CreateDigitalLogisticHighwayInvoiceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, invoice_no=None,
                 invoice_code=None, verify_code=None, payee_did=None, payer_did=None, invoice_contains_tax=None,
                 invoice_without_tax=None, invoice_date=None, invoice_type=None, file_id=None, file_hash=None, platform_did=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 发票号码，8位发票号码
        self.invoice_no = invoice_no    # type: str
        # 发票代码，12位发票代码
        self.invoice_code = invoice_code  # type: str
        # 发票校验码后6位
        self.verify_code = verify_code  # type: str
        # 收款方did，出票方，需要出票收钱的
        self.payee_did = payee_did      # type: str
        # 付款方did，收票方，需要收票付钱的
        self.payer_did = payer_did      # type: str
        # 发票含税金额， 不超过2位小数的数字
        self.invoice_contains_tax = invoice_contains_tax  # type: str
        # 发票不含税金额，不超过2位小数的数字
        self.invoice_without_tax = invoice_without_tax  # type: str
        # 开票日期，格式为yyyy-mm-dd
        self.invoice_date = invoice_date  # type: str
        # 发票类型，以下二选一填写：应收发票、应付发票
        self.invoice_type = invoice_type  # type: str
        # 影像件ID，发票上传蚂蚁oss的文件ID。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
        self.file_id = file_id          # type: str
        # 影像件hash，上传蚂蚁oss的文件hash。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
        self.file_hash = file_hash      # type: str
        # 发票归属平台did，用以区分是哪家平台/企业的发票
        self.platform_did = platform_did  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['invoice_no'] = self.invoice_no
        result['invoice_code'] = self.invoice_code
        result['verify_code'] = self.verify_code
        result['payee_did'] = self.payee_did
        result['payer_did'] = self.payer_did
        result['invoice_contains_tax'] = self.invoice_contains_tax
        result['invoice_without_tax'] = self.invoice_without_tax
        result['invoice_date'] = self.invoice_date
        result['invoice_type'] = self.invoice_type
        result['file_id'] = self.file_id
        result['file_hash'] = self.file_hash
        result['platform_did'] = self.platform_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.invoice_no = map.get('invoice_no')
        self.invoice_code = map.get('invoice_code')
        self.verify_code = map.get('verify_code')
        self.payee_did = map.get('payee_did')
        self.payer_did = map.get('payer_did')
        self.invoice_contains_tax = map.get('invoice_contains_tax')
        self.invoice_without_tax = map.get('invoice_without_tax')
        self.invoice_date = map.get('invoice_date')
        self.invoice_type = map.get('invoice_type')
        self.file_id = map.get('file_id')
        self.file_hash = map.get('file_hash')
        self.platform_did = map.get('platform_did')
        return self


class CreateDigitalLogisticHighwayInvoiceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_code=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_code = tx_code          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_code'] = self.tx_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_code = map.get('tx_code')
        return self


class OpenDigitalLogisticCreditDriverRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None,
                 callback_url=None, driver_did=None, group_platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 司机云资金商户ID
        self.account_id = account_id    # type: str
        # 开通结果回调url
        self.callback_url = callback_url  # type: str
        # 司机分布式数字身份
        self.driver_did = driver_did    # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 产品id 目前填写 PRODUCT_MYBANK
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['callback_url'] = self.callback_url
        result['driver_did'] = self.driver_did
        result['group_platform_did'] = self.group_platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.callback_url = map.get('callback_url')
        self.driver_did = map.get('driver_did')
        self.group_platform_did = map.get('group_platform_did')
        self.product_id = map.get('product_id')
        return self


class OpenDigitalLogisticCreditDriverResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, apply_id=None, sign_url=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 签署开通申请id
        self.apply_id = apply_id        # type: str
        # 协议签署开通url
        self.sign_url = sign_url        # type: str
        # 签署状态
        # -1:签署开通失败, 0:未签署开通, 1:已签署开通
        self.status = status            # type: int

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['apply_id'] = self.apply_id
        result['sign_url'] = self.sign_url
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.apply_id = map.get('apply_id')
        self.sign_url = map.get('sign_url')
        self.status = map.get('status')
        return self


class QueryDigitalLogisticCreditDriverRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, apply_id=None, did=None,
                 group_platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 申请id
        self.apply_id = apply_id        # type: str
        # 司机分布式数字身份
        self.did = did                  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 产品id  目前填写PRODUCT_MYBANK
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['apply_id'] = self.apply_id
        result['did'] = self.did
        result['group_platform_did'] = self.group_platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.apply_id = map.get('apply_id')
        self.did = map.get('did')
        self.group_platform_did = map.get('group_platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditDriverResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, query_msg=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 开通失败信息
        self.query_msg = query_msg      # type: str
        # 开通状态
        # -1:失败状态， 0:未完成状态， 1:已完成状态
        self.status = status            # type: int

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['query_msg'] = self.query_msg
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.query_msg = map.get('query_msg')
        self.status = map.get('status')
        return self


class QueryDigitalLogisticCreditConsignorRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, apply_id=None, did=None,
                 group_platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 申请id
        self.apply_id = apply_id        # type: str
        # 货主分布式数字身份
        self.did = did                  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 产品id
        # A模式： PRODUCT_MYBANK,
        # A+模式： PRODUCT_MYBANK_A_PLUS,
        # B模式： PRODUCT_MYBANK_B,
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['apply_id'] = self.apply_id
        result['did'] = self.did
        result['group_platform_did'] = self.group_platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.apply_id = map.get('apply_id')
        self.did = map.get('did')
        self.group_platform_did = map.get('group_platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditConsignorResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, query_msg=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 开通失败信息
        self.query_msg = query_msg      # type: str
        # 开通状态
        # -1:失败状态， 0:未完成状态， 1:已完成状态
        self.status = status            # type: int

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['query_msg'] = self.query_msg
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.query_msg = map.get('query_msg')
        self.status = map.get('status')
        return self


class QueryDigitalLogisticCreditBalanceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, consignor_did=None,
                 freight=None, group_platform_did=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 货主分布式数字身份
        self.consignor_did = consignor_did  # type: str
        # 支付单运费，运费最多精确到小数点后2位
        self.freight = freight          # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        # A模式：PRODUCT_MYBANK,
        # A+模式：PRODUCT_MYBANK_A_PLUS,
        # B模式：PRODUCT_MYBANK_B,
        # 
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['consignor_did'] = self.consignor_did
        result['freight'] = self.freight
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.consignor_did = map.get('consignor_did')
        self.freight = map.get('freight')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditBalanceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, has_balance=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 是否有信用流转额度
        self.has_balance = has_balance  # type: bool

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['has_balance'] = self.has_balance
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.has_balance = map.get('has_balance')
        return self


class UploadDigitalLogisticCreditIssueRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, batch_id=None,
                 callback_url=None, consignor_did=None, group_platform_did=None, issue_apply_infos=None, platform_did=None,
                 product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 批次号
        self.batch_id = batch_id        # type: str
        # 发行结果回调url
        self.callback_url = callback_url  # type: str
        # 货主分布式数字身份
        self.consignor_did = consignor_did  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 发行信用流转信息列表
        self.issue_apply_infos = issue_apply_infos  # type: List[IssueApplyInfo]
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id 目前填PRODUCT_MYBANK
        self.product_id = product_id    # type: str

    def validate(self):
        if self.issue_apply_infos:
            for k in self.issue_apply_infos:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['batch_id'] = self.batch_id
        result['callback_url'] = self.callback_url
        result['consignor_did'] = self.consignor_did
        result['group_platform_did'] = self.group_platform_did
        result['issue_apply_infos'] = []
        if self.issue_apply_infos is not None:
            for k in self.issue_apply_infos:
                result['issue_apply_infos'].append(k.to_map() if k else None)
        else:
            result['issue_apply_infos'] = None
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.batch_id = map.get('batch_id')
        self.callback_url = map.get('callback_url')
        self.consignor_did = map.get('consignor_did')
        self.group_platform_did = map.get('group_platform_did')
        self.issue_apply_infos = []
        if map.get('issue_apply_infos') is not None:
            for k in map.get('issue_apply_infos'):
                temp_model = IssueApplyInfo()
                self.issue_apply_infos.append(temp_model.from_map(k))
        else:
            self.issue_apply_infos = None
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class UploadDigitalLogisticCreditIssueResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None, batch_id_status=None,
                 issue_url=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 批次号
        self.batch_id = batch_id        # type: str
        # 批次状态
        self.batch_id_status = batch_id_status  # type: int
        # 发行url
        self.issue_url = issue_url      # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        result['batch_id_status'] = self.batch_id_status
        result['issue_url'] = self.issue_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        self.batch_id_status = map.get('batch_id_status')
        self.issue_url = map.get('issue_url')
        return self


class QueryDigitalLogisticCreditIssuebatchstatusRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, batch_id=None,
                 group_platform_did=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 批次号
        self.batch_id = batch_id        # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        # A模式：PRODUCT_MYBANK，
        # A+模式：PRODUCT_MYBANK_A_PLUS，
        # A模式：PRODUCT_MYBANK_B，
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['batch_id'] = self.batch_id
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.batch_id = map.get('batch_id')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditIssuebatchstatusResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None, batch_status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 批次号
        self.batch_id = batch_id        # type: str
        # 批次状态
        self.batch_status = batch_status  # type: int

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        result['batch_status'] = self.batch_status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        self.batch_status = map.get('batch_status')
        return self


class CancelDigitalLogisticCreditIssuebatchRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, batch_id=None,
                 consignor_did=None, group_platform_did=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 批次号
        self.batch_id = batch_id        # type: str
        # 货主分布式数字身份
        self.consignor_did = consignor_did  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        # A模式：PRODUCT_MYBANK，
        # A+模式：PRODUCT_MYBANK_A_PLUS，
        # B模式：PRODUCT_MYBANK_B
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['batch_id'] = self.batch_id
        result['consignor_did'] = self.consignor_did
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.batch_id = map.get('batch_id')
        self.consignor_did = map.get('consignor_did')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class CancelDigitalLogisticCreditIssuebatchResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 批次号
        self.batch_id = batch_id        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        return self


class QueryDigitalLogisticCreditIssuebyidRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, batch_id=None,
                 group_platform_did=None, issued_only=None, issue_id=None, page_num=None, page_size=None, platform_did=None,
                 product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 信用流转发行批次号
        self.batch_id = batch_id        # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 是否只返回已发行凭证信息
        self.issued_only = issued_only  # type: bool
        # 信用流转发行凭证Id
        self.issue_id = issue_id        # type: str
        # 页数 从1开始
        self.page_num = page_num        # type: int
        # 每页显示数量 不超过100
        self.page_size = page_size      # type: int
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        # A模式：PRODUCT_MYBANK，
        # A+模式：PRODUCT_MYBANK_A_PLUS，
        # B模式：PRODUCT_MYBANK_B
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['batch_id'] = self.batch_id
        result['group_platform_did'] = self.group_platform_did
        result['issued_only'] = self.issued_only
        result['issue_id'] = self.issue_id
        result['page_num'] = self.page_num
        result['page_size'] = self.page_size
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.batch_id = map.get('batch_id')
        self.group_platform_did = map.get('group_platform_did')
        self.issued_only = map.get('issued_only')
        self.issue_id = map.get('issue_id')
        self.page_num = map.get('page_num')
        self.page_size = map.get('page_size')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditIssuebyidResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None, batch_id_status=None,
                 did=None, issue_ids=None, page_num=None, page_size=None, total_count=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 信用流转批次号
        self.batch_id = batch_id        # type: str
        # 批次状态
        self.batch_id_status = batch_id_status  # type: str
        # 凭证发行者did
        self.did = did                  # type: str
        # 发行凭证列表
        self.issue_ids = issue_ids      # type: List[IssueIdInfo]
        # 页数 从1开始
        self.page_num = page_num        # type: int
        # 每页显示数量
        self.page_size = page_size      # type: int
        # 数据总量
        self.total_count = total_count  # type: int

    def validate(self):
        if self.issue_ids:
            for k in self.issue_ids:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        result['batch_id_status'] = self.batch_id_status
        result['did'] = self.did
        result['issue_ids'] = []
        if self.issue_ids is not None:
            for k in self.issue_ids:
                result['issue_ids'].append(k.to_map() if k else None)
        else:
            result['issue_ids'] = None
        result['page_num'] = self.page_num
        result['page_size'] = self.page_size
        result['total_count'] = self.total_count
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        self.batch_id_status = map.get('batch_id_status')
        self.did = map.get('did')
        self.issue_ids = []
        if map.get('issue_ids') is not None:
            for k in map.get('issue_ids'):
                temp_model = IssueIdInfo()
                self.issue_ids.append(temp_model.from_map(k))
        else:
            self.issue_ids = None
        self.page_num = map.get('page_num')
        self.page_size = map.get('page_size')
        self.total_count = map.get('total_count')
        return self


class QueryDigitalLogisticCreditIssuebytimeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, did=None, end_date=None,
                 group_platform_did=None, issued_only=None, page_num=None, page_size=None, platform_did=None, product_id=None,
                 start_date=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 指定查询者分布式数字身份
        self.did = did                  # type: str
        # 查询截止时间
        self.end_date = end_date        # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 是否只返回已发行凭证信息
        self.issued_only = issued_only  # type: bool
        # 页数 从1开始
        self.page_num = page_num        # type: int
        # 每页显示数量 不超过100
        self.page_size = page_size      # type: int
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id 目前填PRODUCT_MYBANK
        self.product_id = product_id    # type: str
        # 查询起始时间
        self.start_date = start_date    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['did'] = self.did
        result['end_date'] = self.end_date
        result['group_platform_did'] = self.group_platform_did
        result['issued_only'] = self.issued_only
        result['page_num'] = self.page_num
        result['page_size'] = self.page_size
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        result['start_date'] = self.start_date
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.did = map.get('did')
        self.end_date = map.get('end_date')
        self.group_platform_did = map.get('group_platform_did')
        self.issued_only = map.get('issued_only')
        self.page_num = map.get('page_num')
        self.page_size = map.get('page_size')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        self.start_date = map.get('start_date')
        return self


class QueryDigitalLogisticCreditIssuebytimeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None, batch_id_status=None,
                 did=None, issue_ids=None, page_num=None, page_size=None, total_count=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 信用流转批次号
        self.batch_id = batch_id        # type: str
        # 批次状态
        self.batch_id_status = batch_id_status  # type: int
        # 凭证发行者did
        self.did = did                  # type: str
        # 凭证列表
        self.issue_ids = issue_ids      # type: List[IssueIdInfo]
        # 页数 从1开始
        self.page_num = page_num        # type: int
        # 每页显示数量
        self.page_size = page_size      # type: int
        # 数据总量
        self.total_count = total_count  # type: int

    def validate(self):
        if self.issue_ids:
            for k in self.issue_ids:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        result['batch_id_status'] = self.batch_id_status
        result['did'] = self.did
        result['issue_ids'] = []
        if self.issue_ids is not None:
            for k in self.issue_ids:
                result['issue_ids'].append(k.to_map() if k else None)
        else:
            result['issue_ids'] = None
        result['page_num'] = self.page_num
        result['page_size'] = self.page_size
        result['total_count'] = self.total_count
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        self.batch_id_status = map.get('batch_id_status')
        self.did = map.get('did')
        self.issue_ids = []
        if map.get('issue_ids') is not None:
            for k in map.get('issue_ids'):
                temp_model = IssueIdInfo()
                self.issue_ids.append(temp_model.from_map(k))
        else:
            self.issue_ids = None
        self.page_num = map.get('page_num')
        self.page_size = map.get('page_size')
        self.total_count = map.get('total_count')
        return self


class QueryDigitalLogisticCreditUserissueRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, did=None,
                 group_platform_did=None, page_num=None, page_size=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 被查询方分布式数字身份
        self.did = did                  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 页数
        self.page_num = page_num        # type: int
        # 每页显示的最大条数
        self.page_size = page_size      # type: int
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        # A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['did'] = self.did
        result['group_platform_did'] = self.group_platform_did
        result['page_num'] = self.page_num
        result['page_size'] = self.page_size
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.did = map.get('did')
        self.group_platform_did = map.get('group_platform_did')
        self.page_num = map.get('page_num')
        self.page_size = map.get('page_size')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditUserissueResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None, issue_ids=None, page_num=None,
                 page_size=None, total_count=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 凭证所有者分布式数字身份
        self.did = did                  # type: str
        # 信用流转凭证列表
        self.issue_ids = issue_ids      # type: List[UserIssueId]
        # 页数
        self.page_num = page_num        # type: int
        # 每页显示最大条数
        self.page_size = page_size      # type: int
        # 总数
        self.total_count = total_count  # type: int

    def validate(self):
        if self.issue_ids:
            for k in self.issue_ids:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        result['issue_ids'] = []
        if self.issue_ids is not None:
            for k in self.issue_ids:
                result['issue_ids'].append(k.to_map() if k else None)
        else:
            result['issue_ids'] = None
        result['page_num'] = self.page_num
        result['page_size'] = self.page_size
        result['total_count'] = self.total_count
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        self.issue_ids = []
        if map.get('issue_ids') is not None:
            for k in map.get('issue_ids'):
                temp_model = UserIssueId()
                self.issue_ids.append(temp_model.from_map(k))
        else:
            self.issue_ids = None
        self.page_num = map.get('page_num')
        self.page_size = map.get('page_size')
        self.total_count = map.get('total_count')
        return self


class QueryDigitalLogisticCreditStatementRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, did=None, end_date=None,
                 group_platform_did=None, page_num=None, page_size=None, platform_did=None, product_id=None, start_date=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 需查询对象分布式数字身份不能为空
        self.did = did                  # type: str
        # 查询截止时间
        self.end_date = end_date        # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 页数 从1开始
        self.page_num = page_num        # type: int
        # 每页显示数量 最多100
        self.page_size = page_size      # type: int
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        # A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
        self.product_id = product_id    # type: str
        # 查询起始时间
        self.start_date = start_date    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['did'] = self.did
        result['end_date'] = self.end_date
        result['group_platform_did'] = self.group_platform_did
        result['page_num'] = self.page_num
        result['page_size'] = self.page_size
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        result['start_date'] = self.start_date
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.did = map.get('did')
        self.end_date = map.get('end_date')
        self.group_platform_did = map.get('group_platform_did')
        self.page_num = map.get('page_num')
        self.page_size = map.get('page_size')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        self.start_date = map.get('start_date')
        return self


class QueryDigitalLogisticCreditStatementResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, page_num=None, page_size=None,
                 statement_infos=None, total_count=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 页数 从1开始
        self.page_num = page_num        # type: int
        # 每页显示数量
        self.page_size = page_size      # type: int
        # 流水列表
        self.statement_infos = statement_infos  # type: List[StatementInfo]
        # 数据总量
        self.total_count = total_count  # type: int

    def validate(self):
        if self.statement_infos:
            for k in self.statement_infos:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['page_num'] = self.page_num
        result['page_size'] = self.page_size
        result['statement_infos'] = []
        if self.statement_infos is not None:
            for k in self.statement_infos:
                result['statement_infos'].append(k.to_map() if k else None)
        else:
            result['statement_infos'] = None
        result['total_count'] = self.total_count
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.page_num = map.get('page_num')
        self.page_size = map.get('page_size')
        self.statement_infos = []
        if map.get('statement_infos') is not None:
            for k in map.get('statement_infos'):
                temp_model = StatementInfo()
                self.statement_infos.append(temp_model.from_map(k))
        else:
            self.statement_infos = None
        self.total_count = map.get('total_count')
        return self


class CreateDigitalLogisticCreditIssuetransferRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, callback_url=None,
                 group_platform_did=None, issue_id=None, out_biz_no=None, payee_did=None, payer_did=None, platform_did=None,
                 product_id=None, tx_amt=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 转让结果回调url
        self.callback_url = callback_url  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 信用流转凭证
        self.issue_id = issue_id        # type: str
        # 全局业务号，保证唯一性，如拆分转让业务单号
        self.out_biz_no = out_biz_no    # type: str
        # 转入方分布式数字身份
        self.payee_did = payee_did      # type: str
        # 转出方分布式数字身份
        self.payer_did = payer_did      # type: str
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id 目前使用PRODUCT_MYBANK
        self.product_id = product_id    # type: str
        # 转让金额
        self.tx_amt = tx_amt            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['callback_url'] = self.callback_url
        result['group_platform_did'] = self.group_platform_did
        result['issue_id'] = self.issue_id
        result['out_biz_no'] = self.out_biz_no
        result['payee_did'] = self.payee_did
        result['payer_did'] = self.payer_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        result['tx_amt'] = self.tx_amt
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.callback_url = map.get('callback_url')
        self.group_platform_did = map.get('group_platform_did')
        self.issue_id = map.get('issue_id')
        self.out_biz_no = map.get('out_biz_no')
        self.payee_did = map.get('payee_did')
        self.payer_did = map.get('payer_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        self.tx_amt = map.get('tx_amt')
        return self


class CreateDigitalLogisticCreditIssuetransferResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, success_apply_amt=None, out_biz_no=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 转让申请成功金额
        self.success_apply_amt = success_apply_amt  # type: str
        # 请求时传入的全局业务号
        self.out_biz_no = out_biz_no    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['success_apply_amt'] = self.success_apply_amt
        result['out_biz_no'] = self.out_biz_no
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.success_apply_amt = map.get('success_apply_amt')
        self.out_biz_no = map.get('out_biz_no')
        return self


class QueryDigitalLogisticCreditIssuetransferRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, group_platform_did=None,
                 out_biz_no=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 全局业务号，保证唯一性，如拆分转让业务单号
        self.out_biz_no = out_biz_no    # type: str
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id 目前使用PRODUCT_MYBANK
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['group_platform_did'] = self.group_platform_did
        result['out_biz_no'] = self.out_biz_no
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.group_platform_did = map.get('group_platform_did')
        self.out_biz_no = map.get('out_biz_no')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditIssuetransferResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, err_msg=None, fail_amt=None,
                 issue_id=None, out_biz_no=None, payee_did=None, payer_did=None, product_id=None, status=None,
                 success_amt=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 错误信息
        self.err_msg = err_msg          # type: str
        # 转让失败金额
        self.fail_amt = fail_amt        # type: str
        # 信用凭证号
        self.issue_id = issue_id        # type: str
        # 请求时传入的全局业务号
        self.out_biz_no = out_biz_no    # type: str
        # 转入方分布式数字身份
        self.payee_did = payee_did      # type: str
        # 转出方分布式数字身份
        self.payer_did = payer_did      # type: str
        # 产品id
        self.product_id = product_id    # type: str
        # 转让结果状态 -1:转让失败状态， 0:转让未完成状态， 1:转让部分成功状态，2:转让成功状态
        self.status = status            # type: int
        # 转让成功金额
        self.success_amt = success_amt  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['err_msg'] = self.err_msg
        result['fail_amt'] = self.fail_amt
        result['issue_id'] = self.issue_id
        result['out_biz_no'] = self.out_biz_no
        result['payee_did'] = self.payee_did
        result['payer_did'] = self.payer_did
        result['product_id'] = self.product_id
        result['status'] = self.status
        result['success_amt'] = self.success_amt
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.err_msg = map.get('err_msg')
        self.fail_amt = map.get('fail_amt')
        self.issue_id = map.get('issue_id')
        self.out_biz_no = map.get('out_biz_no')
        self.payee_did = map.get('payee_did')
        self.payer_did = map.get('payer_did')
        self.product_id = map.get('product_id')
        self.status = map.get('status')
        self.success_amt = map.get('success_amt')
        return self


class CreateDigitalLogisticCreditIssuefinanceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, callback_url=None,
                 group_platform_did=None, issue_id=None, loaner_did=None, out_biz_no=None, platform_did=None, product_id=None,
                 tx_amt=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 转让结果回调url
        self.callback_url = callback_url  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 信用流转凭证
        self.issue_id = issue_id        # type: str
        # 融资申请方分布式数字身份
        self.loaner_did = loaner_did    # type: str
        # 全局业务号，保证唯一性，如融资业务单号
        self.out_biz_no = out_biz_no    # type: str
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        # A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
        self.product_id = product_id    # type: str
        # 融资金额
        self.tx_amt = tx_amt            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['callback_url'] = self.callback_url
        result['group_platform_did'] = self.group_platform_did
        result['issue_id'] = self.issue_id
        result['loaner_did'] = self.loaner_did
        result['out_biz_no'] = self.out_biz_no
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        result['tx_amt'] = self.tx_amt
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.callback_url = map.get('callback_url')
        self.group_platform_did = map.get('group_platform_did')
        self.issue_id = map.get('issue_id')
        self.loaner_did = map.get('loaner_did')
        self.out_biz_no = map.get('out_biz_no')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        self.tx_amt = map.get('tx_amt')
        return self


class CreateDigitalLogisticCreditIssuefinanceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, fail_apply_amt=None, out_biz_no=None,
                 success_apply_amt=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 融资申请失败，回转至无车承运平台金额
        self.fail_apply_amt = fail_apply_amt  # type: str
        # 请求时传入的全局业务号
        self.out_biz_no = out_biz_no    # type: str
        # 融资申请成功金额
        self.success_apply_amt = success_apply_amt  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['fail_apply_amt'] = self.fail_apply_amt
        result['out_biz_no'] = self.out_biz_no
        result['success_apply_amt'] = self.success_apply_amt
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.fail_apply_amt = map.get('fail_apply_amt')
        self.out_biz_no = map.get('out_biz_no')
        self.success_apply_amt = map.get('success_apply_amt')
        return self


class QueryDigitalLogisticCreditIssuefinanceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, group_platform_did=None,
                 loaner_did=None, out_biz_no=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 融资申请方分布式数字身份
        self.loaner_did = loaner_did    # type: str
        # 全局业务号，保证唯一性，如融资业务单号
        self.out_biz_no = out_biz_no    # type: str
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        # A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['group_platform_did'] = self.group_platform_did
        result['loaner_did'] = self.loaner_did
        result['out_biz_no'] = self.out_biz_no
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.group_platform_did = map.get('group_platform_did')
        self.loaner_did = map.get('loaner_did')
        self.out_biz_no = map.get('out_biz_no')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditIssuefinanceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, err_msg=None, fail_amt=None,
                 fail_transfer_amt=None, out_biz_no=None, status=None, success_amt=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 错误信息
        self.err_msg = err_msg          # type: str
        # 融资失败，回转至无车承运平台失败金额
        self.fail_amt = fail_amt        # type: str
        # 融资失败，回转至无车承运平台成功金额
        self.fail_transfer_amt = fail_transfer_amt  # type: str
        # 请求时传入的全局业务号
        self.out_biz_no = out_biz_no    # type: str
        # 融资结果状态 -1:融资未完成， 0:融资完成， 1:融资全部失败，逆流转回平台全部成功，2:融资部分成功，逆流转回平台全部成功，3:逆流转回平台发生失败，需人工介入
        self.status = status            # type: int
        # 融资成功金额
        self.success_amt = success_amt  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['err_msg'] = self.err_msg
        result['fail_amt'] = self.fail_amt
        result['fail_transfer_amt'] = self.fail_transfer_amt
        result['out_biz_no'] = self.out_biz_no
        result['status'] = self.status
        result['success_amt'] = self.success_amt
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.err_msg = map.get('err_msg')
        self.fail_amt = map.get('fail_amt')
        self.fail_transfer_amt = map.get('fail_transfer_amt')
        self.out_biz_no = map.get('out_biz_no')
        self.status = map.get('status')
        self.success_amt = map.get('success_amt')
        return self


class QueryDigitalLogisticCreditIssuereceivableRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, group_platform_did=None,
                 issue_id=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 信用凭证id
        self.issue_id = issue_id        # type: str
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # PRODUCT_MYBANK  、PRODUCT_MYBANK_B
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['group_platform_did'] = self.group_platform_did
        result['issue_id'] = self.issue_id
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.group_platform_did = map.get('group_platform_did')
        self.issue_id = map.get('issue_id')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditIssuereceivableResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, clear_amt=None, compensate_amt=None,
                 err_msg=None, finish_date=None, has_compensate=None, issue_id=None, out_biz_no=None, out_order_no=None,
                 product_id=None, status=None, total_amt=None, type=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 已清分金额
        self.clear_amt = clear_amt      # type: str
        # 代偿金额
        self.compensate_amt = compensate_amt  # type: str
        # 错误信息
        self.err_msg = err_msg          # type: str
        # 完成日期 long类型字符串
        self.finish_date = finish_date  # type: str
        # 是否代偿,true为代偿，false为不代偿
        self.has_compensate = has_compensate  # type: bool
        # 信用凭证id
        self.issue_id = issue_id        # type: str
        # 全局唯一业务号
        self.out_biz_no = out_biz_no    # type: str
        # 外部订单号，也就是凭证发行时传递的支付订单
        self.out_order_no = out_order_no  # type: str
        # 产品id--PRODUCT_MYBANK 、PRODUCT_MYBANK_B;
        self.product_id = product_id    # type: str
        # 清分结果状态--- 0：未清分， 1：清分完成
        self.status = status            # type: int
        # 凭证总金额
        self.total_amt = total_amt      # type: str
        # 清分类型--主动清分 、 到期清分
        self.type = type                # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['clear_amt'] = self.clear_amt
        result['compensate_amt'] = self.compensate_amt
        result['err_msg'] = self.err_msg
        result['finish_date'] = self.finish_date
        result['has_compensate'] = self.has_compensate
        result['issue_id'] = self.issue_id
        result['out_biz_no'] = self.out_biz_no
        result['out_order_no'] = self.out_order_no
        result['product_id'] = self.product_id
        result['status'] = self.status
        result['total_amt'] = self.total_amt
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.clear_amt = map.get('clear_amt')
        self.compensate_amt = map.get('compensate_amt')
        self.err_msg = map.get('err_msg')
        self.finish_date = map.get('finish_date')
        self.has_compensate = map.get('has_compensate')
        self.issue_id = map.get('issue_id')
        self.out_biz_no = map.get('out_biz_no')
        self.out_order_no = map.get('out_order_no')
        self.product_id = map.get('product_id')
        self.status = map.get('status')
        self.total_amt = map.get('total_amt')
        self.type = map.get('type')
        return self


class QueryDigitalLogisticCreditIssueamountRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, did=None,
                 group_platform_did=None, issue_id=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 指定查询者分布式数字身份
        self.did = did                  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 信用凭证id
        self.issue_id = issue_id        # type: str
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id 目前填写PRODUCT_MYBANK
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['did'] = self.did
        result['group_platform_did'] = self.group_platform_did
        result['issue_id'] = self.issue_id
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.did = map.get('did')
        self.group_platform_did = map.get('group_platform_did')
        self.issue_id = map.get('issue_id')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditIssueamountResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, balance_amt=None, cash_amt=None,
                 debt_int_amt=None, debt_prin_amt=None, debt_total_amt=None, expire_date=None, freeze_amt=None, issue_id=None,
                 paid_int_amt=None, ticket_amt=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 剩余金额
        self.balance_amt = balance_amt  # type: str
        # 已经提现的金额
        self.cash_amt = cash_amt        # type: str
        # 欠的滞纳金金额
        self.debt_int_amt = debt_int_amt  # type: str
        # 欠款本金金额
        self.debt_prin_amt = debt_prin_amt  # type: str
        # 该凭证下的总欠款金额
        self.debt_total_amt = debt_total_amt  # type: str
        # 信用凭证到期时间
        self.expire_date = expire_date  # type: str
        # 冻结的金额
        self.freeze_amt = freeze_amt    # type: str
        # 信用凭证id
        self.issue_id = issue_id        # type: str
        # 累计已还滞纳金金额
        self.paid_int_amt = paid_int_amt  # type: str
        # 凭证总金额
        self.ticket_amt = ticket_amt    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['balance_amt'] = self.balance_amt
        result['cash_amt'] = self.cash_amt
        result['debt_int_amt'] = self.debt_int_amt
        result['debt_prin_amt'] = self.debt_prin_amt
        result['debt_total_amt'] = self.debt_total_amt
        result['expire_date'] = self.expire_date
        result['freeze_amt'] = self.freeze_amt
        result['issue_id'] = self.issue_id
        result['paid_int_amt'] = self.paid_int_amt
        result['ticket_amt'] = self.ticket_amt
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.balance_amt = map.get('balance_amt')
        self.cash_amt = map.get('cash_amt')
        self.debt_int_amt = map.get('debt_int_amt')
        self.debt_prin_amt = map.get('debt_prin_amt')
        self.debt_total_amt = map.get('debt_total_amt')
        self.expire_date = map.get('expire_date')
        self.freeze_amt = map.get('freeze_amt')
        self.issue_id = map.get('issue_id')
        self.paid_int_amt = map.get('paid_int_amt')
        self.ticket_amt = map.get('ticket_amt')
        return self


class CallbackDigitalLogisticCreditCommonRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, msg_data=None, msg_method=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 回调数据，根据不同msg_method 返回不同结构
        self.msg_data = msg_data        # type: str
        # 回调方法类型
        self.msg_method = msg_method    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['msg_data'] = self.msg_data
        result['msg_method'] = self.msg_method
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.msg_data = map.get('msg_data')
        self.msg_method = map.get('msg_method')
        return self


class CallbackDigitalLogisticCreditCommonResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, received=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 是否已接收
        self.received = received        # type: bool

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['received'] = self.received
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.received = map.get('received')
        return self


class ApplyDigitalLogisticCreditIssueclearRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, apply_date=None, clear_amt=None,
                 clear_did=None, ext_info=None, group_platform_did=None, issue_id=None, out_biz_no=None, out_order_no=None,
                 platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 申请日期，不输入则是当前时间
        self.apply_date = apply_date    # type: int
        # 清分金额，当前只支持全额清分，不填就是默认全额清分
        self.clear_amt = clear_amt      # type: str
        # 主动清分方分布式数字身份
        self.clear_did = clear_did      # type: str
        # 扩展字段
        self.ext_info = ext_info        # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 凭证id
        self.issue_id = issue_id        # type: str
        # 全局唯一业务流水号
        self.out_biz_no = out_biz_no    # type: str
        # 外部订单号，此为支付单号
        self.out_order_no = out_order_no  # type: str
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        # A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['apply_date'] = self.apply_date
        result['clear_amt'] = self.clear_amt
        result['clear_did'] = self.clear_did
        result['ext_info'] = self.ext_info
        result['group_platform_did'] = self.group_platform_did
        result['issue_id'] = self.issue_id
        result['out_biz_no'] = self.out_biz_no
        result['out_order_no'] = self.out_order_no
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.apply_date = map.get('apply_date')
        self.clear_amt = map.get('clear_amt')
        self.clear_did = map.get('clear_did')
        self.ext_info = map.get('ext_info')
        self.group_platform_did = map.get('group_platform_did')
        self.issue_id = map.get('issue_id')
        self.out_biz_no = map.get('out_biz_no')
        self.out_order_no = map.get('out_order_no')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class ApplyDigitalLogisticCreditIssueclearResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, out_biz_no=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 全局唯一业务流水号
        self.out_biz_no = out_biz_no    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['out_biz_no'] = self.out_biz_no
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.out_biz_no = map.get('out_biz_no')
        return self


class SendDigitalLogisticCreditProxyRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, apply_method=None,
                 apply_data=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 代理请求方法名
        self.apply_method = apply_method  # type: str
        # 代理请求数据
        self.apply_data = apply_data    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['apply_method'] = self.apply_method
        result['apply_data'] = self.apply_data
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.apply_method = map.get('apply_method')
        self.apply_data = map.get('apply_data')
        return self


class SendDigitalLogisticCreditProxyResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class CheckDigitalLogisticCreditWaybillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, group_platform_did=None,
                 platform_did=None, product_id=None, waybill_list=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 业务发起方分布式数字身
        self.platform_did = platform_did  # type: str
        # 产品id
        # A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
        self.product_id = product_id    # type: str
        # 运单列表
        self.waybill_list = waybill_list  # type: List[str]

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        result['waybill_list'] = self.waybill_list
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        self.waybill_list = map.get('waybill_list')
        return self


class CheckDigitalLogisticCreditWaybillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, check_result=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 核验结果列表,  格式为 运单号:核验状态， 核验状态包含  0:运单未知状态   1:通过   2:不通过   3:未核验   4:没有指定信息
        self.check_result = check_result  # type: List[str]

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['check_result'] = self.check_result
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.check_result = map.get('check_result')
        return self


class ReopenDigitalLogisticCreditDriverRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, product_id=None,
                 group_platform_did=None, driver_did=None, account_id=None, callback_url=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 产品id
        self.product_id = product_id    # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 司机did
        self.driver_did = driver_did    # type: str
        # 云资金商户id
        self.account_id = account_id    # type: str
        # 回调地址
        self.callback_url = callback_url  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['product_id'] = self.product_id
        result['group_platform_did'] = self.group_platform_did
        result['driver_did'] = self.driver_did
        result['account_id'] = self.account_id
        result['callback_url'] = self.callback_url
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.product_id = map.get('product_id')
        self.group_platform_did = map.get('group_platform_did')
        self.driver_did = map.get('driver_did')
        self.account_id = map.get('account_id')
        self.callback_url = map.get('callback_url')
        return self


class ReopenDigitalLogisticCreditDriverResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, apply_id=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 申请id
        self.apply_id = apply_id        # type: str
        # 会员注册状态
        self.status = status            # type: int

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['apply_id'] = self.apply_id
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.apply_id = map.get('apply_id')
        self.status = map.get('status')
        return self


class UploadDigitalLogisticCreditAuthorizationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, consignor_cert_no=None,
                 consignor_did=None, consignor_name=None, consignor_platform_account=None, expire_date=None,
                 group_platform_did=None, has_authorization_clause=None, platform_cert_no=None, platform_did=None, platform_name=None,
                 protocol_img_id=None, protocol_name=None, protocol_no=None, sign_date=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 签署货主统一社会信用代码
        self.consignor_cert_no = consignor_cert_no  # type: str
        # 签署货主did
        self.consignor_did = consignor_did  # type: str
        # 签署货主企业名称
        self.consignor_name = consignor_name  # type: str
        # 授权的货主平台账号
        self.consignor_platform_account = consignor_platform_account  # type: str
        # 协议到期日
        self.expire_date = expire_date  # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 是否包含账号授权条款
        self.has_authorization_clause = has_authorization_clause  # type: bool
        # 签署子公司统一社会信用代码
        self.platform_cert_no = platform_cert_no  # type: str
        # 签署子公司did
        self.platform_did = platform_did  # type: str
        # 签署子公司企业名称
        # 
        self.platform_name = platform_name  # type: str
        # 线下协议影像件id与文件哈希, 多id以逗号分隔, 最多支持10个
        self.protocol_img_id = protocol_img_id  # type: str
        # 协议名称
        self.protocol_name = protocol_name  # type: str
        # 线下协议编号
        self.protocol_no = protocol_no  # type: str
        # 签署时间
        self.sign_date = sign_date      # type: str
        # 产品id
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['consignor_cert_no'] = self.consignor_cert_no
        result['consignor_did'] = self.consignor_did
        result['consignor_name'] = self.consignor_name
        result['consignor_platform_account'] = self.consignor_platform_account
        result['expire_date'] = self.expire_date
        result['group_platform_did'] = self.group_platform_did
        result['has_authorization_clause'] = self.has_authorization_clause
        result['platform_cert_no'] = self.platform_cert_no
        result['platform_did'] = self.platform_did
        result['platform_name'] = self.platform_name
        result['protocol_img_id'] = self.protocol_img_id
        result['protocol_name'] = self.protocol_name
        result['protocol_no'] = self.protocol_no
        result['sign_date'] = self.sign_date
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.consignor_cert_no = map.get('consignor_cert_no')
        self.consignor_did = map.get('consignor_did')
        self.consignor_name = map.get('consignor_name')
        self.consignor_platform_account = map.get('consignor_platform_account')
        self.expire_date = map.get('expire_date')
        self.group_platform_did = map.get('group_platform_did')
        self.has_authorization_clause = map.get('has_authorization_clause')
        self.platform_cert_no = map.get('platform_cert_no')
        self.platform_did = map.get('platform_did')
        self.platform_name = map.get('platform_name')
        self.protocol_img_id = map.get('protocol_img_id')
        self.protocol_name = map.get('protocol_name')
        self.protocol_no = map.get('protocol_no')
        self.sign_date = map.get('sign_date')
        self.product_id = map.get('product_id')
        return self


class UploadDigitalLogisticCreditAuthorizationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_hash=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 协议链上地址
        self.tx_hash = tx_hash          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_hash = map.get('tx_hash')
        return self


class UploadDigitalLogisticCreditConfirmRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None,
                 confirm_date=None, confirm_no=None, consignor_did=None, consignor_platform_account=None, expire_date=None,
                 group_platform_did=None, platform_did=None, protocol_name=None, protocol_pdf_id=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 货主云资金商户id
        self.account_id = account_id    # type: str
        # 确认时间
        self.confirm_date = confirm_date  # type: str
        # 应收转让通知编号
        self.confirm_no = confirm_no    # type: str
        # 签署货主did
        self.consignor_did = consignor_did  # type: str
        # 签署的货主平台账号
        self.consignor_platform_account = consignor_platform_account  # type: str
        # 协议到期日
        self.expire_date = expire_date  # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 签署子公司did
        self.platform_did = platform_did  # type: str
        # 协议名称
        self.protocol_name = protocol_name  # type: str
        # 协议PDF文件, 多个文件可用逗号分隔, 最多10个
        self.protocol_pdf_id = protocol_pdf_id  # type: str
        # 产品id
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['confirm_date'] = self.confirm_date
        result['confirm_no'] = self.confirm_no
        result['consignor_did'] = self.consignor_did
        result['consignor_platform_account'] = self.consignor_platform_account
        result['expire_date'] = self.expire_date
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['protocol_name'] = self.protocol_name
        result['protocol_pdf_id'] = self.protocol_pdf_id
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.confirm_date = map.get('confirm_date')
        self.confirm_no = map.get('confirm_no')
        self.consignor_did = map.get('consignor_did')
        self.consignor_platform_account = map.get('consignor_platform_account')
        self.expire_date = map.get('expire_date')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.protocol_name = map.get('protocol_name')
        self.protocol_pdf_id = map.get('protocol_pdf_id')
        self.product_id = map.get('product_id')
        return self


class UploadDigitalLogisticCreditConfirmResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_hash=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 协议链上地址
        self.tx_hash = tx_hash          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_hash = map.get('tx_hash')
        return self


class BatchcreateDigitalLogisticCreditmodeIssueRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, batch_id=None,
                 callback_url=None, group_platform_did=None, issue_apply_infos=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 批次id
        self.batch_id = batch_id        # type: str
        # 回调地址
        self.callback_url = callback_url  # type: str
        # 集团平台分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 发行列表
        self.issue_apply_infos = issue_apply_infos  # type: List[IssueApplyInfo]
        # 业务平台方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        self.product_id = product_id    # type: str

    def validate(self):
        if self.issue_apply_infos:
            for k in self.issue_apply_infos:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['batch_id'] = self.batch_id
        result['callback_url'] = self.callback_url
        result['group_platform_did'] = self.group_platform_did
        result['issue_apply_infos'] = []
        if self.issue_apply_infos is not None:
            for k in self.issue_apply_infos:
                result['issue_apply_infos'].append(k.to_map() if k else None)
        else:
            result['issue_apply_infos'] = None
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.batch_id = map.get('batch_id')
        self.callback_url = map.get('callback_url')
        self.group_platform_did = map.get('group_platform_did')
        self.issue_apply_infos = []
        if map.get('issue_apply_infos') is not None:
            for k in map.get('issue_apply_infos'):
                temp_model = IssueApplyInfo()
                self.issue_apply_infos.append(temp_model.from_map(k))
        else:
            self.issue_apply_infos = None
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class BatchcreateDigitalLogisticCreditmodeIssueResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None, batch_status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 批次id
        self.batch_id = batch_id        # type: str
        # 批次状态
        self.batch_status = batch_status  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        result['batch_status'] = self.batch_status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        self.batch_status = map.get('batch_status')
        return self


class ApplyDigitalLogisticCreditmodeIssueclearRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, product_id=None,
                 group_platform_did=None, platform_did=None, clear_did=None, issue_id=None, out_biz_no=None, out_order_no=None,
                 clear_amt=None, mode_type=None, apply_date=None, ext_info=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 产品id
        self.product_id = product_id    # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 业务平台方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 主动清分方分布式数字身份
        self.clear_did = clear_did      # type: str
        # 凭证id
        self.issue_id = issue_id        # type: str
        # 全局业务号
        self.out_biz_no = out_biz_no    # type: str
        # 支付单号
        self.out_order_no = out_order_no  # type: str
        # 清分金额
        self.clear_amt = clear_amt      # type: str
        # 模式  B:b模式
        self.mode_type = mode_type      # type: str
        # 申请日期
        self.apply_date = apply_date    # type: str
        # 扩展字段
        self.ext_info = ext_info        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['product_id'] = self.product_id
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['clear_did'] = self.clear_did
        result['issue_id'] = self.issue_id
        result['out_biz_no'] = self.out_biz_no
        result['out_order_no'] = self.out_order_no
        result['clear_amt'] = self.clear_amt
        result['mode_type'] = self.mode_type
        result['apply_date'] = self.apply_date
        result['ext_info'] = self.ext_info
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.product_id = map.get('product_id')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.clear_did = map.get('clear_did')
        self.issue_id = map.get('issue_id')
        self.out_biz_no = map.get('out_biz_no')
        self.out_order_no = map.get('out_order_no')
        self.clear_amt = map.get('clear_amt')
        self.mode_type = map.get('mode_type')
        self.apply_date = map.get('apply_date')
        self.ext_info = map.get('ext_info')
        return self


class ApplyDigitalLogisticCreditmodeIssueclearResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, out_biz_no=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 全局业务号
        self.out_biz_no = out_biz_no    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['out_biz_no'] = self.out_biz_no
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.out_biz_no = map.get('out_biz_no')
        return self


class UploadDigitalLogisticCreditIssuebysaasRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, batch_id=None,
                 callback_url=None, group_platform_did=None, issue_apply_infos=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 批次id
        self.batch_id = batch_id        # type: str
        # 发行结果回调地址
        self.callback_url = callback_url  # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 发行信息
        self.issue_apply_infos = issue_apply_infos  # type: List[SaasIssueApplyInfo]
        # 凭证发行方did
        self.platform_did = platform_did  # type: str
        # 产品id
        self.product_id = product_id    # type: str

    def validate(self):
        if self.issue_apply_infos:
            for k in self.issue_apply_infos:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['batch_id'] = self.batch_id
        result['callback_url'] = self.callback_url
        result['group_platform_did'] = self.group_platform_did
        result['issue_apply_infos'] = []
        if self.issue_apply_infos is not None:
            for k in self.issue_apply_infos:
                result['issue_apply_infos'].append(k.to_map() if k else None)
        else:
            result['issue_apply_infos'] = None
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.batch_id = map.get('batch_id')
        self.callback_url = map.get('callback_url')
        self.group_platform_did = map.get('group_platform_did')
        self.issue_apply_infos = []
        if map.get('issue_apply_infos') is not None:
            for k in map.get('issue_apply_infos'):
                temp_model = SaasIssueApplyInfo()
                self.issue_apply_infos.append(temp_model.from_map(k))
        else:
            self.issue_apply_infos = None
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class UploadDigitalLogisticCreditIssuebysaasResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None, batch_status=None,
                 issue_url=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 批次id
        self.batch_id = batch_id        # type: str
        # 批次状态
        self.batch_status = batch_status  # type: int
        # 发行url
        self.issue_url = issue_url      # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        result['batch_status'] = self.batch_status
        result['issue_url'] = self.issue_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        self.batch_status = map.get('batch_status')
        self.issue_url = map.get('issue_url')
        return self


class CancelDigitalLogisticCreditIssuebatchbysaasRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, batch_id=None,
                 group_platform_did=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 批次号
        self.batch_id = batch_id        # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 凭证发行方did
        self.platform_did = platform_did  # type: str
        # 产品id
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['batch_id'] = self.batch_id
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.batch_id = map.get('batch_id')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class CancelDigitalLogisticCreditIssuebatchbysaasResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 批次id
        self.batch_id = batch_id        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        return self


class QueryDigitalLogisticCreditBalancebysaasRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, product_id=None,
                 group_platform_did=None, platform_did=None, freight=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 产品id
        self.product_id = product_id    # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 查询者did
        self.platform_did = platform_did  # type: str
        # 发行金额
        self.freight = freight          # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['product_id'] = self.product_id
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['freight'] = self.freight
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.product_id = map.get('product_id')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.freight = map.get('freight')
        return self


class QueryDigitalLogisticCreditBalancebysaasResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, has_balance=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 是否有信用流转额度
        self.has_balance = has_balance  # type: bool

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['has_balance'] = self.has_balance
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.has_balance = map.get('has_balance')
        return self


class GetDigitalLogisticCreditIssuescpticketRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, apply_id=None,
                 callback_url=None, group_platform_did=None, platform_did=None, product_id=None, scp_ticket_issue_data=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 申请唯一流水号
        self.apply_id = apply_id        # type: str
        # 回调地址
        self.callback_url = callback_url  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 业务发起方分布式数字身
        self.platform_did = platform_did  # type: str
        # 产品id
        self.product_id = product_id    # type: str
        # 电子回单查询凭证数据
        self.scp_ticket_issue_data = scp_ticket_issue_data  # type: List[ScpTicketIssueData]

    def validate(self):
        if self.scp_ticket_issue_data:
            for k in self.scp_ticket_issue_data:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['apply_id'] = self.apply_id
        result['callback_url'] = self.callback_url
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        result['scp_ticket_issue_data'] = []
        if self.scp_ticket_issue_data is not None:
            for k in self.scp_ticket_issue_data:
                result['scp_ticket_issue_data'].append(k.to_map() if k else None)
        else:
            result['scp_ticket_issue_data'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.apply_id = map.get('apply_id')
        self.callback_url = map.get('callback_url')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        self.scp_ticket_issue_data = []
        if map.get('scp_ticket_issue_data') is not None:
            for k in map.get('scp_ticket_issue_data'):
                temp_model = ScpTicketIssueData()
                self.scp_ticket_issue_data.append(temp_model.from_map(k))
        else:
            self.scp_ticket_issue_data = None
        return self


class GetDigitalLogisticCreditIssuescpticketResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, apply_id=None, group_platform_did=None,
                 platform_did=None, product_id=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 申请唯一流水号
        self.apply_id = apply_id        # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 业务发起方分布式数字身
        self.platform_did = platform_did  # type: str
        # 产品id
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['apply_id'] = self.apply_id
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.apply_id = map.get('apply_id')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditIssuescpticketresultRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, apply_id=None,
                 group_platform_did=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 申请唯一流水号
        self.apply_id = apply_id        # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 业务发起方分布式数字身
        self.platform_did = platform_did  # type: str
        # 产品id
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['apply_id'] = self.apply_id
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.apply_id = map.get('apply_id')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditIssuescpticketresultResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, apply_id=None, file_download_url=None,
                 group_platform_did=None, platform_did=None, product_id=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 申请唯一流水号
        self.apply_id = apply_id        # type: str
        # 电子回单下载地址,链接有有效期
        self.file_download_url = file_download_url  # type: str
        # 集团平台方分布式数字身份
        # 
        self.group_platform_did = group_platform_did  # type: str
        # 业务发起方分布式数字身
        self.platform_did = platform_did  # type: str
        # 产品id
        # 
        self.product_id = product_id    # type: str
        # 状态
        self.status = status            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['apply_id'] = self.apply_id
        result['file_download_url'] = self.file_download_url
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.apply_id = map.get('apply_id')
        self.file_download_url = map.get('file_download_url')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        self.status = map.get('status')
        return self


class UploadDigitalLogisticCreditAplusissueRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, batch_id=None,
                 callback_url=None, consignor_did=None, easy_finance=None, group_platform_did=None, issue_apply_infos=None,
                 platform_did=None, product_id=None, login_type=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 批次id
        self.batch_id = batch_id        # type: str
        # 发行结果信息回调地址
        self.callback_url = callback_url  # type: str
        # 货代did
        self.consignor_did = consignor_did  # type: str
        # 发行时直接进行快速提现：true ，
        # 发行后自主触发提现：false （默认）
        self.easy_finance = easy_finance  # type: bool
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 发行信息列表
        self.issue_apply_infos = issue_apply_infos  # type: List[IssueApplyInfoPlus]
        # 业务承接方did
        self.platform_did = platform_did  # type: str
        # 产品id
        self.product_id = product_id    # type: str
        # 登录模式，返回的发行url指定使用何种模式登录。ORG:企业支付宝登录（缺省时默认ORG模式），USER_ACCOUNT:个人支付宝登录。
        self.login_type = login_type    # type: str

    def validate(self):
        if self.issue_apply_infos:
            for k in self.issue_apply_infos:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['batch_id'] = self.batch_id
        result['callback_url'] = self.callback_url
        result['consignor_did'] = self.consignor_did
        result['easy_finance'] = self.easy_finance
        result['group_platform_did'] = self.group_platform_did
        result['issue_apply_infos'] = []
        if self.issue_apply_infos is not None:
            for k in self.issue_apply_infos:
                result['issue_apply_infos'].append(k.to_map() if k else None)
        else:
            result['issue_apply_infos'] = None
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        result['login_type'] = self.login_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.batch_id = map.get('batch_id')
        self.callback_url = map.get('callback_url')
        self.consignor_did = map.get('consignor_did')
        self.easy_finance = map.get('easy_finance')
        self.group_platform_did = map.get('group_platform_did')
        self.issue_apply_infos = []
        if map.get('issue_apply_infos') is not None:
            for k in map.get('issue_apply_infos'):
                temp_model = IssueApplyInfoPlus()
                self.issue_apply_infos.append(temp_model.from_map(k))
        else:
            self.issue_apply_infos = None
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        self.login_type = map.get('login_type')
        return self


class UploadDigitalLogisticCreditAplusissueResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None, batch_id_status=None,
                 issue_url=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 批次id
        self.batch_id = batch_id        # type: str
        # 批次状态 -1:失效， 0:初始化完成，1:进行中，2:部分成功，3:成功
        self.batch_id_status = batch_id_status  # type: int
        # 凭证发行跳转url
        self.issue_url = issue_url      # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        result['batch_id_status'] = self.batch_id_status
        result['issue_url'] = self.issue_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        self.batch_id_status = map.get('batch_id_status')
        self.issue_url = map.get('issue_url')
        return self


class QueryDigitalLogisticCreditCreditamountRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, group_platform_did=None,
                 platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 平台did
        self.platform_did = platform_did  # type: str
        # 产品ID
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class QueryDigitalLogisticCreditCreditamountResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, credit_amount=None,
                 group_platform_did=None, platform_did=None, product_id=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 可用额度
        self.credit_amount = credit_amount  # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 平台did
        self.platform_did = platform_did  # type: str
        # 产品ID
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['credit_amount'] = self.credit_amount
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.credit_amount = map.get('credit_amount')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class CreateDigitalLogisticCreditCommonsignRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None,
                 account_type=None, bank_cnaps=None, bank_name=None, callback_url=None, driving_license=None,
                 driving_license_file_id=None, group_platform_did=None, legal_name=None, product_id=None, sign_did=None,
                 vehicle_license=None, vehicle_license_file_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 账户号，account_type=ACCOUNT_BANK_NO时填写外部银行卡号， account_type=ACCOUNT_CLOUD_FUND时填写云资金商户ID
        self.account_id = account_id    # type: str
        # 账户类型，ACCOUNT_BANK_NO:外部银行卡，ACCOUNT_CLOUD_FUND:云资金商户ID
        self.account_type = account_type  # type: str
        # 开户行联行号，当帐户类型为ACCOUNT_BANK_NO时必填
        self.bank_cnaps = bank_cnaps    # type: str
        # 开户行名称，当帐户类型为ACCOUNT_BANK_NO时必填
        self.bank_name = bank_name      # type: str
        # 签约结果回调地址
        self.callback_url = callback_url  # type: str
        # 驾驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
        self.driving_license = driving_license  # type: str
        # 驾驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
        self.driving_license_file_id = driving_license_file_id  # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 法定代表人名称，签约方sign_did类型为企业时必填
        self.legal_name = legal_name    # type: str
        # 产品id
        self.product_id = product_id    # type: str
        # 签约方did
        self.sign_did = sign_did        # type: str
        # 行驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
        self.vehicle_license = vehicle_license  # type: str
        # 行驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
        self.vehicle_license_file_id = vehicle_license_file_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['account_type'] = self.account_type
        result['bank_cnaps'] = self.bank_cnaps
        result['bank_name'] = self.bank_name
        result['callback_url'] = self.callback_url
        result['driving_license'] = self.driving_license
        result['driving_license_file_id'] = self.driving_license_file_id
        result['group_platform_did'] = self.group_platform_did
        result['legal_name'] = self.legal_name
        result['product_id'] = self.product_id
        result['sign_did'] = self.sign_did
        result['vehicle_license'] = self.vehicle_license
        result['vehicle_license_file_id'] = self.vehicle_license_file_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.account_type = map.get('account_type')
        self.bank_cnaps = map.get('bank_cnaps')
        self.bank_name = map.get('bank_name')
        self.callback_url = map.get('callback_url')
        self.driving_license = map.get('driving_license')
        self.driving_license_file_id = map.get('driving_license_file_id')
        self.group_platform_did = map.get('group_platform_did')
        self.legal_name = map.get('legal_name')
        self.product_id = map.get('product_id')
        self.sign_did = map.get('sign_did')
        self.vehicle_license = map.get('vehicle_license')
        self.vehicle_license_file_id = map.get('vehicle_license_file_id')
        return self


class CreateDigitalLogisticCreditCommonsignResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, apply_id=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 申请id
        self.apply_id = apply_id        # type: str
        # 签约状态，-1:签约失败，0:未签约，1:已签约，2:签约中
        self.status = status            # type: int

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['apply_id'] = self.apply_id
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.apply_id = map.get('apply_id')
        self.status = map.get('status')
        return self


class QueryDigitalLogisticCreditCommonsignRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, product_id=None,
                 group_platform_did=None, sign_did=None, apply_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 产品id
        self.product_id = product_id    # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 签约方did
        self.sign_did = sign_did        # type: str
        # 申请id，不填则查询当前签约状态，填写则查询apply_id对应的签约申请结果
        self.apply_id = apply_id        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['product_id'] = self.product_id
        result['group_platform_did'] = self.group_platform_did
        result['sign_did'] = self.sign_did
        result['apply_id'] = self.apply_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.product_id = map.get('product_id')
        self.group_platform_did = map.get('group_platform_did')
        self.sign_did = map.get('sign_did')
        self.apply_id = map.get('apply_id')
        return self


class QueryDigitalLogisticCreditCommonsignResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, status=None, query_msg=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 签约结果，-1:签约失败，0:未签约，1:已签约，2:签约中
        self.status = status            # type: int
        # 查询信息
        self.query_msg = query_msg      # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['status'] = self.status
        result['query_msg'] = self.query_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.status = map.get('status')
        self.query_msg = map.get('query_msg')
        return self


class BatchcreateDigitalLogisticCreditIssueRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, product_id=None,
                 group_platform_did=None, create_did=None, receive_did=None, batch_id=None, out_biz_no=None, pay_order=None,
                 freight=None, easy_finance=None, expire_date=None, callback_url=None, waybill_ids=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 产品id
        self.product_id = product_id    # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 凭证发行方分布式身份
        self.create_did = create_did    # type: str
        # 凭证接收方分布式身份
        self.receive_did = receive_did  # type: str
        # 批次id
        self.batch_id = batch_id        # type: str
        # 全局业务唯一号
        self.out_biz_no = out_biz_no    # type: str
        # 支付订单号
        self.pay_order = pay_order      # type: str
        # 支付单运费总额，运费最多精确到小数点后2位
        self.freight = freight          # type: str
        # 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
        self.easy_finance = easy_finance  # type: bool
        # 凭证到期时间
        self.expire_date = expire_date  # type: str
        # 发行结果回调地址
        self.callback_url = callback_url  # type: str
        # 需合并发行的运单id列表
        self.waybill_ids = waybill_ids  # type: List[str]

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['product_id'] = self.product_id
        result['group_platform_did'] = self.group_platform_did
        result['create_did'] = self.create_did
        result['receive_did'] = self.receive_did
        result['batch_id'] = self.batch_id
        result['out_biz_no'] = self.out_biz_no
        result['pay_order'] = self.pay_order
        result['freight'] = self.freight
        result['easy_finance'] = self.easy_finance
        result['expire_date'] = self.expire_date
        result['callback_url'] = self.callback_url
        result['waybill_ids'] = self.waybill_ids
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.product_id = map.get('product_id')
        self.group_platform_did = map.get('group_platform_did')
        self.create_did = map.get('create_did')
        self.receive_did = map.get('receive_did')
        self.batch_id = map.get('batch_id')
        self.out_biz_no = map.get('out_biz_no')
        self.pay_order = map.get('pay_order')
        self.freight = map.get('freight')
        self.easy_finance = map.get('easy_finance')
        self.expire_date = map.get('expire_date')
        self.callback_url = map.get('callback_url')
        self.waybill_ids = map.get('waybill_ids')
        return self


class BatchcreateDigitalLogisticCreditIssueResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None, batch_status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 批次id
        self.batch_id = batch_id        # type: str
        # 批次状态
        self.batch_status = batch_status  # type: int

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        result['batch_status'] = self.batch_status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        self.batch_status = map.get('batch_status')
        return self


class UploadDigitalLogisticCreditIssuebatchRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, batch_id=None,
                 callback_url=None, create_did=None, easy_finance=None, expire_date=None, freight=None, group_platform_did=None,
                 out_biz_no=None, pay_order=None, product_id=None, receive_did=None, waybill_ids=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 批次id
        self.batch_id = batch_id        # type: str
        # 回调地址
        self.callback_url = callback_url  # type: str
        # 凭证发行方did
        self.create_did = create_did    # type: str
        # 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
        self.easy_finance = easy_finance  # type: bool
        # 凭证到期时间
        self.expire_date = expire_date  # type: str
        # 支付单运费总额，运费最多精确到小数点后2位
        self.freight = freight          # type: str
        # 集团平台did
        self.group_platform_did = group_platform_did  # type: str
        # 全局业务唯一编号
        self.out_biz_no = out_biz_no    # type: str
        # 支付订单号
        self.pay_order = pay_order      # type: str
        # 产品id
        self.product_id = product_id    # type: str
        # 凭证接收方did
        self.receive_did = receive_did  # type: str
        # 运单合并列表
        self.waybill_ids = waybill_ids  # type: List[str]

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['batch_id'] = self.batch_id
        result['callback_url'] = self.callback_url
        result['create_did'] = self.create_did
        result['easy_finance'] = self.easy_finance
        result['expire_date'] = self.expire_date
        result['freight'] = self.freight
        result['group_platform_did'] = self.group_platform_did
        result['out_biz_no'] = self.out_biz_no
        result['pay_order'] = self.pay_order
        result['product_id'] = self.product_id
        result['receive_did'] = self.receive_did
        result['waybill_ids'] = self.waybill_ids
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.batch_id = map.get('batch_id')
        self.callback_url = map.get('callback_url')
        self.create_did = map.get('create_did')
        self.easy_finance = map.get('easy_finance')
        self.expire_date = map.get('expire_date')
        self.freight = map.get('freight')
        self.group_platform_did = map.get('group_platform_did')
        self.out_biz_no = map.get('out_biz_no')
        self.pay_order = map.get('pay_order')
        self.product_id = map.get('product_id')
        self.receive_did = map.get('receive_did')
        self.waybill_ids = map.get('waybill_ids')
        return self


class UploadDigitalLogisticCreditIssuebatchResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, batch_id=None, batch_status=None,
                 issue_url=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 批次id
        self.batch_id = batch_id        # type: str
        # 批次状态
        self.batch_status = batch_status  # type: int
        # 发行链接
        self.issue_url = issue_url      # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['batch_id'] = self.batch_id
        result['batch_status'] = self.batch_status
        result['issue_url'] = self.issue_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.batch_id = map.get('batch_id')
        self.batch_status = map.get('batch_status')
        self.issue_url = map.get('issue_url')
        return self


class GetDigitalLogisticIssueTransferfileRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, apply_id=None,
                 callback_url=None, group_platform_did=None, issue_transfer_datas=None, platform_did=None, product_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 申请唯一流水号
        self.apply_id = apply_id        # type: str
        # 回调地址
        # 
        self.callback_url = callback_url  # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 信用流转凭证集合，最大长度支持30
        self.issue_transfer_datas = issue_transfer_datas  # type: List[IssueTransferData]
        # 业务发起方分布式数字身份
        self.platform_did = platform_did  # type: str
        # 产品id
        # 
        self.product_id = product_id    # type: str

    def validate(self):
        if self.issue_transfer_datas:
            for k in self.issue_transfer_datas:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['apply_id'] = self.apply_id
        result['callback_url'] = self.callback_url
        result['group_platform_did'] = self.group_platform_did
        result['issue_transfer_datas'] = []
        if self.issue_transfer_datas is not None:
            for k in self.issue_transfer_datas:
                result['issue_transfer_datas'].append(k.to_map() if k else None)
        else:
            result['issue_transfer_datas'] = None
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.apply_id = map.get('apply_id')
        self.callback_url = map.get('callback_url')
        self.group_platform_did = map.get('group_platform_did')
        self.issue_transfer_datas = []
        if map.get('issue_transfer_datas') is not None:
            for k in map.get('issue_transfer_datas'):
                temp_model = IssueTransferData()
                self.issue_transfer_datas.append(temp_model.from_map(k))
        else:
            self.issue_transfer_datas = None
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class GetDigitalLogisticIssueTransferfileResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, apply_id=None, group_platform_did=None,
                 platform_did=None, product_id=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 申请唯一流水号
        self.apply_id = apply_id        # type: str
        # 集团平台方分布式数字身份
        self.group_platform_did = group_platform_did  # type: str
        # 业务发起方分布式数字身
        self.platform_did = platform_did  # type: str
        # 产品id
        self.product_id = product_id    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['apply_id'] = self.apply_id
        result['group_platform_did'] = self.group_platform_did
        result['platform_did'] = self.platform_did
        result['product_id'] = self.product_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.apply_id = map.get('apply_id')
        self.group_platform_did = map.get('group_platform_did')
        self.platform_did = map.get('platform_did')
        self.product_id = map.get('product_id')
        return self


class ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bbr_addr=None, bbr_id_no=None,
                 bbr_id_type=None, bbr_name=None, bbr_tel=None, carriage=None, car_go=None, cp_model=None, destination=None,
                 driv_per=None, eff_date=None, engine_no=None, frame_no=None, group_platform_did=None,
                 identify_period_end=None, identify_period_start=None, license_no=None, platform_did=None, run_no=None,
                 start_place=None, tbr_addr=None, tbr_email=None, tbr_id_no=None, tbr_id_type=None, tbr_name=None, tbr_tel=None,
                 term_date=None, ton_nage=None, trade_no=None, ts_car_go=None, waybill_id=None, weight=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 被保险人地址
        self.bbr_addr = bbr_addr        # type: str
        # 被保险人证件号码
        self.bbr_id_no = bbr_id_no      # type: str
        # 被保险人证件类型。按照如下值填写
        # 464001	身份证
        # 464002	护照
        # 464003	其他
        # 464004	组织机构代码
        # 464005	军人证
        # 464006	工商注册号码
        # 464007	统一社会信用代码
        # 464008	临时身份证
        # 464009	外国护照
        # 464010	中国人民武装警察身份证件
        # 464011	军官证
        # 464012	企业营业执照号码
        # 464013	统一社会信用代码（五证合一号码）
        # 464014	个体工商户营业执照号码
        # 464015	户口本
        # 464016	其他类境内个人身份有效证件
        # 464017	其他类境外个人身份有效证件
        # 464018	税务登记证
        # 464019	金融许可证号码
        # 464020	国家主管部门颁外国驻华机构批文号码
        # 464021	其他类境外机构代码
        self.bbr_id_type = bbr_id_type  # type: str
        # 被保险人姓名
        self.bbr_name = bbr_name        # type: str
        # 被保险人联系电话
        self.bbr_tel = bbr_tel          # type: str
        # 运费,四舍五入精确到小数点两位。系统将根据运费和费率计算含税保费，计算的保费结果为四舍五入，精确到两位小数
        self.carriage = carriage        # type: str
        # 货物名称
        self.car_go = car_go            # type: str
        # 厂牌型号
        self.cp_model = cp_model        # type: str
        # 目的地
        self.destination = destination  # type: str
        # 行驶证车主
        self.driv_per = driv_per        # type: str
        # 保险起期，精确到天；最短起保时间为次日0点，最长延时起保时间为次日0点后24h
        self.eff_date = eff_date        # type: str
        # 发动机编号
        self.engine_no = engine_no      # type: str
        # 车架号
        self.frame_no = frame_no        # type: str
        # 运单所属集团分布式身份标识
        self.group_platform_did = group_platform_did  # type: str
        # 投保人证件类型有效止期
        self.identify_period_end = identify_period_end  # type: str
        # 投保人证件类型有效起期
        self.identify_period_start = identify_period_start  # type: str
        # 车牌号码
        self.license_no = license_no    # type: str
        # 运单所属平台分布式身份标识
        self.platform_did = platform_did  # type: str
        # 运营证号
        self.run_no = run_no            # type: str
        # 起运地
        self.start_place = start_place  # type: str
        # 投保人地址
        self.tbr_addr = tbr_addr        # type: str
        # 投保人邮箱
        self.tbr_email = tbr_email      # type: str
        # 投保人证件号
        self.tbr_id_no = tbr_id_no      # type: str
        # 投保人证件类型，按照如下状态进行填写
        # 464001	身份证
        # 464002	护照
        # 464003	其他
        # 464004	组织机构代码
        # 464005	军人证
        # 464006	工商注册号码
        # 464007	统一社会信用代码
        # 464008	临时身份证
        # 464009	外国护照
        # 464010	中国人民武装警察身份证件
        # 464011	军官证
        # 464012	企业营业执照号码
        # 464013	统一社会信用代码（五证合一号码）
        # 464014	个体工商户营业执照号码
        # 464015	户口本
        # 464016	其他类境内个人身份有效证件
        # 464017	其他类境外个人身份有效证件
        # 464018	税务登记证
        # 464019	金融许可证号码
        # 464020	国家主管部门颁外国驻华机构批文号码
        # 464021	其他类境外机构代码
        self.tbr_id_type = tbr_id_type  # type: str
        # 投保人姓名
        self.tbr_name = tbr_name        # type: str
        # 投保人联系电话
        self.tbr_tel = tbr_tel          # type: str
        # 保险止期，保期时间间隔为1-30天。
        self.term_date = term_date      # type: str
        # 吨位
        self.ton_nage = ton_nage        # type: str
        # 交易流水号,全局唯一；格式为 yyyyMMdd+身份标识+其他编码。系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中状态，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果
        self.trade_no = trade_no        # type: str
        # 运输货物
        self.ts_car_go = ts_car_go      # type: str
        # 运单id。通过运单创建接口上传运单时指定的运单标识。系统会根据该标识查询运单相关信息做投保业务校验
        self.waybill_id = waybill_id    # type: str
        # 重量
        self.weight = weight            # type: str

    def validate(self):
        if self.bbr_addr is not None:
            self.validate_max_length(self.bbr_addr, 'bbr_addr', 80)
        if self.bbr_id_no is not None:
            self.validate_max_length(self.bbr_id_no, 'bbr_id_no', 40)
        if self.bbr_id_type is not None:
            self.validate_max_length(self.bbr_id_type, 'bbr_id_type', 40)
        if self.bbr_name is not None:
            self.validate_max_length(self.bbr_name, 'bbr_name', 40)
        if self.bbr_tel is not None:
            self.validate_max_length(self.bbr_tel, 'bbr_tel', 40)
        if self.carriage is not None:
            self.validate_max_length(self.carriage, 'carriage', 20)
        if self.car_go is not None:
            self.validate_max_length(self.car_go, 'car_go', 40)
        if self.cp_model is not None:
            self.validate_max_length(self.cp_model, 'cp_model', 80)
        if self.destination is not None:
            self.validate_max_length(self.destination, 'destination', 200)
        if self.driv_per is not None:
            self.validate_max_length(self.driv_per, 'driv_per', 40)
        if self.eff_date is not None:
            self.validate_pattern(self.eff_date, 'eff_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.engine_no is not None:
            self.validate_max_length(self.engine_no, 'engine_no', 40)
        if self.frame_no is not None:
            self.validate_max_length(self.frame_no, 'frame_no', 40)
        if self.group_platform_did is not None:
            self.validate_max_length(self.group_platform_did, 'group_platform_did', 80)
        if self.identify_period_end is not None:
            self.validate_pattern(self.identify_period_end, 'identify_period_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.identify_period_start is not None:
            self.validate_pattern(self.identify_period_start, 'identify_period_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.license_no is not None:
            self.validate_max_length(self.license_no, 'license_no', 40)
        if self.platform_did is not None:
            self.validate_max_length(self.platform_did, 'platform_did', 80)
        if self.run_no is not None:
            self.validate_max_length(self.run_no, 'run_no', 40)
        if self.start_place is not None:
            self.validate_max_length(self.start_place, 'start_place', 200)
        if self.tbr_addr is not None:
            self.validate_max_length(self.tbr_addr, 'tbr_addr', 80)
        if self.tbr_email is not None:
            self.validate_max_length(self.tbr_email, 'tbr_email', 40)
        if self.tbr_id_no is not None:
            self.validate_max_length(self.tbr_id_no, 'tbr_id_no', 40)
        if self.tbr_id_type is not None:
            self.validate_max_length(self.tbr_id_type, 'tbr_id_type', 40)
        if self.tbr_name is not None:
            self.validate_max_length(self.tbr_name, 'tbr_name', 40)
        if self.tbr_tel is not None:
            self.validate_max_length(self.tbr_tel, 'tbr_tel', 40)
        if self.term_date is not None:
            self.validate_pattern(self.term_date, 'term_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.ton_nage is not None:
            self.validate_max_length(self.ton_nage, 'ton_nage', 20)
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 32)
        if self.ts_car_go is not None:
            self.validate_max_length(self.ts_car_go, 'ts_car_go', 80)
        if self.waybill_id is not None:
            self.validate_max_length(self.waybill_id, 'waybill_id', 128)
        if self.weight is not None:
            self.validate_max_length(self.weight, 'weight', 20)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bbr_addr'] = self.bbr_addr
        result['bbr_id_no'] = self.bbr_id_no
        result['bbr_id_type'] = self.bbr_id_type
        result['bbr_name'] = self.bbr_name
        result['bbr_tel'] = self.bbr_tel
        result['carriage'] = self.carriage
        result['car_go'] = self.car_go
        result['cp_model'] = self.cp_model
        result['destination'] = self.destination
        result['driv_per'] = self.driv_per
        result['eff_date'] = self.eff_date
        result['engine_no'] = self.engine_no
        result['frame_no'] = self.frame_no
        result['group_platform_did'] = self.group_platform_did
        result['identify_period_end'] = self.identify_period_end
        result['identify_period_start'] = self.identify_period_start
        result['license_no'] = self.license_no
        result['platform_did'] = self.platform_did
        result['run_no'] = self.run_no
        result['start_place'] = self.start_place
        result['tbr_addr'] = self.tbr_addr
        result['tbr_email'] = self.tbr_email
        result['tbr_id_no'] = self.tbr_id_no
        result['tbr_id_type'] = self.tbr_id_type
        result['tbr_name'] = self.tbr_name
        result['tbr_tel'] = self.tbr_tel
        result['term_date'] = self.term_date
        result['ton_nage'] = self.ton_nage
        result['trade_no'] = self.trade_no
        result['ts_car_go'] = self.ts_car_go
        result['waybill_id'] = self.waybill_id
        result['weight'] = self.weight
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bbr_addr = map.get('bbr_addr')
        self.bbr_id_no = map.get('bbr_id_no')
        self.bbr_id_type = map.get('bbr_id_type')
        self.bbr_name = map.get('bbr_name')
        self.bbr_tel = map.get('bbr_tel')
        self.carriage = map.get('carriage')
        self.car_go = map.get('car_go')
        self.cp_model = map.get('cp_model')
        self.destination = map.get('destination')
        self.driv_per = map.get('driv_per')
        self.eff_date = map.get('eff_date')
        self.engine_no = map.get('engine_no')
        self.frame_no = map.get('frame_no')
        self.group_platform_did = map.get('group_platform_did')
        self.identify_period_end = map.get('identify_period_end')
        self.identify_period_start = map.get('identify_period_start')
        self.license_no = map.get('license_no')
        self.platform_did = map.get('platform_did')
        self.run_no = map.get('run_no')
        self.start_place = map.get('start_place')
        self.tbr_addr = map.get('tbr_addr')
        self.tbr_email = map.get('tbr_email')
        self.tbr_id_no = map.get('tbr_id_no')
        self.tbr_id_type = map.get('tbr_id_type')
        self.tbr_name = map.get('tbr_name')
        self.tbr_tel = map.get('tbr_tel')
        self.term_date = map.get('term_date')
        self.ton_nage = map.get('ton_nage')
        self.trade_no = map.get('trade_no')
        self.ts_car_go = map.get('ts_car_go')
        self.waybill_id = map.get('waybill_id')
        self.weight = map.get('weight')
        return self


class ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, pol_no=None, pol_url=None, pre_mium=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 保单号
        self.pol_no = pol_no            # type: str
        # 电子保单下载地址
        self.pol_url = pol_url          # type: str
        # 含税保费
        self.pre_mium = pre_mium        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['pol_no'] = self.pol_no
        result['pol_url'] = self.pol_url
        result['pre_mium'] = self.pre_mium
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.pol_no = map.get('pol_no')
        self.pol_url = map.get('pol_url')
        self.pre_mium = map.get('pre_mium')
        return self


class CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, pol_no=None, pre_mium=None,
                 trade_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 保单号，投保成功后返回的
        self.pol_no = pol_no            # type: str
        # 含税保费，精确到小数点后两位
        self.pre_mium = pre_mium        # type: str
        # 全局唯一交易流水号
        self.trade_no = trade_no        # type: str

    def validate(self):
        if self.pol_no is not None:
            self.validate_max_length(self.pol_no, 'pol_no', 60)
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 32)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['pol_no'] = self.pol_no
        result['pre_mium'] = self.pre_mium
        result['trade_no'] = self.trade_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.pol_no = map.get('pol_no')
        self.pre_mium = map.get('pre_mium')
        self.trade_no = map.get('trade_no')
        return self


class CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, pol_no=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 退保成功的对应的保单号
        self.pol_no = pol_no            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['pol_no'] = self.pol_no
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.pol_no = map.get('pol_no')
        return self


class PushDigitalLogisticInsurancenotifyClaimRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, category=None, content=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 通知类型：
        # claims_pay:理赔支付信息
        # claims_info: 理赔信息
        self.category = category        # type: str
        # 通知内容
        self.content = content          # type: str

    def validate(self):
        if self.category is not None:
            self.validate_max_length(self.category, 'category', 16)
        if self.content is not None:
            self.validate_max_length(self.content, 'content', 3000)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['category'] = self.category
        result['content'] = self.content
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.category = map.get('category')
        self.content = map.get('content')
        return self


class PushDigitalLogisticInsurancenotifyClaimResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, data=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 业务返回报文
        self.data = data                # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['data'] = self.data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.data = map.get('data')
        return self


class ApplyDigitalLogisticInsuranceFileurlRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, file_name=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 上传的文件名，要求文件名后缀必须以 _yyyyMMdd结尾
        self.file_name = file_name      # type: str

    def validate(self):
        if self.file_name is not None:
            self.validate_max_length(self.file_name, 'file_name', 80)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['file_name'] = self.file_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.file_name = map.get('file_name')
        return self


class ApplyDigitalLogisticInsuranceFileurlResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, file_url=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 用于上传文件的连接
        self.file_url = file_url        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['file_url'] = self.file_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.file_url = map.get('file_url')
        return self


class ApplyDigitalLogisticInsurancepolicyUniversalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_bank_name=None,
                 bank_account_information=None, bbr_addr=None, bbr_did=None, bbr_id_no=None, bbr_id_type=None, bbr_name=None, bbr_tel=None,
                 bbr_type=None, cargo_name=None, cargo_quantity=None, cargo_quantity_unit=None, cargo_tonnage=None,
                 cargo_type=None, cargo_volume=None, cargo_worth=None, car_length=None, car_model=None, destination=None,
                 driver_name=None, driver_tel=None, eff_date=None, external_channel_code=None, external_product_code=None,
                 frame_no=None, insured_amount=None, license_no=None, license_plate_color=None, nsr_identifier=None,
                 order_time=None, packing=None, print_invoice=None, rate=None, start_place=None, tbr_addr=None,
                 tbr_corporate_contract=None, tbr_did=None, tbr_email=None, tbr_id_no=None, tbr_id_type=None, tbr_name=None, tbr_tel=None,
                 tbr_type=None, term_date=None, ticket_addr=None, trade_no=None, transit_point=None, waybill_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 投保人开户银行，当打印发票选择为“1”时，必填
        self.account_bank_name = account_bank_name  # type: str
        # 投保人银行账户，当打印发票选择为“1”时，必填
        self.bank_account_information = bank_account_information  # type: str
        # 被保人地址
        self.bbr_addr = bbr_addr        # type: str
        # 被保人did（被保人所在链上分布式数字身份）
        self.bbr_did = bbr_did          # type: str
        # 被保人证件号
        self.bbr_id_no = bbr_id_no      # type: str
        # 被保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他
        # 
        self.bbr_id_type = bbr_id_type  # type: str
        # 被保人姓名
        self.bbr_name = bbr_name        # type: str
        # 被保人电话号
        self.bbr_tel = bbr_tel          # type: str
        # 被保人类型, 1-个人 2-团队
        self.bbr_type = bbr_type        # type: str
        # 货物名称
        self.cargo_name = cargo_name    # type: str
        # 货物数量
        self.cargo_quantity = cargo_quantity  # type: str
        # 货物数量单位
        self.cargo_quantity_unit = cargo_quantity_unit  # type: str
        # 货物吨位
        self.cargo_tonnage = cargo_tonnage  # type: str
        # 货物类型，普货，手机/电子产品/家用电器，精密仪器，家具，易碎品，大宗散货，生鲜（瓜果蔬菜），棉纱
        self.cargo_type = cargo_type    # type: str
        # 货物体积
        self.cargo_volume = cargo_volume  # type: str
        # 货值
        self.cargo_worth = cargo_worth  # type: str
        # 车长
        self.car_length = car_length    # type: str
        # 车型
        self.car_model = car_model      # type: str
        # 目的地，格式为"省-市-区"
        self.destination = destination  # type: str
        # 司机姓名
        self.driver_name = driver_name  # type: str
        # 司机联系方式
        self.driver_tel = driver_tel    # type: str
        # 保险起始时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计起运日期
        self.eff_date = eff_date        # type: str
        # 保司, 01-华泰, 02-平安, 03-亚太
        self.external_channel_code = external_channel_code  # type: str
        # 险种, 01-承运人平台责任险
        # 
        self.external_product_code = external_product_code  # type: str
        # 车架号
        self.frame_no = frame_no        # type: str
        # 投保额，整数以元为单位
        # 
        self.insured_amount = insured_amount  # type: str
        # 车牌号
        self.license_no = license_no    # type: str
        # 车牌颜色，01-黄牌，02-蓝牌
        self.license_plate_color = license_plate_color  # type: str
        # 税务登记证/纳税人识别号，当打印发票选择为“1”时，必填
        self.nsr_identifier = nsr_identifier  # type: str
        # 接单时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
        self.order_time = order_time    # type: str
        # 包装方式, 01-箱装、02-袋装、03-包装、04-桶装、05-捆扎包装、06-裸装、07-散装、08-其他包装
        self.packing = packing          # type: str
        # 是否打印发票，默认0-不开票  1-专票 2-电子发票
        self.print_invoice = print_invoice  # type: str
        # 费率，按实际业务商讨费率执行, 但最终结果以保司计算结果为准，0到1之间，最多6位小数
        self.rate = rate                # type: str
        # 起运地，格式为"省-市-区"
        self.start_place = start_place  # type: str
        # 投保人地址，当打印发票选择为“1”时，必填
        self.tbr_addr = tbr_addr        # type: str
        # 投保人-企业联系人联系方式
        self.tbr_corporate_contract = tbr_corporate_contract  # type: str
        # 投保人did（投保人所在链上分布式数字身份）
        self.tbr_did = tbr_did          # type: str
        # 投保人邮箱，用以接受电子发票的邮箱地址
        self.tbr_email = tbr_email      # type: str
        # 投保人证件号
        self.tbr_id_no = tbr_id_no      # type: str
        # 投保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他
        self.tbr_id_type = tbr_id_type  # type: str
        # 投保人名称
        self.tbr_name = tbr_name        # type: str
        # 投保人电话号
        self.tbr_tel = tbr_tel          # type: str
        # 投保人类型, 1-个人 2-团队
        self.tbr_type = tbr_type        # type: str
        # 保险截止时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计到达日期，保险止期间隔为1-30天
        self.term_date = term_date      # type: str
        # 专票邮寄地址
        self.ticket_addr = ticket_addr  # type: str
        # 订单号, 年月日+唯一字符ID
        self.trade_no = trade_no        # type: str
        # 中转地，格式为"省-市-区"
        self.transit_point = transit_point  # type: str
        # 运单id（平台方运单id）
        self.waybill_id = waybill_id    # type: str

    def validate(self):
        if self.account_bank_name is not None:
            self.validate_max_length(self.account_bank_name, 'account_bank_name', 100)
        if self.bank_account_information is not None:
            self.validate_max_length(self.bank_account_information, 'bank_account_information', 50)
        if self.bbr_addr is not None:
            self.validate_max_length(self.bbr_addr, 'bbr_addr', 200)
        if self.bbr_did is not None:
            self.validate_max_length(self.bbr_did, 'bbr_did', 200)
        if self.bbr_id_no is not None:
            self.validate_max_length(self.bbr_id_no, 'bbr_id_no', 50)
        if self.bbr_id_type is not None:
            self.validate_max_length(self.bbr_id_type, 'bbr_id_type', 2)
        if self.bbr_name is not None:
            self.validate_max_length(self.bbr_name, 'bbr_name', 100)
        if self.bbr_tel is not None:
            self.validate_max_length(self.bbr_tel, 'bbr_tel', 20)
        if self.bbr_type is not None:
            self.validate_max_length(self.bbr_type, 'bbr_type', 1)
        if self.cargo_name is not None:
            self.validate_max_length(self.cargo_name, 'cargo_name', 100)
        if self.cargo_quantity is not None:
            self.validate_max_length(self.cargo_quantity, 'cargo_quantity', 20)
        if self.cargo_quantity_unit is not None:
            self.validate_max_length(self.cargo_quantity_unit, 'cargo_quantity_unit', 20)
        if self.cargo_tonnage is not None:
            self.validate_max_length(self.cargo_tonnage, 'cargo_tonnage', 20)
        if self.cargo_type is not None:
            self.validate_max_length(self.cargo_type, 'cargo_type', 50)
        if self.cargo_volume is not None:
            self.validate_max_length(self.cargo_volume, 'cargo_volume', 20)
        if self.cargo_worth is not None:
            self.validate_max_length(self.cargo_worth, 'cargo_worth', 50)
        if self.car_length is not None:
            self.validate_max_length(self.car_length, 'car_length', 10)
        if self.car_model is not None:
            self.validate_max_length(self.car_model, 'car_model', 20)
        if self.destination is not None:
            self.validate_max_length(self.destination, 'destination', 100)
        if self.driver_name is not None:
            self.validate_max_length(self.driver_name, 'driver_name', 50)
        if self.driver_tel is not None:
            self.validate_max_length(self.driver_tel, 'driver_tel', 20)
        if self.eff_date is not None:
            self.validate_pattern(self.eff_date, 'eff_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.external_channel_code is not None:
            self.validate_max_length(self.external_channel_code, 'external_channel_code', 2)
        if self.external_product_code is not None:
            self.validate_max_length(self.external_product_code, 'external_product_code', 2)
        if self.frame_no is not None:
            self.validate_max_length(self.frame_no, 'frame_no', 50)
        if self.insured_amount is not None:
            self.validate_max_length(self.insured_amount, 'insured_amount', 12)
        if self.license_no is not None:
            self.validate_max_length(self.license_no, 'license_no', 20)
        if self.license_plate_color is not None:
            self.validate_max_length(self.license_plate_color, 'license_plate_color', 2)
        if self.nsr_identifier is not None:
            self.validate_max_length(self.nsr_identifier, 'nsr_identifier', 50)
        if self.order_time is not None:
            self.validate_pattern(self.order_time, 'order_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.packing is not None:
            self.validate_max_length(self.packing, 'packing', 100)
        if self.print_invoice is not None:
            self.validate_max_length(self.print_invoice, 'print_invoice', 1)
        if self.rate is not None:
            self.validate_max_length(self.rate, 'rate', 8)
        if self.start_place is not None:
            self.validate_max_length(self.start_place, 'start_place', 100)
        if self.tbr_addr is not None:
            self.validate_max_length(self.tbr_addr, 'tbr_addr', 200)
        if self.tbr_corporate_contract is not None:
            self.validate_max_length(self.tbr_corporate_contract, 'tbr_corporate_contract', 20)
        if self.tbr_did is not None:
            self.validate_max_length(self.tbr_did, 'tbr_did', 200)
        if self.tbr_email is not None:
            self.validate_max_length(self.tbr_email, 'tbr_email', 50)
        if self.tbr_id_no is not None:
            self.validate_max_length(self.tbr_id_no, 'tbr_id_no', 50)
        if self.tbr_id_type is not None:
            self.validate_max_length(self.tbr_id_type, 'tbr_id_type', 2)
        if self.tbr_name is not None:
            self.validate_max_length(self.tbr_name, 'tbr_name', 100)
        if self.tbr_tel is not None:
            self.validate_max_length(self.tbr_tel, 'tbr_tel', 20)
        if self.tbr_type is not None:
            self.validate_max_length(self.tbr_type, 'tbr_type', 1)
        if self.term_date is not None:
            self.validate_pattern(self.term_date, 'term_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.ticket_addr is not None:
            self.validate_max_length(self.ticket_addr, 'ticket_addr', 200)
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 50)
        if self.transit_point is not None:
            self.validate_max_length(self.transit_point, 'transit_point', 100)
        if self.waybill_id is not None:
            self.validate_max_length(self.waybill_id, 'waybill_id', 50)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_bank_name'] = self.account_bank_name
        result['bank_account_information'] = self.bank_account_information
        result['bbr_addr'] = self.bbr_addr
        result['bbr_did'] = self.bbr_did
        result['bbr_id_no'] = self.bbr_id_no
        result['bbr_id_type'] = self.bbr_id_type
        result['bbr_name'] = self.bbr_name
        result['bbr_tel'] = self.bbr_tel
        result['bbr_type'] = self.bbr_type
        result['cargo_name'] = self.cargo_name
        result['cargo_quantity'] = self.cargo_quantity
        result['cargo_quantity_unit'] = self.cargo_quantity_unit
        result['cargo_tonnage'] = self.cargo_tonnage
        result['cargo_type'] = self.cargo_type
        result['cargo_volume'] = self.cargo_volume
        result['cargo_worth'] = self.cargo_worth
        result['car_length'] = self.car_length
        result['car_model'] = self.car_model
        result['destination'] = self.destination
        result['driver_name'] = self.driver_name
        result['driver_tel'] = self.driver_tel
        result['eff_date'] = self.eff_date
        result['external_channel_code'] = self.external_channel_code
        result['external_product_code'] = self.external_product_code
        result['frame_no'] = self.frame_no
        result['insured_amount'] = self.insured_amount
        result['license_no'] = self.license_no
        result['license_plate_color'] = self.license_plate_color
        result['nsr_identifier'] = self.nsr_identifier
        result['order_time'] = self.order_time
        result['packing'] = self.packing
        result['print_invoice'] = self.print_invoice
        result['rate'] = self.rate
        result['start_place'] = self.start_place
        result['tbr_addr'] = self.tbr_addr
        result['tbr_corporate_contract'] = self.tbr_corporate_contract
        result['tbr_did'] = self.tbr_did
        result['tbr_email'] = self.tbr_email
        result['tbr_id_no'] = self.tbr_id_no
        result['tbr_id_type'] = self.tbr_id_type
        result['tbr_name'] = self.tbr_name
        result['tbr_tel'] = self.tbr_tel
        result['tbr_type'] = self.tbr_type
        result['term_date'] = self.term_date
        result['ticket_addr'] = self.ticket_addr
        result['trade_no'] = self.trade_no
        result['transit_point'] = self.transit_point
        result['waybill_id'] = self.waybill_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_bank_name = map.get('account_bank_name')
        self.bank_account_information = map.get('bank_account_information')
        self.bbr_addr = map.get('bbr_addr')
        self.bbr_did = map.get('bbr_did')
        self.bbr_id_no = map.get('bbr_id_no')
        self.bbr_id_type = map.get('bbr_id_type')
        self.bbr_name = map.get('bbr_name')
        self.bbr_tel = map.get('bbr_tel')
        self.bbr_type = map.get('bbr_type')
        self.cargo_name = map.get('cargo_name')
        self.cargo_quantity = map.get('cargo_quantity')
        self.cargo_quantity_unit = map.get('cargo_quantity_unit')
        self.cargo_tonnage = map.get('cargo_tonnage')
        self.cargo_type = map.get('cargo_type')
        self.cargo_volume = map.get('cargo_volume')
        self.cargo_worth = map.get('cargo_worth')
        self.car_length = map.get('car_length')
        self.car_model = map.get('car_model')
        self.destination = map.get('destination')
        self.driver_name = map.get('driver_name')
        self.driver_tel = map.get('driver_tel')
        self.eff_date = map.get('eff_date')
        self.external_channel_code = map.get('external_channel_code')
        self.external_product_code = map.get('external_product_code')
        self.frame_no = map.get('frame_no')
        self.insured_amount = map.get('insured_amount')
        self.license_no = map.get('license_no')
        self.license_plate_color = map.get('license_plate_color')
        self.nsr_identifier = map.get('nsr_identifier')
        self.order_time = map.get('order_time')
        self.packing = map.get('packing')
        self.print_invoice = map.get('print_invoice')
        self.rate = map.get('rate')
        self.start_place = map.get('start_place')
        self.tbr_addr = map.get('tbr_addr')
        self.tbr_corporate_contract = map.get('tbr_corporate_contract')
        self.tbr_did = map.get('tbr_did')
        self.tbr_email = map.get('tbr_email')
        self.tbr_id_no = map.get('tbr_id_no')
        self.tbr_id_type = map.get('tbr_id_type')
        self.tbr_name = map.get('tbr_name')
        self.tbr_tel = map.get('tbr_tel')
        self.tbr_type = map.get('tbr_type')
        self.term_date = map.get('term_date')
        self.ticket_addr = map.get('ticket_addr')
        self.trade_no = map.get('trade_no')
        self.transit_point = map.get('transit_point')
        self.waybill_id = map.get('waybill_id')
        return self


class ApplyDigitalLogisticInsurancepolicyUniversalResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, pol_no=None, pol_url=None,
                 total_premium=None, trade_no=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 保单号
        self.pol_no = pol_no            # type: str
        # 电子保单下载地址
        self.pol_url = pol_url          # type: str
        # 总保费
        self.total_premium = total_premium  # type: str
        # 订单号
        self.trade_no = trade_no        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['pol_no'] = self.pol_no
        result['pol_url'] = self.pol_url
        result['total_premium'] = self.total_premium
        result['trade_no'] = self.trade_no
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.pol_no = map.get('pol_no')
        self.pol_url = map.get('pol_url')
        self.total_premium = map.get('total_premium')
        self.trade_no = map.get('trade_no')
        return self


class CancelDigitalLogisticInsurancepolicyUniversalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, apply_trade_no=None,
                 external_channel_code=None, external_product_code=None, pol_no=None, trade_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 投保订单号
        self.apply_trade_no = apply_trade_no  # type: str
        # 保司, 01-华泰, 03-亚太
        self.external_channel_code = external_channel_code  # type: str
        # 险种, 01-承运人平台责任险
        # 
        self.external_product_code = external_product_code  # type: str
        # 保单号
        self.pol_no = pol_no            # type: str
        # 退保全局唯一流水号
        self.trade_no = trade_no        # type: str

    def validate(self):
        if self.apply_trade_no is not None:
            self.validate_max_length(self.apply_trade_no, 'apply_trade_no', 50)
        if self.external_channel_code is not None:
            self.validate_max_length(self.external_channel_code, 'external_channel_code', 2)
        if self.external_product_code is not None:
            self.validate_max_length(self.external_product_code, 'external_product_code', 2)
        if self.pol_no is not None:
            self.validate_max_length(self.pol_no, 'pol_no', 50)
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 50)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['apply_trade_no'] = self.apply_trade_no
        result['external_channel_code'] = self.external_channel_code
        result['external_product_code'] = self.external_product_code
        result['pol_no'] = self.pol_no
        result['trade_no'] = self.trade_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.apply_trade_no = map.get('apply_trade_no')
        self.external_channel_code = map.get('external_channel_code')
        self.external_product_code = map.get('external_product_code')
        self.pol_no = map.get('pol_no')
        self.trade_no = map.get('trade_no')
        return self


class CancelDigitalLogisticInsurancepolicyUniversalResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, apply_trade_no=None, pol_no=None,
                 send_back_premium=None, success_surrender_time=None, surrender_effective_time=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 投保订单号
        self.apply_trade_no = apply_trade_no  # type: str
        # 保单号
        self.pol_no = pol_no            # type: str
        # 退还保费
        self.send_back_premium = send_back_premium  # type: str
        # 成功退保时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
        self.success_surrender_time = success_surrender_time  # type: str
        # 退保生效时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
        self.surrender_effective_time = surrender_effective_time  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['apply_trade_no'] = self.apply_trade_no
        result['pol_no'] = self.pol_no
        result['send_back_premium'] = self.send_back_premium
        result['success_surrender_time'] = self.success_surrender_time
        result['surrender_effective_time'] = self.surrender_effective_time
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.apply_trade_no = map.get('apply_trade_no')
        self.pol_no = map.get('pol_no')
        self.send_back_premium = map.get('send_back_premium')
        self.success_surrender_time = map.get('success_surrender_time')
        self.surrender_effective_time = map.get('surrender_effective_time')
        return self


class PushDigitalLogisticInsuranceOlpRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bbr_id_no=None, bbr_name=None,
                 bbr_type=None, channel_code=None, channel_name=None, claim_status=None, insure_date=None, insure_end=None,
                 insure_start=None, platform_consumer_code=None, platform_consumer_name=None, pol_file_ids=None, pol_no=None,
                 pol_status=None, pol_url=None, premium=None, product_code=None, product_name=None, surrender_time=None,
                 tbr_id_no=None, tbr_name=None, tbr_type=None, trade_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 被保人证件号
        self.bbr_id_no = bbr_id_no      # type: str
        # 被保人名称
        self.bbr_name = bbr_name        # type: str
        # 被保人类型, 1-个人 2-企业
        # 
        self.bbr_type = bbr_type        # type: str
        # 保险公司编码
        self.channel_code = channel_code  # type: str
        # 保险公司名称
        self.channel_name = channel_name  # type: str
        # 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，NOT_CLAIM: 未理赔
        self.claim_status = claim_status  # type: str
        # 投保时间
        self.insure_date = insure_date  # type: str
        # 保险止期
        self.insure_end = insure_end    # type: str
        # 保险起期
        self.insure_start = insure_start  # type: str
        # 存证平台编码
        self.platform_consumer_code = platform_consumer_code  # type: str
        # 存证平台名称
        self.platform_consumer_name = platform_consumer_name  # type: str
        # 保单文件id，可支持多个，逗号隔开
        self.pol_file_ids = pol_file_ids  # type: str
        # 保单号
        self.pol_no = pol_no            # type: str
        # 保单状态，INSURED: 已投保，SURRENDERED: 已退保,
        self.pol_status = pol_status    # type: str
        # 电子保单url地址
        self.pol_url = pol_url          # type: str
        # 保费
        self.premium = premium          # type: str
        # 险种代码
        self.product_code = product_code  # type: str
        # 险种名称
        self.product_name = product_name  # type: str
        # 退保时间
        self.surrender_time = surrender_time  # type: str
        # 投保人证件号
        self.tbr_id_no = tbr_id_no      # type: str
        # 投保人名称
        self.tbr_name = tbr_name        # type: str
        # 投保人类型, 1-个人 2-企业
        self.tbr_type = tbr_type        # type: str
        # 交易流水号
        self.trade_no = trade_no        # type: str

    def validate(self):
        if self.bbr_id_no is not None:
            self.validate_max_length(self.bbr_id_no, 'bbr_id_no', 50)
        if self.bbr_name is not None:
            self.validate_max_length(self.bbr_name, 'bbr_name', 100)
        if self.bbr_type is not None:
            self.validate_max_length(self.bbr_type, 'bbr_type', 10)
        if self.channel_code is not None:
            self.validate_max_length(self.channel_code, 'channel_code', 50)
        if self.channel_name is not None:
            self.validate_max_length(self.channel_name, 'channel_name', 100)
        if self.claim_status is not None:
            self.validate_max_length(self.claim_status, 'claim_status', 10)
        if self.insure_date is not None:
            self.validate_pattern(self.insure_date, 'insure_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.insure_end is not None:
            self.validate_pattern(self.insure_end, 'insure_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.insure_start is not None:
            self.validate_pattern(self.insure_start, 'insure_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.platform_consumer_code is not None:
            self.validate_max_length(self.platform_consumer_code, 'platform_consumer_code', 50)
        if self.platform_consumer_name is not None:
            self.validate_max_length(self.platform_consumer_name, 'platform_consumer_name', 100)
        if self.pol_file_ids is not None:
            self.validate_max_length(self.pol_file_ids, 'pol_file_ids', 3200)
        if self.pol_no is not None:
            self.validate_max_length(self.pol_no, 'pol_no', 100)
        if self.pol_status is not None:
            self.validate_max_length(self.pol_status, 'pol_status', 12)
        if self.pol_url is not None:
            self.validate_max_length(self.pol_url, 'pol_url', 500)
        if self.premium is not None:
            self.validate_max_length(self.premium, 'premium', 20)
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 50)
        if self.product_name is not None:
            self.validate_max_length(self.product_name, 'product_name', 100)
        if self.surrender_time is not None:
            self.validate_pattern(self.surrender_time, 'surrender_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.tbr_id_no is not None:
            self.validate_max_length(self.tbr_id_no, 'tbr_id_no', 50)
        if self.tbr_name is not None:
            self.validate_max_length(self.tbr_name, 'tbr_name', 100)
        if self.tbr_type is not None:
            self.validate_max_length(self.tbr_type, 'tbr_type', 10)
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 200)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bbr_id_no'] = self.bbr_id_no
        result['bbr_name'] = self.bbr_name
        result['bbr_type'] = self.bbr_type
        result['channel_code'] = self.channel_code
        result['channel_name'] = self.channel_name
        result['claim_status'] = self.claim_status
        result['insure_date'] = self.insure_date
        result['insure_end'] = self.insure_end
        result['insure_start'] = self.insure_start
        result['platform_consumer_code'] = self.platform_consumer_code
        result['platform_consumer_name'] = self.platform_consumer_name
        result['pol_file_ids'] = self.pol_file_ids
        result['pol_no'] = self.pol_no
        result['pol_status'] = self.pol_status
        result['pol_url'] = self.pol_url
        result['premium'] = self.premium
        result['product_code'] = self.product_code
        result['product_name'] = self.product_name
        result['surrender_time'] = self.surrender_time
        result['tbr_id_no'] = self.tbr_id_no
        result['tbr_name'] = self.tbr_name
        result['tbr_type'] = self.tbr_type
        result['trade_no'] = self.trade_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bbr_id_no = map.get('bbr_id_no')
        self.bbr_name = map.get('bbr_name')
        self.bbr_type = map.get('bbr_type')
        self.channel_code = map.get('channel_code')
        self.channel_name = map.get('channel_name')
        self.claim_status = map.get('claim_status')
        self.insure_date = map.get('insure_date')
        self.insure_end = map.get('insure_end')
        self.insure_start = map.get('insure_start')
        self.platform_consumer_code = map.get('platform_consumer_code')
        self.platform_consumer_name = map.get('platform_consumer_name')
        self.pol_file_ids = map.get('pol_file_ids')
        self.pol_no = map.get('pol_no')
        self.pol_status = map.get('pol_status')
        self.pol_url = map.get('pol_url')
        self.premium = map.get('premium')
        self.product_code = map.get('product_code')
        self.product_name = map.get('product_name')
        self.surrender_time = map.get('surrender_time')
        self.tbr_id_no = map.get('tbr_id_no')
        self.tbr_name = map.get('tbr_name')
        self.tbr_type = map.get('tbr_type')
        self.trade_no = map.get('trade_no')
        return self


class PushDigitalLogisticInsuranceOlpResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 返回状态
        self.status = status            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.status = map.get('status')
        return self


class UpdateDigitalLogisticInsuranceOlpRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bbr_id_no=None, bbr_name=None,
                 bbr_type=None, channel_code=None, channel_name=None, claim_status=None, insure_date=None, insure_end=None,
                 insure_start=None, platform_consumer_code=None, platform_consumer_name=None, pol_file_ids=None, pol_no=None,
                 pol_status=None, pol_url=None, premium=None, product_code=None, product_name=None, surrender_time=None,
                 tbr_id_no=None, tbr_name=None, tbr_type=None, trade_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 被保人证件号
        self.bbr_id_no = bbr_id_no      # type: str
        # 被保人名称
        self.bbr_name = bbr_name        # type: str
        # 被保人类型, 1-个人 2-企业
        self.bbr_type = bbr_type        # type: str
        # 保险公司编码
        self.channel_code = channel_code  # type: str
        # 保险公司名称
        self.channel_name = channel_name  # type: str
        # 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，NOT_CLAIM: 未理赔
        self.claim_status = claim_status  # type: str
        # 投保时间
        self.insure_date = insure_date  # type: str
        # 保险止期
        self.insure_end = insure_end    # type: str
        # 保险起期
        self.insure_start = insure_start  # type: str
        # 存证平台编码
        self.platform_consumer_code = platform_consumer_code  # type: str
        # 存证平台名称
        self.platform_consumer_name = platform_consumer_name  # type: str
        # 保单文件id，可支持多个，逗号隔开
        self.pol_file_ids = pol_file_ids  # type: str
        # 保单号
        self.pol_no = pol_no            # type: str
        # 保单状态，INSURED: 已投保，SURRENDERED: 已退保,
        self.pol_status = pol_status    # type: str
        # 电子保单url地址
        self.pol_url = pol_url          # type: str
        # 保费
        # 
        self.premium = premium          # type: str
        # 险种代码
        # 
        self.product_code = product_code  # type: str
        # 险种名称
        # 
        self.product_name = product_name  # type: str
        # 退保时间
        self.surrender_time = surrender_time  # type: str
        # 投保人证件号
        self.tbr_id_no = tbr_id_no      # type: str
        # 投保人名称
        self.tbr_name = tbr_name        # type: str
        # 投保人类型, 1-个人 2-企业
        self.tbr_type = tbr_type        # type: str
        # 交易流水号
        self.trade_no = trade_no        # type: str

    def validate(self):
        if self.bbr_id_no is not None:
            self.validate_max_length(self.bbr_id_no, 'bbr_id_no', 50)
        if self.bbr_name is not None:
            self.validate_max_length(self.bbr_name, 'bbr_name', 100)
        if self.bbr_type is not None:
            self.validate_max_length(self.bbr_type, 'bbr_type', 10)
        if self.channel_code is not None:
            self.validate_max_length(self.channel_code, 'channel_code', 50)
        if self.channel_name is not None:
            self.validate_max_length(self.channel_name, 'channel_name', 100)
        if self.claim_status is not None:
            self.validate_max_length(self.claim_status, 'claim_status', 10)
        if self.insure_date is not None:
            self.validate_pattern(self.insure_date, 'insure_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.insure_end is not None:
            self.validate_pattern(self.insure_end, 'insure_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.insure_start is not None:
            self.validate_pattern(self.insure_start, 'insure_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.platform_consumer_code is not None:
            self.validate_max_length(self.platform_consumer_code, 'platform_consumer_code', 50)
        if self.platform_consumer_name is not None:
            self.validate_max_length(self.platform_consumer_name, 'platform_consumer_name', 100)
        if self.pol_file_ids is not None:
            self.validate_max_length(self.pol_file_ids, 'pol_file_ids', 3200)
        if self.pol_no is not None:
            self.validate_max_length(self.pol_no, 'pol_no', 100)
        if self.pol_status is not None:
            self.validate_max_length(self.pol_status, 'pol_status', 12)
        if self.pol_url is not None:
            self.validate_max_length(self.pol_url, 'pol_url', 500)
        if self.premium is not None:
            self.validate_max_length(self.premium, 'premium', 20)
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 50)
        if self.product_name is not None:
            self.validate_max_length(self.product_name, 'product_name', 100)
        if self.surrender_time is not None:
            self.validate_pattern(self.surrender_time, 'surrender_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.tbr_id_no is not None:
            self.validate_max_length(self.tbr_id_no, 'tbr_id_no', 50)
        if self.tbr_name is not None:
            self.validate_max_length(self.tbr_name, 'tbr_name', 100)
        if self.tbr_type is not None:
            self.validate_max_length(self.tbr_type, 'tbr_type', 10)
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 200)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bbr_id_no'] = self.bbr_id_no
        result['bbr_name'] = self.bbr_name
        result['bbr_type'] = self.bbr_type
        result['channel_code'] = self.channel_code
        result['channel_name'] = self.channel_name
        result['claim_status'] = self.claim_status
        result['insure_date'] = self.insure_date
        result['insure_end'] = self.insure_end
        result['insure_start'] = self.insure_start
        result['platform_consumer_code'] = self.platform_consumer_code
        result['platform_consumer_name'] = self.platform_consumer_name
        result['pol_file_ids'] = self.pol_file_ids
        result['pol_no'] = self.pol_no
        result['pol_status'] = self.pol_status
        result['pol_url'] = self.pol_url
        result['premium'] = self.premium
        result['product_code'] = self.product_code
        result['product_name'] = self.product_name
        result['surrender_time'] = self.surrender_time
        result['tbr_id_no'] = self.tbr_id_no
        result['tbr_name'] = self.tbr_name
        result['tbr_type'] = self.tbr_type
        result['trade_no'] = self.trade_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bbr_id_no = map.get('bbr_id_no')
        self.bbr_name = map.get('bbr_name')
        self.bbr_type = map.get('bbr_type')
        self.channel_code = map.get('channel_code')
        self.channel_name = map.get('channel_name')
        self.claim_status = map.get('claim_status')
        self.insure_date = map.get('insure_date')
        self.insure_end = map.get('insure_end')
        self.insure_start = map.get('insure_start')
        self.platform_consumer_code = map.get('platform_consumer_code')
        self.platform_consumer_name = map.get('platform_consumer_name')
        self.pol_file_ids = map.get('pol_file_ids')
        self.pol_no = map.get('pol_no')
        self.pol_status = map.get('pol_status')
        self.pol_url = map.get('pol_url')
        self.premium = map.get('premium')
        self.product_code = map.get('product_code')
        self.product_name = map.get('product_name')
        self.surrender_time = map.get('surrender_time')
        self.tbr_id_no = map.get('tbr_id_no')
        self.tbr_name = map.get('tbr_name')
        self.tbr_type = map.get('tbr_type')
        self.trade_no = map.get('trade_no')
        return self


class UpdateDigitalLogisticInsuranceOlpResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 返回状态
        self.status = status            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.status = map.get('status')
        return self


class QueryDigitalLogisticPfPaymentRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, buss_refr_no=None,
                 financing_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 业务参考号
        self.buss_refr_no = buss_refr_no  # type: str
        # 支用id
        self.financing_id = financing_id  # type: str

    def validate(self):
        if self.buss_refr_no is not None:
            self.validate_max_length(self.buss_refr_no, 'buss_refr_no', 100)
        if self.financing_id is not None:
            self.validate_max_length(self.financing_id, 'financing_id', 32)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['buss_refr_no'] = self.buss_refr_no
        result['financing_id'] = self.financing_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.buss_refr_no = map.get('buss_refr_no')
        self.financing_id = map.get('financing_id')
        return self


class QueryDigitalLogisticPfPaymentResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, accountin_status=None, trade_time=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 入账状态: 10-受理 20-在途 00-成功 99-失败
        self.accountin_status = accountin_status  # type: str
        # 交易时间
        self.trade_time = trade_time    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['accountin_status'] = self.accountin_status
        result['trade_time'] = self.trade_time
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.accountin_status = map.get('accountin_status')
        self.trade_time = map.get('trade_time')
        return self


class QueryDigitalLogisticPfIouRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, customer_no=None, debit_id=None,
                 financing_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 客户号
        self.customer_no = customer_no  # type: str
        # 借据Id
        self.debit_id = debit_id        # type: str
        # 支用Id
        self.financing_id = financing_id  # type: str

    def validate(self):
        if self.customer_no is not None:
            self.validate_max_length(self.customer_no, 'customer_no', 20)
        if self.debit_id is not None:
            self.validate_max_length(self.debit_id, 'debit_id', 16)
        if self.financing_id is not None:
            self.validate_max_length(self.financing_id, 'financing_id', 32)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['customer_no'] = self.customer_no
        result['debit_id'] = self.debit_id
        result['financing_id'] = self.financing_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.customer_no = map.get('customer_no')
        self.debit_id = map.get('debit_id')
        self.financing_id = map.get('financing_id')
        return self


class QueryDigitalLogisticPfIouResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, annual_interest_rate=None,
                 credit_id=None, interest_bearing_end=None, interest_bearing_start=None, issued_amount=None,
                 loan_nature=None, loan_status=None, next_parsing_date=None, odi_cal_type=None, opi_floating_ratio=None,
                 pay_account=None, principal_balance=None, repay_account=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 执行年利率
        self.annual_interest_rate = annual_interest_rate  # type: str
        # 借据Id
        self.credit_id = credit_id      # type: str
        # 借据到期日
        self.interest_bearing_end = interest_bearing_end  # type: str
        # 借据起息日
        self.interest_bearing_start = interest_bearing_start  # type: str
        # 发放金额
        self.issued_amount = issued_amount  # type: str
        # 贷款性质 0-正常 1-展期 2-一类逾期 3-二类逾期 4-呆滞 5-呆帐
        self.loan_nature = loan_nature  # type: str
        # 贷款状态 销户=结清 0-正常 1-销户 5-已发放未复核入账
        self.loan_status = loan_status  # type: str
        # 下次结息日期
        self.next_parsing_date = next_parsing_date  # type: str
        # 逾期计息方式 0-逾期利率 1-逾期罚息比例 2-协议违约利率
        self.odi_cal_type = odi_cal_type  # type: str
        # 逾期罚息浮动比率
        self.opi_floating_ratio = opi_floating_ratio  # type: str
        # 贷款入账账号
        self.pay_account = pay_account  # type: str
        # 本金余额
        self.principal_balance = principal_balance  # type: str
        # 还款账号
        self.repay_account = repay_account  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['annual_interest_rate'] = self.annual_interest_rate
        result['credit_id'] = self.credit_id
        result['interest_bearing_end'] = self.interest_bearing_end
        result['interest_bearing_start'] = self.interest_bearing_start
        result['issued_amount'] = self.issued_amount
        result['loan_nature'] = self.loan_nature
        result['loan_status'] = self.loan_status
        result['next_parsing_date'] = self.next_parsing_date
        result['odi_cal_type'] = self.odi_cal_type
        result['opi_floating_ratio'] = self.opi_floating_ratio
        result['pay_account'] = self.pay_account
        result['principal_balance'] = self.principal_balance
        result['repay_account'] = self.repay_account
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.annual_interest_rate = map.get('annual_interest_rate')
        self.credit_id = map.get('credit_id')
        self.interest_bearing_end = map.get('interest_bearing_end')
        self.interest_bearing_start = map.get('interest_bearing_start')
        self.issued_amount = map.get('issued_amount')
        self.loan_nature = map.get('loan_nature')
        self.loan_status = map.get('loan_status')
        self.next_parsing_date = map.get('next_parsing_date')
        self.odi_cal_type = map.get('odi_cal_type')
        self.opi_floating_ratio = map.get('opi_floating_ratio')
        self.pay_account = map.get('pay_account')
        self.principal_balance = map.get('principal_balance')
        self.repay_account = map.get('repay_account')
        return self


class QueryDigitalLogisticPfQuotaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_no=None, cert_type=None,
                 customer_no=None, financing_subject_did=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 证件号
        self.cert_no = cert_no          # type: str
        # 证件类型;050 统一社会信用证代码
        self.cert_type = cert_type      # type: str
        # 银行端客户号
        self.customer_no = customer_no  # type: str
        # 融资主体did
        self.financing_subject_did = financing_subject_did  # type: str

    def validate(self):
        if self.cert_no is not None:
            self.validate_max_length(self.cert_no, 'cert_no', 20)
        if self.cert_type is not None:
            self.validate_max_length(self.cert_type, 'cert_type', 3)
        if self.customer_no is not None:
            self.validate_max_length(self.customer_no, 'customer_no', 20)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_no'] = self.cert_no
        result['cert_type'] = self.cert_type
        result['customer_no'] = self.customer_no
        result['financing_subject_did'] = self.financing_subject_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_no = map.get('cert_no')
        self.cert_type = map.get('cert_type')
        self.customer_no = map.get('customer_no')
        self.financing_subject_did = map.get('financing_subject_did')
        return self


class QueryDigitalLogisticPfQuotaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, quota_info=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 授信额度信息
        self.quota_info = quota_info    # type: List[PfCreditQuotaInfo]

    def validate(self):
        if self.quota_info:
            for k in self.quota_info:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['quota_info'] = []
        if self.quota_info is not None:
            for k in self.quota_info:
                result['quota_info'].append(k.to_map() if k else None)
        else:
            result['quota_info'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.quota_info = []
        if map.get('quota_info') is not None:
            for k in map.get('quota_info'):
                temp_model = PfCreditQuotaInfo()
                self.quota_info.append(temp_model.from_map(k))
        else:
            self.quota_info = None
        return self


class ApplyDigitalLogisticPfWaybillfinancingRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, carrier_did=None,
                 financing_amount=None, financing_currency=None, financing_subject_did=None, loan_term=None, payee_bank_number=None,
                 payee_bcb=None, payee_bcb_card_no=None, payee_id_number=None, payee_id_type=None, payee_name=None,
                 purpose=None, request_no=None, signature=None, transfer_postscript=None, voucher_category=None,
                 voucher_ids=None, voucher_invoice_codes=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 承运商did
        self.carrier_did = carrier_did  # type: str
        # 融资支用金额；总长度最长15位，保留2位小数，四舍五入
        self.financing_amount = financing_amount  # type: str
        # 支用币种，支持 CNY,USD
        self.financing_currency = financing_currency  # type: str
        # 融资授信主体公司分布式数字身份
        self.financing_subject_did = financing_subject_did  # type: str
        # 贷款期限，值为2~6，单位为月
        self.loan_term = loan_term      # type: str
        # 收款方开户行总行联行号
        self.payee_bank_number = payee_bank_number  # type: str
        # 收款方开户行名称
        self.payee_bcb = payee_bcb      # type: str
        # 收款方开户行银行卡号
        self.payee_bcb_card_no = payee_bcb_card_no  # type: str
        # 收款方证件号
        # 
        # 
        self.payee_id_number = payee_id_number  # type: str
        # 收款方证件类型
        self.payee_id_type = payee_id_type  # type: str
        # 收款方名称
        self.payee_name = payee_name    # type: str
        # 0政府投标 1经营周转 2支付货款 3采购机票，一般默认填 2
        self.purpose = purpose          # type: str
        # 请求号，以时间串yyyyMMdd 开头，要求该请求号在请求方系统内唯一；同时该字段也是幂等字段
        self.request_no = request_no    # type: str
        # 银行端的Ukey签名；使用方调用接口前使用银行Ukey做签名，并将签名后的结果填入该字段；一期，该字段可不传，使用方通过登录网上银行使用网银进行确认
        self.signature = signature      # type: str
        # 转账附言
        # 1: 工资、奖金收入
        # 2：稿费、演出费等劳务收入
        # 3：债券、期货、信托等投资的本金和收益
        # 4：个人债券或产权转让收益
        # 该字段建议填写 2
        self.transfer_postscript = transfer_postscript  # type: str
        # 凭证类型，支持 WAYBILL,PAYABLE
        self.voucher_category = voucher_category  # type: str
        # 支用凭证ids，支持多个，逗号隔开；
        self.voucher_ids = voucher_ids  # type: str
        # 8位发票号，支持多个，逗号分隔
        self.voucher_invoice_codes = voucher_invoice_codes  # type: str

    def validate(self):
        if self.carrier_did is not None:
            self.validate_max_length(self.carrier_did, 'carrier_did', 80)
        if self.financing_subject_did is not None:
            self.validate_max_length(self.financing_subject_did, 'financing_subject_did', 80)
        if self.loan_term is not None:
            self.validate_max_length(self.loan_term, 'loan_term', 6)
        if self.payee_bank_number is not None:
            self.validate_max_length(self.payee_bank_number, 'payee_bank_number', 32)
        if self.payee_bcb is not None:
            self.validate_max_length(self.payee_bcb, 'payee_bcb', 200)
        if self.payee_id_number is not None:
            self.validate_max_length(self.payee_id_number, 'payee_id_number', 40)
        if self.payee_id_type is not None:
            self.validate_max_length(self.payee_id_type, 'payee_id_type', 5)
        if self.payee_name is not None:
            self.validate_max_length(self.payee_name, 'payee_name', 200)
        if self.request_no is not None:
            self.validate_max_length(self.request_no, 'request_no', 23)
        if self.signature is not None:
            self.validate_max_length(self.signature, 'signature', 800)
        if self.transfer_postscript is not None:
            self.validate_max_length(self.transfer_postscript, 'transfer_postscript', 3)
        if self.voucher_ids is not None:
            self.validate_max_length(self.voucher_ids, 'voucher_ids', 2000)
        if self.voucher_invoice_codes is not None:
            self.validate_max_length(self.voucher_invoice_codes, 'voucher_invoice_codes', 800)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['carrier_did'] = self.carrier_did
        result['financing_amount'] = self.financing_amount
        result['financing_currency'] = self.financing_currency
        result['financing_subject_did'] = self.financing_subject_did
        result['loan_term'] = self.loan_term
        result['payee_bank_number'] = self.payee_bank_number
        result['payee_bcb'] = self.payee_bcb
        result['payee_bcb_card_no'] = self.payee_bcb_card_no
        result['payee_id_number'] = self.payee_id_number
        result['payee_id_type'] = self.payee_id_type
        result['payee_name'] = self.payee_name
        result['purpose'] = self.purpose
        result['request_no'] = self.request_no
        result['signature'] = self.signature
        result['transfer_postscript'] = self.transfer_postscript
        result['voucher_category'] = self.voucher_category
        result['voucher_ids'] = self.voucher_ids
        result['voucher_invoice_codes'] = self.voucher_invoice_codes
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.carrier_did = map.get('carrier_did')
        self.financing_amount = map.get('financing_amount')
        self.financing_currency = map.get('financing_currency')
        self.financing_subject_did = map.get('financing_subject_did')
        self.loan_term = map.get('loan_term')
        self.payee_bank_number = map.get('payee_bank_number')
        self.payee_bcb = map.get('payee_bcb')
        self.payee_bcb_card_no = map.get('payee_bcb_card_no')
        self.payee_id_number = map.get('payee_id_number')
        self.payee_id_type = map.get('payee_id_type')
        self.payee_name = map.get('payee_name')
        self.purpose = map.get('purpose')
        self.request_no = map.get('request_no')
        self.signature = map.get('signature')
        self.transfer_postscript = map.get('transfer_postscript')
        self.voucher_category = map.get('voucher_category')
        self.voucher_ids = map.get('voucher_ids')
        self.voucher_invoice_codes = map.get('voucher_invoice_codes')
        return self


class ApplyDigitalLogisticPfWaybillfinancingResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, financing_id=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 融资支用Id
        self.financing_id = financing_id  # type: str
        # 申请状态
        self.status = status            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['financing_id'] = self.financing_id
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.financing_id = map.get('financing_id')
        self.status = map.get('status')
        return self


class PushDigitalLogisticPfPledgeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bill_id=None,
                 financing_subject_did=None, request_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 账单标识
        self.bill_id = bill_id          # type: str
        # 融资主体did
        self.financing_subject_did = financing_subject_did  # type: str
        # 请求号；以yyyyMMdd 时间串开头的32位字符串；该字符串需要保持请求系统内唯一，系统会以该请求号作为幂等处理
        self.request_no = request_no    # type: str

    def validate(self):
        if self.bill_id is not None:
            self.validate_max_length(self.bill_id, 'bill_id', 128)
        if self.financing_subject_did is not None:
            self.validate_max_length(self.financing_subject_did, 'financing_subject_did', 128)
        if self.request_no is not None:
            self.validate_max_length(self.request_no, 'request_no', 32)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bill_id'] = self.bill_id
        result['financing_subject_did'] = self.financing_subject_did
        result['request_no'] = self.request_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bill_id = map.get('bill_id')
        self.financing_subject_did = map.get('financing_subject_did')
        self.request_no = map.get('request_no')
        return self


class PushDigitalLogisticPfPledgeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, desc=None, pledge_id=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 描述
        self.desc = desc                # type: str
        # 质押标识，用于账单质押推送状态查询
        self.pledge_id = pledge_id      # type: str
        # 质押推送状态；applied：已申请；failure：失败；由于质押推送过程为异步，若通过了前期的业务校验，将返回已申请状态；后续可使用质押Id查询质押推送终态
        self.status = status            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['desc'] = self.desc
        result['pledge_id'] = self.pledge_id
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.desc = map.get('desc')
        self.pledge_id = map.get('pledge_id')
        self.status = map.get('status')
        return self


class QueryDigitalLogisticPfPledgeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, pledge_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 质押id
        self.pledge_id = pledge_id      # type: str

    def validate(self):
        if self.pledge_id is not None:
            self.validate_max_length(self.pledge_id, 'pledge_id', 32)

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['pledge_id'] = self.pledge_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.pledge_id = map.get('pledge_id')
        return self


class QueryDigitalLogisticPfPledgeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, bill_id=None, desc=None,
                 financing_subject_did=None, status=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 账单id
        self.bill_id = bill_id          # type: str
        # 状态描述
        self.desc = desc                # type: str
        # 融资主体did
        self.financing_subject_did = financing_subject_did  # type: str
        # 推送状态
        self.status = status            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['bill_id'] = self.bill_id
        result['desc'] = self.desc
        result['financing_subject_did'] = self.financing_subject_did
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.bill_id = map.get('bill_id')
        self.desc = map.get('desc')
        self.financing_subject_did = map.get('financing_subject_did')
        self.status = map.get('status')
        return self


class QueryDigitalLogisticPfFinancingRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, financing_id=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 支用Id
        self.financing_id = financing_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['financing_id'] = self.financing_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.financing_id = map.get('financing_id')
        return self


class QueryDigitalLogisticPfFinancingResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, status=None, desc=None, financing_id=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 状态
        self.status = status            # type: str
        # 描述
        self.desc = desc                # type: str
        # 支用Id
        self.financing_id = financing_id  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['status'] = self.status
        result['desc'] = self.desc
        result['financing_id'] = self.financing_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.status = map.get('status')
        self.desc = map.get('desc')
        self.financing_id = map.get('financing_id')
        return self


class CreateDigitalLogisticDidForwarderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, agent_did=None,
                 ep_cert_name=None, ep_cert_no=None, extension_info=None, legal_person_cert_name=None,
                 legal_person_cert_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 代理did
        self.agent_did = agent_did      # type: str
        # 企业名称
        self.ep_cert_name = ep_cert_name  # type: str
        # 企业证件号
        self.ep_cert_no = ep_cert_no    # type: str
        # 扩展字段
        self.extension_info = extension_info  # type: str
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name  # type: str
        # 法人身份证号
        self.legal_person_cert_no = legal_person_cert_no  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['agent_did'] = self.agent_did
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['extension_info'] = self.extension_info
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.agent_did = map.get('agent_did')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.extension_info = map.get('extension_info')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        return self


class CreateDigitalLogisticDidForwarderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 货代did
        self.did = did                  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        return self


class CreateDigitalLogisticDidSaasplatformRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, ep_cert_name=None,
                 ep_cert_no=None, extension_info=None, legal_person_cert_name=None, legal_person_cert_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 企业名称
        # 
        self.ep_cert_name = ep_cert_name  # type: str
        # 企业证件号
        self.ep_cert_no = ep_cert_no    # type: str
        # 扩展字段
        self.extension_info = extension_info  # type: str
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name  # type: str
        # 法人身份证
        self.legal_person_cert_no = legal_person_cert_no  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['extension_info'] = self.extension_info
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.extension_info = map.get('extension_info')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        return self


class CreateDigitalLogisticDidSaasplatformResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # saas平台did
        self.did = did                  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        return self


class CreateDigitalLogisticDidClientRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, agent_did=None,
                 ep_cert_name=None, ep_cert_no=None, extension_info=None, legal_person_cert_name=None,
                 legal_person_cert_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 代理did
        self.agent_did = agent_did      # type: str
        # 企业名称
        self.ep_cert_name = ep_cert_name  # type: str
        # 企业证件号
        self.ep_cert_no = ep_cert_no    # type: str
        # 扩展字段
        self.extension_info = extension_info  # type: str
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name  # type: str
        # 法人身份证号
        self.legal_person_cert_no = legal_person_cert_no  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['agent_did'] = self.agent_did
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['extension_info'] = self.extension_info
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.agent_did = map.get('agent_did')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.extension_info = map.get('extension_info')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        return self


class CreateDigitalLogisticDidClientResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 直客did
        self.did = did                  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        return self


class SaveDigitalLogisticBizOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None, bl_request=None,
                 booking_no=None, carrier=None, client_did=None, consignee=None, contract=None, customs_clearance=None,
                 delivery_place=None, delivery_terms=None, discharge_port=None, forwarder_did=None, freight=None, insurance=None,
                 issue_place=None, loading_port=None, movement=None, notify_party=None, order_no=None, payment_terms=None,
                 pick_up=None, receipt_place=None, remark=None, shipper=None, task_order=None, transportation=None,
                 vessel=None, voyage=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 提单要求
        self.bl_request = bl_request    # type: str
        # 订舱单号
        self.booking_no = booking_no    # type: str
        # 船公司
        self.carrier = carrier          # type: str
        # 客户did  业务必填
        self.client_did = client_did    # type: str
        # 收货人
        self.consignee = consignee      # type: str
        # 约号
        self.contract = contract        # type: str
        # 报关
        self.customs_clearance = customs_clearance  # type: str
        # 目的地 业务必填
        # 
        self.delivery_place = delivery_place  # type: str
        # 运输条款
        self.delivery_terms = delivery_terms  # type: str
        # 卸货港. 业务必填
        # 
        self.discharge_port = discharge_port  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 运费
        self.freight = freight          # type: str
        # 保险
        self.insurance = insurance      # type: str
        # 放单地点
        self.issue_place = issue_place  # type: str
        # 起运港. 业务必填
        # 
        self.loading_port = loading_port  # type: str
        # 裝卸方式
        self.movement = movement        # type: str
        # 通知方
        self.notify_party = notify_party  # type: str
        # 订单号
        self.order_no = order_no        # type: str
        # 付费方式 业务必填
        # 
        self.payment_terms = payment_terms  # type: str
        # 拖车
        self.pick_up = pick_up          # type: str
        # 收货地点
        self.receipt_place = receipt_place  # type: str
        # 备注
        self.remark = remark            # type: str
        # 发货人
        self.shipper = shipper          # type: str
        # 任务单号
        self.task_order = task_order    # type: str
        # 运输方式
        self.transportation = transportation  # type: str
        # 船名
        self.vessel = vessel            # type: str
        # 航次
        self.voyage = voyage            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['bl_request'] = self.bl_request
        result['booking_no'] = self.booking_no
        result['carrier'] = self.carrier
        result['client_did'] = self.client_did
        result['consignee'] = self.consignee
        result['contract'] = self.contract
        result['customs_clearance'] = self.customs_clearance
        result['delivery_place'] = self.delivery_place
        result['delivery_terms'] = self.delivery_terms
        result['discharge_port'] = self.discharge_port
        result['forwarder_did'] = self.forwarder_did
        result['freight'] = self.freight
        result['insurance'] = self.insurance
        result['issue_place'] = self.issue_place
        result['loading_port'] = self.loading_port
        result['movement'] = self.movement
        result['notify_party'] = self.notify_party
        result['order_no'] = self.order_no
        result['payment_terms'] = self.payment_terms
        result['pick_up'] = self.pick_up
        result['receipt_place'] = self.receipt_place
        result['remark'] = self.remark
        result['shipper'] = self.shipper
        result['task_order'] = self.task_order
        result['transportation'] = self.transportation
        result['vessel'] = self.vessel
        result['voyage'] = self.voyage
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.bl_request = map.get('bl_request')
        self.booking_no = map.get('booking_no')
        self.carrier = map.get('carrier')
        self.client_did = map.get('client_did')
        self.consignee = map.get('consignee')
        self.contract = map.get('contract')
        self.customs_clearance = map.get('customs_clearance')
        self.delivery_place = map.get('delivery_place')
        self.delivery_terms = map.get('delivery_terms')
        self.discharge_port = map.get('discharge_port')
        self.forwarder_did = map.get('forwarder_did')
        self.freight = map.get('freight')
        self.insurance = map.get('insurance')
        self.issue_place = map.get('issue_place')
        self.loading_port = map.get('loading_port')
        self.movement = map.get('movement')
        self.notify_party = map.get('notify_party')
        self.order_no = map.get('order_no')
        self.payment_terms = map.get('payment_terms')
        self.pick_up = map.get('pick_up')
        self.receipt_place = map.get('receipt_place')
        self.remark = map.get('remark')
        self.shipper = map.get('shipper')
        self.task_order = map.get('task_order')
        self.transportation = map.get('transportation')
        self.vessel = map.get('vessel')
        self.voyage = map.get('voyage')
        return self


class SaveDigitalLogisticBizOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBizConsignorderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None,
                 consign_order_code=None, file_hash=None, file_id=None, forwarder_did=None, order_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 托单code
        self.consign_order_code = consign_order_code  # type: str
        # 托单文件hash  业务必填
        self.file_hash = file_hash      # type: str
        # 托单文件id  业务必填
        self.file_id = file_id          # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 订单号
        self.order_no = order_no        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['consign_order_code'] = self.consign_order_code
        result['file_hash'] = self.file_hash
        result['file_id'] = self.file_id
        result['forwarder_did'] = self.forwarder_did
        result['order_no'] = self.order_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.consign_order_code = map.get('consign_order_code')
        self.file_hash = map.get('file_hash')
        self.file_id = map.get('file_id')
        self.forwarder_did = map.get('forwarder_did')
        self.order_no = map.get('order_no')
        return self


class SaveDigitalLogisticBizConsignorderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBizGoodsRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None,
                 cargo_ready_date=None, dg_page_no=None, dg_type=None, flash_point=None, forwarder_did=None, goods=None,
                 goods_cn=None, goods_id=None, goods_type=None, hs_codes=None, marks=None, number=None, order_no=None,
                 package_type=None, real_number=None, real_volume=None, real_weight=None, un_no=None, volume=None, weight=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 预计备货时间 毫秒值单位
        self.cargo_ready_date = cargo_ready_date  # type: int
        # 危险品页号
        self.dg_page_no = dg_page_no    # type: str
        # 危险品级别
        self.dg_type = dg_type          # type: str
        # 危险品闪点
        self.flash_point = flash_point  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 货物 业务必填
        # 
        self.goods = goods              # type: str
        # 中文品名
        self.goods_cn = goods_cn        # type: str
        # 货物ID
        self.goods_id = goods_id        # type: str
        # 货物类型（业务必填）
        self.goods_type = goods_type    # type: str
        # HS CODE
        self.hs_codes = hs_codes        # type: List[str]
        # 唛头
        self.marks = marks              # type: str
        # 委托件数 业务必填
        # 
        self.number = number            # type: str
        # 订单号
        self.order_no = order_no        # type: str
        # 包装类型
        self.package_type = package_type  # type: str
        # 实际件数
        self.real_number = real_number  # type: str
        # 实际体积
        self.real_volume = real_volume  # type: str
        # 实际重量
        self.real_weight = real_weight  # type: str
        # 危险品联合国编号
        self.un_no = un_no              # type: str
        # 委托体积（业务必填）
        self.volume = volume            # type: str
        # 委托重量（业务必填）
        self.weight = weight            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['cargo_ready_date'] = self.cargo_ready_date
        result['dg_page_no'] = self.dg_page_no
        result['dg_type'] = self.dg_type
        result['flash_point'] = self.flash_point
        result['forwarder_did'] = self.forwarder_did
        result['goods'] = self.goods
        result['goods_cn'] = self.goods_cn
        result['goods_id'] = self.goods_id
        result['goods_type'] = self.goods_type
        result['hs_codes'] = self.hs_codes
        result['marks'] = self.marks
        result['number'] = self.number
        result['order_no'] = self.order_no
        result['package_type'] = self.package_type
        result['real_number'] = self.real_number
        result['real_volume'] = self.real_volume
        result['real_weight'] = self.real_weight
        result['un_no'] = self.un_no
        result['volume'] = self.volume
        result['weight'] = self.weight
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.cargo_ready_date = map.get('cargo_ready_date')
        self.dg_page_no = map.get('dg_page_no')
        self.dg_type = map.get('dg_type')
        self.flash_point = map.get('flash_point')
        self.forwarder_did = map.get('forwarder_did')
        self.goods = map.get('goods')
        self.goods_cn = map.get('goods_cn')
        self.goods_id = map.get('goods_id')
        self.goods_type = map.get('goods_type')
        self.hs_codes = map.get('hs_codes')
        self.marks = map.get('marks')
        self.number = map.get('number')
        self.order_no = map.get('order_no')
        self.package_type = map.get('package_type')
        self.real_number = map.get('real_number')
        self.real_volume = map.get('real_volume')
        self.real_weight = map.get('real_weight')
        self.un_no = map.get('un_no')
        self.volume = map.get('volume')
        self.weight = map.get('weight')
        return self


class SaveDigitalLogisticBizGoodsResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBizSonotifyRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None,
                 booking_params=None, contact_name=None, contact_type=None, discharge_port=None, forwarder_did=None,
                 loading_port=None, order_no=None, so_notify_code=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # so通知关联的订舱单 (业务必填)
        self.booking_params = booking_params  # type: List[SoNotifyBookingParam]
        # 联系人
        self.contact_name = contact_name  # type: str
        # 联系方式
        self.contact_type = contact_type  # type: str
        # 卸货港 业务必填
        # 
        self.discharge_port = discharge_port  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 起运港 业务必填
        # 
        self.loading_port = loading_port  # type: str
        # 
        # 订单号
        self.order_no = order_no        # type: str
        # soNotify 唯一标识code
        self.so_notify_code = so_notify_code  # type: str

    def validate(self):
        if self.booking_params:
            for k in self.booking_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['booking_params'] = []
        if self.booking_params is not None:
            for k in self.booking_params:
                result['booking_params'].append(k.to_map() if k else None)
        else:
            result['booking_params'] = None
        result['contact_name'] = self.contact_name
        result['contact_type'] = self.contact_type
        result['discharge_port'] = self.discharge_port
        result['forwarder_did'] = self.forwarder_did
        result['loading_port'] = self.loading_port
        result['order_no'] = self.order_no
        result['so_notify_code'] = self.so_notify_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.booking_params = []
        if map.get('booking_params') is not None:
            for k in map.get('booking_params'):
                temp_model = SoNotifyBookingParam()
                self.booking_params.append(temp_model.from_map(k))
        else:
            self.booking_params = None
        self.contact_name = map.get('contact_name')
        self.contact_type = map.get('contact_type')
        self.discharge_port = map.get('discharge_port')
        self.forwarder_did = map.get('forwarder_did')
        self.loading_port = map.get('loading_port')
        self.order_no = map.get('order_no')
        self.so_notify_code = map.get('so_notify_code')
        return self


class SaveDigitalLogisticBizSonotifyResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBizBookingorderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None, booking_no=None,
                 carrier=None, customs_clearance=None, cy=None, cy_closing=None, delivery_place=None, discharge_port=None,
                 etd=None, forwarder_did=None, loading_port=None, order_no=None, si_closing=None, source=None,
                 vessel=None, voyage=None, bkg_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 订舱单号
        self.booking_no = booking_no    # type: str
        # 船公司 业务必填
        self.carrier = carrier          # type: str
        # 截关时间
        self.customs_clearance = customs_clearance  # type: int
        # 场站 业务必填
        self.cy = cy                    # type: str
        # 截港时间 毫秒值单位
        self.cy_closing = cy_closing    # type: int
        # 目的地
        self.delivery_place = delivery_place  # type: str
        # 卸货港
        self.discharge_port = discharge_port  # type: str
        # 预计船期 毫秒值单位
        self.etd = etd                  # type: int
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 起运港
        self.loading_port = loading_port  # type: str
        # 订单号
        self.order_no = order_no        # type: str
        # 截单时间  毫秒值单位
        self.si_closing = si_closing    # type: int
        # 特殊字段无要求非必填
        self.source = source            # type: str
        # 船名 业务必填
        self.vessel = vessel            # type: str
        # 航次 业务必填
        self.voyage = voyage            # type: str
        # 订舱号
        self.bkg_no = bkg_no            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['booking_no'] = self.booking_no
        result['carrier'] = self.carrier
        result['customs_clearance'] = self.customs_clearance
        result['cy'] = self.cy
        result['cy_closing'] = self.cy_closing
        result['delivery_place'] = self.delivery_place
        result['discharge_port'] = self.discharge_port
        result['etd'] = self.etd
        result['forwarder_did'] = self.forwarder_did
        result['loading_port'] = self.loading_port
        result['order_no'] = self.order_no
        result['si_closing'] = self.si_closing
        result['source'] = self.source
        result['vessel'] = self.vessel
        result['voyage'] = self.voyage
        result['bkg_no'] = self.bkg_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.booking_no = map.get('booking_no')
        self.carrier = map.get('carrier')
        self.customs_clearance = map.get('customs_clearance')
        self.cy = map.get('cy')
        self.cy_closing = map.get('cy_closing')
        self.delivery_place = map.get('delivery_place')
        self.discharge_port = map.get('discharge_port')
        self.etd = map.get('etd')
        self.forwarder_did = map.get('forwarder_did')
        self.loading_port = map.get('loading_port')
        self.order_no = map.get('order_no')
        self.si_closing = map.get('si_closing')
        self.source = map.get('source')
        self.vessel = map.get('vessel')
        self.voyage = map.get('voyage')
        self.bkg_no = map.get('bkg_no')
        return self


class SaveDigitalLogisticBizBookingorderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBizContainerRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None, booking_no=None,
                 container_id=None, container_no=None, container_type=None, forwarder_did=None, goods_list=None, order_no=None,
                 remark=None, seal_no=None, soc_flag=None, source=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 订舱单号
        # 
        self.booking_no = booking_no    # type: str
        # 集装箱ID
        self.container_id = container_id  # type: str
        # 箱号 业务必填
        self.container_no = container_no  # type: str
        # 箱型  业务必填
        self.container_type = container_type  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 货物列表
        self.goods_list = goods_list    # type: List[ContainerGoodsParam]
        # 订单号
        self.order_no = order_no        # type: str
        # 备注
        self.remark = remark            # type: str
        # 封铅号
        self.seal_no = seal_no          # type: str
        # 是否SOC
        self.soc_flag = soc_flag        # type: str
        # 特殊字段无要求非必填
        self.source = source            # type: str

    def validate(self):
        if self.goods_list:
            for k in self.goods_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['booking_no'] = self.booking_no
        result['container_id'] = self.container_id
        result['container_no'] = self.container_no
        result['container_type'] = self.container_type
        result['forwarder_did'] = self.forwarder_did
        result['goods_list'] = []
        if self.goods_list is not None:
            for k in self.goods_list:
                result['goods_list'].append(k.to_map() if k else None)
        else:
            result['goods_list'] = None
        result['order_no'] = self.order_no
        result['remark'] = self.remark
        result['seal_no'] = self.seal_no
        result['soc_flag'] = self.soc_flag
        result['source'] = self.source
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.booking_no = map.get('booking_no')
        self.container_id = map.get('container_id')
        self.container_no = map.get('container_no')
        self.container_type = map.get('container_type')
        self.forwarder_did = map.get('forwarder_did')
        self.goods_list = []
        if map.get('goods_list') is not None:
            for k in map.get('goods_list'):
                temp_model = ContainerGoodsParam()
                self.goods_list.append(temp_model.from_map(k))
        else:
            self.goods_list = None
        self.order_no = map.get('order_no')
        self.remark = map.get('remark')
        self.seal_no = map.get('seal_no')
        self.soc_flag = map.get('soc_flag')
        self.source = map.get('source')
        return self


class SaveDigitalLogisticBizContainerResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBizCustomsorderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None,
                 booking_params=None, broker=None, container_id=None, container_no=None, customs_code=None, exporter=None,
                 forwarder_did=None, goods=None, gross_weight=None, order_no=None, packages_no=None, status=None, vessel=None,
                 voyage=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 订舱单号
        self.booking_params = booking_params  # type: List[CustomsOrderBookingParam]
        # 报关代理
        self.broker = broker            # type: str
        # 集装箱ID
        self.container_id = container_id  # type: str
        # 箱号
        self.container_no = container_no  # type: str
        # 报关单号
        self.customs_code = customs_code  # type: str
        # 出口人
        self.exporter = exporter        # type: str
        # 货代did
        # 
        self.forwarder_did = forwarder_did  # type: str
        # 货物名称
        self.goods = goods              # type: str
        # 毛重
        self.gross_weight = gross_weight  # type: str
        # 订单号
        # 
        self.order_no = order_no        # type: str
        # 件数
        self.packages_no = packages_no  # type: str
        # 报关状态  APPROVED--通关，UNAPPROVED-未通关
        self.status = status            # type: str
        # 航名 业务必填
        self.vessel = vessel            # type: str
        # 航次 业务必填
        self.voyage = voyage            # type: str

    def validate(self):
        if self.booking_params:
            for k in self.booking_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['booking_params'] = []
        if self.booking_params is not None:
            for k in self.booking_params:
                result['booking_params'].append(k.to_map() if k else None)
        else:
            result['booking_params'] = None
        result['broker'] = self.broker
        result['container_id'] = self.container_id
        result['container_no'] = self.container_no
        result['customs_code'] = self.customs_code
        result['exporter'] = self.exporter
        result['forwarder_did'] = self.forwarder_did
        result['goods'] = self.goods
        result['gross_weight'] = self.gross_weight
        result['order_no'] = self.order_no
        result['packages_no'] = self.packages_no
        result['status'] = self.status
        result['vessel'] = self.vessel
        result['voyage'] = self.voyage
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.booking_params = []
        if map.get('booking_params') is not None:
            for k in map.get('booking_params'):
                temp_model = CustomsOrderBookingParam()
                self.booking_params.append(temp_model.from_map(k))
        else:
            self.booking_params = None
        self.broker = map.get('broker')
        self.container_id = map.get('container_id')
        self.container_no = map.get('container_no')
        self.customs_code = map.get('customs_code')
        self.exporter = map.get('exporter')
        self.forwarder_did = map.get('forwarder_did')
        self.goods = map.get('goods')
        self.gross_weight = map.get('gross_weight')
        self.order_no = map.get('order_no')
        self.packages_no = map.get('packages_no')
        self.status = map.get('status')
        self.vessel = map.get('vessel')
        self.voyage = map.get('voyage')
        return self


class SaveDigitalLogisticBizCustomsorderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBizVehicleRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None,
                 container_params=None, forwarder_did=None, order_no=None, vehicle_code=None, vehicle_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 箱子信息 业务必填
        self.container_params = container_params  # type: List[VehicleContainerParam]
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 订单号
        self.order_no = order_no        # type: str
        # 拖车单号
        self.vehicle_code = vehicle_code  # type: str
        # 车牌号
        self.vehicle_no = vehicle_no    # type: str

    def validate(self):
        if self.container_params:
            for k in self.container_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['container_params'] = []
        if self.container_params is not None:
            for k in self.container_params:
                result['container_params'].append(k.to_map() if k else None)
        else:
            result['container_params'] = None
        result['forwarder_did'] = self.forwarder_did
        result['order_no'] = self.order_no
        result['vehicle_code'] = self.vehicle_code
        result['vehicle_no'] = self.vehicle_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.container_params = []
        if map.get('container_params') is not None:
            for k in map.get('container_params'):
                temp_model = VehicleContainerParam()
                self.container_params.append(temp_model.from_map(k))
        else:
            self.container_params = None
        self.forwarder_did = map.get('forwarder_did')
        self.order_no = map.get('order_no')
        self.vehicle_code = map.get('vehicle_code')
        self.vehicle_no = map.get('vehicle_no')
        return self


class SaveDigitalLogisticBizVehicleResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBizMasterblRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None,
                 bl_booking_params=None, bl_request=None, bl_type=None, carrier=None, consignee=None, container_params=None,
                 contract=None, delivery_place=None, delivery_terms=None, discharge_port=None, forwarder_did=None,
                 freight=None, goods_params=None, issue_date=None, issue_place=None, loading_port=None, master_bl_no=None,
                 movement=None, notify_party=None, on_board_date=None, on_board_status=None, order_no=None,
                 payment_terms=None, pr_carriage=None, remark=None, shipper=None, source=None, transportation=None, vessel=None,
                 voyage=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 订舱单
        self.bl_booking_params = bl_booking_params  # type: List[MasterBlBookingParam]
        # 提单要求
        self.bl_request = bl_request    # type: str
        # 提单类型
        self.bl_type = bl_type          # type: str
        # 船公司 业务必填
        self.carrier = carrier          # type: str
        # 收货人 业务必填
        # 
        self.consignee = consignee      # type: str
        # 集装箱列表 业务必填
        # 
        self.container_params = container_params  # type: List[MasterBlContainerParam]
        # 约号
        self.contract = contract        # type: str
        # 目的地. 业务必填
        # 
        self.delivery_place = delivery_place  # type: str
        # 运输条款
        self.delivery_terms = delivery_terms  # type: str
        # 卸货港. 业务必填
        # 
        self.discharge_port = discharge_port  # type: str
        # 
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 运费/约号
        self.freight = freight          # type: str
        # 货物列表. 业务必填
        # 
        self.goods_params = goods_params  # type: List[MasterBlGoodsParam]
        # 出单日期
        self.issue_date = issue_date    # type: int
        # 放单地点
        self.issue_place = issue_place  # type: str
        # 起运港  业务必填
        # 
        self.loading_port = loading_port  # type: str
        # master提单号
        self.master_bl_no = master_bl_no  # type: str
        # 裝卸方式
        self.movement = movement        # type: str
        # 通知方
        self.notify_party = notify_party  # type: str
        # 开船日期
        self.on_board_date = on_board_date  # type: int
        # 船状态
        self.on_board_status = on_board_status  # type: str
        # 
        # 订单号
        self.order_no = order_no        # type: str
        # 付费方式  业务必填
        # 
        self.payment_terms = payment_terms  # type: str
        # 前程运输
        self.pr_carriage = pr_carriage  # type: str
        # 其他
        self.remark = remark            # type: str
        # 发货人. 业务必填
        # 
        self.shipper = shipper          # type: str
        # 特殊字段无要求非必填
        self.source = source            # type: str
        # 运输方式
        self.transportation = transportation  # type: str
        # 航名 业务必填
        self.vessel = vessel            # type: str
        # 航次 业务必填
        self.voyage = voyage            # type: str

    def validate(self):
        if self.bl_booking_params:
            for k in self.bl_booking_params:
                if k:
                    k.validate()
        if self.container_params:
            for k in self.container_params:
                if k:
                    k.validate()
        if self.goods_params:
            for k in self.goods_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['bl_booking_params'] = []
        if self.bl_booking_params is not None:
            for k in self.bl_booking_params:
                result['bl_booking_params'].append(k.to_map() if k else None)
        else:
            result['bl_booking_params'] = None
        result['bl_request'] = self.bl_request
        result['bl_type'] = self.bl_type
        result['carrier'] = self.carrier
        result['consignee'] = self.consignee
        result['container_params'] = []
        if self.container_params is not None:
            for k in self.container_params:
                result['container_params'].append(k.to_map() if k else None)
        else:
            result['container_params'] = None
        result['contract'] = self.contract
        result['delivery_place'] = self.delivery_place
        result['delivery_terms'] = self.delivery_terms
        result['discharge_port'] = self.discharge_port
        result['forwarder_did'] = self.forwarder_did
        result['freight'] = self.freight
        result['goods_params'] = []
        if self.goods_params is not None:
            for k in self.goods_params:
                result['goods_params'].append(k.to_map() if k else None)
        else:
            result['goods_params'] = None
        result['issue_date'] = self.issue_date
        result['issue_place'] = self.issue_place
        result['loading_port'] = self.loading_port
        result['master_bl_no'] = self.master_bl_no
        result['movement'] = self.movement
        result['notify_party'] = self.notify_party
        result['on_board_date'] = self.on_board_date
        result['on_board_status'] = self.on_board_status
        result['order_no'] = self.order_no
        result['payment_terms'] = self.payment_terms
        result['pr_carriage'] = self.pr_carriage
        result['remark'] = self.remark
        result['shipper'] = self.shipper
        result['source'] = self.source
        result['transportation'] = self.transportation
        result['vessel'] = self.vessel
        result['voyage'] = self.voyage
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.bl_booking_params = []
        if map.get('bl_booking_params') is not None:
            for k in map.get('bl_booking_params'):
                temp_model = MasterBlBookingParam()
                self.bl_booking_params.append(temp_model.from_map(k))
        else:
            self.bl_booking_params = None
        self.bl_request = map.get('bl_request')
        self.bl_type = map.get('bl_type')
        self.carrier = map.get('carrier')
        self.consignee = map.get('consignee')
        self.container_params = []
        if map.get('container_params') is not None:
            for k in map.get('container_params'):
                temp_model = MasterBlContainerParam()
                self.container_params.append(temp_model.from_map(k))
        else:
            self.container_params = None
        self.contract = map.get('contract')
        self.delivery_place = map.get('delivery_place')
        self.delivery_terms = map.get('delivery_terms')
        self.discharge_port = map.get('discharge_port')
        self.forwarder_did = map.get('forwarder_did')
        self.freight = map.get('freight')
        self.goods_params = []
        if map.get('goods_params') is not None:
            for k in map.get('goods_params'):
                temp_model = MasterBlGoodsParam()
                self.goods_params.append(temp_model.from_map(k))
        else:
            self.goods_params = None
        self.issue_date = map.get('issue_date')
        self.issue_place = map.get('issue_place')
        self.loading_port = map.get('loading_port')
        self.master_bl_no = map.get('master_bl_no')
        self.movement = map.get('movement')
        self.notify_party = map.get('notify_party')
        self.on_board_date = map.get('on_board_date')
        self.on_board_status = map.get('on_board_status')
        self.order_no = map.get('order_no')
        self.payment_terms = map.get('payment_terms')
        self.pr_carriage = map.get('pr_carriage')
        self.remark = map.get('remark')
        self.shipper = map.get('shipper')
        self.source = map.get('source')
        self.transportation = map.get('transportation')
        self.vessel = map.get('vessel')
        self.voyage = map.get('voyage')
        return self


class SaveDigitalLogisticBizMasterblResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class FinishDigitalLogisticBizAuditRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, forwarder_did=None,
                 order_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 
        # 订单号
        self.order_no = order_no        # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['forwarder_did'] = self.forwarder_did
        result['order_no'] = self.order_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.forwarder_did = map.get('forwarder_did')
        self.order_no = map.get('order_no')
        return self


class FinishDigitalLogisticBizAuditResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBizHouseblRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None,
                 bl_booking_params=None, bl_issuing_agency=None, bl_request=None, bl_type=None, carrier=None, consignee=None,
                 container_params=None, contract=None, delivery_place=None, delivery_terms=None, discharge_port=None,
                 forwarder_did=None, freight=None, goods_params=None, house_bl_no=None, issue_date=None, issue_place=None,
                 loading_port=None, master_bl_no=None, movement=None, notify_party=None, on_board_date=None, order_no=None,
                 payment_terms=None, remark=None, shipper=None, transportation=None, vessel=None, voyage=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 订舱单
        self.bl_booking_params = bl_booking_params  # type: List[HouseBlBookingParam]
        # 提单签发单位
        self.bl_issuing_agency = bl_issuing_agency  # type: str
        # 提单要求
        self.bl_request = bl_request    # type: str
        # 提单类型
        self.bl_type = bl_type          # type: str
        # 船公司 业务必填
        self.carrier = carrier          # type: str
        # 收货人 业务必填
        # 
        self.consignee = consignee      # type: str
        # 集装箱列表 业务必填
        # 
        self.container_params = container_params  # type: List[HouseBlContainerParam]
        # 约号
        self.contract = contract        # type: str
        # 目的地  业务必填
        # 
        self.delivery_place = delivery_place  # type: str
        # 运输条款
        self.delivery_terms = delivery_terms  # type: str
        # 卸货港 业务必填
        # 
        self.discharge_port = discharge_port  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 运费
        self.freight = freight          # type: str
        # 货物列表 业务必填
        # 
        self.goods_params = goods_params  # type: List[HouseBlGoodsParam]
        # house提单号
        self.house_bl_no = house_bl_no  # type: str
        # 出单日期
        self.issue_date = issue_date    # type: int
        # 放单地点
        self.issue_place = issue_place  # type: str
        # 起运港 业务必填
        # 
        self.loading_port = loading_port  # type: str
        # master提单号
        self.master_bl_no = master_bl_no  # type: str
        # 裝卸方式
        self.movement = movement        # type: str
        # 通知方
        self.notify_party = notify_party  # type: str
        # 开船日期
        self.on_board_date = on_board_date  # type: int
        # 订单号
        self.order_no = order_no        # type: str
        # 付费方式 业务必填
        # 
        self.payment_terms = payment_terms  # type: str
        # 其他
        self.remark = remark            # type: str
        # 发货人 业务必填
        # 
        self.shipper = shipper          # type: str
        # 运输方式
        self.transportation = transportation  # type: str
        # 航名 业务必填
        self.vessel = vessel            # type: str
        # 航次 业务必填
        self.voyage = voyage            # type: str

    def validate(self):
        if self.bl_booking_params:
            for k in self.bl_booking_params:
                if k:
                    k.validate()
        if self.container_params:
            for k in self.container_params:
                if k:
                    k.validate()
        if self.goods_params:
            for k in self.goods_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['bl_booking_params'] = []
        if self.bl_booking_params is not None:
            for k in self.bl_booking_params:
                result['bl_booking_params'].append(k.to_map() if k else None)
        else:
            result['bl_booking_params'] = None
        result['bl_issuing_agency'] = self.bl_issuing_agency
        result['bl_request'] = self.bl_request
        result['bl_type'] = self.bl_type
        result['carrier'] = self.carrier
        result['consignee'] = self.consignee
        result['container_params'] = []
        if self.container_params is not None:
            for k in self.container_params:
                result['container_params'].append(k.to_map() if k else None)
        else:
            result['container_params'] = None
        result['contract'] = self.contract
        result['delivery_place'] = self.delivery_place
        result['delivery_terms'] = self.delivery_terms
        result['discharge_port'] = self.discharge_port
        result['forwarder_did'] = self.forwarder_did
        result['freight'] = self.freight
        result['goods_params'] = []
        if self.goods_params is not None:
            for k in self.goods_params:
                result['goods_params'].append(k.to_map() if k else None)
        else:
            result['goods_params'] = None
        result['house_bl_no'] = self.house_bl_no
        result['issue_date'] = self.issue_date
        result['issue_place'] = self.issue_place
        result['loading_port'] = self.loading_port
        result['master_bl_no'] = self.master_bl_no
        result['movement'] = self.movement
        result['notify_party'] = self.notify_party
        result['on_board_date'] = self.on_board_date
        result['order_no'] = self.order_no
        result['payment_terms'] = self.payment_terms
        result['remark'] = self.remark
        result['shipper'] = self.shipper
        result['transportation'] = self.transportation
        result['vessel'] = self.vessel
        result['voyage'] = self.voyage
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.bl_booking_params = []
        if map.get('bl_booking_params') is not None:
            for k in map.get('bl_booking_params'):
                temp_model = HouseBlBookingParam()
                self.bl_booking_params.append(temp_model.from_map(k))
        else:
            self.bl_booking_params = None
        self.bl_issuing_agency = map.get('bl_issuing_agency')
        self.bl_request = map.get('bl_request')
        self.bl_type = map.get('bl_type')
        self.carrier = map.get('carrier')
        self.consignee = map.get('consignee')
        self.container_params = []
        if map.get('container_params') is not None:
            for k in map.get('container_params'):
                temp_model = HouseBlContainerParam()
                self.container_params.append(temp_model.from_map(k))
        else:
            self.container_params = None
        self.contract = map.get('contract')
        self.delivery_place = map.get('delivery_place')
        self.delivery_terms = map.get('delivery_terms')
        self.discharge_port = map.get('discharge_port')
        self.forwarder_did = map.get('forwarder_did')
        self.freight = map.get('freight')
        self.goods_params = []
        if map.get('goods_params') is not None:
            for k in map.get('goods_params'):
                temp_model = HouseBlGoodsParam()
                self.goods_params.append(temp_model.from_map(k))
        else:
            self.goods_params = None
        self.house_bl_no = map.get('house_bl_no')
        self.issue_date = map.get('issue_date')
        self.issue_place = map.get('issue_place')
        self.loading_port = map.get('loading_port')
        self.master_bl_no = map.get('master_bl_no')
        self.movement = map.get('movement')
        self.notify_party = map.get('notify_party')
        self.on_board_date = map.get('on_board_date')
        self.order_no = map.get('order_no')
        self.payment_terms = map.get('payment_terms')
        self.remark = map.get('remark')
        self.shipper = map.get('shipper')
        self.transportation = map.get('transportation')
        self.vessel = map.get('vessel')
        self.voyage = map.get('voyage')
        return self


class SaveDigitalLogisticBizHouseblResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class CreateDigitalLogisticBillPaybillorderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, apply_date=None,
                 bank_receipt_account=None, currency=None, deposit_bank=None, forwarder_did=None, pay_amount=None,
                 pay_bill_order_code=None, pay_bill_tariff_params=None, pay_company=None, pay_company_cert_no=None,
                 pay_company_did=None, pay_deadline=None, receipt_client=None, receipt_client_cert_no=None,
                 receipt_client_did=None, receipt_tariff_codes=None, settle_company=None, settle_company_cert_no=None,
                 settle_company_did=None, settle_cycle=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 申请时间
        self.apply_date = apply_date    # type: int
        # 银行收款账户
        self.bank_receipt_account = bank_receipt_account  # type: str
        # 币种
        self.currency = currency        # type: str
        # 开户行
        self.deposit_bank = deposit_bank  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 应付总额
        self.pay_amount = pay_amount    # type: str
        # 付款单编号
        self.pay_bill_order_code = pay_bill_order_code  # type: str
        # 应付账单资费项 业务必填
        self.pay_bill_tariff_params = pay_bill_tariff_params  # type: List[PayBillTariffParam]
        # 付款公司
        self.pay_company = pay_company  # type: str
        # 付款公司企业信用号
        # 
        self.pay_company_cert_no = pay_company_cert_no  # type: str
        # 付款公司did
        self.pay_company_did = pay_company_did  # type: str
        # 付款期限
        self.pay_deadline = pay_deadline  # type: str
        # 收款客户
        self.receipt_client = receipt_client  # type: str
        # 收款客户企业信用号
        # 
        self.receipt_client_cert_no = receipt_client_cert_no  # type: str
        # 收款客户did
        self.receipt_client_did = receipt_client_did  # type: str
        # 对应应收资费项code
        self.receipt_tariff_codes = receipt_tariff_codes  # type: List[str]
        # 结算公司
        self.settle_company = settle_company  # type: str
        # 结算公司企业信用号
        # 
        self.settle_company_cert_no = settle_company_cert_no  # type: str
        # 结算公司did
        self.settle_company_did = settle_company_did  # type: str
        # 账单结算周期
        self.settle_cycle = settle_cycle  # type: str

    def validate(self):
        if self.pay_bill_tariff_params:
            for k in self.pay_bill_tariff_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['apply_date'] = self.apply_date
        result['bank_receipt_account'] = self.bank_receipt_account
        result['currency'] = self.currency
        result['deposit_bank'] = self.deposit_bank
        result['forwarder_did'] = self.forwarder_did
        result['pay_amount'] = self.pay_amount
        result['pay_bill_order_code'] = self.pay_bill_order_code
        result['pay_bill_tariff_params'] = []
        if self.pay_bill_tariff_params is not None:
            for k in self.pay_bill_tariff_params:
                result['pay_bill_tariff_params'].append(k.to_map() if k else None)
        else:
            result['pay_bill_tariff_params'] = None
        result['pay_company'] = self.pay_company
        result['pay_company_cert_no'] = self.pay_company_cert_no
        result['pay_company_did'] = self.pay_company_did
        result['pay_deadline'] = self.pay_deadline
        result['receipt_client'] = self.receipt_client
        result['receipt_client_cert_no'] = self.receipt_client_cert_no
        result['receipt_client_did'] = self.receipt_client_did
        result['receipt_tariff_codes'] = self.receipt_tariff_codes
        result['settle_company'] = self.settle_company
        result['settle_company_cert_no'] = self.settle_company_cert_no
        result['settle_company_did'] = self.settle_company_did
        result['settle_cycle'] = self.settle_cycle
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.apply_date = map.get('apply_date')
        self.bank_receipt_account = map.get('bank_receipt_account')
        self.currency = map.get('currency')
        self.deposit_bank = map.get('deposit_bank')
        self.forwarder_did = map.get('forwarder_did')
        self.pay_amount = map.get('pay_amount')
        self.pay_bill_order_code = map.get('pay_bill_order_code')
        self.pay_bill_tariff_params = []
        if map.get('pay_bill_tariff_params') is not None:
            for k in map.get('pay_bill_tariff_params'):
                temp_model = PayBillTariffParam()
                self.pay_bill_tariff_params.append(temp_model.from_map(k))
        else:
            self.pay_bill_tariff_params = None
        self.pay_company = map.get('pay_company')
        self.pay_company_cert_no = map.get('pay_company_cert_no')
        self.pay_company_did = map.get('pay_company_did')
        self.pay_deadline = map.get('pay_deadline')
        self.receipt_client = map.get('receipt_client')
        self.receipt_client_cert_no = map.get('receipt_client_cert_no')
        self.receipt_client_did = map.get('receipt_client_did')
        self.receipt_tariff_codes = map.get('receipt_tariff_codes')
        self.settle_company = map.get('settle_company')
        self.settle_company_cert_no = map.get('settle_company_cert_no')
        self.settle_company_did = map.get('settle_company_did')
        self.settle_cycle = map.get('settle_cycle')
        return self


class CreateDigitalLogisticBillPaybillorderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证hash
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class CreateDigitalLogisticBillReceiptbillorderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, actual_settle_company=None,
                 actual_settle_company_cert_no=None, actual_settle_company_did=None, apply_date=None, client_type=None, currency=None,
                 forwarder_did=None, invoice_title=None, price_including_tax=None, receipt_account=None, receipt_amount=None,
                 receipt_bill_order_code=None, receipt_bill_tariff_params=None, settle_client=None, settle_client_cert_no=None,
                 settle_client_did=None, settle_company=None, settle_company_cert_no=None, settle_company_did=None,
                 settle_cycle=None, taxes=None, untaxed_price=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 实际收款结算公司
        self.actual_settle_company = actual_settle_company  # type: str
        # 实际收款结算公司企业信用号
        self.actual_settle_company_cert_no = actual_settle_company_cert_no  # type: str
        # 实际收款结算公司did
        self.actual_settle_company_did = actual_settle_company_did  # type: str
        # 确认时间  业务必填
        self.apply_date = apply_date    # type: int
        # 揽货类型
        self.client_type = client_type  # type: str
        # 币种 业务必填
        self.currency = currency        # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 开票抬头
        self.invoice_title = invoice_title  # type: str
        # 含税价
        self.price_including_tax = price_including_tax  # type: str
        # 收款账号
        self.receipt_account = receipt_account  # type: str
        # 收款总额 业务必填
        self.receipt_amount = receipt_amount  # type: str
        # 收款账单编号
        self.receipt_bill_order_code = receipt_bill_order_code  # type: str
        # 应收资费项账单 业务必填
        self.receipt_bill_tariff_params = receipt_bill_tariff_params  # type: List[ReceiptBillTariffParam]
        # 结算客户名称
        self.settle_client = settle_client  # type: str
        # 结算客户企业信用号
        self.settle_client_cert_no = settle_client_cert_no  # type: str
        # 结算客户名称did
        self.settle_client_did = settle_client_did  # type: str
        # 结算公司
        self.settle_company = settle_company  # type: str
        # 结算公司企业信用号
        self.settle_company_cert_no = settle_company_cert_no  # type: str
        # 结算公司did
        self.settle_company_did = settle_company_did  # type: str
        # 账单结算周期
        self.settle_cycle = settle_cycle  # type: str
        # 税金
        self.taxes = taxes              # type: str
        # 未税价
        self.untaxed_price = untaxed_price  # type: str

    def validate(self):
        if self.receipt_bill_tariff_params:
            for k in self.receipt_bill_tariff_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['actual_settle_company'] = self.actual_settle_company
        result['actual_settle_company_cert_no'] = self.actual_settle_company_cert_no
        result['actual_settle_company_did'] = self.actual_settle_company_did
        result['apply_date'] = self.apply_date
        result['client_type'] = self.client_type
        result['currency'] = self.currency
        result['forwarder_did'] = self.forwarder_did
        result['invoice_title'] = self.invoice_title
        result['price_including_tax'] = self.price_including_tax
        result['receipt_account'] = self.receipt_account
        result['receipt_amount'] = self.receipt_amount
        result['receipt_bill_order_code'] = self.receipt_bill_order_code
        result['receipt_bill_tariff_params'] = []
        if self.receipt_bill_tariff_params is not None:
            for k in self.receipt_bill_tariff_params:
                result['receipt_bill_tariff_params'].append(k.to_map() if k else None)
        else:
            result['receipt_bill_tariff_params'] = None
        result['settle_client'] = self.settle_client
        result['settle_client_cert_no'] = self.settle_client_cert_no
        result['settle_client_did'] = self.settle_client_did
        result['settle_company'] = self.settle_company
        result['settle_company_cert_no'] = self.settle_company_cert_no
        result['settle_company_did'] = self.settle_company_did
        result['settle_cycle'] = self.settle_cycle
        result['taxes'] = self.taxes
        result['untaxed_price'] = self.untaxed_price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.actual_settle_company = map.get('actual_settle_company')
        self.actual_settle_company_cert_no = map.get('actual_settle_company_cert_no')
        self.actual_settle_company_did = map.get('actual_settle_company_did')
        self.apply_date = map.get('apply_date')
        self.client_type = map.get('client_type')
        self.currency = map.get('currency')
        self.forwarder_did = map.get('forwarder_did')
        self.invoice_title = map.get('invoice_title')
        self.price_including_tax = map.get('price_including_tax')
        self.receipt_account = map.get('receipt_account')
        self.receipt_amount = map.get('receipt_amount')
        self.receipt_bill_order_code = map.get('receipt_bill_order_code')
        self.receipt_bill_tariff_params = []
        if map.get('receipt_bill_tariff_params') is not None:
            for k in map.get('receipt_bill_tariff_params'):
                temp_model = ReceiptBillTariffParam()
                self.receipt_bill_tariff_params.append(temp_model.from_map(k))
        else:
            self.receipt_bill_tariff_params = None
        self.settle_client = map.get('settle_client')
        self.settle_client_cert_no = map.get('settle_client_cert_no')
        self.settle_client_did = map.get('settle_client_did')
        self.settle_company = map.get('settle_company')
        self.settle_company_cert_no = map.get('settle_company_cert_no')
        self.settle_company_did = map.get('settle_company_did')
        self.settle_cycle = map.get('settle_cycle')
        self.taxes = map.get('taxes')
        self.untaxed_price = map.get('untaxed_price')
        return self


class CreateDigitalLogisticBillReceiptbillorderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBillPaybilltariffRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None,
                 billing_number=None, billing_type=None, bkg_no=None, booking_no=None, currency=None, forwarder_did=None,
                 income_or_expenses=None, invoice_url=None, order_no=None, pay_tariff_code=None, pay_tariff_desc=None,
                 pay_tariff_project=None, price_including_tax=None, settle_client=None, settle_client_cert_no=None,
                 settle_client_did=None, taxes=None, untaxed_price=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 计费数量 业务必填
        self.billing_number = billing_number  # type: str
        # 计费类型 业务必填
        self.billing_type = billing_type  # type: str
        # 航运订舱号[业务必填]
        self.bkg_no = bkg_no            # type: str
        # 订舱单号[业务必填]
        self.booking_no = booking_no    # type: str
        # 币种 业务必填
        self.currency = currency        # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 收支  INCOME--收入， EXPENSES--支出
        # 业务必填
        self.income_or_expenses = income_or_expenses  # type: str
        # 电子发票网址
        self.invoice_url = invoice_url  # type: str
        # 工作单号 业务必填
        self.order_no = order_no        # type: str
        # 资费单据编号
        self.pay_tariff_code = pay_tariff_code  # type: str
        # 资费项中文描述 业务必填
        self.pay_tariff_desc = pay_tariff_desc  # type: str
        # 资费项目 业务必填
        self.pay_tariff_project = pay_tariff_project  # type: str
        # 含税价 业务必填
        self.price_including_tax = price_including_tax  # type: str
        # 结算客户名称
        self.settle_client = settle_client  # type: str
        # 结算客户企业信用号
        self.settle_client_cert_no = settle_client_cert_no  # type: str
        # 结算客户did
        self.settle_client_did = settle_client_did  # type: str
        # 税金
        self.taxes = taxes              # type: str
        # 未税价 业务必填
        self.untaxed_price = untaxed_price  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['billing_number'] = self.billing_number
        result['billing_type'] = self.billing_type
        result['bkg_no'] = self.bkg_no
        result['booking_no'] = self.booking_no
        result['currency'] = self.currency
        result['forwarder_did'] = self.forwarder_did
        result['income_or_expenses'] = self.income_or_expenses
        result['invoice_url'] = self.invoice_url
        result['order_no'] = self.order_no
        result['pay_tariff_code'] = self.pay_tariff_code
        result['pay_tariff_desc'] = self.pay_tariff_desc
        result['pay_tariff_project'] = self.pay_tariff_project
        result['price_including_tax'] = self.price_including_tax
        result['settle_client'] = self.settle_client
        result['settle_client_cert_no'] = self.settle_client_cert_no
        result['settle_client_did'] = self.settle_client_did
        result['taxes'] = self.taxes
        result['untaxed_price'] = self.untaxed_price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.billing_number = map.get('billing_number')
        self.billing_type = map.get('billing_type')
        self.bkg_no = map.get('bkg_no')
        self.booking_no = map.get('booking_no')
        self.currency = map.get('currency')
        self.forwarder_did = map.get('forwarder_did')
        self.income_or_expenses = map.get('income_or_expenses')
        self.invoice_url = map.get('invoice_url')
        self.order_no = map.get('order_no')
        self.pay_tariff_code = map.get('pay_tariff_code')
        self.pay_tariff_desc = map.get('pay_tariff_desc')
        self.pay_tariff_project = map.get('pay_tariff_project')
        self.price_including_tax = map.get('price_including_tax')
        self.settle_client = map.get('settle_client')
        self.settle_client_cert_no = map.get('settle_client_cert_no')
        self.settle_client_did = map.get('settle_client_did')
        self.taxes = map.get('taxes')
        self.untaxed_price = map.get('untaxed_price')
        return self


class SaveDigitalLogisticBillPaybilltariffResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBillReceiptbilltariffRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None,
                 billing_number=None, billing_type=None, bkg_no=None, booking_no=None, currency=None, forwarder_did=None,
                 income_or_expenses=None, invoice_url=None, order_no=None, price_including_tax=None, receipt_tariff_code=None,
                 receipt_tariff_desc=None, receipt_tariff_project=None, settle_client=None, settle_client_cert_no=None,
                 settle_client_did=None, taxes=None, untaxed_price=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 计费数量  业务必填
        self.billing_number = billing_number  # type: str
        # 计费类型 业务必填
        self.billing_type = billing_type  # type: str
        # 航运订舱号[业务必填]
        self.bkg_no = bkg_no            # type: str
        # 订舱单号[业务必填]
        self.booking_no = booking_no    # type: str
        # 币种 [业务必填]
        self.currency = currency        # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 收支  INCOME--收入， EXPENSES--支出
        # 业务必填
        self.income_or_expenses = income_or_expenses  # type: str
        # 电子发票网址
        self.invoice_url = invoice_url  # type: str
        # 工作单号 业务必填
        self.order_no = order_no        # type: str
        # 含税价 业务必填
        self.price_including_tax = price_including_tax  # type: str
        # 资费单据编号
        self.receipt_tariff_code = receipt_tariff_code  # type: str
        # 中文描述 业务必填
        self.receipt_tariff_desc = receipt_tariff_desc  # type: str
        # 资费项目 业务必填
        self.receipt_tariff_project = receipt_tariff_project  # type: str
        # 结算客户名称
        self.settle_client = settle_client  # type: str
        # 结算客户企业信用号
        self.settle_client_cert_no = settle_client_cert_no  # type: str
        # 结算客户did
        self.settle_client_did = settle_client_did  # type: str
        # 税金
        self.taxes = taxes              # type: str
        # 未税价 业务必填
        self.untaxed_price = untaxed_price  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['billing_number'] = self.billing_number
        result['billing_type'] = self.billing_type
        result['bkg_no'] = self.bkg_no
        result['booking_no'] = self.booking_no
        result['currency'] = self.currency
        result['forwarder_did'] = self.forwarder_did
        result['income_or_expenses'] = self.income_or_expenses
        result['invoice_url'] = self.invoice_url
        result['order_no'] = self.order_no
        result['price_including_tax'] = self.price_including_tax
        result['receipt_tariff_code'] = self.receipt_tariff_code
        result['receipt_tariff_desc'] = self.receipt_tariff_desc
        result['receipt_tariff_project'] = self.receipt_tariff_project
        result['settle_client'] = self.settle_client
        result['settle_client_cert_no'] = self.settle_client_cert_no
        result['settle_client_did'] = self.settle_client_did
        result['taxes'] = self.taxes
        result['untaxed_price'] = self.untaxed_price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.billing_number = map.get('billing_number')
        self.billing_type = map.get('billing_type')
        self.bkg_no = map.get('bkg_no')
        self.booking_no = map.get('booking_no')
        self.currency = map.get('currency')
        self.forwarder_did = map.get('forwarder_did')
        self.income_or_expenses = map.get('income_or_expenses')
        self.invoice_url = map.get('invoice_url')
        self.order_no = map.get('order_no')
        self.price_including_tax = map.get('price_including_tax')
        self.receipt_tariff_code = map.get('receipt_tariff_code')
        self.receipt_tariff_desc = map.get('receipt_tariff_desc')
        self.receipt_tariff_project = map.get('receipt_tariff_project')
        self.settle_client = map.get('settle_client')
        self.settle_client_cert_no = map.get('settle_client_cert_no')
        self.settle_client_did = map.get('settle_client_did')
        self.taxes = map.get('taxes')
        self.untaxed_price = map.get('untaxed_price')
        return self


class SaveDigitalLogisticBillReceiptbilltariffResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class VerifyDigitalLogisticBillPaybillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None, forwarder_did=None,
                 pay_tariff_code=None, verify_amount=None, verify_pay_tariff_code=None, verify_status=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 应付资费项编号
        self.pay_tariff_code = pay_tariff_code  # type: str
        # 核销金额 业务必填
        self.verify_amount = verify_amount  # type: str
        # 核销应付资费项编号
        self.verify_pay_tariff_code = verify_pay_tariff_code  # type: str
        # 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销
        # 业务必填
        self.verify_status = verify_status  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['forwarder_did'] = self.forwarder_did
        result['pay_tariff_code'] = self.pay_tariff_code
        result['verify_amount'] = self.verify_amount
        result['verify_pay_tariff_code'] = self.verify_pay_tariff_code
        result['verify_status'] = self.verify_status
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.forwarder_did = map.get('forwarder_did')
        self.pay_tariff_code = map.get('pay_tariff_code')
        self.verify_amount = map.get('verify_amount')
        self.verify_pay_tariff_code = map.get('verify_pay_tariff_code')
        self.verify_status = map.get('verify_status')
        return self


class VerifyDigitalLogisticBillPaybillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class VerifyDigitalLogisticBillReceiptbillorderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None, forwarder_did=None,
                 receipt_tariff_code=None, verify_amount=None, verify_receipt_tariff_code=None, verify_status=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 应收资费项编号
        self.receipt_tariff_code = receipt_tariff_code  # type: str
        # 核销金额 业务必填
        self.verify_amount = verify_amount  # type: str
        # 核销应收资费项编号
        self.verify_receipt_tariff_code = verify_receipt_tariff_code  # type: str
        # 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销 业务必填
        self.verify_status = verify_status  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['forwarder_did'] = self.forwarder_did
        result['receipt_tariff_code'] = self.receipt_tariff_code
        result['verify_amount'] = self.verify_amount
        result['verify_receipt_tariff_code'] = self.verify_receipt_tariff_code
        result['verify_status'] = self.verify_status
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.forwarder_did = map.get('forwarder_did')
        self.receipt_tariff_code = map.get('receipt_tariff_code')
        self.verify_amount = map.get('verify_amount')
        self.verify_receipt_tariff_code = map.get('verify_receipt_tariff_code')
        self.verify_status = map.get('verify_status')
        return self


class VerifyDigitalLogisticBillReceiptbillorderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class UpdateDigitalLogisticBillPaybillorderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None, apply_date=None,
                 bank_receipt_account=None, currency=None, deposit_bank=None, expire_date=None, forwarder_did=None, pay_amount=None,
                 pay_bill_order_code=None, pay_bill_tariff_params=None, pay_company=None, pay_company_cert_no=None,
                 pay_company_did=None, pay_deadline=None, receipt_client=None, receipt_client_cert_no=None,
                 receipt_client_did=None, receipt_tariff_codes=None, settle_company=None, settle_company_cert_no=None,
                 settle_company_did=None, settle_cycle=None, settle_status=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        # 
        self.action = action            # type: str
        # 申请时间 毫秒值 业务必填
        self.apply_date = apply_date    # type: int
        # 银行收款账户
        self.bank_receipt_account = bank_receipt_account  # type: str
        # 币种 业务必填
        self.currency = currency        # type: str
        # 开户行
        self.deposit_bank = deposit_bank  # type: str
        # 账单到期日
        self.expire_date = expire_date  # type: int
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 应付总额 业务必填
        self.pay_amount = pay_amount    # type: str
        # 付款单编号
        self.pay_bill_order_code = pay_bill_order_code  # type: str
        # 应付账单资费项 业务必填
        self.pay_bill_tariff_params = pay_bill_tariff_params  # type: List[PayBillTariffParam]
        # 付款公司
        self.pay_company = pay_company  # type: str
        # 付款公司企业信用号
        self.pay_company_cert_no = pay_company_cert_no  # type: str
        # 付款公司did
        self.pay_company_did = pay_company_did  # type: str
        # 付款期限
        self.pay_deadline = pay_deadline  # type: str
        # 收款客户[业务必填]
        self.receipt_client = receipt_client  # type: str
        # 收款客户企业信用号[业务必填]
        self.receipt_client_cert_no = receipt_client_cert_no  # type: str
        # 收款客户did[业务必填]
        self.receipt_client_did = receipt_client_did  # type: str
        # 对应应收资费项code
        self.receipt_tariff_codes = receipt_tariff_codes  # type: List[str]
        # 结算公司
        self.settle_company = settle_company  # type: str
        # 结算公司企业信用号
        self.settle_company_cert_no = settle_company_cert_no  # type: str
        # 结算公司did
        self.settle_company_did = settle_company_did  # type: str
        # 账单结算周期
        self.settle_cycle = settle_cycle  # type: str
        # 结算状态 ：  SETTLED(已结算) ,  UNSETTLE（未结算）[业务必填]
        self.settle_status = settle_status  # type: str

    def validate(self):
        if self.pay_bill_tariff_params:
            for k in self.pay_bill_tariff_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['apply_date'] = self.apply_date
        result['bank_receipt_account'] = self.bank_receipt_account
        result['currency'] = self.currency
        result['deposit_bank'] = self.deposit_bank
        result['expire_date'] = self.expire_date
        result['forwarder_did'] = self.forwarder_did
        result['pay_amount'] = self.pay_amount
        result['pay_bill_order_code'] = self.pay_bill_order_code
        result['pay_bill_tariff_params'] = []
        if self.pay_bill_tariff_params is not None:
            for k in self.pay_bill_tariff_params:
                result['pay_bill_tariff_params'].append(k.to_map() if k else None)
        else:
            result['pay_bill_tariff_params'] = None
        result['pay_company'] = self.pay_company
        result['pay_company_cert_no'] = self.pay_company_cert_no
        result['pay_company_did'] = self.pay_company_did
        result['pay_deadline'] = self.pay_deadline
        result['receipt_client'] = self.receipt_client
        result['receipt_client_cert_no'] = self.receipt_client_cert_no
        result['receipt_client_did'] = self.receipt_client_did
        result['receipt_tariff_codes'] = self.receipt_tariff_codes
        result['settle_company'] = self.settle_company
        result['settle_company_cert_no'] = self.settle_company_cert_no
        result['settle_company_did'] = self.settle_company_did
        result['settle_cycle'] = self.settle_cycle
        result['settle_status'] = self.settle_status
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.apply_date = map.get('apply_date')
        self.bank_receipt_account = map.get('bank_receipt_account')
        self.currency = map.get('currency')
        self.deposit_bank = map.get('deposit_bank')
        self.expire_date = map.get('expire_date')
        self.forwarder_did = map.get('forwarder_did')
        self.pay_amount = map.get('pay_amount')
        self.pay_bill_order_code = map.get('pay_bill_order_code')
        self.pay_bill_tariff_params = []
        if map.get('pay_bill_tariff_params') is not None:
            for k in map.get('pay_bill_tariff_params'):
                temp_model = PayBillTariffParam()
                self.pay_bill_tariff_params.append(temp_model.from_map(k))
        else:
            self.pay_bill_tariff_params = None
        self.pay_company = map.get('pay_company')
        self.pay_company_cert_no = map.get('pay_company_cert_no')
        self.pay_company_did = map.get('pay_company_did')
        self.pay_deadline = map.get('pay_deadline')
        self.receipt_client = map.get('receipt_client')
        self.receipt_client_cert_no = map.get('receipt_client_cert_no')
        self.receipt_client_did = map.get('receipt_client_did')
        self.receipt_tariff_codes = map.get('receipt_tariff_codes')
        self.settle_company = map.get('settle_company')
        self.settle_company_cert_no = map.get('settle_company_cert_no')
        self.settle_company_did = map.get('settle_company_did')
        self.settle_cycle = map.get('settle_cycle')
        self.settle_status = map.get('settle_status')
        return self


class UpdateDigitalLogisticBillPaybillorderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class UpdateDigitalLogisticBillReceiptbillorderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None,
                 actual_settle_company=None, actual_settle_company_cert_no=None, actual_settle_company_did=None, apply_date=None,
                 client_type=None, currency=None, expire_date=None, forwarder_did=None, invoice_title=None,
                 price_including_tax=None, receipt_account=None, receipt_amount=None, receipt_bill_order_code=None,
                 receipt_bill_tariff_params=None, settle_client=None, settle_client_cert_no=None, settle_client_did=None, settle_company=None,
                 settle_company_cert_no=None, settle_company_did=None, settle_cycle=None, settle_status=None, taxes=None,
                 untaxed_price=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 实际收款结算公司
        self.actual_settle_company = actual_settle_company  # type: str
        # 实际收款结算公司企业信用号
        self.actual_settle_company_cert_no = actual_settle_company_cert_no  # type: str
        # 实际收款结算公司did
        self.actual_settle_company_did = actual_settle_company_did  # type: str
        # 确认时间
        self.apply_date = apply_date    # type: int
        # 揽货类型
        self.client_type = client_type  # type: str
        # 币种
        self.currency = currency        # type: str
        # 账单到期日
        self.expire_date = expire_date  # type: int
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 开票抬头
        self.invoice_title = invoice_title  # type: str
        # 含税价
        self.price_including_tax = price_including_tax  # type: str
        # 收款账号
        self.receipt_account = receipt_account  # type: str
        # 收款总额
        self.receipt_amount = receipt_amount  # type: str
        # 收款账单编号
        self.receipt_bill_order_code = receipt_bill_order_code  # type: str
        # 应收资费项账单 业务必填
        self.receipt_bill_tariff_params = receipt_bill_tariff_params  # type: List[ReceiptBillTariffParam]
        # 结算客户名称
        self.settle_client = settle_client  # type: str
        # 结算客户名称企业信用号
        self.settle_client_cert_no = settle_client_cert_no  # type: str
        # 结算客户did
        self.settle_client_did = settle_client_did  # type: str
        # 结算公司 [业务必填]
        self.settle_company = settle_company  # type: str
        # 结算公司企业信用号[业务必填]
        self.settle_company_cert_no = settle_company_cert_no  # type: str
        # 结算公司did[业务必填]
        self.settle_company_did = settle_company_did  # type: str
        # 账单结算周期
        self.settle_cycle = settle_cycle  # type: str
        # SETTLED(已结算) UNSETTLE（未结算）[业务必填]
        self.settle_status = settle_status  # type: str
        # 税金
        self.taxes = taxes              # type: str
        # 未税价
        self.untaxed_price = untaxed_price  # type: str

    def validate(self):
        if self.receipt_bill_tariff_params:
            for k in self.receipt_bill_tariff_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['actual_settle_company'] = self.actual_settle_company
        result['actual_settle_company_cert_no'] = self.actual_settle_company_cert_no
        result['actual_settle_company_did'] = self.actual_settle_company_did
        result['apply_date'] = self.apply_date
        result['client_type'] = self.client_type
        result['currency'] = self.currency
        result['expire_date'] = self.expire_date
        result['forwarder_did'] = self.forwarder_did
        result['invoice_title'] = self.invoice_title
        result['price_including_tax'] = self.price_including_tax
        result['receipt_account'] = self.receipt_account
        result['receipt_amount'] = self.receipt_amount
        result['receipt_bill_order_code'] = self.receipt_bill_order_code
        result['receipt_bill_tariff_params'] = []
        if self.receipt_bill_tariff_params is not None:
            for k in self.receipt_bill_tariff_params:
                result['receipt_bill_tariff_params'].append(k.to_map() if k else None)
        else:
            result['receipt_bill_tariff_params'] = None
        result['settle_client'] = self.settle_client
        result['settle_client_cert_no'] = self.settle_client_cert_no
        result['settle_client_did'] = self.settle_client_did
        result['settle_company'] = self.settle_company
        result['settle_company_cert_no'] = self.settle_company_cert_no
        result['settle_company_did'] = self.settle_company_did
        result['settle_cycle'] = self.settle_cycle
        result['settle_status'] = self.settle_status
        result['taxes'] = self.taxes
        result['untaxed_price'] = self.untaxed_price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.actual_settle_company = map.get('actual_settle_company')
        self.actual_settle_company_cert_no = map.get('actual_settle_company_cert_no')
        self.actual_settle_company_did = map.get('actual_settle_company_did')
        self.apply_date = map.get('apply_date')
        self.client_type = map.get('client_type')
        self.currency = map.get('currency')
        self.expire_date = map.get('expire_date')
        self.forwarder_did = map.get('forwarder_did')
        self.invoice_title = map.get('invoice_title')
        self.price_including_tax = map.get('price_including_tax')
        self.receipt_account = map.get('receipt_account')
        self.receipt_amount = map.get('receipt_amount')
        self.receipt_bill_order_code = map.get('receipt_bill_order_code')
        self.receipt_bill_tariff_params = []
        if map.get('receipt_bill_tariff_params') is not None:
            for k in map.get('receipt_bill_tariff_params'):
                temp_model = ReceiptBillTariffParam()
                self.receipt_bill_tariff_params.append(temp_model.from_map(k))
        else:
            self.receipt_bill_tariff_params = None
        self.settle_client = map.get('settle_client')
        self.settle_client_cert_no = map.get('settle_client_cert_no')
        self.settle_client_did = map.get('settle_client_did')
        self.settle_company = map.get('settle_company')
        self.settle_company_cert_no = map.get('settle_company_cert_no')
        self.settle_company_did = map.get('settle_company_did')
        self.settle_cycle = map.get('settle_cycle')
        self.settle_status = map.get('settle_status')
        self.taxes = map.get('taxes')
        self.untaxed_price = map.get('untaxed_price')
        return self


class UpdateDigitalLogisticBillReceiptbillorderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBillPayinvoiceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None, amount=None,
                 check_code=None, currency=None, dollar_amount=None, drawer_name=None, drawer_taxpayer_code=None,
                 forwarder_did=None, invoice_code=None, invoice_header_did=None, invoice_header_name=None,
                 invoice_header_social_no=None, invoice_number=None, invoice_tax_code=None, invoice_type=None, make_invoice_date=None,
                 pay_bill_invoice_params=None, pay_tariff_invoice_params=None, untaxed_price=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 总金额 业务必填
        self.amount = amount            # type: str
        # 校验码后六位
        self.check_code = check_code    # type: str
        # 币种 CNY/USD [业务必填]
        self.currency = currency        # type: str
        # 美元金额
        self.dollar_amount = dollar_amount  # type: str
        # 开票方名称  业务必填
        self.drawer_name = drawer_name  # type: str
        # 开票纳税人识别号 业务必填
        self.drawer_taxpayer_code = drawer_taxpayer_code  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 发票唯一标识
        self.invoice_code = invoice_code  # type: str
        # 发票抬头did[业务必填]
        self.invoice_header_did = invoice_header_did  # type: str
        # 发票抬头企业名称[业务必填]
        self.invoice_header_name = invoice_header_name  # type: str
        # 发票抬头企业信用代码[业务必填]
        self.invoice_header_social_no = invoice_header_social_no  # type: str
        # 发票号码 业务必填
        self.invoice_number = invoice_number  # type: str
        # 发票税务号
        self.invoice_tax_code = invoice_tax_code  # type: str
        # 开票类型 业务必填
        self.invoice_type = invoice_type  # type: str
        # 开票日期 业务必填
        self.make_invoice_date = make_invoice_date  # type: int
        # 账单关联项目
        self.pay_bill_invoice_params = pay_bill_invoice_params  # type: List[PayBillInvoiceParam]
        # 资费项发票 业务必填
        self.pay_tariff_invoice_params = pay_tariff_invoice_params  # type: List[PayTariffInvoiceParam]
        # 不含税金额 业务必填
        self.untaxed_price = untaxed_price  # type: str

    def validate(self):
        if self.pay_bill_invoice_params:
            for k in self.pay_bill_invoice_params:
                if k:
                    k.validate()
        if self.pay_tariff_invoice_params:
            for k in self.pay_tariff_invoice_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['amount'] = self.amount
        result['check_code'] = self.check_code
        result['currency'] = self.currency
        result['dollar_amount'] = self.dollar_amount
        result['drawer_name'] = self.drawer_name
        result['drawer_taxpayer_code'] = self.drawer_taxpayer_code
        result['forwarder_did'] = self.forwarder_did
        result['invoice_code'] = self.invoice_code
        result['invoice_header_did'] = self.invoice_header_did
        result['invoice_header_name'] = self.invoice_header_name
        result['invoice_header_social_no'] = self.invoice_header_social_no
        result['invoice_number'] = self.invoice_number
        result['invoice_tax_code'] = self.invoice_tax_code
        result['invoice_type'] = self.invoice_type
        result['make_invoice_date'] = self.make_invoice_date
        result['pay_bill_invoice_params'] = []
        if self.pay_bill_invoice_params is not None:
            for k in self.pay_bill_invoice_params:
                result['pay_bill_invoice_params'].append(k.to_map() if k else None)
        else:
            result['pay_bill_invoice_params'] = None
        result['pay_tariff_invoice_params'] = []
        if self.pay_tariff_invoice_params is not None:
            for k in self.pay_tariff_invoice_params:
                result['pay_tariff_invoice_params'].append(k.to_map() if k else None)
        else:
            result['pay_tariff_invoice_params'] = None
        result['untaxed_price'] = self.untaxed_price
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.amount = map.get('amount')
        self.check_code = map.get('check_code')
        self.currency = map.get('currency')
        self.dollar_amount = map.get('dollar_amount')
        self.drawer_name = map.get('drawer_name')
        self.drawer_taxpayer_code = map.get('drawer_taxpayer_code')
        self.forwarder_did = map.get('forwarder_did')
        self.invoice_code = map.get('invoice_code')
        self.invoice_header_did = map.get('invoice_header_did')
        self.invoice_header_name = map.get('invoice_header_name')
        self.invoice_header_social_no = map.get('invoice_header_social_no')
        self.invoice_number = map.get('invoice_number')
        self.invoice_tax_code = map.get('invoice_tax_code')
        self.invoice_type = map.get('invoice_type')
        self.make_invoice_date = map.get('make_invoice_date')
        self.pay_bill_invoice_params = []
        if map.get('pay_bill_invoice_params') is not None:
            for k in map.get('pay_bill_invoice_params'):
                temp_model = PayBillInvoiceParam()
                self.pay_bill_invoice_params.append(temp_model.from_map(k))
        else:
            self.pay_bill_invoice_params = None
        self.pay_tariff_invoice_params = []
        if map.get('pay_tariff_invoice_params') is not None:
            for k in map.get('pay_tariff_invoice_params'):
                temp_model = PayTariffInvoiceParam()
                self.pay_tariff_invoice_params.append(temp_model.from_map(k))
        else:
            self.pay_tariff_invoice_params = None
        self.untaxed_price = map.get('untaxed_price')
        return self


class SaveDigitalLogisticBillPayinvoiceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class SaveDigitalLogisticBillReceiptinvoiceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None, amount=None,
                 check_code=None, drawer_name=None, drawer_taxpayer_code=None, forwarder_did=None, invoice_code=None,
                 invoice_number=None, invoice_type=None, make_invoice_date=None, receipt_tariff_invoice_params=None,
                 untaxed_price=None, invoice_tax_code=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        self.action = action            # type: str
        # 总金额 业务必填
        self.amount = amount            # type: str
        # 校验码后六位
        self.check_code = check_code    # type: str
        # 开票方名称 业务必填
        self.drawer_name = drawer_name  # type: str
        # 开票纳税人识别号 业务必填
        self.drawer_taxpayer_code = drawer_taxpayer_code  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 应收发票唯一标识
        self.invoice_code = invoice_code  # type: str
        # 发票号码 业务必填
        self.invoice_number = invoice_number  # type: str
        # 开票类型 业务必填
        self.invoice_type = invoice_type  # type: str
        # 开票日期 毫秒值 业务必填
        self.make_invoice_date = make_invoice_date  # type: int
        # 资费项发票 业务必填
        self.receipt_tariff_invoice_params = receipt_tariff_invoice_params  # type: List[ReceiptTariffInvoiceParam]
        # 不含税金额 业务必填
        self.untaxed_price = untaxed_price  # type: str
        # 发票税务号
        self.invoice_tax_code = invoice_tax_code  # type: str

    def validate(self):
        if self.receipt_tariff_invoice_params:
            for k in self.receipt_tariff_invoice_params:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['amount'] = self.amount
        result['check_code'] = self.check_code
        result['drawer_name'] = self.drawer_name
        result['drawer_taxpayer_code'] = self.drawer_taxpayer_code
        result['forwarder_did'] = self.forwarder_did
        result['invoice_code'] = self.invoice_code
        result['invoice_number'] = self.invoice_number
        result['invoice_type'] = self.invoice_type
        result['make_invoice_date'] = self.make_invoice_date
        result['receipt_tariff_invoice_params'] = []
        if self.receipt_tariff_invoice_params is not None:
            for k in self.receipt_tariff_invoice_params:
                result['receipt_tariff_invoice_params'].append(k.to_map() if k else None)
        else:
            result['receipt_tariff_invoice_params'] = None
        result['untaxed_price'] = self.untaxed_price
        result['invoice_tax_code'] = self.invoice_tax_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.amount = map.get('amount')
        self.check_code = map.get('check_code')
        self.drawer_name = map.get('drawer_name')
        self.drawer_taxpayer_code = map.get('drawer_taxpayer_code')
        self.forwarder_did = map.get('forwarder_did')
        self.invoice_code = map.get('invoice_code')
        self.invoice_number = map.get('invoice_number')
        self.invoice_type = map.get('invoice_type')
        self.make_invoice_date = map.get('make_invoice_date')
        self.receipt_tariff_invoice_params = []
        if map.get('receipt_tariff_invoice_params') is not None:
            for k in map.get('receipt_tariff_invoice_params'):
                temp_model = ReceiptTariffInvoiceParam()
                self.receipt_tariff_invoice_params.append(temp_model.from_map(k))
        else:
            self.receipt_tariff_invoice_params = None
        self.untaxed_price = map.get('untaxed_price')
        self.invoice_tax_code = map.get('invoice_tax_code')
        return self


class SaveDigitalLogisticBillReceiptinvoiceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class UploadDigitalLogisticBizFinancingRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, financing_data=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 融资数据
        self.financing_data = financing_data  # type: List[UploadFinancingParam]

    def validate(self):
        if self.financing_data:
            for k in self.financing_data:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['financing_data'] = []
        if self.financing_data is not None:
            for k in self.financing_data:
                result['financing_data'].append(k.to_map() if k else None)
        else:
            result['financing_data'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.financing_data = []
        if map.get('financing_data') is not None:
            for k in map.get('financing_data'):
                temp_model = UploadFinancingParam()
                self.financing_data.append(temp_model.from_map(k))
        else:
            self.financing_data = None
        return self


class UploadDigitalLogisticBizFinancingResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 上链hash
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class UploadDigitalLogisticBizOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, carrier_did=None,
                 deadline_amount=None, forwarder_did=None, order_amounts=None, order_bookings=None, order_no=None, settle_did=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 船公司did
        self.carrier_did = carrier_did  # type: str
        # 尾款金额
        self.deadline_amount = deadline_amount  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 订单总额
        self.order_amounts = order_amounts  # type: List[UploadOrderAmount]
        # 订单booking信息
        self.order_bookings = order_bookings  # type: List[UploadOrderBooking]
        # 订单号
        self.order_no = order_no        # type: str
        # 结算did
        self.settle_did = settle_did    # type: str

    def validate(self):
        if self.order_amounts:
            for k in self.order_amounts:
                if k:
                    k.validate()
        if self.order_bookings:
            for k in self.order_bookings:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['carrier_did'] = self.carrier_did
        result['deadline_amount'] = self.deadline_amount
        result['forwarder_did'] = self.forwarder_did
        result['order_amounts'] = []
        if self.order_amounts is not None:
            for k in self.order_amounts:
                result['order_amounts'].append(k.to_map() if k else None)
        else:
            result['order_amounts'] = None
        result['order_bookings'] = []
        if self.order_bookings is not None:
            for k in self.order_bookings:
                result['order_bookings'].append(k.to_map() if k else None)
        else:
            result['order_bookings'] = None
        result['order_no'] = self.order_no
        result['settle_did'] = self.settle_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.carrier_did = map.get('carrier_did')
        self.deadline_amount = map.get('deadline_amount')
        self.forwarder_did = map.get('forwarder_did')
        self.order_amounts = []
        if map.get('order_amounts') is not None:
            for k in map.get('order_amounts'):
                temp_model = UploadOrderAmount()
                self.order_amounts.append(temp_model.from_map(k))
        else:
            self.order_amounts = None
        self.order_bookings = []
        if map.get('order_bookings') is not None:
            for k in map.get('order_bookings'):
                temp_model = UploadOrderBooking()
                self.order_bookings.append(temp_model.from_map(k))
        else:
            self.order_bookings = None
        self.order_no = map.get('order_no')
        self.settle_did = map.get('settle_did')
        return self


class UploadDigitalLogisticBizOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 上链hash
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class CreateDigitalLogisticDidCarrierRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, agent_did=None,
                 ep_cert_name=None, ep_cert_no=None, extension_info=None, legal_person_cert_name=None,
                 legal_person_cert_no=None, scac=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 代理did
        self.agent_did = agent_did      # type: str
        # 企业名称
        self.ep_cert_name = ep_cert_name  # type: str
        # 企业证件号
        self.ep_cert_no = ep_cert_no    # type: str
        # 扩展字段
        self.extension_info = extension_info  # type: str
        # 法人姓名
        self.legal_person_cert_name = legal_person_cert_name  # type: str
        # 法人身份证
        self.legal_person_cert_no = legal_person_cert_no  # type: str
        # 船公司编号
        self.scac = scac                # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['agent_did'] = self.agent_did
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['extension_info'] = self.extension_info
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        result['scac'] = self.scac
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.agent_did = map.get('agent_did')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.extension_info = map.get('extension_info')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        self.scac = map.get('scac')
        return self


class CreateDigitalLogisticDidCarrierResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 船公司did
        self.did = did                  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['did'] = self.did
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.did = map.get('did')
        return self


class AuthDigitalLogisticSysForwarderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, client_id=None,
                 client_secret=None, int_ref_id=None, tenant_id=None, source=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 客户端id
        self.client_id = client_id      # type: str
        # 密钥
        self.client_secret = client_secret  # type: str
        # 货代did
        self.int_ref_id = int_ref_id    # type: str
        # For HOME application internal
        self.tenant_id = tenant_id      # type: str
        # 渠道source
        self.source = source            # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['client_id'] = self.client_id
        result['client_secret'] = self.client_secret
        result['int_ref_id'] = self.int_ref_id
        result['tenant_id'] = self.tenant_id
        result['source'] = self.source
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.client_id = map.get('client_id')
        self.client_secret = map.get('client_secret')
        self.int_ref_id = map.get('int_ref_id')
        self.tenant_id = map.get('tenant_id')
        self.source = map.get('source')
        return self


class AuthDigitalLogisticSysForwarderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, result=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 推送结果
        self.result = result            # type: bool

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['result'] = self.result
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.result = map.get('result')
        return self


class QueryDigitalLogisticBizMasterblRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, forwarder_did=None,
                 master_bl_no=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # master提单号
        self.master_bl_no = master_bl_no  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['forwarder_did'] = self.forwarder_did
        result['master_bl_no'] = self.master_bl_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.forwarder_did = map.get('forwarder_did')
        self.master_bl_no = map.get('master_bl_no')
        return self


class QueryDigitalLogisticBizMasterblResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, carrier=None, consignee=None,
                 delivery_place=None, discharge_port=None, forwarder_did=None, freight=None, goods_dtos=None, loading_port=None,
                 master_bl_no=None, notify_party=None, pr_carriage=None, shipper=None, vessel=None, voyage=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 船公司
        self.carrier = carrier          # type: str
        # 收货人
        self.consignee = consignee      # type: str
        # 目的地
        self.delivery_place = delivery_place  # type: str
        # 卸货港
        self.discharge_port = discharge_port  # type: str
        # 货代did
        self.forwarder_did = forwarder_did  # type: str
        # 运费
        self.freight = freight          # type: str
        # 提单货物数据列表
        self.goods_dtos = goods_dtos    # type: List[MasterBlGoodsDto]
        # 起运港
        self.loading_port = loading_port  # type: str
        # master提单号
        self.master_bl_no = master_bl_no  # type: str
        # 通知方
        self.notify_party = notify_party  # type: str
        # 前程运输
        self.pr_carriage = pr_carriage  # type: str
        # 发货人
        self.shipper = shipper          # type: str
        # 航名
        self.vessel = vessel            # type: str
        # 航次
        self.voyage = voyage            # type: str

    def validate(self):
        if self.goods_dtos:
            for k in self.goods_dtos:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['carrier'] = self.carrier
        result['consignee'] = self.consignee
        result['delivery_place'] = self.delivery_place
        result['discharge_port'] = self.discharge_port
        result['forwarder_did'] = self.forwarder_did
        result['freight'] = self.freight
        result['goods_dtos'] = []
        if self.goods_dtos is not None:
            for k in self.goods_dtos:
                result['goods_dtos'].append(k.to_map() if k else None)
        else:
            result['goods_dtos'] = None
        result['loading_port'] = self.loading_port
        result['master_bl_no'] = self.master_bl_no
        result['notify_party'] = self.notify_party
        result['pr_carriage'] = self.pr_carriage
        result['shipper'] = self.shipper
        result['vessel'] = self.vessel
        result['voyage'] = self.voyage
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.carrier = map.get('carrier')
        self.consignee = map.get('consignee')
        self.delivery_place = map.get('delivery_place')
        self.discharge_port = map.get('discharge_port')
        self.forwarder_did = map.get('forwarder_did')
        self.freight = map.get('freight')
        self.goods_dtos = []
        if map.get('goods_dtos') is not None:
            for k in map.get('goods_dtos'):
                temp_model = MasterBlGoodsDto()
                self.goods_dtos.append(temp_model.from_map(k))
        else:
            self.goods_dtos = None
        self.loading_port = map.get('loading_port')
        self.master_bl_no = map.get('master_bl_no')
        self.notify_party = map.get('notify_party')
        self.pr_carriage = map.get('pr_carriage')
        self.shipper = map.get('shipper')
        self.vessel = map.get('vessel')
        self.voyage = map.get('voyage')
        return self


class SaveDigitalLogisticBizPayinvoicefileRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, action=None, file_hash=None,
                 file_id=None, forwarder_did=None, invoice_code=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除，INSERT为新增
        self.action = action            # type: str
        # 发票文件hash [业务必填]
        self.file_hash = file_hash      # type: str
        # 发票文件ID [业务必填]
        self.file_id = file_id          # type: str
        # 货代DID
        self.forwarder_did = forwarder_did  # type: str
        # 应付发票code
        self.invoice_code = invoice_code  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['action'] = self.action
        result['file_hash'] = self.file_hash
        result['file_id'] = self.file_id
        result['forwarder_did'] = self.forwarder_did
        result['invoice_code'] = self.invoice_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.action = map.get('action')
        self.file_hash = map.get('file_hash')
        self.file_id = map.get('file_id')
        self.forwarder_did = map.get('forwarder_did')
        self.invoice_code = map.get('invoice_code')
        return self


class SaveDigitalLogisticBizPayinvoicefileResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_codes=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str
        # 链上凭证
        self.tx_codes = tx_codes        # type: List[TxDto]

    def validate(self):
        if self.tx_codes:
            for k in self.tx_codes:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tx_codes'] = []
        if self.tx_codes is not None:
            for k in self.tx_codes:
                result['tx_codes'].append(k.to_map() if k else None)
        else:
            result['tx_codes'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tx_codes = []
        if map.get('tx_codes') is not None:
            for k in map.get('tx_codes'):
                temp_model = TxDto()
                self.tx_codes.append(temp_model.from_map(k))
        else:
            self.tx_codes = None
        return self


class UploadDigitalLogisticShippingEblRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, carrier_name=None,
                 consignee_did=None, ebl_category=None, ebl_copy_pdf_file_hash=None, ebl_copy_pdf_file_id=None, ebl_no=None,
                 ebl_original_pdf_file_hash=None, ebl_original_pdf_file_id=None, negotiating_bank_did=None, shipper_did=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 船公司名称
        self.carrier_name = carrier_name  # type: str
        # 收货人did
        self.consignee_did = consignee_did  # type: str
        # 电子提单类型
        self.ebl_category = ebl_category  # type: str
        # 电子提单copy文件hash
        self.ebl_copy_pdf_file_hash = ebl_copy_pdf_file_hash  # type: str
        # copy电子提单pdf文件id
        self.ebl_copy_pdf_file_id = ebl_copy_pdf_file_id  # type: str
        # 电子提单编号
        self.ebl_no = ebl_no            # type: str
        # 电子甜的原文件hash
        self.ebl_original_pdf_file_hash = ebl_original_pdf_file_hash  # type: str
        # 原电子提单pdf文件id
        self.ebl_original_pdf_file_id = ebl_original_pdf_file_id  # type: str
        # 议付行did
        self.negotiating_bank_did = negotiating_bank_did  # type: str
        # 托运人did
        self.shipper_did = shipper_did  # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['carrier_name'] = self.carrier_name
        result['consignee_did'] = self.consignee_did
        result['ebl_category'] = self.ebl_category
        result['ebl_copy_pdf_file_hash'] = self.ebl_copy_pdf_file_hash
        result['ebl_copy_pdf_file_id'] = self.ebl_copy_pdf_file_id
        result['ebl_no'] = self.ebl_no
        result['ebl_original_pdf_file_hash'] = self.ebl_original_pdf_file_hash
        result['ebl_original_pdf_file_id'] = self.ebl_original_pdf_file_id
        result['negotiating_bank_did'] = self.negotiating_bank_did
        result['shipper_did'] = self.shipper_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.carrier_name = map.get('carrier_name')
        self.consignee_did = map.get('consignee_did')
        self.ebl_category = map.get('ebl_category')
        self.ebl_copy_pdf_file_hash = map.get('ebl_copy_pdf_file_hash')
        self.ebl_copy_pdf_file_id = map.get('ebl_copy_pdf_file_id')
        self.ebl_no = map.get('ebl_no')
        self.ebl_original_pdf_file_hash = map.get('ebl_original_pdf_file_hash')
        self.ebl_original_pdf_file_id = map.get('ebl_original_pdf_file_id')
        self.negotiating_bank_did = map.get('negotiating_bank_did')
        self.shipper_did = map.get('shipper_did')
        return self


class UploadDigitalLogisticShippingEblResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class UploadDigitalLogisticShippingEblbatchRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, agent_did=None, agent_flag=None,
                 batch_no=None, carrier_name=None, consignee_did=None, ebl_category=None, ebl_details=None,
                 negotiating_bank_did=None, shipper_did=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 代理人did
        self.agent_did = agent_did      # type: str
        # 是否为代理操作
        self.agent_flag = agent_flag    # type: bool
        # 格式：carrierName_yyyyMMddHHmmss_5位随机数字；全局唯一
        self.batch_no = batch_no        # type: str
        # 船公司名称
        self.carrier_name = carrier_name  # type: str
        # 收货人did
        self.consignee_did = consignee_did  # type: str
        # 电子提单类型
        self.ebl_category = ebl_category  # type: str
        # 批次下的提单明细
        # 
        # 
        self.ebl_details = ebl_details  # type: List[EblDetail]
        # 议付行did
        self.negotiating_bank_did = negotiating_bank_did  # type: str
        # 托运人did
        self.shipper_did = shipper_did  # type: str

    def validate(self):
        if self.ebl_details:
            for k in self.ebl_details:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['agent_did'] = self.agent_did
        result['agent_flag'] = self.agent_flag
        result['batch_no'] = self.batch_no
        result['carrier_name'] = self.carrier_name
        result['consignee_did'] = self.consignee_did
        result['ebl_category'] = self.ebl_category
        result['ebl_details'] = []
        if self.ebl_details is not None:
            for k in self.ebl_details:
                result['ebl_details'].append(k.to_map() if k else None)
        else:
            result['ebl_details'] = None
        result['negotiating_bank_did'] = self.negotiating_bank_did
        result['shipper_did'] = self.shipper_did
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.agent_did = map.get('agent_did')
        self.agent_flag = map.get('agent_flag')
        self.batch_no = map.get('batch_no')
        self.carrier_name = map.get('carrier_name')
        self.consignee_did = map.get('consignee_did')
        self.ebl_category = map.get('ebl_category')
        self.ebl_details = []
        if map.get('ebl_details') is not None:
            for k in map.get('ebl_details'):
                temp_model = EblDetail()
                self.ebl_details.append(temp_model.from_map(k))
        else:
            self.ebl_details = None
        self.negotiating_bank_did = map.get('negotiating_bank_did')
        self.shipper_did = map.get('shipper_did')
        return self


class UploadDigitalLogisticShippingEblbatchResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self


class UpdateDigitalLogisticShippingEblbatchstatusRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, batch_no=None,
                 ebl_status_details=None):
        self.auth_token = auth_token    # type: str
        self.product_instance_id = product_instance_id  # type: str
        self.region_name = region_name  # type: str
        # 电子提单批次号
        self.batch_no = batch_no        # type: str
        # 批次下的提单状态变更明细
        self.ebl_status_details = ebl_status_details  # type: List[EblStatusDetail]

    def validate(self):
        if self.ebl_status_details:
            for k in self.ebl_status_details:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['batch_no'] = self.batch_no
        result['ebl_status_details'] = []
        if self.ebl_status_details is not None:
            for k in self.ebl_status_details:
                result['ebl_status_details'].append(k.to_map() if k else None)
        else:
            result['ebl_status_details'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.batch_no = map.get('batch_no')
        self.ebl_status_details = []
        if map.get('ebl_status_details') is not None:
            for k in map.get('ebl_status_details'):
                temp_model = EblStatusDetail()
                self.ebl_status_details.append(temp_model.from_map(k))
        else:
            self.ebl_status_details = None
        return self


class UpdateDigitalLogisticShippingEblbatchstatusResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id    # type: str
        self.result_code = result_code  # type: str
        self.result_msg = result_msg    # type: str

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        return self
