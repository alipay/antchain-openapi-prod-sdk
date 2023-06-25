<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclNotaryInfo extends Model
{
    // 存证类型，
    // 文件 FILE
    // 文本 TEXT
    /**
     * @example FILE
     *
     * @var string
     */
    public $type;

    // 存证内容
    /**
     * @example asd2112123
     *
     * @var string
     */
    public $content;

    // 文件下载链接 类型为文件有值
    /**
     * @example http://oss.com/asdas
     *
     * @var string
     */
    public $fileUrl;

    // 存证内容hash
    /**
     * @example 12321312asdsqwewer12312sd
     *
     * @var string
     */
    public $contentHash;

    // 存证哈希
    /**
     * @example adsawqe12we12312werserqwe
     *
     * @var string
     */
    public $txHash;

    // 存证阶段描述：
    // UPLOAD_PROMISE_FLOW：上传履约流水，
    // UPLOAD_LOGISTIC_INFO：上传物流信息，
    // SIGNED_CONTRACT_FILE：合同签署后文件存证，
    // BCL_ORDER_PROMISING：租赁订单履约中存证，
    /**
     * @example UPLOAD_PROMISE_FLOW
     *
     * @var string
     */
    public $phase;
    protected $_name = [
        'type'        => 'type',
        'content'     => 'content',
        'fileUrl'     => 'file_url',
        'contentHash' => 'content_hash',
        'txHash'      => 'tx_hash',
        'phase'       => 'phase',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('contentHash', $this->contentHash, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('phase', $this->phase, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->contentHash) {
            $res['content_hash'] = $this->contentHash;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclNotaryInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['content_hash'])) {
            $model->contentHash = $map['content_hash'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }

        return $model;
    }
}
