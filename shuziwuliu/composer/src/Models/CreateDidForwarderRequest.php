<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateDidForwarderRequest extends Model
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

    // 代理did
    /**
     * @var string
     */
    public $agentDid;

    // 企业名称
    /**
     * @var string
     */
    public $epCertName;

    // 企业证件号
    /**
     * @var string
     */
    public $epCertNo;

    // 扩展字段
    /**
     * @var string
     */
    public $extensionInfo;

    // 法人姓名
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 法人身份证号
    /**
     * @var string
     */
    public $legalPersonCertNo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'agentDid'            => 'agent_did',
        'epCertName'          => 'ep_cert_name',
        'epCertNo'            => 'ep_cert_no',
        'extensionInfo'       => 'extension_info',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo'   => 'legal_person_cert_no',
    ];

    public function validate()
    {
        Model::validateRequired('agentDid', $this->agentDid, true);
        Model::validateRequired('epCertName', $this->epCertName, true);
        Model::validateRequired('epCertNo', $this->epCertNo, true);
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
        if (null !== $this->agentDid) {
            $res['agent_did'] = $this->agentDid;
        }
        if (null !== $this->epCertName) {
            $res['ep_cert_name'] = $this->epCertName;
        }
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDidForwarderRequest
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
        if (isset($map['agent_did'])) {
            $model->agentDid = $map['agent_did'];
        }
        if (isset($map['ep_cert_name'])) {
            $model->epCertName = $map['ep_cert_name'];
        }
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }

        return $model;
    }
}
