<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTraasmetaRegionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // regions
    /**
     * @var TraasRegionDto[]
     */
    public $regions;
    protected $_name = [
        'authToken' => 'auth_token',
        'regions'   => 'regions',
    ];

    public function validate()
    {
        Model::validateRequired('regions', $this->regions, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->regions) {
            $res['regions'] = [];
            if (null !== $this->regions && \is_array($this->regions)) {
                $n = 0;
                foreach ($this->regions as $item) {
                    $res['regions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateTraasmetaRegionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['regions'])) {
            if (!empty($map['regions'])) {
                $model->regions = [];
                $n              = 0;
                foreach ($map['regions'] as $item) {
                    $model->regions[$n++] = null !== $item ? TraasRegionDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
