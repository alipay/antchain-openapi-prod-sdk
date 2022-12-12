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


class PushBlockchainTaxIcmInvoiceRequest(TeaModel):
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


class PushBlockchainTaxIcmInvoiceResponse(TeaModel):
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


class QueryBlockchainTaxIcmInvoiceRequest(TeaModel):
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


class QueryBlockchainTaxIcmInvoiceResponse(TeaModel):
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


class PushBlockchainTaxIcmInvoiceinfoRequest(TeaModel):
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


class PushBlockchainTaxIcmInvoiceinfoResponse(TeaModel):
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


