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


class BlockInfo(TeaModel):
    def __init__(self, biz_data=None, biz_id=None, block_hash=None, height=None, parent_hash=None, size=None,
                 timestamp=None, transaction_size=None, version=None):
        self.biz_data = biz_data
        self.biz_id = biz_id
        self.block_hash = block_hash
        self.height = height
        self.parent_hash = parent_hash
        self.size = size
        self.timestamp = timestamp
        self.transaction_size = transaction_size
        self.version = version

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['biz_data'] = self.biz_data
        result['biz_id'] = self.biz_id
        result['block_hash'] = self.block_hash
        result['height'] = self.height
        result['parent_hash'] = self.parent_hash
        result['size'] = self.size
        result['timestamp'] = self.timestamp
        result['transaction_size'] = self.transaction_size
        result['version'] = self.version
        return result

    def from_map(self, map={}):
        self.biz_data = map.get('biz_data')
        self.biz_id = map.get('biz_id')
        self.block_hash = map.get('block_hash')
        self.height = map.get('height')
        self.parent_hash = map.get('parent_hash')
        self.size = map.get('size')
        self.timestamp = map.get('timestamp')
        self.transaction_size = map.get('transaction_size')
        self.version = map.get('version')
        return self


class Institution(TeaModel):
    def __init__(self, code=None, name=None):
        self.code = code
        self.name = name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['code'] = self.code
        result['name'] = self.name
        return result

    def from_map(self, map={}):
        self.code = map.get('code')
        self.name = map.get('name')
        return self


class AntiPiracyResultObject(TeaModel):
    def __init__(self, infr_host=None, infr_time=None, infr_title=None, infr_url=None, production_type=None,
                 similarity=None):
        self.infr_host = infr_host
        self.infr_time = infr_time
        self.infr_title = infr_title
        self.infr_url = infr_url
        self.production_type = production_type
        self.similarity = similarity

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['infr_host'] = self.infr_host
        result['infr_time'] = self.infr_time
        result['infr_title'] = self.infr_title
        result['infr_url'] = self.infr_url
        result['production_type'] = self.production_type
        result['similarity'] = self.similarity
        return result

    def from_map(self, map={}):
        self.infr_host = map.get('infr_host')
        self.infr_time = map.get('infr_time')
        self.infr_title = map.get('infr_title')
        self.infr_url = map.get('infr_url')
        self.production_type = map.get('production_type')
        self.similarity = map.get('similarity')
        return self


class HitDetectItems(TeaModel):
    def __init__(self, detect_resource_level=None, detect_type_code=None, hit_content=None,
                 hit_detect_resource=None):
        self.detect_resource_level = detect_resource_level
        self.detect_type_code = detect_type_code
        self.hit_content = hit_content
        self.hit_detect_resource = hit_detect_resource

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['detect_resource_level'] = self.detect_resource_level
        result['detect_type_code'] = self.detect_type_code
        result['hit_content'] = self.hit_content
        result['hit_detect_resource'] = self.hit_detect_resource
        return result

    def from_map(self, map={}):
        self.detect_resource_level = map.get('detect_resource_level')
        self.detect_type_code = map.get('detect_type_code')
        self.hit_content = map.get('hit_content')
        self.hit_detect_resource = map.get('hit_detect_resource')
        return self


class BizInfo(TeaModel):
    def __init__(self, client_tenent=None, code=None, product_code=None):
        self.client_tenent = client_tenent
        self.code = code
        self.product_code = product_code

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['client_tenent'] = self.client_tenent
        result['code'] = self.code
        result['product_code'] = self.product_code
        return result

    def from_map(self, map={}):
        self.client_tenent = map.get('client_tenent')
        self.code = map.get('code')
        self.product_code = map.get('product_code')
        return self


class DidDocServicesInfo(TeaModel):
    def __init__(self, extension=None, id=None, service_endpoint=None, type=None):
        self.extension = extension
        self.id = id
        self.service_endpoint = service_endpoint
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['extension'] = self.extension
        result['id'] = self.id
        result['service_endpoint'] = self.service_endpoint
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.extension = map.get('extension')
        self.id = map.get('id')
        self.service_endpoint = map.get('service_endpoint')
        self.type = map.get('type')
        return self


class QueryBaasPlusIndividualidInternalmaskRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None, cert_no=None,
                 mobile=None, name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.cert_no = cert_no
        self.mobile = mobile
        self.name = name

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['cert_no'] = self.cert_no
        result['mobile'] = self.mobile
        result['name'] = self.name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.cert_no = map.get('cert_no')
        self.mobile = map.get('mobile')
        self.name = map.get('name')
        return self


class QueryBaasPlusIndividualidInternalmaskResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, accepted=None, verify_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.accepted = accepted
        self.verify_url = verify_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['accepted'] = self.accepted
        result['verify_url'] = self.verify_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.accepted = map.get('accepted')
        self.verify_url = map.get('verify_url')
        return self


class QueryBaasPlusEnterpriseidInternalfourmetaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None,
                 ep_cert_name=None, ep_cert_no=None, ep_cert_type=None, legal_person_cert_name=None, legal_person_cert_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no
        self.ep_cert_type = ep_cert_type
        self.legal_person_cert_name = legal_person_cert_name
        self.legal_person_cert_no = legal_person_cert_no

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
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
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.ep_cert_type = map.get('ep_cert_type')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        return self


class QueryBaasPlusEnterpriseidInternalfourmetaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, enterprise_status=None, open_time=None,
                 passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
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
        result['enterprise_status'] = self.enterprise_status
        result['open_time'] = self.open_time
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.enterprise_status = map.get('enterprise_status')
        self.open_time = map.get('open_time')
        self.passed = map.get('passed')
        return self


class QueryBaasPlusEnterpriseidInternalthreemetaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None,
                 ep_cert_name=None, ep_cert_no=None, ep_cert_type=None, legal_person_cert_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no
        self.ep_cert_type = ep_cert_type
        self.legal_person_cert_name = legal_person_cert_name

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['ep_cert_type'] = self.ep_cert_type
        result['legal_person_cert_name'] = self.legal_person_cert_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.ep_cert_type = map.get('ep_cert_type')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        return self


class QueryBaasPlusEnterpriseidInternalthreemetaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, enterprise_status=None, open_time=None,
                 passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
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
        result['enterprise_status'] = self.enterprise_status
        result['open_time'] = self.open_time
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.enterprise_status = map.get('enterprise_status')
        self.open_time = map.get('open_time')
        self.passed = map.get('passed')
        return self


class QueryBaasPlusEnterpriseidInternaltwometaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None,
                 ep_cert_name=None, ep_cert_no=None, ep_cert_type=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no
        self.ep_cert_type = ep_cert_type

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['ep_cert_type'] = self.ep_cert_type
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.ep_cert_type = map.get('ep_cert_type')
        return self


class QueryBaasPlusEnterpriseidInternaltwometaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, enterprise_status=None, open_time=None,
                 passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
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
        result['enterprise_status'] = self.enterprise_status
        result['open_time'] = self.open_time
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.enterprise_status = map.get('enterprise_status')
        self.open_time = map.get('open_time')
        self.passed = map.get('passed')
        return self


class InitBaasPlusEnterpriseidFaceauthRequest(TeaModel):
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


class InitBaasPlusEnterpriseidFaceauthResponse(TeaModel):
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


class QueryBaasPlusEnterpriseidFaceauthRequest(TeaModel):
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


