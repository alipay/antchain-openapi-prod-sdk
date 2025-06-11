<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateScreenshotNewRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 取证名称（最长128个字符）
    /**
     * @var string
     */
    public $name;

    // 取证备注（最长512个字符）
    /**
     * @var string
     */
    public $memo;

    // 取证地址（最长2048个字符）
    /**
     * @var string
     */
    public $url;

    // 公证处Id
    /**
     * @var string
     */
    public $orgId;

    // 取证人证件名称
    /**
     * @var string
     */
    public $certName;

    // 取证人证件号码
    /**
     * @var string
     */
    public $certNo;

    // 取证人证件类型
    /**
     * @var string
     */
    public $certType;

    // 法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
    /**
     * @var string
     */
    public $legalPersonName;

    // 法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
    /**
     * @var string
     */
    public $legalPersonNo;

    // 法人证件类型
    /**
     * @var string
     */
    public $legalPersonType;

    // 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
    /**
     * @var string
     */
    public $agentName;

    // 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
    /**
     * @var string
     */
    public $agentNo;

    // 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
    /**
     * @var string
     */
    public $phoneNum;

    // 代理信息
    /**
     * @var ProxyData
     */
    public $proxyInfo;

    // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'memo'              => 'memo',
        'url'               => 'url',
        'orgId'             => 'org_id',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'certType'          => 'cert_type',
        'legalPersonName'   => 'legal_person_name',
        'legalPersonNo'     => 'legal_person_no',
        'legalPersonType'   => 'legal_person_type',
        'agentName'         => 'agent_name',
        'agentNo'           => 'agent_no',
        'phoneNum'          => 'phone_num',
        'proxyInfo'         => 'proxy_info',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateMaxLength('name', $this->name, 128);
        Model::validateMaxLength('memo', $this->memo, 512);
        Model::validateMaxLength('url', $this->url, 2048);
        Model::validateMaxLength('clientToken', $this->clientToken, 64);
        Model::validateMinLength('name', $this->name, 1);
        Model::validateMinLength('url', $this->url, 8);
        Model::validateMinLength('clientToken', $this->clientToken, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->legalPersonName) {
            $res['legal_person_name'] = $this->legalPersonName;
        }
        if (null !== $this->legalPersonNo) {
            $res['legal_person_no'] = $this->legalPersonNo;
        }
        if (null !== $this->legalPersonType) {
            $res['legal_person_type'] = $this->legalPersonType;
        }
        if (null !== $this->agentName) {
            $res['agent_name'] = $this->agentName;
        }
        if (null !== $this->agentNo) {
            $res['agent_no'] = $this->agentNo;
        }
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }
        if (null !== $this->proxyInfo) {
            $res['proxy_info'] = null !== $this->proxyInfo ? $this->proxyInfo->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateScreenshotNewRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['legal_person_name'])) {
            $model->legalPersonName = $map['legal_person_name'];
        }
        if (isset($map['legal_person_no'])) {
            $model->legalPersonNo = $map['legal_person_no'];
        }
        if (isset($map['legal_person_type'])) {
            $model->legalPersonType = $map['legal_person_type'];
        }
        if (isset($map['agent_name'])) {
            $model->agentName = $map['agent_name'];
        }
        if (isset($map['agent_no'])) {
            $model->agentNo = $map['agent_no'];
        }
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }
        if (isset($map['proxy_info'])) {
            $model->proxyInfo = ProxyData::fromMap($map['proxy_info']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
