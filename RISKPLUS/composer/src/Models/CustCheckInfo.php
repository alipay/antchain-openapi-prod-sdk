<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustCheckInfo extends Model {
    protected $_name = [
        'signResult' => 'sign_result',
    ];
    public function validate() {
        Model::validateRequired('signResult', $this->signResult, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->signResult) {
            $res['sign_result'] = $this->signResult;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CustCheckInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['sign_result'])){
            $model->signResult = $map['sign_result'];
        }
        return $model;
    }
    // 签约结果,01 - 处理中，02 - 成功，03 失败（当超过链接有效期却还未收到前端给出的跳端成功结果后，会将此次跳端结果设置为失败）
    /**
     * @example 01
     * @var string
     */
    public $signResult;

}
