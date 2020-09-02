# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


class Config(TeaModel):
    """
    Model for initing client
    """
    def __init__(self, access_key_id=None, access_key_secret=None, security_token=None, protocol=None,
                 read_timeout=None, connect_timeout=None, http_proxy=None, https_proxy=None, endpoint=None, no_proxy=None,
                 max_idle_conns=None, user_agent=None, socks_5proxy=None, socks_5net_work=None):
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


class ContractFlowSigner(TeaModel):
    def __init__(self, signer_account_id=None, signer_authorized_account_id=None,
                 signer_authorized_account_name=None, signer_authorized_account_real_name=None, signer_authorized_account_type=None,
                 signer_name=None, signer_real_name=None, sign_order=None, sign_status=None, third_order_no=None):
        self.signer_account_id = signer_account_id
        self.signer_authorized_account_id = signer_authorized_account_id
        self.signer_authorized_account_name = signer_authorized_account_name
        self.signer_authorized_account_real_name = signer_authorized_account_real_name
        self.signer_authorized_account_type = signer_authorized_account_type
        self.signer_name = signer_name
        self.signer_real_name = signer_real_name
        self.sign_order = sign_order
        self.sign_status = sign_status
        self.third_order_no = third_order_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['signer_account_id'] = self.signer_account_id
        result['signer_authorized_account_id'] = self.signer_authorized_account_id
        result['signer_authorized_account_name'] = self.signer_authorized_account_name
        result['signer_authorized_account_real_name'] = self.signer_authorized_account_real_name
        result['signer_authorized_account_type'] = self.signer_authorized_account_type
        result['signer_name'] = self.signer_name
        result['signer_real_name'] = self.signer_real_name
        result['sign_order'] = self.sign_order
        result['sign_status'] = self.sign_status
        result['third_order_no'] = self.third_order_no
        return result

    def from_map(self, map={}):
        self.signer_account_id = map.get('signer_account_id')
        self.signer_authorized_account_id = map.get('signer_authorized_account_id')
        self.signer_authorized_account_name = map.get('signer_authorized_account_name')
        self.signer_authorized_account_real_name = map.get('signer_authorized_account_real_name')
        self.signer_authorized_account_type = map.get('signer_authorized_account_type')
        self.signer_name = map.get('signer_name')
        self.signer_real_name = map.get('signer_real_name')
        self.sign_order = map.get('sign_order')
        self.sign_status = map.get('sign_status')
        self.third_order_no = map.get('third_order_no')
        return self


class NotaryCheckMeta(TeaModel):
    def __init__(self, agency_code=None, application_code=None, hash_algorithm=None, notary_content=None,
                 tx_hash=None):
        self.agency_code = agency_code
        self.application_code = application_code
        self.hash_algorithm = hash_algorithm
        self.notary_content = notary_content
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['agency_code'] = self.agency_code
        result['application_code'] = self.application_code
        result['hash_algorithm'] = self.hash_algorithm
        result['notary_content'] = self.notary_content
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.agency_code = map.get('agency_code')
        self.application_code = map.get('application_code')
        self.hash_algorithm = map.get('hash_algorithm')
        self.notary_content = map.get('notary_content')
        self.tx_hash = map.get('tx_hash')
        return self


class SupplierProductInfo(TeaModel):
    def __init__(self, extra_info=None, product_id=None, product_imei_id=None, product_name=None,
                 product_number=None, product_price=None, supplier_version=None):
        self.extra_info = extra_info
        self.product_id = product_id
        self.product_imei_id = product_imei_id
        self.product_name = product_name
        self.product_number = product_number
        self.product_price = product_price
        self.supplier_version = supplier_version

    def validate(self):
        if self.product_name:
            self.validate_max_length(self.product_name, 'product_name', 50)

    def to_map(self):
        result = {}
        result['extra_info'] = self.extra_info
        result['product_id'] = self.product_id
        result['product_imei_id'] = self.product_imei_id
        result['product_name'] = self.product_name
        result['product_number'] = self.product_number
        result['product_price'] = self.product_price
        result['supplier_version'] = self.supplier_version
        return result

    def from_map(self, map={}):
        self.extra_info = map.get('extra_info')
        self.product_id = map.get('product_id')
        self.product_imei_id = map.get('product_imei_id')
        self.product_name = map.get('product_name')
        self.product_number = map.get('product_number')
        self.product_price = map.get('product_price')
        self.supplier_version = map.get('supplier_version')
        return self


class Identity(TeaModel):
    def __init__(self, agent=None, agent_cert_type=None, agent_id=None, cert_name=None, cert_no=None, cert_type=None,
                 legal_person=None, legal_person_cert_type=None, legal_person_id=None, mobile_no=None, properties=None,
                 user_type=None):
        self.agent = agent
        self.agent_cert_type = agent_cert_type
        self.agent_id = agent_id
        self.cert_name = cert_name
        self.cert_no = cert_no
        self.cert_type = cert_type
        self.legal_person = legal_person
        self.legal_person_cert_type = legal_person_cert_type
        self.legal_person_id = legal_person_id
        self.mobile_no = mobile_no
        self.properties = properties
        self.user_type = user_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['agent'] = self.agent
        result['agent_cert_type'] = self.agent_cert_type
        result['agent_id'] = self.agent_id
        result['cert_name'] = self.cert_name
        result['cert_no'] = self.cert_no
        result['cert_type'] = self.cert_type
        result['legal_person'] = self.legal_person
        result['legal_person_cert_type'] = self.legal_person_cert_type
        result['legal_person_id'] = self.legal_person_id
        result['mobile_no'] = self.mobile_no
        result['properties'] = self.properties
        result['user_type'] = self.user_type
        return result

    def from_map(self, map={}):
        self.agent = map.get('agent')
        self.agent_cert_type = map.get('agent_cert_type')
        self.agent_id = map.get('agent_id')
        self.cert_name = map.get('cert_name')
        self.cert_no = map.get('cert_no')
        self.cert_type = map.get('cert_type')
        self.legal_person = map.get('legal_person')
        self.legal_person_cert_type = map.get('legal_person_cert_type')
        self.legal_person_id = map.get('legal_person_id')
        self.mobile_no = map.get('mobile_no')
        self.properties = map.get('properties')
        self.user_type = map.get('user_type')
        return self


class ContractDocAddress(TeaModel):
    def __init__(self, file_id=None, file_name=None, file_url=None):
        self.file_id = file_id
        self.file_name = file_name
        self.file_url = file_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['file_id'] = self.file_id
        result['file_name'] = self.file_name
        result['file_url'] = self.file_url
        return result

    def from_map(self, map={}):
        self.file_id = map.get('file_id')
        self.file_name = map.get('file_name')
        self.file_url = map.get('file_url')
        return self


class LeaseOrderExtra(TeaModel):
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


class ContractPlatformSignField(TeaModel):
    def __init__(self, add_sign_time=None, order=None, pos_page=None, pos_x=None, pos_y=None, seal_id=None,
                 third_order_no=None, width=None):
        self.add_sign_time = add_sign_time
        self.order = order
        self.pos_page = pos_page
        self.pos_x = pos_x
        self.pos_y = pos_y
        self.seal_id = seal_id
        self.third_order_no = third_order_no
        self.width = width

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['add_sign_time'] = self.add_sign_time
        result['order'] = self.order
        result['pos_page'] = self.pos_page
        result['pos_x'] = self.pos_x
        result['pos_y'] = self.pos_y
        result['seal_id'] = self.seal_id
        result['third_order_no'] = self.third_order_no
        result['width'] = self.width
        return result

    def from_map(self, map={}):
        self.add_sign_time = map.get('add_sign_time')
        self.order = map.get('order')
        self.pos_page = map.get('pos_page')
        self.pos_x = map.get('pos_x')
        self.pos_y = map.get('pos_y')
        self.seal_id = map.get('seal_id')
        self.third_order_no = map.get('third_order_no')
        self.width = map.get('width')
        return self


