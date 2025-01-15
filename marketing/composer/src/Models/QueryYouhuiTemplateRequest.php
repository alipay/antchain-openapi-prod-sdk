<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class QueryYouhuiTemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 优惠券模板ID
    /**
     * @var string
     */
    public $youhuiTemplateId;
    protected $_name = [
        'authToken'        => 'auth_token',
        'youhuiTemplateId' => 'youhui_template_id',
    ];

    public function validate()
    {
        Model::validateRequired('youhuiTemplateId', $this->youhuiTemplateId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->youhuiTemplateId) {
            $res['youhui_template_id'] = $this->youhuiTemplateId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryYouhuiTemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['youhui_template_id'])) {
            $model->youhuiTemplateId = $map['youhui_template_id'];
        }

        return $model;
    }
}
