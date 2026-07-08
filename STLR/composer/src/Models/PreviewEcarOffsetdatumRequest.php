<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class PreviewEcarOffsetdatumRequest extends Model
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

    // 碳普惠项目编码
    /**
     * @var string
     */
    public $projectNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectNo'         => 'project_no',
    ];

    public function validate()
    {
        Model::validateRequired('projectNo', $this->projectNo, true);
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
        if (null !== $this->projectNo) {
            $res['project_no'] = $this->projectNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreviewEcarOffsetdatumRequest
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
        if (isset($map['project_no'])) {
            $model->projectNo = $map['project_no'];
        }

        return $model;
    }
}
