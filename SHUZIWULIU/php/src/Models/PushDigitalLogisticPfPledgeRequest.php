<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PushDigitalLogisticPfPledgeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'billId' => 'bill_id',
        'financingSubjectDid' => 'financing_subject_did',
        'requestNo' => 'request_no',
    ];
    public function validate() {
        Model::validateMaxLength('billId', $this->billId, 128);
        Model::validateMaxLength('financingSubjectDid', $this->financingSubjectDid, 128);
        Model::validateMaxLength('requestNo', $this->requestNo, 32);
        Model::validateMinLength('billId', $this->billId, 1);
        Model::validateMinLength('financingSubjectDid', $this->financingSubjectDid, 1);
        Model::validateMinLength('requestNo', $this->requestNo, 16);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->billId) {
            $res['bill_id'] = $this->billId;
        }
        if (null !== $this->financingSubjectDid) {
            $res['financing_subject_did'] = $this->financingSubjectDid;
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushDigitalLogisticPfPledgeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['bill_id'])){
            $model->billId = $map['bill_id'];
        }
        if(isset($map['financing_subject_did'])){
            $model->financingSubjectDid = $map['financing_subject_did'];
        }
        if(isset($map['request_no'])){
            $model->requestNo = $map['request_no'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 账单标识
    /**
     * @var string
     */
    public $billId;

    // 融资主体did
    /**
     * @var string
     */
    public $financingSubjectDid;

    // 请求号；以yyyyMMdd 时间串开头的32位字符串；该字符串需要保持请求系统内唯一，系统会以该请求号作为幂等处理
    /**
     * @var string
     */
    public $requestNo;

}
