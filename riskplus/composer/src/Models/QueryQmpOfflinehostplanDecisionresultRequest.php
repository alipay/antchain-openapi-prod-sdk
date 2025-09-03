<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryQmpOfflinehostplanDecisionresultRequest extends Model
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

    // 文件上传时返回的导入id
    /**
     * @var int
     */
    public $importId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'importId'          => 'import_id',
    ];

    public function validate()
    {
        Model::validateRequired('importId', $this->importId, true);
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
        if (null !== $this->importId) {
            $res['import_id'] = $this->importId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQmpOfflinehostplanDecisionresultRequest
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
        if (isset($map['import_id'])) {
            $model->importId = $map['import_id'];
        }

        return $model;
    }
}
