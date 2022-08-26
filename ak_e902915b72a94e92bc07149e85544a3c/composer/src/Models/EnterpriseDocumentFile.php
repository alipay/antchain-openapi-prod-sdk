<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e902915b72a94e92bc07149e85544a3c\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseDocumentFile extends Model
{
    // 文档名称
    /**
     * @example 2022年7月车辆运输数据文件
     *
     * @var string
     */
    public $documentName;

    // 文件地址
    /**
     * @example carbonchain/file/dataentry_document/20211108000220010000000000000356/20211108000220010000000000000356.xlsx
     *
     * @var string
     */
    public $documentAddress;
    protected $_name = [
        'documentName'    => 'document_name',
        'documentAddress' => 'document_address',
    ];

    public function validate()
    {
        Model::validateRequired('documentName', $this->documentName, true);
        Model::validateRequired('documentAddress', $this->documentAddress, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->documentName) {
            $res['document_name'] = $this->documentName;
        }
        if (null !== $this->documentAddress) {
            $res['document_address'] = $this->documentAddress;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseDocumentFile
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['document_name'])) {
            $model->documentName = $map['document_name'];
        }
        if (isset($map['document_address'])) {
            $model->documentAddress = $map['document_address'];
        }

        return $model;
    }
}
