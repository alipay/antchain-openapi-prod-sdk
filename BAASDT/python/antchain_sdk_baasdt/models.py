# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel

"""
Model for initing client
"""


class Config(TeaModel):
    def __init__(self, access_key_id=None, access_key_secret=None, security_token=None, protocol=None, read_timeout=None, connect_timeout=None, http_proxy=None, https_proxy=None, endpoint=None, no_proxy=None, max_idle_conns=None, user_agent=None, socks_5proxy=None, socks_5net_work=None):
        self.access_key_id = access_key_id
        self.access_key_secret = access_key_secret
        self.security_token = security_token
        self.protocol = protocol
        self.read_timeout = read_timeout
        self.connect_timeout = connect_timeout
        self.http_proxy = http_proxy
        self.https_proxy = https_proxy
        self.endpoint = endpoint
        self.no_proxy = no_proxy
        self.max_idle_conns = max_idle_conns
        self.user_agent = user_agent
        self.socks_5proxy = socks_5proxy
        self.socks_5net_work = socks_5net_work

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


class LogEntry(TeaModel):
    # 交易发起方
    # log信息
    # 交易接受方
    # 交易topic
    def __init__(self, from_=None, log_data=None, to=None, topics=None):
        self.from_ = from_
        self.log_data = log_data
        self.to = to
        self.topics = []

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['from'] = self.from_
        result['log_data'] = self.log_data
        result['to'] = self.to
        result['topics'] = []
        if self.topics is not None:
            for k in self.topics:
                result['topics'].append(k)
        else:
            result['topics'] = None
        return result

    def from_map(self, map={}):
        self.from_ = map.get('from')
        self.log_data = map.get('log_data')
        self.to = map.get('to')
        self.topics = []
        if map.get('topics') is not None:
            for k in map.get('topics'):
                self.topics.append(k)
        else:
            self.topics = None
        return self


class Extension(TeaModel):
    # key
    # value
    def __init__(self, key=None, value=None):
        self.key = key
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['key'] = self.key
        result['value'] = self.value
        return result

    def from_map(self, map={}):
        self.key = map.get('key')
        self.value = map.get('value')
        return self


class UserPrice(TeaModel):
    # 具体价格
    # 相对比例
    # 对租户价格(需要和当前生效价格匹配)
    # 价格类型(数值/比例)
    # 租户用户价格包括费率
    def __init__(self, price=None, ratio=None, snapshot_tenant_price=None, user_price_type=None, user_price_with_commission=None):
        self.price = price
        self.ratio = ratio
        self.snapshot_tenant_price = snapshot_tenant_price
        self.user_price_type = user_price_type
        self.user_price_with_commission = user_price_with_commission

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['price'] = self.price
        result['ratio'] = self.ratio
        result['snapshot_tenant_price'] = self.snapshot_tenant_price
        result['user_price_type'] = self.user_price_type
        result['user_price_with_commission'] = self.user_price_with_commission
        return result

    def from_map(self, map={}):
        self.price = map.get('price')
        self.ratio = map.get('ratio')
        self.snapshot_tenant_price = map.get('snapshot_tenant_price')
        self.user_price_type = map.get('user_price_type')
        self.user_price_with_commission = map.get('user_price_with_commission')
        return self


class BlockTransaction(TeaModel):
    # 交易信息
    # 交易扩展信息
    # 交易发起方
    # 交易gas消耗
    # 分组id，暂时没用
    # 交易哈希
    # 交易随机数
    # 交易时间
    # 交易签名
    # 交易时间戳
    # 交易接收方
    # 2
    # 交易转账金额
    # 2
    def __init__(self, data=None, extension=None, from_=None, gas=None, group_id=None, hash=None, nonce=None, period=None, signature=None, timestamp=None, to=None, type=None, value=None, version=None):
        self.data = data
        self.extension = []
        self.from_ = from_
        self.gas = gas
        self.group_id = group_id
        self.hash = hash
        self.nonce = nonce
        self.period = period
        self.signature = []
        self.timestamp = timestamp
        self.to = to
        self.type = type
        self.value = value
        self.version = version

    def validate(self):
        if self.extension:
            for k in self.extension:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['data'] = self.data
        result['extension'] = []
        if self.extension is not None:
            for k in self.extension:
                result['extension'].append(k.to_map() if k else None)
        else:
            result['extension'] = None
        result['from'] = self.from_
        result['gas'] = self.gas
        result['group_id'] = self.group_id
        result['hash'] = self.hash
        result['nonce'] = self.nonce
        result['period'] = self.period
        result['signature'] = []
        if self.signature is not None:
            for k in self.signature:
                result['signature'].append(k)
        else:
            result['signature'] = None
        result['timestamp'] = self.timestamp
        result['to'] = self.to
        result['type'] = self.type
        result['value'] = self.value
        result['version'] = self.version
        return result

    def from_map(self, map={}):
        self.data = map.get('data')
        self.extension = []
        if map.get('extension') is not None:
            for k in map.get('extension'):
                temp_model = Extension()
                temp_model = temp_model.from_map(k)
                self.extension.append(temp_model)
        else:
            self.extension = None
        self.from_ = map.get('from')
        self.gas = map.get('gas')
        self.group_id = map.get('group_id')
        self.hash = map.get('hash')
        self.nonce = map.get('nonce')
        self.period = map.get('period')
        self.signature = []
        if map.get('signature') is not None:
            for k in map.get('signature'):
                self.signature.append(k)
        else:
            self.signature = None
        self.timestamp = map.get('timestamp')
        self.to = map.get('to')
        self.type = map.get('type')
        self.value = map.get('value')
        self.version = map.get('version')
        return self


class BlockReceipt(TeaModel):
    # 使用的gas数量
    # 收据log信息
    # 交易输出
    # 交易结果，0为成功
    def __init__(self, gas_used=None, logs=None, output=None, result=None):
        self.gas_used = gas_used
        self.logs = []
        self.output = output
        self.result = result

    def validate(self):
        if self.logs:
            for k in self.logs:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['gas_used'] = self.gas_used
        result['logs'] = []
        if self.logs is not None:
            for k in self.logs:
                result['logs'].append(k.to_map() if k else None)
        else:
            result['logs'] = None
        result['output'] = self.output
        result['result'] = self.result
        return result

    def from_map(self, map={}):
        self.gas_used = map.get('gas_used')
        self.logs = []
        if map.get('logs') is not None:
            for k in map.get('logs'):
                temp_model = LogEntry()
                temp_model = temp_model.from_map(k)
                self.logs.append(temp_model)
        else:
            self.logs = None
        self.output = map.get('output')
        self.result = map.get('result')
        return self


class BlockBody(TeaModel):
    # 区块共识证明(HEX)
    # 区块中交易回执列表
    # 区块中交易列表
    def __init__(self, consensus_proof=None, receipt_list=None, transaction_list=None):
        self.consensus_proof = consensus_proof
        self.receipt_list = []
        self.transaction_list = []

    def validate(self):
        if self.receipt_list:
            for k in self.receipt_list:
                if k :
                    k.validate()
        if self.transaction_list:
            for k in self.transaction_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['consensus_proof'] = self.consensus_proof
        result['receipt_list'] = []
        if self.receipt_list is not None:
            for k in self.receipt_list:
                result['receipt_list'].append(k.to_map() if k else None)
        else:
            result['receipt_list'] = None
        result['transaction_list'] = []
        if self.transaction_list is not None:
            for k in self.transaction_list:
                result['transaction_list'].append(k.to_map() if k else None)
        else:
            result['transaction_list'] = None
        return result

    def from_map(self, map={}):
        self.consensus_proof = map.get('consensus_proof')
        self.receipt_list = []
        if map.get('receipt_list') is not None:
            for k in map.get('receipt_list'):
                temp_model = BlockReceipt()
                temp_model = temp_model.from_map(k)
                self.receipt_list.append(temp_model)
        else:
            self.receipt_list = None
        self.transaction_list = []
        if map.get('transaction_list') is not None:
            for k in map.get('transaction_list'):
                temp_model = BlockTransaction()
                temp_model = temp_model.from_map(k)
                self.transaction_list.append(temp_model)
        else:
            self.transaction_list = None
        return self


class Provision(TeaModel):
    # 授信上限
    # 授信已使用
    # 币种
    # 余额
    def __init__(self, credit_max=None, credit_used=None, currency=None, debit=None):
        self.credit_max = credit_max
        self.credit_used = credit_used
        self.currency = currency
        self.debit = debit

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['credit_max'] = self.credit_max
        result['credit_used'] = self.credit_used
        result['currency'] = self.currency
        result['debit'] = self.debit
        return result

    def from_map(self, map={}):
        self.credit_max = map.get('credit_max')
        self.credit_used = map.get('credit_used')
        self.currency = map.get('currency')
        self.debit = map.get('debit')
        return self


class EquityExtInfo(TeaModel):
    # 费率
    # 指定兑换日限制已使用
    # 指定兑换月限制已使用
    # 权益开放的租户ID
    # 指定日期
    # 权益对租户价格
    # 租户价格包括费率
    # 授权给租户用户的价格
    def __init__(self, commission=None, limit_per_day_used=None, limit_per_month_used=None, open_to_tenant_id=None, target_date=None, tenant_price=None, tenant_price_with_commission=None, tenant_user_price=None):
        self.commission = commission
        self.limit_per_day_used = limit_per_day_used
        self.limit_per_month_used = limit_per_month_used
        self.open_to_tenant_id = open_to_tenant_id
        self.target_date = target_date
        self.tenant_price = tenant_price
        self.tenant_price_with_commission = tenant_price_with_commission
        self.tenant_user_price = tenant_user_price

    def validate(self):
        if self.tenant_user_price:
            self.tenant_user_price.validate()

    def to_map(self):
        result = {}
        result['commission'] = self.commission
        result['limit_per_day_used'] = self.limit_per_day_used
        result['limit_per_month_used'] = self.limit_per_month_used
        result['open_to_tenant_id'] = self.open_to_tenant_id
        result['target_date'] = self.target_date
        result['tenant_price'] = self.tenant_price
        result['tenant_price_with_commission'] = self.tenant_price_with_commission
        if self.tenant_user_price is not None:
            result['tenant_user_price'] = self.tenant_user_price.to_map()
        else:
            result['tenant_user_price'] = None
        return result

    def from_map(self, map={}):
        self.commission = map.get('commission')
        self.limit_per_day_used = map.get('limit_per_day_used')
        self.limit_per_month_used = map.get('limit_per_month_used')
        self.open_to_tenant_id = map.get('open_to_tenant_id')
        self.target_date = map.get('target_date')
        self.tenant_price = map.get('tenant_price')
        self.tenant_price_with_commission = map.get('tenant_price_with_commission')
        if map.get('tenant_user_price') is not None:
            temp_model = UserPrice()
            self.tenant_user_price = temp_model.from_map(map['tenant_user_price'])
        else:
            self.tenant_user_price = None
        return self


class EquityDetail(TeaModel):
    # 权益描述
    # 权益描述图片OSS地址（分号;分隔）
    # 权益ID
    # 权益名称
    # 权益类型
    # 权益面值(元)
    # 权益主图片OSS地址（分号;分隔）
    # 对客价(元)
    # 权益SKU
    def __init__(self, description=None, desc_images=None, equity_id=None, equity_name=None, equity_type=None, equity_value=None, images=None, price=None, sku_id=None):
        self.description = description
        self.desc_images = desc_images
        self.equity_id = equity_id
        self.equity_name = equity_name
        self.equity_type = equity_type
        self.equity_value = equity_value
        self.images = images
        self.price = price
        self.sku_id = sku_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['description'] = self.description
        result['desc_images'] = self.desc_images
        result['equity_id'] = self.equity_id
        result['equity_name'] = self.equity_name
        result['equity_type'] = self.equity_type
        result['equity_value'] = self.equity_value
        result['images'] = self.images
        result['price'] = self.price
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.description = map.get('description')
        self.desc_images = map.get('desc_images')
        self.equity_id = map.get('equity_id')
        self.equity_name = map.get('equity_name')
        self.equity_type = map.get('equity_type')
        self.equity_value = map.get('equity_value')
        self.images = map.get('images')
        self.price = map.get('price')
        self.sku_id = map.get('sku_id')
        return self


class AssetExtInfo(TeaModel):
    # 发放账户余额
    # 发放账户归属租户ID
    # 用户账户余额
    # 用户ID
    def __init__(self, dispense_balance=None, dispense_tenant_id=None, user_credit_balance=None, user_id=None):
        self.dispense_balance = dispense_balance
        self.dispense_tenant_id = dispense_tenant_id
        self.user_credit_balance = user_credit_balance
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['dispense_balance'] = self.dispense_balance
        result['dispense_tenant_id'] = self.dispense_tenant_id
        result['user_credit_balance'] = self.user_credit_balance
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.dispense_balance = map.get('dispense_balance')
        self.dispense_tenant_id = map.get('dispense_tenant_id')
        self.user_credit_balance = map.get('user_credit_balance')
        self.user_id = map.get('user_id')
        return self


class BlockHeader(TeaModel):
    # gas总消耗
    # 十六进制区块哈希值
    # log bloom
    # 区块高度
    # 十六进制区块父hash
    # 交易单据树根
    # 状态树根
    # 区块时间戳
    # 十六进制交易merkle树根
    # 区块版本
    def __init__(self, gas_used=None, hash=None, log_bloom=None, number=None, parent_hash=None, receipt_root=None, state_root=None, timestamp=None, transaction_root=None, version=None):
        self.gas_used = gas_used
        self.hash = hash
        self.log_bloom = log_bloom
        self.number = number
        self.parent_hash = parent_hash
        self.receipt_root = receipt_root
        self.state_root = state_root
        self.timestamp = timestamp
        self.transaction_root = transaction_root
        self.version = version

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['gas_used'] = self.gas_used
        result['hash'] = self.hash
        result['log_bloom'] = self.log_bloom
        result['number'] = self.number
        result['parent_hash'] = self.parent_hash
        result['receipt_root'] = self.receipt_root
        result['state_root'] = self.state_root
        result['timestamp'] = self.timestamp
        result['transaction_root'] = self.transaction_root
        result['version'] = self.version
        return result

    def from_map(self, map={}):
        self.gas_used = map.get('gas_used')
        self.hash = map.get('hash')
        self.log_bloom = map.get('log_bloom')
        self.number = map.get('number')
        self.parent_hash = map.get('parent_hash')
        self.receipt_root = map.get('receipt_root')
        self.state_root = map.get('state_root')
        self.timestamp = map.get('timestamp')
        self.transaction_root = map.get('transaction_root')
        self.version = map.get('version')
        return self


class Card(TeaModel):
    # 计算理论上应该变为的状态
    # 卡密ID
    # 充值时间
    # 数量
    # 卡密创建时间
    # 创建卡密时的交易hash
    # 脱敏手机信息
    # 附加信息
    # 最小单位数量
    # 公钥
    # 状态
    # 公钥信息
    # 卡密在该时间后有效
    # 卡密在该时间前有效
    # 有效天数
    # 价值
    # 卡密版本
    def __init__(self, cal_status=None, card_id=None, charge_time=None, count_of_min_unit=None, create_time=None, create_tx_hash=None, desensitized_uid=None, ext_info=None, min_unit=None, public_key=None, status=None, uid_public_key=None, valid_after=None, valid_before=None, valid_days=None, value=None, version=None):
        self.cal_status = cal_status
        self.card_id = card_id
        self.charge_time = charge_time
        self.count_of_min_unit = count_of_min_unit
        self.create_time = create_time
        self.create_tx_hash = create_tx_hash
        self.desensitized_uid = desensitized_uid
        self.ext_info = ext_info
        self.min_unit = min_unit
        self.public_key = public_key
        self.status = status
        self.uid_public_key = uid_public_key
        self.valid_after = valid_after
        self.valid_before = valid_before
        self.valid_days = valid_days
        self.value = value
        self.version = version

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cal_status'] = self.cal_status
        result['card_id'] = self.card_id
        result['charge_time'] = self.charge_time
        result['count_of_min_unit'] = self.count_of_min_unit
        result['create_time'] = self.create_time
        result['create_tx_hash'] = self.create_tx_hash
        result['desensitized_uid'] = self.desensitized_uid
        result['ext_info'] = self.ext_info
        result['min_unit'] = self.min_unit
        result['public_key'] = self.public_key
        result['status'] = self.status
        result['uid_public_key'] = self.uid_public_key
        result['valid_after'] = self.valid_after
        result['valid_before'] = self.valid_before
        result['valid_days'] = self.valid_days
        result['value'] = self.value
        result['version'] = self.version
        return result

    def from_map(self, map={}):
        self.cal_status = map.get('cal_status')
        self.card_id = map.get('card_id')
        self.charge_time = map.get('charge_time')
        self.count_of_min_unit = map.get('count_of_min_unit')
        self.create_time = map.get('create_time')
        self.create_tx_hash = map.get('create_tx_hash')
        self.desensitized_uid = map.get('desensitized_uid')
        self.ext_info = map.get('ext_info')
        self.min_unit = map.get('min_unit')
        self.public_key = map.get('public_key')
        self.status = map.get('status')
        self.uid_public_key = map.get('uid_public_key')
        self.valid_after = map.get('valid_after')
        self.valid_before = map.get('valid_before')
        self.valid_days = map.get('valid_days')
        self.value = map.get('value')
        self.version = map.get('version')
        return self


