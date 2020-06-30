# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel

"""
Model for initing client
"""


class Config(TeaModel):
    def __init__(self, access_key_id=None, access_key_secret=None, auth_token=None, protocol=None, region_id=None, read_timeout=None, connect_timeout=None, http_proxy=None, https_proxy=None, endpoint=None, no_proxy=None, max_idle_conns=None, user_agent=None, socks_5proxy=None, socks_5net_work=None, tenant=None, workspace=None):
        self.access_key_id = access_key_id
        self.access_key_secret = access_key_secret
        self.auth_token = auth_token
        self.protocol = protocol
        self.region_id = region_id
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
        self.tenant = tenant
        self.workspace = workspace

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['accessKeyId'] = self.access_key_id
        result['accessKeySecret'] = self.access_key_secret
        result['authToken'] = self.auth_token
        result['protocol'] = self.protocol
        result['regionId'] = self.region_id
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
        result['tenant'] = self.tenant
        result['workspace'] = self.workspace
        return result

    def from_map(self, map={}):
        self.access_key_id = map.get('accessKeyId')
        self.access_key_secret = map.get('accessKeySecret')
        self.auth_token = map.get('authToken')
        self.protocol = map.get('protocol')
        self.region_id = map.get('regionId')
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
        self.tenant = map.get('tenant')
        self.workspace = map.get('workspace')
        return self


class LogEntry(TeaModel):
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
    def __init__(self, price=None, ratio=None, snapshot_tenant_price=None, user_price_type=None):
        self.price = price
        self.ratio = ratio
        self.snapshot_tenant_price = snapshot_tenant_price
        self.user_price_type = user_price_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['price'] = self.price
        result['ratio'] = self.ratio
        result['snapshot_tenant_price'] = self.snapshot_tenant_price
        result['user_price_type'] = self.user_price_type
        return result

    def from_map(self, map={}):
        self.price = map.get('price')
        self.ratio = map.get('ratio')
        self.snapshot_tenant_price = map.get('snapshot_tenant_price')
        self.user_price_type = map.get('user_price_type')
        return self


class BlockTransaction(TeaModel):
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
    def __init__(self, limit_per_day_used=None, limit_per_month_used=None, open_to_tenant_id=None, target_date=None, tenant_price=None, tenant_user_price=None):
        self.limit_per_day_used = limit_per_day_used
        self.limit_per_month_used = limit_per_month_used
        self.open_to_tenant_id = open_to_tenant_id
        self.target_date = target_date
        self.tenant_price = tenant_price
        self.tenant_user_price = tenant_user_price

    def validate(self):
        if self.tenant_user_price:
            self.tenant_user_price.validate()

    def to_map(self):
        result = {}
        result['limit_per_day_used'] = self.limit_per_day_used
        result['limit_per_month_used'] = self.limit_per_month_used
        result['open_to_tenant_id'] = self.open_to_tenant_id
        result['target_date'] = self.target_date
        result['tenant_price'] = self.tenant_price
        if self.tenant_user_price is not None:
            result['tenant_user_price'] = self.tenant_user_price.to_map()
        else:
            result['tenant_user_price'] = None
        return result

    def from_map(self, map={}):
        self.limit_per_day_used = map.get('limit_per_day_used')
        self.limit_per_month_used = map.get('limit_per_month_used')
        self.open_to_tenant_id = map.get('open_to_tenant_id')
        self.target_date = map.get('target_date')
        self.tenant_price = map.get('tenant_price')
        if map.get('tenant_user_price') is not None:
            temp_model = UserPrice()
            self.tenant_user_price = temp_model.from_map(map['tenant_user_price'])
        else:
            self.tenant_user_price = None
        return self


class EquityDetail(TeaModel):
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


class MultiURL(TeaModel):
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


class UserPriceEquity(TeaModel):
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


class ExecCardForbiddenRequest(TeaModel):
    def __init__(self, chain_id=None, tx=None):
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecCardForbiddenResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryMypointsOrderinstructionRequest(TeaModel):
    def __init__(self, chain_id=None, env=None, order_no=None, sku_id=None):
        self.chain_id = chain_id
        self.env = env
        self.order_no = order_no
        self.sku_id = sku_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        result['order_no'] = self.order_no
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        self.order_no = map.get('order_no')
        self.sku_id = map.get('sku_id')
        return self


class QueryMypointsOrderinstructionResponse(TeaModel):
    def __init__(self, biz_id=None, budget_code=None, chain_id=None, env=None, extend_info=None, order_id=None, sku_amount=None, sku_id=None, sku_value=None, status=None, tenant_id=None):
        self.biz_id = biz_id
        self.budget_code = budget_code
        self.chain_id = chain_id
        self.env = env
        self.extend_info = extend_info
        self.order_id = order_id
        self.sku_amount = sku_amount
        self.sku_id = sku_id
        self.sku_value = sku_value
        self.status = status
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['biz_id'] = self.biz_id
        result['budget_code'] = self.budget_code
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        result['extend_info'] = self.extend_info
        result['order_id'] = self.order_id
        result['sku_amount'] = self.sku_amount
        result['sku_id'] = self.sku_id
        result['sku_value'] = self.sku_value
        result['status'] = self.status
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.biz_id = map.get('biz_id')
        self.budget_code = map.get('budget_code')
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        self.extend_info = map.get('extend_info')
        self.order_id = map.get('order_id')
        self.sku_amount = map.get('sku_amount')
        self.sku_id = map.get('sku_id')
        self.sku_value = map.get('sku_value')
        self.status = map.get('status')
        self.tenant_id = map.get('tenant_id')
        return self


class QueryBlockanalysisBlockRequest(TeaModel):
    def __init__(self, block_number=None, chain_id=None, delegated_tenant_ids=None):
        self.block_number = block_number
        self.chain_id = chain_id
        self.delegated_tenant_ids = []

    def validate(self):
        pass

    def to_map(self):
        result = {}
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
        self.block_number = map.get('block_number')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_ids = []
        if map.get('delegated_tenant_ids') is not None:
            for k in map.get('delegated_tenant_ids'):
                self.delegated_tenant_ids.append(k)
        else:
            self.delegated_tenant_ids = None
        return self


class QueryBlockanalysisBlockResponse(TeaModel):
    def __init__(self, block=None, block_number=None, chain_id=None, filtered_tx_count=None, total_tx_count=None):
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


