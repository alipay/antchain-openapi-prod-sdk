<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTraasmetaAppgroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_groups
    /**
     * @var TraasAppGroupDto[]
     */
    public $appGroups;
    protected $_name = [
        'authToken' => 'auth_token',
        'appGroups' => 'app_groups',
    ];

    public function validate()
    {
        Model::validateRequired('appGroups', $this->appGroups, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appGroups) {
            $res['app_groups'] = [];
            if (null !== $this->appGroups && \is_array($this->appGroups)) {
                $n = 0;
                foreach ($this->appGroups as $item) {
                    $res['app_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateTraasmetaAppgroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_groups'])) {
            if (!empty($map['app_groups'])) {
                $model->appGroups = [];
                $n                = 0;
                foreach ($map['app_groups'] as $item) {
                    $model->appGroups[$n++] = null !== $item ? TraasAppGroupDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
