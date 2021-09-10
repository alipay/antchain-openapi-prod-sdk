<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class Document extends Model
{
    // 文档url
    /**
     * @example https://www.baidu.com/s?wd=图片&rsv_spt=1&rsv_iqid=0xb
     *
     * @var string
     */
    public $documentUrl;

    // 文档名称
    /**
     * @example 客诉材料
     *
     * @var string
     */
    public $documentName;
    protected $_name = [
        'documentUrl'  => 'document_url',
        'documentName' => 'document_name',
    ];

    public function validate()
    {
        Model::validateRequired('documentUrl', $this->documentUrl, true);
        Model::validateRequired('documentName', $this->documentName, true);
        Model::validateMaxLength('documentUrl', $this->documentUrl, 500);
        Model::validateMaxLength('documentName', $this->documentName, 200);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->documentUrl) {
            $res['document_url'] = $this->documentUrl;
        }
        if (null !== $this->documentName) {
            $res['document_name'] = $this->documentName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Document
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['document_url'])) {
            $model->documentUrl = $map['document_url'];
        }
        if (isset($map['document_name'])) {
            $model->documentName = $map['document_name'];
        }

        return $model;
    }
}