class SKUItem(TeaModel):
    # 集分宝销售费率
    # 包含集分宝个数
    # 商品ID
    # 商品名称
    # 商品面值（单位：元）
    # 商品状态：0可用，1冻结，2下线
    def __init__(self, rate=None, sku_amount=None, sku_id=None, sku_name=None, sku_price=None, status=None):
        self.rate = rate
        self.sku_amount = sku_amount
        self.sku_id = sku_id
        self.sku_name = sku_name
        self.sku_price = sku_price
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['rate'] = self.rate
        result['sku_amount'] = self.sku_amount
        result['sku_id'] = self.sku_id
        result['sku_name'] = self.sku_name
        result['sku_price'] = self.sku_price
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.rate = map.get('rate')
        self.sku_amount = map.get('sku_amount')
        self.sku_id = map.get('sku_id')
        self.sku_name = map.get('sku_name')
        self.sku_price = map.get('sku_price')
        self.status = map.get('status')
        return self


class Commission(TeaModel):
    # 手续费生效时间（时间戳 ms）
    # 手续费
    # 手续费结束时间
    # 要更新的手续费状态
    def __init__(self, begin_time=None, commission=None, end_time=None, status=None):
        self.begin_time = begin_time
        self.commission = commission
        self.end_time = end_time
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['begin_time'] = self.begin_time
        result['commission'] = self.commission
        result['end_time'] = self.end_time
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.begin_time = map.get('begin_time')
        self.commission = map.get('commission')
        self.end_time = map.get('end_time')
        self.status = map.get('status')
        return self


class MultiURL(TeaModel):
    # 上传的图片正常大小
    # style150
    # style200
    # style70
    def __init__(self, normal=None, style_150=None, style_200=None, style_70=None):
        self.normal = normal
        self.style_150 = style_150
        self.style_200 = style_200
        self.style_70 = style_70

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['normal'] = self.normal
        result['style_150'] = self.style_150
        result['style_200'] = self.style_200
        result['style_70'] = self.style_70
        return result

    def from_map(self, map={}):
        self.normal = map.get('normal')
        self.style_150 = map.get('style_150')
        self.style_200 = map.get('style_200')
        self.style_70 = map.get('style_70')
        return self


class EInstruction(TeaModel):
    # 资产ID
    # 资产的汇率
    # 资产扣减数量(单位:个)
    # 扣减商户备付金授信额(单位:元)
    # 扣减商户备付金余额(单位:元)
    # 被扣减备付金的租户ID
    # 权益ID
    # 权益名称
    # 权益对用户价格(单位:元)
    # 权益面值(单位:元)
    # 附言Deliver/Complete/OutOfStore/WriteOff)
    # 发起操作的租户ID
    # 业务交易ID
    # 对换单流水状态：
    # 0        // 权益兑换单创建
    # 1        // 权益兑换单接单
    # 2        // 权益兑换单发货
    # 3        // 权益兑换单确认收货
    # 4        // 权益兑换单缺货
    # 5        // 权益兑换单核销
    # 权益归属租户ID
    # 交易时间戳
    # 兑换类型(商户身份/用户身份)
    # 用户身份兑换/商户兑换的受益用户
    def __init__(self, asset_id=None, asset_rate=None, deduct_asset_amount=None, deduct_credit_amount=None, deduct_debit_amount=None, deduct_tenant_id=None, equity_id=None, equity_name=None, equity_price=None, equity_value=None, memo=None, opt_tenant_id=None, out_tx_id=None, status=None, tenant_id=None, time_stamp=None, type=None, user_id=None):
        self.asset_id = asset_id
        self.asset_rate = asset_rate
        self.deduct_asset_amount = deduct_asset_amount
        self.deduct_credit_amount = deduct_credit_amount
        self.deduct_debit_amount = deduct_debit_amount
        self.deduct_tenant_id = deduct_tenant_id
        self.equity_id = equity_id
        self.equity_name = equity_name
        self.equity_price = equity_price
        self.equity_value = equity_value
        self.memo = memo
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id
        self.status = status
        self.tenant_id = tenant_id
        self.time_stamp = time_stamp
        self.type = type
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['asset_id'] = self.asset_id
        result['asset_rate'] = self.asset_rate
        result['deduct_asset_amount'] = self.deduct_asset_amount
        result['deduct_credit_amount'] = self.deduct_credit_amount
        result['deduct_debit_amount'] = self.deduct_debit_amount
        result['deduct_tenant_id'] = self.deduct_tenant_id
        result['equity_id'] = self.equity_id
        result['equity_name'] = self.equity_name
        result['equity_price'] = self.equity_price
        result['equity_value'] = self.equity_value
        result['memo'] = self.memo
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        result['time_stamp'] = self.time_stamp
        result['type'] = self.type
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.asset_id = map.get('asset_id')
        self.asset_rate = map.get('asset_rate')
        self.deduct_asset_amount = map.get('deduct_asset_amount')
        self.deduct_credit_amount = map.get('deduct_credit_amount')
        self.deduct_debit_amount = map.get('deduct_debit_amount')
        self.deduct_tenant_id = map.get('deduct_tenant_id')
        self.equity_id = map.get('equity_id')
        self.equity_name = map.get('equity_name')
        self.equity_price = map.get('equity_price')
        self.equity_value = map.get('equity_value')
        self.memo = map.get('memo')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        self.time_stamp = map.get('time_stamp')
        self.type = map.get('type')
        self.user_id = map.get('user_id')
        return self


class APIWhiteListInfo(TeaModel):
    # 链ID
    # 扩展字段
    # 权限级别，暂时不用
    # 租户ID
    # 更新时间
    def __init__(self, chain_id=None, extension=None, level=None, tenant_id=None, update_time=None):
        self.chain_id = chain_id
        self.extension = extension
        self.level = level
        self.tenant_id = tenant_id
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['extension'] = self.extension
        result['level'] = self.level
        result['tenant_id'] = self.tenant_id
        result['update_time'] = self.update_time
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.extension = map.get('extension')
        self.level = map.get('level')
        self.tenant_id = map.get('tenant_id')
        self.update_time = map.get('update_time')
        return self


class Transaction(TeaModel):
    # 交易数据，转换位十六进制
    # 卡密管理员链上ID，64位十六进制。
    # 交易hash，十六进制编码
    # 交易随机数
    # 交易时间
    # from账户对应的公钥，128位十六进制。
    # 交易签名，十六进制编码
    # 交易时间戳
    # 交易目标地址，64位十六进制。
    def __init__(self, data=None, from_=None, hash=None, nonce=None, period=None, public_key=None, signature=None, timestamp=None, to=None):
        self.data = data
        self.from_ = from_
        self.hash = hash
        self.nonce = nonce
        self.period = period
        self.public_key = public_key
        self.signature = signature
        self.timestamp = timestamp
        self.to = to

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['data'] = self.data
        result['from'] = self.from_
        result['hash'] = self.hash
        result['nonce'] = self.nonce
        result['period'] = self.period
        result['public_key'] = self.public_key
        result['signature'] = self.signature
        result['timestamp'] = self.timestamp
        result['to'] = self.to
        return result

    def from_map(self, map={}):
        self.data = map.get('data')
        self.from_ = map.get('from')
        self.hash = map.get('hash')
        self.nonce = map.get('nonce')
        self.period = map.get('period')
        self.public_key = map.get('public_key')
        self.signature = map.get('signature')
        self.timestamp = map.get('timestamp')
        self.to = map.get('to')
        return self


class DiscreteValue(TeaModel):
    # 序号
    # 文本信息
    # 文本值
    def __init__(self, sort_id=None, text=None, value=None):
        self.sort_id = sort_id
        self.text = text
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['sort_id'] = self.sort_id
        result['text'] = self.text
        result['value'] = self.value
        return result

    def from_map(self, map={}):
        self.sort_id = map.get('sort_id')
        self.text = map.get('text')
        self.value = map.get('value')
        return self


class Equity(TeaModel):
    # 权益管理员ID
    # 权益授权类型
    # 权益锚定币种
    # 权益默认价格
    # 权益描述
    # 权益描述图片OSS地址 分号分隔
    # 权益附属信息
    # 权益ID
    # 权益名称
    # 商品类型，详见数字商品公约https://tech.antfin.com/docs/2/163896
    # 权益主图片OSS地址 分号;分隔
    # 是否为公开权益
    # 商户每日兑换上限
    # 商户每月兑换上限
    # 用户每日兑换上限
    # 用户每月兑换上限
    # 附言
    # 权益状态
    # 租户ID
    # 权益库存
    # 权益使用有效期右闭区间
    # 权益使用有效期左闭区间
    # 权益兑换有效期右闭区间
    # 权益兑换有效期左闭区间
    # 权益面值
    def __init__(self, admin_id=None, auth_type=None, currency=None, default_price=None, description=None, desc_images=None, equity_ext_info=None, equity_id=None, equity_name=None, equity_type=None, images=None, is_public=None, limit_per_merchant_and_day=None, limit_per_merchant_and_month=None, limit_per_user_and_day=None, limit_per_user_and_month=None, memo=None, status=None, tenant_id=None, total_count=None, use_valid_not_after=None, use_valid_not_before=None, valid_not_after=None, valid_not_before=None, value=None):
        self.admin_id = admin_id
        self.auth_type = auth_type
        self.currency = currency
        self.default_price = default_price
        self.description = description
        self.desc_images = desc_images
        self.equity_ext_info = equity_ext_info
        self.equity_id = equity_id
        self.equity_name = equity_name
        self.equity_type = equity_type
        self.images = images
        self.is_public = is_public
        self.limit_per_merchant_and_day = limit_per_merchant_and_day
        self.limit_per_merchant_and_month = limit_per_merchant_and_month
        self.limit_per_user_and_day = limit_per_user_and_day
        self.limit_per_user_and_month = limit_per_user_and_month
        self.memo = memo
        self.status = status
        self.tenant_id = tenant_id
        self.total_count = total_count
        self.use_valid_not_after = use_valid_not_after
        self.use_valid_not_before = use_valid_not_before
        self.valid_not_after = valid_not_after
        self.valid_not_before = valid_not_before
        self.value = value

    def validate(self):
        if self.equity_ext_info:
            self.equity_ext_info.validate()

    def to_map(self):
        result = {}
        result['admin_id'] = self.admin_id
        result['auth_type'] = self.auth_type
        result['currency'] = self.currency
        result['default_price'] = self.default_price
        result['description'] = self.description
        result['desc_images'] = self.desc_images
        if self.equity_ext_info is not None:
            result['equity_ext_info'] = self.equity_ext_info.to_map()
        else:
            result['equity_ext_info'] = None
        result['equity_id'] = self.equity_id
        result['equity_name'] = self.equity_name
        result['equity_type'] = self.equity_type
        result['images'] = self.images
        result['is_public'] = self.is_public
        result['limit_per_merchant_and_day'] = self.limit_per_merchant_and_day
        result['limit_per_merchant_and_month'] = self.limit_per_merchant_and_month
        result['limit_per_user_and_day'] = self.limit_per_user_and_day
        result['limit_per_user_and_month'] = self.limit_per_user_and_month
        result['memo'] = self.memo
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        result['total_count'] = self.total_count
        result['use_valid_not_after'] = self.use_valid_not_after
        result['use_valid_not_before'] = self.use_valid_not_before
        result['valid_not_after'] = self.valid_not_after
        result['valid_not_before'] = self.valid_not_before
        result['value'] = self.value
        return result

    def from_map(self, map={}):
        self.admin_id = map.get('admin_id')
        self.auth_type = map.get('auth_type')
        self.currency = map.get('currency')
        self.default_price = map.get('default_price')
        self.description = map.get('description')
        self.desc_images = map.get('desc_images')
        if map.get('equity_ext_info') is not None:
            temp_model = EquityExtInfo()
            self.equity_ext_info = temp_model.from_map(map['equity_ext_info'])
        else:
            self.equity_ext_info = None
        self.equity_id = map.get('equity_id')
        self.equity_name = map.get('equity_name')
        self.equity_type = map.get('equity_type')
        self.images = map.get('images')
        self.is_public = map.get('is_public')
        self.limit_per_merchant_and_day = map.get('limit_per_merchant_and_day')
        self.limit_per_merchant_and_month = map.get('limit_per_merchant_and_month')
        self.limit_per_user_and_day = map.get('limit_per_user_and_day')
        self.limit_per_user_and_month = map.get('limit_per_user_and_month')
        self.memo = map.get('memo')
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        self.total_count = map.get('total_count')
        self.use_valid_not_after = map.get('use_valid_not_after')
        self.use_valid_not_before = map.get('use_valid_not_before')
        self.valid_not_after = map.get('valid_not_after')
        self.valid_not_before = map.get('valid_not_before')
        self.value = map.get('value')
        return self


class Block(TeaModel):
    # 区块体
    # 区块头
    def __init__(self, body=None, header=None):
        self.body = body
        self.header = header

    def validate(self):
        if self.body:
            self.body.validate()
        if self.header:
            self.header.validate()

    def to_map(self):
        result = {}
        if self.body is not None:
            result['body'] = self.body.to_map()
        else:
            result['body'] = None
        if self.header is not None:
            result['header'] = self.header.to_map()
        else:
            result['header'] = None
        return result

    def from_map(self, map={}):
        if map.get('body') is not None:
            temp_model = BlockBody()
            self.body = temp_model.from_map(map['body'])
        else:
            self.body = None
        if map.get('header') is not None:
            temp_model = BlockHeader()
            self.header = temp_model.from_map(map['header'])
        else:
            self.header = None
        return self


