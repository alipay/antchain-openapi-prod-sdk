<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class Contract extends Model
{
    // 文件 ID
    /**
     * @example 233232
     *
     * @var string
     */
    public $documentId;

    // 参数指定合同文件名称
    /**
     * @example XX公寓认购合同
     *
     * @var string
     */
    public $contractName;

    // 合同文件的URL下载路径，有效期1小时
    /**
     * @example http://www.download.address.com/dd.png
     *
     * @var string
     */
    public $archivedFileUrl;
    protected $_name = [
        'documentId'      => 'document_id',
        'contractName'    => 'contract_name',
        'archivedFileUrl' => 'archived_file_url',
    ];

    public function validate()
    {
        Model::validateRequired('documentId', $this->documentId, true);
        Model::validateRequired('contractName', $this->contractName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->documentId) {
            $res['document_id'] = $this->documentId;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->archivedFileUrl) {
            $res['archived_file_url'] = $this->archivedFileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Contract
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['document_id'])) {
            $model->documentId = $map['document_id'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['archived_file_url'])) {
            $model->archivedFileUrl = $map['archived_file_url'];
        }

        return $model;
    }
}
