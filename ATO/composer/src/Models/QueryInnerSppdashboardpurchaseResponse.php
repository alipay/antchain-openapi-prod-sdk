<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerSppdashboardpurchaseResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'overview' => 'overview',
        'merchants' => 'merchants',
        'evaluations' => 'evaluations',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->overview) {
            $res['overview'] = $this->overview;
        }
        if (null !== $this->merchants) {
            $res['merchants'] = $this->merchants;
        }
        if (null !== $this->evaluations) {
            $res['evaluations'] = $this->evaluations;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryInnerSppdashboardpurchaseResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['overview'])){
            $model->overview = $map['overview'];
        }
        if(isset($map['merchants'])){
            $model->merchants = $map['merchants'];
        }
        if(isset($map['evaluations'])){
            $model->evaluations = $map['evaluations'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 采买总览（目标/当前/达成率）
    /**
     * @var string
     */
    public $overview;

    // 各商家采购达成卡
    /**
     * @var string
     */
    public $merchants;

    // 商家流量评估（渠道 Top20% + AI 调量）
    /**
     * @var string
     */
    public $evaluations;

}
