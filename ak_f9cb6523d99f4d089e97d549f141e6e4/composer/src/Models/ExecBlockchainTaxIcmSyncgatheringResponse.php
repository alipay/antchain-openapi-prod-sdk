<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_f9cb6523d99f4d089e97d549f141e6e4\Models;

use AlibabaCloud\Tea\Model;

class ExecBlockchainTaxIcmSyncgatheringResponse extends Model
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

    // 返回的请求对象jsonString
    /**
     * @var string
     */
    public $bizContent;

    // unix秒时间戳,查询时间，用来对账使用
    /**
     * @var string
     */
    public $queryTime;

    // 返回模式
    /**
     * @var string
     */
    public $returnMode;

    // 返回结果
    /**
     * @var ReturnDetail[]
     */
    public $returnResult;

    // 是否查得
    /**
     * @var bool
     */
    public $nullDataFlag;

    // 参考区块链给出的标准字段定义
    /**
     * @var string
     */
    public $queryType;

    // 是否需要重新授权
    /**
     * @var bool
     */
    public $reauth;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'bizContent'   => 'biz_content',
        'queryTime'    => 'query_time',
        'returnMode'   => 'return_mode',
        'returnResult' => 'return_result',
        'nullDataFlag' => 'null_data_flag',
        'queryType'    => 'query_type',
        'reauth'       => 'reauth',
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
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->queryTime) {
            $res['query_time'] = $this->queryTime;
        }
        if (null !== $this->returnMode) {
            $res['return_mode'] = $this->returnMode;
        }
        if (null !== $this->returnResult) {
            $res['return_result'] = [];
            if (null !== $this->returnResult && \is_array($this->returnResult)) {
                $n = 0;
                foreach ($this->returnResult as $item) {
                    $res['return_result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->nullDataFlag) {
            $res['null_data_flag'] = $this->nullDataFlag;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->reauth) {
            $res['reauth'] = $this->reauth;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecBlockchainTaxIcmSyncgatheringResponse
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
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['query_time'])) {
            $model->queryTime = $map['query_time'];
        }
        if (isset($map['return_mode'])) {
            $model->returnMode = $map['return_mode'];
        }
        if (isset($map['return_result'])) {
            if (!empty($map['return_result'])) {
                $model->returnResult = [];
                $n                   = 0;
                foreach ($map['return_result'] as $item) {
                    $model->returnResult[$n++] = null !== $item ? ReturnDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['null_data_flag'])) {
            $model->nullDataFlag = $map['null_data_flag'];
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }
        if (isset($map['reauth'])) {
            $model->reauth = $map['reauth'];
        }

        return $model;
    }
}
