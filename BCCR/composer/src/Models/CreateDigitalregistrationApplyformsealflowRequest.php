<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalregistrationApplyformsealflowRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'digitalRegisterId' => 'digital_register_id',
        'clientToken' => 'client_token',
        'agentCertNo' => 'agent_cert_no',
        'agentCertName' => 'agent_cert_name',
    ];
    public function validate() {
        Model::validateRequired('digitalRegisterId', $this->digitalRegisterId, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->digitalRegisterId) {
            $res['digital_register_id'] = $this->digitalRegisterId;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->agentCertNo) {
            $res['agent_cert_no'] = $this->agentCertNo;
        }
        if (null !== $this->agentCertName) {
            $res['agent_cert_name'] = $this->agentCertName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateDigitalregistrationApplyformsealflowRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['digital_register_id'])){
            $model->digitalRegisterId = $map['digital_register_id'];
        }
        if(isset($map['client_token'])){
            $model->clientToken = $map['client_token'];
        }
        if(isset($map['agent_cert_no'])){
            $model->agentCertNo = $map['agent_cert_no'];
        }
        if(isset($map['agent_cert_name'])){
            $model->agentCertName = $map['agent_cert_name'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 数登ID
    /**
     * @var string
     */
    public $digitalRegisterId;

    // ewrwrwerwr
    /**
     * @var string
     */
    public $clientToken;

    // 签章经办人身份证号（数登申请人是企业的场景下必填）
    /**
     * @var string
     */
    public $agentCertNo;

    // 签章经办人姓名（数登申请人是企业的场景下必填）
    /**
     * @var string
     */
    public $agentCertName;

}
