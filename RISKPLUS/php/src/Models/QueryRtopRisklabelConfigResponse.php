<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\RiskLabelConfigInfo;

class QueryRtopRisklabelConfigResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'responseCode' => 'response_code',
        'success' => 'success',
        'tagConfig' => 'tag_config',
        'total' => 'total',
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
        if (null !== $this->responseCode) {
            $res['response_code'] = $this->responseCode;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->tagConfig) {
            $res['tag_config'] = [];
            if(null !== $this->tagConfig && is_array($this->tagConfig)){
                $n = 0;
                foreach($this->tagConfig as $item){
                    $res['tag_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRtopRisklabelConfigResponse
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
        if(isset($map['response_code'])){
            $model->responseCode = $map['response_code'];
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['tag_config'])){
            if(!empty($map['tag_config'])){
                $model->tagConfig = [];
                $n = 0;
                foreach($map['tag_config'] as $item) {
                    $model->tagConfig[$n++] = null !== $item ? RiskLabelConfigInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['total'])){
            $model->total = $map['total'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 返回码
    // 
    /**
     * @var string
     */
    public $responseCode;

    // 是否调用成功
    // 
    /**
     * @var bool
     */
    public $success;

    // 列表
    /**
     * @var RiskLabelConfigInfo[]
     */
    public $tagConfig;

    // 总数
    /**
     * @var int
     */
    public $total;

}
