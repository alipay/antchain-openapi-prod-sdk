<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class ShortUrlCreateResult extends Model
{
    // 卡片模板id
    /**
     * @example 202409050005000000019020
     *
     * @var string
     */
    public $smartTemplateId;

    // 短链详细信息列表
    /**
     * @example
     *
     * @var ShortUrlResult[]
     */
    public $paramList;
    protected $_name = [
        'smartTemplateId' => 'smart_template_id',
        'paramList'       => 'param_list',
    ];

    public function validate()
    {
        Model::validateRequired('smartTemplateId', $this->smartTemplateId, true);
        Model::validateRequired('paramList', $this->paramList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->smartTemplateId) {
            $res['smart_template_id'] = $this->smartTemplateId;
        }
        if (null !== $this->paramList) {
            $res['param_list'] = [];
            if (null !== $this->paramList && \is_array($this->paramList)) {
                $n = 0;
                foreach ($this->paramList as $item) {
                    $res['param_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ShortUrlCreateResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['smart_template_id'])) {
            $model->smartTemplateId = $map['smart_template_id'];
        }
        if (isset($map['param_list'])) {
            if (!empty($map['param_list'])) {
                $model->paramList = [];
                $n                = 0;
                foreach ($map['param_list'] as $item) {
                    $model->paramList[$n++] = null !== $item ? ShortUrlResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
