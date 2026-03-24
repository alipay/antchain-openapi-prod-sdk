<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YDINDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryRetailScoreResponse extends Model
{
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

    // 请求流水号
    /**
     * @var string
     */
    public $transNo;

    // 评分对象
    /**
     * @var RetailScore[]
     */
    public $resultList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'transNo'    => 'trans_no',
        'resultList' => 'result_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->transNo) {
            $res['trans_no'] = $this->transNo;
        }
        if (null !== $this->resultList) {
            $res['result_list'] = [];
            if (null !== $this->resultList && \is_array($this->resultList)) {
                $n = 0;
                foreach ($this->resultList as $item) {
                    $res['result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryRetailScoreResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['trans_no'])) {
            $model->transNo = $map['trans_no'];
        }
        if (isset($map['result_list'])) {
            if (!empty($map['result_list'])) {
                $model->resultList = [];
                $n                 = 0;
                foreach ($map['result_list'] as $item) {
                    $model->resultList[$n++] = null !== $item ? RetailScore::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
