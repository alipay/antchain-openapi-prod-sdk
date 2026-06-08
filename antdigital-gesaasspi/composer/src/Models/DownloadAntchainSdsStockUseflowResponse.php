<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class DownloadAntchainSdsStockUseflowResponse extends Model
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

    // 【下载链接】流水文件下载链接，30s内有效
    /**
     * @var string
     */
    public $url;

    // 【核销批次账单文件摘要】默认算法SHA1
    /**
     * @var string
     */
    public $stockUseflowHash;

    // 【核销批次账单记录总条数】记录该批次在该请求日期下的核销记录条数
    /**
     * @var int
     */
    public $stockUseflowCount;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'url'               => 'url',
        'stockUseflowHash'  => 'stock_useflow_hash',
        'stockUseflowCount' => 'stock_useflow_count',
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
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->stockUseflowHash) {
            $res['stock_useflow_hash'] = $this->stockUseflowHash;
        }
        if (null !== $this->stockUseflowCount) {
            $res['stock_useflow_count'] = $this->stockUseflowCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DownloadAntchainSdsStockUseflowResponse
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
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['stock_useflow_hash'])) {
            $model->stockUseflowHash = $map['stock_useflow_hash'];
        }
        if (isset($map['stock_useflow_count'])) {
            $model->stockUseflowCount = $map['stock_useflow_count'];
        }

        return $model;
    }
}
