<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class DownloadLibraryDocRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 知识库ID
    /**
     * @var int
     */
    public $libraryId;

    // 文档ID
    /**
     * @var int
     */
    public $docId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'libraryId'         => 'library_id',
        'docId'             => 'doc_id',
    ];

    public function validate()
    {
        Model::validateRequired('libraryId', $this->libraryId, true);
        Model::validateRequired('docId', $this->docId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->libraryId) {
            $res['library_id'] = $this->libraryId;
        }
        if (null !== $this->docId) {
            $res['doc_id'] = $this->docId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DownloadLibraryDocRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['library_id'])) {
            $model->libraryId = $map['library_id'];
        }
        if (isset($map['doc_id'])) {
            $model->docId = $map['doc_id'];
        }

        return $model;
    }
}