class QueryBaasPlusEnterpriseidFaceauthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, biz_no=None, failed_code=None,
                 failed_message=None, passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.biz_no = biz_no
        self.failed_code = failed_code
        self.failed_message = failed_message
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
        result['failed_message'] = self.failed_message
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.biz_no = map.get('biz_no')
        self.failed_code = map.get('failed_code')
        self.failed_message = map.get('failed_message')
        self.passed = map.get('passed')
        return self


class QueryBaasPlusIndividualidInternalfourmetaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bank_card_no=None,
                 biz_info=None, cert_no=None, mobile=None, name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bank_card_no = bank_card_no
        self.biz_info = biz_info
        self.cert_no = cert_no
        self.mobile = mobile
        self.name = name

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bank_card_no'] = self.bank_card_no
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['cert_no'] = self.cert_no
        result['mobile'] = self.mobile
        result['name'] = self.name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bank_card_no = map.get('bank_card_no')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.cert_no = map.get('cert_no')
        self.mobile = map.get('mobile')
        self.name = map.get('name')
        return self


class QueryBaasPlusIndividualidInternalfourmetaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, accepted=None, verify_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.accepted = accepted
        self.verify_url = verify_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['accepted'] = self.accepted
        result['verify_url'] = self.verify_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.accepted = map.get('accepted')
        self.verify_url = map.get('verify_url')
        return self


class QueryBaasPlusIndividualidInternalthreemetaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None, cert_no=None,
                 mobile=None, name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.cert_no = cert_no
        self.mobile = mobile
        self.name = name

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['cert_no'] = self.cert_no
        result['mobile'] = self.mobile
        result['name'] = self.name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.cert_no = map.get('cert_no')
        self.mobile = map.get('mobile')
        self.name = map.get('name')
        return self


class QueryBaasPlusIndividualidInternalthreemetaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, accepted=None, verify_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.accepted = accepted
        self.verify_url = verify_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['accepted'] = self.accepted
        result['verify_url'] = self.verify_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.accepted = map.get('accepted')
        self.verify_url = map.get('verify_url')
        return self


class QueryBaasPlusIndividualidInternaltwometaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None, cert_no=None,
                 name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.cert_no = cert_no
        self.name = name

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['cert_no'] = self.cert_no
        result['name'] = self.name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.cert_no = map.get('cert_no')
        self.name = map.get('name')
        return self


class QueryBaasPlusIndividualidInternaltwometaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, accepted=None, verify_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.accepted = accepted
        self.verify_url = verify_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['accepted'] = self.accepted
        result['verify_url'] = self.verify_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.accepted = map.get('accepted')
        self.verify_url = map.get('verify_url')
        return self


class CreateBaasPlusBaicorpInternalevaluationasyncRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_id=None, biz_info=None,
                 callback=None, callback_param=None, custom_id=None, entity_data=None, entity_type=None, entity_url=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_id = biz_id
        self.biz_info = biz_info
        self.callback = callback
        self.callback_param = callback_param
        self.custom_id = custom_id
        self.entity_data = entity_data
        self.entity_type = entity_type
        self.entity_url = entity_url

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_id'] = self.biz_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['callback'] = self.callback
        result['callback_param'] = self.callback_param
        result['custom_id'] = self.custom_id
        result['entity_data'] = self.entity_data
        result['entity_type'] = self.entity_type
        result['entity_url'] = self.entity_url
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_id = map.get('biz_id')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.callback = map.get('callback')
        self.callback_param = map.get('callback_param')
        self.custom_id = map.get('custom_id')
        self.entity_data = map.get('entity_data')
        self.entity_type = map.get('entity_type')
        self.entity_url = map.get('entity_url')
        return self


class CreateBaasPlusBaicorpInternalevaluationasyncResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, content_score=None,
                 content_score_desc=None, custom_id=None, repeat_reason=None, repeat_result=None, risk_result=None,
                 risk_result_desc=None, task_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.content_score = content_score
        self.content_score_desc = content_score_desc
        self.custom_id = custom_id
        self.repeat_reason = repeat_reason
        self.repeat_result = repeat_result
        self.risk_result = risk_result
        self.risk_result_desc = risk_result_desc
        self.task_id = task_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['content_score'] = self.content_score
        result['content_score_desc'] = self.content_score_desc
        result['custom_id'] = self.custom_id
        result['repeat_reason'] = self.repeat_reason
        result['repeat_result'] = self.repeat_result
        result['risk_result'] = self.risk_result
        result['risk_result_desc'] = self.risk_result_desc
        result['task_id'] = self.task_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.content_score = map.get('content_score')
        self.content_score_desc = map.get('content_score_desc')
        self.custom_id = map.get('custom_id')
        self.repeat_reason = map.get('repeat_reason')
        self.repeat_result = map.get('repeat_result')
        self.risk_result = map.get('risk_result')
        self.risk_result_desc = map.get('risk_result_desc')
        self.task_id = map.get('task_id')
        return self


class CreateBaasPlusBaicorpInternalmonitorasyncRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_id=None, biz_info=None,
                 broadcast_time=None, custom_id=None, entity_data=None, entity_type=None, entity_url=None, key_words=None,
                 matched_duration=None, monitor_duration=None, monitor_frequency=None, monitor_scope=None, notify_url=None,
                 provider_id=None, start_date=None, task_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_id = biz_id
        self.biz_info = biz_info
        self.broadcast_time = broadcast_time
        self.custom_id = custom_id
        self.entity_data = entity_data
        self.entity_type = entity_type
        self.entity_url = entity_url
        self.key_words = key_words
        self.matched_duration = matched_duration
        self.monitor_duration = monitor_duration
        self.monitor_frequency = monitor_frequency
        self.monitor_scope = monitor_scope
        self.notify_url = notify_url
        self.provider_id = provider_id
        self.start_date = start_date
        self.task_id = task_id

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_id'] = self.biz_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['broadcast_time'] = self.broadcast_time
        result['custom_id'] = self.custom_id
        result['entity_data'] = self.entity_data
        result['entity_type'] = self.entity_type
        result['entity_url'] = self.entity_url
        result['key_words'] = []
        if self.key_words is not None:
            for k in self.key_words:
                result['key_words'].append(k)
        else:
            result['key_words'] = None
        result['matched_duration'] = self.matched_duration
        result['monitor_duration'] = self.monitor_duration
        result['monitor_frequency'] = self.monitor_frequency
        result['monitor_scope'] = []
        if self.monitor_scope is not None:
            for k in self.monitor_scope:
                result['monitor_scope'].append(k)
        else:
            result['monitor_scope'] = None
        result['notify_url'] = self.notify_url
        result['provider_id'] = self.provider_id
        result['start_date'] = self.start_date
        result['task_id'] = self.task_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_id = map.get('biz_id')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.broadcast_time = map.get('broadcast_time')
        self.custom_id = map.get('custom_id')
        self.entity_data = map.get('entity_data')
        self.entity_type = map.get('entity_type')
        self.entity_url = map.get('entity_url')
        self.key_words = []
        if map.get('key_words') is not None:
            for k in map.get('key_words'):
                self.key_words.append(k)
        else:
            self.key_words = None
        self.matched_duration = map.get('matched_duration')
        self.monitor_duration = map.get('monitor_duration')
        self.monitor_frequency = map.get('monitor_frequency')
        self.monitor_scope = []
        if map.get('monitor_scope') is not None:
            for k in map.get('monitor_scope'):
                self.monitor_scope.append(k)
        else:
            self.monitor_scope = None
        self.notify_url = map.get('notify_url')
        self.provider_id = map.get('provider_id')
        self.start_date = map.get('start_date')
        self.task_id = map.get('task_id')
        return self