class OpenedEquity(TeaModel):
    # 商户管理员ID
    # 授权类型
    # 币种
    # 默认价格
    # 权益详情
    # 权益详情图片
    # 权益ID
    # 权益名称
    # 权益类型
    # 权益主图片
    # 是否是公开权益
    # 每日商户对换限制
    # 每月商户对换限制
    # 每日用户对换限制
    # 每月用户对换限制
    # 权益附言
    # 被授权的租户ID
    # 权益状态
    # 租户ID
    # 授权价格
    # 库存
    # 可用右区间
    # 可用左区间
    # 有效右区间
    # 有效左时间
    # 价值
    def __init__(self, admin_id=None, auth_type=None, currency=None, default_price=None, description=None, desc_images=None, equity_d=None, equity_name=None, equity_type=None, images=None, is_public=None, limit_per_merchant_and_day=None, limit_per_merchant_and_month=None, limit_per_user_and_day=None, limit_per_user_and_month=None, memo=None, open_to_tenant_id=None, status=None, tenant_id=None, tenant_price=None, total_count=None, use_valid_not_after=None, use_valid_not_before=None, valid_not_after=None, valid_not_before=None, value=None):
        self.admin_id = admin_id
        self.auth_type = auth_type
        self.currency = currency
        self.default_price = default_price
        self.description = description
        self.desc_images = desc_images
        self.equity_d = equity_d
        self.equity_name = equity_name
        self.equity_type = equity_type
        self.images = images
        self.is_public = is_public
        self.limit_per_merchant_and_day = limit_per_merchant_and_day
        self.limit_per_merchant_and_month = limit_per_merchant_and_month
        self.limit_per_user_and_day = limit_per_user_and_day
        self.limit_per_user_and_month = limit_per_user_and_month
        self.memo = memo
        self.open_to_tenant_id = open_to_tenant_id
        self.status = status
        self.tenant_id = tenant_id
        self.tenant_price = tenant_price
        self.total_count = total_count
        self.use_valid_not_after = use_valid_not_after
        self.use_valid_not_before = use_valid_not_before
        self.valid_not_after = valid_not_after
        self.valid_not_before = valid_not_before
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['admin_id'] = self.admin_id
        result['auth_type'] = self.auth_type
        result['currency'] = self.currency
        result['default_price'] = self.default_price
        result['description'] = self.description
        result['desc_images'] = self.desc_images
        result['equity_d'] = self.equity_d
        result['equity_name'] = self.equity_name
        result['equity_type'] = self.equity_type
        result['images'] = self.images
        result['is_public'] = self.is_public
        result['limit_per_merchant_and_day'] = self.limit_per_merchant_and_day
        result['limit_per_merchant_and_month'] = self.limit_per_merchant_and_month
        result['limit_per_user_and_day'] = self.limit_per_user_and_day
        result['limit_per_user_and_month'] = self.limit_per_user_and_month
        result['memo'] = self.memo
        result['open_to_tenant_id'] = self.open_to_tenant_id
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        result['tenant_price'] = self.tenant_price
        result['total_count'] = self.total_count
        result['use_valid_not_after'] = self.use_valid_not_after
        result['use_valid_not_before'] = self.use_valid_not_before
        result['valid_not_after'] = self.valid_not_after
        result['valid_not_before'] = self.valid_not_before
        result['value'] = self.value
        return result

    def from_map(self, map={}):
        self.admin_id = map.get('admin_id')
        self.auth_type = map.get('auth_type')
        self.currency = map.get('currency')
        self.default_price = map.get('default_price')
        self.description = map.get('description')
        self.desc_images = map.get('desc_images')
        self.equity_d = map.get('equity_d')
        self.equity_name = map.get('equity_name')
        self.equity_type = map.get('equity_type')
        self.images = map.get('images')
        self.is_public = map.get('is_public')
        self.limit_per_merchant_and_day = map.get('limit_per_merchant_and_day')
        self.limit_per_merchant_and_month = map.get('limit_per_merchant_and_month')
        self.limit_per_user_and_day = map.get('limit_per_user_and_day')
        self.limit_per_user_and_month = map.get('limit_per_user_and_month')
        self.memo = map.get('memo')
        self.open_to_tenant_id = map.get('open_to_tenant_id')
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        self.tenant_price = map.get('tenant_price')
        self.total_count = map.get('total_count')
        self.use_valid_not_after = map.get('use_valid_not_after')
        self.use_valid_not_before = map.get('use_valid_not_before')
        self.valid_not_after = map.get('valid_not_after')
        self.valid_not_before = map.get('valid_not_before')
        self.value = map.get('value')
        return self


class Asset(TeaModel):
    # 资产管理员ID
    # 资产附属信息
    # 资产ID
    # 资产名称
    # 资产汇率
    # 币种
    # 发行账户余额
    # 过期回收账户余额
    # 支付收款账户余额
    # 中继账户余额
    # 资产状态
    # 租户ID
    # 资产总发行量
    def __init__(self, admin_id=None, asset_ext_info=None, asset_id=None, asset_name=None, asset_rate=None, currency=None, issue_account_balance=None, overdue_recovery_account_balance=None, receive_payment_account_balance=None, relay_account_balance=None, status=None, tenant_id=None, total_issue_balance=None):
        self.admin_id = admin_id
        self.asset_ext_info = asset_ext_info
        self.asset_id = asset_id
        self.asset_name = asset_name
        self.asset_rate = asset_rate
        self.currency = currency
        self.issue_account_balance = issue_account_balance
        self.overdue_recovery_account_balance = overdue_recovery_account_balance
        self.receive_payment_account_balance = receive_payment_account_balance
        self.relay_account_balance = relay_account_balance
        self.status = status
        self.tenant_id = tenant_id
        self.total_issue_balance = total_issue_balance

    def validate(self):
        if self.asset_ext_info:
            self.asset_ext_info.validate()

    def to_map(self):
        result = {}
        result['admin_id'] = self.admin_id
        if self.asset_ext_info is not None:
            result['asset_ext_info'] = self.asset_ext_info.to_map()
        else:
            result['asset_ext_info'] = None
        result['asset_id'] = self.asset_id
        result['asset_name'] = self.asset_name
        result['asset_rate'] = self.asset_rate
        result['currency'] = self.currency
        result['issue_account_balance'] = self.issue_account_balance
        result['overdue_recovery_account_balance'] = self.overdue_recovery_account_balance
        result['receive_payment_account_balance'] = self.receive_payment_account_balance
        result['relay_account_balance'] = self.relay_account_balance
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        result['total_issue_balance'] = self.total_issue_balance
        return result

    def from_map(self, map={}):
        self.admin_id = map.get('admin_id')
        if map.get('asset_ext_info') is not None:
            temp_model = AssetExtInfo()
            self.asset_ext_info = temp_model.from_map(map['asset_ext_info'])
        else:
            self.asset_ext_info = None
        self.asset_id = map.get('asset_id')
        self.asset_name = map.get('asset_name')
        self.asset_rate = map.get('asset_rate')
        self.currency = map.get('currency')
        self.issue_account_balance = map.get('issue_account_balance')
        self.overdue_recovery_account_balance = map.get('overdue_recovery_account_balance')
        self.receive_payment_account_balance = map.get('receive_payment_account_balance')
        self.relay_account_balance = map.get('relay_account_balance')
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        self.total_issue_balance = map.get('total_issue_balance')
        return self


class DelegateRelationInfo(TeaModel):
    # 被代理的租户ID
    # 扩展字段
    # 状态
    # 被授权的租户ID
    # 更新时间
    def __init__(self, delegated_tenant_id=None, extension=None, status=None, tenant_id=None, update_time=None):
        self.delegated_tenant_id = delegated_tenant_id
        self.extension = extension
        self.status = status
        self.tenant_id = tenant_id
        self.update_time = update_time

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['extension'] = self.extension
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        result['update_time'] = self.update_time
        return result

    def from_map(self, map={}):
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.extension = map.get('extension')
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        self.update_time = map.get('update_time')
        return self


class MerchantBudget(TeaModel):
    # 预算库代码
    # 预算库描述
    # 预算库截止时间
    # 预算库启用时间
    # 积分库代码
    def __init__(self, budget_code=None, budget_desc=None, budget_end_time=None, budget_start_time=None, point_lib_code=None):
        self.budget_code = budget_code
        self.budget_desc = budget_desc
        self.budget_end_time = budget_end_time
        self.budget_start_time = budget_start_time
        self.point_lib_code = point_lib_code

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['budget_code'] = self.budget_code
        result['budget_desc'] = self.budget_desc
        result['budget_end_time'] = self.budget_end_time
        result['budget_start_time'] = self.budget_start_time
        result['point_lib_code'] = self.point_lib_code
        return result

    def from_map(self, map={}):
        self.budget_code = map.get('budget_code')
        self.budget_desc = map.get('budget_desc')
        self.budget_end_time = map.get('budget_end_time')
        self.budget_start_time = map.get('budget_start_time')
        self.point_lib_code = map.get('point_lib_code')
        return self


class ExchangeableEquityList(TeaModel):
    # 页面上数据在总数据中的结束位置（第几个数据）
    # 权益信息列表
    # 第一页页码
    # 是否有下一页
    # 是否有前一页
    # 是否第一页
    # 是否最后一页
    # 最后一页页码
    # 下一页页码
    # 排序规则
    # 可兑换的权益总页数
    # 当前页码
    # 页面大小
    # 前一页页码
    # 页面中实际数量
    # 页面上数据在总数据中的开始位置（第几个数据）
    # 可兑换的权益总数
    def __init__(self, end_row=None, equity_list=None, first_page=None, has_next_page=None, has_previous_page=None, is_first_page=None, is_last_page=None, last_page=None, next_page=None, order_by=None, pages=None, page_number=None, page_size=None, pre_page=None, size=None, start_row=None, total=None):
        self.end_row = end_row
        self.equity_list = []
        self.first_page = first_page
        self.has_next_page = has_next_page
        self.has_previous_page = has_previous_page
        self.is_first_page = is_first_page
        self.is_last_page = is_last_page
        self.last_page = last_page
        self.next_page = next_page
        self.order_by = order_by
        self.pages = pages
        self.page_number = page_number
        self.page_size = page_size
        self.pre_page = pre_page
        self.size = size
        self.start_row = start_row
        self.total = total

    def validate(self):
        if self.equity_list:
            for k in self.equity_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['end_row'] = self.end_row
        result['equity_list'] = []
        if self.equity_list is not None:
            for k in self.equity_list:
                result['equity_list'].append(k.to_map() if k else None)
        else:
            result['equity_list'] = None
        result['first_page'] = self.first_page
        result['has_next_page'] = self.has_next_page
        result['has_previous_page'] = self.has_previous_page
        result['is_first_page'] = self.is_first_page
        result['is_last_page'] = self.is_last_page
        result['last_page'] = self.last_page
        result['next_page'] = self.next_page
        result['order_by'] = self.order_by
        result['pages'] = self.pages
        result['page_number'] = self.page_number
        result['page_size'] = self.page_size
        result['pre_page'] = self.pre_page
        result['size'] = self.size
        result['start_row'] = self.start_row
        result['total'] = self.total
        return result

    def from_map(self, map={}):
        self.end_row = map.get('end_row')
        self.equity_list = []
        if map.get('equity_list') is not None:
            for k in map.get('equity_list'):
                temp_model = EquityDetail()
                temp_model = temp_model.from_map(k)
                self.equity_list.append(temp_model)
        else:
            self.equity_list = None
        self.first_page = map.get('first_page')
        self.has_next_page = map.get('has_next_page')
        self.has_previous_page = map.get('has_previous_page')
        self.is_first_page = map.get('is_first_page')
        self.is_last_page = map.get('is_last_page')
        self.last_page = map.get('last_page')
        self.next_page = map.get('next_page')
        self.order_by = map.get('order_by')
        self.pages = map.get('pages')
        self.page_number = map.get('page_number')
        self.page_size = map.get('page_size')
        self.pre_page = map.get('pre_page')
        self.size = map.get('size')
        self.start_row = map.get('start_row')
        self.total = map.get('total')
        return self


class CommissionResult(TeaModel):
    # 手续费生效时间
    # 手续费
    # 手续费信息ID
    # 手续费失效时间
    # 商品类型
    # 手续费状态（0可用，1停用，2禁用）
    # 租户ID
    def __init__(self, begin_time=None, commission=None, commission_id=None, end_time=None, equity_type=None, status=None, tenant_id=None):
        self.begin_time = begin_time
        self.commission = commission
        self.commission_id = commission_id
        self.end_time = end_time
        self.equity_type = equity_type
        self.status = status
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['begin_time'] = self.begin_time
        result['commission'] = self.commission
        result['commission_id'] = self.commission_id
        result['end_time'] = self.end_time
        result['equity_type'] = self.equity_type
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.begin_time = map.get('begin_time')
        self.commission = map.get('commission')
        self.commission_id = map.get('commission_id')
        self.end_time = map.get('end_time')
        self.equity_type = map.get('equity_type')
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        return self


class UserPriceEquity(TeaModel):
    # 权益提供商商户ID
    # 授权类型
    # 币种
    # 默认价格
    # 权益描述
    # 权益描述图片
    # 权益ID
    # 权益名称
    # 权益类型
    # 权益主图片
    # 是否公开权益
    # 商户每日兑换上线
    # 商户每月兑换上线
    # 用户每日兑换上线
    # 用户每月兑换上限
    # 权益附言信息
    # 授权的租户ID
    # 用户价格
    # 用户价格比例
    # 快照租户价格
    # 权益状态
    # 权益提供商租户ID
    # 权益库存
    # 用户价格类型
    # 可用右区间
    # 可用左区间
    # 有效右区间
    # 有效左区间
    # 价值
    def __init__(self, admin_id=None, auth_type=None, currency=None, default_price=None, description=None, desc_images=None, equity_d=None, equity_name=None, equity_type=None, images=None, is_public=None, limit_per_merchant_and_day=None, limit_per_merchant_and_month=None, limit_per_user_and_day=None, limit_per_user_and_month=None, memo=None, open_to_tenant_id=None, price=None, ratio=None, snapshot_tenant_price=None, status=None, tenant_id=None, total_count=None, user_price_type=None, use_valid_not_after=None, use_valid_not_before=None, valid_not_after=None, valid_not_before=None, value=None):
        self.admin_id = admin_id
        self.auth_type = auth_type
        self.currency = currency
        self.default_price = default_price
        self.description = description
        self.desc_images = desc_images
        self.equity_d = equity_d
        self.equity_name = equity_name
        self.equity_type = equity_type
        self.images = images
        self.is_public = is_public
        self.limit_per_merchant_and_day = limit_per_merchant_and_day
        self.limit_per_merchant_and_month = limit_per_merchant_and_month
        self.limit_per_user_and_day = limit_per_user_and_day
        self.limit_per_user_and_month = limit_per_user_and_month
        self.memo = memo
        self.open_to_tenant_id = open_to_tenant_id
        self.price = price
        self.ratio = ratio
        self.snapshot_tenant_price = snapshot_tenant_price
        self.status = status
        self.tenant_id = tenant_id
        self.total_count = total_count
        self.user_price_type = user_price_type
        self.use_valid_not_after = use_valid_not_after
        self.use_valid_not_before = use_valid_not_before
        self.valid_not_after = valid_not_after
        self.valid_not_before = valid_not_before
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['admin_id'] = self.admin_id
        result['auth_type'] = self.auth_type
        result['currency'] = self.currency
        result['default_price'] = self.default_price
        result['description'] = self.description
        result['desc_images'] = self.desc_images
        result['equity_d'] = self.equity_d
        result['equity_name'] = self.equity_name
        result['equity_type'] = self.equity_type
        result['images'] = self.images
        result['is_public'] = self.is_public
        result['limit_per_merchant_and_day'] = self.limit_per_merchant_and_day
        result['limit_per_merchant_and_month'] = self.limit_per_merchant_and_month
        result['limit_per_user_and_day'] = self.limit_per_user_and_day
        result['limit_per_user_and_month'] = self.limit_per_user_and_month
        result['memo'] = self.memo
        result['open_to_tenant_id'] = self.open_to_tenant_id
        result['price'] = self.price
        result['ratio'] = self.ratio
        result['snapshot_tenant_price'] = self.snapshot_tenant_price
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        result['total_count'] = self.total_count
        result['user_price_type'] = self.user_price_type
        result['use_valid_not_after'] = self.use_valid_not_after
        result['use_valid_not_before'] = self.use_valid_not_before
        result['valid_not_after'] = self.valid_not_after
        result['valid_not_before'] = self.valid_not_before
        result['value'] = self.value
        return result

    def from_map(self, map={}):
        self.admin_id = map.get('admin_id')
        self.auth_type = map.get('auth_type')
        self.currency = map.get('currency')
        self.default_price = map.get('default_price')
        self.description = map.get('description')
        self.desc_images = map.get('desc_images')
        self.equity_d = map.get('equity_d')
        self.equity_name = map.get('equity_name')
        self.equity_type = map.get('equity_type')
        self.images = map.get('images')
        self.is_public = map.get('is_public')
        self.limit_per_merchant_and_day = map.get('limit_per_merchant_and_day')
        self.limit_per_merchant_and_month = map.get('limit_per_merchant_and_month')
        self.limit_per_user_and_day = map.get('limit_per_user_and_day')
        self.limit_per_user_and_month = map.get('limit_per_user_and_month')
        self.memo = map.get('memo')
        self.open_to_tenant_id = map.get('open_to_tenant_id')
        self.price = map.get('price')
        self.ratio = map.get('ratio')
        self.snapshot_tenant_price = map.get('snapshot_tenant_price')
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        self.total_count = map.get('total_count')
        self.user_price_type = map.get('user_price_type')
        self.use_valid_not_after = map.get('use_valid_not_after')
        self.use_valid_not_before = map.get('use_valid_not_before')
        self.valid_not_after = map.get('valid_not_after')
        self.valid_not_before = map.get('valid_not_before')
        self.value = map.get('value')
        return self


