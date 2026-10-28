<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecAskdataSourceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'columns' => 'columns',
        'rows' => 'rows',
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
        if (null !== $this->columns) {
            $res['columns'] = $this->columns;
        }
        if (null !== $this->rows) {
            $res['rows'] = $this->rows;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAskdataSourceResponse
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
        if(isset($map['columns'])){
            if(!empty($map['columns'])){
                $model->columns = $map['columns'];
            }
        }
        if(isset($map['rows'])){
            if(!empty($map['rows'])){
                $model->rows = $map['rows'];
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

    // 返回字段列表
    /**
     * @var string[]
     */
    public $columns;

    // 返回数据列表
    /**
     * @var string[]
     */
    public $rows;

}
