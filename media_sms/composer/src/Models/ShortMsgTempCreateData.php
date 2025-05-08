<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class ShortMsgTempCreateData extends Model
{
    // 普短模板id
    /**
     * @example 202408150005000000019020
     *
     * @var string
     */
    public $templateId;
    protected $_name = [
        'templateId' => 'template_id',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ShortMsgTempCreateData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }

        return $model;
    }
}