class UpdateEquityDefaultpriceRequest(TeaModel):
    def __init__(self, amount=None, chain_id=None, delegated_tenant_id=None, equity_id=None, out_tx_id=None):
        self.amount = amount
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['amount'] = self.amount
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class UpdateEquityDefaultpriceResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class CreateMerchantProvisionRequest(TeaModel):
    def __init__(self, chain_id=None, currency=None, opt_tenant_id=None, out_tx_id=None):
        self.chain_id = chain_id
        self.currency = currency
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['currency'] = self.currency
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.currency = map.get('currency')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class CreateMerchantProvisionResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecMypointsOrderskuRequest(TeaModel):
    def __init__(self, chain_id=None, env=None, order_no=None, phone_number=None, pre_order_id=None, sku_id=None):
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
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        result['order_no'] = self.order_no
        result['phone_number'] = self.phone_number
        result['pre_order_id'] = self.pre_order_id
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        self.order_no = map.get('order_no')
        self.phone_number = map.get('phone_number')
        self.pre_order_id = map.get('pre_order_id')
        self.sku_id = map.get('sku_id')
        return self


class ExecMypointsOrderskuResponse(TeaModel):
    def __init__(self, card_id=None, card_value=None, order_no=None, url=None):
        self.card_id = card_id
        self.card_value = card_value
        self.order_no = order_no
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['card_id'] = self.card_id
        result['card_value'] = self.card_value
        result['order_no'] = self.order_no
        result['url'] = self.url
        return result

    def from_map(self, map={}):
        self.card_id = map.get('card_id')
        self.card_value = map.get('card_value')
        self.order_no = map.get('order_no')
        self.url = map.get('url')
        return self


class SetMerchantProvisionRequest(TeaModel):
    def __init__(self, chain_id=None, credit_max_amount=None, credit_used_amount=None, currency=None, debit_amount=None, opt_tenant_id=None, original_credit_max_amount=None, original_credit_used_amount=None, original_debit_amount=None, out_tx_id=None):
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


class SetMerchantProvisionResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryBlockanalysisDelegaterelationRequest(TeaModel):
    def __init__(self, delegated_tenant_id=None):
        self.delegated_tenant_id = delegated_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['delegated_tenant_id'] = self.delegated_tenant_id
        return result

    def from_map(self, map={}):
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        return self


class QueryBlockanalysisDelegaterelationResponse(TeaModel):
    def __init__(self, delegate_relation_infos=None):
        self.delegate_relation_infos = []

    def validate(self):
        if self.delegate_relation_infos:
            for k in self.delegate_relation_infos:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['delegate_relation_infos'] = []
        if self.delegate_relation_infos is not None:
            for k in self.delegate_relation_infos:
                result['delegate_relation_infos'].append(k.to_map() if k else None)
        else:
            result['delegate_relation_infos'] = None
        return result

    def from_map(self, map={}):
        self.delegate_relation_infos = []
        if map.get('delegate_relation_infos') is not None:
            for k in map.get('delegate_relation_infos'):
                temp_model = DelegateRelationInfo()
                temp_model = temp_model.from_map(k)
                self.delegate_relation_infos.append(temp_model)
        else:
            self.delegate_relation_infos = None
        return self


class ExecCardQueryRequest(TeaModel):
    def __init__(self, chain_id=None, tx=None):
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecCardQueryResponse(TeaModel):
    def __init__(self, card=None):
        self.card = card

    def validate(self):
        if self.card:
            self.card.validate()

    def to_map(self):
        result = {}
        if self.card is not None:
            result['card'] = self.card.to_map()
        else:
            result['card'] = None
        return result

    def from_map(self, map={}):
        if map.get('card') is not None:
            temp_model = Card()
            self.card = temp_model.from_map(map['card'])
        else:
            self.card = None
        return self


class UpdateEquityExchangelimitRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, limit_per_merchant_and_day=None, limit_per_merchant_and_montn=None, limit_per_user_and_day=None, limit_per_user_and_month=None, out_tx_id=None):
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
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.limit_per_merchant_and_day = map.get('limit_per_merchant_and_day')
        self.limit_per_merchant_and_montn = map.get('limit_per_merchant_and_montn')
        self.limit_per_user_and_day = map.get('limit_per_user_and_day')
        self.limit_per_user_and_month = map.get('limit_per_user_and_month')
        self.out_tx_id = map.get('out_tx_id')
        return self


class UpdateEquityExchangelimitResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryMypointsPreorderinstructionRequest(TeaModel):
    def __init__(self, chain_id=None, env=None, order_no=None, sku_id=None):
        self.chain_id = chain_id
        self.env = env
        self.order_no = order_no
        self.sku_id = sku_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        result['order_no'] = self.order_no
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        self.order_no = map.get('order_no')
        self.sku_id = map.get('sku_id')
        return self


class QueryMypointsPreorderinstructionResponse(TeaModel):
    def __init__(self, biz_id=None, budget_code=None, chain_id=None, env=None, extend_info=None, pid=None, point_lib_code=None, pre_order_id=None, remain_count=None, sku_amount=None, sku_id=None, sku_value=None, status=None, tenant_id=None, total_amount=None, total_count=None, total_value=None):
        self.biz_id = biz_id
        self.budget_code = budget_code
        self.chain_id = chain_id
        self.env = env
        self.extend_info = extend_info
        self.pid = pid
        self.point_lib_code = point_lib_code
        self.pre_order_id = pre_order_id
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
        result['biz_id'] = self.biz_id
        result['budget_code'] = self.budget_code
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        result['extend_info'] = self.extend_info
        result['pid'] = self.pid
        result['point_lib_code'] = self.point_lib_code
        result['pre_order_id'] = self.pre_order_id
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
        self.biz_id = map.get('biz_id')
        self.budget_code = map.get('budget_code')
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        self.extend_info = map.get('extend_info')
        self.pid = map.get('pid')
        self.point_lib_code = map.get('point_lib_code')
        self.pre_order_id = map.get('pre_order_id')
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


class UpdateBlockanalysisDelegaterelationRequest(TeaModel):
    def __init__(self, delegated_tenant_id=None, opt_tenant_id=None, opt_type=None):
        self.delegated_tenant_id = delegated_tenant_id
        self.opt_tenant_id = opt_tenant_id
        self.opt_type = opt_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['opt_type'] = self.opt_type
        return result

    def from_map(self, map={}):
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        return self


class UpdateBlockanalysisDelegaterelationResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class UpdateMerchantProvisionRequest(TeaModel):
    def __init__(self, chain_id=None, credit_max_amount=None, credit_used_amount=None, currency=None, debit_amount=None, opt_tenant_id=None, opt_type=None, out_tx_id=None):
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
        self.chain_id = map.get('chain_id')
        self.credit_max_amount = map.get('credit_max_amount')
        self.credit_used_amount = map.get('credit_used_amount')
        self.currency = map.get('currency')
        self.debit_amount = map.get('debit_amount')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        self.out_tx_id = map.get('out_tx_id')
        return self


class UpdateMerchantProvisionResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class FreezeEquityRequest(TeaModel):
    def __init__(self, chain_id=None, equity_id=None, out_tx_id=None):
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class FreezeEquityResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecCardWriteoffRequest(TeaModel):
    def __init__(self, chain_id=None, tx=None):
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecCardWriteoffResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryMerchantUserRequest(TeaModel):
    def __init__(self, chain_id=None, local_id=None):
        self.chain_id = chain_id
        self.local_id = local_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['local_id'] = self.local_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.local_id = map.get('local_id')
        return self


class QueryMerchantUserResponse(TeaModel):
    def __init__(self, user=None):
        self.user = user

    def validate(self):
        if self.user:
            self.user.validate()

    def to_map(self):
        result = {}
        if self.user is not None:
            result['user'] = self.user.to_map()
        else:
            result['user'] = None
        return result

    def from_map(self, map={}):
        if map.get('user') is not None:
            temp_model = User()
            self.user = temp_model.from_map(map['user'])
        else:
            self.user = None
        return self


class QueryBlockLastblocknumberRequest(TeaModel):
    def __init__(self, chain_id=None):
        self.chain_id = chain_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        return self


class QueryBlockLastblocknumberResponse(TeaModel):
    def __init__(self, last_block_number=None):
        self.last_block_number = last_block_number

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['last_block_number'] = self.last_block_number
        return result

    def from_map(self, map={}):
        self.last_block_number = map.get('last_block_number')
        return self


class QueryEquityInstructionRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, opt_tenant_id=None, origin_tx_id=None):
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.opt_tenant_id = opt_tenant_id
        self.origin_tx_id = origin_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['origin_tx_id'] = self.origin_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.origin_tx_id = map.get('origin_tx_id')
        return self


class QueryEquityInstructionResponse(TeaModel):
    def __init__(self, instruction=None):
        self.instruction = instruction

    def validate(self):
        if self.instruction:
            self.instruction.validate()

    def to_map(self):
        result = {}
        if self.instruction is not None:
            result['instruction'] = self.instruction.to_map()
        else:
            result['instruction'] = None
        return result

    def from_map(self, map={}):
        if map.get('instruction') is not None:
            temp_model = EInstruction()
            self.instruction = temp_model.from_map(map['instruction'])
        else:
            self.instruction = None
        return self


class QueryMerchantProvisionsRequest(TeaModel):
    def __init__(self, business_action=None, opt_tenant_id=None, product_code=None):
        self.business_action = business_action
        self.opt_tenant_id = opt_tenant_id
        self.product_code = product_code

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['business_action'] = self.business_action
        result['opt_tenant_id'] = self.opt_tenant_id
        result['product_code'] = self.product_code
        return result

    def from_map(self, map={}):
        self.business_action = map.get('business_action')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.product_code = map.get('product_code')
        return self


class QueryMerchantProvisionsResponse(TeaModel):
    def __init__(self, discrete_values=None):
        self.discrete_values = []

    def validate(self):
        if self.discrete_values:
            for k in self.discrete_values:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['discrete_values'] = []
        if self.discrete_values is not None:
            for k in self.discrete_values:
                result['discrete_values'].append(k.to_map() if k else None)
        else:
            result['discrete_values'] = None
        return result

    def from_map(self, map={}):
        self.discrete_values = []
        if map.get('discrete_values') is not None:
            for k in map.get('discrete_values'):
                temp_model = DiscreteValue()
                temp_model = temp_model.from_map(k)
                self.discrete_values.append(temp_model)
        else:
            self.discrete_values = None
        return self


class QueryConfigDelegaterelationRequest(TeaModel):
    def __init__(self, delegated_tenant_id=None):
        self.delegated_tenant_id = delegated_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['delegated_tenant_id'] = self.delegated_tenant_id
        return result

    def from_map(self, map={}):
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        return self


class QueryConfigDelegaterelationResponse(TeaModel):
    def __init__(self, delegate_relation_infos=None):
        self.delegate_relation_infos = []

    def validate(self):
        if self.delegate_relation_infos:
            for k in self.delegate_relation_infos:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['delegate_relation_infos'] = []
        if self.delegate_relation_infos is not None:
            for k in self.delegate_relation_infos:
                result['delegate_relation_infos'].append(k.to_map() if k else None)
        else:
            result['delegate_relation_infos'] = None
        return result

    def from_map(self, map={}):
        self.delegate_relation_infos = []
        if map.get('delegate_relation_infos') is not None:
            for k in map.get('delegate_relation_infos'):
                temp_model = DelegateRelationInfo()
                temp_model = temp_model.from_map(k)
                self.delegate_relation_infos.append(temp_model)
        else:
            self.delegate_relation_infos = None
        return self


class ExecExchangeByuserRequest(TeaModel):
    def __init__(self, asset_id=None, asset_issuer=None, asset_rate=None, chain_id=None, delegated_tenant_id=None, equity_id=None, equity_provider=None, equity_rate=None, memo=None, out_tx_id=None, user_id=None):
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


class ExecExchangeByuserResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryMypointsMerchantbalanceRequest(TeaModel):
    def __init__(self, chain_id=None, env=None):
        self.chain_id = chain_id
        self.env = env

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        return self


class QueryMypointsMerchantbalanceResponse(TeaModel):
    def __init__(self, budget_available_balance=None, budget_balance=None, budget_code=None, pid=None, point_lib_balance=None, point_lib_code=None, tenant_id=None):
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
        result['budget_available_balance'] = self.budget_available_balance
        result['budget_balance'] = self.budget_balance
        result['budget_code'] = self.budget_code
        result['pid'] = self.pid
        result['point_lib_balance'] = self.point_lib_balance
        result['point_lib_code'] = self.point_lib_code
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.budget_available_balance = map.get('budget_available_balance')
        self.budget_balance = map.get('budget_balance')
        self.budget_code = map.get('budget_code')
        self.pid = map.get('pid')
        self.point_lib_balance = map.get('point_lib_balance')
        self.point_lib_code = map.get('point_lib_code')
        self.tenant_id = map.get('tenant_id')
        return self


