<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CheckQuotaRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 检查的值
    /**
     * @var SingleDimGroup[]
     */
    public $dimGroups;
    protected $_name = [
        'authToken' => 'auth_token',
        'dimGroups' => 'dim_groups',
    ];

    public function validate()
    {
        Model::validateRequired('dimGroups', $this->dimGroups, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->dimGroups) {
            $res['dim_groups'] = [];
            if (null !== $this->dimGroups && \is_array($this->dimGroups)) {
                $n = 0;
                foreach ($this->dimGroups as $item) {
                    $res['dim_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckQuotaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['dim_groups'])) {
            if (!empty($map['dim_groups'])) {
                $model->dimGroups = [];
                $n                = 0;
                foreach ($map['dim_groups'] as $item) {
                    $model->dimGroups[$n++] = null !== $item ? SingleDimGroup::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
