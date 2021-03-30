<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DocumentInfo extends Model
{
    // 文档Id
    /**
     * @example documentId
     *
     * @var string
     */
    public $documentId;

    // 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
    /**
     * @example CONTRACT
     *
     * @var string
     */
    public $fileType;

    // 文档名
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 存证哈希
    /**
     * @example txHash
     *
     * @var string
     */
    public $txHash;

    // 存证时间
    /**
     * @example txTime
     *
     * @var int
     */
    public $txTime;

    // 文件Url
    /**
     * @example url
     *
     * @var string
     */
    public $url;
    protected $_name = [
        'documentId' => 'document_id',
        'fileType'   => 'file_type',
        'name'       => 'name',
        'txHash'     => 'tx_hash',
        'txTime'     => 'tx_time',
        'url'        => 'url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->documentId) {
            $res['document_id'] = $this->documentId;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txTime) {
            $res['tx_time'] = $this->txTime;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DocumentInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['document_id'])) {
            $model->documentId = $map['document_id'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_time'])) {
            $model->txTime = $map['tx_time'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }

        return $model;
    }
}
