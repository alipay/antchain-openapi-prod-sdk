<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class FindcreateQuotaInstanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // single_dim_groups
    /**
     * @var SingleDimGroup[]
     */
    public $singleDimGroups;
    protected $_name = [
        'authToken'       => 'auth_token',
        'singleDimGroups' => 'single_dim_groups',
    ];

    public function validate()
    {
        Model::validateRequired('singleDimGroups', $this->singleDimGroups, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->singleDimGroups) {
            $res['single_dim_groups'] = [];
            if (null !== $this->singleDimGroups && \is_array($this->singleDimGroups)) {
                $n = 0;
                foreach ($this->singleDimGroups as $item) {
                    $res['single_dim_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FindcreateQuotaInstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['single_dim_groups'])) {
            if (!empty($map['single_dim_groups'])) {
                $model->singleDimGroups = [];
                $n                      = 0;
                foreach ($map['single_dim_groups'] as $item) {
                    $model->singleDimGroups[$n++] = null !== $item ? SingleDimGroup::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
