<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTraasmetaApptagRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_tags
    /**
     * @var TraasAppTagDto[]
     */
    public $appTags;
    protected $_name = [
        'authToken' => 'auth_token',
        'appTags'   => 'app_tags',
    ];

    public function validate()
    {
        Model::validateRequired('appTags', $this->appTags, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appTags) {
            $res['app_tags'] = [];
            if (null !== $this->appTags && \is_array($this->appTags)) {
                $n = 0;
                foreach ($this->appTags as $item) {
                    $res['app_tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateTraasmetaApptagRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_tags'])) {
            if (!empty($map['app_tags'])) {
                $model->appTags = [];
                $n              = 0;
                foreach ($map['app_tags'] as $item) {
                    $model->appTags[$n++] = null !== $item ? TraasAppTagDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
