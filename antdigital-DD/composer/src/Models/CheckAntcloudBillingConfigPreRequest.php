<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\FeeConfEntityVO;

class CheckAntcloudBillingConfigPreRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'newFeeConfig' => 'new_fee_config',
        'bizNo' => 'biz_no',
    ];
    public function validate() {
        Model::validateRequired('newFeeConfig', $this->newFeeConfig, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->newFeeConfig) {
            $res['new_fee_config'] = null !== $this->newFeeConfig ? $this->newFeeConfig->toMap() : null;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CheckAntcloudBillingConfigPreRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['new_fee_config'])){
            $model->newFeeConfig = FeeConfEntityVO::fromMap($map['new_fee_config']);
        }
        if(isset($map['biz_no'])){
            $model->bizNo = $map['biz_no'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 配置字符串
    /**
     * @var FeeConfEntityVO
     */
    public $newFeeConfig;

    // 请求单号
    /**
     * @var string
     */
    public $bizNo;

}
