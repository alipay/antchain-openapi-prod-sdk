<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

use AntChain\STLR\Models\GclLcaModel;

class QueryActiveDataResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'success' => 'success',
        'dataDimension' => 'data_dimension',
        'inputByProcess' => 'input_by_process',
        'processList' => 'process_list',
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
        if (null !== $this->dataDimension) {
            $res['data_dimension'] = $this->dataDimension;
        }
        if (null !== $this->inputByProcess) {
            $res['input_by_process'] = $this->inputByProcess;
        }
        if (null !== $this->processList) {
            $res['process_list'] = [];
            if(null !== $this->processList && is_array($this->processList)){
                $n = 0;
                foreach($this->processList as $item){
                    $res['process_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryActiveDataResponse
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
        if(isset($map['data_dimension'])){
            $model->dataDimension = $map['data_dimension'];
        }
        if(isset($map['input_by_process'])){
            $model->inputByProcess = $map['input_by_process'];
        }
        if(isset($map['process_list'])){
            if(!empty($map['process_list'])){
                $model->processList = [];
                $n = 0;
                foreach($map['process_list'] as $item) {
                    $model->processList[$n++] = null !== $item ? GclLcaModel::fromMap($item) : $item;
                }
            }
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

    // 是否查询成功
    /**
     * @var bool
     */
    public $success;

    // 填报维度
    /**
     * @var string
     */
    public $dataDimension;

    // 是否按照单元过程录入
    /**
     * @var bool
     */
    public $inputByProcess;

    // 过程模型列表
    /**
     * @var GclLcaModel[]
     */
    public $processList;

}