class Merchant(TeaModel):
    # 商户管理员ID
    # 商户描述
    # 商户分布式身份ID
    # 资金管理员ID
    # 是否可以发行资产
    # 是否可以采购权益
    # 是否可以发行权益
    # 商户的损益账户
    # 备付金数据
    # 商户状态: 0可用, 1下线, 2冻结
    # 租户ID
    def __init__(self, admin_id=None, description=None, did=None, fund_manager_id=None, is_asset_issuer=None, is_equity_consumer=None, is_equity_provider=None, profit_loss_balance=None, provision=None, status=None, tenant_id=None):
        self.admin_id = admin_id
        self.description = description
        self.did = did
        self.fund_manager_id = fund_manager_id
        self.is_asset_issuer = is_asset_issuer
        self.is_equity_consumer = is_equity_consumer
        self.is_equity_provider = is_equity_provider
        self.profit_loss_balance = profit_loss_balance
        self.provision = provision
        self.status = status
        self.tenant_id = tenant_id

    def validate(self):
        if self.provision:
            self.provision.validate()

    def to_map(self):
        result = {}
        result['admin_id'] = self.admin_id
        result['description'] = self.description
        result['did'] = self.did
        result['fund_manager_id'] = self.fund_manager_id
        result['is_asset_issuer'] = self.is_asset_issuer
        result['is_equity_consumer'] = self.is_equity_consumer
        result['is_equity_provider'] = self.is_equity_provider
        result['profit_loss_balance'] = self.profit_loss_balance
        if self.provision is not None:
            result['provision'] = self.provision.to_map()
        else:
            result['provision'] = None
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.admin_id = map.get('admin_id')
        self.description = map.get('description')
        self.did = map.get('did')
        self.fund_manager_id = map.get('fund_manager_id')
        self.is_asset_issuer = map.get('is_asset_issuer')
        self.is_equity_consumer = map.get('is_equity_consumer')
        self.is_equity_provider = map.get('is_equity_provider')
        self.profit_loss_balance = map.get('profit_loss_balance')
        if map.get('provision') is not None:
            temp_model = Provision()
            self.provision = temp_model.from_map(map['provision'])
        else:
            self.provision = None
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        return self


class User(TeaModel):
    # 用户分布式身份ID
    # 用户的链外身份ID
    # 用户公钥
    # 租户ID
    # 用户ID
    # 用户VC
    def __init__(self, did=None, local_id=None, pk=None, tenant_id=None, user_id=None, vc=None):
        self.did = did
        self.local_id = local_id
        self.pk = pk
        self.tenant_id = tenant_id
        self.user_id = user_id
        self.vc = vc

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['did'] = self.did
        result['local_id'] = self.local_id
        result['pk'] = self.pk
        result['tenant_id'] = self.tenant_id
        result['user_id'] = self.user_id
        result['vc'] = self.vc
        return result

    def from_map(self, map={}):
        self.did = map.get('did')
        self.local_id = map.get('local_id')
        self.pk = map.get('pk')
        self.tenant_id = map.get('tenant_id')
        self.user_id = map.get('user_id')
        self.vc = map.get('vc')
        return self


class ExecAasAntdaoCardCreateRequest(TeaModel):
    # 链ID
    # 交易信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tx=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecAasAntdaoCardCreateResponse(TeaModel):
    # 卡密ID
    # 创建卡密的交易hash
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, card_id=None, tx_hash=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.card_id = card_id
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['card_id'] = self.card_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.card_id = map.get('card_id')
        self.tx_hash = map.get('tx_hash')
        return self