class CreateBaasPlusBaicorpInternalmonitorasyncResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, monitor_duration=None, start_date=None,
                 task_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.monitor_duration = monitor_duration
        self.start_date = start_date
        self.task_id = task_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['monitor_duration'] = self.monitor_duration
        result['start_date'] = self.start_date
        result['task_id'] = self.task_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.monitor_duration = map.get('monitor_duration')
        self.start_date = map.get('start_date')
        self.task_id = map.get('task_id')
        return self


class QueryBaasPlusBaicorpInternalevaluationasyncRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_id=None, biz_info=None,
                 custom_id=None, task_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_id = biz_id
        self.biz_info = biz_info
        self.custom_id = custom_id
        self.task_id = task_id

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_id'] = self.biz_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['custom_id'] = self.custom_id
        result['task_id'] = self.task_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_id = map.get('biz_id')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.custom_id = map.get('custom_id')
        self.task_id = map.get('task_id')
        return self


class QueryBaasPlusBaicorpInternalevaluationasyncResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, custom_id=None, risk_result=None,
                 risk_result_desc=None, task_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.custom_id = custom_id
        self.risk_result = risk_result
        self.risk_result_desc = risk_result_desc
        self.task_id = task_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['custom_id'] = self.custom_id
        result['risk_result'] = self.risk_result
        result['risk_result_desc'] = self.risk_result_desc
        result['task_id'] = self.task_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.custom_id = map.get('custom_id')
        self.risk_result = map.get('risk_result')
        self.risk_result_desc = map.get('risk_result_desc')
        self.task_id = map.get('task_id')
        return self


class QueryBaasPlusBaicorpInternalmonitorasyncRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_id=None, task_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_id = biz_id
        self.task_id = task_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_id'] = self.biz_id
        result['task_id'] = self.task_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_id = map.get('biz_id')
        self.task_id = map.get('task_id')
        return self


class QueryBaasPlusBaicorpInternalmonitorasyncResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, data=None, err_msg=None, status=None,
                 task_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.data = data
        self.err_msg = err_msg
        self.status = status
        self.task_id = task_id

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        else:
            result['data'] = None
        result['err_msg'] = self.err_msg
        result['status'] = self.status
        result['task_id'] = self.task_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.data = []
        if map.get('data') is not None:
            for k in map.get('data'):
                temp_model = AntiPiracyResultObject()
                temp_model = temp_model.from_map(k)
                self.data.append(temp_model)
        else:
            self.data = None
        self.err_msg = map.get('err_msg')
        self.status = map.get('status')
        self.task_id = map.get('task_id')
        return self


class CertifyBaasPlusEnterpriseidFaceauthRequest(TeaModel):
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


class CertifyBaasPlusEnterpriseidFaceauthResponse(TeaModel):
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


class InitBaasPlusIndividualidFaceauthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_code=None, cert_name=None,
                 cert_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_code = biz_code
        self.cert_name = cert_name
        self.cert_no = cert_no

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_code'] = self.biz_code
        result['cert_name'] = self.cert_name
        result['cert_no'] = self.cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_code = map.get('biz_code')
        self.cert_name = map.get('cert_name')
        self.cert_no = map.get('cert_no')
        return self


class InitBaasPlusIndividualidFaceauthResponse(TeaModel):
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


class CertifyBaasPlusIndividualidFaceauthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, callback_url=None,
                 certify_id=None, redirect_url=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
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
        result['callback_url'] = self.callback_url
        result['certify_id'] = self.certify_id
        result['redirect_url'] = self.redirect_url
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.callback_url = map.get('callback_url')
        self.certify_id = map.get('certify_id')
        self.redirect_url = map.get('redirect_url')
        return self


class CertifyBaasPlusIndividualidFaceauthResponse(TeaModel):
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


class QueryBaasPlusIndividualidFaceauthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, certify_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.certify_id = certify_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['certify_id'] = self.certify_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.certify_id = map.get('certify_id')
        return self


class QueryBaasPlusIndividualidFaceauthResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, certify_id=None, finished=None,
                 passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.certify_id = certify_id
        self.finished = finished
        self.passed = passed

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['certify_id'] = self.certify_id
        result['finished'] = self.finished
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.certify_id = map.get('certify_id')
        self.finished = map.get('finished')
        self.passed = map.get('passed')
        return self


class GetBaasPlusDataserviceBlockchainheightRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bizid=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bizid = bizid

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bizid'] = self.bizid
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bizid = map.get('bizid')
        return self


class GetBaasPlusDataserviceBlockchainheightResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.data = data

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


class GetBaasPlusDataserviceTransactioncountRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bizid=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bizid = bizid

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bizid'] = self.bizid
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bizid = map.get('bizid')
        return self


class GetBaasPlusDataserviceTransactioncountResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, data=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.data = data

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


class GetBaasPlusDataserviceTransactioninfoRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bizid=None, hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bizid = bizid
        self.hash = hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bizid'] = self.bizid
        result['hash'] = self.hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bizid = map.get('bizid')
        self.hash = map.get('hash')
        return self


class GetBaasPlusDataserviceTransactioninfoResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, bizid=None, category=None,
                 create_time=None, from_hash=None, hash=None, height=None, to_hash=None, type=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.bizid = bizid
        self.category = category
        self.create_time = create_time
        self.from_hash = from_hash
        self.hash = hash
        self.height = height
        self.to_hash = to_hash
        self.type = type

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['bizid'] = self.bizid
        result['category'] = self.category
        result['create_time'] = self.create_time
        result['from_hash'] = self.from_hash
        result['hash'] = self.hash
        result['height'] = self.height
        result['to_hash'] = self.to_hash
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.bizid = map.get('bizid')
        self.category = map.get('category')
        self.create_time = map.get('create_time')
        self.from_hash = map.get('from_hash')
        self.hash = map.get('hash')
        self.height = map.get('height')
        self.to_hash = map.get('to_hash')
        self.type = map.get('type')
        return self


class ListBaasPlusDataserviceLastblocksRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bizid=None, size=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bizid = bizid
        self.size = size

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bizid'] = self.bizid
        result['size'] = self.size
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bizid = map.get('bizid')
        self.size = map.get('size')
        return self


class ListBaasPlusDataserviceLastblocksResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, last_block_list=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.last_block_list = last_block_list

    def validate(self):
        if self.last_block_list:
            for k in self.last_block_list:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['last_block_list'] = []
        if self.last_block_list is not None:
            for k in self.last_block_list:
                result['last_block_list'].append(k.to_map() if k else None)
        else:
            result['last_block_list'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.last_block_list = []
        if map.get('last_block_list') is not None:
            for k in map.get('last_block_list'):
                temp_model = BlockInfo()
                temp_model = temp_model.from_map(k)
                self.last_block_list.append(temp_model)
        else:
            self.last_block_list = None
        return self


class GetBaasPlusTasAttestationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, algorithm=None, cert_req=None,
                 compress=None, rid=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.algorithm = algorithm
        self.cert_req = cert_req
        self.compress = compress
        self.rid = rid

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['algorithm'] = self.algorithm
        result['cert_req'] = self.cert_req
        result['compress'] = self.compress
        result['rid'] = self.rid
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.algorithm = map.get('algorithm')
        self.cert_req = map.get('cert_req')
        self.compress = map.get('compress')
        self.rid = map.get('rid')
        return self


class GetBaasPlusTasAttestationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, ctsr=None, sn=None, ts=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.ctsr = ctsr
        self.sn = sn
        self.ts = ts

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['ctsr'] = self.ctsr
        result['sn'] = self.sn
        result['ts'] = self.ts
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.ctsr = map.get('ctsr')
        self.sn = map.get('sn')
        self.ts = map.get('ts')
        return self


class VerifyBaasPlusTasCtsrRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, ctsr=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.ctsr = ctsr

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['ctsr'] = self.ctsr
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.ctsr = map.get('ctsr')
        return self


class VerifyBaasPlusTasCtsrResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, app_name=None, company_name=None,
                 desc=None, hash_value=None, sn=None, ts=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.app_name = app_name
        self.company_name = company_name
        self.desc = desc
        self.hash_value = hash_value
        self.sn = sn
        self.ts = ts

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['app_name'] = self.app_name
        result['company_name'] = self.company_name
        result['desc'] = self.desc
        result['hash_value'] = self.hash_value
        result['sn'] = self.sn
        result['ts'] = self.ts
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.app_name = map.get('app_name')
        self.company_name = map.get('company_name')
        self.desc = map.get('desc')
        self.hash_value = map.get('hash_value')
        self.sn = map.get('sn')
        self.ts = map.get('ts')
        return self


class GetBaasPlusTasCertificateRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, sn=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.sn = sn

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['sn'] = self.sn
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.sn = map.get('sn')
        return self


class GetBaasPlusTasCertificateResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.url = url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['url'] = self.url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.url = map.get('url')
        return self


class GetBaasPlusTasTransactionattestationRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, algorithm=None, cert_req=None,
                 compress=None, desc=None, rid=None, trans_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.algorithm = algorithm
        self.cert_req = cert_req
        self.compress = compress
        self.desc = desc
        self.rid = rid
        self.trans_id = trans_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['algorithm'] = self.algorithm
        result['cert_req'] = self.cert_req
        result['compress'] = self.compress
        result['desc'] = self.desc
        result['rid'] = self.rid
        result['trans_id'] = self.trans_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.algorithm = map.get('algorithm')
        self.cert_req = map.get('cert_req')
        self.compress = map.get('compress')
        self.desc = map.get('desc')
        self.rid = map.get('rid')
        self.trans_id = map.get('trans_id')
        return self


class GetBaasPlusTasTransactionattestationResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, ctsr=None, sn=None, ts=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.ctsr = ctsr
        self.sn = sn
        self.ts = ts

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['ctsr'] = self.ctsr
        result['sn'] = self.sn
        result['ts'] = self.ts
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.ctsr = map.get('ctsr')
        self.sn = map.get('sn')
        self.ts = map.get('ts')
        return self


class QueryBaasPlusEverifyFourmetaRequest(TeaModel):
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


class QueryBaasPlusEverifyFourmetaResponse(TeaModel):
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


class QueryBaasPlusEverifyThreemetaRequest(TeaModel):
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


class QueryBaasPlusEverifyThreemetaResponse(TeaModel):
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


class QueryBaasPlusEverifyTwometaRequest(TeaModel):
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


class QueryBaasPlusEverifyTwometaResponse(TeaModel):
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


class QueryBaasPlusBaicorpInternalsearchlibraryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, biz_id=None,
                 company_id=None, content_id=None, custom_id=None, entity_data=None, entity_desc=None, entity_type=None,
                 entity_url=None, timestamp=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.biz_id = biz_id
        self.company_id = company_id
        self.content_id = content_id
        self.custom_id = custom_id
        self.entity_data = entity_data
        self.entity_desc = entity_desc
        self.entity_type = entity_type
        self.entity_url = entity_url
        self.timestamp = timestamp

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['biz_id'] = self.biz_id
        result['company_id'] = self.company_id
        result['content_id'] = self.content_id
        result['custom_id'] = self.custom_id
        result['entity_data'] = self.entity_data
        result['entity_desc'] = self.entity_desc
        result['entity_type'] = self.entity_type
        result['entity_url'] = self.entity_url
        result['timestamp'] = self.timestamp
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.biz_id = map.get('biz_id')
        self.company_id = map.get('company_id')
        self.content_id = map.get('content_id')
        self.custom_id = map.get('custom_id')
        self.entity_data = map.get('entity_data')
        self.entity_desc = map.get('entity_desc')
        self.entity_type = map.get('entity_type')
        self.entity_url = map.get('entity_url')
        self.timestamp = map.get('timestamp')
        return self


class QueryBaasPlusBaicorpInternalsearchlibraryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, custom_id=None, model_info=None,
                 repeat_info=None, similarity_info=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.custom_id = custom_id
        self.model_info = model_info
        self.repeat_info = repeat_info
        self.similarity_info = similarity_info

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['custom_id'] = self.custom_id
        result['model_info'] = self.model_info
        result['repeat_info'] = self.repeat_info
        result['similarity_info'] = self.similarity_info
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.custom_id = map.get('custom_id')
        self.model_info = map.get('model_info')
        self.repeat_info = map.get('repeat_info')
        self.similarity_info = map.get('similarity_info')
        return self


class UpdateBaasPlusBaicorpInternalsearchlibraryRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None, biz_id=None,
                 company_id=None, content_id=None, custom_id=None, entity_data=None, entity_desc=None, entity_type=None,
                 entity_url=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.biz_id = biz_id
        self.company_id = company_id
        self.content_id = content_id
        self.custom_id = custom_id
        self.entity_data = entity_data
        self.entity_desc = entity_desc
        self.entity_type = entity_type
        self.entity_url = entity_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['biz_id'] = self.biz_id
        result['company_id'] = self.company_id
        result['content_id'] = self.content_id
        result['custom_id'] = self.custom_id
        result['entity_data'] = self.entity_data
        result['entity_desc'] = self.entity_desc
        result['entity_type'] = self.entity_type
        result['entity_url'] = self.entity_url
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.biz_id = map.get('biz_id')
        self.company_id = map.get('company_id')
        self.content_id = map.get('content_id')
        self.custom_id = map.get('custom_id')
        self.entity_data = map.get('entity_data')
        self.entity_desc = map.get('entity_desc')
        self.entity_type = map.get('entity_type')
        self.entity_url = map.get('entity_url')
        return self


class UpdateBaasPlusBaicorpInternalsearchlibraryResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, custom_id=None, update_desc=None,
                 update_result=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.custom_id = custom_id
        self.update_desc = update_desc
        self.update_result = update_result

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['custom_id'] = self.custom_id
        result['update_desc'] = self.update_desc
        result['update_result'] = self.update_result
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.custom_id = map.get('custom_id')
        self.update_desc = map.get('update_desc')
        self.update_result = map.get('update_result')
        return self


class QueryBaasPlusEpayauthRootbankRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bank_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bank_name = bank_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bank_name'] = self.bank_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bank_name = map.get('bank_name')
        return self


class QueryBaasPlusEpayauthRootbankResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, bank_details=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.bank_details = bank_details

    def validate(self):
        if self.bank_details:
            for k in self.bank_details:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['bank_details'] = []
        if self.bank_details is not None:
            for k in self.bank_details:
                result['bank_details'].append(k.to_map() if k else None)
        else:
            result['bank_details'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.bank_details = []
        if map.get('bank_details') is not None:
            for k in map.get('bank_details'):
                temp_model = Institution()
                temp_model = temp_model.from_map(k)
                self.bank_details.append(temp_model)
        else:
            self.bank_details = None
        return self


class QueryBaasPlusYdapplyprotEcapplyRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_no=None, mobile=None,
                 user_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.cert_no = cert_no
        self.mobile = mobile
        self.user_name = user_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_no'] = self.cert_no
        result['mobile'] = self.mobile
        result['user_name'] = self.user_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_no = map.get('cert_no')
        self.mobile = map.get('mobile')
        self.user_name = map.get('user_name')
        return self


class QueryBaasPlusYdapplyprotEcapplyResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, decision=None, passed=None, score=None,
                 strategies=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.decision = decision
        self.passed = passed
        self.score = score
        self.strategies = strategies

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['decision'] = self.decision
        result['passed'] = self.passed
        result['score'] = self.score
        result['strategies'] = []
        if self.strategies is not None:
            for k in self.strategies:
                result['strategies'].append(k)
        else:
            result['strategies'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.decision = map.get('decision')
        self.passed = map.get('passed')
        self.score = map.get('score')
        self.strategies = []
        if map.get('strategies') is not None:
            for k in map.get('strategies'):
                self.strategies.append(k)
        else:
            self.strategies = None
        return self


class QueryBaasPlusYdpacprotEcpacRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, mobile=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.mobile = mobile

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['mobile'] = self.mobile
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.mobile = map.get('mobile')
        return self


class QueryBaasPlusYdpacprotEcpacResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, decision=None, passed=None, score=None,
                 strategies=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.decision = decision
        self.passed = passed
        self.score = score
        self.strategies = strategies

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['decision'] = self.decision
        result['passed'] = self.passed
        result['score'] = self.score
        result['strategies'] = []
        if self.strategies is not None:
            for k in self.strategies:
                result['strategies'].append(k)
        else:
            result['strategies'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.decision = map.get('decision')
        self.passed = map.get('passed')
        self.score = map.get('score')
        self.strategies = []
        if map.get('strategies') is not None:
            for k in map.get('strategies'):
                self.strategies.append(k)
        else:
            self.strategies = None
        return self


class QueryBaasPlusYdauthprotTwometaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_no=None, user_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.cert_no = cert_no
        self.user_name = user_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_no'] = self.cert_no
        result['user_name'] = self.user_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_no = map.get('cert_no')
        self.user_name = map.get('user_name')
        return self


class QueryBaasPlusYdauthprotTwometaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, decision=None, passed=None, score=None,
                 strategies=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.decision = decision
        self.passed = passed
        self.score = score
        self.strategies = strategies

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['decision'] = self.decision
        result['passed'] = self.passed
        result['score'] = self.score
        result['strategies'] = []
        if self.strategies is not None:
            for k in self.strategies:
                result['strategies'].append(k)
        else:
            result['strategies'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.decision = map.get('decision')
        self.passed = map.get('passed')
        self.score = map.get('score')
        self.strategies = []
        if map.get('strategies') is not None:
            for k in map.get('strategies'):
                self.strategies.append(k)
        else:
            self.strategies = None
        return self


class QueryBaasPlusYdauthprotThreemetaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_no=None, mobile=None,
                 user_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.cert_no = cert_no
        self.mobile = mobile
        self.user_name = user_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_no'] = self.cert_no
        result['mobile'] = self.mobile
        result['user_name'] = self.user_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_no = map.get('cert_no')
        self.mobile = map.get('mobile')
        self.user_name = map.get('user_name')
        return self


class QueryBaasPlusYdauthprotThreemetaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, decision=None, passed=None, score=None,
                 strategies=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.decision = decision
        self.passed = passed
        self.score = score
        self.strategies = strategies

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['decision'] = self.decision
        result['passed'] = self.passed
        result['score'] = self.score
        result['strategies'] = []
        if self.strategies is not None:
            for k in self.strategies:
                result['strategies'].append(k)
        else:
            result['strategies'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.decision = map.get('decision')
        self.passed = map.get('passed')
        self.score = map.get('score')
        self.strategies = []
        if map.get('strategies') is not None:
            for k in map.get('strategies'):
                self.strategies.append(k)
        else:
            self.strategies = None
        return self


class QueryBaasPlusYdauthprotFourmetaRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, card_no=None, cert_no=None,
                 mobile=None, user_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.card_no = card_no
        self.cert_no = cert_no
        self.mobile = mobile
        self.user_name = user_name

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['card_no'] = self.card_no
        result['cert_no'] = self.cert_no
        result['mobile'] = self.mobile
        result['user_name'] = self.user_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.card_no = map.get('card_no')
        self.cert_no = map.get('cert_no')
        self.mobile = map.get('mobile')
        self.user_name = map.get('user_name')
        return self


class QueryBaasPlusYdauthprotFourmetaResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, decision=None, passed=None, score=None,
                 strategies=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.decision = decision
        self.passed = passed
        self.score = score
        self.strategies = strategies

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['decision'] = self.decision
        result['passed'] = self.passed
        result['score'] = self.score
        result['strategies'] = []
        if self.strategies is not None:
            for k in self.strategies:
                result['strategies'].append(k)
        else:
            result['strategies'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.decision = map.get('decision')
        self.passed = map.get('passed')
        self.score = map.get('score')
        self.strategies = []
        if map.get('strategies') is not None:
            for k in map.get('strategies'):
                self.strategies.append(k)
        else:
            self.strategies = None
        return self


class QueryBaasPlusYdmktprotEcmarketcampaignRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, mobile=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.mobile = mobile

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['mobile'] = self.mobile
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.mobile = map.get('mobile')
        return self


class QueryBaasPlusYdmktprotEcmarketcampaignResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, decision=None, passed=None, score=None,
                 strategies=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.decision = decision
        self.passed = passed
        self.score = score
        self.strategies = strategies

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['decision'] = self.decision
        result['passed'] = self.passed
        result['score'] = self.score
        result['strategies'] = []
        if self.strategies is not None:
            for k in self.strategies:
                result['strategies'].append(k)
        else:
            result['strategies'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.decision = map.get('decision')
        self.passed = map.get('passed')
        self.score = map.get('score')
        self.strategies = []
        if map.get('strategies') is not None:
            for k in map.get('strategies'):
                self.strategies.append(k)
        else:
            self.strategies = None
        return self


class QueryBaasPlusYdregprotEcregisterRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, mobile=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.mobile = mobile

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['mobile'] = self.mobile
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.mobile = map.get('mobile')
        return self


class QueryBaasPlusYdregprotEcregisterResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, decision=None, passed=None, score=None,
                 strategies=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.decision = decision
        self.passed = passed
        self.score = score
        self.strategies = strategies

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['decision'] = self.decision
        result['passed'] = self.passed
        result['score'] = self.score
        result['strategies'] = []
        if self.strategies is not None:
            for k in self.strategies:
                result['strategies'].append(k)
        else:
            result['strategies'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.decision = map.get('decision')
        self.passed = map.get('passed')
        self.score = map.get('score')
        self.strategies = []
        if map.get('strategies') is not None:
            for k in map.get('strategies'):
                self.strategies.append(k)
        else:
            self.strategies = None
        return self


class QueryBaasPlusEpayauthBranchbankRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bank_name=None,
                 district_code=None, root_bank_code=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bank_name = bank_name
        self.district_code = district_code
        self.root_bank_code = root_bank_code

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bank_name'] = self.bank_name
        result['district_code'] = self.district_code
        result['root_bank_code'] = self.root_bank_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bank_name = map.get('bank_name')
        self.district_code = map.get('district_code')
        self.root_bank_code = map.get('root_bank_code')
        return self


class QueryBaasPlusEpayauthBranchbankResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, bank_details=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.bank_details = bank_details

    def validate(self):
        if self.bank_details:
            for k in self.bank_details:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['bank_details'] = []
        if self.bank_details is not None:
            for k in self.bank_details:
                result['bank_details'].append(k.to_map() if k else None)
        else:
            result['bank_details'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.bank_details = []
        if map.get('bank_details') is not None:
            for k in map.get('bank_details'):
                temp_model = Institution()
                temp_model = temp_model.from_map(k)
                self.bank_details.append(temp_model)
        else:
            self.bank_details = None
        return self


class QueryBaasPlusEpayauthDistrictRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, parent_code=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.parent_code = parent_code

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['parent_code'] = self.parent_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.parent_code = map.get('parent_code')
        return self


class QueryBaasPlusEpayauthDistrictResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, district_details=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.district_details = district_details

    def validate(self):
        if self.district_details:
            for k in self.district_details:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['district_details'] = []
        if self.district_details is not None:
            for k in self.district_details:
                result['district_details'].append(k.to_map() if k else None)
        else:
            result['district_details'] = None
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.district_details = []
        if map.get('district_details') is not None:
            for k in map.get('district_details'):
                temp_model = Institution()
                temp_model = temp_model.from_map(k)
                self.district_details.append(temp_model)
        else:
            self.district_details = None
        return self


class InitBaasPlusEpayauthVerifyRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bank_card_no=None,
                 bank_code=None, callback_url=None, ep_cert_name=None, ep_cert_no=None, legal_person_cert_name=None,
                 legal_person_cert_no=None, mobile=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bank_card_no = bank_card_no
        self.bank_code = bank_code
        self.callback_url = callback_url
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no
        self.legal_person_cert_name = legal_person_cert_name
        self.legal_person_cert_no = legal_person_cert_no
        self.mobile = mobile

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bank_card_no'] = self.bank_card_no
        result['bank_code'] = self.bank_code
        result['callback_url'] = self.callback_url
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        result['mobile'] = self.mobile
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bank_card_no = map.get('bank_card_no')
        self.bank_code = map.get('bank_code')
        self.callback_url = map.get('callback_url')
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        self.mobile = map.get('mobile')
        return self


class InitBaasPlusEpayauthVerifyResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, verify_id=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.verify_id = verify_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['verify_id'] = self.verify_id
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.verify_id = map.get('verify_id')
        return self


class QueryBaasPlusEpayauthVerifyRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, amount=None, currency=None,
                 verify_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.amount = amount
        self.currency = currency
        self.verify_id = verify_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['amount'] = self.amount
        result['currency'] = self.currency
        result['verify_id'] = self.verify_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.amount = map.get('amount')
        self.currency = map.get('currency')
        self.verify_id = map.get('verify_id')
        return self


class QueryBaasPlusEpayauthVerifyResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, valid=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.valid = valid

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['valid'] = self.valid
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.valid = map.get('valid')
        return self


class QueryBaasPlusBmpbrowserTransactionqrcodeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bizid=None, contract_id=None,
                 hash=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bizid = bizid
        self.contract_id = contract_id
        self.hash = hash

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bizid'] = self.bizid
        result['contract_id'] = self.contract_id
        result['hash'] = self.hash
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bizid = map.get('bizid')
        self.contract_id = map.get('contract_id')
        self.hash = map.get('hash')
        return self


class QueryBaasPlusBmpbrowserTransactionqrcodeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, qr_code_download_url=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.qr_code_download_url = qr_code_download_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['qr_code_download_url'] = self.qr_code_download_url
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.qr_code_download_url = map.get('qr_code_download_url')
        return self


class AddBaasPlusBmpbrowserPrivilegeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bizid=None, phone_numbers=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bizid = bizid
        self.phone_numbers = phone_numbers

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bizid'] = self.bizid
        result['phone_numbers'] = self.phone_numbers
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bizid = map.get('bizid')
        self.phone_numbers = map.get('phone_numbers')
        return self


class AddBaasPlusBmpbrowserPrivilegeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, status=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.status = status

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


class QueryBaasPlusIdcocrIdcardRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, image_content=None, side=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.image_content = image_content
        self.side = side

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['image_content'] = self.image_content
        result['side'] = self.side
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.image_content = map.get('image_content')
        self.side = map.get('side')
        return self


class QueryBaasPlusIdcocrIdcardResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, address=None, birth=None, end_date=None,
                 error_content=None, issue=None, nationality=None, num=None, sex=None, start_date=None, success=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.address = address
        self.birth = birth
        self.end_date = end_date
        self.error_content = error_content
        self.issue = issue
        self.nationality = nationality
        self.num = num
        self.sex = sex
        self.start_date = start_date
        self.success = success

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['address'] = self.address
        result['birth'] = self.birth
        result['end_date'] = self.end_date
        result['error_content'] = self.error_content
        result['issue'] = self.issue
        result['nationality'] = self.nationality
        result['num'] = self.num
        result['sex'] = self.sex
        result['start_date'] = self.start_date
        result['success'] = self.success
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.address = map.get('address')
        self.birth = map.get('birth')
        self.end_date = map.get('end_date')
        self.error_content = map.get('error_content')
        self.issue = map.get('issue')
        self.nationality = map.get('nationality')
        self.num = map.get('num')
        self.sex = map.get('sex')
        self.start_date = map.get('start_date')
        self.success = map.get('success')
        return self


class InitBaasPlusCaCertificateRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_uuid=None, command=None,
                 config_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_uuid = biz_uuid
        self.command = command
        self.config_id = config_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_uuid'] = self.biz_uuid
        result['command'] = self.command
        result['config_id'] = self.config_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_uuid = map.get('biz_uuid')
        self.command = map.get('command')
        self.config_id = map.get('config_id')
        return self


class InitBaasPlusCaCertificateResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, cert_sn=None, p_10=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.cert_sn = cert_sn
        self.p_10 = p_10

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['cert_sn'] = self.cert_sn
        result['p10'] = self.p_10
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.cert_sn = map.get('cert_sn')
        self.p_10 = map.get('p10')
        return self


class InitBaasPlusContentriskInternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, account_id=None,
                 audio_urls=None, biz_info=None, link_urls=None, picture_urls=None, scene_code=None, text=None, video_urls=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.account_id = account_id
        self.audio_urls = audio_urls
        self.biz_info = biz_info
        self.link_urls = link_urls
        self.picture_urls = picture_urls
        self.scene_code = scene_code
        self.text = text
        self.video_urls = video_urls

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['account_id'] = self.account_id
        result['audio_urls'] = self.audio_urls
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['link_urls'] = self.link_urls
        result['picture_urls'] = self.picture_urls
        result['scene_code'] = self.scene_code
        result['text'] = self.text
        result['video_urls'] = self.video_urls
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.account_id = map.get('account_id')
        self.audio_urls = map.get('audio_urls')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.link_urls = map.get('link_urls')
        self.picture_urls = map.get('picture_urls')
        self.scene_code = map.get('scene_code')
        self.text = map.get('text')
        self.video_urls = map.get('video_urls')
        return self


class InitBaasPlusContentriskInternalResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, app_scene_data_id=None, event_id=None,
                 hit_detect_items=None, need_query=None, result_action=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.app_scene_data_id = app_scene_data_id
        self.event_id = event_id
        self.hit_detect_items = hit_detect_items
        self.need_query = need_query
        self.result_action = result_action

    def validate(self):
        if self.hit_detect_items:
            for k in self.hit_detect_items:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['app_scene_data_id'] = self.app_scene_data_id
        result['event_id'] = self.event_id
        result['hit_detect_items'] = []
        if self.hit_detect_items is not None:
            for k in self.hit_detect_items:
                result['hit_detect_items'].append(k.to_map() if k else None)
        else:
            result['hit_detect_items'] = None
        result['need_query'] = self.need_query
        result['result_action'] = self.result_action
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.app_scene_data_id = map.get('app_scene_data_id')
        self.event_id = map.get('event_id')
        self.hit_detect_items = []
        if map.get('hit_detect_items') is not None:
            for k in map.get('hit_detect_items'):
                temp_model = HitDetectItems()
                temp_model = temp_model.from_map(k)
                self.hit_detect_items.append(temp_model)
        else:
            self.hit_detect_items = None
        self.need_query = map.get('need_query')
        self.result_action = map.get('result_action')
        return self


class QueryBaasPlusContentriskInternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, app_scene_data_id=None,
                 biz_info=None, event_id=None, scene_code=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.app_scene_data_id = app_scene_data_id
        self.biz_info = biz_info
        self.event_id = event_id
        self.scene_code = scene_code

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['app_scene_data_id'] = self.app_scene_data_id
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['event_id'] = self.event_id
        result['scene_code'] = self.scene_code
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.app_scene_data_id = map.get('app_scene_data_id')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.event_id = map.get('event_id')
        self.scene_code = map.get('scene_code')
        return self


class QueryBaasPlusContentriskInternalResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, hit_detect_items=None,
                 result_action=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.hit_detect_items = hit_detect_items
        self.result_action = result_action

    def validate(self):
        if self.hit_detect_items:
            for k in self.hit_detect_items:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['hit_detect_items'] = []
        if self.hit_detect_items is not None:
            for k in self.hit_detect_items:
                result['hit_detect_items'].append(k.to_map() if k else None)
        else:
            result['hit_detect_items'] = None
        result['result_action'] = self.result_action
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.hit_detect_items = []
        if map.get('hit_detect_items') is not None:
            for k in map.get('hit_detect_items'):
                temp_model = HitDetectItems()
                temp_model = temp_model.from_map(k)
                self.hit_detect_items.append(temp_model)
        else:
            self.hit_detect_items = None
        self.result_action = map.get('result_action')
        return self


class InitBaasPlusIndividualidImageauthRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, cert_name=None, cert_no=None,
                 encoded_facial_picture_front=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.cert_name = cert_name
        self.cert_no = cert_no
        self.encoded_facial_picture_front = encoded_facial_picture_front

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['cert_name'] = self.cert_name
        result['cert_no'] = self.cert_no
        result['encoded_facial_picture_front'] = self.encoded_facial_picture_front
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.cert_name = map.get('cert_name')
        self.cert_no = map.get('cert_no')
        self.encoded_facial_picture_front = map.get('encoded_facial_picture_front')
        return self


class InitBaasPlusIndividualidImageauthResponse(TeaModel):
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


class AddBaasPlusIotcseAccountRequest(TeaModel):
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


class AddBaasPlusIotcseAccountResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class SaveBaasPlusIotcseEvidenceRequest(TeaModel):
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


class SaveBaasPlusIotcseEvidenceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class QueryBaasPlusIotcseEvidenceRequest(TeaModel):
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


class QueryBaasPlusIotcseEvidenceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class CreateBaasPlusDidCorporatedidagentRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, extension_info=None,
                 indexs=None, owner_name=None, owner_uid=None, services=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.extension_info = extension_info
        self.indexs = indexs
        self.owner_name = owner_name
        self.owner_uid = owner_uid
        self.services = services

    def validate(self):
        if self.services:
            for k in self.services:
                if k:
                    k.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['extension_info'] = self.extension_info
        result['indexs'] = []
        if self.indexs is not None:
            for k in self.indexs:
                result['indexs'].append(k)
        else:
            result['indexs'] = None
        result['owner_name'] = self.owner_name
        result['owner_uid'] = self.owner_uid
        result['services'] = []
        if self.services is not None:
            for k in self.services:
                result['services'].append(k.to_map() if k else None)
        else:
            result['services'] = None
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.extension_info = map.get('extension_info')
        self.indexs = []
        if map.get('indexs') is not None:
            for k in map.get('indexs'):
                self.indexs.append(k)
        else:
            self.indexs = None
        self.owner_name = map.get('owner_name')
        self.owner_uid = map.get('owner_uid')
        self.services = []
        if map.get('services') is not None:
            for k in map.get('services'):
                temp_model = DidDocServicesInfo()
                temp_model = temp_model.from_map(k)
                self.services.append(temp_model)
        else:
            self.services = None
        return self


class CreateBaasPlusDidCorporatedidagentResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, did=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.did = did

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


class InitBaasPlusIndividualidFaceauthinternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_code=None, biz_info=None,
                 cert_name=None, cert_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_code = biz_code
        self.biz_info = biz_info
        self.cert_name = cert_name
        self.cert_no = cert_no

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['biz_code'] = self.biz_code
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['cert_name'] = self.cert_name
        result['cert_no'] = self.cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.biz_code = map.get('biz_code')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.cert_name = map.get('cert_name')
        self.cert_no = map.get('cert_no')
        return self


class InitBaasPlusIndividualidFaceauthinternalResponse(TeaModel):
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


class CertifyBaasPlusIndividualidFaceauthinternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None,
                 callback_url=None, certify_id=None, redirect_url=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.callback_url = callback_url
        self.certify_id = certify_id
        self.redirect_url = redirect_url

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['callback_url'] = self.callback_url
        result['certify_id'] = self.certify_id
        result['redirect_url'] = self.redirect_url
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.callback_url = map.get('callback_url')
        self.certify_id = map.get('certify_id')
        self.redirect_url = map.get('redirect_url')
        return self


class CertifyBaasPlusIndividualidFaceauthinternalResponse(TeaModel):
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


class QueryBaasPlusIndividualidFaceauthinternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None, certify_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.certify_id = certify_id

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['certify_id'] = self.certify_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.certify_id = map.get('certify_id')
        return self


class QueryBaasPlusIndividualidFaceauthinternalResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, certify_id=None, finished=None,
                 passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.certify_id = certify_id
        self.finished = finished
        self.passed = passed

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['certify_id'] = self.certify_id
        result['finished'] = self.finished
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.certify_id = map.get('certify_id')
        self.finished = map.get('finished')
        self.passed = map.get('passed')
        return self


class InitBaasPlusEnterpriseidFaceauthinternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None,
                 ep_cert_name=None, ep_cert_no=None, ep_cert_type=None, legal_person_cert_name=None, legal_person_cert_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no
        self.ep_cert_type = ep_cert_type
        self.legal_person_cert_name = legal_person_cert_name
        self.legal_person_cert_no = legal_person_cert_no

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
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
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.ep_cert_type = map.get('ep_cert_type')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        return self


class InitBaasPlusEnterpriseidFaceauthinternalResponse(TeaModel):
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


class CertifyBaasPlusEnterpriseidFaceauthinternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None, biz_no=None,
                 callback_url=None, redirect_url=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.biz_no = biz_no
        self.callback_url = callback_url
        self.redirect_url = redirect_url

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['biz_no'] = self.biz_no
        result['callback_url'] = self.callback_url
        result['redirect_url'] = self.redirect_url
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.biz_no = map.get('biz_no')
        self.callback_url = map.get('callback_url')
        self.redirect_url = map.get('redirect_url')
        return self


class CertifyBaasPlusEnterpriseidFaceauthinternalResponse(TeaModel):
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


class QueryBaasPlusEverifyTwometainternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None,
                 ep_cert_name=None, ep_cert_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        return self


class QueryBaasPlusEverifyTwometainternalResponse(TeaModel):
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


class QueryBaasPlusEverifyThreemetainternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None,
                 ep_cert_name=None, ep_cert_no=None, legal_person_cert_name=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no
        self.legal_person_cert_name = legal_person_cert_name

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['legal_person_cert_name'] = self.legal_person_cert_name
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        return self


class QueryBaasPlusEverifyThreemetainternalResponse(TeaModel):
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


class QueryBaasPlusEverifyFourmetainternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None,
                 ep_cert_name=None, ep_cert_no=None, legal_person_cert_name=None, legal_person_cert_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.ep_cert_name = ep_cert_name
        self.ep_cert_no = ep_cert_no
        self.legal_person_cert_name = legal_person_cert_name
        self.legal_person_cert_no = legal_person_cert_no

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['ep_cert_name'] = self.ep_cert_name
        result['ep_cert_no'] = self.ep_cert_no
        result['legal_person_cert_name'] = self.legal_person_cert_name
        result['legal_person_cert_no'] = self.legal_person_cert_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.ep_cert_name = map.get('ep_cert_name')
        self.ep_cert_no = map.get('ep_cert_no')
        self.legal_person_cert_name = map.get('legal_person_cert_name')
        self.legal_person_cert_no = map.get('legal_person_cert_no')
        return self


class QueryBaasPlusEverifyFourmetainternalResponse(TeaModel):
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


class QueryBaasPlusEnterpriseidFaceauthinternalRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, biz_info=None, biz_no=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.biz_info = biz_info
        self.biz_no = biz_no

    def validate(self):
        if self.biz_info:
            self.biz_info.validate()

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info.to_map()
        else:
            result['biz_info'] = None
        result['biz_no'] = self.biz_no
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        if map.get('biz_info') is not None:
            temp_model = BizInfo()
            self.biz_info = temp_model.from_map(map['biz_info'])
        else:
            self.biz_info = None
        self.biz_no = map.get('biz_no')
        return self


class QueryBaasPlusEnterpriseidFaceauthinternalResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, biz_no=None, failed_code=None,
                 failed_message=None, passed=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.biz_no = biz_no
        self.failed_code = failed_code
        self.failed_message = failed_message
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
        result['failed_message'] = self.failed_message
        result['passed'] = self.passed
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.biz_no = map.get('biz_no')
        self.failed_code = map.get('failed_code')
        self.failed_message = map.get('failed_message')
        self.passed = map.get('passed')
        return self


class AddBaasPlusIotcseThingsdidRequest(TeaModel):
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


class AddBaasPlusIotcseThingsdidResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class UpdateBaasPlusIotcseThingsdidRequest(TeaModel):
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


class UpdateBaasPlusIotcseThingsdidResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class QueryBaasPlusIotcseThingsdidRequest(TeaModel):
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


class QueryBaasPlusIotcseThingsdidResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class QueryBaasPlusIotcseAsyncprocessRequest(TeaModel):
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


class QueryBaasPlusIotcseAsyncprocessResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class ExecBaasPlusIotcseGroupRequest(TeaModel):
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


class ExecBaasPlusIotcseGroupResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class QueryBaasPlusIotcseGroupdeviceRequest(TeaModel):
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


class QueryBaasPlusIotcseGroupdeviceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class QueryBaasPlusIotcseDevicegroupRequest(TeaModel):
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


class QueryBaasPlusIotcseDevicegroupResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class QueryBaasPlusIotcseTenantdeviceRequest(TeaModel):
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


class QueryBaasPlusIotcseTenantdeviceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class UpdateBaasPlusIotcseDevicestatusRequest(TeaModel):
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


class UpdateBaasPlusIotcseDevicestatusResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class QueryBaasPlusIotcseDevicemodelRequest(TeaModel):
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


class QueryBaasPlusIotcseDevicemodelResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class UpdateBaasPlusIotcseDevicespaceRequest(TeaModel):
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


class UpdateBaasPlusIotcseDevicespaceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class QueryBaasPlusIotcseEvidencebatchRequest(TeaModel):
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


class QueryBaasPlusIotcseEvidencebatchResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, raw_response=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.raw_response = raw_response

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['raw_response'] = self.raw_response
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.raw_response = map.get('raw_response')
        return self


class QueryBaasPlusBlocrBusinesslicenseRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, image_raw=None, image_url=None,
                 source=None, trace_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.image_raw = image_raw
        self.image_url = image_url
        self.source = source
        self.trace_id = trace_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['image_raw'] = self.image_raw
        result['image_url'] = self.image_url
        result['source'] = self.source
        result['trace_id'] = self.trace_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.image_raw = map.get('image_raw')
        self.image_url = map.get('image_url')
        self.source = map.get('source')
        self.trace_id = map.get('trace_id')
        return self


class QueryBaasPlusBlocrBusinesslicenseResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, algo_msg=None, algo_ret=None,
                 message=None, result=None, ret=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.algo_msg = algo_msg
        self.algo_ret = algo_ret
        self.message = message
        self.result = result
        self.ret = ret

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['algo_msg'] = self.algo_msg
        result['algo_ret'] = self.algo_ret
        result['message'] = self.message
        result['result'] = self.result
        result['ret'] = self.ret
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.algo_msg = map.get('algo_msg')
        self.algo_ret = map.get('algo_ret')
        self.message = map.get('message')
        self.result = map.get('result')
        self.ret = map.get('ret')
        return self


class QueryBaasPlusInvoicesocrVatinvoiceRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, file_type=None, image_raw=None,
                 image_url=None, source=None, trace_id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.file_type = file_type
        self.image_raw = image_raw
        self.image_url = image_url
        self.source = source
        self.trace_id = trace_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['file_type'] = self.file_type
        result['image_raw'] = self.image_raw
        result['image_url'] = self.image_url
        result['source'] = self.source
        result['trace_id'] = self.trace_id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.file_type = map.get('file_type')
        self.image_raw = map.get('image_raw')
        self.image_url = map.get('image_url')
        self.source = map.get('source')
        self.trace_id = map.get('trace_id')
        return self


class QueryBaasPlusInvoicesocrVatinvoiceResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, algo_msg=None, algo_ret=None,
                 message=None, result=None, ret=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.algo_msg = algo_msg
        self.algo_ret = algo_ret
        self.message = message
        self.result = result
        self.ret = ret

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['algo_msg'] = self.algo_msg
        result['algo_ret'] = self.algo_ret
        result['message'] = self.message
        result['result'] = self.result
        result['ret'] = self.ret
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.algo_msg = map.get('algo_msg')
        self.algo_ret = map.get('algo_ret')
        self.message = map.get('message')
        self.result = map.get('result')
        self.ret = map.get('ret')
        return self


class QueryBaasPlusBmpbrowserPrivilegeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bizid=None, phone_number=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bizid = bizid
        self.phone_number = phone_number

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bizid'] = self.bizid
        result['phone_number'] = self.phone_number
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bizid = map.get('bizid')
        self.phone_number = map.get('phone_number')
        return self


class QueryBaasPlusBmpbrowserPrivilegeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, status=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.status = status

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


class CancelBaasPlusBmpbrowserPrivilegeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, bizid=None, phone_numbers=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.bizid = bizid
        self.phone_numbers = phone_numbers

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['bizid'] = self.bizid
        result['phone_numbers'] = self.phone_numbers
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.bizid = map.get('bizid')
        self.phone_numbers = map.get('phone_numbers')
        return self


class CancelBaasPlusBmpbrowserPrivilegeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, status=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.status = status

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