class NotaryCheckResult(TeaModel):
    def __init__(self, block_hash=None, block_height=None, error_code=None, error_message=None, notary_time=None,
                 notary_type=None, phase=None, result=None, transaction_id=None, tx_hash=None):
        self.block_hash = block_hash
        self.block_height = block_height
        self.error_code = error_code
        self.error_message = error_message
        self.notary_time = notary_time
        self.notary_type = notary_type
        self.phase = phase
        self.result = result
        self.transaction_id = transaction_id
        self.tx_hash = tx_hash

    def validate(self):
        if self.notary_time:
            self.validate_pattern(self.notary_time, 'notary_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['block_hash'] = self.block_hash
        result['block_height'] = self.block_height
        result['error_code'] = self.error_code
        result['error_message'] = self.error_message
        result['notary_time'] = self.notary_time
        result['notary_type'] = self.notary_type
        result['phase'] = self.phase
        result['result'] = self.result
        result['transaction_id'] = self.transaction_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.block_hash = map.get('block_hash')
        self.block_height = map.get('block_height')
        self.error_code = map.get('error_code')
        self.error_message = map.get('error_message')
        self.notary_time = map.get('notary_time')
        self.notary_type = map.get('notary_type')
        self.phase = map.get('phase')
        self.result = map.get('result')
        self.transaction_id = map.get('transaction_id')
        self.tx_hash = map.get('tx_hash')
        return self


class ContractSignField(TeaModel):
    def __init__(self, account_id=None, file_id=None, signfield_id=None):
        self.account_id = account_id
        self.file_id = file_id
        self.signfield_id = signfield_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['account_id'] = self.account_id
        result['file_id'] = self.file_id
        result['signfield_id'] = self.signfield_id
        return result

    def from_map(self, map={}):
        self.account_id = map.get('account_id')
        self.file_id = map.get('file_id')
        self.signfield_id = map.get('signfield_id')
        return self


class ContractAccount(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class ContractNotarySignInfo(TeaModel):
    def __init__(self, content=None, contract_hash=None, signatory=None, timestamp=None, tx_hash=None):
        self.content = content
        self.contract_hash = contract_hash
        self.signatory = signatory
        self.timestamp = timestamp
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['content'] = self.content
        result['contract_hash'] = self.contract_hash
        result['signatory'] = self.signatory
        result['timestamp'] = self.timestamp
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.content = map.get('content')
        self.contract_hash = map.get('contract_hash')
        self.signatory = map.get('signatory')
        self.timestamp = map.get('timestamp')
        self.tx_hash = map.get('tx_hash')
        return self


class ContractOrganizationApplication(TeaModel):
    def __init__(self, id_number=None, id_type=None, legal_person=None, legal_person_id=None, name=None,
                 organization_id=None):
        self.id_number = id_number
        self.id_type = id_type
        self.legal_person = legal_person
        self.legal_person_id = legal_person_id
        self.name = name
        self.organization_id = organization_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['id_number'] = self.id_number
        result['id_type'] = self.id_type
        result['legal_person'] = self.legal_person
        result['legal_person_id'] = self.legal_person_id
        result['name'] = self.name
        result['organization_id'] = self.organization_id
        return result

    def from_map(self, map={}):
        self.id_number = map.get('id_number')
        self.id_type = map.get('id_type')
        self.legal_person = map.get('legal_person')
        self.legal_person_id = map.get('legal_person_id')
        self.name = map.get('name')
        self.organization_id = map.get('organization_id')
        return self


class Location(TeaModel):
    def __init__(self, city=None, imei=None, imsi=None, ip=None, latitude=None, longitude=None, mac_addr=None,
                 properties=None):
        self.city = city
        self.imei = imei
        self.imsi = imsi
        self.ip = ip
        self.latitude = latitude
        self.longitude = longitude
        self.mac_addr = mac_addr
        self.properties = properties

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['city'] = self.city
        result['imei'] = self.imei
        result['imsi'] = self.imsi
        result['ip'] = self.ip
        result['latitude'] = self.latitude
        result['longitude'] = self.longitude
        result['mac_addr'] = self.mac_addr
        result['properties'] = self.properties
        return result

    def from_map(self, map={}):
        self.city = map.get('city')
        self.imei = map.get('imei')
        self.imsi = map.get('imsi')
        self.ip = map.get('ip')
        self.latitude = map.get('latitude')
        self.longitude = map.get('longitude')
        self.mac_addr = map.get('mac_addr')
        self.properties = map.get('properties')
        return self


class ContractNotaryFinishInfo(TeaModel):
    def __init__(self, content=None, file_num=None, initiator=None, signatories=None, timestamp=None, tx_hash=None):
        self.content = content
        self.file_num = file_num
        self.initiator = initiator
        self.signatories = signatories
        self.timestamp = timestamp
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['content'] = self.content
        result['file_num'] = self.file_num
        result['initiator'] = self.initiator
        result['signatories'] = self.signatories
        result['timestamp'] = self.timestamp
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.content = map.get('content')
        self.file_num = map.get('file_num')
        self.initiator = map.get('initiator')
        self.signatories = map.get('signatories')
        self.timestamp = map.get('timestamp')
        self.tx_hash = map.get('tx_hash')
        return self


class ContractSignFieldApplication(TeaModel):
    def __init__(self, add_sign_time=None, authorized_account_id=None, file_id=None, order=None, pos_page=None,
                 pos_x=None, pos_y=None, seal_id=None, third_order_no=None, width=None):
        self.add_sign_time = add_sign_time
        self.authorized_account_id = authorized_account_id
        self.file_id = file_id
        self.order = order
        self.pos_page = pos_page
        self.pos_x = pos_x
        self.pos_y = pos_y
        self.seal_id = seal_id
        self.third_order_no = third_order_no
        self.width = width

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['add_sign_time'] = self.add_sign_time
        result['authorized_account_id'] = self.authorized_account_id
        result['file_id'] = self.file_id
        result['order'] = self.order
        result['pos_page'] = self.pos_page
        result['pos_x'] = self.pos_x
        result['pos_y'] = self.pos_y
        result['seal_id'] = self.seal_id
        result['third_order_no'] = self.third_order_no
        result['width'] = self.width
        return result

    def from_map(self, map={}):
        self.add_sign_time = map.get('add_sign_time')
        self.authorized_account_id = map.get('authorized_account_id')
        self.file_id = map.get('file_id')
        self.order = map.get('order')
        self.pos_page = map.get('pos_page')
        self.pos_x = map.get('pos_x')
        self.pos_y = map.get('pos_y')
        self.seal_id = map.get('seal_id')
        self.third_order_no = map.get('third_order_no')
        self.width = map.get('width')
        return self


class ContractHandSignFieldApplication(TeaModel):
    def __init__(self, account_id=None, file_id=None, order=None, pos_page=None, pos_x=None, pos_y=None, seal_id=None,
                 sign_date_bean_type=None, sign_date_font_size=None, sign_date_format=None, sign_date_pos_page=None,
                 sign_date_pos_x=None, sign_date_pos_y=None, sign_type=None, third_order_no=None, width=None):
        self.account_id = account_id
        self.file_id = file_id
        self.order = order
        self.pos_page = pos_page
        self.pos_x = pos_x
        self.pos_y = pos_y
        self.seal_id = seal_id
        self.sign_date_bean_type = sign_date_bean_type
        self.sign_date_font_size = sign_date_font_size
        self.sign_date_format = sign_date_format
        self.sign_date_pos_page = sign_date_pos_page
        self.sign_date_pos_x = sign_date_pos_x
        self.sign_date_pos_y = sign_date_pos_y
        self.sign_type = sign_type
        self.third_order_no = third_order_no
        self.width = width

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['account_id'] = self.account_id
        result['file_id'] = self.file_id
        result['order'] = self.order
        result['pos_page'] = self.pos_page
        result['pos_x'] = self.pos_x
        result['pos_y'] = self.pos_y
        result['seal_id'] = self.seal_id
        result['sign_date_bean_type'] = self.sign_date_bean_type
        result['sign_date_font_size'] = self.sign_date_font_size
        result['sign_date_format'] = self.sign_date_format
        result['sign_date_pos_page'] = self.sign_date_pos_page
        result['sign_date_pos_x'] = self.sign_date_pos_x
        result['sign_date_pos_y'] = self.sign_date_pos_y
        result['sign_type'] = self.sign_type
        result['third_order_no'] = self.third_order_no
        result['width'] = self.width
        return result

    def from_map(self, map={}):
        self.account_id = map.get('account_id')
        self.file_id = map.get('file_id')
        self.order = map.get('order')
        self.pos_page = map.get('pos_page')
        self.pos_x = map.get('pos_x')
        self.pos_y = map.get('pos_y')
        self.seal_id = map.get('seal_id')
        self.sign_date_bean_type = map.get('sign_date_bean_type')
        self.sign_date_font_size = map.get('sign_date_font_size')
        self.sign_date_format = map.get('sign_date_format')
        self.sign_date_pos_page = map.get('sign_date_pos_page')
        self.sign_date_pos_x = map.get('sign_date_pos_x')
        self.sign_date_pos_y = map.get('sign_date_pos_y')
        self.sign_type = map.get('sign_type')
        self.third_order_no = map.get('third_order_no')
        self.width = map.get('width')
        return self


class RentInfo(TeaModel):
    def __init__(self, buyout_price=None, commission=None, rent_price=None, rent_term=None, retained_price=None):
        self.buyout_price = buyout_price
        self.commission = commission
        self.rent_price = rent_price
        self.rent_term = rent_term
        self.retained_price = retained_price

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['buyout_price'] = self.buyout_price
        result['commission'] = self.commission
        result['rent_price'] = self.rent_price
        result['rent_term'] = self.rent_term
        result['retained_price'] = self.retained_price
        return result

    def from_map(self, map={}):
        self.buyout_price = map.get('buyout_price')
        self.commission = map.get('commission')
        self.rent_price = map.get('rent_price')
        self.rent_term = map.get('rent_term')
        self.retained_price = map.get('retained_price')
        return self


class NotaryInfo(TeaModel):
    def __init__(self, content_hash=None, cooperation=None, creation_type=None, file_name=None, hash_algorithm=None,
                 platform=None, size=None, transaction_id=None, tx_hash=None):
        self.content_hash = content_hash
        self.cooperation = cooperation
        self.creation_type = creation_type
        self.file_name = file_name
        self.hash_algorithm = hash_algorithm
        self.platform = platform
        self.size = size
        self.transaction_id = transaction_id
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['content_hash'] = self.content_hash
        result['cooperation'] = self.cooperation
        result['creation_type'] = self.creation_type
        result['file_name'] = self.file_name
        result['hash_algorithm'] = self.hash_algorithm
        result['platform'] = self.platform
        result['size'] = self.size
        result['transaction_id'] = self.transaction_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.content_hash = map.get('content_hash')
        self.cooperation = map.get('cooperation')
        self.creation_type = map.get('creation_type')
        self.file_name = map.get('file_name')
        self.hash_algorithm = map.get('hash_algorithm')
        self.platform = map.get('platform')
        self.size = map.get('size')
        self.transaction_id = map.get('transaction_id')
        self.tx_hash = map.get('tx_hash')
        return self


class ProductInfo(TeaModel):
    def __init__(self, extra_info=None, need_did=None, product_brand=None, product_id=None, product_imei_id=None,
                 product_model=None, product_name=None, product_number=None, product_price=None, supplier_id=None,
                 supplier_version=None):
        self.extra_info = extra_info
        self.need_did = need_did
        self.product_brand = product_brand
        self.product_id = product_id
        self.product_imei_id = product_imei_id
        self.product_model = product_model
        self.product_name = product_name
        self.product_number = product_number
        self.product_price = product_price
        self.supplier_id = supplier_id
        self.supplier_version = supplier_version

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['extra_info'] = self.extra_info
        result['need_did'] = self.need_did
        result['product_brand'] = self.product_brand
        result['product_id'] = self.product_id
        result['product_imei_id'] = self.product_imei_id
        result['product_model'] = self.product_model
        result['product_name'] = self.product_name
        result['product_number'] = self.product_number
        result['product_price'] = self.product_price
        result['supplier_id'] = self.supplier_id
        result['supplier_version'] = self.supplier_version
        return result

    def from_map(self, map={}):
        self.extra_info = map.get('extra_info')
        self.need_did = map.get('need_did')
        self.product_brand = map.get('product_brand')
        self.product_id = map.get('product_id')
        self.product_imei_id = map.get('product_imei_id')
        self.product_model = map.get('product_model')
        self.product_name = map.get('product_name')
        self.product_number = map.get('product_number')
        self.product_price = map.get('product_price')
        self.supplier_id = map.get('supplier_id')
        self.supplier_version = map.get('supplier_version')
        return self


class ContractDoc(TeaModel):
    def __init__(self, encryption=None, file_id=None, file_name=None, file_password=None):
        self.encryption = encryption
        self.file_id = file_id
        self.file_name = file_name
        self.file_password = file_password

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['encryption'] = self.encryption
        result['file_id'] = self.file_id
        result['file_name'] = self.file_name
        result['file_password'] = self.file_password
        return result

    def from_map(self, map={}):
        self.encryption = map.get('encryption')
        self.file_id = map.get('file_id')
        self.file_name = map.get('file_name')
        self.file_password = map.get('file_password')
        return self


class LeaseNotaryRecord(TeaModel):
    def __init__(self, phase=None, tx_hash=None):
        self.phase = phase
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['phase'] = self.phase
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.phase = map.get('phase')
        self.tx_hash = map.get('tx_hash')
        return self


class ContractSignFieldDetail(TeaModel):
    def __init__(self, actor_indentity_type=None, add_time=None, assigned_posbean=None, assigned_seal=None,
                 authorized_account_id=None, auto_execute=None, execute_failed_reason=None, file_id=None, flow_id=None, order=None,
                 pos_page=None, pos_x=None, pos_y=None, seal_file_key=None, seal_id=None, seal_type=None,
                 signer_account_id=None, signfield_id=None, sign_type=None, status=None, status_description=None, width=None):
        self.actor_indentity_type = actor_indentity_type
        self.add_time = add_time
        self.assigned_posbean = assigned_posbean
        self.assigned_seal = assigned_seal
        self.authorized_account_id = authorized_account_id
        self.auto_execute = auto_execute
        self.execute_failed_reason = execute_failed_reason
        self.file_id = file_id
        self.flow_id = flow_id
        self.order = order
        self.pos_page = pos_page
        self.pos_x = pos_x
        self.pos_y = pos_y
        self.seal_file_key = seal_file_key
        self.seal_id = seal_id
        self.seal_type = seal_type
        self.signer_account_id = signer_account_id
        self.signfield_id = signfield_id
        self.sign_type = sign_type
        self.status = status
        self.status_description = status_description
        self.width = width

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['actor_indentity_type'] = self.actor_indentity_type
        result['add_time'] = self.add_time
        result['assigned_posbean'] = self.assigned_posbean
        result['assigned_seal'] = self.assigned_seal
        result['authorized_account_id'] = self.authorized_account_id
        result['auto_execute'] = self.auto_execute
        result['execute_failed_reason'] = self.execute_failed_reason
        result['file_id'] = self.file_id
        result['flow_id'] = self.flow_id
        result['order'] = self.order
        result['pos_page'] = self.pos_page
        result['pos_x'] = self.pos_x
        result['pos_y'] = self.pos_y
        result['seal_file_key'] = self.seal_file_key
        result['seal_id'] = self.seal_id
        result['seal_type'] = self.seal_type
        result['signer_account_id'] = self.signer_account_id
        result['signfield_id'] = self.signfield_id
        result['sign_type'] = self.sign_type
        result['status'] = self.status
        result['status_description'] = self.status_description
        result['width'] = self.width
        return result

    def from_map(self, map={}):
        self.actor_indentity_type = map.get('actor_indentity_type')
        self.add_time = map.get('add_time')
        self.assigned_posbean = map.get('assigned_posbean')
        self.assigned_seal = map.get('assigned_seal')
        self.authorized_account_id = map.get('authorized_account_id')
        self.auto_execute = map.get('auto_execute')
        self.execute_failed_reason = map.get('execute_failed_reason')
        self.file_id = map.get('file_id')
        self.flow_id = map.get('flow_id')
        self.order = map.get('order')
        self.pos_page = map.get('pos_page')
        self.pos_x = map.get('pos_x')
        self.pos_y = map.get('pos_y')
        self.seal_file_key = map.get('seal_file_key')
        self.seal_id = map.get('seal_id')
        self.seal_type = map.get('seal_type')
        self.signer_account_id = map.get('signer_account_id')
        self.signfield_id = map.get('signfield_id')
        self.sign_type = map.get('sign_type')
        self.status = map.get('status')
        self.status_description = map.get('status_description')
        self.width = map.get('width')
        return self


class ContractAccountApplication(TeaModel):
    def __init__(self, email=None, id_number=None, id_type=None, mobile=None, name=None, user_id=None):
        self.email = email
        self.id_number = id_number
        self.id_type = id_type
        self.mobile = mobile
        self.name = name
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['email'] = self.email
        result['id_number'] = self.id_number
        result['id_type'] = self.id_type
        result['mobile'] = self.mobile
        result['name'] = self.name
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.email = map.get('email')
        self.id_number = map.get('id_number')
        self.id_type = map.get('id_type')
        self.mobile = map.get('mobile')
        self.name = map.get('name')
        self.user_id = map.get('user_id')
        return self


class ContractSignFlowConfig(TeaModel):
    def __init__(self, notice_developer_url=None, notice_type=None, redirect_url=None, sign_platform=None):
        self.notice_developer_url = notice_developer_url
        self.notice_type = notice_type
        self.redirect_url = redirect_url
        self.sign_platform = sign_platform

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['notice_developer_url'] = self.notice_developer_url
        result['notice_type'] = self.notice_type
        result['redirect_url'] = self.redirect_url
        result['sign_platform'] = self.sign_platform
        return result

    def from_map(self, map={}):
        self.notice_developer_url = map.get('notice_developer_url')
        self.notice_type = map.get('notice_type')
        self.redirect_url = map.get('redirect_url')
        self.sign_platform = map.get('sign_platform')
        return self


class LeaseIotItemInfo(TeaModel):
    def __init__(self, date=None, raw_data=None, tx_hash=None):
        self.date = date
        self.raw_data = raw_data
        self.tx_hash = tx_hash

    def validate(self):
        if self.date:
            self.validate_pattern(self.date, 'date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['date'] = self.date
        result['raw_data'] = self.raw_data
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.date = map.get('date')
        self.raw_data = map.get('raw_data')
        self.tx_hash = map.get('tx_hash')
        return self


class CertificateInfo(TeaModel):
    def __init__(self, hash=None, resource_name=None, resource_url=None):
        self.hash = hash
        self.resource_name = resource_name
        self.resource_url = resource_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['hash'] = self.hash
        result['resource_name'] = self.resource_name
        result['resource_url'] = self.resource_url
        return result

    def from_map(self, map={}):
        self.hash = map.get('hash')
        self.resource_name = map.get('resource_name')
        self.resource_url = map.get('resource_url')
        return self


class ContractNotaryInitInfo(TeaModel):
    def __init__(self, content=None, file_num=None, initiator=None, signatories=None, timestamp=None, tx_hash=None):
        self.content = content
        self.file_num = file_num
        self.initiator = initiator
        self.signatories = signatories
        self.timestamp = timestamp
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['content'] = self.content
        result['file_num'] = self.file_num
        result['initiator'] = self.initiator
        result['signatories'] = self.signatories
        result['timestamp'] = self.timestamp
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.content = map.get('content')
        self.file_num = map.get('file_num')
        self.initiator = map.get('initiator')
        self.signatories = map.get('signatories')
        self.timestamp = map.get('timestamp')
        self.tx_hash = map.get('tx_hash')
        return self


class ContractTemplateStructComponent(TeaModel):
    def __init__(self, font=None, font_size=None, height=None, id=None, key=None, label=None, limit=None, page=None,
                 required=None, text_color=None, type=None, width=None, x=None, y=None):
        self.font = font
        self.font_size = font_size
        self.height = height
        self.id = id
        self.key = key
        self.label = label
        self.limit = limit
        self.page = page
        self.required = required
        self.text_color = text_color
        self.type = type
        self.width = width
        self.x = x
        self.y = y

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['font'] = self.font
        result['font_size'] = self.font_size
        result['height'] = self.height
        result['id'] = self.id
        result['key'] = self.key
        result['label'] = self.label
        result['limit'] = self.limit
        result['page'] = self.page
        result['required'] = self.required
        result['text_color'] = self.text_color
        result['type'] = self.type
        result['width'] = self.width
        result['x'] = self.x
        result['y'] = self.y
        return result

    def from_map(self, map={}):
        self.font = map.get('font')
        self.font_size = map.get('font_size')
        self.height = map.get('height')
        self.id = map.get('id')
        self.key = map.get('key')
        self.label = map.get('label')
        self.limit = map.get('limit')
        self.page = map.get('page')
        self.required = map.get('required')
        self.text_color = map.get('text_color')
        self.type = map.get('type')
        self.width = map.get('width')
        self.x = map.get('x')
        self.y = map.get('y')
        return self


class ContractSeal(TeaModel):
    def __init__(self, alias=None, create_date=None, default_flag=None, file_key=None, height=None,
                 seal_biz_type=None, seal_id=None, seal_type=None, url=None, width=None):
        self.alias = alias
        self.create_date = create_date
        self.default_flag = default_flag
        self.file_key = file_key
        self.height = height
        self.seal_biz_type = seal_biz_type
        self.seal_id = seal_id
        self.seal_type = seal_type
        self.url = url
        self.width = width

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['alias'] = self.alias
        result['create_date'] = self.create_date
        result['default_flag'] = self.default_flag
        result['file_key'] = self.file_key
        result['height'] = self.height
        result['seal_biz_type'] = self.seal_biz_type
        result['seal_id'] = self.seal_id
        result['seal_type'] = self.seal_type
        result['url'] = self.url
        result['width'] = self.width
        return result

    def from_map(self, map={}):
        self.alias = map.get('alias')
        self.create_date = map.get('create_date')
        self.default_flag = map.get('default_flag')
        self.file_key = map.get('file_key')
        self.height = map.get('height')
        self.seal_biz_type = map.get('seal_biz_type')
        self.seal_id = map.get('seal_id')
        self.seal_type = map.get('seal_type')
        self.url = map.get('url')
        self.width = map.get('width')
        return self


class ContractPlatformSignFieldApplication(TeaModel):
    def __init__(self, add_sign_time=None, file_id=None, order=None, pos_page=None, pos_x=None, pos_y=None,
                 seal_id=None, sign_type=None, third_order_no=None, width=None):
        self.add_sign_time = add_sign_time
        self.file_id = file_id
        self.order = order
        self.pos_page = pos_page
        self.pos_x = pos_x
        self.pos_y = pos_y
        self.seal_id = seal_id
        self.sign_type = sign_type
        self.third_order_no = third_order_no
        self.width = width

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['add_sign_time'] = self.add_sign_time
        result['file_id'] = self.file_id
        result['order'] = self.order
        result['pos_page'] = self.pos_page
        result['pos_x'] = self.pos_x
        result['pos_y'] = self.pos_y
        result['seal_id'] = self.seal_id
        result['sign_type'] = self.sign_type
        result['third_order_no'] = self.third_order_no
        result['width'] = self.width
        return result

    def from_map(self, map={}):
        self.add_sign_time = map.get('add_sign_time')
        self.file_id = map.get('file_id')
        self.order = map.get('order')
        self.pos_page = map.get('pos_page')
        self.pos_x = map.get('pos_x')
        self.pos_y = map.get('pos_y')
        self.seal_id = map.get('seal_id')
        self.sign_type = map.get('sign_type')
        self.third_order_no = map.get('third_order_no')
        self.width = map.get('width')
        return self


class RepaymentOrderRequest(TeaModel):
    def __init__(self, pay_date=None, pay_money=None):
        self.pay_date = pay_date
        self.pay_money = pay_money

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['pay_date'] = self.pay_date
        result['pay_money'] = self.pay_money
        return result

    def from_map(self, map={}):
        self.pay_date = map.get('pay_date')
        self.pay_money = map.get('pay_money')
        return self


class TsrResponse(TeaModel):
    def __init__(self, code=None, ctsr=None, hashed_message=None, hash_algorithm=None, message=None, sn=None, ts=None):
        self.code = code
        self.ctsr = ctsr
        self.hashed_message = hashed_message
        self.hash_algorithm = hash_algorithm
        self.message = message
        self.sn = sn
        self.ts = ts

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['code'] = self.code
        result['ctsr'] = self.ctsr
        result['hashed_message'] = self.hashed_message
        result['hash_algorithm'] = self.hash_algorithm
        result['message'] = self.message
        result['sn'] = self.sn
        result['ts'] = self.ts
        return result

    def from_map(self, map={}):
        self.code = map.get('code')
        self.ctsr = map.get('ctsr')
        self.hashed_message = map.get('hashed_message')
        self.hash_algorithm = map.get('hash_algorithm')
        self.message = map.get('message')
        self.sn = map.get('sn')
        self.ts = map.get('ts')
        return self


class CallbackTwcNotaryArbitrationStatusRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, acceptance_number=None,
                 case_no=None, confirm_time=None, preacceptance_number=None, send_time=None, status=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.acceptance_number = acceptance_number
        self.case_no = case_no
        self.confirm_time = confirm_time
        self.preacceptance_number = preacceptance_number
        self.send_time = send_time
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['acceptance_number'] = self.acceptance_number
        result['case_no'] = self.case_no
        result['confirm_time'] = self.confirm_time
        result['preacceptance_number'] = self.preacceptance_number
        result['send_time'] = self.send_time
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.acceptance_number = map.get('acceptance_number')
        self.case_no = map.get('case_no')
        self.confirm_time = map.get('confirm_time')
        self.preacceptance_number = map.get('preacceptance_number')
        self.send_time = map.get('send_time')
        self.status = map.get('status')
        return self


class CallbackTwcNotaryArbitrationStatusResponse(TeaModel):
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


class CreateTwcNotaryContractAccountRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, email=None, id_number=None,
                 id_type=None, mobile=None, name=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.email = email
        self.id_number = id_number
        self.id_type = id_type
        self.mobile = mobile
        self.name = name
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['email'] = self.email
        result['id_number'] = self.id_number
        result['id_type'] = self.id_type
        result['mobile'] = self.mobile
        result['name'] = self.name
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.email = map.get('email')
        self.id_number = map.get('id_number')
        self.id_type = map.get('id_type')
        self.mobile = map.get('mobile')
        self.name = map.get('name')
        self.user_id = map.get('user_id')
        return self


class CreateTwcNotaryContractAccountResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, account_id=None, code=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.account_id = account_id
        self.code = code
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['account_id'] = self.account_id
        result['code'] = self.code
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.account_id = map.get('account_id')
        self.code = map.get('code')
        self.message = map.get('message')
        return self


class CreateTwcNotaryContractAccountsealRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, alias=None,
                 color=None, height=None, type=None, width=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.alias = alias
        self.color = color
        self.height = height
        self.type = type
        self.width = width

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['alias'] = self.alias
        result['color'] = self.color
        result['height'] = self.height
        result['type'] = self.type
        result['width'] = self.width
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.alias = map.get('alias')
        self.color = map.get('color')
        self.height = map.get('height')
        self.type = map.get('type')
        self.width = map.get('width')
        return self


class CreateTwcNotaryContractAccountsealResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, file_key=None, message=None,
                 seal_id=None, url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.file_key = file_key
        self.message = message
        self.seal_id = seal_id
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['file_key'] = self.file_key
        result['message'] = self.message
        result['seal_id'] = self.seal_id
        result['url'] = self.url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.file_key = map.get('file_key')
        self.message = map.get('message')
        self.seal_id = map.get('seal_id')
        self.url = map.get('url')
        return self


class CreateTwcNotaryContractOrganizationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, creator=None, id_number=None,
                 id_type=None, legal_person=None, legal_person_id=None, name=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.creator = creator
        self.id_number = id_number
        self.id_type = id_type
        self.legal_person = legal_person
        self.legal_person_id = legal_person_id
        self.name = name
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['creator'] = self.creator
        result['id_number'] = self.id_number
        result['id_type'] = self.id_type
        result['legal_person'] = self.legal_person
        result['legal_person_id'] = self.legal_person_id
        result['name'] = self.name
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.creator = map.get('creator')
        self.id_number = map.get('id_number')
        self.id_type = map.get('id_type')
        self.legal_person = map.get('legal_person')
        self.legal_person_id = map.get('legal_person_id')
        self.name = map.get('name')
        self.user_id = map.get('user_id')
        return self


class CreateTwcNotaryContractOrganizationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, org_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.org_id = org_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['org_id'] = self.org_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.org_id = map.get('org_id')
        return self


class CreateTwcNotaryContractOrgsealRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, alias=None, central=None,
                 color=None, height=None, htext=None, org_id=None, qtext=None, type=None, width=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.alias = alias
        self.central = central
        self.color = color
        self.height = height
        self.htext = htext
        self.org_id = org_id
        self.qtext = qtext
        self.type = type
        self.width = width

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['alias'] = self.alias
        result['central'] = self.central
        result['color'] = self.color
        result['height'] = self.height
        result['htext'] = self.htext
        result['org_id'] = self.org_id
        result['qtext'] = self.qtext
        result['type'] = self.type
        result['width'] = self.width
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.alias = map.get('alias')
        self.central = map.get('central')
        self.color = map.get('color')
        self.height = map.get('height')
        self.htext = map.get('htext')
        self.org_id = map.get('org_id')
        self.qtext = map.get('qtext')
        self.type = map.get('type')
        self.width = map.get('width')
        return self


class CreateTwcNotaryContractOrgsealResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, file_key=None, message=None,
                 seal_id=None, url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.file_key = file_key
        self.message = message
        self.seal_id = seal_id
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['file_key'] = self.file_key
        result['message'] = self.message
        result['seal_id'] = self.seal_id
        result['url'] = self.url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.file_key = map.get('file_key')
        self.message = map.get('message')
        self.seal_id = map.get('seal_id')
        self.url = map.get('url')
        return self


class AuthTwcNotaryContractSignRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, deadline=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.deadline = deadline

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['deadline'] = self.deadline
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.deadline = map.get('deadline')
        return self


class AuthTwcNotaryContractSignResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, accepted=None, code=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.accepted = accepted
        self.code = code
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['accepted'] = self.accepted
        result['code'] = self.code
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.accepted = map.get('accepted')
        self.code = map.get('code')
        self.message = map.get('message')
        return self


class CreateTwcNotaryContractTemplateRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, content_md_5=None,
                 content_type=None, convert_2pdf=None, file_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.content_md_5 = content_md_5
        self.content_type = content_type
        self.convert_2pdf = convert_2pdf
        self.file_name = file_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['content_md5'] = self.content_md_5
        result['content_type'] = self.content_type
        result['convert2_pdf'] = self.convert_2pdf
        result['file_name'] = self.file_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.content_md_5 = map.get('content_md5')
        self.content_type = map.get('content_type')
        self.convert_2pdf = map.get('convert2_pdf')
        self.file_name = map.get('file_name')
        return self


class CreateTwcNotaryContractTemplateResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, template_id=None,
                 upload_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.template_id = template_id
        self.upload_url = upload_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['template_id'] = self.template_id
        result['upload_url'] = self.upload_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.template_id = map.get('template_id')
        self.upload_url = map.get('upload_url')
        return self


class CreateTwcNotaryContractFlowRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auto_archive=None,
                 business_scene=None, config_info=None, contract_remind=None, contract_validity=None, initiator_account_id=None,
                 initiator_authorized_account_id=None, sign_validity=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auto_archive = auto_archive
        self.business_scene = business_scene
        self.config_info = config_info
        self.contract_remind = contract_remind
        self.contract_validity = contract_validity
        self.initiator_account_id = initiator_account_id
        self.initiator_authorized_account_id = initiator_authorized_account_id
        self.sign_validity = sign_validity

    def validate(self):
        if self.config_info:
            self.config_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auto_archive'] = self.auto_archive
        result['business_scene'] = self.business_scene
        if self.config_info is not None:
            result['config_info'] = self.config_info.to_map()
        else:
            result['config_info'] = None
        result['contract_remind'] = self.contract_remind
        result['contract_validity'] = self.contract_validity
        result['initiator_account_id'] = self.initiator_account_id
        result['initiator_authorized_account_id'] = self.initiator_authorized_account_id
        result['sign_validity'] = self.sign_validity
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auto_archive = map.get('auto_archive')
        self.business_scene = map.get('business_scene')
        if map.get('config_info') is not None:
            temp_model = ContractSignFlowConfig()
            self.config_info = temp_model.from_map(map['config_info'])
        else:
            self.config_info = None
        self.contract_remind = map.get('contract_remind')
        self.contract_validity = map.get('contract_validity')
        self.initiator_account_id = map.get('initiator_account_id')
        self.initiator_authorized_account_id = map.get('initiator_authorized_account_id')
        self.sign_validity = map.get('sign_validity')
        return self


class CreateTwcNotaryContractFlowResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, flow_id=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.flow_id = flow_id
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['flow_id'] = self.flow_id
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.flow_id = map.get('flow_id')
        self.message = map.get('message')
        return self


class AddTwcNotaryContractDocumentRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, docs=None, flow_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.docs = docs
        self.flow_id = flow_id

    def validate(self):
        if self.docs:
            for k in self.docs:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['docs'] = []
        if self.docs is not None:
            for k in self.docs:
                result['docs'].append(k.to_map() if k else None)
        else:
            result['docs'] = None
        result['flow_id'] = self.flow_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.docs = []
        if map.get('docs') is not None:
            for k in map.get('docs'):
                temp_model = ContractDoc()
                temp_model = temp_model.from_map(k)
                self.docs.append(temp_model)
        else:
            self.docs = None
        self.flow_id = map.get('flow_id')
        return self


class AddTwcNotaryContractDocumentResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        return self


class AddTwcNotaryContractSignfieldRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None, signfields=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id
        self.signfields = signfields

    def validate(self):
        if self.signfields:
            for k in self.signfields:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        result['signfields'] = []
        if self.signfields is not None:
            for k in self.signfields:
                result['signfields'].append(k.to_map() if k else None)
        else:
            result['signfields'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        self.signfields = []
        if map.get('signfields') is not None:
            for k in map.get('signfields'):
                temp_model = ContractSignFieldApplication()
                temp_model = temp_model.from_map(k)
                self.signfields.append(temp_model)
        else:
            self.signfields = None
        return self


class AddTwcNotaryContractSignfieldResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, signfields=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.signfields = signfields

    def validate(self):
        if self.signfields:
            for k in self.signfields:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['signfields'] = []
        if self.signfields is not None:
            for k in self.signfields:
                result['signfields'].append(k.to_map() if k else None)
        else:
            result['signfields'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.signfields = []
        if map.get('signfields') is not None:
            for k in map.get('signfields'):
                temp_model = ContractSignField()
                temp_model = temp_model.from_map(k)
                self.signfields.append(temp_model)
        else:
            self.signfields = None
        return self


class StartTwcNotaryContractFlowRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        return self


class StartTwcNotaryContractFlowResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        return self


class SaveTwcNotaryContractFlowRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        return self


class SaveTwcNotaryContractFlowResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        return self


class DownloadTwcNotaryContractDocumentRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        return self


class DownloadTwcNotaryContractDocumentResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, docs=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.docs = docs
        self.message = message

    def validate(self):
        if self.docs:
            for k in self.docs:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['docs'] = []
        if self.docs is not None:
            for k in self.docs:
                result['docs'].append(k.to_map() if k else None)
        else:
            result['docs'] = None
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.docs = []
        if map.get('docs') is not None:
            for k in map.get('docs'):
                temp_model = ContractDocAddress()
                temp_model = temp_model.from_map(k)
                self.docs.append(temp_model)
        else:
            self.docs = None
        self.message = map.get('message')
        return self


class AddTwcNotaryContractFileRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, name=None,
                 simple_form_fields=None, template_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.name = name
        self.simple_form_fields = simple_form_fields
        self.template_id = template_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['name'] = self.name
        result['simple_form_fields'] = self.simple_form_fields
        result['template_id'] = self.template_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.name = map.get('name')
        self.simple_form_fields = map.get('simple_form_fields')
        self.template_id = map.get('template_id')
        return self


class AddTwcNotaryContractFileResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, download_url=None,
                 file_id=None, file_name=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.download_url = download_url
        self.file_id = file_id
        self.file_name = file_name
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['download_url'] = self.download_url
        result['file_id'] = self.file_id
        result['file_name'] = self.file_name
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.download_url = map.get('download_url')
        self.file_id = map.get('file_id')
        self.file_name = map.get('file_name')
        self.message = map.get('message')
        return self


class CreateTwcNotaryContractPlatformRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, creator=None, platform=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.creator = creator
        self.platform = platform

    def validate(self):
        if self.creator:
            self.creator.validate()
        if self.platform:
            self.platform.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.creator is not None:
            result['creator'] = self.creator.to_map()
        else:
            result['creator'] = None
        if self.platform is not None:
            result['platform'] = self.platform.to_map()
        else:
            result['platform'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('creator') is not None:
            temp_model = ContractAccountApplication()
            self.creator = temp_model.from_map(map['creator'])
        else:
            self.creator = None
        if map.get('platform') is not None:
            temp_model = ContractOrganizationApplication()
            self.platform = temp_model.from_map(map['platform'])
        else:
            self.platform = None
        return self


class CreateTwcNotaryContractPlatformResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, creator_id=None, message=None,
                 platform_id=None, secret=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.creator_id = creator_id
        self.message = message
        self.platform_id = platform_id
        self.secret = secret

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['creator_id'] = self.creator_id
        result['message'] = self.message
        result['platform_id'] = self.platform_id
        result['secret'] = self.secret
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.creator_id = map.get('creator_id')
        self.message = map.get('message')
        self.platform_id = map.get('platform_id')
        self.secret = map.get('secret')
        return self


class CreateTwcNotaryContractUserRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, organization=None, user=None,
                 user_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.organization = organization
        self.user = user
        self.user_type = user_type

    def validate(self):
        if self.organization:
            self.organization.validate()
        if self.user:
            self.user.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.organization is not None:
            result['organization'] = self.organization.to_map()
        else:
            result['organization'] = None
        if self.user is not None:
            result['user'] = self.user.to_map()
        else:
            result['user'] = None
        result['user_type'] = self.user_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('organization') is not None:
            temp_model = ContractOrganizationApplication()
            self.organization = temp_model.from_map(map['organization'])
        else:
            self.organization = None
        if map.get('user') is not None:
            temp_model = ContractAccountApplication()
            self.user = temp_model.from_map(map['user'])
        else:
            self.user = None
        self.user_type = map.get('user_type')
        return self


class CreateTwcNotaryContractUserResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None,
                 organization_id=None, user_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.organization_id = organization_id
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['organization_id'] = self.organization_id
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.organization_id = map.get('organization_id')
        self.user_id = map.get('user_id')
        return self


class StartTwcNotaryContractHandsignRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, agent_account_id=None,
                 auto_archive=None, business_scene=None, contract_remind=None, contract_sign_flow_config=None,
                 contract_validity=None, initiator_account_id=None, initiator_authorized_account_id=None, repayment_order_info=None,
                 sign_platform=None, sign_validity=None, simple_form_fields=None, template=None, user_account=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.agent_account_id = agent_account_id
        self.auto_archive = auto_archive
        self.business_scene = business_scene
        self.contract_remind = contract_remind
        self.contract_sign_flow_config = contract_sign_flow_config
        self.contract_validity = contract_validity
        self.initiator_account_id = initiator_account_id
        self.initiator_authorized_account_id = initiator_authorized_account_id
        self.repayment_order_info = repayment_order_info
        self.sign_platform = sign_platform
        self.sign_validity = sign_validity
        self.simple_form_fields = simple_form_fields
        self.template = template
        self.user_account = user_account

    def validate(self):
        if self.contract_sign_flow_config:
            self.contract_sign_flow_config.validate()
        if self.repayment_order_info:
            for k in self.repayment_order_info:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['agent_account_id'] = self.agent_account_id
        result['auto_archive'] = self.auto_archive
        result['business_scene'] = self.business_scene
        result['contract_remind'] = self.contract_remind
        if self.contract_sign_flow_config is not None:
            result['contract_sign_flow_config'] = self.contract_sign_flow_config.to_map()
        else:
            result['contract_sign_flow_config'] = None
        result['contract_validity'] = self.contract_validity
        result['initiator_account_id'] = self.initiator_account_id
        result['initiator_authorized_account_id'] = self.initiator_authorized_account_id
        result['repayment_order_info'] = []
        if self.repayment_order_info is not None:
            for k in self.repayment_order_info:
                result['repayment_order_info'].append(k.to_map() if k else None)
        else:
            result['repayment_order_info'] = None
        result['sign_platform'] = self.sign_platform
        result['sign_validity'] = self.sign_validity
        result['simple_form_fields'] = self.simple_form_fields
        result['template'] = self.template
        result['user_account'] = self.user_account
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.agent_account_id = map.get('agent_account_id')
        self.auto_archive = map.get('auto_archive')
        self.business_scene = map.get('business_scene')
        self.contract_remind = map.get('contract_remind')
        if map.get('contract_sign_flow_config') is not None:
            temp_model = ContractSignFlowConfig()
            self.contract_sign_flow_config = temp_model.from_map(map['contract_sign_flow_config'])
        else:
            self.contract_sign_flow_config = None
        self.contract_validity = map.get('contract_validity')
        self.initiator_account_id = map.get('initiator_account_id')
        self.initiator_authorized_account_id = map.get('initiator_authorized_account_id')
        self.repayment_order_info = []
        if map.get('repayment_order_info') is not None:
            for k in map.get('repayment_order_info'):
                temp_model = RepaymentOrderRequest()
                temp_model = temp_model.from_map(k)
                self.repayment_order_info.append(temp_model)
        else:
            self.repayment_order_info = None
        self.sign_platform = map.get('sign_platform')
        self.sign_validity = map.get('sign_validity')
        self.simple_form_fields = map.get('simple_form_fields')
        self.template = map.get('template')
        self.user_account = map.get('user_account')
        return self


class StartTwcNotaryContractHandsignResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, flow_id=None, message=None,
                 url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.flow_id = flow_id
        self.message = message
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['flow_id'] = self.flow_id
        result['message'] = self.message
        result['url'] = self.url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.flow_id = map.get('flow_id')
        self.message = map.get('message')
        self.url = map.get('url')
        return self


class QueryTwcNotaryContractFlowRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        return self


class QueryTwcNotaryContractFlowResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, auto_archive=None, business_scene=None,
                 code=None, config_info=None, contract_remind=None, contract_validity=None, flow_desc=None,
                 flow_end_time=None, flow_id=None, flow_start_time=None, flow_status=None, initiator_account_id=None,
                 initiator_authorized_account_id=None, message=None, sign_validity=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.auto_archive = auto_archive
        self.business_scene = business_scene
        self.code = code
        self.config_info = config_info
        self.contract_remind = contract_remind
        self.contract_validity = contract_validity
        self.flow_desc = flow_desc
        self.flow_end_time = flow_end_time
        self.flow_id = flow_id
        self.flow_start_time = flow_start_time
        self.flow_status = flow_status
        self.initiator_account_id = initiator_account_id
        self.initiator_authorized_account_id = initiator_authorized_account_id
        self.message = message
        self.sign_validity = sign_validity

    def validate(self):
        if self.config_info:
            self.config_info.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['auto_archive'] = self.auto_archive
        result['business_scene'] = self.business_scene
        result['code'] = self.code
        if self.config_info is not None:
            result['config_info'] = self.config_info.to_map()
        else:
            result['config_info'] = None
        result['contract_remind'] = self.contract_remind
        result['contract_validity'] = self.contract_validity
        result['flow_desc'] = self.flow_desc
        result['flow_end_time'] = self.flow_end_time
        result['flow_id'] = self.flow_id
        result['flow_start_time'] = self.flow_start_time
        result['flow_status'] = self.flow_status
        result['initiator_account_id'] = self.initiator_account_id
        result['initiator_authorized_account_id'] = self.initiator_authorized_account_id
        result['message'] = self.message
        result['sign_validity'] = self.sign_validity
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.auto_archive = map.get('auto_archive')
        self.business_scene = map.get('business_scene')
        self.code = map.get('code')
        if map.get('config_info') is not None:
            temp_model = ContractSignFlowConfig()
            self.config_info = temp_model.from_map(map['config_info'])
        else:
            self.config_info = None
        self.contract_remind = map.get('contract_remind')
        self.contract_validity = map.get('contract_validity')
        self.flow_desc = map.get('flow_desc')
        self.flow_end_time = map.get('flow_end_time')
        self.flow_id = map.get('flow_id')
        self.flow_start_time = map.get('flow_start_time')
        self.flow_status = map.get('flow_status')
        self.initiator_account_id = map.get('initiator_account_id')
        self.initiator_authorized_account_id = map.get('initiator_authorized_account_id')
        self.message = map.get('message')
        self.sign_validity = map.get('sign_validity')
        return self


class CreateTwcNotaryContractAccountsealimageRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, alias=None,
                 data=None, height=None, transparent_flag=None, type=None, width=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.alias = alias
        self.data = data
        self.height = height
        self.transparent_flag = transparent_flag
        self.type = type
        self.width = width

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['alias'] = self.alias
        result['data'] = self.data
        result['height'] = self.height
        result['transparent_flag'] = self.transparent_flag
        result['type'] = self.type
        result['width'] = self.width
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.alias = map.get('alias')
        self.data = map.get('data')
        self.height = map.get('height')
        self.transparent_flag = map.get('transparent_flag')
        self.type = map.get('type')
        self.width = map.get('width')
        return self


class CreateTwcNotaryContractAccountsealimageResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, file_key=None, height=None,
                 message=None, seal_id=None, url=None, width=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.file_key = file_key
        self.height = height
        self.message = message
        self.seal_id = seal_id
        self.url = url
        self.width = width

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['file_key'] = self.file_key
        result['height'] = self.height
        result['message'] = self.message
        result['seal_id'] = self.seal_id
        result['url'] = self.url
        result['width'] = self.width
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.file_key = map.get('file_key')
        self.height = map.get('height')
        self.message = map.get('message')
        self.seal_id = map.get('seal_id')
        self.url = map.get('url')
        self.width = map.get('width')
        return self


class GetTwcNotaryContractFileuploadurlRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None,
                 content_md_5=None, content_type=None, convert_2pdf=None, file_name=None, file_size=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.content_md_5 = content_md_5
        self.content_type = content_type
        self.convert_2pdf = convert_2pdf
        self.file_name = file_name
        self.file_size = file_size

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['content_md5'] = self.content_md_5
        result['content_type'] = self.content_type
        result['convert_2_pdf'] = self.convert_2pdf
        result['file_name'] = self.file_name
        result['file_size'] = self.file_size
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.content_md_5 = map.get('content_md5')
        self.content_type = map.get('content_type')
        self.convert_2pdf = map.get('convert_2_pdf')
        self.file_name = map.get('file_name')
        self.file_size = map.get('file_size')
        return self


class GetTwcNotaryContractFileuploadurlResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, file_id=None, message=None,
                 upload_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.file_id = file_id
        self.message = message
        self.upload_url = upload_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['file_id'] = self.file_id
        result['message'] = self.message
        result['upload_url'] = self.upload_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.file_id = map.get('file_id')
        self.message = map.get('message')
        self.upload_url = map.get('upload_url')
        return self


class AddTwcNotaryContractPlatformsignfieldsRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None, signfields=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id
        self.signfields = signfields

    def validate(self):
        if self.signfields:
            self.signfields.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        if self.signfields is not None:
            result['signfields'] = self.signfields.to_map()
        else:
            result['signfields'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        if map.get('signfields') is not None:
            temp_model = ContractPlatformSignFieldApplication()
            self.signfields = temp_model.from_map(map['signfields'])
        else:
            self.signfields = None
        return self


class AddTwcNotaryContractPlatformsignfieldsResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, signfields=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.signfields = signfields

    def validate(self):
        if self.signfields:
            for k in self.signfields:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['signfields'] = []
        if self.signfields is not None:
            for k in self.signfields:
                result['signfields'].append(k.to_map() if k else None)
        else:
            result['signfields'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.signfields = []
        if map.get('signfields') is not None:
            for k in map.get('signfields'):
                temp_model = ContractSignField()
                temp_model = temp_model.from_map(k)
                self.signfields.append(temp_model)
        else:
            self.signfields = None
        return self


class GetTwcNotaryContractFileRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, file_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.file_id = file_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['file_id'] = self.file_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.file_id = map.get('file_id')
        return self


class GetTwcNotaryContractFileResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, download_url=None,
                 file_id=None, message=None, name=None, pdf_total_pages=None, size=None, status=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.download_url = download_url
        self.file_id = file_id
        self.message = message
        self.name = name
        self.pdf_total_pages = pdf_total_pages
        self.size = size
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['download_url'] = self.download_url
        result['file_id'] = self.file_id
        result['message'] = self.message
        result['name'] = self.name
        result['pdf_total_pages'] = self.pdf_total_pages
        result['size'] = self.size
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.download_url = map.get('download_url')
        self.file_id = map.get('file_id')
        self.message = map.get('message')
        self.name = map.get('name')
        self.pdf_total_pages = map.get('pdf_total_pages')
        self.size = map.get('size')
        self.status = map.get('status')
        return self


class QueryTwcNotaryContractAccountsealsRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, offset=None,
                 size=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.offset = offset
        self.size = size

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['offset'] = self.offset
        result['size'] = self.size
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.offset = map.get('offset')
        self.size = map.get('size')
        return self


class QueryTwcNotaryContractAccountsealsResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, seals=None,
                 total=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.seals = seals
        self.total = total

    def validate(self):
        if self.seals:
            for k in self.seals:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['seals'] = []
        if self.seals is not None:
            for k in self.seals:
                result['seals'].append(k.to_map() if k else None)
        else:
            result['seals'] = None
        result['total'] = self.total
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.seals = []
        if map.get('seals') is not None:
            for k in map.get('seals'):
                temp_model = ContractSeal()
                temp_model = temp_model.from_map(k)
                self.seals.append(temp_model)
        else:
            self.seals = None
        self.total = map.get('total')
        return self


class QueryTwcNotaryContractOrganizationsealsRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, offset=None, org_id=None,
                 size=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.offset = offset
        self.org_id = org_id
        self.size = size

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['offset'] = self.offset
        result['org_id'] = self.org_id
        result['size'] = self.size
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.offset = map.get('offset')
        self.org_id = map.get('org_id')
        self.size = map.get('size')
        return self


class QueryTwcNotaryContractOrganizationsealsResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, seals=None,
                 total=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.seals = seals
        self.total = total

    def validate(self):
        if self.seals:
            for k in self.seals:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['seals'] = []
        if self.seals is not None:
            for k in self.seals:
                result['seals'].append(k.to_map() if k else None)
        else:
            result['seals'] = None
        result['total'] = self.total
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.seals = []
        if map.get('seals') is not None:
            for k in map.get('seals'):
                temp_model = ContractSeal()
                temp_model = temp_model.from_map(k)
                self.seals.append(temp_model)
        else:
            self.seals = None
        self.total = map.get('total')
        return self


class QueryTwcNotaryContractFlowsignerRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        return self


class QueryTwcNotaryContractFlowsignerResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, signers=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.signers = signers

    def validate(self):
        if self.signers:
            for k in self.signers:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['signers'] = []
        if self.signers is not None:
            for k in self.signers:
                result['signers'].append(k.to_map() if k else None)
        else:
            result['signers'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.signers = []
        if map.get('signers') is not None:
            for k in map.get('signers'):
                temp_model = ContractFlowSigner()
                temp_model = temp_model.from_map(k)
                self.signers.append(temp_model)
        else:
            self.signers = None
        return self


class QueryTwcNotaryContractSignfieldsRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, flow_id=None,
                 signfield_ids=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.flow_id = flow_id
        self.signfield_ids = signfield_ids

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['flow_id'] = self.flow_id
        result['signfield_ids'] = self.signfield_ids
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.flow_id = map.get('flow_id')
        self.signfield_ids = map.get('signfield_ids')
        return self


class QueryTwcNotaryContractSignfieldsResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, signfields=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.signfields = signfields

    def validate(self):
        if self.signfields:
            for k in self.signfields:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['signfields'] = []
        if self.signfields is not None:
            for k in self.signfields:
                result['signfields'].append(k.to_map() if k else None)
        else:
            result['signfields'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.signfields = []
        if map.get('signfields') is not None:
            for k in map.get('signfields'):
                temp_model = ContractSignFieldDetail()
                temp_model = temp_model.from_map(k)
                self.signfields.append(temp_model)
        else:
            self.signfields = None
        return self


class QueryTwcNotaryContractAccountRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        return self


class QueryTwcNotaryContractAccountResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, account_id=None, code=None, email=None,
                 id_number=None, id_type=None, message=None, mobile=None, name=None, third_party_user_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.account_id = account_id
        self.code = code
        self.email = email
        self.id_number = id_number
        self.id_type = id_type
        self.message = message
        self.mobile = mobile
        self.name = name
        self.third_party_user_id = third_party_user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['account_id'] = self.account_id
        result['code'] = self.code
        result['email'] = self.email
        result['id_number'] = self.id_number
        result['id_type'] = self.id_type
        result['message'] = self.message
        result['mobile'] = self.mobile
        result['name'] = self.name
        result['third_party_user_id'] = self.third_party_user_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.account_id = map.get('account_id')
        self.code = map.get('code')
        self.email = map.get('email')
        self.id_number = map.get('id_number')
        self.id_type = map.get('id_type')
        self.message = map.get('message')
        self.mobile = map.get('mobile')
        self.name = map.get('name')
        self.third_party_user_id = map.get('third_party_user_id')
        return self


class QueryTwcNotaryContractOrganizationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, org_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.org_id = org_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['org_id'] = self.org_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.org_id = map.get('org_id')
        return self


class QueryTwcNotaryContractOrganizationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, id_number=None, id_type=None,
                 message=None, name=None, org_id=None, org_legal_id_number=None, org_legal_name=None,
                 third_party_user_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.id_number = id_number
        self.id_type = id_type
        self.message = message
        self.name = name
        self.org_id = org_id
        self.org_legal_id_number = org_legal_id_number
        self.org_legal_name = org_legal_name
        self.third_party_user_id = third_party_user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['id_number'] = self.id_number
        result['id_type'] = self.id_type
        result['message'] = self.message
        result['name'] = self.name
        result['org_id'] = self.org_id
        result['org_legal_id_number'] = self.org_legal_id_number
        result['org_legal_name'] = self.org_legal_name
        result['third_party_user_id'] = self.third_party_user_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.id_number = map.get('id_number')
        self.id_type = map.get('id_type')
        self.message = map.get('message')
        self.name = map.get('name')
        self.org_id = map.get('org_id')
        self.org_legal_id_number = map.get('org_legal_id_number')
        self.org_legal_name = map.get('org_legal_name')
        self.third_party_user_id = map.get('third_party_user_id')
        return self


class QueryTwcNotaryContractTemplateRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, template_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.template_id = template_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['template_id'] = self.template_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.template_id = map.get('template_id')
        return self


class QueryTwcNotaryContractTemplateResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, create_time=None,
                 download_url=None, file_size=None, message=None, struct_components=None, template_id=None, template_name=None,
                 update_time=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.create_time = create_time
        self.download_url = download_url
        self.file_size = file_size
        self.message = message
        self.struct_components = struct_components
        self.template_id = template_id
        self.template_name = template_name
        self.update_time = update_time

    def validate(self):
        if self.struct_components:
            for k in self.struct_components:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['create_time'] = self.create_time
        result['download_url'] = self.download_url
        result['file_size'] = self.file_size
        result['message'] = self.message
        result['struct_components'] = []
        if self.struct_components is not None:
            for k in self.struct_components:
                result['struct_components'].append(k.to_map() if k else None)
        else:
            result['struct_components'] = None
        result['template_id'] = self.template_id
        result['template_name'] = self.template_name
        result['update_time'] = self.update_time
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.create_time = map.get('create_time')
        self.download_url = map.get('download_url')
        self.file_size = map.get('file_size')
        self.message = map.get('message')
        self.struct_components = []
        if map.get('struct_components') is not None:
            for k in map.get('struct_components'):
                temp_model = ContractTemplateStructComponent()
                temp_model = temp_model.from_map(k)
                self.struct_components.append(temp_model)
        else:
            self.struct_components = None
        self.template_id = map.get('template_id')
        self.template_name = map.get('template_name')
        self.update_time = map.get('update_time')
        return self


class CreateTwcNotaryContractSignflowRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auto_archive=None,
                 business_scene=None, contract_sign_flow_config=None, initiator_account_id=None,
                 initiator_authorized_account_id=None, sign_platform=None, sign_validity=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auto_archive = auto_archive
        self.business_scene = business_scene
        self.contract_sign_flow_config = contract_sign_flow_config
        self.initiator_account_id = initiator_account_id
        self.initiator_authorized_account_id = initiator_authorized_account_id
        self.sign_platform = sign_platform
        self.sign_validity = sign_validity

    def validate(self):
        if self.contract_sign_flow_config:
            self.contract_sign_flow_config.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auto_archive'] = self.auto_archive
        result['business_scene'] = self.business_scene
        if self.contract_sign_flow_config is not None:
            result['contract_sign_flow_config'] = self.contract_sign_flow_config.to_map()
        else:
            result['contract_sign_flow_config'] = None
        result['initiator_account_id'] = self.initiator_account_id
        result['initiator_authorized_account_id'] = self.initiator_authorized_account_id
        result['sign_platform'] = self.sign_platform
        result['sign_validity'] = self.sign_validity
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auto_archive = map.get('auto_archive')
        self.business_scene = map.get('business_scene')
        if map.get('contract_sign_flow_config') is not None:
            temp_model = ContractSignFlowConfig()
            self.contract_sign_flow_config = temp_model.from_map(map['contract_sign_flow_config'])
        else:
            self.contract_sign_flow_config = None
        self.initiator_account_id = map.get('initiator_account_id')
        self.initiator_authorized_account_id = map.get('initiator_authorized_account_id')
        self.sign_platform = map.get('sign_platform')
        self.sign_validity = map.get('sign_validity')
        return self


class CreateTwcNotaryContractSignflowResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, flow_id=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.flow_id = flow_id
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['flow_id'] = self.flow_id
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.flow_id = map.get('flow_id')
        self.message = map.get('message')
        return self


class CreateTwcNotaryContractRegisterzftRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, address=None,
                 agent_account_id=None, alias_name=None, alipay_logon_id=None, apply_time=None, binding_alipay_logon_id=None,
                 card_alias_no=None, cert_image=None, cert_no=None, cert_type=None, city_code=None, contact_email=None,
                 contact_mobile=None, contact_name=None, contact_phone=None, contact_tag=None, contact_type=None,
                 district_code=None, ext_info=None, ip_role_id=None, legal_cert_back_image=None, legal_cert_front_image=None,
                 legal_cert_no=None, legal_name=None, mcc=None, merchant_name=None, merchant_type=None, name=None, order_id=None,
                 out_biz_no=None, out_door_image=None, platform_tuid=None, province_code=None, service=None,
                 service_phone=None, sign_time_with_isv=None, site_name=None, site_type=None, site_url=None, smid=None,
                 status=None, update=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.address = address
        self.agent_account_id = agent_account_id
        self.alias_name = alias_name
        self.alipay_logon_id = alipay_logon_id
        self.apply_time = apply_time
        self.binding_alipay_logon_id = binding_alipay_logon_id
        self.card_alias_no = card_alias_no
        self.cert_image = cert_image
        self.cert_no = cert_no
        self.cert_type = cert_type
        self.city_code = city_code
        self.contact_email = contact_email
        self.contact_mobile = contact_mobile
        self.contact_name = contact_name
        self.contact_phone = contact_phone
        self.contact_tag = contact_tag
        self.contact_type = contact_type
        self.district_code = district_code
        self.ext_info = ext_info
        self.ip_role_id = ip_role_id
        self.legal_cert_back_image = legal_cert_back_image
        self.legal_cert_front_image = legal_cert_front_image
        self.legal_cert_no = legal_cert_no
        self.legal_name = legal_name
        self.mcc = mcc
        self.merchant_name = merchant_name
        self.merchant_type = merchant_type
        self.name = name
        self.order_id = order_id
        self.out_biz_no = out_biz_no
        self.out_door_image = out_door_image
        self.platform_tuid = platform_tuid
        self.province_code = province_code
        self.service = service
        self.service_phone = service_phone
        self.sign_time_with_isv = sign_time_with_isv
        self.site_name = site_name
        self.site_type = site_type
        self.site_url = site_url
        self.smid = smid
        self.status = status
        self.update = update

    def validate(self):
        if self.apply_time:
            self.validate_pattern(self.apply_time, 'apply_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['address'] = self.address
        result['agent_account_id'] = self.agent_account_id
        result['alias_name'] = self.alias_name
        result['alipay_logon_id'] = self.alipay_logon_id
        result['apply_time'] = self.apply_time
        result['binding_alipay_logon_id'] = self.binding_alipay_logon_id
        result['card_alias_no'] = self.card_alias_no
        result['cert_image'] = self.cert_image
        result['cert_no'] = self.cert_no
        result['cert_type'] = self.cert_type
        result['city_code'] = self.city_code
        result['contact_email'] = self.contact_email
        result['contact_mobile'] = self.contact_mobile
        result['contact_name'] = self.contact_name
        result['contact_phone'] = self.contact_phone
        result['contact_tag'] = self.contact_tag
        result['contact_type'] = self.contact_type
        result['district_code'] = self.district_code
        result['ext_info'] = self.ext_info
        result['ip_role_id'] = self.ip_role_id
        result['legal_cert_back_image'] = self.legal_cert_back_image
        result['legal_cert_front_image'] = self.legal_cert_front_image
        result['legal_cert_no'] = self.legal_cert_no
        result['legal_name'] = self.legal_name
        result['mcc'] = self.mcc
        result['merchant_name'] = self.merchant_name
        result['merchant_type'] = self.merchant_type
        result['name'] = self.name
        result['order_id'] = self.order_id
        result['out_biz_no'] = self.out_biz_no
        result['out_door_image'] = self.out_door_image
        result['platform_tuid'] = self.platform_tuid
        result['province_code'] = self.province_code
        result['service'] = self.service
        result['service_phone'] = self.service_phone
        result['sign_time_with_isv'] = self.sign_time_with_isv
        result['site_name'] = self.site_name
        result['site_type'] = self.site_type
        result['site_url'] = self.site_url
        result['smid'] = self.smid
        result['status'] = self.status
        result['update'] = self.update
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.address = map.get('address')
        self.agent_account_id = map.get('agent_account_id')
        self.alias_name = map.get('alias_name')
        self.alipay_logon_id = map.get('alipay_logon_id')
        self.apply_time = map.get('apply_time')
        self.binding_alipay_logon_id = map.get('binding_alipay_logon_id')
        self.card_alias_no = map.get('card_alias_no')
        self.cert_image = map.get('cert_image')
        self.cert_no = map.get('cert_no')
        self.cert_type = map.get('cert_type')
        self.city_code = map.get('city_code')
        self.contact_email = map.get('contact_email')
        self.contact_mobile = map.get('contact_mobile')
        self.contact_name = map.get('contact_name')
        self.contact_phone = map.get('contact_phone')
        self.contact_tag = map.get('contact_tag')
        self.contact_type = map.get('contact_type')
        self.district_code = map.get('district_code')
        self.ext_info = map.get('ext_info')
        self.ip_role_id = map.get('ip_role_id')
        self.legal_cert_back_image = map.get('legal_cert_back_image')
        self.legal_cert_front_image = map.get('legal_cert_front_image')
        self.legal_cert_no = map.get('legal_cert_no')
        self.legal_name = map.get('legal_name')
        self.mcc = map.get('mcc')
        self.merchant_name = map.get('merchant_name')
        self.merchant_type = map.get('merchant_type')
        self.name = map.get('name')
        self.order_id = map.get('order_id')
        self.out_biz_no = map.get('out_biz_no')
        self.out_door_image = map.get('out_door_image')
        self.platform_tuid = map.get('platform_tuid')
        self.province_code = map.get('province_code')
        self.service = map.get('service')
        self.service_phone = map.get('service_phone')
        self.sign_time_with_isv = map.get('sign_time_with_isv')
        self.site_name = map.get('site_name')
        self.site_type = map.get('site_type')
        self.site_url = map.get('site_url')
        self.smid = map.get('smid')
        self.status = map.get('status')
        self.update = map.get('update')
        return self


class CreateTwcNotaryContractRegisterzftResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        return self


class CreateTwcNotaryContractPlatformtemplateRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auto_deduction=None,
                 auto_deduction_force=None, content_md_5=None, content_type=None, convert_2pdf=None, file_name=None, sign_fields=None,
                 user_sign_pages=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auto_deduction = auto_deduction
        self.auto_deduction_force = auto_deduction_force
        self.content_md_5 = content_md_5
        self.content_type = content_type
        self.convert_2pdf = convert_2pdf
        self.file_name = file_name
        self.sign_fields = sign_fields
        self.user_sign_pages = user_sign_pages

    def validate(self):
        if self.sign_fields:
            for k in self.sign_fields:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auto_deduction'] = self.auto_deduction
        result['auto_deduction_force'] = self.auto_deduction_force
        result['content_md5'] = self.content_md_5
        result['content_type'] = self.content_type
        result['convert2_pdf'] = self.convert_2pdf
        result['file_name'] = self.file_name
        result['sign_fields'] = []
        if self.sign_fields is not None:
            for k in self.sign_fields:
                result['sign_fields'].append(k.to_map() if k else None)
        else:
            result['sign_fields'] = None
        result['user_sign_pages'] = []
        if self.user_sign_pages is not None:
            for k in self.user_sign_pages:
                result['user_sign_pages'].append(k)
        else:
            result['user_sign_pages'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auto_deduction = map.get('auto_deduction')
        self.auto_deduction_force = map.get('auto_deduction_force')
        self.content_md_5 = map.get('content_md5')
        self.content_type = map.get('content_type')
        self.convert_2pdf = map.get('convert2_pdf')
        self.file_name = map.get('file_name')
        self.sign_fields = []
        if map.get('sign_fields') is not None:
            for k in map.get('sign_fields'):
                temp_model = ContractPlatformSignField()
                temp_model = temp_model.from_map(k)
                self.sign_fields.append(temp_model)
        else:
            self.sign_fields = None
        self.user_sign_pages = []
        if map.get('user_sign_pages') is not None:
            for k in map.get('user_sign_pages'):
                self.user_sign_pages.append(k)
        else:
            self.user_sign_pages = None
        return self


class CreateTwcNotaryContractPlatformtemplateResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, template_id=None,
                 upload_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.template_id = template_id
        self.upload_url = upload_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['template_id'] = self.template_id
        result['upload_url'] = self.upload_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.template_id = map.get('template_id')
        self.upload_url = map.get('upload_url')
        return self


class QueryTwcNotaryContractMerchantzftRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, agent_account_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.agent_account_id = agent_account_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['agent_account_id'] = self.agent_account_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.agent_account_id = map.get('agent_account_id')
        return self


class QueryTwcNotaryContractMerchantzftResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, data=None, err_message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.data = data
        self.err_message = err_message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['data'] = self.data
        result['err_message'] = self.err_message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.data = map.get('data')
        self.err_message = map.get('err_message')
        return self


class ListTwcNotaryContractOuttradeidRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None, page_index=None,
                 page_size=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id
        self.page_index = page_index
        self.page_size = page_size

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        result['page_index'] = self.page_index
        result['page_size'] = self.page_size
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        self.page_index = map.get('page_index')
        self.page_size = map.get('page_size')
        return self


class ListTwcNotaryContractOuttradeidResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 out_trade_no=None, total=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.out_trade_no = out_trade_no
        self.total = total

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['out_trade_no'] = []
        if self.out_trade_no is not None:
            for k in self.out_trade_no:
                result['out_trade_no'].append(k)
        else:
            result['out_trade_no'] = None
        result['total'] = self.total
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.out_trade_no = []
        if map.get('out_trade_no') is not None:
            for k in map.get('out_trade_no'):
                self.out_trade_no.append(k)
        else:
            self.out_trade_no = None
        self.total = map.get('total')
        return self


class QueryTwcNotaryContractTradedetailRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None, out_trade_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id
        self.out_trade_no = out_trade_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        result['out_trade_no'] = self.out_trade_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        self.out_trade_no = map.get('out_trade_no')
        return self


class QueryTwcNotaryContractTradedetailResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, data=None, err_message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.data = data
        self.err_message = err_message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['data'] = self.data
        result['err_message'] = self.err_message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.data = map.get('data')
        self.err_message = map.get('err_message')
        return self


class CreateTwcNotaryContractMerchantrefundRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None,
                 out_request_no=None, out_trade_no=None, refund_amount=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id
        self.out_request_no = out_request_no
        self.out_trade_no = out_trade_no
        self.refund_amount = refund_amount

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        result['out_request_no'] = self.out_request_no
        result['out_trade_no'] = self.out_trade_no
        result['refund_amount'] = self.refund_amount
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        self.out_request_no = map.get('out_request_no')
        self.out_trade_no = map.get('out_trade_no')
        self.refund_amount = map.get('refund_amount')
        return self


class CreateTwcNotaryContractMerchantrefundResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None,
                 out_request_no=None, out_trade_no=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.out_request_no = out_request_no
        self.out_trade_no = out_trade_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['out_request_no'] = self.out_request_no
        result['out_trade_no'] = self.out_trade_no
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.out_request_no = map.get('out_request_no')
        self.out_trade_no = map.get('out_trade_no')
        return self


class CreateTwcNotaryContractAdminaccountRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        return self


class CreateTwcNotaryContractAdminaccountResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        return self


class ListTwcNotaryContractTradeidsRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None, page_index=None,
                 page_size=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id
        self.page_index = page_index
        self.page_size = page_size

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        result['page_index'] = self.page_index
        result['page_size'] = self.page_size
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        self.page_index = map.get('page_index')
        self.page_size = map.get('page_size')
        return self


class ListTwcNotaryContractTradeidsResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 out_trade_no=None, total=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.out_trade_no = out_trade_no
        self.total = total

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['out_trade_no'] = []
        if self.out_trade_no is not None:
            for k in self.out_trade_no:
                result['out_trade_no'].append(k)
        else:
            result['out_trade_no'] = None
        result['total'] = self.total
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.out_trade_no = []
        if map.get('out_trade_no') is not None:
            for k in map.get('out_trade_no'):
                self.out_trade_no.append(k)
        else:
            self.out_trade_no = None
        self.total = map.get('total')
        return self


class CreateTwcNotaryContractCommontriggerRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None,
                 repayment_order_info=None, user_tuid=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id
        self.repayment_order_info = repayment_order_info
        self.user_tuid = user_tuid

    def validate(self):
        if self.repayment_order_info:
            for k in self.repayment_order_info:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        result['repayment_order_info'] = []
        if self.repayment_order_info is not None:
            for k in self.repayment_order_info:
                result['repayment_order_info'].append(k.to_map() if k else None)
        else:
            result['repayment_order_info'] = None
        result['user_tuid'] = self.user_tuid
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        self.repayment_order_info = []
        if map.get('repayment_order_info') is not None:
            for k in map.get('repayment_order_info'):
                temp_model = RepaymentOrderRequest()
                temp_model = temp_model.from_map(k)
                self.repayment_order_info.append(temp_model)
        else:
            self.repayment_order_info = None
        self.user_tuid = map.get('user_tuid')
        return self


class CreateTwcNotaryContractCommontriggerResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None, flow_id=None,
                 platform_tuid=None, user_tuid=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.flow_id = flow_id
        self.platform_tuid = platform_tuid
        self.user_tuid = user_tuid

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['flow_id'] = self.flow_id
        result['platform_tuid'] = self.platform_tuid
        result['user_tuid'] = self.user_tuid
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.flow_id = map.get('flow_id')
        self.platform_tuid = map.get('platform_tuid')
        self.user_tuid = map.get('user_tuid')
        return self


class CreateTwcNotaryContractMerchantindirectzftRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_content=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_content = biz_content

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_content'] = self.biz_content
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_content = map.get('biz_content')
        return self


class CreateTwcNotaryContractMerchantindirectzftResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, body=None, code=None, message=None,
                 order_id=None, sub_code=None, sub_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.body = body
        self.code = code
        self.message = message
        self.order_id = order_id
        self.sub_code = sub_code
        self.sub_msg = sub_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['body'] = self.body
        result['code'] = self.code
        result['message'] = self.message
        result['order_id'] = self.order_id
        result['sub_code'] = self.sub_code
        result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.body = map.get('body')
        self.code = map.get('code')
        self.message = map.get('message')
        self.order_id = map.get('order_id')
        self.sub_code = map.get('sub_code')
        self.sub_msg = map.get('sub_msg')
        return self


class QueryTwcNotaryContractMerchantindirectzftRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, order_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.order_id = order_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['order_id'] = self.order_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.order_id = map.get('order_id')
        return self


class QueryTwcNotaryContractMerchantindirectzftResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, apply_id=None, code=None, ext_info=None,
                 ip_role_id=None, merchant_name=None, message=None, status=None, sub_code=None, sub_msg=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.apply_id = apply_id
        self.code = code
        self.ext_info = ext_info
        self.ip_role_id = ip_role_id
        self.merchant_name = merchant_name
        self.message = message
        self.status = status
        self.sub_code = sub_code
        self.sub_msg = sub_msg

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['apply_id'] = self.apply_id
        result['code'] = self.code
        result['ext_info'] = self.ext_info
        result['ip_role_id'] = []
        if self.ip_role_id is not None:
            for k in self.ip_role_id:
                result['ip_role_id'].append(k)
        else:
            result['ip_role_id'] = None
        result['merchant_name'] = self.merchant_name
        result['message'] = self.message
        result['status'] = self.status
        result['sub_code'] = self.sub_code
        result['sub_msg'] = self.sub_msg
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.apply_id = map.get('apply_id')
        self.code = map.get('code')
        self.ext_info = map.get('ext_info')
        self.ip_role_id = []
        if map.get('ip_role_id') is not None:
            for k in map.get('ip_role_id'):
                self.ip_role_id.append(k)
        else:
            self.ip_role_id = None
        self.merchant_name = map.get('merchant_name')
        self.message = map.get('message')
        self.status = map.get('status')
        self.sub_code = map.get('sub_code')
        self.sub_msg = map.get('sub_msg')
        return self


class QueryTwcNotaryPayresultfileurlRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bill_date=None, bill_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bill_date = bill_date
        self.bill_type = bill_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bill_date'] = self.bill_date
        result['bill_type'] = self.bill_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bill_date = map.get('bill_date')
        self.bill_type = map.get('bill_type')
        return self


class QueryTwcNotaryPayresultfileurlResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, pay_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.pay_url = pay_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['pay_url'] = self.pay_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.pay_url = map.get('pay_url')
        return self


class CreateTwcNotaryContractMerchantimageRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, content=None, file_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.content = content
        self.file_name = file_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['content'] = self.content
        result['file_name'] = self.file_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.content = map.get('content')
        self.file_name = map.get('file_name')
        return self


class CreateTwcNotaryContractMerchantimageResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, image_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.image_id = image_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['image_id'] = self.image_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.image_id = map.get('image_id')
        return self


class CancelTwcNotaryContractPaytradeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        return self


class CancelTwcNotaryContractPaytradeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, canceled_out_trade_no=None, code=None,
                 err_message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.canceled_out_trade_no = canceled_out_trade_no
        self.code = code
        self.err_message = err_message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['canceled_out_trade_no'] = []
        if self.canceled_out_trade_no is not None:
            for k in self.canceled_out_trade_no:
                result['canceled_out_trade_no'].append(k)
        else:
            result['canceled_out_trade_no'] = None
        result['code'] = self.code
        result['err_message'] = self.err_message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.canceled_out_trade_no = []
        if map.get('canceled_out_trade_no') is not None:
            for k in map.get('canceled_out_trade_no'):
                self.canceled_out_trade_no.append(k)
        else:
            self.canceled_out_trade_no = None
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        return self


class CreateTwcNotaryContractHandsignflowRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auto_archive=None,
                 business_scene=None, config_info=None, contract_remind=None, contract_validity=None, initiator_account_id=None,
                 initiator_authorized_account_id=None, sign_validity=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auto_archive = auto_archive
        self.business_scene = business_scene
        self.config_info = config_info
        self.contract_remind = contract_remind
        self.contract_validity = contract_validity
        self.initiator_account_id = initiator_account_id
        self.initiator_authorized_account_id = initiator_authorized_account_id
        self.sign_validity = sign_validity

    def validate(self):
        if self.config_info:
            self.config_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auto_archive'] = self.auto_archive
        result['business_scene'] = self.business_scene
        if self.config_info is not None:
            result['config_info'] = self.config_info.to_map()
        else:
            result['config_info'] = None
        result['contract_remind'] = self.contract_remind
        result['contract_validity'] = self.contract_validity
        result['initiator_account_id'] = self.initiator_account_id
        result['initiator_authorized_account_id'] = self.initiator_authorized_account_id
        result['sign_validity'] = self.sign_validity
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auto_archive = map.get('auto_archive')
        self.business_scene = map.get('business_scene')
        if map.get('config_info') is not None:
            temp_model = ContractSignFlowConfig()
            self.config_info = temp_model.from_map(map['config_info'])
        else:
            self.config_info = None
        self.contract_remind = map.get('contract_remind')
        self.contract_validity = map.get('contract_validity')
        self.initiator_account_id = map.get('initiator_account_id')
        self.initiator_authorized_account_id = map.get('initiator_authorized_account_id')
        self.sign_validity = map.get('sign_validity')
        return self


class CreateTwcNotaryContractHandsignflowResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, flow_id=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.flow_id = flow_id
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['flow_id'] = self.flow_id
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.flow_id = map.get('flow_id')
        self.message = map.get('message')
        return self


class CreateTwcNotaryContractHandsignfieldRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None, sign_fields=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id
        self.sign_fields = sign_fields

    def validate(self):
        if self.sign_fields:
            for k in self.sign_fields:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        result['sign_fields'] = []
        if self.sign_fields is not None:
            for k in self.sign_fields:
                result['sign_fields'].append(k.to_map() if k else None)
        else:
            result['sign_fields'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        self.sign_fields = []
        if map.get('sign_fields') is not None:
            for k in map.get('sign_fields'):
                temp_model = ContractHandSignFieldApplication()
                temp_model = temp_model.from_map(k)
                self.sign_fields.append(temp_model)
        else:
            self.sign_fields = None
        return self


class CreateTwcNotaryContractHandsignfieldResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, signfields=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.signfields = signfields

    def validate(self):
        if self.signfields:
            for k in self.signfields:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['signfields'] = []
        if self.signfields is not None:
            for k in self.signfields:
                result['signfields'].append(k.to_map() if k else None)
        else:
            result['signfields'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.signfields = []
        if map.get('signfields') is not None:
            for k in map.get('signfields'):
                temp_model = ContractSignField()
                temp_model = temp_model.from_map(k)
                self.signfields.append(temp_model)
        else:
            self.signfields = None
        return self


class GetTwcNotaryContractSignurlRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, flow_id=None,
                 organize_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.flow_id = flow_id
        self.organize_id = organize_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['flow_id'] = self.flow_id
        result['organize_id'] = self.organize_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.flow_id = map.get('flow_id')
        self.organize_id = map.get('organize_id')
        return self


class GetTwcNotaryContractSignurlResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['url'] = self.url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.url = map.get('url')
        return self


class CreateTwcNotaryWithholdAgreementRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, credit_amount=None,
                 external_agreement_no=None, merchant_id=None, merchant_name=None, merchant_service_description=None,
                 merchant_service_name=None, name_cert_hash=None, repayment_url=None, return_url=None, third_party_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.credit_amount = credit_amount
        self.external_agreement_no = external_agreement_no
        self.merchant_id = merchant_id
        self.merchant_name = merchant_name
        self.merchant_service_description = merchant_service_description
        self.merchant_service_name = merchant_service_name
        self.name_cert_hash = name_cert_hash
        self.repayment_url = repayment_url
        self.return_url = return_url
        self.third_party_id = third_party_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['credit_amount'] = self.credit_amount
        result['external_agreement_no'] = self.external_agreement_no
        result['merchant_id'] = self.merchant_id
        result['merchant_name'] = self.merchant_name
        result['merchant_service_description'] = self.merchant_service_description
        result['merchant_service_name'] = self.merchant_service_name
        result['name_cert_hash'] = self.name_cert_hash
        result['repayment_url'] = self.repayment_url
        result['return_url'] = self.return_url
        result['third_party_id'] = self.third_party_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.credit_amount = map.get('credit_amount')
        self.external_agreement_no = map.get('external_agreement_no')
        self.merchant_id = map.get('merchant_id')
        self.merchant_name = map.get('merchant_name')
        self.merchant_service_description = map.get('merchant_service_description')
        self.merchant_service_name = map.get('merchant_service_name')
        self.name_cert_hash = map.get('name_cert_hash')
        self.repayment_url = map.get('repayment_url')
        self.return_url = map.get('return_url')
        self.third_party_id = map.get('third_party_id')
        return self


class CreateTwcNotaryWithholdAgreementResponse(TeaModel):
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


class QueryTwcNotaryWithholdAgreementRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, external_agreement_no=None,
                 third_party_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.external_agreement_no = external_agreement_no
        self.third_party_id = third_party_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['external_agreement_no'] = self.external_agreement_no
        result['third_party_id'] = self.third_party_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.external_agreement_no = map.get('external_agreement_no')
        self.third_party_id = map.get('third_party_id')
        return self


class QueryTwcNotaryWithholdAgreementResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, credit_amount=None,
                 external_agreement_no=None, merchant_id=None, merchant_name=None, merchant_service_name=None, name_cert_hash=None,
                 repayment_url=None, status=None, third_party_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.credit_amount = credit_amount
        self.external_agreement_no = external_agreement_no
        self.merchant_id = merchant_id
        self.merchant_name = merchant_name
        self.merchant_service_name = merchant_service_name
        self.name_cert_hash = name_cert_hash
        self.repayment_url = repayment_url
        self.status = status
        self.third_party_id = third_party_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['credit_amount'] = self.credit_amount
        result['external_agreement_no'] = self.external_agreement_no
        result['merchant_id'] = self.merchant_id
        result['merchant_name'] = self.merchant_name
        result['merchant_service_name'] = self.merchant_service_name
        result['name_cert_hash'] = self.name_cert_hash
        result['repayment_url'] = self.repayment_url
        result['status'] = self.status
        result['third_party_id'] = self.third_party_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.credit_amount = map.get('credit_amount')
        self.external_agreement_no = map.get('external_agreement_no')
        self.merchant_id = map.get('merchant_id')
        self.merchant_name = map.get('merchant_name')
        self.merchant_service_name = map.get('merchant_service_name')
        self.name_cert_hash = map.get('name_cert_hash')
        self.repayment_url = map.get('repayment_url')
        self.status = map.get('status')
        self.third_party_id = map.get('third_party_id')
        return self


class QueryTwcNotaryWithholdAgreementurlRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, external_agreement_no=None,
                 third_party_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.external_agreement_no = external_agreement_no
        self.third_party_id = third_party_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['external_agreement_no'] = self.external_agreement_no
        result['third_party_id'] = self.third_party_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.external_agreement_no = map.get('external_agreement_no')
        self.third_party_id = map.get('third_party_id')
        return self


class QueryTwcNotaryWithholdAgreementurlResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, result_message=None, url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.result_message = result_message
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['result_message'] = self.result_message
        result['url'] = self.url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.result_message = map.get('result_message')
        self.url = map.get('url')
        return self


class CreateTwcNotaryWithholdOverduetimeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, merchant_id=None,
                 merchant_name=None, merchant_service_name=None, tenant_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.merchant_id = merchant_id
        self.merchant_name = merchant_name
        self.merchant_service_name = merchant_service_name
        self.tenant_id = tenant_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['merchant_id'] = self.merchant_id
        result['merchant_name'] = self.merchant_name
        result['merchant_service_name'] = self.merchant_service_name
        result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.merchant_id = map.get('merchant_id')
        self.merchant_name = map.get('merchant_name')
        self.merchant_service_name = map.get('merchant_service_name')
        self.tenant_id = map.get('tenant_id')
        return self


class CreateTwcNotaryWithholdOverduetimeResponse(TeaModel):
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


class SendTwcNotaryWithholdDeductRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None,
                 business_params=None, external_agreement_no=None, order_title=None, out_biz_no=None, remark=None,
                 third_party_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.business_params = business_params
        self.external_agreement_no = external_agreement_no
        self.order_title = order_title
        self.out_biz_no = out_biz_no
        self.remark = remark
        self.third_party_id = third_party_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['business_params'] = self.business_params
        result['external_agreement_no'] = self.external_agreement_no
        result['order_title'] = self.order_title
        result['out_biz_no'] = self.out_biz_no
        result['remark'] = self.remark
        result['third_party_id'] = self.third_party_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.business_params = map.get('business_params')
        self.external_agreement_no = map.get('external_agreement_no')
        self.order_title = map.get('order_title')
        self.out_biz_no = map.get('out_biz_no')
        self.remark = map.get('remark')
        self.third_party_id = map.get('third_party_id')
        return self


class SendTwcNotaryWithholdDeductResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, entrust_order_id=None, status=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.entrust_order_id = entrust_order_id
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['entrust_order_id'] = self.entrust_order_id
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.entrust_order_id = map.get('entrust_order_id')
        self.status = map.get('status')
        return self


class QueryTwcNotaryWithholdPayresultRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, entrust_order_id=None,
                 out_biz_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.entrust_order_id = entrust_order_id
        self.out_biz_no = out_biz_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['entrust_order_id'] = self.entrust_order_id
        result['out_biz_no'] = self.out_biz_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.entrust_order_id = map.get('entrust_order_id')
        self.out_biz_no = map.get('out_biz_no')
        return self


class QueryTwcNotaryWithholdPayresultResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, pay_date=None, pay_order_id=None,
                 status=None, trans_amount=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.pay_date = pay_date
        self.pay_order_id = pay_order_id
        self.status = status
        self.trans_amount = trans_amount

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['pay_date'] = self.pay_date
        result['pay_order_id'] = self.pay_order_id
        result['status'] = self.status
        result['trans_amount'] = self.trans_amount
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.pay_date = map.get('pay_date')
        self.pay_order_id = map.get('pay_order_id')
        self.status = map.get('status')
        self.trans_amount = map.get('trans_amount')
        return self


class SendTwcNotaryWithholdRefundRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, order_id=None,
                 out_request_no=None, refund_amount=None, remark=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.order_id = order_id
        self.out_request_no = out_request_no
        self.refund_amount = refund_amount
        self.remark = remark

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['order_id'] = self.order_id
        result['out_request_no'] = self.out_request_no
        result['refund_amount'] = self.refund_amount
        result['remark'] = self.remark
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.order_id = map.get('order_id')
        self.out_request_no = map.get('out_request_no')
        self.refund_amount = map.get('refund_amount')
        self.remark = map.get('remark')
        return self


class SendTwcNotaryWithholdRefundResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, refund_amount=None, refund_date=None,
                 refund_order_id=None, status=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.refund_amount = refund_amount
        self.refund_date = refund_date
        self.refund_order_id = refund_order_id
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['refund_amount'] = self.refund_amount
        result['refund_date'] = self.refund_date
        result['refund_order_id'] = self.refund_order_id
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.refund_amount = map.get('refund_amount')
        self.refund_date = map.get('refund_date')
        self.refund_order_id = map.get('refund_order_id')
        self.status = map.get('status')
        return self


class SendTwcNotaryContractInvitationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_process_id=None,
                 callback_url=None, email=None, id_number=None, invitee_cert_type=None, invite_type=None, legal_cert_type=None,
                 legal_name=None, legal_no=None, mobile=None, name=None, notify_type=None, organ_cert_no=None,
                 organ_cert_type=None, organ_name=None, redirect_url=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_process_id = biz_process_id
        self.callback_url = callback_url
        self.email = email
        self.id_number = id_number
        self.invitee_cert_type = invitee_cert_type
        self.invite_type = invite_type
        self.legal_cert_type = legal_cert_type
        self.legal_name = legal_name
        self.legal_no = legal_no
        self.mobile = mobile
        self.name = name
        self.notify_type = notify_type
        self.organ_cert_no = organ_cert_no
        self.organ_cert_type = organ_cert_type
        self.organ_name = organ_name
        self.redirect_url = redirect_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_process_id'] = self.biz_process_id
        result['callback_url'] = self.callback_url
        result['email'] = self.email
        result['id_number'] = self.id_number
        result['invitee_cert_type'] = self.invitee_cert_type
        result['invite_type'] = self.invite_type
        result['legal_cert_type'] = self.legal_cert_type
        result['legal_name'] = self.legal_name
        result['legal_no'] = self.legal_no
        result['mobile'] = self.mobile
        result['name'] = self.name
        result['notify_type'] = self.notify_type
        result['organ_cert_no'] = self.organ_cert_no
        result['organ_cert_type'] = self.organ_cert_type
        result['organ_name'] = self.organ_name
        result['redirect_url'] = self.redirect_url
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_process_id = map.get('biz_process_id')
        self.callback_url = map.get('callback_url')
        self.email = map.get('email')
        self.id_number = map.get('id_number')
        self.invitee_cert_type = map.get('invitee_cert_type')
        self.invite_type = map.get('invite_type')
        self.legal_cert_type = map.get('legal_cert_type')
        self.legal_name = map.get('legal_name')
        self.legal_no = map.get('legal_no')
        self.mobile = map.get('mobile')
        self.name = map.get('name')
        self.notify_type = map.get('notify_type')
        self.organ_cert_no = map.get('organ_cert_no')
        self.organ_cert_type = map.get('organ_cert_type')
        self.organ_name = map.get('organ_name')
        self.redirect_url = map.get('redirect_url')
        return self


class SendTwcNotaryContractInvitationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, invitation_id=None,
                 invitation_url=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.invitation_id = invitation_id
        self.invitation_url = invitation_url
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['invitation_id'] = self.invitation_id
        result['invitation_url'] = self.invitation_url
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.invitation_id = map.get('invitation_id')
        self.invitation_url = map.get('invitation_url')
        self.message = map.get('message')
        return self


class ListTwcNotaryContractPayruleRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, flow_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.flow_id = flow_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['flow_id'] = self.flow_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.flow_id = map.get('flow_id')
        return self


class ListTwcNotaryContractPayruleResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryWithholdQrcodeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, external_agreement_no=None,
                 third_party_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.external_agreement_no = external_agreement_no
        self.third_party_id = third_party_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['external_agreement_no'] = self.external_agreement_no
        result['third_party_id'] = self.third_party_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.external_agreement_no = map.get('external_agreement_no')
        self.third_party_id = map.get('third_party_id')
        return self


class CreateTwcNotaryWithholdQrcodeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, qr_code_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.qr_code_url = qr_code_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['qr_code_url'] = self.qr_code_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.qr_code_url = map.get('qr_code_url')
        return self


class CancelTwcNotaryContractPaysingletradeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cancel_out_order_no=None,
                 flow_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.cancel_out_order_no = cancel_out_order_no
        self.flow_id = flow_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cancel_out_order_no'] = self.cancel_out_order_no
        result['flow_id'] = self.flow_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cancel_out_order_no = map.get('cancel_out_order_no')
        self.flow_id = map.get('flow_id')
        return self


class CancelTwcNotaryContractPaysingletradeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, canceled_out_trade_no=None, code=None,
                 err_message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.canceled_out_trade_no = canceled_out_trade_no
        self.code = code
        self.err_message = err_message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['canceled_out_trade_no'] = self.canceled_out_trade_no
        result['code'] = self.code
        result['err_message'] = self.err_message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.canceled_out_trade_no = map.get('canceled_out_trade_no')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        return self


class ApplyTwcNotaryContractCallbackkeyRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        return self


class ApplyTwcNotaryContractCallbackkeyResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, key=None, message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.key = key
        self.message = message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['key'] = self.key
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.key = map.get('key')
        self.message = map.get('message')
        return self


class DeployTwcNotaryMytfTappRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, tapp_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.tapp_id = tapp_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['tapp_id'] = self.tapp_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.tapp_id = map.get('tapp_id')
        return self


class DeployTwcNotaryMytfTappResponse(TeaModel):
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


class CheckTwcNotaryEpidentityTwometaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, ep_cert_name=None,
                 ep_cert_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        return self


class CheckTwcNotaryEpidentityTwometaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, enterprise_status=None,
                 open_time=None, passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.enterprise_status = enterprise_status
        self.open_time = open_time
        self.passed = passed

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['enterprise_status'] = self.enterprise_status
        result['open_time'] = self.open_time
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.enterprise_status = map.get('enterprise_status')
        self.open_time = map.get('open_time')
        self.passed = map.get('passed')
        return self


class CheckTwcNotaryEpidentityThreemetaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, ep_cert_name=None,
                 ep_cert_no=None, legal_person_cert_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no
        self.legal_person_cert_name = legal_person_cert_name

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
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        return self


class CheckTwcNotaryEpidentityThreemetaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, enterprise_status=None,
                 open_time=None, passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.enterprise_status = enterprise_status
        self.open_time = open_time
        self.passed = passed

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['enterprise_status'] = self.enterprise_status
        result['open_time'] = self.open_time
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.enterprise_status = map.get('enterprise_status')
        self.open_time = map.get('open_time')
        self.passed = map.get('passed')
        return self


class CheckTwcNotaryEpidentityFourmetaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, ep_cert_name=None,
                 ep_cert_no=None, legal_person_cert_name=None, legal_person_cert_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no
        self.legal_person_cert_name = legal_person_cert_name
        self.legal_person_cert_no = legal_person_cert_no

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
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        return self


class CheckTwcNotaryEpidentityFourmetaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, enterprise_status=None,
                 open_time=None, passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.enterprise_status = enterprise_status
        self.open_time = open_time
        self.passed = passed

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['enterprise_status'] = self.enterprise_status
        result['open_time'] = self.open_time
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.enterprise_status = map.get('enterprise_status')
        self.open_time = map.get('open_time')
        self.passed = map.get('passed')
        return self


class CheckTwcNotaryNotarizationOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, order_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.order_id = order_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['order_id'] = self.order_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.order_id = map.get('order_id')
        return self


class CheckTwcNotaryNotarizationOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, biz_id=None, face_auth_code=None,
                 org_id=None, user_id=None, valid=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.biz_id = biz_id
        self.face_auth_code = face_auth_code
        self.org_id = org_id
        self.user_id = user_id
        self.valid = valid

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['biz_id'] = []
        if self.biz_id is not None:
            for k in self.biz_id:
                result['biz_id'].append(k)
        else:
            result['biz_id'] = None
        result['face_auth_code'] = self.face_auth_code
        result['org_id'] = self.org_id
        result['user_id'] = self.user_id
        result['valid'] = self.valid
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.biz_id = []
        if map.get('biz_id') is not None:
            for k in map.get('biz_id'):
                self.biz_id.append(k)
        else:
            self.biz_id = None
        self.face_auth_code = map.get('face_auth_code')
        self.org_id = map.get('org_id')
        self.user_id = map.get('user_id')
        self.valid = map.get('valid')
        return self


class UpdateTwcNotaryNotarizationOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, order_id=None, reason=None,
                 status=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.order_id = order_id
        self.reason = reason
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['order_id'] = self.order_id
        result['reason'] = self.reason
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.order_id = map.get('order_id')
        self.reason = map.get('reason')
        self.status = map.get('status')
        return self


class UpdateTwcNotaryNotarizationOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, accepted=None, reason=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.accepted = accepted
        self.reason = reason

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['accepted'] = self.accepted
        result['reason'] = self.reason
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.accepted = map.get('accepted')
        self.reason = map.get('reason')
        return self


class SetTwcNotaryNotarizationOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_code=None, key=None,
                 order_id=None, value=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_code = biz_code
        self.key = key
        self.order_id = order_id
        self.value = value

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_code'] = self.biz_code
        result['key'] = self.key
        result['order_id'] = self.order_id
        result['value'] = self.value
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_code = map.get('biz_code')
        self.key = map.get('key')
        self.order_id = map.get('order_id')
        self.value = map.get('value')
        return self


class SetTwcNotaryNotarizationOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, accepted=None, reason=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.accepted = accepted
        self.reason = reason

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['accepted'] = self.accepted
        result['reason'] = self.reason
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.accepted = map.get('accepted')
        self.reason = map.get('reason')
        return self


class InitTwcNotaryIdentificationFaceauthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_code=None, cert_name=None,
                 cert_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auth_code = auth_code
        self.cert_name = cert_name
        self.cert_no = cert_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_code'] = self.auth_code
        result['cert_name'] = self.cert_name
        result['cert_no'] = self.cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_code = map.get('auth_code')
        self.cert_name = map.get('cert_name')
        self.cert_no = map.get('cert_no')
        return self


class InitTwcNotaryIdentificationFaceauthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, certify_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.certify_id = certify_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['certify_id'] = self.certify_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.certify_id = map.get('certify_id')
        return self


class CertifyTwcNotaryIdentificationFaceauthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_code=None,
                 callback_url=None, certify_id=None, redirect_url=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auth_code = auth_code
        self.callback_url = callback_url
        self.certify_id = certify_id
        self.redirect_url = redirect_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_code'] = self.auth_code
        result['callback_url'] = self.callback_url
        result['certify_id'] = self.certify_id
        result['redirect_url'] = self.redirect_url
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_code = map.get('auth_code')
        self.callback_url = map.get('callback_url')
        self.certify_id = map.get('certify_id')
        self.redirect_url = map.get('redirect_url')
        return self


class CertifyTwcNotaryIdentificationFaceauthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, certify_id=None, verify_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.certify_id = certify_id
        self.verify_url = verify_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['certify_id'] = self.certify_id
        result['verify_url'] = self.verify_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.certify_id = map.get('certify_id')
        self.verify_url = map.get('verify_url')
        return self


class QueryTwcNotaryIdentificationFaceauthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, auth_code=None, certify_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.auth_code = auth_code
        self.certify_id = certify_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['auth_code'] = self.auth_code
        result['certify_id'] = self.certify_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.auth_code = map.get('auth_code')
        self.certify_id = map.get('certify_id')
        return self


class QueryTwcNotaryIdentificationFaceauthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, certify_id=None, passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.certify_id = certify_id
        self.passed = passed

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['certify_id'] = self.certify_id
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.certify_id = map.get('certify_id')
        self.passed = map.get('passed')
        return self


class QueryTwcNotaryEnterpriseFaceauthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_no = biz_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_no'] = self.biz_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_no = map.get('biz_no')
        return self


class QueryTwcNotaryEnterpriseFaceauthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, biz_no=None, failed_code=None,
                 passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.biz_no = biz_no
        self.failed_code = failed_code
        self.passed = passed

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['biz_no'] = self.biz_no
        result['failed_code'] = self.failed_code
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.biz_no = map.get('biz_no')
        self.failed_code = map.get('failed_code')
        self.passed = map.get('passed')
        return self


class InitTwcNotaryEnterpriseFaceauthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, ep_cert_name=None,
                 ep_cert_no=None, ep_cert_type=None, legal_person_cert_name=None, legal_person_cert_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no
        self.ep_cert_type = ep_cert_type
        self.legal_person_cert_name = legal_person_cert_name
        self.legal_person_cert_no = legal_person_cert_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['ep_cert_type'] = self.ep_cert_type
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.ep_cert_type = map.get('ep_cert_type')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        return self


class InitTwcNotaryEnterpriseFaceauthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, biz_no=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.biz_no = biz_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['biz_no'] = self.biz_no
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.biz_no = map.get('biz_no')
        return self


class CertifyTwcNotaryEnterpriseFaceauthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_no=None, callback_url=None,
                 redirect_url=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_no = biz_no
        self.callback_url = callback_url
        self.redirect_url = redirect_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_no'] = self.biz_no
        result['callback_url'] = self.callback_url
        result['redirect_url'] = self.redirect_url
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_no = map.get('biz_no')
        self.callback_url = map.get('callback_url')
        self.redirect_url = map.get('redirect_url')
        return self


class CertifyTwcNotaryEnterpriseFaceauthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, biz_no=None, verify_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.biz_no = biz_no
        self.verify_url = verify_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['biz_no'] = self.biz_no
        result['verify_url'] = self.verify_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.biz_no = map.get('biz_no')
        self.verify_url = map.get('verify_url')
        return self


class CreateTwcNotaryLeaseOrderRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None,
                 alipay_order_amount=None, alipay_order_no=None, alipay_order_total_amount=None, deposit_waive_amount=None,
                 insurance_bill_amount=None, insurance_bill_no=None, insurance_bill_time=None, insurance_coverage=None,
                 insurance_order_no=None, insurance_order_url=None, insurance_product_coverage=None, insured=None, item_name=None,
                 item_price=None, item_type=None, merchant_alipay_account=None, merchant_alipay_id=None, merchant_name=None,
                 merchant_order_no=None, payment_channel=None, tenancy_term_end=None, tenancy_term_start=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.alipay_order_amount = alipay_order_amount
        self.alipay_order_no = alipay_order_no
        self.alipay_order_total_amount = alipay_order_total_amount
        self.deposit_waive_amount = deposit_waive_amount
        self.insurance_bill_amount = insurance_bill_amount
        self.insurance_bill_no = insurance_bill_no
        self.insurance_bill_time = insurance_bill_time
        self.insurance_coverage = insurance_coverage
        self.insurance_order_no = insurance_order_no
        self.insurance_order_url = insurance_order_url
        self.insurance_product_coverage = insurance_product_coverage
        self.insured = insured
        self.item_name = item_name
        self.item_price = item_price
        self.item_type = item_type
        self.merchant_alipay_account = merchant_alipay_account
        self.merchant_alipay_id = merchant_alipay_id
        self.merchant_name = merchant_name
        self.merchant_order_no = merchant_order_no
        self.payment_channel = payment_channel
        self.tenancy_term_end = tenancy_term_end
        self.tenancy_term_start = tenancy_term_start

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['alipay_order_amount'] = self.alipay_order_amount
        result['alipay_order_no'] = self.alipay_order_no
        result['alipay_order_total_amount'] = self.alipay_order_total_amount
        result['deposit_waive_amount'] = self.deposit_waive_amount
        result['insurance_bill_amount'] = self.insurance_bill_amount
        result['insurance_bill_no'] = self.insurance_bill_no
        result['insurance_bill_time'] = self.insurance_bill_time
        result['insurance_coverage'] = self.insurance_coverage
        result['insurance_order_no'] = self.insurance_order_no
        result['insurance_order_url'] = self.insurance_order_url
        result['insurance_product_coverage'] = self.insurance_product_coverage
        result['insured'] = self.insured
        result['item_name'] = self.item_name
        result['item_price'] = self.item_price
        result['item_type'] = self.item_type
        result['merchant_alipay_account'] = self.merchant_alipay_account
        result['merchant_alipay_id'] = self.merchant_alipay_id
        result['merchant_name'] = self.merchant_name
        result['merchant_order_no'] = self.merchant_order_no
        result['payment_channel'] = self.payment_channel
        result['tenancy_term_end'] = self.tenancy_term_end
        result['tenancy_term_start'] = self.tenancy_term_start
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.alipay_order_amount = map.get('alipay_order_amount')
        self.alipay_order_no = map.get('alipay_order_no')
        self.alipay_order_total_amount = map.get('alipay_order_total_amount')
        self.deposit_waive_amount = map.get('deposit_waive_amount')
        self.insurance_bill_amount = map.get('insurance_bill_amount')
        self.insurance_bill_no = map.get('insurance_bill_no')
        self.insurance_bill_time = map.get('insurance_bill_time')
        self.insurance_coverage = map.get('insurance_coverage')
        self.insurance_order_no = map.get('insurance_order_no')
        self.insurance_order_url = map.get('insurance_order_url')
        self.insurance_product_coverage = map.get('insurance_product_coverage')
        self.insured = map.get('insured')
        self.item_name = map.get('item_name')
        self.item_price = map.get('item_price')
        self.item_type = map.get('item_type')
        self.merchant_alipay_account = map.get('merchant_alipay_account')
        self.merchant_alipay_id = map.get('merchant_alipay_id')
        self.merchant_name = map.get('merchant_name')
        self.merchant_order_no = map.get('merchant_order_no')
        self.payment_channel = map.get('payment_channel')
        self.tenancy_term_end = map.get('tenancy_term_end')
        self.tenancy_term_start = map.get('tenancy_term_start')
        return self


class CreateTwcNotaryLeaseOrderResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, success=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['success'] = self.success
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.success = map.get('success')
        return self


class CreateTwcNotaryNotarizationBillRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, alipay_order_no=None,
                 alipay_uid=None, cert_name=None, cert_no=None, e_notarization_biz=None, e_notarization_download_url=None,
                 e_notarization_no=None, e_notarization_page_no=None, e_notarization_status=None, e_notarization_usage=None,
                 e_notarization_valid_date=None, fee_splitting=None, legal_person_name=None, order_id=None, org_id=None, payment_amount=None,
                 phone=None, scenario=None, user_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.alipay_order_no = alipay_order_no
        self.alipay_uid = alipay_uid
        self.cert_name = cert_name
        self.cert_no = cert_no
        self.e_notarization_biz = e_notarization_biz
        self.e_notarization_download_url = e_notarization_download_url
        self.e_notarization_no = e_notarization_no
        self.e_notarization_page_no = e_notarization_page_no
        self.e_notarization_status = e_notarization_status
        self.e_notarization_usage = e_notarization_usage
        self.e_notarization_valid_date = e_notarization_valid_date
        self.fee_splitting = fee_splitting
        self.legal_person_name = legal_person_name
        self.order_id = order_id
        self.org_id = org_id
        self.payment_amount = payment_amount
        self.phone = phone
        self.scenario = scenario
        self.user_type = user_type

    def validate(self):
        if self.e_notarization_valid_date:
            self.validate_pattern(self.e_notarization_valid_date, 'e_notarization_valid_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['alipay_order_no'] = self.alipay_order_no
        result['alipay_uid'] = self.alipay_uid
        result['cert_name'] = self.cert_name
        result['cert_no'] = self.cert_no
        result['e_notarization_biz'] = self.e_notarization_biz
        result['e_notarization_download_url'] = self.e_notarization_download_url
        result['e_notarization_no'] = self.e_notarization_no
        result['e_notarization_page_no'] = self.e_notarization_page_no
        result['e_notarization_status'] = self.e_notarization_status
        result['e_notarization_usage'] = self.e_notarization_usage
        result['e_notarization_valid_date'] = self.e_notarization_valid_date
        result['fee_splitting'] = self.fee_splitting
        result['legal_person_name'] = self.legal_person_name
        result['order_id'] = self.order_id
        result['org_id'] = self.org_id
        result['payment_amount'] = self.payment_amount
        result['phone'] = self.phone
        result['scenario'] = self.scenario
        result['user_type'] = self.user_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.alipay_order_no = map.get('alipay_order_no')
        self.alipay_uid = map.get('alipay_uid')
        self.cert_name = map.get('cert_name')
        self.cert_no = map.get('cert_no')
        self.e_notarization_biz = map.get('e_notarization_biz')
        self.e_notarization_download_url = map.get('e_notarization_download_url')
        self.e_notarization_no = map.get('e_notarization_no')
        self.e_notarization_page_no = map.get('e_notarization_page_no')
        self.e_notarization_status = map.get('e_notarization_status')
        self.e_notarization_usage = map.get('e_notarization_usage')
        self.e_notarization_valid_date = map.get('e_notarization_valid_date')
        self.fee_splitting = map.get('fee_splitting')
        self.legal_person_name = map.get('legal_person_name')
        self.order_id = map.get('order_id')
        self.org_id = map.get('org_id')
        self.payment_amount = map.get('payment_amount')
        self.phone = map.get('phone')
        self.scenario = map.get('scenario')
        self.user_type = map.get('user_type')
        return self


class CreateTwcNotaryNotarizationBillResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, accepted=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.accepted = accepted

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['accepted'] = self.accepted
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.accepted = map.get('accepted')
        return self


class InitTwcNotaryCertificationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, applier=None, notary_info=None,
                 type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.applier = applier
        self.notary_info = notary_info
        self.type = type

    def validate(self):
        if self.applier:
            self.applier.validate()
        if self.notary_info:
            for k in self.notary_info:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.applier is not None:
            result['applier'] = self.applier.to_map()
        else:
            result['applier'] = None
        result['notary_info'] = []
        if self.notary_info is not None:
            for k in self.notary_info:
                result['notary_info'].append(k.to_map() if k else None)
        else:
            result['notary_info'] = None
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('applier') is not None:
            temp_model = Identity()
            self.applier = temp_model.from_map(map['applier'])
        else:
            self.applier = None
        self.notary_info = []
        if map.get('notary_info') is not None:
            for k in map.get('notary_info'):
                temp_model = NotaryInfo()
                temp_model = temp_model.from_map(k)
                self.notary_info.append(temp_model)
        else:
            self.notary_info = None
        self.type = map.get('type')
        return self


class InitTwcNotaryCertificationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, message=None, order_id=None,
                 pay_content=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.message = message
        self.order_id = order_id
        self.pay_content = pay_content

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['message'] = self.message
        result['order_id'] = self.order_id
        result['pay_content'] = self.pay_content
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.message = map.get('message')
        self.order_id = map.get('order_id')
        self.pay_content = map.get('pay_content')
        return self


class QueryTwcNotaryCertificationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, order_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.order_id = order_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['order_id'] = self.order_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.order_id = map.get('order_id')
        return self


class QueryTwcNotaryCertificationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, certificate_info=None, code=None,
                 message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.certificate_info = certificate_info
        self.code = code
        self.message = message

    def validate(self):
        if self.certificate_info:
            for k in self.certificate_info:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['certificate_info'] = []
        if self.certificate_info is not None:
            for k in self.certificate_info:
                result['certificate_info'].append(k.to_map() if k else None)
        else:
            result['certificate_info'] = None
        result['code'] = self.code
        result['message'] = self.message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.certificate_info = []
        if map.get('certificate_info') is not None:
            for k in map.get('certificate_info'):
                temp_model = CertificateInfo()
                temp_model = temp_model.from_map(k)
                self.certificate_info.append(temp_model)
        else:
            self.certificate_info = None
        self.code = map.get('code')
        self.message = map.get('message')
        return self


class GetTwcNotaryTsrCertificateRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        return self


class GetTwcNotaryTsrCertificateResponse(TeaModel):
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


class SaveTwcNotaryJointconstraintRecordRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, beneficiary_account_code=None,
                 beneficiary_account_type=None, beneficiary_cert_number=None, beneficiary_cert_type=None, beneficiary_type=None,
                 contract_code=None, contract_fulfillment_code=None, contract_name=None, contract_txhash=None, external_url=None,
                 industry_code=None, paid_amount=None, paid_proof=None, paid_time=None, payer_account_code=None,
                 payer_account_type=None, payer_cert_number=None, payer_cert_type=None, payer_type=None, payment_amount=None,
                 payment_date_buffer=None, payment_deadline=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.beneficiary_account_code = beneficiary_account_code
        self.beneficiary_account_type = beneficiary_account_type
        self.beneficiary_cert_number = beneficiary_cert_number
        self.beneficiary_cert_type = beneficiary_cert_type
        self.beneficiary_type = beneficiary_type
        self.contract_code = contract_code
        self.contract_fulfillment_code = contract_fulfillment_code
        self.contract_name = contract_name
        self.contract_txhash = contract_txhash
        self.external_url = external_url
        self.industry_code = industry_code
        self.paid_amount = paid_amount
        self.paid_proof = paid_proof
        self.paid_time = paid_time
        self.payer_account_code = payer_account_code
        self.payer_account_type = payer_account_type
        self.payer_cert_number = payer_cert_number
        self.payer_cert_type = payer_cert_type
        self.payer_type = payer_type
        self.payment_amount = payment_amount
        self.payment_date_buffer = payment_date_buffer
        self.payment_deadline = payment_deadline

    def validate(self):
        if self.paid_time:
            self.validate_pattern(self.paid_time, 'paid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.payment_deadline:
            self.validate_pattern(self.payment_deadline, 'payment_deadline', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['beneficiary_account_code'] = self.beneficiary_account_code
        result['beneficiary_account_type'] = self.beneficiary_account_type
        result['beneficiary_cert_number'] = self.beneficiary_cert_number
        result['beneficiary_cert_type'] = self.beneficiary_cert_type
        result['beneficiary_type'] = self.beneficiary_type
        result['contract_code'] = self.contract_code
        result['contract_fulfillment_code'] = self.contract_fulfillment_code
        result['contract_name'] = self.contract_name
        result['contract_txhash'] = self.contract_txhash
        result['external_url'] = self.external_url
        result['industry_code'] = self.industry_code
        result['paid_amount'] = self.paid_amount
        result['paid_proof'] = self.paid_proof
        result['paid_time'] = self.paid_time
        result['payer_account_code'] = self.payer_account_code
        result['payer_account_type'] = self.payer_account_type
        result['payer_cert_number'] = self.payer_cert_number
        result['payer_cert_type'] = self.payer_cert_type
        result['payer_type'] = self.payer_type
        result['payment_amount'] = self.payment_amount
        result['payment_date_buffer'] = self.payment_date_buffer
        result['payment_deadline'] = self.payment_deadline
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.beneficiary_account_code = map.get('beneficiary_account_code')
        self.beneficiary_account_type = map.get('beneficiary_account_type')
        self.beneficiary_cert_number = map.get('beneficiary_cert_number')
        self.beneficiary_cert_type = map.get('beneficiary_cert_type')
        self.beneficiary_type = map.get('beneficiary_type')
        self.contract_code = map.get('contract_code')
        self.contract_fulfillment_code = map.get('contract_fulfillment_code')
        self.contract_name = map.get('contract_name')
        self.contract_txhash = map.get('contract_txhash')
        self.external_url = map.get('external_url')
        self.industry_code = map.get('industry_code')
        self.paid_amount = map.get('paid_amount')
        self.paid_proof = map.get('paid_proof')
        self.paid_time = map.get('paid_time')
        self.payer_account_code = map.get('payer_account_code')
        self.payer_account_type = map.get('payer_account_type')
        self.payer_cert_number = map.get('payer_cert_number')
        self.payer_cert_type = map.get('payer_cert_type')
        self.payer_type = map.get('payer_type')
        self.payment_amount = map.get('payment_amount')
        self.payment_date_buffer = map.get('payment_date_buffer')
        self.payment_deadline = map.get('payment_deadline')
        return self


class SaveTwcNotaryJointconstraintRecordResponse(TeaModel):
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


class DeleteTwcNotaryJointconstraintRecordRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, contract_code=None,
                 contract_fulfillment_code=None, payer_cert_number=None, payer_cert_type=None, payer_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.contract_code = contract_code
        self.contract_fulfillment_code = contract_fulfillment_code
        self.payer_cert_number = payer_cert_number
        self.payer_cert_type = payer_cert_type
        self.payer_type = payer_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['contract_code'] = self.contract_code
        result['contract_fulfillment_code'] = self.contract_fulfillment_code
        result['payer_cert_number'] = self.payer_cert_number
        result['payer_cert_type'] = self.payer_cert_type
        result['payer_type'] = self.payer_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.contract_code = map.get('contract_code')
        self.contract_fulfillment_code = map.get('contract_fulfillment_code')
        self.payer_cert_number = map.get('payer_cert_number')
        self.payer_cert_type = map.get('payer_cert_type')
        self.payer_type = map.get('payer_type')
        return self


class DeleteTwcNotaryJointconstraintRecordResponse(TeaModel):
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


class QueryTwcNotaryJointconstraintBreachrecordRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_number=None,
                 cert_type=None, entity_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.cert_number = cert_number
        self.cert_type = cert_type
        self.entity_type = entity_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_number'] = self.cert_number
        result['cert_type'] = self.cert_type
        result['entity_type'] = self.entity_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_number = map.get('cert_number')
        self.cert_type = map.get('cert_type')
        self.entity_type = map.get('entity_type')
        return self


class QueryTwcNotaryJointconstraintBreachrecordResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, breach_count=None, has_record=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.breach_count = breach_count
        self.has_record = has_record

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['breach_count'] = self.breach_count
        result['has_record'] = self.has_record
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.breach_count = map.get('breach_count')
        self.has_record = map.get('has_record')
        return self


class CreateTwcNotaryTransRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, customer=None, properties=None,
                 sub_biz_id=None, tsr=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.customer = customer
        self.properties = properties
        self.sub_biz_id = sub_biz_id
        self.tsr = tsr

    def validate(self):
        if self.customer:
            self.customer.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.customer is not None:
            result['customer'] = self.customer.to_map()
        else:
            result['customer'] = None
        result['properties'] = self.properties
        result['sub_biz_id'] = self.sub_biz_id
        result['tsr'] = self.tsr
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('customer') is not None:
            temp_model = Identity()
            self.customer = temp_model.from_map(map['customer'])
        else:
            self.customer = None
        self.properties = map.get('properties')
        self.sub_biz_id = map.get('sub_biz_id')
        self.tsr = map.get('tsr')
        return self


class CreateTwcNotaryTransResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, transaction_id=None, tsr=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.transaction_id = transaction_id
        self.tsr = tsr

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['transaction_id'] = self.transaction_id
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.transaction_id = map.get('transaction_id')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        return self


class GetTwcNotaryTransRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, transaction_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.transaction_id = transaction_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['transaction_id'] = self.transaction_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.transaction_id = map.get('transaction_id')
        return self


class GetTwcNotaryTransResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, file_url=None, transaction_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.file_url = file_url
        self.transaction_id = transaction_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['file_url'] = []
        if self.file_url is not None:
            for k in self.file_url:
                result['file_url'].append(k)
        else:
            result['file_url'] = None
        result['transaction_id'] = self.transaction_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.file_url = []
        if map.get('file_url') is not None:
            for k in map.get('file_url'):
                self.file_url.append(k)
        else:
            self.file_url = None
        self.transaction_id = map.get('transaction_id')
        return self


class CreateTwcNotaryTextRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, hash_algorithm=None,
                 location=None, notary_content=None, phase=None, properties=None, text_notary_type=None, transaction_id=None,
                 tsr=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.hash_algorithm = hash_algorithm
        self.location = location
        self.notary_content = notary_content
        self.phase = phase
        self.properties = properties
        self.text_notary_type = text_notary_type
        self.transaction_id = transaction_id
        self.tsr = tsr

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['hash_algorithm'] = self.hash_algorithm
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['notary_content'] = self.notary_content
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['text_notary_type'] = self.text_notary_type
        result['transaction_id'] = self.transaction_id
        result['tsr'] = self.tsr
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.hash_algorithm = map.get('hash_algorithm')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.notary_content = map.get('notary_content')
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.text_notary_type = map.get('text_notary_type')
        self.transaction_id = map.get('transaction_id')
        self.tsr = map.get('tsr')
        return self


class CreateTwcNotaryTextResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tsr=None, tx_hash=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.tsr = tsr
        self.tx_hash = tx_hash

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryTextRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, location=None, phase=None,
                 properties=None, transaction_id=None, tx_hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.location = location
        self.phase = phase
        self.properties = properties
        self.transaction_id = transaction_id
        self.tx_hash = tx_hash

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['transaction_id'] = self.transaction_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.transaction_id = map.get('transaction_id')
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryTextResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, content=None, hash_algorithm=None,
                 text_notary_type=None, tsr=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.content = content
        self.hash_algorithm = hash_algorithm
        self.text_notary_type = text_notary_type
        self.tsr = tsr

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['content'] = self.content
        result['hash_algorithm'] = self.hash_algorithm
        result['text_notary_type'] = self.text_notary_type
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.content = map.get('content')
        self.hash_algorithm = map.get('hash_algorithm')
        self.text_notary_type = map.get('text_notary_type')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        return self


class CreateTwcNotaryFileRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, file_notary_type=None,
                 hash_algorithm=None, location=None, notary_file=None, notary_name=None, phase=None, properties=None,
                 transaction_id=None, tsr=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.file_notary_type = file_notary_type
        self.hash_algorithm = hash_algorithm
        self.location = location
        self.notary_file = notary_file
        self.notary_name = notary_name
        self.phase = phase
        self.properties = properties
        self.transaction_id = transaction_id
        self.tsr = tsr

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['file_notary_type'] = self.file_notary_type
        result['hash_algorithm'] = self.hash_algorithm
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['notary_file'] = self.notary_file
        result['notary_name'] = self.notary_name
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['transaction_id'] = self.transaction_id
        result['tsr'] = self.tsr
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.file_notary_type = map.get('file_notary_type')
        self.hash_algorithm = map.get('hash_algorithm')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.notary_file = map.get('notary_file')
        self.notary_name = map.get('notary_name')
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.transaction_id = map.get('transaction_id')
        self.tsr = map.get('tsr')
        return self


class CreateTwcNotaryFileResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tsr=None, tx_hash=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.tsr = tsr
        self.tx_hash = tx_hash

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryFileRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, location=None, phase=None,
                 properties=None, transaction_id=None, tx_hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.location = location
        self.phase = phase
        self.properties = properties
        self.transaction_id = transaction_id
        self.tx_hash = tx_hash

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['transaction_id'] = self.transaction_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.transaction_id = map.get('transaction_id')
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryFileResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, file_hash=None, file_notary_type=None,
                 hash_algorithm=None, oss_path=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.file_hash = file_hash
        self.file_notary_type = file_notary_type
        self.hash_algorithm = hash_algorithm
        self.oss_path = oss_path

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['file_hash'] = self.file_hash
        result['file_notary_type'] = self.file_notary_type
        result['hash_algorithm'] = self.hash_algorithm
        result['oss_path'] = self.oss_path
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.file_hash = map.get('file_hash')
        self.file_notary_type = map.get('file_notary_type')
        self.hash_algorithm = map.get('hash_algorithm')
        self.oss_path = map.get('oss_path')
        return self


class CreateTwcNotarySourceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, location=None, phase=None,
                 properties=None, source_desc=None, source_file=None, source_name=None, transaction_id=None, tsr=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.location = location
        self.phase = phase
        self.properties = properties
        self.source_desc = source_desc
        self.source_file = source_file
        self.source_name = source_name
        self.transaction_id = transaction_id
        self.tsr = tsr

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['source_desc'] = self.source_desc
        result['source_file'] = self.source_file
        result['source_name'] = self.source_name
        result['transaction_id'] = self.transaction_id
        result['tsr'] = self.tsr
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.source_desc = map.get('source_desc')
        self.source_file = map.get('source_file')
        self.source_name = map.get('source_name')
        self.transaction_id = map.get('transaction_id')
        self.tsr = map.get('tsr')
        return self


class CreateTwcNotarySourceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tsr=None, tx_hash=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.tsr = tsr
        self.tx_hash = tx_hash

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotarySourceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, location=None, phase=None,
                 properties=None, transaction_id=None, tx_hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.location = location
        self.phase = phase
        self.properties = properties
        self.transaction_id = transaction_id
        self.tx_hash = tx_hash

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['transaction_id'] = self.transaction_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.transaction_id = map.get('transaction_id')
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotarySourceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, oss_path=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.oss_path = oss_path

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['oss_path'] = self.oss_path
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.oss_path = map.get('oss_path')
        return self


class CheckTwcNotaryStatusRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, notary_check_meta_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.notary_check_meta_list = notary_check_meta_list

    def validate(self):
        if self.notary_check_meta_list:
            for k in self.notary_check_meta_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['notary_check_meta_list'] = []
        if self.notary_check_meta_list is not None:
            for k in self.notary_check_meta_list:
                result['notary_check_meta_list'].append(k.to_map() if k else None)
        else:
            result['notary_check_meta_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.notary_check_meta_list = []
        if map.get('notary_check_meta_list') is not None:
            for k in map.get('notary_check_meta_list'):
                temp_model = NotaryCheckMeta()
                temp_model = temp_model.from_map(k)
                self.notary_check_meta_list.append(temp_model)
        else:
            self.notary_check_meta_list = None
        return self


class CheckTwcNotaryStatusResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, notary_check_results=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.notary_check_results = notary_check_results

    def validate(self):
        if self.notary_check_results:
            for k in self.notary_check_results:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['notary_check_results'] = []
        if self.notary_check_results is not None:
            for k in self.notary_check_results:
                result['notary_check_results'].append(k.to_map() if k else None)
        else:
            result['notary_check_results'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.notary_check_results = []
        if map.get('notary_check_results') is not None:
            for k in map.get('notary_check_results'):
                temp_model = NotaryCheckResult()
                temp_model = temp_model.from_map(k)
                self.notary_check_results.append(temp_model)
        else:
            self.notary_check_results = None
        return self


class DeployTwcNotaryLeaseContractRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, contract_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.contract_id = contract_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['contract_id'] = self.contract_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.contract_id = map.get('contract_id')
        return self


class DeployTwcNotaryLeaseContractResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseProductinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None,
                 deposit_price=None, extra_info=None, install_price=None, lease_id=None, main_class=None, product_id=None,
                 product_name=None, product_price=None, rentinfos=None, sub_class=None, supplier_id=None, supplier_name=None,
                 supplier_version=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.deposit_price = deposit_price
        self.extra_info = extra_info
        self.install_price = install_price
        self.lease_id = lease_id
        self.main_class = main_class
        self.product_id = product_id
        self.product_name = product_name
        self.product_price = product_price
        self.rentinfos = rentinfos
        self.sub_class = sub_class
        self.supplier_id = supplier_id
        self.supplier_name = supplier_name
        self.supplier_version = supplier_version

    def validate(self):
        if self.rentinfos:
            for k in self.rentinfos:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['deposit_price'] = self.deposit_price
        result['extra_info'] = self.extra_info
        result['install_price'] = self.install_price
        result['lease_id'] = self.lease_id
        result['main_class'] = self.main_class
        result['product_id'] = self.product_id
        result['product_name'] = self.product_name
        result['product_price'] = self.product_price
        result['rentinfos'] = []
        if self.rentinfos is not None:
            for k in self.rentinfos:
                result['rentinfos'].append(k.to_map() if k else None)
        else:
            result['rentinfos'] = None
        result['sub_class'] = self.sub_class
        result['supplier_id'] = self.supplier_id
        result['supplier_name'] = self.supplier_name
        result['supplier_version'] = self.supplier_version
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.deposit_price = map.get('deposit_price')
        self.extra_info = map.get('extra_info')
        self.install_price = map.get('install_price')
        self.lease_id = map.get('lease_id')
        self.main_class = map.get('main_class')
        self.product_id = map.get('product_id')
        self.product_name = map.get('product_name')
        self.product_price = map.get('product_price')
        self.rentinfos = []
        if map.get('rentinfos') is not None:
            for k in map.get('rentinfos'):
                temp_model = RentInfo()
                temp_model = temp_model.from_map(k)
                self.rentinfos.append(temp_model)
        else:
            self.rentinfos = None
        self.sub_class = map.get('sub_class')
        self.supplier_id = map.get('supplier_id')
        self.supplier_name = map.get('supplier_name')
        self.supplier_version = map.get('supplier_version')
        return self


class CreateTwcNotaryLeaseProductinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class AuthTwcNotaryLeaseContractRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, credit_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.credit_id = credit_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['credit_id'] = self.credit_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.credit_id = map.get('credit_id')
        return self


class AuthTwcNotaryLeaseContractResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseUserinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, alipay_uid=None,
                 application_id=None, async=None, extra_info=None, lease_corp_id=None, lease_corp_name=None,
                 lease_corp_owner_name=None, login_id=None, login_time=None, login_type=None, order_id=None, related_notify=None,
                 user_blockchain_verify_hash=None, user_email=None, user_id=None, user_image_hash=None, user_image_tx_hash=None, user_name=None,
                 user_phone_number=None, user_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.alipay_uid = alipay_uid
        self.application_id = application_id
        self.async = async
        self.extra_info = extra_info
        self.lease_corp_id = lease_corp_id
        self.lease_corp_name = lease_corp_name
        self.lease_corp_owner_name = lease_corp_owner_name
        self.login_id = login_id
        self.login_time = login_time
        self.login_type = login_type
        self.order_id = order_id
        self.related_notify = related_notify
        self.user_blockchain_verify_hash = user_blockchain_verify_hash
        self.user_email = user_email
        self.user_id = user_id
        self.user_image_hash = user_image_hash
        self.user_image_tx_hash = user_image_tx_hash
        self.user_name = user_name
        self.user_phone_number = user_phone_number
        self.user_type = user_type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['alipay_uid'] = self.alipay_uid
        result['application_id'] = self.application_id
        result['async'] = self.async
        result['extra_info'] = self.extra_info
        result['lease_corp_id'] = self.lease_corp_id
        result['lease_corp_name'] = self.lease_corp_name
        result['lease_corp_owner_name'] = self.lease_corp_owner_name
        result['login_id'] = self.login_id
        result['login_time'] = self.login_time
        result['login_type'] = self.login_type
        result['order_id'] = self.order_id
        result['related_notify'] = []
        if self.related_notify is not None:
            for k in self.related_notify:
                result['related_notify'].append(k)
        else:
            result['related_notify'] = None
        result['user_blockchain_verify_hash'] = self.user_blockchain_verify_hash
        result['user_email'] = self.user_email
        result['user_id'] = self.user_id
        result['user_image_hash'] = self.user_image_hash
        result['user_image_tx_hash'] = self.user_image_tx_hash
        result['user_name'] = self.user_name
        result['user_phone_number'] = self.user_phone_number
        result['user_type'] = self.user_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.alipay_uid = map.get('alipay_uid')
        self.application_id = map.get('application_id')
        self.async = map.get('async')
        self.extra_info = map.get('extra_info')
        self.lease_corp_id = map.get('lease_corp_id')
        self.lease_corp_name = map.get('lease_corp_name')
        self.lease_corp_owner_name = map.get('lease_corp_owner_name')
        self.login_id = map.get('login_id')
        self.login_time = map.get('login_time')
        self.login_type = map.get('login_type')
        self.order_id = map.get('order_id')
        self.related_notify = []
        if map.get('related_notify') is not None:
            for k in map.get('related_notify'):
                self.related_notify.append(k)
        else:
            self.related_notify = None
        self.user_blockchain_verify_hash = map.get('user_blockchain_verify_hash')
        self.user_email = map.get('user_email')
        self.user_id = map.get('user_id')
        self.user_image_hash = map.get('user_image_hash')
        self.user_image_tx_hash = map.get('user_image_tx_hash')
        self.user_name = map.get('user_name')
        self.user_phone_number = map.get('user_phone_number')
        self.user_type = map.get('user_type')
        return self


class CreateTwcNotaryLeaseUserinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseOrderinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, acutal_pre_auth_free=None,
                 application_id=None, async=None, bill_url=None, buy_out_price=None, city_code=None, deposit_free=None,
                 district_code=None, extra_info=None, install_hash=None, install_price=None, install_tx_hash=None,
                 insurance_number=None, insurance_url=None, in_store_time=None, lease_order_extra=None,
                 lease_service_additional_file_hash=None, lease_service_additional_file_tx_hash=None, lease_service_file_hash=None,
                 lease_service_file_tx_hash=None, order_create_time=None, order_id=None, order_pay_id=None, order_pay_time=None,
                 order_pay_type=None, out_store_deliver_number=None, out_store_time=None, pay_proof_url=None,
                 pre_auth_pay_order_id=None, product_info=None, province_code=None, purchase_contract_bill_hash=None,
                 purchase_contract_bill_tx_hash=None, purchase_contract_hash=None, purchase_contract_tx_hash=None, purchase_contract_url=None,
                 related_notify=None, rent_contract_url=None, rent_price_per_month=None, rent_term=None, sign_hash=None,
                 sign_time=None, sign_tx_hash=None, store_type=None, supplement_protocol_url=None, supplier_isv_account=None,
                 user_address=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.acutal_pre_auth_free = acutal_pre_auth_free
        self.application_id = application_id
        self.async = async
        self.bill_url = bill_url
        self.buy_out_price = buy_out_price
        self.city_code = city_code
        self.deposit_free = deposit_free
        self.district_code = district_code
        self.extra_info = extra_info
        self.install_hash = install_hash
        self.install_price = install_price
        self.install_tx_hash = install_tx_hash
        self.insurance_number = insurance_number
        self.insurance_url = insurance_url
        self.in_store_time = in_store_time
        self.lease_order_extra = lease_order_extra
        self.lease_service_additional_file_hash = lease_service_additional_file_hash
        self.lease_service_additional_file_tx_hash = lease_service_additional_file_tx_hash
        self.lease_service_file_hash = lease_service_file_hash
        self.lease_service_file_tx_hash = lease_service_file_tx_hash
        self.order_create_time = order_create_time
        self.order_id = order_id
        self.order_pay_id = order_pay_id
        self.order_pay_time = order_pay_time
        self.order_pay_type = order_pay_type
        self.out_store_deliver_number = out_store_deliver_number
        self.out_store_time = out_store_time
        self.pay_proof_url = pay_proof_url
        self.pre_auth_pay_order_id = pre_auth_pay_order_id
        self.product_info = product_info
        self.province_code = province_code
        self.purchase_contract_bill_hash = purchase_contract_bill_hash
        self.purchase_contract_bill_tx_hash = purchase_contract_bill_tx_hash
        self.purchase_contract_hash = purchase_contract_hash
        self.purchase_contract_tx_hash = purchase_contract_tx_hash
        self.purchase_contract_url = purchase_contract_url
        self.related_notify = related_notify
        self.rent_contract_url = rent_contract_url
        self.rent_price_per_month = rent_price_per_month
        self.rent_term = rent_term
        self.sign_hash = sign_hash
        self.sign_time = sign_time
        self.sign_tx_hash = sign_tx_hash
        self.store_type = store_type
        self.supplement_protocol_url = supplement_protocol_url
        self.supplier_isv_account = supplier_isv_account
        self.user_address = user_address

    def validate(self):
        if self.lease_order_extra:
            for k in self.lease_order_extra:
                if k:
                    k.validate()
        if self.product_info:
            for k in self.product_info:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['acutal_pre_auth_free'] = self.acutal_pre_auth_free
        result['application_id'] = self.application_id
        result['async'] = self.async
        result['bill_url'] = self.bill_url
        result['buy_out_price'] = self.buy_out_price
        result['city_code'] = self.city_code
        result['deposit_free'] = self.deposit_free
        result['district_code'] = self.district_code
        result['extra_info'] = self.extra_info
        result['install_hash'] = self.install_hash
        result['install_price'] = self.install_price
        result['install_tx_hash'] = self.install_tx_hash
        result['insurance_number'] = self.insurance_number
        result['insurance_url'] = self.insurance_url
        result['in_store_time'] = self.in_store_time
        result['lease_order_extra'] = []
        if self.lease_order_extra is not None:
            for k in self.lease_order_extra:
                result['lease_order_extra'].append(k.to_map() if k else None)
        else:
            result['lease_order_extra'] = None
        result['lease_service_additional_file_hash'] = self.lease_service_additional_file_hash
        result['lease_service_additional_file_tx_hash'] = self.lease_service_additional_file_tx_hash
        result['lease_service_file_hash'] = self.lease_service_file_hash
        result['lease_service_file_tx_hash'] = self.lease_service_file_tx_hash
        result['order_create_time'] = self.order_create_time
        result['order_id'] = self.order_id
        result['order_pay_id'] = self.order_pay_id
        result['order_pay_time'] = self.order_pay_time
        result['order_pay_type'] = self.order_pay_type
        result['out_store_deliver_number'] = self.out_store_deliver_number
        result['out_store_time'] = self.out_store_time
        result['pay_proof_url'] = self.pay_proof_url
        result['pre_auth_pay_order_id'] = self.pre_auth_pay_order_id
        result['product_info'] = []
        if self.product_info is not None:
            for k in self.product_info:
                result['product_info'].append(k.to_map() if k else None)
        else:
            result['product_info'] = None
        result['province_code'] = self.province_code
        result['purchase_contract_bill_hash'] = self.purchase_contract_bill_hash
        result['purchase_contract_bill_tx_hash'] = self.purchase_contract_bill_tx_hash
        result['purchase_contract_hash'] = self.purchase_contract_hash
        result['purchase_contract_tx_hash'] = self.purchase_contract_tx_hash
        result['purchase_contract_url'] = self.purchase_contract_url
        result['related_notify'] = []
        if self.related_notify is not None:
            for k in self.related_notify:
                result['related_notify'].append(k)
        else:
            result['related_notify'] = None
        result['rent_contract_url'] = self.rent_contract_url
        result['rent_price_per_month'] = self.rent_price_per_month
        result['rent_term'] = self.rent_term
        result['sign_hash'] = self.sign_hash
        result['sign_time'] = self.sign_time
        result['sign_tx_hash'] = self.sign_tx_hash
        result['store_type'] = self.store_type
        result['supplement_protocol_url'] = self.supplement_protocol_url
        result['supplier_isv_account'] = self.supplier_isv_account
        result['user_address'] = self.user_address
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.acutal_pre_auth_free = map.get('acutal_pre_auth_free')
        self.application_id = map.get('application_id')
        self.async = map.get('async')
        self.bill_url = map.get('bill_url')
        self.buy_out_price = map.get('buy_out_price')
        self.city_code = map.get('city_code')
        self.deposit_free = map.get('deposit_free')
        self.district_code = map.get('district_code')
        self.extra_info = map.get('extra_info')
        self.install_hash = map.get('install_hash')
        self.install_price = map.get('install_price')
        self.install_tx_hash = map.get('install_tx_hash')
        self.insurance_number = map.get('insurance_number')
        self.insurance_url = map.get('insurance_url')
        self.in_store_time = map.get('in_store_time')
        self.lease_order_extra = []
        if map.get('lease_order_extra') is not None:
            for k in map.get('lease_order_extra'):
                temp_model = LeaseOrderExtra()
                temp_model = temp_model.from_map(k)
                self.lease_order_extra.append(temp_model)
        else:
            self.lease_order_extra = None
        self.lease_service_additional_file_hash = map.get('lease_service_additional_file_hash')
        self.lease_service_additional_file_tx_hash = map.get('lease_service_additional_file_tx_hash')
        self.lease_service_file_hash = map.get('lease_service_file_hash')
        self.lease_service_file_tx_hash = map.get('lease_service_file_tx_hash')
        self.order_create_time = map.get('order_create_time')
        self.order_id = map.get('order_id')
        self.order_pay_id = map.get('order_pay_id')
        self.order_pay_time = map.get('order_pay_time')
        self.order_pay_type = map.get('order_pay_type')
        self.out_store_deliver_number = map.get('out_store_deliver_number')
        self.out_store_time = map.get('out_store_time')
        self.pay_proof_url = map.get('pay_proof_url')
        self.pre_auth_pay_order_id = map.get('pre_auth_pay_order_id')
        self.product_info = []
        if map.get('product_info') is not None:
            for k in map.get('product_info'):
                temp_model = ProductInfo()
                temp_model = temp_model.from_map(k)
                self.product_info.append(temp_model)
        else:
            self.product_info = None
        self.province_code = map.get('province_code')
        self.purchase_contract_bill_hash = map.get('purchase_contract_bill_hash')
        self.purchase_contract_bill_tx_hash = map.get('purchase_contract_bill_tx_hash')
        self.purchase_contract_hash = map.get('purchase_contract_hash')
        self.purchase_contract_tx_hash = map.get('purchase_contract_tx_hash')
        self.purchase_contract_url = map.get('purchase_contract_url')
        self.related_notify = []
        if map.get('related_notify') is not None:
            for k in map.get('related_notify'):
                self.related_notify.append(k)
        else:
            self.related_notify = None
        self.rent_contract_url = map.get('rent_contract_url')
        self.rent_price_per_month = map.get('rent_price_per_month')
        self.rent_term = map.get('rent_term')
        self.sign_hash = map.get('sign_hash')
        self.sign_time = map.get('sign_time')
        self.sign_tx_hash = map.get('sign_tx_hash')
        self.store_type = map.get('store_type')
        self.supplement_protocol_url = map.get('supplement_protocol_url')
        self.supplier_isv_account = map.get('supplier_isv_account')
        self.user_address = map.get('user_address')
        return self


class CreateTwcNotaryLeaseOrderinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeasePromiseRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None, async=None,
                 audit_mode=None, clearing_org=None, credit_org=None, first_pay_date=None, lease_alipay_uid=None, limit=None,
                 order_id=None, pay_date_list=None, pay_extra_info_list=None, pay_money=None, pay_money_list=None,
                 pay_period=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.async = async
        self.audit_mode = audit_mode
        self.clearing_org = clearing_org
        self.credit_org = credit_org
        self.first_pay_date = first_pay_date
        self.lease_alipay_uid = lease_alipay_uid
        self.limit = limit
        self.order_id = order_id
        self.pay_date_list = pay_date_list
        self.pay_extra_info_list = pay_extra_info_list
        self.pay_money = pay_money
        self.pay_money_list = pay_money_list
        self.pay_period = pay_period

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['async'] = self.async
        result['audit_mode'] = self.audit_mode
        result['clearing_org'] = self.clearing_org
        result['credit_org'] = self.credit_org
        result['first_pay_date'] = self.first_pay_date
        result['lease_alipay_uid'] = self.lease_alipay_uid
        result['limit'] = self.limit
        result['order_id'] = self.order_id
        result['pay_date_list'] = []
        if self.pay_date_list is not None:
            for k in self.pay_date_list:
                result['pay_date_list'].append(k)
        else:
            result['pay_date_list'] = None
        result['pay_extra_info_list'] = []
        if self.pay_extra_info_list is not None:
            for k in self.pay_extra_info_list:
                result['pay_extra_info_list'].append(k)
        else:
            result['pay_extra_info_list'] = None
        result['pay_money'] = self.pay_money
        result['pay_money_list'] = []
        if self.pay_money_list is not None:
            for k in self.pay_money_list:
                result['pay_money_list'].append(k)
        else:
            result['pay_money_list'] = None
        result['pay_period'] = self.pay_period
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.async = map.get('async')
        self.audit_mode = map.get('audit_mode')
        self.clearing_org = map.get('clearing_org')
        self.credit_org = map.get('credit_org')
        self.first_pay_date = map.get('first_pay_date')
        self.lease_alipay_uid = map.get('lease_alipay_uid')
        self.limit = map.get('limit')
        self.order_id = map.get('order_id')
        self.pay_date_list = []
        if map.get('pay_date_list') is not None:
            for k in map.get('pay_date_list'):
                self.pay_date_list.append(k)
        else:
            self.pay_date_list = None
        self.pay_extra_info_list = []
        if map.get('pay_extra_info_list') is not None:
            for k in map.get('pay_extra_info_list'):
                self.pay_extra_info_list.append(k)
        else:
            self.pay_extra_info_list = None
        self.pay_money = map.get('pay_money')
        self.pay_money_list = []
        if map.get('pay_money_list') is not None:
            for k in map.get('pay_money_list'):
                self.pay_money_list.append(k)
        else:
            self.pay_money_list = None
        self.pay_period = map.get('pay_period')
        return self


class CreateTwcNotaryLeasePromiseResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseVerifyinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None, async=None,
                 card_number=None, credit_end_time=None, credit_limit=None, credit_start_time=None, extra_info=None,
                 lease_corp_id=None, lease_corp_name=None, lease_corp_owner_name=None, lease_id=None, loan=None, order_id=None,
                 pay_back_hash=None, pay_back_tx_hash=None, user_id=None, user_name=None, user_phone_number=None,
                 verify_result=None, voucher=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.async = async
        self.card_number = card_number
        self.credit_end_time = credit_end_time
        self.credit_limit = credit_limit
        self.credit_start_time = credit_start_time
        self.extra_info = extra_info
        self.lease_corp_id = lease_corp_id
        self.lease_corp_name = lease_corp_name
        self.lease_corp_owner_name = lease_corp_owner_name
        self.lease_id = lease_id
        self.loan = loan
        self.order_id = order_id
        self.pay_back_hash = pay_back_hash
        self.pay_back_tx_hash = pay_back_tx_hash
        self.user_id = user_id
        self.user_name = user_name
        self.user_phone_number = user_phone_number
        self.verify_result = verify_result
        self.voucher = voucher

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['async'] = self.async
        result['card_number'] = self.card_number
        result['credit_end_time'] = self.credit_end_time
        result['credit_limit'] = self.credit_limit
        result['credit_start_time'] = self.credit_start_time
        result['extra_info'] = self.extra_info
        result['lease_corp_id'] = self.lease_corp_id
        result['lease_corp_name'] = self.lease_corp_name
        result['lease_corp_owner_name'] = self.lease_corp_owner_name
        result['lease_id'] = self.lease_id
        result['loan'] = self.loan
        result['order_id'] = self.order_id
        result['pay_back_hash'] = self.pay_back_hash
        result['pay_back_tx_hash'] = self.pay_back_tx_hash
        result['user_id'] = self.user_id
        result['user_name'] = self.user_name
        result['user_phone_number'] = self.user_phone_number
        result['verify_result'] = self.verify_result
        result['voucher'] = self.voucher
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.async = map.get('async')
        self.card_number = map.get('card_number')
        self.credit_end_time = map.get('credit_end_time')
        self.credit_limit = map.get('credit_limit')
        self.credit_start_time = map.get('credit_start_time')
        self.extra_info = map.get('extra_info')
        self.lease_corp_id = map.get('lease_corp_id')
        self.lease_corp_name = map.get('lease_corp_name')
        self.lease_corp_owner_name = map.get('lease_corp_owner_name')
        self.lease_id = map.get('lease_id')
        self.loan = map.get('loan')
        self.order_id = map.get('order_id')
        self.pay_back_hash = map.get('pay_back_hash')
        self.pay_back_tx_hash = map.get('pay_back_tx_hash')
        self.user_id = map.get('user_id')
        self.user_name = map.get('user_name')
        self.user_phone_number = map.get('user_phone_number')
        self.verify_result = map.get('verify_result')
        self.voucher = map.get('voucher')
        return self


class CreateTwcNotaryLeaseVerifyinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseCreditpromiseRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None, async=None,
                 credit_promise_extra_info_list=None, lease_id=None, order_id=None, pay_in_advance_money=None, pay_in_advance_money_list=None,
                 pay_in_advance_time=None, pay_in_advance_time_list=None, promise_hash=None, promise_tx_hash=None, return_money=None,
                 return_money_list=None, return_rate=None, return_time=None, return_time_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.async = async
        self.credit_promise_extra_info_list = credit_promise_extra_info_list
        self.lease_id = lease_id
        self.order_id = order_id
        self.pay_in_advance_money = pay_in_advance_money
        self.pay_in_advance_money_list = pay_in_advance_money_list
        self.pay_in_advance_time = pay_in_advance_time
        self.pay_in_advance_time_list = pay_in_advance_time_list
        self.promise_hash = promise_hash
        self.promise_tx_hash = promise_tx_hash
        self.return_money = return_money
        self.return_money_list = return_money_list
        self.return_rate = return_rate
        self.return_time = return_time
        self.return_time_list = return_time_list

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['async'] = self.async
        result['credit_promise_extra_info_list'] = []
        if self.credit_promise_extra_info_list is not None:
            for k in self.credit_promise_extra_info_list:
                result['credit_promise_extra_info_list'].append(k)
        else:
            result['credit_promise_extra_info_list'] = None
        result['lease_id'] = self.lease_id
        result['order_id'] = self.order_id
        result['pay_in_advance_money'] = self.pay_in_advance_money
        result['pay_in_advance_money_list'] = []
        if self.pay_in_advance_money_list is not None:
            for k in self.pay_in_advance_money_list:
                result['pay_in_advance_money_list'].append(k)
        else:
            result['pay_in_advance_money_list'] = None
        result['pay_in_advance_time'] = self.pay_in_advance_time
        result['pay_in_advance_time_list'] = []
        if self.pay_in_advance_time_list is not None:
            for k in self.pay_in_advance_time_list:
                result['pay_in_advance_time_list'].append(k)
        else:
            result['pay_in_advance_time_list'] = None
        result['promise_hash'] = self.promise_hash
        result['promise_tx_hash'] = self.promise_tx_hash
        result['return_money'] = self.return_money
        result['return_money_list'] = []
        if self.return_money_list is not None:
            for k in self.return_money_list:
                result['return_money_list'].append(k)
        else:
            result['return_money_list'] = None
        result['return_rate'] = self.return_rate
        result['return_time'] = self.return_time
        result['return_time_list'] = []
        if self.return_time_list is not None:
            for k in self.return_time_list:
                result['return_time_list'].append(k)
        else:
            result['return_time_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.async = map.get('async')
        self.credit_promise_extra_info_list = []
        if map.get('credit_promise_extra_info_list') is not None:
            for k in map.get('credit_promise_extra_info_list'):
                self.credit_promise_extra_info_list.append(k)
        else:
            self.credit_promise_extra_info_list = None
        self.lease_id = map.get('lease_id')
        self.order_id = map.get('order_id')
        self.pay_in_advance_money = map.get('pay_in_advance_money')
        self.pay_in_advance_money_list = []
        if map.get('pay_in_advance_money_list') is not None:
            for k in map.get('pay_in_advance_money_list'):
                self.pay_in_advance_money_list.append(k)
        else:
            self.pay_in_advance_money_list = None
        self.pay_in_advance_time = map.get('pay_in_advance_time')
        self.pay_in_advance_time_list = []
        if map.get('pay_in_advance_time_list') is not None:
            for k in map.get('pay_in_advance_time_list'):
                self.pay_in_advance_time_list.append(k)
        else:
            self.pay_in_advance_time_list = None
        self.promise_hash = map.get('promise_hash')
        self.promise_tx_hash = map.get('promise_tx_hash')
        self.return_money = map.get('return_money')
        self.return_money_list = []
        if map.get('return_money_list') is not None:
            for k in map.get('return_money_list'):
                self.return_money_list.append(k)
        else:
            self.return_money_list = None
        self.return_rate = map.get('return_rate')
        self.return_time = map.get('return_time')
        self.return_time_list = []
        if map.get('return_time_list') is not None:
            for k in map.get('return_time_list'):
                self.return_time_list.append(k)
        else:
            self.return_time_list = None
        return self


class CreateTwcNotaryLeaseCreditpromiseResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseDisburseinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, active_account=None,
                 active_result_desc=None, active_result_status=None, active_return_date=None, active_return_money=None,
                 disburse_limit=None, disburse_money=None, disburse_service=None, exceed_duration=None,
                 exceed_pay_back_status=None, exceed_rate=None, exceed_return_money=None, loan_rate=None, order_id=None,
                 pay_back_date=None, pay_back_money=None, return_interest=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.active_account = active_account
        self.active_result_desc = active_result_desc
        self.active_result_status = active_result_status
        self.active_return_date = active_return_date
        self.active_return_money = active_return_money
        self.disburse_limit = disburse_limit
        self.disburse_money = disburse_money
        self.disburse_service = disburse_service
        self.exceed_duration = exceed_duration
        self.exceed_pay_back_status = exceed_pay_back_status
        self.exceed_rate = exceed_rate
        self.exceed_return_money = exceed_return_money
        self.loan_rate = loan_rate
        self.order_id = order_id
        self.pay_back_date = pay_back_date
        self.pay_back_money = pay_back_money
        self.return_interest = return_interest

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['active_account'] = self.active_account
        result['active_result_desc'] = self.active_result_desc
        result['active_result_status'] = self.active_result_status
        result['active_return_date'] = self.active_return_date
        result['active_return_money'] = self.active_return_money
        result['disburse_limit'] = self.disburse_limit
        result['disburse_money'] = self.disburse_money
        result['disburse_service'] = self.disburse_service
        result['exceed_duration'] = self.exceed_duration
        result['exceed_pay_back_status'] = self.exceed_pay_back_status
        result['exceed_rate'] = self.exceed_rate
        result['exceed_return_money'] = self.exceed_return_money
        result['loan_rate'] = self.loan_rate
        result['order_id'] = self.order_id
        result['pay_back_date'] = self.pay_back_date
        result['pay_back_money'] = self.pay_back_money
        result['return_interest'] = self.return_interest
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.active_account = map.get('active_account')
        self.active_result_desc = map.get('active_result_desc')
        self.active_result_status = map.get('active_result_status')
        self.active_return_date = map.get('active_return_date')
        self.active_return_money = map.get('active_return_money')
        self.disburse_limit = map.get('disburse_limit')
        self.disburse_money = map.get('disburse_money')
        self.disburse_service = map.get('disburse_service')
        self.exceed_duration = map.get('exceed_duration')
        self.exceed_pay_back_status = map.get('exceed_pay_back_status')
        self.exceed_rate = map.get('exceed_rate')
        self.exceed_return_money = map.get('exceed_return_money')
        self.loan_rate = map.get('loan_rate')
        self.order_id = map.get('order_id')
        self.pay_back_date = map.get('pay_back_date')
        self.pay_back_money = map.get('pay_back_money')
        self.return_interest = map.get('return_interest')
        return self


class CreateTwcNotaryLeaseDisburseinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class QueryTwcNotaryLeaseOrderinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None,
                 lease_id=None, order_id=None, phase_info=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.lease_id = lease_id
        self.order_id = order_id
        self.phase_info = phase_info

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['lease_id'] = self.lease_id
        result['order_id'] = self.order_id
        result['phase_info'] = self.phase_info
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.lease_id = map.get('lease_id')
        self.order_id = map.get('order_id')
        self.phase_info = map.get('phase_info')
        return self


class QueryTwcNotaryLeaseOrderinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryFinanceTextnotaryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_no=None,
                 hash_algorithm=None, location=None, mobile=None, phase=None, properties=None, text_hash=None,
                 third_message_id=None, transaction_id=None, tsr=None, user_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.cert_no = cert_no
        self.hash_algorithm = hash_algorithm
        self.location = location
        self.mobile = mobile
        self.phase = phase
        self.properties = properties
        self.text_hash = text_hash
        self.third_message_id = third_message_id
        self.transaction_id = transaction_id
        self.tsr = tsr
        self.user_name = user_name

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_no'] = self.cert_no
        result['hash_algorithm'] = self.hash_algorithm
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['mobile'] = self.mobile
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['text_hash'] = self.text_hash
        result['third_message_id'] = self.third_message_id
        result['transaction_id'] = self.transaction_id
        result['tsr'] = self.tsr
        result['user_name'] = self.user_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_no = map.get('cert_no')
        self.hash_algorithm = map.get('hash_algorithm')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.mobile = map.get('mobile')
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.text_hash = map.get('text_hash')
        self.third_message_id = map.get('third_message_id')
        self.transaction_id = map.get('transaction_id')
        self.tsr = map.get('tsr')
        self.user_name = map.get('user_name')
        return self


class CreateTwcNotaryFinanceTextnotaryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, credit_risk_score=None, tsr=None,
                 tx_hash=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.credit_risk_score = credit_risk_score
        self.tsr = tsr
        self.tx_hash = tx_hash

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['credit_risk_score'] = self.credit_risk_score
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.credit_risk_score = map.get('credit_risk_score')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryFinanceTextnotaryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, location=None, phase=None,
                 properties=None, transaction_id=None, tx_hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.location = location
        self.phase = phase
        self.properties = properties
        self.transaction_id = transaction_id
        self.tx_hash = tx_hash

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['transaction_id'] = self.transaction_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.transaction_id = map.get('transaction_id')
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryFinanceTextnotaryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, hash_algorithm=None, phase=None,
                 properties=None, text_hash=None, tsr=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.hash_algorithm = hash_algorithm
        self.phase = phase
        self.properties = properties
        self.text_hash = text_hash
        self.tsr = tsr

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['hash_algorithm'] = self.hash_algorithm
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['text_hash'] = self.text_hash
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.hash_algorithm = map.get('hash_algorithm')
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.text_hash = map.get('text_hash')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        return self


class CreateTwcNotaryFinanceFilenotaryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_no=None, created_date=None,
                 file_name=None, file_notary_type=None, file_size=None, file_type=None, file_url=None, hash_algorithm=None,
                 location=None, mobile=None, notary_content=None, phase=None, properties=None, third_message_id=None,
                 transaction_id=None, tsr=None, user_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.cert_no = cert_no
        self.created_date = created_date
        self.file_name = file_name
        self.file_notary_type = file_notary_type
        self.file_size = file_size
        self.file_type = file_type
        self.file_url = file_url
        self.hash_algorithm = hash_algorithm
        self.location = location
        self.mobile = mobile
        self.notary_content = notary_content
        self.phase = phase
        self.properties = properties
        self.third_message_id = third_message_id
        self.transaction_id = transaction_id
        self.tsr = tsr
        self.user_name = user_name

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_no'] = self.cert_no
        result['created_date'] = self.created_date
        result['file_name'] = self.file_name
        result['file_notary_type'] = self.file_notary_type
        result['file_size'] = self.file_size
        result['file_type'] = self.file_type
        result['file_url'] = self.file_url
        result['hash_algorithm'] = self.hash_algorithm
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['mobile'] = self.mobile
        result['notary_content'] = self.notary_content
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['third_message_id'] = self.third_message_id
        result['transaction_id'] = self.transaction_id
        result['tsr'] = self.tsr
        result['user_name'] = self.user_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_no = map.get('cert_no')
        self.created_date = map.get('created_date')
        self.file_name = map.get('file_name')
        self.file_notary_type = map.get('file_notary_type')
        self.file_size = map.get('file_size')
        self.file_type = map.get('file_type')
        self.file_url = map.get('file_url')
        self.hash_algorithm = map.get('hash_algorithm')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.mobile = map.get('mobile')
        self.notary_content = map.get('notary_content')
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.third_message_id = map.get('third_message_id')
        self.transaction_id = map.get('transaction_id')
        self.tsr = map.get('tsr')
        self.user_name = map.get('user_name')
        return self


class CreateTwcNotaryFinanceFilenotaryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, credit_risk_score=None, tsr=None,
                 tx_hash=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.credit_risk_score = credit_risk_score
        self.tsr = tsr
        self.tx_hash = tx_hash

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['credit_risk_score'] = self.credit_risk_score
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.credit_risk_score = map.get('credit_risk_score')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryFinanceFilenotaryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, location=None, phase=None,
                 properties=None, transaction_id=None, tx_hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.location = location
        self.phase = phase
        self.properties = properties
        self.transaction_id = transaction_id
        self.tx_hash = tx_hash

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['transaction_id'] = self.transaction_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.transaction_id = map.get('transaction_id')
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryFinanceFilenotaryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, file_name=None, file_notary_type=None,
                 hash_algorithm=None, notary_content=None, phase=None, properties=None, tsr=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.file_name = file_name
        self.file_notary_type = file_notary_type
        self.hash_algorithm = hash_algorithm
        self.notary_content = notary_content
        self.phase = phase
        self.properties = properties
        self.tsr = tsr

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['file_name'] = self.file_name
        result['file_notary_type'] = self.file_notary_type
        result['hash_algorithm'] = self.hash_algorithm
        result['notary_content'] = self.notary_content
        result['phase'] = self.phase
        result['properties'] = self.properties
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.file_name = map.get('file_name')
        self.file_notary_type = map.get('file_notary_type')
        self.hash_algorithm = map.get('hash_algorithm')
        self.notary_content = map.get('notary_content')
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        return self


class CheckTwcNotaryIndustryNotaryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, industry_type=None,
                 notary_check_meta_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.industry_type = industry_type
        self.notary_check_meta_list = notary_check_meta_list

    def validate(self):
        if self.notary_check_meta_list:
            for k in self.notary_check_meta_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['industry_type'] = self.industry_type
        result['notary_check_meta_list'] = []
        if self.notary_check_meta_list is not None:
            for k in self.notary_check_meta_list:
                result['notary_check_meta_list'].append(k.to_map() if k else None)
        else:
            result['notary_check_meta_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.industry_type = map.get('industry_type')
        self.notary_check_meta_list = []
        if map.get('notary_check_meta_list') is not None:
            for k in map.get('notary_check_meta_list'):
                temp_model = NotaryCheckMeta()
                temp_model = temp_model.from_map(k)
                self.notary_check_meta_list.append(temp_model)
        else:
            self.notary_check_meta_list = None
        return self


class CheckTwcNotaryIndustryNotaryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, notary_check_results=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.notary_check_results = notary_check_results

    def validate(self):
        if self.notary_check_results:
            for k in self.notary_check_results:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['notary_check_results'] = []
        if self.notary_check_results is not None:
            for k in self.notary_check_results:
                result['notary_check_results'].append(k.to_map() if k else None)
        else:
            result['notary_check_results'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.notary_check_results = []
        if map.get('notary_check_results') is not None:
            for k in map.get('notary_check_results'):
                temp_model = NotaryCheckResult()
                temp_model = temp_model.from_map(k)
                self.notary_check_results.append(temp_model)
        else:
            self.notary_check_results = None
        return self


class UpdateTwcNotaryLeaseContractRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None,
                 contract_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.contract_id = contract_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['contract_id'] = self.contract_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.contract_id = map.get('contract_id')
        return self


class UpdateTwcNotaryLeaseContractResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotarySueBreakpromiseinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, break_promise_money=None,
                 business_class=None, court_id=None, court_name=None, email=None, initiator_id=None, initiator_name=None,
                 order_id=None, phone_number=None, pre_sue_id=None, promise_date=None, promise_limit=None, sue_date=None,
                 user_id=None, user_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.break_promise_money = break_promise_money
        self.business_class = business_class
        self.court_id = court_id
        self.court_name = court_name
        self.email = email
        self.initiator_id = initiator_id
        self.initiator_name = initiator_name
        self.order_id = order_id
        self.phone_number = phone_number
        self.pre_sue_id = pre_sue_id
        self.promise_date = promise_date
        self.promise_limit = promise_limit
        self.sue_date = sue_date
        self.user_id = user_id
        self.user_name = user_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['break_promise_money'] = self.break_promise_money
        result['business_class'] = self.business_class
        result['court_id'] = self.court_id
        result['court_name'] = self.court_name
        result['email'] = self.email
        result['initiator_id'] = self.initiator_id
        result['initiator_name'] = self.initiator_name
        result['order_id'] = self.order_id
        result['phone_number'] = self.phone_number
        result['pre_sue_id'] = self.pre_sue_id
        result['promise_date'] = self.promise_date
        result['promise_limit'] = self.promise_limit
        result['sue_date'] = self.sue_date
        result['user_id'] = self.user_id
        result['user_name'] = self.user_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.break_promise_money = map.get('break_promise_money')
        self.business_class = map.get('business_class')
        self.court_id = map.get('court_id')
        self.court_name = map.get('court_name')
        self.email = map.get('email')
        self.initiator_id = map.get('initiator_id')
        self.initiator_name = map.get('initiator_name')
        self.order_id = map.get('order_id')
        self.phone_number = map.get('phone_number')
        self.pre_sue_id = map.get('pre_sue_id')
        self.promise_date = map.get('promise_date')
        self.promise_limit = map.get('promise_limit')
        self.sue_date = map.get('sue_date')
        self.user_id = map.get('user_id')
        self.user_name = map.get('user_name')
        return self


class CreateTwcNotarySueBreakpromiseinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class UpdateTwcNotarySueBreakpromiseinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, break_promise_money=None,
                 business_class=None, email=None, order_id=None, phone_number=None, pre_sue_id=None, promise_date=None,
                 promise_limit=None, sue_date=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.break_promise_money = break_promise_money
        self.business_class = business_class
        self.email = email
        self.order_id = order_id
        self.phone_number = phone_number
        self.pre_sue_id = pre_sue_id
        self.promise_date = promise_date
        self.promise_limit = promise_limit
        self.sue_date = sue_date

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['break_promise_money'] = self.break_promise_money
        result['business_class'] = self.business_class
        result['email'] = self.email
        result['order_id'] = self.order_id
        result['phone_number'] = self.phone_number
        result['pre_sue_id'] = self.pre_sue_id
        result['promise_date'] = self.promise_date
        result['promise_limit'] = self.promise_limit
        result['sue_date'] = self.sue_date
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.break_promise_money = map.get('break_promise_money')
        self.business_class = map.get('business_class')
        self.email = map.get('email')
        self.order_id = map.get('order_id')
        self.phone_number = map.get('phone_number')
        self.pre_sue_id = map.get('pre_sue_id')
        self.promise_date = map.get('promise_date')
        self.promise_limit = map.get('promise_limit')
        self.sue_date = map.get('sue_date')
        return self


class UpdateTwcNotarySueBreakpromiseinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class DeleteTwcNotarySueBreakpromiseinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, order_id=None, pre_sue_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.order_id = order_id
        self.pre_sue_id = pre_sue_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['order_id'] = self.order_id
        result['pre_sue_id'] = self.pre_sue_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.order_id = map.get('order_id')
        self.pre_sue_id = map.get('pre_sue_id')
        return self


class DeleteTwcNotarySueBreakpromiseinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class QueryTwcNotarySueUserinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, user_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['user_id'] = self.user_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.user_id = map.get('user_id')
        return self


class QueryTwcNotarySueUserinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class UpdateTwcNotarySueExeplarycontractRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, contract_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.contract_id = contract_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['contract_id'] = self.contract_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.contract_id = map.get('contract_id')
        return self


class UpdateTwcNotarySueExeplarycontractResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class UpdateTwcNotarySueExemplaryrevertRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, contract_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.contract_id = contract_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['contract_id'] = self.contract_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.contract_id = map.get('contract_id')
        return self


class UpdateTwcNotarySueExemplaryrevertResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseAuditRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None, async=None,
                 batch_index=None, current_audit_index=None, extra_info=None, lease_id=None, manual_audit=None,
                 manual_audit_comments=None, order_id=None, related_notify=None, total_audit_number=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.async = async
        self.batch_index = batch_index
        self.current_audit_index = current_audit_index
        self.extra_info = extra_info
        self.lease_id = lease_id
        self.manual_audit = manual_audit
        self.manual_audit_comments = manual_audit_comments
        self.order_id = order_id
        self.related_notify = related_notify
        self.total_audit_number = total_audit_number

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['async'] = self.async
        result['batch_index'] = self.batch_index
        result['current_audit_index'] = self.current_audit_index
        result['extra_info'] = self.extra_info
        result['lease_id'] = self.lease_id
        result['manual_audit'] = self.manual_audit
        result['manual_audit_comments'] = self.manual_audit_comments
        result['order_id'] = self.order_id
        result['related_notify'] = []
        if self.related_notify is not None:
            for k in self.related_notify:
                result['related_notify'].append(k)
        else:
            result['related_notify'] = None
        result['total_audit_number'] = self.total_audit_number
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.async = map.get('async')
        self.batch_index = map.get('batch_index')
        self.current_audit_index = map.get('current_audit_index')
        self.extra_info = map.get('extra_info')
        self.lease_id = map.get('lease_id')
        self.manual_audit = map.get('manual_audit')
        self.manual_audit_comments = map.get('manual_audit_comments')
        self.order_id = map.get('order_id')
        self.related_notify = []
        if map.get('related_notify') is not None:
            for k in map.get('related_notify'):
                self.related_notify.append(k)
        else:
            self.related_notify = None
        self.total_audit_number = map.get('total_audit_number')
        return self


class CreateTwcNotaryLeaseAuditResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeasePaymentfileRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None, async=None,
                 extra_info=None, lease_id=None, order_id=None, payment_file_hash=None, payment_file_tx_hash=None,
                 payment_url=None, related_notify=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.async = async
        self.extra_info = extra_info
        self.lease_id = lease_id
        self.order_id = order_id
        self.payment_file_hash = payment_file_hash
        self.payment_file_tx_hash = payment_file_tx_hash
        self.payment_url = payment_url
        self.related_notify = related_notify

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['async'] = self.async
        result['extra_info'] = self.extra_info
        result['lease_id'] = self.lease_id
        result['order_id'] = self.order_id
        result['payment_file_hash'] = self.payment_file_hash
        result['payment_file_tx_hash'] = self.payment_file_tx_hash
        result['payment_url'] = self.payment_url
        result['related_notify'] = []
        if self.related_notify is not None:
            for k in self.related_notify:
                result['related_notify'].append(k)
        else:
            result['related_notify'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.async = map.get('async')
        self.extra_info = map.get('extra_info')
        self.lease_id = map.get('lease_id')
        self.order_id = map.get('order_id')
        self.payment_file_hash = map.get('payment_file_hash')
        self.payment_file_tx_hash = map.get('payment_file_tx_hash')
        self.payment_url = map.get('payment_url')
        self.related_notify = []
        if map.get('related_notify') is not None:
            for k in map.get('related_notify'):
                self.related_notify.append(k)
        else:
            self.related_notify = None
        return self


class CreateTwcNotaryLeasePaymentfileResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseRentalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None, async=None,
                 charge=None, extra_info=None, is_finish=None, lease_term_index=None, order_id=None, remain_rental=None,
                 remain_term=None, rental_money=None, rental_return_state=None, return_time=None, return_voucher_serial=None,
                 return_voucher_type=None, return_way=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.async = async
        self.charge = charge
        self.extra_info = extra_info
        self.is_finish = is_finish
        self.lease_term_index = lease_term_index
        self.order_id = order_id
        self.remain_rental = remain_rental
        self.remain_term = remain_term
        self.rental_money = rental_money
        self.rental_return_state = rental_return_state
        self.return_time = return_time
        self.return_voucher_serial = return_voucher_serial
        self.return_voucher_type = return_voucher_type
        self.return_way = return_way

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['async'] = self.async
        result['charge'] = self.charge
        result['extra_info'] = self.extra_info
        result['is_finish'] = self.is_finish
        result['lease_term_index'] = self.lease_term_index
        result['order_id'] = self.order_id
        result['remain_rental'] = self.remain_rental
        result['remain_term'] = self.remain_term
        result['rental_money'] = self.rental_money
        result['rental_return_state'] = self.rental_return_state
        result['return_time'] = self.return_time
        result['return_voucher_serial'] = self.return_voucher_serial
        result['return_voucher_type'] = self.return_voucher_type
        result['return_way'] = self.return_way
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.async = map.get('async')
        self.charge = map.get('charge')
        self.extra_info = map.get('extra_info')
        self.is_finish = map.get('is_finish')
        self.lease_term_index = map.get('lease_term_index')
        self.order_id = map.get('order_id')
        self.remain_rental = map.get('remain_rental')
        self.remain_term = map.get('remain_term')
        self.rental_money = map.get('rental_money')
        self.rental_return_state = map.get('rental_return_state')
        self.return_time = map.get('return_time')
        self.return_voucher_serial = map.get('return_voucher_serial')
        self.return_voucher_type = map.get('return_voucher_type')
        self.return_way = map.get('return_way')
        return self


class CreateTwcNotaryLeaseRentalResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseClearingRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None, async=None,
                 clearing_account=None, clearing_money=None, clearing_order_ids=None, clearing_state=None, end_time=None,
                 extra_info=None, lease_id=None, order_id=None, return_index=None, start_time=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.async = async
        self.clearing_account = clearing_account
        self.clearing_money = clearing_money
        self.clearing_order_ids = clearing_order_ids
        self.clearing_state = clearing_state
        self.end_time = end_time
        self.extra_info = extra_info
        self.lease_id = lease_id
        self.order_id = order_id
        self.return_index = return_index
        self.start_time = start_time

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['async'] = self.async
        result['clearing_account'] = self.clearing_account
        result['clearing_money'] = self.clearing_money
        result['clearing_order_ids'] = []
        if self.clearing_order_ids is not None:
            for k in self.clearing_order_ids:
                result['clearing_order_ids'].append(k)
        else:
            result['clearing_order_ids'] = None
        result['clearing_state'] = self.clearing_state
        result['end_time'] = self.end_time
        result['extra_info'] = self.extra_info
        result['lease_id'] = self.lease_id
        result['order_id'] = self.order_id
        result['return_index'] = self.return_index
        result['start_time'] = self.start_time
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.async = map.get('async')
        self.clearing_account = map.get('clearing_account')
        self.clearing_money = map.get('clearing_money')
        self.clearing_order_ids = []
        if map.get('clearing_order_ids') is not None:
            for k in map.get('clearing_order_ids'):
                self.clearing_order_ids.append(k)
        else:
            self.clearing_order_ids = None
        self.clearing_state = map.get('clearing_state')
        self.end_time = map.get('end_time')
        self.extra_info = map.get('extra_info')
        self.lease_id = map.get('lease_id')
        self.order_id = map.get('order_id')
        self.return_index = map.get('return_index')
        self.start_time = map.get('start_time')
        return self


class CreateTwcNotaryLeaseClearingResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseRepaymentRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None, async=None,
                 extra_info=None, is_finish=None, lease_id=None, order_id=None, overdue_day=None, overdue_money=None,
                 overdue_rate=None, overdue_status=None, remain_return_money=None, remain_return_term=None,
                 repayment_unique_id=None, return_description=None, return_index=None, return_money=None, return_status=None,
                 return_time=None, source=None, status=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.async = async
        self.extra_info = extra_info
        self.is_finish = is_finish
        self.lease_id = lease_id
        self.order_id = order_id
        self.overdue_day = overdue_day
        self.overdue_money = overdue_money
        self.overdue_rate = overdue_rate
        self.overdue_status = overdue_status
        self.remain_return_money = remain_return_money
        self.remain_return_term = remain_return_term
        self.repayment_unique_id = repayment_unique_id
        self.return_description = return_description
        self.return_index = return_index
        self.return_money = return_money
        self.return_status = return_status
        self.return_time = return_time
        self.source = source
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['async'] = self.async
        result['extra_info'] = self.extra_info
        result['is_finish'] = self.is_finish
        result['lease_id'] = self.lease_id
        result['order_id'] = self.order_id
        result['overdue_day'] = self.overdue_day
        result['overdue_money'] = self.overdue_money
        result['overdue_rate'] = self.overdue_rate
        result['overdue_status'] = self.overdue_status
        result['remain_return_money'] = self.remain_return_money
        result['remain_return_term'] = self.remain_return_term
        result['repayment_unique_id'] = self.repayment_unique_id
        result['return_description'] = self.return_description
        result['return_index'] = self.return_index
        result['return_money'] = self.return_money
        result['return_status'] = self.return_status
        result['return_time'] = self.return_time
        result['source'] = self.source
        result['status'] = self.status
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.async = map.get('async')
        self.extra_info = map.get('extra_info')
        self.is_finish = map.get('is_finish')
        self.lease_id = map.get('lease_id')
        self.order_id = map.get('order_id')
        self.overdue_day = map.get('overdue_day')
        self.overdue_money = map.get('overdue_money')
        self.overdue_rate = map.get('overdue_rate')
        self.overdue_status = map.get('overdue_status')
        self.remain_return_money = map.get('remain_return_money')
        self.remain_return_term = map.get('remain_return_term')
        self.repayment_unique_id = map.get('repayment_unique_id')
        self.return_description = map.get('return_description')
        self.return_index = map.get('return_index')
        self.return_money = map.get('return_money')
        self.return_status = map.get('return_status')
        self.return_time = map.get('return_time')
        self.source = map.get('source')
        self.status = map.get('status')
        return self


class CreateTwcNotaryLeaseRepaymentResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseNotifyregisterRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        return self


class CreateTwcNotaryLeaseNotifyregisterResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        return self


class QueryTwcNotaryLeaseIotinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, end_time=None,
                 product_imei_id=None, start_time=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.end_time = end_time
        self.product_imei_id = product_imei_id
        self.start_time = start_time

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['end_time'] = self.end_time
        result['product_imei_id'] = self.product_imei_id
        result['start_time'] = self.start_time
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.end_time = map.get('end_time')
        self.product_imei_id = map.get('product_imei_id')
        self.start_time = map.get('start_time')
        return self


class QueryTwcNotaryLeaseIotinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 lease_iot_item_info=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.lease_iot_item_info = lease_iot_item_info

    def validate(self):
        if self.lease_iot_item_info:
            for k in self.lease_iot_item_info:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['lease_iot_item_info'] = []
        if self.lease_iot_item_info is not None:
            for k in self.lease_iot_item_info:
                result['lease_iot_item_info'].append(k.to_map() if k else None)
        else:
            result['lease_iot_item_info'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.lease_iot_item_info = []
        if map.get('lease_iot_item_info') is not None:
            for k in map.get('lease_iot_item_info'):
                temp_model = LeaseIotItemInfo()
                temp_model = temp_model.from_map(k)
                self.lease_iot_item_info.append(temp_model)
        else:
            self.lease_iot_item_info = None
        return self


class CreateTwcNotaryCourtTextnotaryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, agency_code=None,
                 application_code=None, business_type=None, data_type=None, location=None, phase=None, properties=None,
                 text_content=None, transaction_id=None, tsr=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.agency_code = agency_code
        self.application_code = application_code
        self.business_type = business_type
        self.data_type = data_type
        self.location = location
        self.phase = phase
        self.properties = properties
        self.text_content = text_content
        self.transaction_id = transaction_id
        self.tsr = tsr

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['agency_code'] = self.agency_code
        result['application_code'] = self.application_code
        result['business_type'] = self.business_type
        result['data_type'] = self.data_type
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['text_content'] = self.text_content
        result['transaction_id'] = self.transaction_id
        result['tsr'] = self.tsr
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.agency_code = map.get('agency_code')
        self.application_code = map.get('application_code')
        self.business_type = map.get('business_type')
        self.data_type = map.get('data_type')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.text_content = map.get('text_content')
        self.transaction_id = map.get('transaction_id')
        self.tsr = map.get('tsr')
        return self


class CreateTwcNotaryCourtTextnotaryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tsr=None, tx_hash=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.tsr = tsr
        self.tx_hash = tx_hash

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryCourtTextnotaryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, location=None, phase=None,
                 properties=None, transaction_id=None, tx_hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.location = location
        self.phase = phase
        self.properties = properties
        self.transaction_id = transaction_id
        self.tx_hash = tx_hash

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['transaction_id'] = self.transaction_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.transaction_id = map.get('transaction_id')
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryCourtTextnotaryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, agency_code=None, application_code=None,
                 business_type=None, data_type=None, text_content=None, tsr=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.agency_code = agency_code
        self.application_code = application_code
        self.business_type = business_type
        self.data_type = data_type
        self.text_content = text_content
        self.tsr = tsr

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['agency_code'] = self.agency_code
        result['application_code'] = self.application_code
        result['business_type'] = self.business_type
        result['data_type'] = self.data_type
        result['text_content'] = self.text_content
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.agency_code = map.get('agency_code')
        self.application_code = map.get('application_code')
        self.business_type = map.get('business_type')
        self.data_type = map.get('data_type')
        self.text_content = map.get('text_content')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        return self


class CreateTwcNotaryCourtFilenotaryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, agency_code=None,
                 application_code=None, business_type=None, data_type=None, file_hash=None, file_name=None, hash_algorithm=None,
                 location=None, phase=None, properties=None, transaction_id=None, tsr=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.agency_code = agency_code
        self.application_code = application_code
        self.business_type = business_type
        self.data_type = data_type
        self.file_hash = file_hash
        self.file_name = file_name
        self.hash_algorithm = hash_algorithm
        self.location = location
        self.phase = phase
        self.properties = properties
        self.transaction_id = transaction_id
        self.tsr = tsr

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['agency_code'] = self.agency_code
        result['application_code'] = self.application_code
        result['business_type'] = self.business_type
        result['data_type'] = self.data_type
        result['file_hash'] = self.file_hash
        result['file_name'] = self.file_name
        result['hash_algorithm'] = self.hash_algorithm
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['transaction_id'] = self.transaction_id
        result['tsr'] = self.tsr
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.agency_code = map.get('agency_code')
        self.application_code = map.get('application_code')
        self.business_type = map.get('business_type')
        self.data_type = map.get('data_type')
        self.file_hash = map.get('file_hash')
        self.file_name = map.get('file_name')
        self.hash_algorithm = map.get('hash_algorithm')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.transaction_id = map.get('transaction_id')
        self.tsr = map.get('tsr')
        return self


class CreateTwcNotaryCourtFilenotaryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tsr=None, tx_hash=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.tsr = tsr
        self.tx_hash = tx_hash

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryCourtFilenotaryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, location=None, phase=None,
                 properties=None, transaction_id=None, tx_hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.location = location
        self.phase = phase
        self.properties = properties
        self.transaction_id = transaction_id
        self.tx_hash = tx_hash

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['transaction_id'] = self.transaction_id
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.transaction_id = map.get('transaction_id')
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryCourtFilenotaryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, agency_code=None, application_code=None,
                 business_type=None, data_type=None, file_hash=None, file_name=None, tsr=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.agency_code = agency_code
        self.application_code = application_code
        self.business_type = business_type
        self.data_type = data_type
        self.file_hash = file_hash
        self.file_name = file_name
        self.tsr = tsr

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['agency_code'] = self.agency_code
        result['application_code'] = self.application_code
        result['business_type'] = self.business_type
        result['data_type'] = self.data_type
        result['file_hash'] = self.file_hash
        result['file_name'] = self.file_name
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.agency_code = map.get('agency_code')
        self.application_code = map.get('application_code')
        self.business_type = map.get('business_type')
        self.data_type = map.get('data_type')
        self.file_hash = map.get('file_hash')
        self.file_name = map.get('file_name')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        return self


class CreateTwcNotaryLeaseRouteRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_content=None, route=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_content = biz_content
        self.route = route

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_content'] = self.biz_content
        result['route'] = self.route
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_content = map.get('biz_content')
        self.route = map.get('route')
        return self


class CreateTwcNotaryLeaseRouteResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class QueryTwcNotaryLeaseEncryptedinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None,
                 lease_id=None, order_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.lease_id = lease_id
        self.order_id = order_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['lease_id'] = self.lease_id
        result['order_id'] = self.order_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.lease_id = map.get('lease_id')
        self.order_id = map.get('order_id')
        return self


class QueryTwcNotaryLeaseEncryptedinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryContractTextRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, finish_info=None, flow_id=None,
                 init_info=None, phase=None, sign_info=None, transaction_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.finish_info = finish_info
        self.flow_id = flow_id
        self.init_info = init_info
        self.phase = phase
        self.sign_info = sign_info
        self.transaction_id = transaction_id

    def validate(self):
        if self.finish_info:
            self.finish_info.validate()
        if self.init_info:
            self.init_info.validate()
        if self.sign_info:
            self.sign_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.finish_info is not None:
            result['finish_info'] = self.finish_info.to_map()
        else:
            result['finish_info'] = None
        result['flow_id'] = self.flow_id
        if self.init_info is not None:
            result['init_info'] = self.init_info.to_map()
        else:
            result['init_info'] = None
        result['phase'] = self.phase
        if self.sign_info is not None:
            result['sign_info'] = self.sign_info.to_map()
        else:
            result['sign_info'] = None
        result['transaction_id'] = self.transaction_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('finish_info') is not None:
            temp_model = ContractNotaryFinishInfo()
            self.finish_info = temp_model.from_map(map['finish_info'])
        else:
            self.finish_info = None
        self.flow_id = map.get('flow_id')
        if map.get('init_info') is not None:
            temp_model = ContractNotaryInitInfo()
            self.init_info = temp_model.from_map(map['init_info'])
        else:
            self.init_info = None
        self.phase = map.get('phase')
        if map.get('sign_info') is not None:
            temp_model = ContractNotarySignInfo()
            self.sign_info = temp_model.from_map(map['sign_info'])
        else:
            self.sign_info = None
        self.transaction_id = map.get('transaction_id')
        return self


class CreateTwcNotaryContractTextResponse(TeaModel):
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


class ApplyTwcNotaryContractReportRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, finish_info=None, flow_id=None,
                 init_info=None, sign_info=None, transaction_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.finish_info = finish_info
        self.flow_id = flow_id
        self.init_info = init_info
        self.sign_info = sign_info
        self.transaction_id = transaction_id

    def validate(self):
        if self.finish_info:
            self.finish_info.validate()
        if self.init_info:
            self.init_info.validate()
        if self.sign_info:
            for k in self.sign_info:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.finish_info is not None:
            result['finish_info'] = self.finish_info.to_map()
        else:
            result['finish_info'] = None
        result['flow_id'] = self.flow_id
        if self.init_info is not None:
            result['init_info'] = self.init_info.to_map()
        else:
            result['init_info'] = None
        result['sign_info'] = []
        if self.sign_info is not None:
            for k in self.sign_info:
                result['sign_info'].append(k.to_map() if k else None)
        else:
            result['sign_info'] = None
        result['transaction_id'] = self.transaction_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('finish_info') is not None:
            temp_model = ContractNotaryFinishInfo()
            self.finish_info = temp_model.from_map(map['finish_info'])
        else:
            self.finish_info = None
        self.flow_id = map.get('flow_id')
        if map.get('init_info') is not None:
            temp_model = ContractNotaryInitInfo()
            self.init_info = temp_model.from_map(map['init_info'])
        else:
            self.init_info = None
        self.sign_info = []
        if map.get('sign_info') is not None:
            for k in map.get('sign_info'):
                temp_model = ContractNotarySignInfo()
                temp_model = temp_model.from_map(k)
                self.sign_info.append(temp_model)
        else:
            self.sign_info = None
        self.transaction_id = map.get('transaction_id')
        return self


class ApplyTwcNotaryContractReportResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, auth_code=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.auth_code = auth_code

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['auth_code'] = self.auth_code
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.auth_code = map.get('auth_code')
        return self


class GetTwcNotaryContractTextRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, tx_hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.tx_hash = tx_hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.tx_hash = map.get('tx_hash')
        return self


class GetTwcNotaryContractTextResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, notary_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.notary_data = notary_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['notary_data'] = self.notary_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.notary_data = map.get('notary_data')
        return self


class CreateTwcNotaryInternalTransRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, customer=None, properties=None,
                 sub_biz_id=None, tsr=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.customer = customer
        self.properties = properties
        self.sub_biz_id = sub_biz_id
        self.tsr = tsr

    def validate(self):
        if self.customer:
            self.customer.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.customer is not None:
            result['customer'] = self.customer.to_map()
        else:
            result['customer'] = None
        result['properties'] = self.properties
        result['sub_biz_id'] = self.sub_biz_id
        result['tsr'] = self.tsr
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('customer') is not None:
            temp_model = Identity()
            self.customer = temp_model.from_map(map['customer'])
        else:
            self.customer = None
        self.properties = map.get('properties')
        self.sub_biz_id = map.get('sub_biz_id')
        self.tsr = map.get('tsr')
        return self


class CreateTwcNotaryInternalTransResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, transaction_id=None, tsr=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.transaction_id = transaction_id
        self.tsr = tsr

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['transaction_id'] = self.transaction_id
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.transaction_id = map.get('transaction_id')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        return self


class CreateTwcNotaryInternalTextRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, hash_algorithm=None,
                 location=None, notary_content=None, phase=None, properties=None, text_notary_type=None, transaction_id=None,
                 tsr=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.hash_algorithm = hash_algorithm
        self.location = location
        self.notary_content = notary_content
        self.phase = phase
        self.properties = properties
        self.text_notary_type = text_notary_type
        self.transaction_id = transaction_id
        self.tsr = tsr

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['hash_algorithm'] = self.hash_algorithm
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['notary_content'] = self.notary_content
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['text_notary_type'] = self.text_notary_type
        result['transaction_id'] = self.transaction_id
        result['tsr'] = self.tsr
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.hash_algorithm = map.get('hash_algorithm')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.notary_content = map.get('notary_content')
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.text_notary_type = map.get('text_notary_type')
        self.transaction_id = map.get('transaction_id')
        self.tsr = map.get('tsr')
        return self


class CreateTwcNotaryInternalTextResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, tsr=None, tx_hash=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.tsr = tsr
        self.tx_hash = tx_hash

    def validate(self):
        if self.tsr:
            self.tsr.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        if self.tsr is not None:
            result['tsr'] = self.tsr.to_map()
        else:
            result['tsr'] = None
        result['tx_hash'] = self.tx_hash
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        if map.get('tsr') is not None:
            temp_model = TsrResponse()
            self.tsr = temp_model.from_map(map['tsr'])
        else:
            self.tsr = None
        self.tx_hash = map.get('tx_hash')
        return self


class CreateTwcNotaryLeaseTextRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, hash_algorithm=None,
                 location=None, notary_content=None, phase=None, properties=None, text_notary_type=None, transaction_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.hash_algorithm = hash_algorithm
        self.location = location
        self.notary_content = notary_content
        self.phase = phase
        self.properties = properties
        self.text_notary_type = text_notary_type
        self.transaction_id = transaction_id

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['hash_algorithm'] = self.hash_algorithm
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['notary_content'] = self.notary_content
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['text_notary_type'] = self.text_notary_type
        result['transaction_id'] = self.transaction_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.hash_algorithm = map.get('hash_algorithm')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.notary_content = map.get('notary_content')
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.text_notary_type = map.get('text_notary_type')
        self.transaction_id = map.get('transaction_id')
        return self


class CreateTwcNotaryLeaseTextResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, phase=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.phase = phase

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['phase'] = self.phase
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.phase = map.get('phase')
        return self


class CreateTwcNotaryLeaseFileRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, file_notary_type=None,
                 hash_algorithm=None, location=None, notary_file=None, notary_name=None, phase=None, properties=None,
                 transaction_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.file_notary_type = file_notary_type
        self.hash_algorithm = hash_algorithm
        self.location = location
        self.notary_file = notary_file
        self.notary_name = notary_name
        self.phase = phase
        self.properties = properties
        self.transaction_id = transaction_id

    def validate(self):
        if self.location:
            self.location.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['file_notary_type'] = self.file_notary_type
        result['hash_algorithm'] = self.hash_algorithm
        if self.location is not None:
            result['location'] = self.location.to_map()
        else:
            result['location'] = None
        result['notary_file'] = self.notary_file
        result['notary_name'] = self.notary_name
        result['phase'] = self.phase
        result['properties'] = self.properties
        result['transaction_id'] = self.transaction_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.file_notary_type = map.get('file_notary_type')
        self.hash_algorithm = map.get('hash_algorithm')
        if map.get('location') is not None:
            temp_model = Location()
            self.location = temp_model.from_map(map['location'])
        else:
            self.location = None
        self.notary_file = map.get('notary_file')
        self.notary_name = map.get('notary_name')
        self.phase = map.get('phase')
        self.properties = map.get('properties')
        self.transaction_id = map.get('transaction_id')
        return self


class CreateTwcNotaryLeaseFileResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, phase=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.phase = phase

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['phase'] = self.phase
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.phase = map.get('phase')
        return self


class ListTwcNotaryLeaseNotaryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, merchant_order_no=None,
                 order_no=None, payment_channel=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.merchant_order_no = merchant_order_no
        self.order_no = order_no
        self.payment_channel = payment_channel

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['merchant_order_no'] = self.merchant_order_no
        result['order_no'] = self.order_no
        result['payment_channel'] = self.payment_channel
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.merchant_order_no = map.get('merchant_order_no')
        self.order_no = map.get('order_no')
        self.payment_channel = map.get('payment_channel')
        return self


class ListTwcNotaryLeaseNotaryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, records=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.records = records

    def validate(self):
        if self.records:
            for k in self.records:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['records'] = []
        if self.records is not None:
            for k in self.records:
                result['records'].append(k.to_map() if k else None)
        else:
            result['records'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.records = []
        if map.get('records') is not None:
            for k in map.get('records'):
                temp_model = LeaseNotaryRecord()
                temp_model = temp_model.from_map(k)
                self.records.append(temp_model)
        else:
            self.records = None
        return self


class QueryTwcNotaryLeaseApplicationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, page_size=None, start_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.page_size = page_size
        self.start_id = start_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['page_size'] = self.page_size
        result['start_id'] = self.start_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.page_size = map.get('page_size')
        self.start_id = map.get('start_id')
        return self


class QueryTwcNotaryLeaseApplicationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class QueryTwcNotaryLeaseApplicationdetailinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        return self


class QueryTwcNotaryLeaseApplicationdetailinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class SetTwcNotaryLeaseRepaymentstatusRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None,
                 finish=None, lease_id=None, order_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.finish = finish
        self.lease_id = lease_id
        self.order_id = order_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['finish'] = self.finish
        result['lease_id'] = self.lease_id
        result['order_id'] = self.order_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.finish = map.get('finish')
        self.lease_id = map.get('lease_id')
        self.order_id = map.get('order_id')
        return self


class SetTwcNotaryLeaseRepaymentstatusResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self


class CreateTwcNotaryLeaseSupplierinfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, application_id=None,
                 extra_info=None, logistics_order_id=None, order_id=None, phase=None, purchase_order_id=None,
                 supplier_product_list=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.application_id = application_id
        self.extra_info = extra_info
        self.logistics_order_id = logistics_order_id
        self.order_id = order_id
        self.phase = phase
        self.purchase_order_id = purchase_order_id
        self.supplier_product_list = supplier_product_list

    def validate(self):
        if self.supplier_product_list:
            for k in self.supplier_product_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['application_id'] = self.application_id
        result['extra_info'] = self.extra_info
        result['logistics_order_id'] = self.logistics_order_id
        result['order_id'] = self.order_id
        result['phase'] = self.phase
        result['purchase_order_id'] = self.purchase_order_id
        result['supplier_product_list'] = []
        if self.supplier_product_list is not None:
            for k in self.supplier_product_list:
                result['supplier_product_list'].append(k.to_map() if k else None)
        else:
            result['supplier_product_list'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.application_id = map.get('application_id')
        self.extra_info = map.get('extra_info')
        self.logistics_order_id = map.get('logistics_order_id')
        self.order_id = map.get('order_id')
        self.phase = map.get('phase')
        self.purchase_order_id = map.get('purchase_order_id')
        self.supplier_product_list = []
        if map.get('supplier_product_list') is not None:
            for k in map.get('supplier_product_list'):
                temp_model = SupplierProductInfo()
                temp_model = temp_model.from_map(k)
                self.supplier_product_list.append(temp_model)
        else:
            self.supplier_product_list = None
        return self


class CreateTwcNotaryLeaseSupplierinfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, code=None, err_message=None,
                 response_data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.code = code
        self.err_message = err_message
        self.response_data = response_data

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['code'] = self.code
        result['err_message'] = self.err_message
        result['response_data'] = self.response_data
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.code = map.get('code')
        self.err_message = map.get('err_message')
        self.response_data = map.get('response_data')
        return self