class ExecAasAntdaoCardQueryRequest(TeaModel):
    # 链ID
    # 交易信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tx=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecAasAntdaoCardQueryResponse(TeaModel):
    # 卡密信息对象
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, card=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.card = card

    def validate(self):
        if self.card:
            self.card.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.card is not None:
            result['card'] = self.card.to_map()
        else:
            result['card'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('card') is not None:
            temp_model = Card()
            self.card = temp_model.from_map(map['card'])
        else:
            self.card = None
        return self


class ExecAasAntdaoCardBindnameRequest(TeaModel):
    # 链ID
    # 交易内容
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tx=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecAasAntdaoCardBindnameResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoCardChargeRequest(TeaModel):
    # 链ID
    # 交易信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tx=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecAasAntdaoCardChargeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoCardWriteoffRequest(TeaModel):
    # 链ID
    # 交易信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tx=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecAasAntdaoCardWriteoffResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoCardExpiredRequest(TeaModel):
    # 链ID
    # 交易信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tx=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecAasAntdaoCardExpiredResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoCardForbiddenRequest(TeaModel):
    # 链ID
    # 交易信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tx=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecAasAntdaoCardForbiddenResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoCardChargeresetRequest(TeaModel):
    # 链ID
    # 交易信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tx=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecAasAntdaoCardChargeresetResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoMerchantUserRequest(TeaModel):
    # 链ID
    # 商户管理下的用户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, local_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.local_id = local_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['local_id'] = self.local_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.local_id = map.get('local_id')
        return self


class QueryAasAntdaoMerchantUserResponse(TeaModel):
    # 用户完整信息
    # {
    # "tenant_id": "ZKUA",
    # "user_id": "331f9b0922f940f464d4b94b5628180408ac305b7fc72d3e40f5b7727d0702fb",
    # "local_id": "user01",
    # "did": "",
    # "vc": "",
    # "pk": "3280b948a7fa8525c0fbfd47d1df75d7a7ee9f3baedd6964565b42f461dd86732717c4bc4c8203ea2b9b1aeef7b148644babba3c0cd6927c4c0964919f590c6c"
    # }
    # 
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, user=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.user = user

    def validate(self):
        if self.user:
            self.user.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.user is not None:
            result['user'] = self.user.to_map()
        else:
            result['user'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('user') is not None:
            temp_model = User()
            self.user = temp_model.from_map(map['user'])
        else:
            self.user = None
        return self


class CreateAasAntdaoMerchantUserRequest(TeaModel):
    # 链ID
    # 用户的did信息
    # 用户外部ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, did=None, local_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.did = did
        self.local_id = local_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['did'] = self.did
        result['local_id'] = self.local_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.did = map.get('did')
        self.local_id = map.get('local_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class CreateAasAntdaoMerchantUserResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoMerchantRequest(TeaModel):
    # 链ID
    # 币种
    # 要代理操作的租户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, currency=None, delegated_tenant_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.currency = currency
        self.delegated_tenant_id = delegated_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['currency'] = self.currency
        result['delegated_tenant_id'] = self.delegated_tenant_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.currency = map.get('currency')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        return self


class QueryAasAntdaoMerchantResponse(TeaModel):
    # 查询商户信息时的区块高度
    # 商户完整信息
    # {
    # "tenant_id": "Z",
    # "did": "did:mychain:ct",
    # "admin_id": "ed7b3acb718e2f91bc8fab6a5e7cc3c061",
    # "fund_manager_id": "b7ecd55bde04827b3e611a741d",
    # "description": "SK",
    # "is_equity_provider": true,
    # "is_equity_consumer": true,
    # "is_asset_issuer": true,
    # "status": 0,
    # "provision": {
    # "currency": "CNY",
    # "debit": "99999999.0000",
    # "credit_max": "99999999.0000",
    # "credit_used": "0.0000"
    # }
    # }
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, block_number=None, merchant=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.block_number = block_number
        self.merchant = merchant

    def validate(self):
        if self.merchant:
            self.merchant.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['block_number'] = self.block_number
        if self.merchant is not None:
            result['merchant'] = self.merchant.to_map()
        else:
            result['merchant'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.block_number = map.get('block_number')
        if map.get('merchant') is not None:
            temp_model = Merchant()
            self.merchant = temp_model.from_map(map['merchant'])
        else:
            self.merchant = None
        return self


class UploadAasAntdaoImageRequest(TeaModel):
    # 链ID
    # 图片MIME类型，目前仅支持 image/jpeg
    # 要代理操作的租户ID
    # 图片信息（base64编码）
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, content_type=None, delegated_tenant_id=None, image=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.content_type = content_type
        self.delegated_tenant_id = delegated_tenant_id
        self.image = image

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['content_type'] = self.content_type
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['image'] = self.image
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.content_type = map.get('content_type')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.image = map.get('image')
        return self


class UploadAasAntdaoImageResponse(TeaModel):
    # 临时可访问的url，过期时间2小时
    # 图片的不可访问url，发布权益时使用
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, temporary_url=None, url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.temporary_url = temporary_url
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['temporary_url'] = self.temporary_url
        result['url'] = self.url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.temporary_url = map.get('temporary_url')
        self.url = map.get('url')
        return self


class GetAasAntdaoPkiPublickeyRequest(TeaModel):
    # 商户管理员/其用户的链上账户ID
    # 商户管理员/其用户归属的租户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, opt_tenant_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.opt_tenant_id = opt_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['opt_tenant_id'] = self.opt_tenant_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        return self


class GetAasAntdaoPkiPublickeyResponse(TeaModel):
    # 公钥字符串（base64）
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, public_key=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.public_key = public_key

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['public_key'] = self.public_key
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.public_key = map.get('public_key')
        return self


class ExecAasAntdaoPkiEncryptRequest(TeaModel):
    # 商户管理员/其用户的链上账户ID
    # 明文（base64编码）
    # 商户管理员/其用户归属的租户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, content=None, opt_tenant_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.content = content
        self.opt_tenant_id = opt_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['content'] = self.content
        result['opt_tenant_id'] = self.opt_tenant_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.content = map.get('content')
        self.opt_tenant_id = map.get('opt_tenant_id')
        return self


class ExecAasAntdaoPkiEncryptResponse(TeaModel):
    # 密文 base64编码
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, encrypted_content=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.encrypted_content = encrypted_content

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['encrypted_content'] = self.encrypted_content
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.encrypted_content = map.get('encrypted_content')
        return self


class ExecAasAntdaoPkiDecryptRequest(TeaModel):
    # 商户管理员/其用户的链上账户ID
    # 要代理操作的租户ID
    # 密文（base64）
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, delegated_tenant_id=None, encrypted_content=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.delegated_tenant_id = delegated_tenant_id
        self.encrypted_content = encrypted_content

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['encrypted_content'] = self.encrypted_content
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.encrypted_content = map.get('encrypted_content')
        return self


class ExecAasAntdaoPkiDecryptResponse(TeaModel):
    # 明文
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, content=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.content = content

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['content'] = self.content
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.content = map.get('content')
        return self


class UpdateAasAntdaoMerchantFriendRequest(TeaModel):
    # 链ID
    # 友好商户租户ID
    # 外部交易ID
    # 更新类型
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, friend_tenant_id=None, out_tx_id=None, type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.friend_tenant_id = friend_tenant_id
        self.out_tx_id = out_tx_id
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['friend_tenant_id'] = self.friend_tenant_id
        result['out_tx_id'] = self.out_tx_id
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.friend_tenant_id = map.get('friend_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        self.type = map.get('type')
        return self


class UpdateAasAntdaoMerchantFriendResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class CreateAasAntdaoEquityRequest(TeaModel):
    # 授权类型 0 Auto，1Contract
    # 链ID
    # 结算币种
    # 权益价格（单位：元）
    # 代理操作专用，要代理操作的租户ID
    # 权益商品详情信息
    # 权益商品详情图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
    # 权益商品名称
    # 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】
    # 字段决定权益商品是否全量链上客户可见，当选择权益为false时，需要使用baas.antdao.equity.merchant.open接口增加权益商品可见客户
    # 权益商品主图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
    # 商户每日兑换上限
    # 商户每月兑换上限
    # 用户每日兑换上限
    # 用户每月兑换上限
    # 若需要兑换方提供的特殊信息，可增加在备注字段，并要求兑换方是否传入（按照需求方自定义内容信息）
    # - 如必须传入证件号，手机号信息，则权益需要通过运营平台审核，非必须采集信息将拒绝上架
    # 外部交易ID
    # 权益商品库存数量
    # 权益商品使用有效期右闭区间（毫秒）
    # 权益商品使用有效期左闭区间（毫秒）
    # 权益商品兑换有效期右闭区间（毫秒）
    # 权益商品兑换有效期左闭区间（毫秒）
    # 权益商品面值（单位：元）
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_type=None, chain_id=None, currency=None, default_price=None, delegated_tenant_id=None, description=None, desc_images=None, equity_name=None, equity_type=None, if_public=None, images=None, limit_per_merchant_and_day=None, limit_per_merchant_and_month=None, limit_per_user_and_day=None, limit_per_user_and_month=None, memo=None, out_tx_id=None, total_count=None, use_valid_not_after=None, use_valid_not_before=None, valid_not_after=None, valid_not_before=None, value=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auth_type = auth_type
        self.chain_id = chain_id
        self.currency = currency
        self.default_price = default_price
        self.delegated_tenant_id = delegated_tenant_id
        self.description = description
        self.desc_images = desc_images
        self.equity_name = equity_name
        self.equity_type = equity_type
        self.if_public = if_public
        self.images = images
        self.limit_per_merchant_and_day = limit_per_merchant_and_day
        self.limit_per_merchant_and_month = limit_per_merchant_and_month
        self.limit_per_user_and_day = limit_per_user_and_day
        self.limit_per_user_and_month = limit_per_user_and_month
        self.memo = memo
        self.out_tx_id = out_tx_id
        self.total_count = total_count
        self.use_valid_not_after = use_valid_not_after
        self.use_valid_not_before = use_valid_not_before
        self.valid_not_after = valid_not_after
        self.valid_not_before = valid_not_before
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_type'] = self.auth_type
        result['chain_id'] = self.chain_id
        result['currency'] = self.currency
        result['default_price'] = self.default_price
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['description'] = self.description
        result['desc_images'] = self.desc_images
        result['equity_name'] = self.equity_name
        result['equity_type'] = self.equity_type
        result['if_public'] = self.if_public
        result['images'] = self.images
        result['limit_per_merchant_and_day'] = self.limit_per_merchant_and_day
        result['limit_per_merchant_and_month'] = self.limit_per_merchant_and_month
        result['limit_per_user_and_day'] = self.limit_per_user_and_day
        result['limit_per_user_and_month'] = self.limit_per_user_and_month
        result['memo'] = self.memo
        result['out_tx_id'] = self.out_tx_id
        result['total_count'] = self.total_count
        result['use_valid_not_after'] = self.use_valid_not_after
        result['use_valid_not_before'] = self.use_valid_not_before
        result['valid_not_after'] = self.valid_not_after
        result['valid_not_before'] = self.valid_not_before
        result['value'] = self.value
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_type = map.get('auth_type')
        self.chain_id = map.get('chain_id')
        self.currency = map.get('currency')
        self.default_price = map.get('default_price')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.description = map.get('description')
        self.desc_images = map.get('desc_images')
        self.equity_name = map.get('equity_name')
        self.equity_type = map.get('equity_type')
        self.if_public = map.get('if_public')
        self.images = map.get('images')
        self.limit_per_merchant_and_day = map.get('limit_per_merchant_and_day')
        self.limit_per_merchant_and_month = map.get('limit_per_merchant_and_month')
        self.limit_per_user_and_day = map.get('limit_per_user_and_day')
        self.limit_per_user_and_month = map.get('limit_per_user_and_month')
        self.memo = map.get('memo')
        self.out_tx_id = map.get('out_tx_id')
        self.total_count = map.get('total_count')
        self.use_valid_not_after = map.get('use_valid_not_after')
        self.use_valid_not_before = map.get('use_valid_not_before')
        self.valid_not_after = map.get('valid_not_after')
        self.valid_not_before = map.get('valid_not_before')
        self.value = map.get('value')
        return self


class CreateAasAntdaoEquityResponse(TeaModel):
    # 请求ID，用于查询异步发布权益结果
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, create_equity_request_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.create_equity_request_id = create_equity_request_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['create_equity_request_id'] = self.create_equity_request_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.create_equity_request_id = map.get('create_equity_request_id')
        return self


class OfflineAasAntdaoEquityRequest(TeaModel):
    # 链ID
    # 权益商品ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, equity_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class OfflineAasAntdaoEquityResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class FreezeAasAntdaoEquityRequest(TeaModel):
    # 链ID
    # 权益商品ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, equity_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class FreezeAasAntdaoEquityResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class OpenAasAntdaoEquityMerchantRequest(TeaModel):
    # 链ID
    # 代理操作专用，要代理操作的租户ID
    # 权益商品ID
    # 被授权的租户ID
    # 更新操作，添加或者删除
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, opt_tenant_id=None, opt_type=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.opt_tenant_id = opt_tenant_id
        self.opt_type = opt_type
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['opt_type'] = self.opt_type
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        self.out_tx_id = map.get('out_tx_id')
        return self


class OpenAasAntdaoEquityMerchantResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class AuthAasAntdaoEquityMerchantuserpriceRequest(TeaModel):
    # 用户兑换价格（单位：元）。价格和比例二选一，且只能填写一个。
    # 链ID
    # 代理操作专用，要代理操作的租户ID
    # 权益商品ID
    # 操作用户
    # 外部交易ID
    # 比例。价格和比例二选一，且只能填写一个。
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, chain_id=None, delegated_tenant_id=None, equity_id=None, opt_tenant_id=None, out_tx_id=None, ratio=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id
        self.ratio = ratio

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        result['ratio'] = self.ratio
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        self.ratio = map.get('ratio')
        return self


class AuthAasAntdaoEquityMerchantuserpriceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class UpdateAasAntdaoEquityDefaultpriceRequest(TeaModel):
    # 价格
    # 链ID
    # 代理操作专用，要代理操作的租户ID
    # 权益商品ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, chain_id=None, delegated_tenant_id=None, equity_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class UpdateAasAntdaoEquityDefaultpriceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class UpdateAasAntdaoEquityTenantpriceRequest(TeaModel):
    # 价格（单位：元）
    # 链ID
    # 要代理操作的租户ID
    # 权益商品ID
    # 定向价格租户ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, chain_id=None, delegated_tenant_id=None, equity_id=None, opt_tenant_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class UpdateAasAntdaoEquityTenantpriceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class AddAasAntdaoEquityCountRequest(TeaModel):
    # 权益库存数量
    # 链ID
    # 代理操作专用，要代理操作的租户ID
    # 权益商品ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, chain_id=None, delegated_tenant_id=None, equity_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class AddAasAntdaoEquityCountResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class UpdateAasAntdaoEquityExchangelimitRequest(TeaModel):
    # 链ID
    # 代理操作专用，要代理操作的租户ID
    # 权益商品ID
    # 商户每日兑换上限
    # 商户每月兑换上限
    # 用户每日兑换上限
    # 用户每月兑换上限
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, limit_per_merchant_and_day=None, limit_per_merchant_and_montn=None, limit_per_user_and_day=None, limit_per_user_and_month=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.limit_per_merchant_and_day = limit_per_merchant_and_day
        self.limit_per_merchant_and_montn = limit_per_merchant_and_montn
        self.limit_per_user_and_day = limit_per_user_and_day
        self.limit_per_user_and_month = limit_per_user_and_month
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['limit_per_merchant_and_day'] = self.limit_per_merchant_and_day
        result['limit_per_merchant_and_montn'] = self.limit_per_merchant_and_montn
        result['limit_per_user_and_day'] = self.limit_per_user_and_day
        result['limit_per_user_and_month'] = self.limit_per_user_and_month
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.limit_per_merchant_and_day = map.get('limit_per_merchant_and_day')
        self.limit_per_merchant_and_montn = map.get('limit_per_merchant_and_montn')
        self.limit_per_user_and_day = map.get('limit_per_user_and_day')
        self.limit_per_user_and_month = map.get('limit_per_user_and_month')
        self.out_tx_id = map.get('out_tx_id')
        return self


class UpdateAasAntdaoEquityExchangelimitResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class UpdateAasAntdaoEquityValidtimeRequest(TeaModel):
    # 链ID
    # 要代理的租户ID
    # 权益商品ID
    # 外部交易ID
    # 权益商品使用有效期右闭区间
    # 权益商品使用有效期左闭区间
    # 权益商品兑换有效期右闭区间
    # 权益商品兑换有效期左闭区间
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, out_tx_id=None, use_valid_not_after=None, use_valid_not_before=None, valid_not_after=None, valid_not_before=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id
        self.use_valid_not_after = use_valid_not_after
        self.use_valid_not_before = use_valid_not_before
        self.valid_not_after = valid_not_after
        self.valid_not_before = valid_not_before

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        result['use_valid_not_after'] = self.use_valid_not_after
        result['use_valid_not_before'] = self.use_valid_not_before
        result['valid_not_after'] = self.valid_not_after
        result['valid_not_before'] = self.valid_not_before
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        self.use_valid_not_after = map.get('use_valid_not_after')
        self.use_valid_not_before = map.get('use_valid_not_before')
        self.valid_not_after = map.get('valid_not_after')
        self.valid_not_before = map.get('valid_not_before')
        return self


class UpdateAasAntdaoEquityValidtimeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoEquityRequest(TeaModel):
    # 链ID
    # 要代理操作的租户ID
    # 权益商品ID
    # 被检索商户ID
    # 交易限制日期(yyyyMMdd或yyyyMM)(可选)
    # 被检索用户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, opt_tenant_id=None, target_date=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.opt_tenant_id = opt_tenant_id
        self.target_date = target_date
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['target_date'] = self.target_date
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.target_date = map.get('target_date')
        self.user_id = map.get('user_id')
        return self


class QueryAasAntdaoEquityResponse(TeaModel):
    # 权益商品完整信息: equityType 权益类型：0积分，1卡券，2实物。 status 权益状态：0可用状态，1下线，2冻结。 authType 权益授权类型：0自动，1合约。
    # { "equity_id": "6041f851f4d", "tenant_id": "ZEJEZKUA", "admin_id": "ed7b3ac3c061", "equity_type": 1, "equity_name": "FDCardtest", "description": "FDCard", "total_count": "1000000", "status": 0, "auth_type": 0, "currency": "CNY", "value": "10.0000", "default_price": "1.0000", "images": "oss://myexchange/12593acf32dd6d4257fa0.jpeg", "desc_images": "", "memo": "", "is_public": true, "valid_not_before": 112692, "valid_not_after": 112654365244, "use_valid_not_before": 112612, "use_valid_not_after": 11265436524415235, "limit_per_user_and_day": 1000000, "limit_per_user_and_month": 100000, "limit_per_merchant_and_day": 1000000, "limit_per_merchant_and_month": 1000000, "equity_ext_info": { "open_to_tenant_id": "", "tenant_price": "", "tenant_user_price": { "snapshot_tenant_price": "", "user_price_type": 0, "price": "", "ratio": "" }, "target_date": "", "limit_per_day_used": 0, "limit_per_month_used": 0 } }
    # 权益图片的永久oss地址
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, equity=None, urls=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.equity = equity
        self.urls = []

    def validate(self):
        if self.equity:
            self.equity.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.equity is not None:
            result['equity'] = self.equity.to_map()
        else:
            result['equity'] = None
        result['urls'] = []
        if self.urls is not None:
            for k in self.urls:
                result['urls'].append(k)
        else:
            result['urls'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('equity') is not None:
            temp_model = Equity()
            self.equity = temp_model.from_map(map['equity'])
        else:
            self.equity = None
        self.urls = []
        if map.get('urls') is not None:
            for k in map.get('urls'):
                self.urls.append(k)
        else:
            self.urls = None
        return self


class ExecAasAntdaoExchangeByuserRequest(TeaModel):
    # 资产ID
    # 资产发行方
    # 期望资产汇率
    # 链ID
    # 代理操作专用，要代理操作的租户ID
    # 权益商品ID
    # 权益商品提供方ID
    # 期望权益汇率
    # 兑换时必要信息，敏感信息需加密。兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    # 外部交易ID
    # 用户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, asset_id=None, asset_issuer=None, asset_rate=None, chain_id=None, delegated_tenant_id=None, equity_id=None, equity_provider=None, equity_rate=None, memo=None, out_tx_id=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.asset_id = asset_id
        self.asset_issuer = asset_issuer
        self.asset_rate = asset_rate
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.equity_provider = equity_provider
        self.equity_rate = equity_rate
        self.memo = memo
        self.out_tx_id = out_tx_id
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['asset_id'] = self.asset_id
        result['asset_issuer'] = self.asset_issuer
        result['asset_rate'] = self.asset_rate
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['equity_provider'] = self.equity_provider
        result['equity_rate'] = self.equity_rate
        result['memo'] = self.memo
        result['out_tx_id'] = self.out_tx_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.asset_id = map.get('asset_id')
        self.asset_issuer = map.get('asset_issuer')
        self.asset_rate = map.get('asset_rate')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.equity_provider = map.get('equity_provider')
        self.equity_rate = map.get('equity_rate')
        self.memo = map.get('memo')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        return self


class ExecAasAntdaoExchangeByuserResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoExchangeBymerchantRequest(TeaModel):
    # 资产ID
    # 当前希望按照上述比例扣减用户资产
    # 链ID
    # 权益商品ID，例：7f1be9108651f97513b5b59030f5b059e58a59d263ab426cbf26337f91642caa
    # 期望权益商品价格（单位：元）
    # 兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    # 比如在兑换手机直充商品时，需要对{"countryCode": "86", "phone": "13900000000"} 使用供应商的公钥进行加密。
    # 权益商品兑换外部流水ID，调用方自定义流水ID
    # 采购商如果绑定了附加的公私钥对。在兑换商品时需要对SHA256(out_tx_id+tenant_id+asset_id+equity_id+equity_price+asset_rate+user_id+memo)使用ECC K1私钥签名（算法ECDSAWithSHA256，曲线Secp256K1），并转换为Hex。
    # 受益用户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, asset_id=None, asset_rate=None, chain_id=None, equity_id=None, equity_price=None, memo=None, out_tx_id=None, tx_sig=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.asset_id = asset_id
        self.asset_rate = asset_rate
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.equity_price = equity_price
        self.memo = memo
        self.out_tx_id = out_tx_id
        self.tx_sig = tx_sig
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['asset_id'] = self.asset_id
        result['asset_rate'] = self.asset_rate
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['equity_price'] = self.equity_price
        result['memo'] = self.memo
        result['out_tx_id'] = self.out_tx_id
        result['tx_sig'] = self.tx_sig
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.asset_id = map.get('asset_id')
        self.asset_rate = map.get('asset_rate')
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.equity_price = map.get('equity_price')
        self.memo = map.get('memo')
        self.out_tx_id = map.get('out_tx_id')
        self.tx_sig = map.get('tx_sig')
        self.user_id = map.get('user_id')
        return self


class ExecAasAntdaoExchangeBymerchantResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ConfirmAasAntdaoExchangeRequest(TeaModel):
    # 链ID
    # 要代理操作的租户ID
    # 权益商品ID
    # 附言。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ConfirmAasAntdaoExchangeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoExchangeOutofstoreRequest(TeaModel):
    # 链ID
    # 要代理操作的租户ID
    # 权益商品ID
    # 缺货时通知给采购方的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecAasAntdaoExchangeOutofstoreResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class SendAasAntdaoExchangeRequest(TeaModel):
    # 链ID
    # 要代理操作的租户ID
    # 权益商品ID
    # 发货商品的信息，敏感信息需加密，使用收货方公钥加密的权益信息。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896。比如在手机直充时可以返回 {  "voucher": "充值凭证，如有",  "memo": ""}信息。
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class SendAasAntdaoExchangeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoExchangeReceivebyuserRequest(TeaModel):
    # 链ID
    # 要代理操作的租户ID
    # 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    # 外部交易ID
    # 用户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, memo=None, origin_tx_id=None, out_tx_id=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        return self


class ExecAasAntdaoExchangeReceivebyuserResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoAssetExpireRequest(TeaModel):
    # 数量
    # 资产ID
    # 链ID
    # 资产过期信息
    # 过期的交易ID
    # 外部交易ID，每个租户保证唯一
    # 用户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, asset_id=None, chain_id=None, info=None, original_tx_id=None, out_tx_id=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.info = info
        self.original_tx_id = original_tx_id
        self.out_tx_id = out_tx_id
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['original_tx_id'] = self.original_tx_id
        result['out_tx_id'] = self.out_tx_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.original_tx_id = map.get('original_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        return self


class ExecAasAntdaoAssetExpireResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoAssetInstructionRequest(TeaModel):
    # 链ID
    # 资产流水ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, origin_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.origin_tx_id = origin_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['origin_tx_id'] = self.origin_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.origin_tx_id = map.get('origin_tx_id')
        return self


class QueryAasAntdaoAssetInstructionResponse(TeaModel):
    # 资产流水完整信息的json字符串。
    # direction 交易方向:：0正向交易，1反向交易。
    # type 交易类型：0 资产发行；1资产赎回；2资产发放；3资产发放回退；4资产风控调整；5资产过期；6资产支付；7资产支付退款。
    # status流水状态(Complete)；0完成
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, instruction=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.instruction = instruction

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['instruction'] = self.instruction
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.instruction = map.get('instruction')
        return self


class QueryAasAntdaoExchangeInstructionRequest(TeaModel):
    # 链ID
    # 权益商品ID
    # 发起操作的租户ID
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, equity_id=None, opt_tenant_id=None, origin_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.opt_tenant_id = opt_tenant_id
        self.origin_tx_id = origin_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['origin_tx_id'] = self.origin_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.origin_tx_id = map.get('origin_tx_id')
        return self


class QueryAasAntdaoExchangeInstructionResponse(TeaModel):
    # 权益兑换流水完整信息
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, instruction=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.instruction = instruction

    def validate(self):
        if self.instruction:
            self.instruction.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.instruction is not None:
            result['instruction'] = self.instruction.to_map()
        else:
            result['instruction'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('instruction') is not None:
            temp_model = EInstruction()
            self.instruction = temp_model.from_map(map['instruction'])
        else:
            self.instruction = None
        return self


class ExecAasAntdaoAssetIssueRequest(TeaModel):
    # 充值数量
    # 资产ID
    # 链ID
    # 备注信息
    # 充值租户ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, asset_id=None, chain_id=None, info=None, opt_tenant_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.info = info
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecAasAntdaoAssetIssueResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoAssetRedeemRequest(TeaModel):
    # 赎回数量
    # 资产ID
    # 链ID
    # 备注信息
    # 要赎回的充值交易ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, asset_id=None, chain_id=None, info=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.info = info
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecAasAntdaoAssetRedeemResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoAssetGrantRequest(TeaModel):
    # 数量
    # 资产ID
    # 链ID
    # 资产发放信息
    # 商户ID
    # 外部交易ID
    # 用户ID
    # 有效时间
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, asset_id=None, chain_id=None, info=None, merchant_id=None, out_tx_id=None, user_id=None, validity_time=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.info = info
        self.merchant_id = merchant_id
        self.out_tx_id = out_tx_id
        self.user_id = user_id
        self.validity_time = validity_time

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['merchant_id'] = self.merchant_id
        result['out_tx_id'] = self.out_tx_id
        result['user_id'] = self.user_id
        result['validity_time'] = self.validity_time
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.merchant_id = map.get('merchant_id')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        self.validity_time = map.get('validity_time')
        return self


class ExecAasAntdaoAssetGrantResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoAssetGrantrefundRequest(TeaModel):
    # 数量
    # 资产ID
    # 链ID
    # 备注信息
    # 要回退的交易ID
    # 外部交易ID
    # 用户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, asset_id=None, chain_id=None, info=None, origin_tx_id=None, out_tx_id=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.info = info
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        return self


class ExecAasAntdaoAssetGrantrefundResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoAssetAdjustRequest(TeaModel):
    # 风控调整数量
    # 资产ID
    # 链ID
    # 风控调整信息
    # 外部交易ID，每个租户保证唯一
    # 用户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, asset_id=None, chain_id=None, info=None, out_tx_id=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.info = info
        self.out_tx_id = out_tx_id
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['out_tx_id'] = self.out_tx_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        return self


class ExecAasAntdaoAssetAdjustResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoAssetRequest(TeaModel):
    # 资产ID
    # 链ID
    # 资产查询相关的租户ID
    # 若要查询用户持有的资产数量，输入用户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, asset_id=None, chain_id=None, opt_tenant_id=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.opt_tenant_id = opt_tenant_id
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.user_id = map.get('user_id')
        return self


class QueryAasAntdaoAssetResponse(TeaModel):
    # 资产完整信息
    # {
    # "asset_id": "CT::Asset001",
    # "asset_name": "CTPoints",
    # "tenant_id": "OREDKOCN",
    # "admin_id": "f46857d8796fc2b829862e2752bda38f7eefeec5581ad41398002f50a3ad8ccd",
    # "currency": "CNY",
    # "asset_rate": "1000.0000",
    # "total_issue_balance": "11111111.0000",
    # "issue_account_balance": "0.0000",
    # "relay_Account_balance": "0.0000",
    # "receive_payment_account_balance": "0.0000",
    # "overdue_recovery_account_balance": "",
    # "status": 76,
    # "asset_ext_info": {
    # "dispense_tenant_id": "",
    # "dispense_balance": "",
    # "user_id": "",
    # "user_credit_balance": ""
    # }
    # }
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, asset=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.asset = asset

    def validate(self):
        if self.asset:
            self.asset.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.asset is not None:
            result['asset'] = self.asset.to_map()
        else:
            result['asset'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('asset') is not None:
            temp_model = Asset()
            self.asset = temp_model.from_map(map['asset'])
        else:
            self.asset = None
        return self


class ExecAasAntdaoExchangeReceivebymerchantRequest(TeaModel):
    # 链ID
    # 权益商品ID
    # 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecAasAntdaoExchangeReceivebymerchantResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoBlockRequest(TeaModel):
    # 区块链高度
    # 链ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, block_number=None, chain_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.block_number = block_number
        self.chain_id = chain_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['block_number'] = self.block_number
        result['chain_id'] = self.chain_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.block_number = map.get('block_number')
        self.chain_id = map.get('chain_id')
        return self


class QueryAasAntdaoBlockResponse(TeaModel):
    # 区块信息
    # 区块高度
    # 链ID
    # 过滤后的交易数量
    # 区块中交易总数
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, block=None, block_number=None, chain_id=None, filtered_tx_count=None, total_tx_count=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.block = block
        self.block_number = block_number
        self.chain_id = chain_id
        self.filtered_tx_count = filtered_tx_count
        self.total_tx_count = total_tx_count

    def validate(self):
        if self.block:
            self.block.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.block is not None:
            result['block'] = self.block.to_map()
        else:
            result['block'] = None
        result['block_number'] = self.block_number
        result['chain_id'] = self.chain_id
        result['filtered_tx_count'] = self.filtered_tx_count
        result['total_tx_count'] = self.total_tx_count
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('block') is not None:
            temp_model = Block()
            self.block = temp_model.from_map(map['block'])
        else:
            self.block = None
        self.block_number = map.get('block_number')
        self.chain_id = map.get('chain_id')
        self.filtered_tx_count = map.get('filtered_tx_count')
        self.total_tx_count = map.get('total_tx_count')
        return self


class QueryAasAntdaoBlockLastblocknumberRequest(TeaModel):
    # 链ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        return self


class QueryAasAntdaoBlockLastblocknumberResponse(TeaModel):
    # 最新区块高度
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, last_block_number=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.last_block_number = last_block_number

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['last_block_number'] = self.last_block_number
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.last_block_number = map.get('last_block_number')
        return self


class UpdateAasAntdaoEquityRequest(TeaModel):
    # 授权类型：0 Auto，1 Contract
    # 链ID
    # 货币类型
    # 默认价格（单位：元）
    # 要代理的租户ID
    # 权益商品详细描述信息
    # 描述图片信息(;分隔)
    # 权益商品ID
    # 权益商品名称
    # 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】
    # 权益商品是否公开
    # 主图片信息(;分隔)
    # 商户每日兑换上限
    # 商户每月兑换上限
    # 用户每日兑换上限
    # 用户每月兑换上限
    # 附言
    # 交易ID
    # 库存
    # 权益商品使用有效期右闭区间
    # 权益商品使用有效期左闭区间
    # 权益商品兑换有效期右闭区间
    # 权益商品兑换有效期左闭区间
    # 面值（单位：元）
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_type=None, chain_id=None, currency=None, default_price=None, delegated_tenant_id=None, description=None, desc_images=None, equity_id=None, equity_name=None, equity_type=None, if_public=None, images=None, limit_per_merchant_and_day=None, limit_per_merchant_and_month=None, limit_per_user_and_day=None, limit_per_user_and_month=None, memo=None, out_tx_id=None, total_count=None, use_valid_not_after=None, use_valid_not_before=None, valid_not_after=None, valid_not_before=None, value=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auth_type = auth_type
        self.chain_id = chain_id
        self.currency = currency
        self.default_price = default_price
        self.delegated_tenant_id = delegated_tenant_id
        self.description = description
        self.desc_images = desc_images
        self.equity_id = equity_id
        self.equity_name = equity_name
        self.equity_type = equity_type
        self.if_public = if_public
        self.images = images
        self.limit_per_merchant_and_day = limit_per_merchant_and_day
        self.limit_per_merchant_and_month = limit_per_merchant_and_month
        self.limit_per_user_and_day = limit_per_user_and_day
        self.limit_per_user_and_month = limit_per_user_and_month
        self.memo = memo
        self.out_tx_id = out_tx_id
        self.total_count = total_count
        self.use_valid_not_after = use_valid_not_after
        self.use_valid_not_before = use_valid_not_before
        self.valid_not_after = valid_not_after
        self.valid_not_before = valid_not_before
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_type'] = self.auth_type
        result['chain_id'] = self.chain_id
        result['currency'] = self.currency
        result['default_price'] = self.default_price
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['description'] = self.description
        result['desc_images'] = self.desc_images
        result['equity_id'] = self.equity_id
        result['equity_name'] = self.equity_name
        result['equity_type'] = self.equity_type
        result['if_public'] = self.if_public
        result['images'] = self.images
        result['limit_per_merchant_and_day'] = self.limit_per_merchant_and_day
        result['limit_per_merchant_and_month'] = self.limit_per_merchant_and_month
        result['limit_per_user_and_day'] = self.limit_per_user_and_day
        result['limit_per_user_and_month'] = self.limit_per_user_and_month
        result['memo'] = self.memo
        result['out_tx_id'] = self.out_tx_id
        result['total_count'] = self.total_count
        result['use_valid_not_after'] = self.use_valid_not_after
        result['use_valid_not_before'] = self.use_valid_not_before
        result['valid_not_after'] = self.valid_not_after
        result['valid_not_before'] = self.valid_not_before
        result['value'] = self.value
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_type = map.get('auth_type')
        self.chain_id = map.get('chain_id')
        self.currency = map.get('currency')
        self.default_price = map.get('default_price')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.description = map.get('description')
        self.desc_images = map.get('desc_images')
        self.equity_id = map.get('equity_id')
        self.equity_name = map.get('equity_name')
        self.equity_type = map.get('equity_type')
        self.if_public = map.get('if_public')
        self.images = map.get('images')
        self.limit_per_merchant_and_day = map.get('limit_per_merchant_and_day')
        self.limit_per_merchant_and_month = map.get('limit_per_merchant_and_month')
        self.limit_per_user_and_day = map.get('limit_per_user_and_day')
        self.limit_per_user_and_month = map.get('limit_per_user_and_month')
        self.memo = map.get('memo')
        self.out_tx_id = map.get('out_tx_id')
        self.total_count = map.get('total_count')
        self.use_valid_not_after = map.get('use_valid_not_after')
        self.use_valid_not_before = map.get('use_valid_not_before')
        self.valid_not_after = map.get('valid_not_after')
        self.valid_not_before = map.get('valid_not_before')
        self.value = map.get('value')
        return self


class UpdateAasAntdaoEquityResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoEquityCreateresultRequest(TeaModel):
    # 链ID
    # 异步发布权益结果查询ID
    # 要代理操作的租户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, create_equity_request_id=None, delegated_tenant_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.create_equity_request_id = create_equity_request_id
        self.delegated_tenant_id = delegated_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['create_equity_request_id'] = self.create_equity_request_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.create_equity_request_id = map.get('create_equity_request_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        return self


class QueryAasAntdaoEquityCreateresultResponse(TeaModel):
    # 权益商品创建成功，返回权益ID
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, equity_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.equity_id = equity_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['equity_id'] = self.equity_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.equity_id = map.get('equity_id')
        return self


class QueryAasAntdaoEquityInstructionRequest(TeaModel):
    # 链ID
    # 代理该租户调用接口，会使用该租户发送交易链上查询信息
    # 权益商品ID
    # 发起操作的租户ID
    # 要查询的流水交易号
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, opt_tenant_id=None, origin_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.opt_tenant_id = opt_tenant_id
        self.origin_tx_id = origin_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['origin_tx_id'] = self.origin_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.origin_tx_id = map.get('origin_tx_id')
        return self


class QueryAasAntdaoEquityInstructionResponse(TeaModel):
    # 商品兑换流水信息
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, instruction=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.instruction = instruction

    def validate(self):
        if self.instruction:
            self.instruction.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.instruction is not None:
            result['instruction'] = self.instruction.to_map()
        else:
            result['instruction'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('instruction') is not None:
            temp_model = EInstruction()
            self.instruction = temp_model.from_map(map['instruction'])
        else:
            self.instruction = None
        return self


class QueryAasAntdaoImageRequest(TeaModel):
    # 要查询的图片数组，填入不可访问的url
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, urls=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.urls = []

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['urls'] = []
        if self.urls is not None:
            for k in self.urls:
                result['urls'].append(k)
        else:
            result['urls'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.urls = []
        if map.get('urls') is not None:
            for k in map.get('urls'):
                self.urls.append(k)
        else:
            self.urls = None
        return self


class QueryAasAntdaoImageResponse(TeaModel):
    # 临时可访问的oss图片链接，每张图片会返回四个url，对应原图和不同的比例缩小，每一张图片的四个url用;隔开。
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, urls=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.urls = []

    def validate(self):
        if self.urls:
            for k in self.urls:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['urls'] = []
        if self.urls is not None:
            for k in self.urls:
                result['urls'].append(k.to_map() if k else None)
        else:
            result['urls'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.urls = []
        if map.get('urls') is not None:
            for k in map.get('urls'):
                temp_model = MultiURL()
                temp_model = temp_model.from_map(k)
                self.urls.append(temp_model)
        else:
            self.urls = None
        return self


class UpdateAasAntdaoEquityStatusRequest(TeaModel):
    # 链ID
    # 要代理操作的租户ID
    # 权益商品ID
    # 外部交易ID
    # 权益状态：0可用，1下线，2冻结
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, out_tx_id=None, status=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        self.status = map.get('status')
        return self


class UpdateAasAntdaoEquityStatusResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class SetAasAntdaoMerchantProvisionRequest(TeaModel):
    # 链ID
    # 新的授信上限（单位：元）
    # 新的授信已使用数额（单位：元）
    # 币种
    # 新的备付金余额（单位：元）
    # 要设置备付金的商户租户ID
    # 初始的授信上限（单位：元）
    # 初始的授信已使用数额（单位：元）
    # 初始的备付金余额（单位：元）
    # 外部交易ID（确保幂等）
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, credit_max_amount=None, credit_used_amount=None, currency=None, debit_amount=None, opt_tenant_id=None, original_credit_max_amount=None, original_credit_used_amount=None, original_debit_amount=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.credit_max_amount = credit_max_amount
        self.credit_used_amount = credit_used_amount
        self.currency = currency
        self.debit_amount = debit_amount
        self.opt_tenant_id = opt_tenant_id
        self.original_credit_max_amount = original_credit_max_amount
        self.original_credit_used_amount = original_credit_used_amount
        self.original_debit_amount = original_debit_amount
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['credit_max_amount'] = self.credit_max_amount
        result['credit_used_amount'] = self.credit_used_amount
        result['currency'] = self.currency
        result['debit_amount'] = self.debit_amount
        result['opt_tenant_id'] = self.opt_tenant_id
        result['original_credit_max_amount'] = self.original_credit_max_amount
        result['original_credit_used_amount'] = self.original_credit_used_amount
        result['original_debit_amount'] = self.original_debit_amount
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.credit_max_amount = map.get('credit_max_amount')
        self.credit_used_amount = map.get('credit_used_amount')
        self.currency = map.get('currency')
        self.debit_amount = map.get('debit_amount')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.original_credit_max_amount = map.get('original_credit_max_amount')
        self.original_credit_used_amount = map.get('original_credit_used_amount')
        self.original_debit_amount = map.get('original_debit_amount')
        self.out_tx_id = map.get('out_tx_id')
        return self


class SetAasAntdaoMerchantProvisionResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class UpdateAasAntdaoMerchantProvisionRequest(TeaModel):
    # 链ID
    # 更新授信上限
    # 更新授信已使用数额
    # 币种
    # 更新余额
    # 要设置备付金的商户租户ID
    # 操作类型，ADD表示增加，SUB表示减少
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, credit_max_amount=None, credit_used_amount=None, currency=None, debit_amount=None, opt_tenant_id=None, opt_type=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.credit_max_amount = credit_max_amount
        self.credit_used_amount = credit_used_amount
        self.currency = currency
        self.debit_amount = debit_amount
        self.opt_tenant_id = opt_tenant_id
        self.opt_type = opt_type
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['credit_max_amount'] = self.credit_max_amount
        result['credit_used_amount'] = self.credit_used_amount
        result['currency'] = self.currency
        result['debit_amount'] = self.debit_amount
        result['opt_tenant_id'] = self.opt_tenant_id
        result['opt_type'] = self.opt_type
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.credit_max_amount = map.get('credit_max_amount')
        self.credit_used_amount = map.get('credit_used_amount')
        self.currency = map.get('currency')
        self.debit_amount = map.get('debit_amount')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        self.out_tx_id = map.get('out_tx_id')
        return self


class UpdateAasAntdaoMerchantProvisionResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoEquityInstructionwriteoffRequest(TeaModel):
    # 链ID
    # 权益商品ID
    # 附言
    # 兑换交易ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecAasAntdaoEquityInstructionwriteoffResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoMerchantProvisionsRequest(TeaModel):
    # 行为
    # 要查询的租户ID
    # 产品编码
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, business_action=None, opt_tenant_id=None, product_code=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.business_action = business_action
        self.opt_tenant_id = opt_tenant_id
        self.product_code = product_code

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['business_action'] = self.business_action
        result['opt_tenant_id'] = self.opt_tenant_id
        result['product_code'] = self.product_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.business_action = map.get('business_action')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.product_code = map.get('product_code')
        return self


class QueryAasAntdaoMerchantProvisionsResponse(TeaModel):
    # 租户的备付金列表信息
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, discrete_values=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.discrete_values = []

    def validate(self):
        if self.discrete_values:
            for k in self.discrete_values:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['discrete_values'] = []
        if self.discrete_values is not None:
            for k in self.discrete_values:
                result['discrete_values'].append(k.to_map() if k else None)
        else:
            result['discrete_values'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.discrete_values = []
        if map.get('discrete_values') is not None:
            for k in map.get('discrete_values'):
                temp_model = DiscreteValue()
                temp_model = temp_model.from_map(k)
                self.discrete_values.append(temp_model)
        else:
            self.discrete_values = None
        return self


class QueryAasAntdaoMerchantExchangeableequitylistRequest(TeaModel):
    # 链ID
    # 页码
    # 每页数量（不填默认返回50条数据）
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, page_number=None, page_size=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.page_number = page_number
        self.page_size = page_size

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['page_number'] = self.page_number
        result['page_size'] = self.page_size
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.page_number = map.get('page_number')
        self.page_size = map.get('page_size')
        return self


class QueryAasAntdaoMerchantExchangeableequitylistResponse(TeaModel):
    # 可兑换商品信息列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, object=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.object = object

    def validate(self):
        if self.object:
            self.object.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.object is not None:
            result['object'] = self.object.to_map()
        else:
            result['object'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('object') is not None:
            temp_model = ExchangeableEquityList()
            self.object = temp_model.from_map(map['object'])
        else:
            self.object = None
        return self


class QueryAasAntdaoMerchantExchangeableequitydetailRequest(TeaModel):
    # 链ID
    # 商品SKUID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, sku_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.sku_id = sku_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.sku_id = map.get('sku_id')
        return self


class QueryAasAntdaoMerchantExchangeableequitydetailResponse(TeaModel):
    # 可兑换的商品详情信息
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, equity=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.equity = equity

    def validate(self):
        if self.equity:
            self.equity.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.equity is not None:
            result['equity'] = self.equity.to_map()
        else:
            result['equity'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('equity') is not None:
            temp_model = EquityDetail()
            self.equity = temp_model.from_map(map['equity'])
        else:
            self.equity = None
        return self


class ExecAasAntdaoAssetCreateRequest(TeaModel):
    # 资产ID
    # 资产名称
    # 链ID
    # 资产绑定币种
    # 为该租户创建新资产
    # 外部交易ID
    # 资产汇率(等值一元钱的数量)
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, asset_id=None, asset_name=None, chain_id=None, currency=None, opt_tenant_id=None, out_tx_id=None, rate=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.asset_id = asset_id
        self.asset_name = asset_name
        self.chain_id = chain_id
        self.currency = currency
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id
        self.rate = rate

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['asset_id'] = self.asset_id
        result['asset_name'] = self.asset_name
        result['chain_id'] = self.chain_id
        result['currency'] = self.currency
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        result['rate'] = self.rate
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.asset_id = map.get('asset_id')
        self.asset_name = map.get('asset_name')
        self.chain_id = map.get('chain_id')
        self.currency = map.get('currency')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        self.rate = map.get('rate')
        return self


class ExecAasAntdaoAssetCreateResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoAssetGenerateRequest(TeaModel):
    # 铸币数量
    # 资产ID
    # 链ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, asset_id=None, chain_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecAasAntdaoAssetGenerateResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class CreateAasAntdaoMerchantRequest(TeaModel):
    # 链ID
    # 商户描述，不超过2048
    # 商户的资金管理员 归属的租户ID
    # 商户角色，是否是资产发行商
    # 商户角色，是否是采购商
    # 商户角色，是否是供应商
    # 商户归属的租户ID
    # 外部交易ID（确保幂等）
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, description=None, fund_manager_tenant_id=None, if_asset_issuer=None, if_equity_consumer=None, if_equity_provider=None, opt_tenant_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.description = description
        self.fund_manager_tenant_id = fund_manager_tenant_id
        self.if_asset_issuer = if_asset_issuer
        self.if_equity_consumer = if_equity_consumer
        self.if_equity_provider = if_equity_provider
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['description'] = self.description
        result['fund_manager_tenant_id'] = self.fund_manager_tenant_id
        result['if_asset_issuer'] = self.if_asset_issuer
        result['if_equity_consumer'] = self.if_equity_consumer
        result['if_equity_provider'] = self.if_equity_provider
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.description = map.get('description')
        self.fund_manager_tenant_id = map.get('fund_manager_tenant_id')
        self.if_asset_issuer = map.get('if_asset_issuer')
        self.if_equity_consumer = map.get('if_equity_consumer')
        self.if_equity_provider = map.get('if_equity_provider')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class CreateAasAntdaoMerchantResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class SetAasAntdaoMerchantFundmanagerRequest(TeaModel):
    # 链ID
    # 资金管理员所属的租户ID
    # 要进行资金管理员设置的租户ID
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, fund_manager_tenant_id=None, opt_tenant_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.fund_manager_tenant_id = fund_manager_tenant_id
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['fund_manager_tenant_id'] = self.fund_manager_tenant_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.fund_manager_tenant_id = map.get('fund_manager_tenant_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class SetAasAntdaoMerchantFundmanagerResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class CreateAasAntdaoMerchantProvisionRequest(TeaModel):
    # 链ID
    # 备付金账户币种
    # 要创建备付金账户的租户ID
    # 外部交易ID，确保幂等
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, currency=None, opt_tenant_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.currency = currency
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['currency'] = self.currency
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.currency = map.get('currency')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class CreateAasAntdaoMerchantProvisionResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoConfigDelegaterelationRequest(TeaModel):
    # 被代理的租户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, delegated_tenant_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.delegated_tenant_id = delegated_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['delegated_tenant_id'] = self.delegated_tenant_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        return self


class QueryAasAntdaoConfigDelegaterelationResponse(TeaModel):
    # 代理授权关系信息
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, delegate_relation_infos=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.delegate_relation_infos = []

    def validate(self):
        if self.delegate_relation_infos:
            for k in self.delegate_relation_infos:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['delegate_relation_infos'] = []
        if self.delegate_relation_infos is not None:
            for k in self.delegate_relation_infos:
                result['delegate_relation_infos'].append(k.to_map() if k else None)
        else:
            result['delegate_relation_infos'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.delegate_relation_infos = []
        if map.get('delegate_relation_infos') is not None:
            for k in map.get('delegate_relation_infos'):
                temp_model = DelegateRelationInfo()
                temp_model = temp_model.from_map(k)
                self.delegate_relation_infos.append(temp_model)
        else:
            self.delegate_relation_infos = None
        return self


class UpdateAasAntdaoConfigDelegaterelationRequest(TeaModel):
    # 被代理的租户ID
    # 代理租户ID
    # 操作类型，ADD表示添加，SUB表示撤销
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, delegated_tenant_id=None, opt_tenant_id=None, opt_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.delegated_tenant_id = delegated_tenant_id
        self.opt_tenant_id = opt_tenant_id
        self.opt_type = opt_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['opt_type'] = self.opt_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        return self


class UpdateAasAntdaoConfigDelegaterelationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoConfigWhitelistRequest(TeaModel):
    # 查询链的白名单信息
    # 查询该租户的白名单信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tenant_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.tenant_id = map.get('tenant_id')
        return self


class QueryAasAntdaoConfigWhitelistResponse(TeaModel):
    # 接口白名单信息
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, white_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.white_list = []

    def validate(self):
        if self.white_list:
            for k in self.white_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['white_list'] = []
        if self.white_list is not None:
            for k in self.white_list:
                result['white_list'].append(k.to_map() if k else None)
        else:
            result['white_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.white_list = []
        if map.get('white_list') is not None:
            for k in map.get('white_list'):
                temp_model = APIWhiteListInfo()
                temp_model = temp_model.from_map(k)
                self.white_list.append(temp_model)
        else:
            self.white_list = None
        return self


class UpdateAasAntdaoConfigWhitelistRequest(TeaModel):
    # 链ID
    # 租户ID
    # 操作类型
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, opt_tenant_id=None, opt_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.opt_tenant_id = opt_tenant_id
        self.opt_type = opt_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['opt_type'] = self.opt_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        return self


class UpdateAasAntdaoConfigWhitelistResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ApplyAasAntdaoExchangeAftersaleRequest(TeaModel):
    # 链id
    # 权益商品id
    # 额外信息 可选
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ApplyAasAntdaoExchangeAftersaleResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoExchangeAgreeaftersaleRequest(TeaModel):
    # 链id
    # 要代理操作的租户ID
    # 权益id
    # 额外信息
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    # 外部交易ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecAasAntdaoExchangeAgreeaftersaleResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class RefuseAasAntdaoExchangeAftersaleRequest(TeaModel):
    # l链id
    # 要代理操作的租户ID
    # 商品id
    # 额外信息
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    # 外部交易id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class RefuseAasAntdaoExchangeAftersaleResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class SendAasAntdaoExchangeAftersaleRequest(TeaModel):
    # 链id
    # 要代理操作的租户ID
    # 商品id
    # 发货商品的信息，敏感信息需加密，使用收货方公钥加密的权益信息。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896。比如在手机直充时可以返回 {  "voucher": "充值凭证，如有",  "memo": ""}信息。
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    # 外部交易id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class SendAasAntdaoExchangeAftersaleResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ConfirmAasAntdaoExchangeAftersaleRequest(TeaModel):
    # 链id
    # 商品id
    # 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    # 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
    # 外部交易id
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ConfirmAasAntdaoExchangeAftersaleResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class ExecAasAntdaoDataDepositRequest(TeaModel):
    # 链ID
    # 交易信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tx=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecAasAntdaoDataDepositResponse(TeaModel):
    # 存证交易哈希
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tx_hash=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.tx_hash = tx_hash

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


class SetAasAntdaoCommissionRequest(TeaModel):
    # 链ID
    # 手续费列表，可传入多个
    # 商品类型。可按照如下文档查询商品对应的类型，及数据格式 https://tech.antfin.com/docs/2/163896
    # 是否设置全局手续费。若是false，需传入optTenantId
    # 要设置手续费的租户对象，如果为空表示设置全局手续费（IfGlobal需设置为true）
    # 交易幂等ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, commissions=None, equity_type=None, if_global=None, opt_tenant_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.commissions = []
        self.equity_type = equity_type
        self.if_global = if_global
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id

    def validate(self):
        if self.commissions:
            for k in self.commissions:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['commissions'] = []
        if self.commissions is not None:
            for k in self.commissions:
                result['commissions'].append(k.to_map() if k else None)
        else:
            result['commissions'] = None
        result['equity_type'] = self.equity_type
        result['if_global'] = self.if_global
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.commissions = []
        if map.get('commissions') is not None:
            for k in map.get('commissions'):
                temp_model = Commission()
                temp_model = temp_model.from_map(k)
                self.commissions.append(temp_model)
        else:
            self.commissions = None
        self.equity_type = map.get('equity_type')
        self.if_global = map.get('if_global')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class SetAasAntdaoCommissionResponse(TeaModel):
    # 手续费ID
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, commission_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.commission_id = commission_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['commission_id'] = self.commission_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.commission_id = map.get('commission_id')
        return self


class QueryAasAntdaoCommissionRequest(TeaModel):
    # 链ID
    # 查询该租户的手续费信息
    # 商品类型。可按照如下文档查询商品对应的类型，及数据格式https://tech.antfin.com/docs/2/163896
    # 是否查询当前生效的手续费信息。如为false，则查询该商品的全部手续费信息
    # 是否查询全局的手续费信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, delegated_tenant_id=None, equity_type=None, if_current=None, if_global=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_type = equity_type
        self.if_current = if_current
        self.if_global = if_global

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_type'] = self.equity_type
        result['if_current'] = self.if_current
        result['if_global'] = self.if_global
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_type = map.get('equity_type')
        self.if_current = map.get('if_current')
        self.if_global = map.get('if_global')
        return self


class QueryAasAntdaoCommissionResponse(TeaModel):
    # 手续费信息列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, commissions=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.commissions = []

    def validate(self):
        if self.commissions:
            for k in self.commissions:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['commissions'] = []
        if self.commissions is not None:
            for k in self.commissions:
                result['commissions'].append(k.to_map() if k else None)
        else:
            result['commissions'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.commissions = []
        if map.get('commissions') is not None:
            for k in map.get('commissions'):
                temp_model = CommissionResult()
                temp_model = temp_model.from_map(k)
                self.commissions.append(temp_model)
        else:
            self.commissions = None
        return self


class SetAasAntdaoCommissionMerchantRequest(TeaModel):
    # 链ID
    # 收取手续费的商户对应的租户ID
    # 交易幂等ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, opt_tenant_id=None, out_tx_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class SetAasAntdaoCommissionMerchantResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoCommissionMerchantRequest(TeaModel):
    # 链ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        return self


class QueryAasAntdaoCommissionMerchantResponse(TeaModel):
    # 收取手续费的商户 租户ID
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tenant_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.tenant_id = map.get('tenant_id')
        return self


class QueryAasAntdaoBlockanalysisBlockRequest(TeaModel):
    # 区块高度
    # 链ID
    # 代理查询区块信息，传入代理租户需有代理权限。接口会返回调用者和被代理租户能查看的所有交易信息。
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, block_number=None, chain_id=None, delegated_tenant_ids=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.block_number = block_number
        self.chain_id = chain_id
        self.delegated_tenant_ids = []

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['block_number'] = self.block_number
        result['chain_id'] = self.chain_id
        result['delegated_tenant_ids'] = []
        if self.delegated_tenant_ids is not None:
            for k in self.delegated_tenant_ids:
                result['delegated_tenant_ids'].append(k)
        else:
            result['delegated_tenant_ids'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.block_number = map.get('block_number')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_ids = []
        if map.get('delegated_tenant_ids') is not None:
            for k in map.get('delegated_tenant_ids'):
                self.delegated_tenant_ids.append(k)
        else:
            self.delegated_tenant_ids = None
        return self


class QueryAasAntdaoBlockanalysisBlockResponse(TeaModel):
    # 区块信息
    # 区块高度
    # 链ID
    # 过滤后的交易数量
    # 区块中交易总数
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, block=None, block_number=None, chain_id=None, filtered_tx_count=None, total_tx_count=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.block = block
        self.block_number = block_number
        self.chain_id = chain_id
        self.filtered_tx_count = filtered_tx_count
        self.total_tx_count = total_tx_count

    def validate(self):
        if self.block:
            self.block.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.block is not None:
            result['block'] = self.block.to_map()
        else:
            result['block'] = None
        result['block_number'] = self.block_number
        result['chain_id'] = self.chain_id
        result['filtered_tx_count'] = self.filtered_tx_count
        result['total_tx_count'] = self.total_tx_count
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('block') is not None:
            temp_model = Block()
            self.block = temp_model.from_map(map['block'])
        else:
            self.block = None
        self.block_number = map.get('block_number')
        self.chain_id = map.get('chain_id')
        self.filtered_tx_count = map.get('filtered_tx_count')
        self.total_tx_count = map.get('total_tx_count')
        return self


class QueryAasAntdaoBlockanalysisLastblocknumberRequest(TeaModel):
    # 链ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        return self


class QueryAasAntdaoBlockanalysisLastblocknumberResponse(TeaModel):
    # 区块链最高区块高度
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, block_number=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.block_number = block_number

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['block_number'] = self.block_number
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.block_number = map.get('block_number')
        return self


class QueryAasAntdaoBlockanalysisOpenedequitiesRequest(TeaModel):
    # 链ID
    # 每页数据量
    # 页数
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, count=None, page=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.count = count
        self.page = page

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['count'] = self.count
        result['page'] = self.page
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.count = map.get('count')
        self.page = map.get('page')
        return self


class QueryAasAntdaoBlockanalysisOpenedequitiesResponse(TeaModel):
    # 权益商品信息详细信息list
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, equities=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.equities = []

    def validate(self):
        if self.equities:
            for k in self.equities:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['equities'] = []
        if self.equities is not None:
            for k in self.equities:
                result['equities'].append(k.to_map() if k else None)
        else:
            result['equities'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.equities = []
        if map.get('equities') is not None:
            for k in map.get('equities'):
                temp_model = OpenedEquity()
                temp_model = temp_model.from_map(k)
                self.equities.append(temp_model)
        else:
            self.equities = None
        return self


class QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesRequest(TeaModel):
    # 链ID
    # 每页数量
    # 页码
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, count=None, page=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.count = count
        self.page = page

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['count'] = self.count
        result['page'] = self.page
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.count = map.get('count')
        self.page = map.get('page')
        return self


class QueryAasAntdaoBlockanalysisUserpriceupdatedequitiesResponse(TeaModel):
    # 权益商品信息详细信息list
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, equities=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.equities = []

    def validate(self):
        if self.equities:
            for k in self.equities:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['equities'] = []
        if self.equities is not None:
            for k in self.equities:
                result['equities'].append(k.to_map() if k else None)
        else:
            result['equities'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.equities = []
        if map.get('equities') is not None:
            for k in map.get('equities'):
                temp_model = UserPriceEquity()
                temp_model = temp_model.from_map(k)
                self.equities.append(temp_model)
        else:
            self.equities = None
        return self


class QueryAasAntdaoBlockanalysisUnwriteoffvalueRequest(TeaModel):
    # 资产ID
    # 链ID
    # 要查询的租户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, asset_id=None, chain_id=None, opt_tenant_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.opt_tenant_id = opt_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['opt_tenant_id'] = self.opt_tenant_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        return self


class QueryAasAntdaoBlockanalysisUnwriteoffvalueResponse(TeaModel):
    # 资产ID
    # 租户ID
    # 未核销的资产总额（单位：元）
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, asset_id=None, tenant_id=None, total_value=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.asset_id = asset_id
        self.tenant_id = tenant_id
        self.total_value = total_value

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['asset_id'] = self.asset_id
        result['tenant_id'] = self.tenant_id
        result['total_value'] = self.total_value
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.asset_id = map.get('asset_id')
        self.tenant_id = map.get('tenant_id')
        self.total_value = map.get('total_value')
        return self


class UpdateAasAntdaoBlockanalysisDelegaterelationRequest(TeaModel):
    # 被代理的租户ID
    # 代理租户ID
    # 操作类型，ADD表示添加，SUB表示撤销
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, delegated_tenant_id=None, opt_tenant_id=None, opt_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.delegated_tenant_id = delegated_tenant_id
        self.opt_tenant_id = opt_tenant_id
        self.opt_type = opt_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['opt_type'] = self.opt_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        return self


class UpdateAasAntdaoBlockanalysisDelegaterelationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class UpdateAasAntdaoBlockanalysisWhitelistRequest(TeaModel):
    # 链ID
    # 租户ID
    # 操作类型
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, opt_tenant_id=None, opt_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.opt_tenant_id = opt_tenant_id
        self.opt_type = opt_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['opt_type'] = self.opt_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        return self


class UpdateAasAntdaoBlockanalysisWhitelistResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg

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


class QueryAasAntdaoBlockanalysisDelegaterelationRequest(TeaModel):
    # 被代理的租户ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, delegated_tenant_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.delegated_tenant_id = delegated_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['delegated_tenant_id'] = self.delegated_tenant_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        return self


class QueryAasAntdaoBlockanalysisDelegaterelationResponse(TeaModel):
    # 代理授权关系信息
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, delegate_relation_infos=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.delegate_relation_infos = []

    def validate(self):
        if self.delegate_relation_infos:
            for k in self.delegate_relation_infos:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['delegate_relation_infos'] = []
        if self.delegate_relation_infos is not None:
            for k in self.delegate_relation_infos:
                result['delegate_relation_infos'].append(k.to_map() if k else None)
        else:
            result['delegate_relation_infos'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.delegate_relation_infos = []
        if map.get('delegate_relation_infos') is not None:
            for k in map.get('delegate_relation_infos'):
                temp_model = DelegateRelationInfo()
                temp_model = temp_model.from_map(k)
                self.delegate_relation_infos.append(temp_model)
        else:
            self.delegate_relation_infos = None
        return self


class QueryAasAntdaoBlockanalysisWhitelistRequest(TeaModel):
    # 查询链的白名单信息
    # 查询该租户的白名单信息
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tenant_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.tenant_id = map.get('tenant_id')
        return self


class QueryAasAntdaoBlockanalysisWhitelistResponse(TeaModel):
    # 接口白名单信息
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, white_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.white_list = []

    def validate(self):
        if self.white_list:
            for k in self.white_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['white_list'] = []
        if self.white_list is not None:
            for k in self.white_list:
                result['white_list'].append(k.to_map() if k else None)
        else:
            result['white_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.white_list = []
        if map.get('white_list') is not None:
            for k in map.get('white_list'):
                temp_model = APIWhiteListInfo()
                temp_model = temp_model.from_map(k)
                self.white_list.append(temp_model)
        else:
            self.white_list = None
        return self


class QueryAasAntdaoBlockanalysisTransactionRequest(TeaModel):
    # 链ID
    # 交易hash
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, tx_hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.tx_hash = map.get('tx_hash')
        return self


class QueryAasAntdaoBlockanalysisTransactionResponse(TeaModel):
    # 区块高度
    # 交易数据，hex格式
    # 交易发起方
    # 交易单据信息
    # 交易时间戳
    # 交易接收方
    # 交易hash
    # 交易类型
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, block_number=None, data=None, from_=None, receipt=None, timestamp=None, to=None, tx_hash=None, tx_type=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.block_number = block_number
        self.data = data
        self.from_ = from_
        self.receipt = receipt
        self.timestamp = timestamp
        self.to = to
        self.tx_hash = tx_hash
        self.tx_type = tx_type

    def validate(self):
        if self.receipt:
            self.receipt.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['block_number'] = self.block_number
        result['data'] = self.data
        result['from'] = self.from_
        if self.receipt is not None:
            result['receipt'] = self.receipt.to_map()
        else:
            result['receipt'] = None
        result['timestamp'] = self.timestamp
        result['to'] = self.to
        result['tx_hash'] = self.tx_hash
        result['tx_type'] = self.tx_type
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.block_number = map.get('block_number')
        self.data = map.get('data')
        self.from_ = map.get('from')
        if map.get('receipt') is not None:
            temp_model = BlockReceipt()
            self.receipt = temp_model.from_map(map['receipt'])
        else:
            self.receipt = None
        self.timestamp = map.get('timestamp')
        self.to = map.get('to')
        self.tx_hash = map.get('tx_hash')
        self.tx_type = map.get('tx_type')
        return self


class QueryAasAntdaoMypointsSkuRequest(TeaModel):
    # 区块链ID
    # 环境标识
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, env=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.env = env

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        return self


class QueryAasAntdaoMypointsSkuResponse(TeaModel):
    # 商品列表
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, skus=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.skus = []

    def validate(self):
        if self.skus:
            for k in self.skus:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['skus'] = []
        if self.skus is not None:
            for k in self.skus:
                result['skus'].append(k.to_map() if k else None)
        else:
            result['skus'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.skus = []
        if map.get('skus') is not None:
            for k in map.get('skus'):
                temp_model = SKUItem()
                temp_model = temp_model.from_map(k)
                self.skus.append(temp_model)
        else:
            self.skus = None
        return self


class QueryAasAntdaoMypointsMerchantbalanceRequest(TeaModel):
    # 链ID
    # 环境标识
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, env=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.env = env

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        return self


class QueryAasAntdaoMypointsMerchantbalanceResponse(TeaModel):
    # 积分库可用余额
    # 预算库余额
    # 预算库代码
    # 商户的支付宝商家ID
    # 积分库余额
    # 积分库代码
    # 商户的金融云租户ID
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, budget_available_balance=None, budget_balance=None, budget_code=None, pid=None, point_lib_balance=None, point_lib_code=None, tenant_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.budget_available_balance = budget_available_balance
        self.budget_balance = budget_balance
        self.budget_code = budget_code
        self.pid = pid
        self.point_lib_balance = point_lib_balance
        self.point_lib_code = point_lib_code
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['budget_available_balance'] = self.budget_available_balance
        result['budget_balance'] = self.budget_balance
        result['budget_code'] = self.budget_code
        result['pid'] = self.pid
        result['point_lib_balance'] = self.point_lib_balance
        result['point_lib_code'] = self.point_lib_code
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.budget_available_balance = map.get('budget_available_balance')
        self.budget_balance = map.get('budget_balance')
        self.budget_code = map.get('budget_code')
        self.pid = map.get('pid')
        self.point_lib_balance = map.get('point_lib_balance')
        self.point_lib_code = map.get('point_lib_code')
        self.tenant_id = map.get('tenant_id')
        return self


class ExecAasAntdaoMypointsPreorderskuRequest(TeaModel):
    # 链ID
    # 预下单数量
    # 环境标识
    # 备注
    # 业务幂等号，商户需要保证每笔订单号唯一
    # 商品ID
    # 总花费花费(询价接口结果)
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, count=None, env=None, memo=None, order_no=None, sku_id=None, total_cost=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.count = count
        self.env = env
        self.memo = memo
        self.order_no = order_no
        self.sku_id = sku_id
        self.total_cost = total_cost

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['count'] = self.count
        result['env'] = self.env
        result['memo'] = self.memo
        result['order_no'] = self.order_no
        result['sku_id'] = self.sku_id
        result['total_cost'] = self.total_cost
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.count = map.get('count')
        self.env = map.get('env')
        self.memo = map.get('memo')
        self.order_no = map.get('order_no')
        self.sku_id = map.get('sku_id')
        self.total_cost = map.get('total_cost')
        return self


class ExecAasAntdaoMypointsPreorderskuResponse(TeaModel):
    # 数量
    # 是否需要重试
    # 业务幂等ID
    # 预下单Id
    # 商品ID
    # 总集分宝数量(单位:个)
    # 总费用
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, count=None, need_retry=None, order_no=None, pre_order_id=None, sku_id=None, total_amount=None, total_cost=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.count = count
        self.need_retry = need_retry
        self.order_no = order_no
        self.pre_order_id = pre_order_id
        self.sku_id = sku_id
        self.total_amount = total_amount
        self.total_cost = total_cost

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['count'] = self.count
        result['need_retry'] = self.need_retry
        result['order_no'] = self.order_no
        result['pre_order_id'] = self.pre_order_id
        result['sku_id'] = self.sku_id
        result['total_amount'] = self.total_amount
        result['total_cost'] = self.total_cost
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.count = map.get('count')
        self.need_retry = map.get('need_retry')
        self.order_no = map.get('order_no')
        self.pre_order_id = map.get('pre_order_id')
        self.sku_id = map.get('sku_id')
        self.total_amount = map.get('total_amount')
        self.total_cost = map.get('total_cost')
        return self


class ExecAasAntdaoMypointsOrderskuRequest(TeaModel):
    # 链ID
    # 环境标识
    # 业务幂等号
    # 手机号
    # 预下单号
    # 商品ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, env=None, order_no=None, phone_number=None, pre_order_id=None, sku_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.env = env
        self.order_no = order_no
        self.phone_number = phone_number
        self.pre_order_id = pre_order_id
        self.sku_id = sku_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        result['order_no'] = self.order_no
        result['phone_number'] = self.phone_number
        result['pre_order_id'] = self.pre_order_id
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        self.order_no = map.get('order_no')
        self.phone_number = map.get('phone_number')
        self.pre_order_id = map.get('pre_order_id')
        self.sku_id = map.get('sku_id')
        return self


class ExecAasAntdaoMypointsOrderskuResponse(TeaModel):
    # 卡密ID
    # 集分宝卡密的面值(单位:个)
    # 是否需要重试
    # 业务幂等ID
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, card_id=None, card_value=None, need_retry=None, order_no=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.card_id = card_id
        self.card_value = card_value
        self.need_retry = need_retry
        self.order_no = order_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['card_id'] = self.card_id
        result['card_value'] = self.card_value
        result['need_retry'] = self.need_retry
        result['order_no'] = self.order_no
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.card_id = map.get('card_id')
        self.card_value = map.get('card_value')
        self.need_retry = map.get('need_retry')
        self.order_no = map.get('order_no')
        return self


class QueryAasAntdaoMypointsSkufeeRequest(TeaModel):
    # 链ID
    # 预下单数量
    # 环境标识(sandbox/prod)
    # 备注信息
    # 业务幂等号
    # 商品ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, count=None, env=None, memo=None, order_no=None, sku_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.count = count
        self.env = env
        self.memo = memo
        self.order_no = order_no
        self.sku_id = sku_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['count'] = self.count
        result['env'] = self.env
        result['memo'] = self.memo
        result['order_no'] = self.order_no
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.count = map.get('count')
        self.env = map.get('env')
        self.memo = map.get('memo')
        self.order_no = map.get('order_no')
        self.sku_id = map.get('sku_id')
        return self


class QueryAasAntdaoMypointsSkufeeResponse(TeaModel):
    # 预下单的数量
    # 费率
    # 商品ID
    # 总集分宝数量（个）
    # 总费用
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, count=None, rate=None, sku_id=None, total_amount=None, total_cost=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.count = count
        self.rate = rate
        self.sku_id = sku_id
        self.total_amount = total_amount
        self.total_cost = total_cost

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['count'] = self.count
        result['rate'] = self.rate
        result['sku_id'] = self.sku_id
        result['total_amount'] = self.total_amount
        result['total_cost'] = self.total_cost
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.count = map.get('count')
        self.rate = map.get('rate')
        self.sku_id = map.get('sku_id')
        self.total_amount = map.get('total_amount')
        self.total_cost = map.get('total_cost')
        return self


class QueryAasAntdaoMypointsPreorderinstructionRequest(TeaModel):
    # 链ID
    # 环境标识
    # 业务幂等ID
    # 商品ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, env=None, order_no=None, sku_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.env = env
        self.order_no = order_no
        self.sku_id = sku_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        result['order_no'] = self.order_no
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        self.order_no = map.get('order_no')
        self.sku_id = map.get('sku_id')
        return self


class QueryAasAntdaoMypointsPreorderinstructionResponse(TeaModel):
    # 业务请求单号
    # 商家的预算库代码
    # 链ID
    # 环境标识
    # 扩展信息
    # 备注信息
    # 商家在支付宝域的标识
    # 集分宝SKU预下单ID
    # 集分宝产品码
    # 订单中剩余的可下单商品数量
    # 包含集分宝数量(个)
    # 集分宝SKU的ID
    # SKU面值
    # 流水状态(0初始状态, 1采购失败可重试, 2采购失败不可重试, 3采购成功, 4预算库创建失败可重试, 5预算库创建失败不可重试, 6预算库叉棍见成功, 7预算调拨失败可重试, 8预算库调拨失败不可重试, 9预算库调拨成功)
    # 商户在金融云的租户ID
    # 总下单集分宝数量
    # 集分宝SKU的预下单数量
    # 总下单金额
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, biz_id=None, budget_code=None, chain_id=None, env=None, extend_info=None, memo=None, pid=None, pre_order_id=None, product_code=None, remain_count=None, sku_amount=None, sku_id=None, sku_value=None, status=None, tenant_id=None, total_amount=None, total_count=None, total_value=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.biz_id = biz_id
        self.budget_code = budget_code
        self.chain_id = chain_id
        self.env = env
        self.extend_info = extend_info
        self.memo = memo
        self.pid = pid
        self.pre_order_id = pre_order_id
        self.product_code = product_code
        self.remain_count = remain_count
        self.sku_amount = sku_amount
        self.sku_id = sku_id
        self.sku_value = sku_value
        self.status = status
        self.tenant_id = tenant_id
        self.total_amount = total_amount
        self.total_count = total_count
        self.total_value = total_value

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['biz_id'] = self.biz_id
        result['budget_code'] = self.budget_code
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        result['extend_info'] = self.extend_info
        result['memo'] = self.memo
        result['pid'] = self.pid
        result['pre_order_id'] = self.pre_order_id
        result['product_code'] = self.product_code
        result['remain_count'] = self.remain_count
        result['sku_amount'] = self.sku_amount
        result['sku_id'] = self.sku_id
        result['sku_value'] = self.sku_value
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        result['total_amount'] = self.total_amount
        result['total_count'] = self.total_count
        result['total_value'] = self.total_value
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.biz_id = map.get('biz_id')
        self.budget_code = map.get('budget_code')
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        self.extend_info = map.get('extend_info')
        self.memo = map.get('memo')
        self.pid = map.get('pid')
        self.pre_order_id = map.get('pre_order_id')
        self.product_code = map.get('product_code')
        self.remain_count = map.get('remain_count')
        self.sku_amount = map.get('sku_amount')
        self.sku_id = map.get('sku_id')
        self.sku_value = map.get('sku_value')
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        self.total_amount = map.get('total_amount')
        self.total_count = map.get('total_count')
        self.total_value = map.get('total_value')
        return self


class QueryAasAntdaoMypointsOrderinstructionRequest(TeaModel):
    # 链ID
    # 环境标识
    # 业务幂等号
    # SKU ID
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, chain_id=None, env=None, order_no=None, sku_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.chain_id = chain_id
        self.env = env
        self.order_no = order_no
        self.sku_id = sku_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        result['order_no'] = self.order_no
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        self.order_no = map.get('order_no')
        self.sku_id = map.get('sku_id')
        return self


class QueryAasAntdaoMypointsOrderinstructionResponse(TeaModel):
    # 业务请求单号
    # 链ID
    # 环境标识
    # 扩展信息
    # 订单ID(env+chain_id+tenant_id+sku_id+biz_id)
    # 预下单ID
    # 包含集分宝数量(个)
    # SKU ID
    # 面值
    # 状态(0:初始,1:失败可重试,2:失败不可重试,3:成功)
    # 商家在金融云的租户ID
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, biz_id=None, chain_id=None, env=None, extend_info=None, order_id=None, pre_order_id=None, sku_amount=None, sku_id=None, sku_value=None, status=None, tenant_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.biz_id = biz_id
        self.chain_id = chain_id
        self.env = env
        self.extend_info = extend_info
        self.order_id = order_id
        self.pre_order_id = pre_order_id
        self.sku_amount = sku_amount
        self.sku_id = sku_id
        self.sku_value = sku_value
        self.status = status
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['biz_id'] = self.biz_id
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        result['extend_info'] = self.extend_info
        result['order_id'] = self.order_id
        result['pre_order_id'] = self.pre_order_id
        result['sku_amount'] = self.sku_amount
        result['sku_id'] = self.sku_id
        result['sku_value'] = self.sku_value
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.biz_id = map.get('biz_id')
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        self.extend_info = map.get('extend_info')
        self.order_id = map.get('order_id')
        self.pre_order_id = map.get('pre_order_id')
        self.sku_amount = map.get('sku_amount')
        self.sku_id = map.get('sku_id')
        self.sku_value = map.get('sku_value')
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        return self