class QueryBlockRequest(TeaModel):
    def __init__(self, block_number=None, chain_id=None):
        self.block_number = block_number
        self.chain_id = chain_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['block_number'] = self.block_number
        result['chain_id'] = self.chain_id
        return result

    def from_map(self, map={}):
        self.block_number = map.get('block_number')
        self.chain_id = map.get('chain_id')
        return self


class QueryBlockResponse(TeaModel):
    def __init__(self, block=None, block_number=None, chain_id=None, filtered_tx_count=None, total_tx_count=None):
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


class QueryMerchantRequest(TeaModel):
    def __init__(self, chain_id=None, currency=None, delegated_tenant_id=None):
        self.chain_id = chain_id
        self.currency = currency
        self.delegated_tenant_id = delegated_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['currency'] = self.currency
        result['delegated_tenant_id'] = self.delegated_tenant_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.currency = map.get('currency')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        return self


class QueryMerchantResponse(TeaModel):
    def __init__(self, block_number=None, merchant=None):
        self.block_number = block_number
        self.merchant = merchant

    def validate(self):
        if self.merchant:
            self.merchant.validate()

    def to_map(self):
        result = {}
        result['block_number'] = self.block_number
        if self.merchant is not None:
            result['merchant'] = self.merchant.to_map()
        else:
            result['merchant'] = None
        return result

    def from_map(self, map={}):
        self.block_number = map.get('block_number')
        if map.get('merchant') is not None:
            temp_model = Merchant()
            self.merchant = temp_model.from_map(map['merchant'])
        else:
            self.merchant = None
        return self


class UpdateConfigDelegaterelationRequest(TeaModel):
    def __init__(self, delegated_tenant_id=None, opt_tenant_id=None, opt_type=None):
        self.delegated_tenant_id = delegated_tenant_id
        self.opt_tenant_id = opt_tenant_id
        self.opt_type = opt_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['opt_type'] = self.opt_type
        return result

    def from_map(self, map={}):
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        return self


class UpdateConfigDelegaterelationResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecPkiDecryptRequest(TeaModel):
    def __init__(self, account_id=None, delegated_tenant_id=None, encrypted_content=None):
        self.account_id = account_id
        self.delegated_tenant_id = delegated_tenant_id
        self.encrypted_content = encrypted_content

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['account_id'] = self.account_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['encrypted_content'] = self.encrypted_content
        return result

    def from_map(self, map={}):
        self.account_id = map.get('account_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.encrypted_content = map.get('encrypted_content')
        return self


class ExecPkiDecryptResponse(TeaModel):
    def __init__(self, content=None):
        self.content = content

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['content'] = self.content
        return result

    def from_map(self, map={}):
        self.content = map.get('content')
        return self


class QueryBlockanalysisUserpriceupdatedequitiesRequest(TeaModel):
    def __init__(self, chain_id=None, count=None, page=None):
        self.chain_id = chain_id
        self.count = count
        self.page = page

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['count'] = self.count
        result['page'] = self.page
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.count = map.get('count')
        self.page = map.get('page')
        return self


class QueryBlockanalysisUserpriceupdatedequitiesResponse(TeaModel):
    def __init__(self, equities=None):
        self.equities = []

    def validate(self):
        if self.equities:
            for k in self.equities:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['equities'] = []
        if self.equities is not None:
            for k in self.equities:
                result['equities'].append(k.to_map() if k else None)
        else:
            result['equities'] = None
        return result

    def from_map(self, map={}):
        self.equities = []
        if map.get('equities') is not None:
            for k in map.get('equities'):
                temp_model = UserPriceEquity()
                temp_model = temp_model.from_map(k)
                self.equities.append(temp_model)
        else:
            self.equities = None
        return self


class CreateMerchantUserRequest(TeaModel):
    def __init__(self, chain_id=None, did=None, local_id=None, out_tx_id=None):
        self.chain_id = chain_id
        self.did = did
        self.local_id = local_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['did'] = self.did
        result['local_id'] = self.local_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.did = map.get('did')
        self.local_id = map.get('local_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class CreateMerchantUserResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryConfigWhitelistRequest(TeaModel):
    def __init__(self, chain_id=None, tenant_id=None):
        self.chain_id = chain_id
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.tenant_id = map.get('tenant_id')
        return self


class QueryConfigWhitelistResponse(TeaModel):
    def __init__(self, white_list=None):
        self.white_list = []

    def validate(self):
        if self.white_list:
            for k in self.white_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['white_list'] = []
        if self.white_list is not None:
            for k in self.white_list:
                result['white_list'].append(k.to_map() if k else None)
        else:
            result['white_list'] = None
        return result

    def from_map(self, map={}):
        self.white_list = []
        if map.get('white_list') is not None:
            for k in map.get('white_list'):
                temp_model = APIWhiteListInfo()
                temp_model = temp_model.from_map(k)
                self.white_list.append(temp_model)
        else:
            self.white_list = None
        return self


class ExecPkiEncryptRequest(TeaModel):
    def __init__(self, account_id=None, content=None, opt_tenant_id=None):
        self.account_id = account_id
        self.content = content
        self.opt_tenant_id = opt_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['account_id'] = self.account_id
        result['content'] = self.content
        result['opt_tenant_id'] = self.opt_tenant_id
        return result

    def from_map(self, map={}):
        self.account_id = map.get('account_id')
        self.content = map.get('content')
        self.opt_tenant_id = map.get('opt_tenant_id')
        return self


class ExecPkiEncryptResponse(TeaModel):
    def __init__(self, encrypted_content=None):
        self.encrypted_content = encrypted_content

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['encrypted_content'] = self.encrypted_content
        return result

    def from_map(self, map={}):
        self.encrypted_content = map.get('encrypted_content')
        return self


class QueryBlockanalysisWhitelistRequest(TeaModel):
    def __init__(self, chain_id=None, tenant_id=None):
        self.chain_id = chain_id
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.tenant_id = map.get('tenant_id')
        return self


class QueryBlockanalysisWhitelistResponse(TeaModel):
    def __init__(self, white_list=None):
        self.white_list = []

    def validate(self):
        if self.white_list:
            for k in self.white_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['white_list'] = []
        if self.white_list is not None:
            for k in self.white_list:
                result['white_list'].append(k.to_map() if k else None)
        else:
            result['white_list'] = None
        return result

    def from_map(self, map={}):
        self.white_list = []
        if map.get('white_list') is not None:
            for k in map.get('white_list'):
                temp_model = APIWhiteListInfo()
                temp_model = temp_model.from_map(k)
                self.white_list.append(temp_model)
        else:
            self.white_list = None
        return self


class QueryMerchantExchangeableequitylistRequest(TeaModel):
    def __init__(self, chain_id=None, page_number=None, page_size=None):
        self.chain_id = chain_id
        self.page_number = page_number
        self.page_size = page_size

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['page_number'] = self.page_number
        result['page_size'] = self.page_size
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.page_number = map.get('page_number')
        self.page_size = map.get('page_size')
        return self


class QueryMerchantExchangeableequitylistResponse(TeaModel):
    def __init__(self, object=None):
        self.object = object

    def validate(self):
        if self.object:
            self.object.validate()

    def to_map(self):
        result = {}
        if self.object is not None:
            result['object'] = self.object.to_map()
        else:
            result['object'] = None
        return result

    def from_map(self, map={}):
        if map.get('object') is not None:
            temp_model = ExchangeableEquityList()
            self.object = temp_model.from_map(map['object'])
        else:
            self.object = None
        return self


class AddEquityCountRequest(TeaModel):
    def __init__(self, amount=None, chain_id=None, delegated_tenant_id=None, equity_id=None, out_tx_id=None):
        self.amount = amount
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['amount'] = self.amount
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class AddEquityCountResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecCardChargeresetRequest(TeaModel):
    def __init__(self, chain_id=None, tx=None):
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecCardChargeresetResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class GetPkiPublickeyRequest(TeaModel):
    def __init__(self, account_id=None, opt_tenant_id=None):
        self.account_id = account_id
        self.opt_tenant_id = opt_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['account_id'] = self.account_id
        result['opt_tenant_id'] = self.opt_tenant_id
        return result

    def from_map(self, map={}):
        self.account_id = map.get('account_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        return self


class GetPkiPublickeyResponse(TeaModel):
    def __init__(self, public_key=None):
        self.public_key = public_key

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['public_key'] = self.public_key
        return result

    def from_map(self, map={}):
        self.public_key = map.get('public_key')
        return self


class UpdateBlockanalysisWhitelistRequest(TeaModel):
    def __init__(self, chain_id=None, opt_tenant_id=None, opt_type=None):
        self.chain_id = chain_id
        self.opt_tenant_id = opt_tenant_id
        self.opt_type = opt_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['opt_type'] = self.opt_type
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        return self


class UpdateBlockanalysisWhitelistResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class UpdateMerchantFriendRequest(TeaModel):
    def __init__(self, chain_id=None, friend_tenant_id=None, out_tx_id=None, type=None):
        self.chain_id = chain_id
        self.friend_tenant_id = friend_tenant_id
        self.out_tx_id = out_tx_id
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['friend_tenant_id'] = self.friend_tenant_id
        result['out_tx_id'] = self.out_tx_id
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.friend_tenant_id = map.get('friend_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        self.type = map.get('type')
        return self


class UpdateMerchantFriendResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class CreateEquityRequest(TeaModel):
    def __init__(self, auth_type=None, chain_id=None, currency=None, default_price=None, delegated_tenant_id=None, description=None, desc_images=None, equity_name=None, equity_type=None, if_public=None, images=None, limit_per_merchant_and_day=None, limit_per_merchant_and_month=None, limit_per_user_and_day=None, limit_per_user_and_month=None, memo=None, out_tx_id=None, total_count=None, use_valid_not_after=None, use_valid_not_before=None, valid_not_after=None, valid_not_before=None, value=None):
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


class CreateEquityResponse(TeaModel):
    def __init__(self, create_equity_request_id=None):
        self.create_equity_request_id = create_equity_request_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['create_equity_request_id'] = self.create_equity_request_id
        return result

    def from_map(self, map={}):
        self.create_equity_request_id = map.get('create_equity_request_id')
        return self


class ExecCardCreateRequest(TeaModel):
    def __init__(self, chain_id=None, tx=None):
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecCardCreateResponse(TeaModel):
    def __init__(self, card_id=None, tx_hash=None):
        self.card_id = card_id
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['card_id'] = self.card_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.card_id = map.get('card_id')
        self.tx_hash = map.get('tx_hash')
        return self


class ExecMypointsPreorderskuRequest(TeaModel):
    def __init__(self, chain_id=None, count=None, env=None, memo=None, order_no=None, sku_id=None, total_cost=None):
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
        result['chain_id'] = self.chain_id
        result['count'] = self.count
        result['env'] = self.env
        result['memo'] = self.memo
        result['order_no'] = self.order_no
        result['sku_id'] = self.sku_id
        result['total_cost'] = self.total_cost
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.count = map.get('count')
        self.env = map.get('env')
        self.memo = map.get('memo')
        self.order_no = map.get('order_no')
        self.sku_id = map.get('sku_id')
        self.total_cost = map.get('total_cost')
        return self


class ExecMypointsPreorderskuResponse(TeaModel):
    def __init__(self, count=None, order_no=None, pre_order_id=None, sku_id=None, total_amount=None, total_cost=None):
        self.count = count
        self.order_no = order_no
        self.pre_order_id = pre_order_id
        self.sku_id = sku_id
        self.total_amount = total_amount
        self.total_cost = total_cost

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['count'] = self.count
        result['order_no'] = self.order_no
        result['pre_order_id'] = self.pre_order_id
        result['sku_id'] = self.sku_id
        result['total_amount'] = self.total_amount
        result['total_cost'] = self.total_cost
        return result

    def from_map(self, map={}):
        self.count = map.get('count')
        self.order_no = map.get('order_no')
        self.pre_order_id = map.get('pre_order_id')
        self.sku_id = map.get('sku_id')
        self.total_amount = map.get('total_amount')
        self.total_cost = map.get('total_cost')
        return self


class QueryBlockanalysisLastblocknumberRequest(TeaModel):
    def __init__(self, chain_id=None):
        self.chain_id = chain_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        return self


class QueryBlockanalysisLastblocknumberResponse(TeaModel):
    def __init__(self, block_number=None):
        self.block_number = block_number

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['block_number'] = self.block_number
        return result

    def from_map(self, map={}):
        self.block_number = map.get('block_number')
        return self


class SetMerchantFundmanagerRequest(TeaModel):
    def __init__(self, chain_id=None, fund_manager_tenant_id=None, opt_tenant_id=None, out_tx_id=None):
        self.chain_id = chain_id
        self.fund_manager_tenant_id = fund_manager_tenant_id
        self.opt_tenant_id = opt_tenant_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['fund_manager_tenant_id'] = self.fund_manager_tenant_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.fund_manager_tenant_id = map.get('fund_manager_tenant_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class SetMerchantFundmanagerResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryEquityCreateresultRequest(TeaModel):
    def __init__(self, chain_id=None, create_equity_request_id=None, delegated_tenant_id=None):
        self.chain_id = chain_id
        self.create_equity_request_id = create_equity_request_id
        self.delegated_tenant_id = delegated_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['create_equity_request_id'] = self.create_equity_request_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.create_equity_request_id = map.get('create_equity_request_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        return self


class QueryEquityCreateresultResponse(TeaModel):
    def __init__(self, equity_id=None):
        self.equity_id = equity_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['equity_id'] = self.equity_id
        return result

    def from_map(self, map={}):
        self.equity_id = map.get('equity_id')
        return self


class QueryMypointsSkuRequest(TeaModel):
    def __init__(self, chain_id=None, env=None):
        self.chain_id = chain_id
        self.env = env

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['env'] = self.env
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.env = map.get('env')
        return self


class QueryMypointsSkuResponse(TeaModel):
    def __init__(self, skus=None):
        self.skus = []

    def validate(self):
        if self.skus:
            for k in self.skus:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['skus'] = []
        if self.skus is not None:
            for k in self.skus:
                result['skus'].append(k.to_map() if k else None)
        else:
            result['skus'] = None
        return result

    def from_map(self, map={}):
        self.skus = []
        if map.get('skus') is not None:
            for k in map.get('skus'):
                temp_model = SKUItem()
                temp_model = temp_model.from_map(k)
                self.skus.append(temp_model)
        else:
            self.skus = None
        return self


class ConfirmExchangeRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
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
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ConfirmExchangeResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryBlockanalysisOpenedequitiesRequest(TeaModel):
    def __init__(self, chain_id=None, count=None, page=None):
        self.chain_id = chain_id
        self.count = count
        self.page = page

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['count'] = self.count
        result['page'] = self.page
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.count = map.get('count')
        self.page = map.get('page')
        return self


class QueryBlockanalysisOpenedequitiesResponse(TeaModel):
    def __init__(self, equities=None):
        self.equities = []

    def validate(self):
        if self.equities:
            for k in self.equities:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['equities'] = []
        if self.equities is not None:
            for k in self.equities:
                result['equities'].append(k.to_map() if k else None)
        else:
            result['equities'] = None
        return result

    def from_map(self, map={}):
        self.equities = []
        if map.get('equities') is not None:
            for k in map.get('equities'):
                temp_model = OpenedEquity()
                temp_model = temp_model.from_map(k)
                self.equities.append(temp_model)
        else:
            self.equities = None
        return self


class CreateMerchantRequest(TeaModel):
    def __init__(self, chain_id=None, description=None, fund_manager_tenant_id=None, if_asset_issuer=None, if_equity_consumer=None, if_equity_provider=None, opt_tenant_id=None, out_tx_id=None):
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
        self.chain_id = map.get('chain_id')
        self.description = map.get('description')
        self.fund_manager_tenant_id = map.get('fund_manager_tenant_id')
        self.if_asset_issuer = map.get('if_asset_issuer')
        self.if_equity_consumer = map.get('if_equity_consumer')
        self.if_equity_provider = map.get('if_equity_provider')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class CreateMerchantResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class UpdateConfigWhitelistRequest(TeaModel):
    def __init__(self, chain_id=None, opt_tenant_id=None, opt_type=None):
        self.chain_id = chain_id
        self.opt_tenant_id = opt_tenant_id
        self.opt_type = opt_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['opt_type'] = self.opt_type
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.opt_type = map.get('opt_type')
        return self


class UpdateConfigWhitelistResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecCardBindnameRequest(TeaModel):
    def __init__(self, chain_id=None, tx=None):
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecCardBindnameResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryMypointsSkufeeRequest(TeaModel):
    def __init__(self, chain_id=None, count=None, env=None, memo=None, order_no=None, sku_id=None):
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
        result['chain_id'] = self.chain_id
        result['count'] = self.count
        result['env'] = self.env
        result['memo'] = self.memo
        result['order_no'] = self.order_no
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.count = map.get('count')
        self.env = map.get('env')
        self.memo = map.get('memo')
        self.order_no = map.get('order_no')
        self.sku_id = map.get('sku_id')
        return self


class QueryMypointsSkufeeResponse(TeaModel):
    def __init__(self, count=None, rate=None, sku_id=None, total_amount=None, total_cost=None):
        self.count = count
        self.rate = rate
        self.sku_id = sku_id
        self.total_amount = total_amount
        self.total_cost = total_cost

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['count'] = self.count
        result['rate'] = self.rate
        result['sku_id'] = self.sku_id
        result['total_amount'] = self.total_amount
        result['total_cost'] = self.total_cost
        return result

    def from_map(self, map={}):
        self.count = map.get('count')
        self.rate = map.get('rate')
        self.sku_id = map.get('sku_id')
        self.total_amount = map.get('total_amount')
        self.total_cost = map.get('total_cost')
        return self


class QueryBlockanalysisUnwriteoffvalueRequest(TeaModel):
    def __init__(self, asset_id=None, chain_id=None, opt_tenant_id=None):
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.opt_tenant_id = opt_tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['opt_tenant_id'] = self.opt_tenant_id
        return result

    def from_map(self, map={}):
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        return self


class QueryBlockanalysisUnwriteoffvalueResponse(TeaModel):
    def __init__(self, asset_id=None, tenant_id=None, total_value=None):
        self.asset_id = asset_id
        self.tenant_id = tenant_id
        self.total_value = total_value

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['asset_id'] = self.asset_id
        result['tenant_id'] = self.tenant_id
        result['total_value'] = self.total_value
        return result

    def from_map(self, map={}):
        self.asset_id = map.get('asset_id')
        self.tenant_id = map.get('tenant_id')
        self.total_value = map.get('total_value')
        return self


class QueryMerchantExchangeableequitydetailRequest(TeaModel):
    def __init__(self, chain_id=None, sku_id=None):
        self.chain_id = chain_id
        self.sku_id = sku_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['sku_id'] = self.sku_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.sku_id = map.get('sku_id')
        return self


class QueryMerchantExchangeableequitydetailResponse(TeaModel):
    def __init__(self, equity=None):
        self.equity = equity

    def validate(self):
        if self.equity:
            self.equity.validate()

    def to_map(self):
        result = {}
        if self.equity is not None:
            result['equity'] = self.equity.to_map()
        else:
            result['equity'] = None
        return result

    def from_map(self, map={}):
        if map.get('equity') is not None:
            temp_model = EquityDetail()
            self.equity = temp_model.from_map(map['equity'])
        else:
            self.equity = None
        return self


class ExecDataDepositRequest(TeaModel):
    def __init__(self, chain_id=None, data=None, to=None):
        self.chain_id = chain_id
        self.data = data
        self.to = to

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['data'] = self.data
        result['to'] = self.to
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.data = map.get('data')
        self.to = map.get('to')
        return self


class ExecDataDepositResponse(TeaModel):
    def __init__(self, tx_hash=None):
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.tx_hash = map.get('tx_hash')
        return self


class ExecCardChargeRequest(TeaModel):
    def __init__(self, chain_id=None, tx=None):
        self.chain_id = chain_id
        self.tx = tx

    def validate(self):
        if self.tx:
            self.tx.validate()

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        if self.tx is not None:
            result['tx'] = self.tx.to_map()
        else:
            result['tx'] = None
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        if map.get('tx') is not None:
            temp_model = Transaction()
            self.tx = temp_model.from_map(map['tx'])
        else:
            self.tx = None
        return self


class ExecCardChargeResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecAssetGrantrefundRequest(TeaModel):
    def __init__(self, amount=None, asset_id=None, chain_id=None, info=None, origin_tx_id=None, out_tx_id=None, user_id=None):
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
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        return self


class ExecAssetGrantrefundResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecAssetExpireRequest(TeaModel):
    def __init__(self, amount=None, asset_id=None, chain_id=None, info=None, original_tx_id=None, out_tx_id=None, user_id=None):
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
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['original_tx_id'] = self.original_tx_id
        result['out_tx_id'] = self.out_tx_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.original_tx_id = map.get('original_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        return self


class ExecAssetExpireResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecAssetIssueRequest(TeaModel):
    def __init__(self, amount=None, asset_id=None, chain_id=None, info=None, opt_tenant_id=None, out_tx_id=None):
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
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecAssetIssueResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecAssetAdjustRequest(TeaModel):
    def __init__(self, amount=None, asset_id=None, chain_id=None, info=None, out_tx_id=None, user_id=None):
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
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['out_tx_id'] = self.out_tx_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        return self


class ExecAssetAdjustResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class UpdateEquityRequest(TeaModel):
    def __init__(self, auth_type=None, chain_id=None, currency=None, default_price=None, delegated_tenant_id=None, description=None, desc_images=None, equity_id=None, equity_name=None, equity_type=None, if_public=None, images=None, limit_per_merchant_and_day=None, limit_per_merchant_and_month=None, limit_per_user_and_day=None, limit_per_user_and_month=None, memo=None, out_tx_id=None, total_count=None, use_valid_not_after=None, use_valid_not_before=None, valid_not_after=None, valid_not_before=None, value=None):
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


class UpdateEquityResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryAssetInstructionRequest(TeaModel):
    def __init__(self, chain_id=None, origin_tx_id=None):
        self.chain_id = chain_id
        self.origin_tx_id = origin_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['origin_tx_id'] = self.origin_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.origin_tx_id = map.get('origin_tx_id')
        return self


class QueryAssetInstructionResponse(TeaModel):
    def __init__(self, instruction=None):
        self.instruction = instruction

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['instruction'] = self.instruction
        return result

    def from_map(self, map={}):
        self.instruction = map.get('instruction')
        return self


class ExecAssetGenerateRequest(TeaModel):
    def __init__(self, amount=None, asset_id=None, chain_id=None, out_tx_id=None):
        self.amount = amount
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecAssetGenerateResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryAssetRequest(TeaModel):
    def __init__(self, asset_id=None, chain_id=None, opt_tenant_id=None, user_id=None):
        self.asset_id = asset_id
        self.chain_id = chain_id
        self.opt_tenant_id = opt_tenant_id
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.user_id = map.get('user_id')
        return self


class QueryAssetResponse(TeaModel):
    def __init__(self, asset=None):
        self.asset = asset

    def validate(self):
        if self.asset:
            self.asset.validate()

    def to_map(self):
        result = {}
        if self.asset is not None:
            result['asset'] = self.asset.to_map()
        else:
            result['asset'] = None
        return result

    def from_map(self, map={}):
        if map.get('asset') is not None:
            temp_model = Asset()
            self.asset = temp_model.from_map(map['asset'])
        else:
            self.asset = None
        return self


class ExecAssetCreateRequest(TeaModel):
    def __init__(self, asset_id=None, asset_name=None, chain_id=None, currency=None, opt_tenant_id=None, out_tx_id=None, rate=None):
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
        result['asset_id'] = self.asset_id
        result['asset_name'] = self.asset_name
        result['chain_id'] = self.chain_id
        result['currency'] = self.currency
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        result['rate'] = self.rate
        return result

    def from_map(self, map={}):
        self.asset_id = map.get('asset_id')
        self.asset_name = map.get('asset_name')
        self.chain_id = map.get('chain_id')
        self.currency = map.get('currency')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        self.rate = map.get('rate')
        return self


class ExecAssetCreateResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class UpdateEquityValidtimeRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, out_tx_id=None, use_valid_not_after=None, use_valid_not_before=None, valid_not_after=None, valid_not_before=None):
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
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        self.use_valid_not_after = map.get('use_valid_not_after')
        self.use_valid_not_before = map.get('use_valid_not_before')
        self.valid_not_after = map.get('valid_not_after')
        self.valid_not_before = map.get('valid_not_before')
        return self


class UpdateEquityValidtimeResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryEquityRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, opt_tenant_id=None, target_date=None, user_id=None):
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
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['target_date'] = self.target_date
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.target_date = map.get('target_date')
        self.user_id = map.get('user_id')
        return self


class QueryEquityResponse(TeaModel):
    def __init__(self, equity=None, urls=None):
        self.equity = equity
        self.urls = []

    def validate(self):
        if self.equity:
            self.equity.validate()

    def to_map(self):
        result = {}
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


class ExecAssetGrantRequest(TeaModel):
    def __init__(self, amount=None, asset_id=None, chain_id=None, info=None, merchant_id=None, out_tx_id=None, user_id=None, validity_time=None):
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
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.merchant_id = map.get('merchant_id')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        self.validity_time = map.get('validity_time')
        return self


class ExecAssetGrantResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecAssetRedeemRequest(TeaModel):
    def __init__(self, amount=None, asset_id=None, chain_id=None, info=None, origin_tx_id=None, out_tx_id=None):
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
        result['amount'] = self.amount
        result['asset_id'] = self.asset_id
        result['chain_id'] = self.chain_id
        result['info'] = self.info
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.asset_id = map.get('asset_id')
        self.chain_id = map.get('chain_id')
        self.info = map.get('info')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecAssetRedeemResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ConfirmExchangeAftersaleRequest(TeaModel):
    def __init__(self, chain_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ConfirmExchangeAftersaleResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ApplyExchangeAftersaleRequest(TeaModel):
    def __init__(self, chain_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ApplyExchangeAftersaleResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class UpdateEquityStatusRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, out_tx_id=None, status=None):
        self.chain_id = chain_id
        self.delegated_tenant_id = delegated_tenant_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        self.status = map.get('status')
        return self


class UpdateEquityStatusResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryExchangeInstructionRequest(TeaModel):
    def __init__(self, chain_id=None, equity_id=None, opt_tenant_id=None, origin_tx_id=None):
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.opt_tenant_id = opt_tenant_id
        self.origin_tx_id = origin_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['origin_tx_id'] = self.origin_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.origin_tx_id = map.get('origin_tx_id')
        return self


class QueryExchangeInstructionResponse(TeaModel):
    def __init__(self, instruction=None):
        self.instruction = instruction

    def validate(self):
        if self.instruction:
            self.instruction.validate()

    def to_map(self):
        result = {}
        if self.instruction is not None:
            result['instruction'] = self.instruction.to_map()
        else:
            result['instruction'] = None
        return result

    def from_map(self, map={}):
        if map.get('instruction') is not None:
            temp_model = EInstruction()
            self.instruction = temp_model.from_map(map['instruction'])
        else:
            self.instruction = None
        return self


class SendExchangeRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
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
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class SendExchangeResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class AuthEquityMerchantuserpriceRequest(TeaModel):
    def __init__(self, amount=None, chain_id=None, delegated_tenant_id=None, equity_id=None, opt_tenant_id=None, out_tx_id=None, ratio=None):
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
        result['amount'] = self.amount
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        result['ratio'] = self.ratio
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        self.ratio = map.get('ratio')
        return self


class AuthEquityMerchantuserpriceResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class RefuseExchangeAftersaleRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
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
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class RefuseExchangeAftersaleResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecExchangeAgreeaftersaleRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
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
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecExchangeAgreeaftersaleResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class UpdateEquityTenantpriceRequest(TeaModel):
    def __init__(self, amount=None, chain_id=None, delegated_tenant_id=None, equity_id=None, opt_tenant_id=None, out_tx_id=None):
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
        result['amount'] = self.amount
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['opt_tenant_id'] = self.opt_tenant_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.amount = map.get('amount')
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.opt_tenant_id = map.get('opt_tenant_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class UpdateEquityTenantpriceResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryImageRequest(TeaModel):
    def __init__(self, urls=None):
        self.urls = []

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['urls'] = []
        if self.urls is not None:
            for k in self.urls:
                result['urls'].append(k)
        else:
            result['urls'] = None
        return result

    def from_map(self, map={}):
        self.urls = []
        if map.get('urls') is not None:
            for k in map.get('urls'):
                self.urls.append(k)
        else:
            self.urls = None
        return self


class QueryImageResponse(TeaModel):
    def __init__(self, urls=None):
        self.urls = []

    def validate(self):
        if self.urls:
            for k in self.urls:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['urls'] = []
        if self.urls is not None:
            for k in self.urls:
                result['urls'].append(k.to_map() if k else None)
        else:
            result['urls'] = None
        return result

    def from_map(self, map={}):
        self.urls = []
        if map.get('urls') is not None:
            for k in map.get('urls'):
                temp_model = MultiURL()
                temp_model = temp_model.from_map(k)
                self.urls.append(temp_model)
        else:
            self.urls = None
        return self


class OfflineEquityRequest(TeaModel):
    def __init__(self, chain_id=None, equity_id=None, out_tx_id=None):
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class OfflineEquityResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class SendExchangeAftersaleRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
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
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class SendExchangeAftersaleResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecExchangeBymerchantRequest(TeaModel):
    def __init__(self, asset_id=None, asset_rate=None, chain_id=None, equity_id=None, equity_price=None, memo=None, out_tx_id=None, tx_sig=None, user_id=None):
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


class ExecExchangeBymerchantResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class UploadImageRequest(TeaModel):
    def __init__(self, chain_id=None, content_type=None, delegated_tenant_id=None, image=None):
        self.chain_id = chain_id
        self.content_type = content_type
        self.delegated_tenant_id = delegated_tenant_id
        self.image = image

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['content_type'] = self.content_type
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['image'] = self.image
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.content_type = map.get('content_type')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.image = map.get('image')
        return self


class UploadImageResponse(TeaModel):
    def __init__(self, temporary_url=None, url=None):
        self.temporary_url = temporary_url
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['temporary_url'] = self.temporary_url
        result['url'] = self.url
        return result

    def from_map(self, map={}):
        self.temporary_url = map.get('temporary_url')
        self.url = map.get('url')
        return self


class ExecExchangeOutofstoreRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
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
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecExchangeOutofstoreResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecExchangeReceivebymerchantRequest(TeaModel):
    def __init__(self, chain_id=None, equity_id=None, memo=None, origin_tx_id=None, out_tx_id=None):
        self.chain_id = chain_id
        self.equity_id = equity_id
        self.memo = memo
        self.origin_tx_id = origin_tx_id
        self.out_tx_id = out_tx_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['chain_id'] = self.chain_id
        result['equity_id'] = self.equity_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.equity_id = map.get('equity_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        return self


class ExecExchangeReceivebymerchantResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ExecExchangeReceivebyuserRequest(TeaModel):
    def __init__(self, chain_id=None, delegated_tenant_id=None, memo=None, origin_tx_id=None, out_tx_id=None, user_id=None):
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
        result['chain_id'] = self.chain_id
        result['delegated_tenant_id'] = self.delegated_tenant_id
        result['memo'] = self.memo
        result['origin_tx_id'] = self.origin_tx_id
        result['out_tx_id'] = self.out_tx_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.chain_id = map.get('chain_id')
        self.delegated_tenant_id = map.get('delegated_tenant_id')
        self.memo = map.get('memo')
        self.origin_tx_id = map.get('origin_tx_id')
        self.out_tx_id = map.get('out_tx_id')
        self.user_id = map.get('user_id')
        return self


class ExecExchangeReceivebyuserResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self
