<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVEAGENT\Models;

use AlibabaCloud\Tea\Model;

class ImportTaskRateinfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cusNo' => 'cus_no',
        'loanInfoList' => 'loan_info_list',
    ];
    public function validate() {
        Model::validateRequired('cusNo', $this->cusNo, true);
        Model::validateRequired('loanInfoList', $this->loanInfoList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->cusNo) {
            $res['cus_no'] = $this->cusNo;
        }
        if (null !== $this->loanInfoList) {
            $res['loan_info_list'] = $this->loanInfoList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImportTaskRateinfoRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['cus_no'])){
            $model->cusNo = $map['cus_no'];
        }
        if(isset($map['loan_info_list'])){
            if(!empty($map['loan_info_list'])){
                $model->loanInfoList = $map['loan_info_list'];
            }
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
    public $cusNo;

    // 借据信息
    /**
     * @var string[]
     */
    public $loanInfoList;

}
