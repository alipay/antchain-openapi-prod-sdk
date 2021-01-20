<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RMS\Models\PageQuery;

class AppStats extends Model {
    protected $_name = [
        'appList' => 'app_list',
        'pageQuery' => 'page_query',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->appList) {
            $res['app_list'] = $this->appList;
        }
        if (null !== $this->pageQuery) {
            $res['page_query'] = null !== $this->pageQuery ? $this->pageQuery->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppStats
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_list'])){
            if(!empty($map['app_list'])){
                $model->appList = $map['app_list'];
            }
        }
        if(isset($map['page_query'])){
            $model->pageQuery = PageQuery::fromMap($map['page_query']);
        }
        return $model;
    }
    // app_list
    /**
     * @example app_list
     * @var string[]
     */
    public $appList;

    // page_query
    /**
     * @example page_query
     * @var PageQuery
     */
    public $pageQuery;

}
