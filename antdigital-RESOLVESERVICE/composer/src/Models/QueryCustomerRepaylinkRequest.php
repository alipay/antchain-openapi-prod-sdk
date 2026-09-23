<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVESERVICE\Models;

use AlibabaCloud\Tea\Model;

class QueryCustomerRepaylinkRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'custNo' => 'cust_no',
        'smsTemplateNo' => 'sms_template_no',
    ];
    public function validate() {
        Model::validateRequired('custNo', $this->custNo, true);
        Model::validateRequired('smsTemplateNo', $this->smsTemplateNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->custNo) {
            $res['cust_no'] = $this->custNo;
        }
        if (null !== $this->smsTemplateNo) {
            $res['sms_template_no'] = $this->smsTemplateNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryCustomerRepaylinkRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['cust_no'])){
            $model->custNo = $map['cust_no'];
        }
        if(isset($map['sms_template_no'])){
            $model->smsTemplateNo = $map['sms_template_no'];
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

    // 客户号
    /**
     * @var string
     */
    public $custNo;

    // 模版编号
    /**
     * @var string
     */
    public $smsTemplateNo;

}
