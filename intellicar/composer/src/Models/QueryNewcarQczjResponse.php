<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class QueryNewcarQczjResponse extends Model
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

    // 0代表成功，其余代表失败
    /**
     * @var string
     */
    public $returncode;

    // 失败时错误消息
    /**
     * @var string
     */
    public $message;

    // 城市结果结构体
    /**
     * @var CityResult[]
     */
    public $cityResult;

    // 车型结果结构体
    /**
     * @var SpecResult
     */
    public $specResult;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'returncode' => 'returncode',
        'message'    => 'message',
        'cityResult' => 'city_result',
        'specResult' => 'spec_result',
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
        if (null !== $this->returncode) {
            $res['returncode'] = $this->returncode;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->cityResult) {
            $res['city_result'] = [];
            if (null !== $this->cityResult && \is_array($this->cityResult)) {
                $n = 0;
                foreach ($this->cityResult as $item) {
                    $res['city_result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->specResult) {
            $res['spec_result'] = null !== $this->specResult ? $this->specResult->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNewcarQczjResponse
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
        if (isset($map['returncode'])) {
            $model->returncode = $map['returncode'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['city_result'])) {
            if (!empty($map['city_result'])) {
                $model->cityResult = [];
                $n                 = 0;
                foreach ($map['city_result'] as $item) {
                    $model->cityResult[$n++] = null !== $item ? CityResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['spec_result'])) {
            $model->specResult = SpecResult::fromMap($map['spec_result']);
        }

        return $model;
    }
}
