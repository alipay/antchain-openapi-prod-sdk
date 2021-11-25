<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class ContractDocAddress extends Model
{
    // 电子合同文档ID
    //
    /**
     * @example 电子合同文档ID
     *
     * @var string
     */
    public $fileId;

    // 电子合同文档名称，默认文件名称
    //
    /**
     * @example 电子合同文档名称，默认文件名称
     *
     * @var string
     */
    public $fileName;

    // 电子合同下载文档地址, 有效时间1小时
    //
    /**
     * @example 电子合同下载文档地址, 有效时间1小时
     *
     * @var string
     */
    public $fileUrl;

    // 链上hash
    /**
     * @example 链上hash
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'fileId'   => 'file_id',
        'fileName' => 'file_name',
        'fileUrl'  => 'file_url',
        'txHash'   => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractDocAddress
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
