<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryBuildpackNativetechstackversionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 技术栈名称。
    // 原则上允许用户定义同名自定义技术栈（e.g,用户创建和全局同名的技术栈SOFA），此时优先获取用户自定义技术栈下技术栈版本；
    /**
     * @var string
     */
    public $techStack;

    // 当前页码， 默认值为1
    /**
     * @var int
     */
    public $currentPage;

    // 一页获取个数，默认值10
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'   => 'auth_token',
        'techStack'   => 'tech_stack',
        'currentPage' => 'current_page',
        'pageSize'    => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('techStack', $this->techStack, true);
        Model::validateMaximum('pageSize', $this->pageSize, 100);
        Model::validateMinimum('pageSize', $this->pageSize, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->techStack) {
            $res['tech_stack'] = $this->techStack;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBuildpackNativetechstackversionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tech_stack'])) {
            $model->techStack = $map['tech_stack'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
