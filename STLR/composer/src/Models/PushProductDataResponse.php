<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

use AntChain\STLR\Models\GclAbnormalItem;

class PushProductDataResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'success' => 'success',
        'abnormalItemList' => 'abnormal_item_list',
        'successCount' => 'success_count',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->abnormalItemList) {
            $res['abnormal_item_list'] = [];
            if(null !== $this->abnormalItemList && is_array($this->abnormalItemList)){
                $n = 0;
                foreach($this->abnormalItemList as $item){
                    $res['abnormal_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushProductDataResponse
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
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['abnormal_item_list'])){
            if(!empty($map['abnormal_item_list'])){
                $model->abnormalItemList = [];
                $n = 0;
                foreach($map['abnormal_item_list'] as $item) {
                    $model->abnormalItemList[$n++] = null !== $item ? GclAbnormalItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['success_count'])){
            $model->successCount = $map['success_count'];
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

    // 是否填报成功
    /**
     * @var bool
     */
    public $success;

    // 异常明细列表，全部成功时返回为空
    /**
     * @var GclAbnormalItem[]
     */
    public $abnormalItemList;

    // 成功写入明细数
    /**
     * @var int
     */
    public $successCount;

}
