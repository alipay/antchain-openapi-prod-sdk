<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\ComboDTO;
use AntChain\DD\Models\ComboItemDTO;

class QueryAntcloudTradeComboOptionsResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'comboDto' => 'combo_dto',
        'comboItemDtos' => 'combo_item_dtos',
        'ruleCheckSuccess' => 'rule_check_success',
        'ruleCheckErrorCode' => 'rule_check_error_code',
        'ruleCheckErrorMessage' => 'rule_check_error_message',
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
        if (null !== $this->comboDto) {
            $res['combo_dto'] = null !== $this->comboDto ? $this->comboDto->toMap() : null;
        }
        if (null !== $this->comboItemDtos) {
            $res['combo_item_dtos'] = [];
            if(null !== $this->comboItemDtos && is_array($this->comboItemDtos)){
                $n = 0;
                foreach($this->comboItemDtos as $item){
                    $res['combo_item_dtos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ruleCheckSuccess) {
            $res['rule_check_success'] = $this->ruleCheckSuccess;
        }
        if (null !== $this->ruleCheckErrorCode) {
            $res['rule_check_error_code'] = $this->ruleCheckErrorCode;
        }
        if (null !== $this->ruleCheckErrorMessage) {
            $res['rule_check_error_message'] = $this->ruleCheckErrorMessage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudTradeComboOptionsResponse
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
        if(isset($map['combo_dto'])){
            $model->comboDto = ComboDTO::fromMap($map['combo_dto']);
        }
        if(isset($map['combo_item_dtos'])){
            if(!empty($map['combo_item_dtos'])){
                $model->comboItemDtos = [];
                $n = 0;
                foreach($map['combo_item_dtos'] as $item) {
                    $model->comboItemDtos[$n++] = null !== $item ? ComboItemDTO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['rule_check_success'])){
            $model->ruleCheckSuccess = $map['rule_check_success'];
        }
        if(isset($map['rule_check_error_code'])){
            $model->ruleCheckErrorCode = $map['rule_check_error_code'];
        }
        if(isset($map['rule_check_error_message'])){
            $model->ruleCheckErrorMessage = $map['rule_check_error_message'];
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

    // 套餐基本信息
    /**
     * @var ComboDTO
     */
    public $comboDto;

    // 套餐内商品信息列表（仅包含当前 OU 下上架的商品）
    /**
     * @var ComboItemDTO[]
     */
    public $comboItemDtos;

    // 售卖规则校验是否通过
    /**
     * @var bool
     */
    public $ruleCheckSuccess;

    // 售卖规则校验失败时的错误码
    /**
     * @var string
     */
    public $ruleCheckErrorCode;

    // 该商品当前不可购买：未完成实名认证
    /**
     * @var string
     */
    public $ruleCheckErrorMessage;

}
